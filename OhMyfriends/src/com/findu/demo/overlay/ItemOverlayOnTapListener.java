package com.findu.demo.overlay;

import com.baidu.mapapi.map.MapView;
import com.baidu.platform.comapi.basestruct.GeoPoint;

public interface ItemOverlayOnTapListener {

	public boolean onTap(int index);
	public boolean onTap(GeoPoint pt, MapView mMapView);
}
