package com.example.APIGateway.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.io.Serializable;

public class UserSignupDTO implements Serializable {

    private Long personId;
    @NotEmpty(message = "First name can't be null or empty")
    private String firstName;
    private String middleName;
    @NotEmpty(message = "Last name can't be null or empty")
    private String lastName;
    @NotEmpty(message = "User name can't be null or empty")
    private String userName;
    @NotEmpty(message = "Must be provide password")
    @Size(min = 8, max = 32, message = "Password must be between 2 and 32 characters long")
    private String password;
    @NotNull(message = "Must be provide date of birth")
    private Date dateOfBirth;
    @NotEmpty(message = "Must be provide gender")
    private String gender;
    @NotEmpty(message = "Must be provide email")
    private String email;
    @NotEmpty(message = "Must be provide cellphone")
    private String cellPhone;
    private String homePhone;
    private String workPhone;
    @NotEmpty(message = "Must be provide occupation")
    private String occupation;
    @NotEmpty(message = "Must be provide employer")
    private String employer;
    private List<AddressDTO> addressDTOList;
    
    
    
	public UserSignupDTO(Long personId, @NotEmpty(message = "First name can't be null or empty") String firstName,
			String middleName, @NotEmpty(message = "Last name can't be null or empty") String lastName,
			@NotEmpty(message = "User name can't be null or empty") String userName,
			@NotEmpty(message = "Must be provide password") @Size(min = 8, max = 32, message = "Password must be between 2 and 32 characters long") String password,
			@NotNull(message = "Must be provide date of birth") Date dateOfBirth,
			@NotEmpty(message = "Must be provide gender") String gender,
			@NotEmpty(message = "Must be provide email") String email,
			@NotEmpty(message = "Must be provide cellphone") String cellPhone, String homePhone, String workPhone,
			@NotEmpty(message = "Must be provide occupation") String occupation,
			@NotEmpty(message = "Must be provide employer") String employer, List<AddressDTO> addressDTOList) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.cellPhone = cellPhone;
		this.homePhone = homePhone;
		this.workPhone = workPhone;
		this.occupation = occupation;
		this.employer = employer;
		this.addressDTOList = addressDTOList;
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public List<AddressDTO> getAddressDTOList() {
		return addressDTOList;
	}
	public void setAddressDTOList(List<AddressDTO> addressDTOList) {
		this.addressDTOList = addressDTOList;
	}
	@Override
	public String toString() {
		return "UserSignupDTO [personId=" + personId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", userName=" + userName + ", password=" + password + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", email=" + email + ", cellPhone=" + cellPhone + ", homePhone="
				+ homePhone + ", workPhone=" + workPhone + ", occupation=" + occupation + ", employer=" + employer
				+ ", addressDTOList=" + addressDTOList + "]";
	}
    
    
    

}
