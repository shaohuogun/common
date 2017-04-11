package org.shaohuogun.common;

import java.io.Serializable;
import java.util.Date;

public abstract class Model implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final Character DELETED_NOT = '0';
	public static final Character DELETED_YES = '1';
	
	private String id;
	
	private String creator;
	
	private Date createDate = new Date();
	
	private String lastModifier;
	
	private Date lastModifyDate;
	
	private Character deleted = DELETED_NOT;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getLastModifier() {
		return lastModifier;
	}

	public void setLastModifier(String lastModifier) {
		this.lastModifier = lastModifier;
	}

	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	public Character getDeleted() {
		return deleted;
	}

	public void setDeleted(Character deleted) {
		this.deleted = deleted;
	}	

}
