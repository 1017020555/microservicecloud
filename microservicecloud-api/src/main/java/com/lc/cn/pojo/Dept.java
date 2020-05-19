package com.lc.cn.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true) //存取器。通过该注解可以控制getter和setter方法的形式
/*
        @Accessors存取器。通过该注解可以控制getter和setter方法的形式
        fluent 若为true，则getter和setter方法的方法名都是属性名，且setter方法返回当前对象。
        chain 若为true，则setter方法返回当前对象
        prefix 若为true，则getter和setter方法会忽视属性名的指定前缀（遵守驼峰命名）
 */
public class Dept implements Serializable {

    @Id
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }

}
