/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security1;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author sihai
 */
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    Integer id;
    
    String email;
    
    String md5Pwd;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMd5Pwd() {
        return md5Pwd;
    }

    public void setMd5Pwd(String md5Pwd) {
        this.md5Pwd = md5Pwd;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    
    
}
