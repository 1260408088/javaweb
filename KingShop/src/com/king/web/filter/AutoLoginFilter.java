package com.king.web.filter;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.domain.User;
import com.king.service.UserService;

public class AutoLoginFilter implements Filter{
	public void doFilter(ServletRequest req, ServletResponse rep,
			FilterChain chain) throws IOException, ServletException {
			//需要先将rep和 req转换成    respone  request
			HttpServletResponse respone= (HttpServletResponse) rep;
			HttpServletRequest request=(HttpServletRequest) req;
			User user=(User) request.getSession().getAttribute("user");
			String cookie_username=null;
			String cookie_passsword=null;
			if(user==null){
				Cookie[] cookies = request.getCookies();
				if(cookies!=null){
					for (Cookie cookie : cookies) {
						if("cookie_username".equals(cookie)){
							cookie_username = cookie.getValue();
						}
						
						if("cookie_passsword".equals(cookie)){
							cookie_passsword = cookie.getValue();
						}
					}
				}
			}
			
			if(cookie_username!=null&&cookie_passsword!=null){
				UserService service = new UserService();
				
				try {
					user = service.login(cookie_username, cookie_passsword);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//再存入session域之中
				if(user!=null){
					request.getSession().setAttribute("user", user);
				}
			}
			//放行
			chain.doFilter(request, rep);
	}
	
	public void destroy() {
		
	}
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
