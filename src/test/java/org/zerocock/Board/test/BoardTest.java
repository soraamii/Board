package org.zerocock.Board.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerocock.Board.dto.BoardDTO;
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

    List<BoardDTO> list = boardMapper.getList();

    log.info(list);

  }

  
}
