package cn.jbit.slsale.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jbit.slsale.bean.AuUser;
import cn.jbit.slsale.biz.UserBiz;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserBiz userBiz = (UserBiz) context.getBean("userBiz");
		AuUser u = new AuUser();
		u.setLoginCode("admin");
		u.setPassword("123456");
		AuUser user=null;
		try {
			user = userBiz.login(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(user.getUserName());
	}
}
