package it.etoken.base.model.eosblock.entity;

import java.io.Serializable;
import java.util.Date;

public class DappInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5084519864927428964L;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dapp_info.id
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dapp_info.category_id
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	private Long categoryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dapp_info.name
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dapp_info.icon
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	private String icon;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dapp_info.description
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dapp_info.url
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	private String url;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dapp_info.is_recommend
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	private String isRecommend;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dapp_info.seq
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	private Long seq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dapp_info.create_date
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	private Date createDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dapp_info.update_date
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	private Date updateDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dapp_info.id
	 * @return  the value of dapp_info.id
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dapp_info.id
	 * @param id  the value for dapp_info.id
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dapp_info.category_id
	 * @return  the value of dapp_info.category_id
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public Long getCategoryId() {
		return categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dapp_info.category_id
	 * @param categoryId  the value for dapp_info.category_id
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dapp_info.name
	 * @return  the value of dapp_info.name
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dapp_info.name
	 * @param name  the value for dapp_info.name
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dapp_info.icon
	 * @return  the value of dapp_info.icon
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dapp_info.icon
	 * @param icon  the value for dapp_info.icon
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dapp_info.description
	 * @return  the value of dapp_info.description
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dapp_info.description
	 * @param description  the value for dapp_info.description
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dapp_info.url
	 * @return  the value of dapp_info.url
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dapp_info.url
	 * @param url  the value for dapp_info.url
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dapp_info.is_recommend
	 * @return  the value of dapp_info.is_recommend
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public String getIsRecommend() {
		return isRecommend;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dapp_info.is_recommend
	 * @param isRecommend  the value for dapp_info.is_recommend
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public void setIsRecommend(String isRecommend) {
		this.isRecommend = isRecommend;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dapp_info.seq
	 * @return  the value of dapp_info.seq
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public Long getSeq() {
		return seq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dapp_info.seq
	 * @param seq  the value for dapp_info.seq
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public void setSeq(Long seq) {
		this.seq = seq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dapp_info.create_date
	 * @return  the value of dapp_info.create_date
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dapp_info.create_date
	 * @param createDate  the value for dapp_info.create_date
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dapp_info.update_date
	 * @return  the value of dapp_info.update_date
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dapp_info.update_date
	 * @param updateDate  the value for dapp_info.update_date
	 * @mbg.generated  Sat Sep 08 14:00:13 CST 2018
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}