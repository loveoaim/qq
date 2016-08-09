package com.scienjus.smartqq.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 讨论组资料
 * @author ScienJus
 * @date 2015/12/24.
 */
@Data
public class DiscussInfo {

    @JSONField(name = "did")
    private long id;

    @JSONField(name = "discu_name")
    private String name;

    private List<DiscussUser> users = new ArrayList<>();

    public void addUser(DiscussUser user) {
        this.users.add(user);
    }

    /**
     * id.
     *
     * @return  the id
     */
    public long getId() {
        return id;
    }

    /**
     * id.
     *
     * @param   id    the id to set
     */
    public void setId(long id) {
        this.id = id;
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
     * users.
     *
     * @return  the users
     */
    public List<DiscussUser> getUsers() {
        return users;
    }

    /**
     * users.
     *
     * @param   users    the users to set
     */
    public void setUsers(List<DiscussUser> users) {
        this.users = users;
    }

}
