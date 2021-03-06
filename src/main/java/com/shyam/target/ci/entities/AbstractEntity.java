package com.shyam.target.ci.entities;

import org.springframework.data.annotation.Id;

public abstract class AbstractEntity {
	@Id
	private String id;
	private long creationTime;
	private long lastUpdatedTime;

	public AbstractEntity() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}

	public long getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(long lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public static class FieldConstants {
		public static final String ID = "id";
		public static final String CREATION_TIME = "creationTime";
		public static final String LAST_UPDATED_TIME = "lastUpdatedTime";
	}

	@Override
	public String toString() {
		return "AbstractEntity [id=" + id + ", creationTime=" + creationTime + ", lastUpdatedTime=" + lastUpdatedTime
				+ ", toString()=" + super.toString() + "]";
	}
}
