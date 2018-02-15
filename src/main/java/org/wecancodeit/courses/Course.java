package org.wecancodeit.courses;

public class Course {

	private Long courseId;
	private String name;
	private String description;

	public Long getId() {
		return courseId;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public Course(Long courseId, String name, String description) {
		this.courseId = courseId;
		this.name = name;
		this.description = description;
	}

}
