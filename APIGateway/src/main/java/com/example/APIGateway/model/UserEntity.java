package com.example.APIGateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tbl_sec_user")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", unique = true)
    private Long userId;
    @Column(name = "user_name", unique = true, nullable = false)
    private String userName;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "password", nullable = false, length = 1000)
    private String password;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @OneToOne
    private UserRoleEntity userRoleEntity;
    @OneToOne(cascade = CascadeType.ALL)
    private PersonProfileEntity personProfileEntity;
	public UserEntity() {
		super();
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public UserRoleEntity getUserRoleEntity() {
		return userRoleEntity;
	}
	public void setUserRoleEntity(UserRoleEntity userRoleEntity) {
		this.userRoleEntity = userRoleEntity;
	}
	public PersonProfileEntity getPersonProfileEntity() {
		return personProfileEntity;
	}
	public void setPersonProfileEntity(PersonProfileEntity personProfileEntity) {
		this.personProfileEntity = personProfileEntity;
	}
    
    
    
    
}
