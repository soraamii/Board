package org.zerocock.Board.mappers;

import java.util.List;

import org.zerocock.Board.dto.BoardDTO;
import org.zerocock.Board.dto.PageRequestDTO;

public interface BoardMapper {
    
    // 목록
    List<BoardDTO> getList(PageRequestDTO pageRequestDTO);

    // 전체 게시물 개수 + 1
    long getCountEnd(PageRequestDTO pageRequestDTO);

    // 등록
    int regist(BoardDTO boardDTO);

    // 조회
    BoardDTO read(int bno);

    // 수정
    int modify(BoardDTO boardDTO);

    // 삭제
    void delete(int bno);

}
