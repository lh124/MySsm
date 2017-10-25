package cn.mldn.shrio.ssm.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Role implements Serializable {
	private String rid;
	private String title;
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", title=" + title + "]";
	}


}
