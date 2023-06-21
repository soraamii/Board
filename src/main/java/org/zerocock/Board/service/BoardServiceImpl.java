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


  // 목록
  @Override
  public List<BoardDTO> getList() {
   
    return boardMapper.getList();

  }

  // 등록
  @Override
  public int registBoard(BoardDTO boardDTO) {
   
    return boardMapper.regist(boardDTO);
  }

  // 수정
  @Override
  public int modifyBoard(BoardDTO boardDTO) {
    
    return boardMapper.modify(boardDTO);
  }

  // 조회
  @Override
  public BoardDTO readBoard(int bno) {
    
    return boardMapper.read(bno);
  }

  // 삭제
  @Override
  public int deleteBoard(int bno) {
    
    return boardMapper.delete(bno);
  }

  
}
