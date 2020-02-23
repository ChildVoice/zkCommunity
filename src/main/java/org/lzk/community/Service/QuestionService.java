package org.lzk.community.Service;

import org.lzk.community.dto.QuestionDto;
import org.lzk.community.mapper.QuestionMapper;
import org.lzk.community.mapper.UserMapper;
import org.lzk.community.model.Question;
import org.lzk.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lzk
 * @Date: 2020/2/23 16:03
 **/
@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public List<QuestionDto> list() {

        List<Question> list = questionMapper.list();
        List<QuestionDto> questionDtolist = new ArrayList<QuestionDto>();

        for (Question question : list) {
            User user = userMapper.findById(question.getCreator());
            QuestionDto questionDto = new QuestionDto();
            BeanUtils.copyProperties(question, questionDto);
            questionDto.setUser(user);
            questionDtolist.add(questionDto);
        }

        return questionDtolist;
    }
}
