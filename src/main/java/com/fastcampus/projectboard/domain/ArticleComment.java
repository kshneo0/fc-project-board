package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

/**
 * author :  sanghoonkim
 * date : 2023/01/01
 */
public class ArticleComment {
    private Long id;
    private Article article;
    private String content;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
