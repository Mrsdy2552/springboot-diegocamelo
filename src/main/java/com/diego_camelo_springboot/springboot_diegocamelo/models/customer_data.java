package com.diego_camelo_springboot.springboot_diegocamelo.models;

public class customer_data {

    private Long id;
    private String documentType;
    private String firstName;
    private String middleName;
    private String firstSurname;
    private String secondLastName;
    private long Phone;
    private String address;
    private String city;

    public customer_data(Long id, String documentType, long Phone, String address, String city, String firstName, String firstSurname, String middleName, String secondLastName) {
        this.id = id;
        this.documentType = documentType;
        this.Phone = Phone;
        this.address = address;
        this.city = city;
        this.firstName = firstName;
        this.firstSurname = firstSurname;
        this.middleName = middleName;
        this.secondLastName = secondLastName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
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

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public Long getPhone() {
        return Phone;
    }

    public void setPhone(long Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
