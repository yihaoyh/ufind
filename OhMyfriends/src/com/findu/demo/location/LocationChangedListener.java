package com.findu.demo.location;

import com.baidu.location.BDLocation;

public interface LocationChangedListener {

	public void onReceiveLocation(BDLocation location);
	public void onReceivePoi(BDLocation poiLocation);
}
