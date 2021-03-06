package com.sisi.context;

/**
 * @author kim 2013-10-30
 */
public interface JID {

	public String getUser();

	public String getHost();

	public String getResource();

	public void setUser(String user);

	public void setHost(String host);

	public void setResource(String resource);

	public Boolean naked();

	public Boolean loop();

	public String asString();
	
	public String asStringWithLoop();
}
