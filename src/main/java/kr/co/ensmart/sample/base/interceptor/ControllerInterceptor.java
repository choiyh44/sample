package kr.co.ensmart.sample.base.interceptor;

import java.time.LocalDateTime;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ensmart.sample.base.session.FoUserContext;
import kr.co.ensmart.sample.base.session.UserContextHolder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ControllerInterceptor implements HandlerInterceptor {

	@Resource
	private FoUserContext foUserContext;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		log.info("ControllerInterceptor.preHandle() called.");

		// 최근 접속 시간 조회
		if (foUserContext.getLastConnDateTime() == null) {
			foUserContext.setLastConnDateTime(LocalDateTime.now());
		}
		log.info("LastConnDateTime: {}", foUserContext.getLastConnDateTime());

		UserContextHolder.setUserContext(foUserContext);
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {

		// log.info("ControllerInterceptor.postHandle() called.");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {

		// log.info("ControllerInterceptor.afterCompletion() called.");
	}

}
