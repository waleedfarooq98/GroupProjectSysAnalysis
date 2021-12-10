/**
 * 
 */
package groupProject;

/**
 * @author Waleed
 *
 */
public class Course {
	
	private String courseCode;
	private String courseTitle;
	private String courseDescription;
	private String schoolCode;
	private SchoolPersonnel courseSupervisor;
	private String teamID;
	private float courseStatus;
	
	
	public Course () {
		
	}
	public void signUp() {
		System.out.println("Team signed up to teach this course");
	}
	
	public void courseStatusCheck() {
		System.out.println("Course has been completed this much: ");
	}
	
	public void postCourse() {
		System.out.println("School has posted this course to be taught");
	}

}
