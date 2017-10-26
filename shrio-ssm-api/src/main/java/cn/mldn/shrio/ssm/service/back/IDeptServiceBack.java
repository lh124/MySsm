package cn.mldn.shrio.ssm.service.back;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;

import cn.mldn.shrio.ssm.vo.Dept;

public interface IDeptServiceBack {

	/**
	 * 增加新部门的数据
	 * @param vo 部门信息
	 * @return 增加成功返回true
	 */
	@RequiresRoles("dept")
	@RequiresPermissions("dept:add")
	public boolean add(Dept vo) ;
	/**
	 * 获取全部的部门信息
	 * @return 所有的部门信息，如果部门没有内容则集合长度为0（返回不为null）
	 */
	@RequiresRoles("dept")
	@RequiresPermissions("dept:list")
	public List<Dept> list() ;
	/**
	 * 根据部门编号执行部门的数据删除操作
	 * @param deptno 部门编号
	 * @return 删除成功返回true
	 */
	@RequiresRoles("dept")
	@RequiresPermissions("dept:remove") 
	public boolean remove(long deptno) ;
}
