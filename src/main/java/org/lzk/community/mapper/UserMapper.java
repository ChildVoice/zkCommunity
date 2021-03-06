package org.lzk.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.lzk.community.model.User;

@Mapper
public interface  UserMapper {

    @Insert(" insert into t_user (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl}) ")
    void insertUser(User user);

    @Select(" select * from t_user where token = #{token} ")
    User findByToken(@Param("token") String token);

    @Select(" select * from t_user where id = #{id} ")
    User findById(@Param("id") Integer id);
}
