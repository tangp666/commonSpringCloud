package entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 用户信息实体对象
 *
 * @author tangpan
 * @date 2020-10-22 13:26
 */
@Table(name = "sys_user")
public class SysUserEntity extends BaseEntity implements Serializable {

    /** 序列 */
    private static final long serialVersionUID = 1L;

    /** 用户名 */
    @Column(name = "name")
    private String name;
    /** 账号 */
    @Column(name = "account")
    private String account;
    /** 密码 */
    @Column(name = "password")
    private String password;
    /** 电话号码 */
    @Column(name = "phone")
    private String phone;
    /** 电子邮件 */
    @Column(name = "mail")
    private String mail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
