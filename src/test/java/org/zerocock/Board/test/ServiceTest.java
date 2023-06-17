package org.zerocock.Board.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerocock.Board.dto.BoardDTO;
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

    List<BoardDTO> list = boardService.getList();

    log.info(list);

  }


}
