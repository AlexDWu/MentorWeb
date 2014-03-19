import com.mentorweb.secure.Authority
import com.mentorweb.secure.User
import com.mentorweb.secure.UserAuthority
import com.mentorweb.MentorWebUser

class BootStrap {

    def init = { servletContext ->
		def adminAuthority = new Authority(authority: 'AUTHORITY_ADMIN').save(flush: true)
		def basicAuthority = new Authority(authority: 'AUTHORITY_BASIC').save(flush: true)
  
		def testUser = new MentorWebUser(username: 'me', password: 'password')
		testUser.save(flush: true)
  
		UserAuthority.create testUser, basicAuthority, true
  
		assert User.count() == 1
		assert Authority.count() == 2
		assert UserAuthority.count() == 1
    }
    def destroy = {
    }
}
