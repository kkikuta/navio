package com.herokuapp.navio.forum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForumController {

	@GetMapping("/")
	public String top(Model model) {
		model.addAttribute("text", "テスト成功");

		return "forum/top";
	}

}
