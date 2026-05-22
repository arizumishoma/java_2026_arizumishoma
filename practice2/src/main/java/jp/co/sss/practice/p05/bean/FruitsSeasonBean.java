package jp.co.sss.practice.p05.bean;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

public class FruitsSeasonBean implements Serializable{

	private Integer fruitId;

	private String fruitName;

	private Integer seasonMonth;

	public FruitsSeasonBean() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public Integer getFruitId() {
		return fruitId;
	}
	public void setFruitId(Integer fruitId) {
		this.fruitId = fruitId;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public Integer getSeasonMonth() {
		return seasonMonth;
	}
	public void setSeasonMonth(Integer seasonMonth) {
		this.seasonMonth = seasonMonth;
	}
	@Override
	public String toString() {
		return "FruitsSeason [fruitId=" + fruitId + ", fruitName=" + fruitName + ", seasonMonth=" + seasonMonth + "]";
	}



}
