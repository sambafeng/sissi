package com.sisi.protocol.auth;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.sisi.protocol.Feature;
import com.sisi.protocol.core.Stream;

/**
 * @author Kim.shen 2013-10-16
 */
@XmlRootElement(namespace = Stream.NAMESPACE)
public class Auth extends Feature {

	private final static String XMLNS = "http://jabber.org/features/iq-auth";

	private String mechanism;

	private String text;

	@XmlAttribute
	public String getXmlns() {
		return XMLNS;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getMechanism() {
		return mechanism;
	}

	public void setMechanism(String mechanism) {
		this.mechanism = mechanism;
	}
}
