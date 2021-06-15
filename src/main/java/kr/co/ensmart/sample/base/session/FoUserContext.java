package kr.co.ensmart.sample.base.session;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@ToString
public class FoUserContext implements UserContext {
	private static final long serialVersionUID = -3284259180194383375L;
	private LocalDateTime lastConnDateTime;

	private Locale locale;

	private String dbTimeZone;

	private TimeZone javaTimeZone;

	private CurrentUser currentUser = null;

	@Override
	public boolean isLoggedIn() {
		if(Objects.isNull(getCurrentUser()))
			return false;
		return getCurrentUser().isLoggedIn();
	}

	@Override
	public void removeCurrentUser() {
		this.currentUser = null;
	}

	@Override
	public <T extends CurrentUser> T getCurrentUser() {
		return (T)currentUser;
	}

}
