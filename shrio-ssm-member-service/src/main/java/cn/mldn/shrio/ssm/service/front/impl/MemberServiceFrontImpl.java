package cn.mldn.shrio.ssm.service.front.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.shrio.ssm.service.dao.IActionDAO;
import cn.mldn.shrio.ssm.service.dao.IMemberDAO;
import cn.mldn.shrio.ssm.service.dao.IRoleDAO;
import cn.mldn.shrio.ssm.service.front.IMemberServiceFront;
import cn.mldn.shrio.ssm.vo.Member;
@Service
public class MemberServiceFrontImpl implements IMemberServiceFront {
	@Resource
	private IActionDAO actiondao;
	@Resource
	private IMemberDAO memberdao;
	@Resource
	private IRoleDAO roledao;
	@Override
	public Member get(String mid) {
		return this.memberdao.findById(mid);
	}
	@Override
	public Map<String, Set<String>> list(String mid) {
		Map<String, Set<String>>  map=new HashMap<>();
		map.put("allRoles", roledao.findAllByMember(mid));
		map.put("allActions", actiondao.findAllByMember(mid));
		return map;
	}



}
