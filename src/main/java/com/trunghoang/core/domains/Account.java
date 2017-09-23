package com.trunghoang.core.domains;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * 
 * This class contains all info of account
 *
 */
@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@NotNull
	private Integer id;

	@Column(name = "username")
	@NotNull
	private String username;

	@Column(name = "password")
	@NotNull
	private String password;

	@Column(name = "email")
	@NotNull
	private String email;

	@Column(name = "lastlogin")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date lastLogin;

	@Column(name = "roleid")
	@NotNull
	private Integer roleId;
	
	@Column(name = "userid")
	@NotNull
	private Integer userId;

	@Column(name = "licensedateid")
	private Integer licenseDateId;

	public Account() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getLicenseDateId() {
		return licenseDateId;
	}

	public void setLicenseDateId(Integer licenseDateId) {
		this.licenseDateId = licenseDateId;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password="
				+ password + ", email=" + email + ", lastLogin=" + lastLogin
				+ ", roleId=" + roleId + ", userId=" + userId
				+ ", licenseDateId=" + licenseDateId + "]";
	}
	

}
