package com.example.demo.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sys_map database table.
 * 
 */
@Entity
@Table(name="sys_map")
public class SysMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="colum_nam")
	private String columNam;

	@Column(name="map_code")
	private String mapCode;

	@Column(name="map_value")
	private String mapValue;

	@Column(name="table_name")
	private String tableName;

	public SysMap() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColumNam() {
		return this.columNam;
	}

	public void setColumNam(String columNam) {
		this.columNam = columNam;
	}

	public String getMapCode() {
		return this.mapCode;
	}

	public void setMapCode(String mapCode) {
		this.mapCode = mapCode;
	}

	public String getMapValue() {
		return this.mapValue;
	}

	public void setMapValue(String mapValue) {
		this.mapValue = mapValue;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}