package org.zerocock.Board.mappers;

import java.util.List;

import org.zerocock.Board.dto.BoardDTO;

public interface BoardMapper {
    
    // 목록
    List<BoardDTO> getList();

    // 등록
    int regist(BoardDTO boardDTO);

    // 조회
    BoardDTO read(int bno);

    // 수정
    int modify(BoardDTO boardDTO);

    // 삭제
    int delete(int bno);

}
