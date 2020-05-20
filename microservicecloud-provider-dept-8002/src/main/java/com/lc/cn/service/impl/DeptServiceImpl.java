package com.lc.cn.service.impl;
import com.lc.cn.mapper.DeptMapper;
import com.lc.cn.pojo.Dept;
import com.lc.cn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public void add(Dept dept) {
        deptMapper.insert(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.selectAll();
    }

}
