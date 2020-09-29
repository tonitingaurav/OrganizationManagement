package com.tonitingaurav.microservice.db.entity;

import static com.tonitingaurav.microservice.constant.NumericConstant.FIFTY;
import static com.tonitingaurav.microservice.constant.NumericConstant.TEN;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.tonitingaurav.microservice.db.enums.AssetType;
import com.tonitingaurav.microservice.db.enums.Condition;

@Entity
@Table(name = "ASSET")
public class AssetEntity extends BaseEntity {

	@Column(name = "ASSET_ID", nullable = false, length = FIFTY, unique = true)
	private String assetId;

	@Enumerated
	@Column(name = "ASSET_TYPE", nullable = false, length = FIFTY)
	private AssetType assetType;

	@Column(name = "ASSET_CONDITION", nullable = false, length = TEN)
	private Condition assetCondition;

	@Temporal(TemporalType.DATE)
	@Column(name = "PURCHASE_DATE")
	private Date purchaseDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPIRE_DATE")
	private Date expireDate;

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public Condition getAssetCondition() {
		return assetCondition;
	}

	public void setAssetCondition(Condition assetCondition) {
		this.assetCondition = assetCondition;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
}
