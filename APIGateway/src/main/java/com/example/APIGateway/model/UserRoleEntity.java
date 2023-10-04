package com.example.APIGateway.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
@Table(name = "tbl_sec_user_role",uniqueConstraints = {@UniqueConstraint(columnNames={"role_name"})})
public class UserRoleEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="role_id",nullable = false)
    private Long roleId;
    @Column(name ="role_name",nullable = false)
    private String roleName;
    @Column(name ="status",nullable = false)
    private String status;
    @Column(name ="create_date")
    private LocalDateTime createDate;
	public UserRoleEntity() {
		super();
	}
	
	
	public UserRoleEntity(Long roleId, String roleName, String status, LocalDateTime createDate) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.status = status;
		this.createDate = createDate;
	}


	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
    
    
    
    
}
