package org.zerocock.Board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerocock.Board.dto.BoardDTO;
import org.zerocock.Board.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/board/")
@RequiredArgsConstructor
public class BoardController {

  private final BoardService boardService;

  @GetMapping("list")
  public void list(Model model) {
    
    log.info("list.....");

    List<BoardDTO> list = boardService.getList();

    model.addAttribute("board", list);

  }
  
}
