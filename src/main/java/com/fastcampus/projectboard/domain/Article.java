package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

/**
 * author :  sanghoonkim
 * date : 2023/01/01
 */
public class Article {
    private Long id;
    private String title;
    private String content;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
