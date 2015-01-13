package com.rachel.jms.listener;

import javax.jms.Message;
import javax.jms.MessageListener;

public class ConsumerListener implements MessageListener {

	@Override
	public void onMessage(Message arg0) {
		System.out.println("In onMessage ... ");	
	}

}
