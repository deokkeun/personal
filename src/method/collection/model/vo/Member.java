package method.collection.model.vo;

import java.security.PublicKey;

public class Member {

	private String userId;
	private String userPw;
	private String userPw2;
	private String userName;
	private char gender;
	private int phoneNum;
	private String email;
	
	
	public Member() {
		this.userId = "아이디";
		this.userPw = "비밀번호";
		this.userPw2 = "비밀번호 재확인";
		this.gender = '성';
		this.phoneNum = 010;
		this.email = "이메일";
	}

	public Member(String userId, String userPw, String userPw2, String userName, char gender, int phoneNum,
			String email) {
		this.userId = userId;
		this.userPw = userPw;
		this.userPw2 = userPw2;
		this.userName = userName;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserPw2() {
		return userPw2;
	}

	public void setUserPw2(String userPw2) {
		this.userPw2 = userPw2;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPw=" + userPw + ", userPw2=" + userPw2 + ", userName=" + userName
				+ ", gender=" + gender + ", phoneNum=" + phoneNum + ", email=" + email + "]";
	}

	
}
