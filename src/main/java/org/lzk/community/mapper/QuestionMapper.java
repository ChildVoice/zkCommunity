package org.lzk.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.lzk.community.model.Question;

import java.util.List;

/**
 * @Author: Lzk
 * @Date: 2020/2/18 15:35
 **/

@Mapper
public interface QuestionMapper {

    @Insert(" insert into t_question (title,description,gmt_create,gmt_modified,creator,creator_name,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{creatorName},#{tag}) ")
    void instertQuestion(Question question);

    @Select(" select * from t_question ")
    List<Question> list();

}
