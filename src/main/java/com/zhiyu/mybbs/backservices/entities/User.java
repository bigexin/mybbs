package com.zhiyu.mybbs.backservices.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhiyu
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 823974019487291397L;

    private int id;

    private String userName;

    private String avatarUrl;

    private String email;

    private String loginPwd;

    private String sex;

    private String personalizedSignature;

    private int receivedKissCount;

    private String location;

    private String gmtCreate;

    private String gmtModified;
}
