package cn.mldn.shrio.ssm.service.back;

import java.util.List;

import cn.mldn.shrio.ssm.vo.Dept;

public interface IDeptServiceBack {

	public boolean add(Dept vo);
	
	public List<Dept> list();
	
	public boolean remove(long deptno) ;
}
