package org.shrio.ssm.api;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.shrio.ssm.service.front.IMemberServiceFront;

@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {
	@Resource
	private IMemberServiceFront memberService;
	@Test
	public void testGet() {
		System.err.println(this.memberService.get("mldn"));
	}
	@Test
	public void testGetRoleAndActionByMember() {
		System.err.println(this.memberService.list("admin"));
	}
}
