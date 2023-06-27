package org.zerocock.Board.dto;

import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Builder
public class PageRequestDTO {
  
  // 페이지 요청 DTO

  // 페이지
  @Builder.Default
  private int page = 1;

  // 페이지 내 글 개수
  @Builder.Default
  private int size = 10;

  // 페이지 번호
  public void setPage(int page) {
    if(page <= 0) {
      this.page = 1;
    } else {
      this.page = page;
    }
  }

  // 페이지 출력할 게시물 사이즈
  public void setSize(int size) {
    if(size > 100 || size <= 0) {
        this.size = 10;
    } else {
      this.size = size;
    }
  }

  public int getSkip() {
    return (this.page - 1) * this.size;
  }

  // 다음 버튼 출력을 위한 개수 처리
  public int getCountEnd() {

    int temp = (int)Math.ceil((this.page / 10.0)) * (10 * this.size);

    return temp + 1;

  }

}
