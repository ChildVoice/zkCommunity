package org.lzk.community.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.PageObjectUtil;
import org.lzk.community.dto.QuestionDto;
import org.lzk.community.mapper.QuestionMapper;
import org.lzk.community.mapper.UserMapper;
import org.lzk.community.model.Question;
import org.lzk.community.model.User;
import org.lzk.community.utils.PageInfoUtil;
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

    public PageInfo<QuestionDto> list(Integer page, Integer size) {

        PageHelper.startPage(page,size);
        List<Question> list = questionMapper.list();
        PageInfo<Question> questionPageInfo = new PageInfo< >(list);
        List<QuestionDto> questionDtolist = new ArrayList<>();

        PageInfo<QuestionDto> pageList = PageInfoUtil.pageInfo2PageInfoDTO(questionPageInfo,QuestionDto.class);

        for (Question question : questionPageInfo.getList()) {
            User user = userMapper.findById(question.getCreator());

            QuestionDto questionDto = new QuestionDto();
            BeanUtils.copyProperties(question, questionDto);
            questionDto.setUser(user);
            questionDtolist.add(questionDto);
        }

        pageList.getList().clear();
        for (QuestionDto questionDto : questionDtolist) {
            pageList.getList().add(questionDto);
        }

        return pageList;
    }
}
