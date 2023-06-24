package org.zerocock.Board.service;


import org.springframework.transaction.annotation.Transactional;
import org.zerocock.Board.dto.BoardDTO;
import org.zerocock.Board.dto.PageRequestDTO;
import org.zerocock.Board.dto.PageResponseDTO;

@Transactional
public interface BoardService {

  // 목록
  public PageResponseDTO<BoardDTO> getList(PageRequestDTO pageRequestDTO);

  // 등록
  public int registBoard(BoardDTO boardDTO);

  // 조회
  public BoardDTO readBoard(int bno);

  // 수정
  public int modifyBoard(BoardDTO boardDTO);

  // 삭제
  public int deleteBoard(int bno);
  
  
}
