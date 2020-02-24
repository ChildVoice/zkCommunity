package org.lzk.community.dto;

import lombok.Data;

@Data
public class GithubUser {
    private String name;
    private long id;
    private String bio; //描述
    private String avatarUrl;//头像地址
}
