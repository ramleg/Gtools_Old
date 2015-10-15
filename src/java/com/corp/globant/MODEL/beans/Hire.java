package com.corp.globant.MODEL.beans;
/**
 * @author ramiro.acoglanis
 */
public class Hire {
    
    private String id;
    private String name;
    private String lastname;
    private String idNumber;
    private String domainUser;
    private EmailGroup emailGroup;
    private Position position;
    private Location location;
    private String phoneNumber;
    private Country country;
    private SubOrg suborg;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDomainUser() {
        return domainUser;
    }

    public void setDomainUser(String domainUser) {
        this.domainUser = domainUser;
    }

    public EmailGroup getEmailGroup() {
        return emailGroup;
    }

    public void setEmailGroup(EmailGroup emailGroup) {
        this.emailGroup = emailGroup;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public SubOrg getSuborg() {
        return suborg;
    }

    public void setSuborg(SubOrg suborg) {
        this.suborg = suborg;
    }
    
    
}
