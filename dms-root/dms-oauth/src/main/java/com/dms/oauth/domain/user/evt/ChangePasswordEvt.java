package com.dms.oauth.domain.user.evt;

public class ChangePasswordEvt {
	
	private String userId;
	
	private String newPassword;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	

}
