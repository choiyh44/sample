package kr.co.ensmart.sample.base.session;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

public interface UserContext  extends Serializable {
	// getter
    public Locale getLocale();
    public String getDbTimeZone();
    public TimeZone getJavaTimeZone();
    public boolean isLoggedIn();
    public <T extends CurrentUser> T getCurrentUser();
    public void setCurrentUser(CurrentUser loggedInUser);
    public void removeCurrentUser();
    public void setLocale(Locale locale);
    public void setDbTimeZone(String timeZone);
    public void setJavaTimeZone(TimeZone timeZone);

}
