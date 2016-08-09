package com.scienjus.smartqq.model;

import lombok.Data;

/**
 * 生日
 * @author ScienJus
 * @date 2015/12/24.
 */
@Data
public class Birthday {

    private int year;

    private int month;

    private int day;

    /**
     * year.
     *
     * @return  the year
     */
    public int getYear() {
        return year;
    }

    /**
     * year.
     *
     * @param   year    the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * month.
     *
     * @return  the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * month.
     *
     * @param   month    the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * day.
     *
     * @return  the day
     */
    public int getDay() {
        return day;
    }

    /**
     * day.
     *
     * @param   day    the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

}
