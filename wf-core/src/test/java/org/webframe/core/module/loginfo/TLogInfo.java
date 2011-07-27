
package org.webframe.core.module.loginfo;

// default package
// Generated 2008-3-12 16:51:50 by Hibernate Tools 3.2.0.b9
/**
 * TLogInfo generated by hbm2java
 */
public class TLogInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 848390928655882358L;

	private String					id;

	private String					userid;

	private String					username;

	private String					departname;

	private String					logintime;

	private String					loginip;

	public TLogInfo() {
	}

	public TLogInfo(String id) {
		this.id = id;
	}

	public TLogInfo(String id, String userid, String username, String departname, String logintime, String loginip) {
		this.id = id;
		this.userid = userid;
		this.username = username;
		this.departname = departname;
		this.logintime = logintime;
		this.loginip = loginip;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDepartname() {
		return this.departname;
	}

	public void setDepartname(String departname) {
		this.departname = departname;
	}

	public String getLogintime() {
		return this.logintime;
	}

	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}

	public String getLoginip() {
		return this.loginip;
	}

	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}
}
