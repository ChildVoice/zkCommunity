package org.lzk.community.model;

import lombok.Data;

/**
 * @Author: Lzk
 * @Date: 2020/2/18 15:42
 **/
@Data
public class Question {
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
}
