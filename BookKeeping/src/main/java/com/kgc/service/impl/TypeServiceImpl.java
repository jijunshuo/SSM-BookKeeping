package com.kgc.service.impl;

import com.kgc.mapper.TypeMapper;
import com.kgc.pojo.Type;
import com.kgc.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    TypeMapper typeMapper;

    @Override
    public List<Type> selectAll() {
        List<Type> types = typeMapper.selectByExample(null);
        return types;
    }
}
