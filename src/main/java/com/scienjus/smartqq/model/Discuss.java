package com.scienjus.smartqq.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 讨论组
 * @author ScienJus
 * @date 2015/12/23.
 */
@Data
public class Discuss {

    @JSONField(name = "did")
    private long id;

    private String name;

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
    
}
