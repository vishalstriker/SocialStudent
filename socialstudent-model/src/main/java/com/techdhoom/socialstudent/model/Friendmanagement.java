/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tapan
 */
@Entity
@Table(name = "friendmanagement")
public class Friendmanagement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friendmanagement_id")
    private Long friendmanagementId;
    @Column(name = "friendship_status")
    private String friendshipStatus;
    @JoinColumn(name = "user_friends_id", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain userFriendsId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain userId;

    public Friendmanagement() {
    }

    public Friendmanagement(Long friendmanagementId) {
        this.friendmanagementId = friendmanagementId;
    }

    public Long getFriendmanagementId() {
        return friendmanagementId;
    }

    public void setFriendmanagementId(Long friendmanagementId) {
        this.friendmanagementId = friendmanagementId;
    }

    public String getFriendshipStatus() {
        return friendshipStatus;
    }

    public void setFriendshipStatus(String friendshipStatus) {
        this.friendshipStatus = friendshipStatus;
    }

    public Usermain getUserFriendsId() {
        return userFriendsId;
    }

    public void setUserFriendsId(Usermain userFriendsId) {
        this.userFriendsId = userFriendsId;
    }

    public Usermain getUserId() {
        return userId;
    }

    public void setUserId(Usermain userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (friendmanagementId != null ? friendmanagementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Friendmanagement)) {
            return false;
        }
        Friendmanagement other = (Friendmanagement) object;
        if ((this.friendmanagementId == null && other.friendmanagementId != null) || (this.friendmanagementId != null && !this.friendmanagementId.equals(other.friendmanagementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Friendmanagement[ friendmanagementId=" + friendmanagementId + " ]";
    }
    
}
