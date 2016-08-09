package com.scienjus.smartqq.model;

import lombok.Data;

/**
 * 群成员
 * @author ScienJus
 * @date 2015/12/24.
 */
@Data
public class GroupUser {

    private String nick;

    private String province;

    private String gender;

    private long uin;

    private String country;

    private String city;

    private String card;

    private int clientType;

    private int status;

    private boolean vip;

    private int vipLevel;

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
     * uin.
     *
     * @return  the uin
     */
    public long getUin() {
        return uin;
    }

    /**
     * uin.
     *
     * @param   uin    the uin to set
     */
    public void setUin(long uin) {
        this.uin = uin;
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
     * card.
     *
     * @return  the card
     */
    public String getCard() {
        return card;
    }

    /**
     * card.
     *
     * @param   card    the card to set
     */
    public void setCard(String card) {
        this.card = card;
    }

    /**
     * clientType.
     *
     * @return  the clientType
     */
    public int getClientType() {
        return clientType;
    }

    /**
     * clientType.
     *
     * @param   clientType    the clientType to set
     */
    public void setClientType(int clientType) {
        this.clientType = clientType;
    }

    /**
     * status.
     *
     * @return  the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * status.
     *
     * @param   status    the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * vip.
     *
     * @return  the vip
     */
    public boolean isVip() {
        return vip;
    }

    /**
     * vip.
     *
     * @param   vip    the vip to set
     */
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    /**
     * vipLevel.
     *
     * @return  the vipLevel
     */
    public int getVipLevel() {
        return vipLevel;
    }

    /**
     * vipLevel.
     *
     * @param   vipLevel    the vipLevel to set
     */
    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return "GroupUser [nick=" + nick + ", province=" + province + ", gender=" + gender + ", uin=" + uin
                + ", country=" + country + ", city=" + city + ", card=" + card + ", clientType=" + clientType
                + ", status=" + status + ", vip=" + vip + ", vipLevel=" + vipLevel + "]";
    }

}
