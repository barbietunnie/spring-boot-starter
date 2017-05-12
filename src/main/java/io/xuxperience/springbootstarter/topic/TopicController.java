package io.xuxperience.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic(1, "spring", "Spring is vast"),
				new Topic(2, "docker", "All about Containerization"),
				new Topic(3, "kubernetes", "Orchestration mehn")
		);
	}
}
