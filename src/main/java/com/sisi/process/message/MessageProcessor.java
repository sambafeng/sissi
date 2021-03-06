package com.sisi.process.message;

import com.sisi.context.Context;
import com.sisi.process.Processor;
import com.sisi.protocol.Protocol;
import com.sisi.protocol.core.Message;

/**
 * @author kim 2013-10-24
 */
public class MessageProcessor implements Processor {

	@Override
	public Protocol process(Context context, Protocol protocol) {
		return null;
	}

	@Override
	public Boolean isSupport(Protocol protocol) {
		return Message.class.isAssignableFrom(protocol.getClass());
	}

}
