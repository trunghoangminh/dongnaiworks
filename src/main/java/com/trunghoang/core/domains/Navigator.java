package com.trunghoang.core.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * Navigator of application
 *
 */
@Entity
@Table(name = "navigator")
public class Navigator {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	@NotNull
	private String name;

	@Column(name = "value")
	@NotNull
	private String value;

	@Column(name = "description")
	private String description;

	@Column(name = "link")
	@NotNull
	private String link;

	public Navigator() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Navigator [id=" + id + ", name=" + name + ", value=" + value
				+ ", description=" + description + ", link=" + link + "]";
	}

}
