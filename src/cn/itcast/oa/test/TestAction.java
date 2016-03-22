package cn.itcast.oa.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller("testAction")
@Scope("Prototype")
public class TestAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception{
		System.out.println("--->TestAction.execute()");
		return "success";
	}

}
