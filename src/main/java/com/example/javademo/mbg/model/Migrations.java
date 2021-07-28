package com.example.javademo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Migrations implements Serializable {
    private Integer id;

    private String migration;

    private Integer batch;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMigration() {
        return migration;
    }

    public void setMigration(String migration) {
        this.migration = migration;
    }

    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", migration=").append(migration);
        sb.append(", batch=").append(batch);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}