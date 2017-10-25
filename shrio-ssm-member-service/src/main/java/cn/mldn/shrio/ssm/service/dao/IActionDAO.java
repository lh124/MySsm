package cn.mldn.shrio.ssm.service.dao;

import java.util.Set;

public interface IActionDAO {

	public Set<String> findAllByMember(String mid);
}
