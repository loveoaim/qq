package com.scienjus.smartqq.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 群资料
 * @author ScienJus
 * @date 2015/12/24.
 */
@Data
public class GroupInfo {

    private long gid;

    private long createtime;

    private String memo;

    private String name;

    private long owner;

    private String markname;

    private List<GroupUser> users = new ArrayList<>();

    public void addUser(GroupUser user) {
        this.users.add(user);
    }

    /**
     * gid.
     *
     * @return  the gid
     */
    public long getGid() {
        return gid;
    }

    /**
     * gid.
     *
     * @param   gid    the gid to set
     */
    public void setGid(long gid) {
        this.gid = gid;
    }

    /**
     * createtime.
     *
     * @return  the createtime
     */
    public long getCreatetime() {
        return createtime;
    }

    /**
     * createtime.
     *
     * @param   createtime    the createtime to set
     */
    public void setCreatetime(long createtime) {
        this.createtime = createtime;
    }

    /**
     * memo.
     *
     * @return  the memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * memo.
     *
     * @param   memo    the memo to set
     */
    public void setMemo(String memo) {
        this.memo = memo;
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
     * owner.
     *
     * @return  the owner
     */
    public long getOwner() {
        return owner;
    }

    /**
     * owner.
     *
     * @param   owner    the owner to set
     */
    public void setOwner(long owner) {
        this.owner = owner;
    }

    /**
     * markname.
     *
     * @return  the markname
     */
    public String getMarkname() {
        return markname;
    }

    /**
     * markname.
     *
     * @param   markname    the markname to set
     */
    public void setMarkname(String markname) {
        this.markname = markname;
    }

    /**
     * users.
     *
     * @return  the users
     */
    public List<GroupUser> getUsers() {
        return users;
    }

    /**
     * users.
     *
     * @param   users    the users to set
     */
    public void setUsers(List<GroupUser> users) {
        this.users = users;
    }

}
