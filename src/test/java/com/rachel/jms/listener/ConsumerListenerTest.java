package com.rachel.jms.listener;

import static org.junit.Assert.*;

import javax.jms.TextMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConsumerListenerTest {
	
	private TextMessage message;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOnMessage() {
		ConsumerListener consumerListener = new ConsumerListener();
		consumerListener.onMessage(message);
		assertNull(message);
	}

}
