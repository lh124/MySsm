package cn.mldn.shrio.ssm.service.back;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.mldn.shrio.ssm.vo.Dept;
@Service 
public class DeptServiceBackImpl implements IDeptServiceBack{
	@Override
	public boolean add(Dept vo) {
		System.err.println("1、【IDeptSericeBack】增加新的部门数据：" + vo);
		return true;
	}
	@Override
	public List<Dept> list() {
		System.err.println("2、【IDeptSericeBack】查询全部部门数据");
		List<Dept> allDepts = new ArrayList<Dept>();
		for (int x = 0; x < 10; x++) {
			Dept vo = new Dept();
			vo.setDeptno((long) x);
			vo.setDname("mldn - " + x);
			vo.setLoc("北京 - " + x);
			allDepts.add(vo) ;
		} 
		return allDepts;
	}

	@Override
	public boolean remove(long deptno) {
		System.err.println("3、【IDeptSericeBack】删除部门数据，删除的部门编号：" + deptno);
		return true; 
	}


}
