package com.reddit.clone.controller.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubredditDto {
    private Long id;
    private String name;
    private String description;
    private Integer numberOfPosts;
}
