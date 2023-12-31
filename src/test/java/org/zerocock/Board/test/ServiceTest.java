package org.zerocock.Board.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerocock.Board.dto.BoardDTO;
import org.zerocock.Board.dto.PageRequestDTO;
import org.zerocock.Board.dto.PageResponseDTO;
import org.zerocock.Board.service.BoardService;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class ServiceTest {
  
  @Autowired
  private BoardService boardService;

  // 목록 테스트
  @Test
  public void getList() {

    PageRequestDTO dto = PageRequestDTO.builder().build();
    PageResponseDTO<BoardDTO> list = boardService.getList(dto);

    log.info(list);

  }

  // 등록 테스트
  @Test
  public void registTest() {

    BoardDTO dto = BoardDTO.builder()
    .title("홈런치세요")
    .content("홈런 쳐줘")
    .writer("박병호")
    .build();

    boardService.registBoard(dto);

    log.info("=====================");
    log.info(dto);
    log.info("=====================");

  }

  // 목록 테스트
  @Test
  public void readTest() {

    BoardDTO dto = boardService.readBoard(504);

    log.info(dto);
  }

  // 수정 테스트
  @Test
  public void modifyTest() {

    BoardDTO dto = BoardDTO.builder()
    .bno(504)
    .title("장하다")
    .content("정준영 장하다")
    .build();

    boardService.modifyBoard(dto);

    log.info("========================");
    log.info(dto);
    log.info("========================");

  }


  // 삭제 테스트
  @Test
  public void deleteTest() {

    boardService.deleteBoard(512);


  }

}
