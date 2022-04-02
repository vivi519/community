package com.newcoder.community.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class AlphaDaoMyBatisImpl implements AlphaDao{

    @Override
    public String select(){
        return "Mybatis";
    }
}
