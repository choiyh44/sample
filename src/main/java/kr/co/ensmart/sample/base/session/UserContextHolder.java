package kr.co.ensmart.sample.base.session;

import java.util.Objects;

public class UserContextHolder {
    private static final ThreadLocal<UserContext> USER_CONTEXT_THREAD_LOCAL = new ThreadLocal<>();
    
    @SuppressWarnings("unchecked")
    public static final <T extends UserContext> T  getUserContext(){
        return (T)USER_CONTEXT_THREAD_LOCAL.get();
    }
    
    public static final void setUserContext(UserContext userContext){
        USER_CONTEXT_THREAD_LOCAL.set(userContext);
    }
    
	@SuppressWarnings("unchecked")
	public static <T extends CurrentUser> T getCurrentUser() {
		if (Objects.isNull(getUserContext())) return null;
		return (T) getUserContext().getCurrentUser();
	}

}
