package org.zerocock.Board.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerocock.Board.dto.BoardDTO;
import org.zerocock.Board.dto.PageRequestDTO;
import org.zerocock.Board.dto.PageResponseDTO;
import org.zerocock.Board.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/board/")
@RequiredArgsConstructor
public class BoardController {

  private final BoardService boardService;

  // 목록
  @GetMapping("list")
  public void list(PageRequestDTO pageRequestDTO, Model model) {
    
    log.info("list.....");

    PageResponseDTO<BoardDTO> list = boardService.getList(pageRequestDTO);

    model.addAttribute("board", list);

  }

  // 등록(GET)
  @GetMapping("regist")
  public void getRegist() {

    log.info("GET Regist....");

  }

  // 등록(POST)
  @PostMapping("regist")
  public String postRegist(BoardDTO boardDTO) {

    boardService.registBoard(boardDTO);

    return "redirect:/board/list";
  }

  // 조회
  @GetMapping("read/{bno}")
  public String getRead(@PathVariable("bno") int bno, Model model) {

    log.info("GET Read............");

    BoardDTO dto = boardService.readBoard(bno);

    model.addAttribute("read", dto);

    // 실제 경로
    return "/board/read";

  }

  
  // 수정(GET)
  @GetMapping("modify/{bno}")
  public String getModify(@PathVariable("bno") int bno, Model model) {

    log.info("GET Modify......");

    BoardDTO dto = boardService.readBoard(bno);

    model.addAttribute("modify", dto);

    return "/board/modify";

  }

  // 수정(POST)
  
  
}
