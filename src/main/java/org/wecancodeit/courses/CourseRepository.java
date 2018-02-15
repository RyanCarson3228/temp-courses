package org.wecancodeit.courses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	Map<Long, Course> courses = new HashMap<>();

	public CourseRepository() {
		Course java = new Course(1L, "Java", "Java Description");
		Course javascript = new Course(2L, "Javascript", "JS Description");
		Course spring = new Course(3L, "Spring", "Spring Description");

		courses.put(java.getId(), java);
		courses.put(javascript.getId(), javascript);
		courses.put(spring.getId(), spring);
		
		//or do this to put the courses in the map
		//populateCoursesMap(java,javascript,spring);
	}

	/**
	 * This constructor is for testing
	 */
	public CourseRepository(Course... courses) {
		populateCoursesMap(courses);
	}
	
	private void populateCoursesMap(Course... courses) {
		for (Course course : courses) {
			this.courses.put(course.getId(), course);
		}
	}

	public Course findOne(Long courseId) {
		return courses.get(courseId);
	}

	public Collection<Course> findAll() {
		return courses.values();
	}

}
