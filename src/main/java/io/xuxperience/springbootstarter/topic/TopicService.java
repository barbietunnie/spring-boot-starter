package io.xuxperience.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(
			new Topic(1, "spring", "Spring is vast"),
			new Topic(2, "docker", "All about Containerization"),
			new Topic(3, "kubernetes", "Orchestration mehn")
	);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
}
