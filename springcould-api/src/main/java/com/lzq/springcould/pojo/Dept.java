package com.lzq.springcould.pojo;

import java.io.Serializable;

/*@Data
@NoArgsConstructor
@Accessors(chain=true)*/
public class Dept implements Serializable {
    private Integer deptId;
    private String deptName;
    private String dbSource;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}
