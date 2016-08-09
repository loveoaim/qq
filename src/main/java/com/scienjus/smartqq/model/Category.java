package com.scienjus.smartqq.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 分组
 * @author ScienJus
 * @date 15/12/19.
 */
@Data
public class Category {

    private int index;

    private int sort;

    private String name;

    private List<Friend> friends = new ArrayList<>();

    public void addFriend(Friend friend) {
        this.friends.add(friend);
    }

    @Override
    public String toString() {
        return "Category{" +
                "index=" + index +
                ", sort=" + sort +
                ", name='" + name + '\'' +
                ", friends=" + friends +
                '}';
    }

    /**
     * index.
     *
     * @return  the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * index.
     *
     * @param   index    the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * sort.
     *
     * @return  the sort
     */
    public int getSort() {
        return sort;
    }

    /**
     * sort.
     *
     * @param   sort    the sort to set
     */
    public void setSort(int sort) {
        this.sort = sort;
    }

    /**
     * name.
     *
     * @return  the name
     */
    public String getName() {
        return name;
    }

    /**
     * name.
     *
     * @param   name    the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * friends.
     *
     * @return  the friends
     */
    public List<Friend> getFriends() {
        return friends;
    }

    /**
     * friends.
     *
     * @param   friends    the friends to set
     */
    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public static Category defaultCategory() {
        Category category = new Category();
        category.setIndex(0);
        category.setSort(0);
        category.setName("我的好友");
        return category;
    }
}
