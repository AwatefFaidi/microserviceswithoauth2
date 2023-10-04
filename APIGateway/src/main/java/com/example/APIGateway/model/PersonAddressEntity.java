package com.example.APIGateway.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tbl_sec_person_address")
public class PersonAddressEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id",unique = true)
    private Long addressId;
    @ManyToOne
    private PersonProfileEntity personProfileEntity;
    @Column(name = "address_type")
    private String addressType;
    @Column(name = "addressline_one",nullable = false)
    private String addressLineOne;
    @Column(name = "addressline_two")
    private String addressLineTwo;
    @Column(name = "city",nullable = false)
    private String city;
    @Column(name = "province",nullable = false)
    private String province;
    @Column(name = "postal_code",nullable = false)
    private String postalCode;
    
    
    
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public PersonProfileEntity getPersonProfileEntity() {
		return personProfileEntity;
	}
	public void setPersonProfileEntity(PersonProfileEntity personProfileEntity) {
		this.personProfileEntity = personProfileEntity;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddressLineOne() {
		return addressLineOne;
	}
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}
	public String getAddressLineTwo() {
		return addressLineTwo;
	}
	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	@Override
	public String toString() {
		return "PersonAddressEntity [addressId=" + addressId + ", personProfileEntity=" + personProfileEntity
				+ ", addressType=" + addressType + ", addressLineOne=" + addressLineOne + ", addressLineTwo="
				+ addressLineTwo + ", city=" + city + ", province=" + province + ", postalCode=" + postalCode + "]";
	}


}
