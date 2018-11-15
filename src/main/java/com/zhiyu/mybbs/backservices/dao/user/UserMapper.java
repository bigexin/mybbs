package com.zhiyu.mybbs.backservices.dao.user;

import com.zhiyu.mybbs.backservices.entities.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User queryByPk(@Param("id") Integer id, @Param("email") String email);

}
