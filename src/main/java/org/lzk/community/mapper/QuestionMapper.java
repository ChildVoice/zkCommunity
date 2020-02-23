package org.lzk.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.lzk.community.model.Question;

/**
 * @Author: Lzk
 * @Date: 2020/2/18 15:35
 **/

@Mapper
public interface QuestionMapper {

    @Insert(" insert into t_question (title,description,gmt_create,gmt_modified,creator,creator_name,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{creatorName},#{tag}) ")
    void instertQuestion(Question question);
}
