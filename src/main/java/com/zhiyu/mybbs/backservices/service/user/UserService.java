package com.zhiyu.mybbs.backservices.service.user;

import com.zhiyu.mybbs.backservices.entities.User;

/**
 * @author zhiyu
 */
public interface UserService {

    User queryByPk(Integer id, String email);

}
