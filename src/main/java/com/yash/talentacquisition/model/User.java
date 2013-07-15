package com.yash.talentacquisition.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.springframework.util.DigestUtils;

/**
 * A User can perform an action within the system.
 * 
 * @author Durgesh Vaishnav
 */
@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;
    
    private String email;
    
    private String name;

    @Basic
    @Column(name="password_digest", nullable=false)
    private String passwordDigest;
    
    @Basic
    @Column(name="creation_date", updatable=false, nullable=false)    
    private Date creationDate = new Date();
    
    @Basic
    @Column(name="last_updated_date", nullable=false)    
    private Date lastUpdatedDate = new Date();
    
    @Version
    @Column(name="version")
    private Long recordVersionNumber;

    public Long getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPasswordDigest() {
        return passwordDigest;
    }
    public void setPasswordPlaintext(final String password) {
        passwordDigest = computePasswordDigest(password);
    }
    public String getPasswordPlaintext() {
        // included for compatibility with Spring MVC forms - not needed otherwise
        return "";
    }
    public boolean passwordMatches(final String plaintextPassword) {
        return getPasswordDigest().equals( computePasswordDigest(plaintextPassword) );
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public Long getRecordVersionNumber() {
        return recordVersionNumber;
    }
    
    public static String computePasswordDigest(final String password) {
        return DigestUtils.md5DigestAsHex( password.getBytes() );
    }
}
