package org.zerocock.Board.mappers;

import java.util.List;

import org.zerocock.Board.dto.BoardDTO;

public interface BoardMapper {
    
    // 목록
    List<BoardDTO> getList();

}
