package org.zerocock.Board.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.zerocock.Board.dto.BoardDTO;

@Transactional
public interface BoardService {

  // 목록
  public List<BoardDTO> getList();
  
  
}
