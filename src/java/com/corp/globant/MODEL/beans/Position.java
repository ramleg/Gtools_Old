package com.corp.globant.MODEL.beans;
/**
 *
 * @author ramiro.acoglanis
 */
public class Position {
    private String id;
    private String desc;
    private String ou;

    public Position() {}

    public Position(String id) {
        this.id = id;
    }

    public Position(String id, String desc) {
        this.id = id;
        this.desc = desc;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getOu() {
        return ou;
    }

    public void setOu(String ou) {
        this.ou = ou;
    }
    
    
}
