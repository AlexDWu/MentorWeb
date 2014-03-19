package com.mentorweb

class Skill {

	String name
	int currentLevel // know nothing, know something, advanced knowledge, expert
	int desiredLevel // know something, advanced knowledge, expert
	// maybe another attribute for level comfortable to teach at.
	// but it may include multiple levels. An expert may not want to
	// teach someone from scratch.
	
	static belongsTo = [owner:MentorWebUser]
	
    static constraints = {
    }
}
