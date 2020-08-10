package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "devicetype")
public class Type implements Serializable {
    @Id
    private Integer devicetypeid;

    private String typename;

    private static final long serialVersionUID = 1L;

    /**
     * @return devicetypeid
     */
    public Integer getDevicetypeid() {
        return devicetypeid;
    }

    /**
     * @param devicetypeid
     */
    public void setDevicetypeid(Integer devicetypeid) {
        this.devicetypeid = devicetypeid;
    }

    /**
     * @return typename
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param typename
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", devicetypeid=").append(devicetypeid);
        sb.append(", typename=").append(typename);
        sb.append("]");
        return sb.toString();
    }
}