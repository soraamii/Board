package org.zerocock.Board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerocock.Board.dto.BoardDTO;
import org.zerocock.Board.mappers.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
// final이 붙은 필드의 생성자 자동 생성
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

  private final BoardMapper boardMapper;

  @Override
  public List<BoardDTO> getList() {
   
    return boardMapper.getList();

  }

  
}
