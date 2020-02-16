package org.lzk.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.lzk.community.model.User;

@Mapper
public interface  UserMapper {

    @Insert(" insert into t_user (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified}) ")
    void insertUser(User user);

}