package org.zerocock.Board.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerocock.Board.dto.BoardDTO;
import org.zerocock.Board.dto.PageRequestDTO;
import org.zerocock.Board.mappers.BoardMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardTest {

  @Autowired(required = false)
  private BoardMapper boardMapper;

  // 목록 테스트
  @Test
  public void getList() {

    PageRequestDTO dto = PageRequestDTO.builder().build();
    List<BoardDTO> list = boardMapper.getList(dto);

    log.info(list);

  }

  // 등록 테스트
  @Test
  public void registTest() {

    BoardDTO dto = BoardDTO.builder()
    .title("스윕")
    .content("삼성 스윕승")
    .writer("엄상백")
    .build();

    boardMapper.regist(dto);

    log.info("========================");
    log.info(dto);
    log.info("========================");

  }

  // 조회 테스트
  @Test
  public void readTest() {

    BoardDTO dto = boardMapper.read(511);

    log.info("=======================");
    log.info(dto);
    log.info("=======================");

  }

  // 수정 테스트
  @Test
  public void modifyTest() {

    BoardDTO dto = BoardDTO.builder()
    .bno(504)
    .title("test")
    .content("testkk")
    .build();

    boardMapper.modify(dto);

    log.info("===================");
    log.info(dto);
    log.info("===================");
  }

  // 삭제 테스트
  @Test
  public void deleteTest() {

    boardMapper.delete(510);


  }
  
}
