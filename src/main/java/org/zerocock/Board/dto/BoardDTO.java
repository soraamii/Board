package org.zerocock.Board.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BoardDTO {

    // 테이블명
    private int bno;
    // 제목
    private String title;
    // 내용
    private String content;
    // 작성자
    private String writer;
    // 등록일자
    private String dueDate;
    
}
