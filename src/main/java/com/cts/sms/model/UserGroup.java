package com.cts.sms.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "usergroups")
public class UserGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "groupkey")
	private int groupKey;
	
	@Column(name = "groupname")
	private String groupName;

	public int getGroupKey() {
		return groupKey;
	}

	public void setGroupKey(int groupKey) {
		this.groupKey = groupKey;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
		
}