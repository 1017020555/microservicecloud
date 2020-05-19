package com.lc.cn.mapper;
import com.lc.cn.pojo.Dept;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface DeptMapper extends Mapper<Dept>, MySqlMapper<Dept> {

}

