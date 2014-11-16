/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ncontractor
 */
@Entity
@Table(name = "system_configuration")
public class SystemConfiguration implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "system_key", nullable = false, length = 100)
    private String systemKey;
    @Basic(optional = false)
    @Column(name = "key_value", nullable = false, length = 200)
    private String keyValue;
    @Column(name = "is_active")
    private Boolean isActive;

    public SystemConfiguration() {
    }

    public SystemConfiguration(String systemKey) {
        this.systemKey = systemKey;
    }

    public SystemConfiguration(String systemKey, String keyValue) {
        this.systemKey = systemKey;
        this.keyValue = keyValue;
    }

    public String getSystemKey() {
        return systemKey;
    }

    public void setSystemKey(String systemKey) {
        this.systemKey = systemKey;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (systemKey != null ? systemKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SystemConfiguration)) {
            return false;
        }
        SystemConfiguration other = (SystemConfiguration) object;
        if ((this.systemKey == null && other.systemKey != null) || (this.systemKey != null && !this.systemKey.equals(other.systemKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.argusoft.telemed.common.SystemConfiguration[ systemKey=" + systemKey + " ]";
    }
    
}
