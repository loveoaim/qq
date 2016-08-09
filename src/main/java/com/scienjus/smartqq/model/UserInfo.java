package com.scienjus.smartqq.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 用户
 * @author ScienJus
 * @date 2015/12/24.
 */
@Data
public class UserInfo {

    private Birthday birthday;

    private String phone;

    private String occupation;

    private String college;

    private String uin;

    private int blood;

    private String lnick;   //签名

    private String homepage;

    @JSONField(name = "vip_info")
    private int vipInfo;

    private String city;

    private String country;

    private String province;

    private String personal;

    private int shengxiao;

    private String nick;

    private String email;

    private String account;

    private String gender;

    private String mobile;

    /**
     * birthday.
     *
     * @return  the birthday
     */
    public Birthday getBirthday() {
        return birthday;
    }

    /**
     * birthday.
     *
     * @param   birthday    the birthday to set
     */
    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    /**
     * phone.
     *
     * @return  the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * phone.
     *
     * @param   phone    the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * occupation.
     *
     * @return  the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * occupation.
     *
     * @param   occupation    the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * college.
     *
     * @return  the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * college.
     *
     * @param   college    the college to set
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * uin.
     *
     * @return  the uin
     */
    public String getUin() {
        return uin;
    }

    /**
     * uin.
     *
     * @param   uin    the uin to set
     */
    public void setUin(String uin) {
        this.uin = uin;
    }

    /**
     * blood.
     *
     * @return  the blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * blood.
     *
     * @param   blood    the blood to set
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * lnick.
     *
     * @return  the lnick
     */
    public String getLnick() {
        return lnick;
    }

    /**
     * lnick.
     *
     * @param   lnick    the lnick to set
     */
    public void setLnick(String lnick) {
        this.lnick = lnick;
    }

    /**
     * homepage.
     *
     * @return  the homepage
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * homepage.
     *
     * @param   homepage    the homepage to set
     */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
     * vipInfo.
     *
     * @return  the vipInfo
     */
    public int getVipInfo() {
        return vipInfo;
    }

    /**
     * vipInfo.
     *
     * @param   vipInfo    the vipInfo to set
     */
    public void setVipInfo(int vipInfo) {
        this.vipInfo = vipInfo;
    }

    /**
     * city.
     *
     * @return  the city
     */
    public String getCity() {
        return city;
    }

    /**
     * city.
     *
     * @param   city    the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * country.
     *
     * @return  the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * country.
     *
     * @param   country    the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * province.
     *
     * @return  the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * province.
     *
     * @param   province    the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * personal.
     *
     * @return  the personal
     */
    public String getPersonal() {
        return personal;
    }

    /**
     * personal.
     *
     * @param   personal    the personal to set
     */
    public void setPersonal(String personal) {
        this.personal = personal;
    }

    /**
     * shengxiao.
     *
     * @return  the shengxiao
     */
    public int getShengxiao() {
        return shengxiao;
    }

    /**
     * shengxiao.
     *
     * @param   shengxiao    the shengxiao to set
     */
    public void setShengxiao(int shengxiao) {
        this.shengxiao = shengxiao;
    }

    /**
     * nick.
     *
     * @return  the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * nick.
     *
     * @param   nick    the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * email.
     *
     * @return  the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * email.
     *
     * @param   email    the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * account.
     *
     * @return  the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * account.
     *
     * @param   account    the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * gender.
     *
     * @return  the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * gender.
     *
     * @param   gender    the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * mobile.
     *
     * @return  the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * mobile.
     *
     * @param   mobile    the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
