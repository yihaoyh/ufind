package com.findu.demo.overlay;

import com.baidu.mapapi.search.MKAddrInfo;
import com.baidu.mapapi.search.MKBusLineResult;
import com.baidu.mapapi.search.MKDrivingRouteResult;
import com.baidu.mapapi.search.MKPoiResult;
import com.baidu.mapapi.search.MKSuggestionResult;
import com.baidu.mapapi.search.MKTransitRouteResult;
import com.baidu.mapapi.search.MKWalkingRouteResult;

public interface RouteSearchListener {

	public void onGetAddrResult(MKAddrInfo arg0, int arg1);
	
	public void onGetBusDetailResult(MKBusLineResult arg0, int arg1);

	public void onGetDrivingRouteResult(MKDrivingRouteResult arg0,
			int arg1);

	public void onGetPoiDetailSearchResult(int arg0, int arg1);

	public void onGetPoiResult(MKPoiResult arg0, int arg1, int arg2);

	public void onGetSuggestionResult(MKSuggestionResult arg0, int arg1);

	public void onGetTransitRouteResult(MKTransitRouteResult arg0,
			int arg1);

	public void onGetWalkingRouteResult(MKWalkingRouteResult arg0,
			int arg1) ;

}
