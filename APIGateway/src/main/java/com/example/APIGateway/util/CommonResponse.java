package com.example.APIGateway.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonResponse implements Serializable {

    private String message;
    private boolean isValidRequest;
    private Object responseData;
    private Integer status;
    
    
    
	public CommonResponse() {
		super();
	}
	
	public CommonResponse(String message, boolean isValidRequest, Object responseData, Integer status) {
		super();
		this.message = message;
		this.isValidRequest = isValidRequest;
		this.responseData = responseData;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isValidRequest() {
		return isValidRequest;
	}
	public void setValidRequest(boolean isValidRequest) {
		this.isValidRequest = isValidRequest;
	}
	public Object getResponseData() {
		return responseData;
	}
	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
    
    
    

}
