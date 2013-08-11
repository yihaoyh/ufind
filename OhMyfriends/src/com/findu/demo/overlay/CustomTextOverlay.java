package com.findu.demo.overlay;

import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.TextItem;
import com.baidu.mapapi.map.TextOverlay;

/*
 * 用于文字显示的overlay
 */
public class CustomTextOverlay {

	private TextOverlay mTextOverlay;
	private MapView mMapView;
	
	public CustomTextOverlay(MapView mapview){
		mMapView = mapview;
		mTextOverlay = new TextOverlay(mapview);
	}
	
	public void setCustomTextOverlayText(TextItem item){
		mTextOverlay.addText(item);
		
	}
	
	public void removeCustemTextOverlayText(TextItem item){
		mTextOverlay.removeText(item);
	}
	
	public void removeAllText(){
		mTextOverlay.removeAll();
	}
	
	public void addTextOverlay(){
		if (!mMapView.getOverlays().contains(mTextOverlay))
			mMapView.getOverlays().add(mTextOverlay);
	}
	
	public void removeTextOverlay(){
		if (mMapView.getOverlays().contains(mTextOverlay))
			mMapView.getOverlays().remove(mTextOverlay);
	}
}
