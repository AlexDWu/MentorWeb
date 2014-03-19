package com.mentorweb
import com.mentorweb.secure.User

class MentorWebUser extends User{

	static hasMany = [
		// Mentorships
		mentors: MentorWebUser, // confirmed mentors
		mentees: MentorWebUser, // confirmed mentees
		
		// Mentorship requests
		mentorRequests: MentorWebUser, // Requests for this user as a mentor
		menteeRequests: MentorWebUser, // Requests for this user as a mentee
		
		// Pending requests
		unconfirmedMentors: MentorWebUser, // This user's requests for mentors
		unconfirmedMentees: MentorWebUser, // This user's requests for mentees
		
		// Skills
		skills: Skill, //User's skills
	]
	
	static mappedBy = [ // for clearing up reverse lookup ambiguity
		mentors:"mentees",
		mentees:"mentors",
		
		mentorRequests:"pendingMentors",
		unconfirmedMentors:"mentorRequests",
		
		menteeRequests:"pendingMentees",
		unconfirmedMentees:"menteeRequests",
	]
	
    static constraints = {
    }
}
