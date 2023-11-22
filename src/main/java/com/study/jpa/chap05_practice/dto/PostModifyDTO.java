package com.study.jpa.chap05_practice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostModifyDTO {

    @NotBlank
    @Size(min = 1, max = 20)
    private String title;


    private String content;

    @NotNull // Long타입은 공백이나 빈문자열이 들어올 수 없는 타입에서 NotBlank는 에러를 발생
    @Builder.Default // 기본값을 세팅해야 null에서 자유롭다
    private Long postNo = 8L;


}
