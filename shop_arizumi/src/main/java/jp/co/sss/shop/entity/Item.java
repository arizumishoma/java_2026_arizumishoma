package jp.co.sss.shop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_items_gen")
    @SequenceGenerator(name = "seq_items_gen", sequenceName = "seq_items", allocationSize = 1)
	private Integer id;
	private String name;
	private Integer price;

	@Column
	public Integer getId() {
		return id;
	}
	@Column
	public void setId(Integer id) {
		this.id = id;
	}
	@Column
	public String getName() {
		return name;
	}
	@Column
	public void setName(String name) {
		this.name = name;
	}
	@Column
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}
