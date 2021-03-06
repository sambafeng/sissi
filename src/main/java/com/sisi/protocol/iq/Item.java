package com.sisi.protocol.iq;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author kim 2013-10-31
 */
@XmlRootElement
public class Item {

	public static enum Subscription {

		BOTH, FROM, TO;

		public String toString() {
			return super.toString().toLowerCase();
		}
	}

	private String jid;

	private String name;

	private String subscription;

	private String group;

	public Item() {
		super();
	}

	public Item(String jid, String name, String subscription, String group) {
		super();
		this.jid = jid;
		this.name = name;
		this.subscription = subscription;
		this.group = group;
	}

	@XmlAttribute
	public String getJid() {
		return jid;
	}

	public void setJid(String jid) {
		this.jid = jid;
	}

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute
	public String getSubscription() {
		return subscription;
	}

	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}

	@XmlElement
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
}
