package io.younhamle.memorycard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemoryCardController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
