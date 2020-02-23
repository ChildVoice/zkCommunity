package org.lzk.community.dto;

import lombok.Data;
import org.lzk.community.model.User;


/**
 * @Author: Lzk
 * @Date: 2020/2/23 16:00
 **/
@Data
public class QuestionDto {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private String creatorName;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
