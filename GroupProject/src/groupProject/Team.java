/**
 * 
 */
package groupProject;

import java.util.Date;

/**
 * @author Waleed
 *
 */
public class Team {

	private String schoolCode;
	private String year;
	private int [] teamAvaliability;
	private SchoolPersonnel advisor;
	private boolean isActive;
	private int size;
	private Date timestamp;
	private String volunteerPI;
	private String teamID;
	
	public Team () {
		
	}
	
	public void createTeam() {
		System.out.println("Team created");
	}
	
	public void editTeam() {
		System.out.println("Team edited");
	}
	
	public void generateTeam() {
		System.out.println("Team was genereated");
	}
}
