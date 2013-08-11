package com.findu.demo.manager;

import android.graphics.Bitmap;

import com.baidu.mapapi.map.MapPoi;

public interface MapListenerCallback {

	public void onMapMoveFinish();
	public void onClickMapPoi(MapPoi mapPoiInfo);
	public void onGetCurrentMap(Bitmap b);
	public void onMapAnimationFinish();
}
