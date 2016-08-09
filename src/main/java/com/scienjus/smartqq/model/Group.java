package com.scienjus.smartqq.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 群
 * @author ScienJus
 * @date 2015/12/18.
 */
@Data
public class Group {

    @JSONField(name = "gid")
    private long id;

    private String name;

    private long flag;

    private long code;

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
     * flag.
     *
     * @return  the flag
     */
    public long getFlag() {
        return flag;
    }

    /**
     * flag.
     *
     * @param   flag    the flag to set
     */
    public void setFlag(long flag) {
        this.flag = flag;
    }

    /**
     * code.
     *
     * @return  the code
     */
    public long getCode() {
        return code;
    }

    /**
     * code.
     *
     * @param   code    the code to set
     */
    public void setCode(long code) {
        this.code = code;
    }

}
