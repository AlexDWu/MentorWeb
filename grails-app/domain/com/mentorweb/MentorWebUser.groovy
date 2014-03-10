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
		pendingMentors: MentorWebUser, // This user's requests for mentors
		pendingMentees: MentorWebUser, // This user's requests for mentees
	]
	
	static mappedBy = [ // for clearing up reverse lookup ambiguity
		mentors:"mentees",
		mentees:"mentors",
		
		mentorRequests:"pendingMentors",
		pendingMentors:"mentorRequests",
		
		menteeRequests:"pendingMentees",
		pendingMentees:"menteeRequests",
	]
	
    static constraints = {
    }
}
