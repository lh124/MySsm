package cn.lh.test;

import cn.lh.shiro.ssm.util.enctype.PasswordUtil;

public class Test  {
	public static void main(String[] args) {
		System.out.println(PasswordUtil.encoder("hello"));
	}
}
