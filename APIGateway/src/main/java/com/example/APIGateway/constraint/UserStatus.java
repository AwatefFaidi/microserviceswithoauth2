package com.example.APIGateway.constraint;

public enum UserStatus {
	  SUCCESS("Success"),
	    ERROR("Error"),
	    PENDING("Pending"),
	    ACTIVE("Active"),
	    INACTIVE("Inactive"),
	    DELETED("Deleted"),
	    APPROVED("Approved"),
	    PATIENT("ROLE_PATIENT");

	    private String status;

	    UserStatus(String status) {
	        this.status = status;
	    }

	    public String getStatus() {
	        return status;
	    }
}
