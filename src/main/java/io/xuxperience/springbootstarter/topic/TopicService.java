package io.xuxperience.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(1, "spring", "Spring is vast"),
			new Topic(2, "docker", "All about Containerization"),
			new Topic(3, "kubernetes", "Orchestration mehn")
	));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(int id) {
		return topics.stream().filter(t -> t.getId() == id).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(int id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(id);
			if(t.getId() == id) {
				topics.set(i, t);
				return;
			}
		}
	}
}
