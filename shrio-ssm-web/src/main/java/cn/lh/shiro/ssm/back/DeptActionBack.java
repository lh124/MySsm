package cn.lh.shiro.ssm.back;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mldn.shrio.ssm.service.back.IDeptServiceBack;
import cn.mldn.shrio.ssm.vo.Dept;


@Controller
@RequestMapping("/pages/back/dept/*")
public class DeptActionBack {
	@Resource
	private IDeptServiceBack deptService ;
	@RequiresAuthentication	// 已经认证过
	@RequiresRoles("dept")
	@RequiresPermissions("dept:add")
	@RequestMapping("dept_add")
	@ResponseBody
	public Object add(Dept vo) {

		return this.deptService.add(vo) ;
	}
	@RequiresRoles("dept")
	@RequiresPermissions("dept:list")
	@RequestMapping("dept_list")
	@ResponseBody
	public Object list() {
//		System.out.println(SecurityUtils.getSubject().getPrincipal());
		SecurityUtils.getSubject().getSession().setAttribute("name", "姓名");
		System.out.println(SecurityUtils.getSubject().getSession().getAttribute("name"));
		return this.deptService.list() ;
	}
	@RequiresRoles("dept")
	@RequiresPermissions("dept:remove")
	@RequestMapping("dept_remove")
	@ResponseBody
	public Object remove(Long deptno) { 
		return this.deptService.remove(deptno);
	}
	EnterpriseCacheSessionDAO d;
}

