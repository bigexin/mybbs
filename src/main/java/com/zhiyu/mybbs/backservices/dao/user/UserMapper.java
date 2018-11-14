package com.zhiyu.mybbs.backservices.dao.user;

import com.zhiyu.mybbs.backservices.entities.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User findUserById(@Param("id") int id);

}
