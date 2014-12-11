package com.example.scvngr;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends Activity {

	// GPSTracker class
	GPSTracker gps = null;
	GoogleMap googleMap = null;
	Marker positionMarker = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);

		gps = new GPSTracker(this);

		googleMap = ((MapFragment) getFragmentManager().findFragmentById(
				R.id.map)).getMap();
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		// We are coming back from GPS settings
		if (requestCode == 1) {
			gps.initialize();
		}
	}

	public void onLocationChanged(Location location) {
		if (googleMap != null && location != null) {
			if (positionMarker == null) {
				positionMarker = googleMap.addMarker(new MarkerOptions()
						.position(new LatLng(location.getLatitude(), location
								.getLongitude())));
				googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
						new LatLng(location.getLatitude(), location
								.getLongitude()), 16));
			} else {
				positionMarker.setPosition(new LatLng(location.getLatitude(),
						location.getLongitude()));

			}
		}
	}
}
