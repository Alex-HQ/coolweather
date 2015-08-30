package com.example.heqi.util;

public interface HttpCallbackListener {

	void onFinish(String response);
	
	void onError(Exception e);
}
