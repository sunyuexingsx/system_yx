package com.hengaiw.commons.result;

import java.util.List;

/**
 * @description：TreeVO
 * @author：zhixuan.wang
 * @date：2015/10/1 14:51
 */
public class Hatree implements java.io.Serializable {

    private static final long serialVersionUID = 980682543891282923L;
    private Long id;
    private String text;
    private String state = "closed";// open,closed
    private boolean checked = false;
    private List<Hatree> nodes;
    private String pid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

	/**
	 * @return the nodes
	 */
	public List<Hatree> getNodes() {
		return nodes;
	}

	/**
	 * @param nodes the nodes to set
	 */
	public void setNodes(List<Hatree> nodes) {
		this.nodes = nodes;
	}

}
