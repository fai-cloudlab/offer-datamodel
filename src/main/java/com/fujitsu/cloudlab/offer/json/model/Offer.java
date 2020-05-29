package com.fujitsu.cloudlab.offer.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/** Offer */
@Validated
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.SpringCodegen",
    date = "2020-05-29T10:52:59.498-05:00")
public class Offer implements Serializable {
  @JsonProperty("offerId")
  private UUID offerId = null;

  @JsonProperty("offerType")
  private String offerType = null;

  @JsonProperty("offerPrice")
  private Price offerPrice = null;

  @JsonProperty("offerCreationDate")
  private String offerCreationDate = null;

  @JsonProperty("offerExpirationDate")
  private String offerExpirationDate = null;

  @JsonProperty("product")
  private Product product = null;

  @JsonProperty("customer")
  private Customer customer = null;

  public Offer offerId(UUID offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Get offerId
   *
   * @return offerId
   */
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  @NotNull
  @Valid
  public UUID getOfferId() {
    return offerId;
  }

  public void setOfferId(UUID offerId) {
    this.offerId = offerId;
  }

  public Offer offerType(String offerType) {
    this.offerType = offerType;
    return this;
  }

  /**
   * Get offerType
   *
   * @return offerType
   */
  @ApiModelProperty(example = "BlackFridaySpl2020", required = true, value = "")
  @NotNull
  public String getOfferType() {
    return offerType;
  }

  public void setOfferType(String offerType) {
    this.offerType = offerType;
  }

  public Offer offerPrice(Price offerPrice) {
    this.offerPrice = offerPrice;
    return this;
  }

  /**
   * Get offerPrice
   *
   * @return offerPrice
   */
  @ApiModelProperty(value = "")
  @Valid
  public Price getOfferPrice() {
    return offerPrice;
  }

  public void setOfferPrice(Price offerPrice) {
    this.offerPrice = offerPrice;
  }

  public Offer offerCreationDate(String offerCreationDate) {
    this.offerCreationDate = offerCreationDate;
    return this;
  }

  /**
   * Get offerCreationDate
   *
   * @return offerCreationDate
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Pattern(regexp = "^(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}[\\+\\-]\\d{4})$")
  public String getOfferCreationDate() {
    return offerCreationDate;
  }

  public void setOfferCreationDate(String offerCreationDate) {
    this.offerCreationDate = offerCreationDate;
  }

  public Offer offerExpirationDate(String offerExpirationDate) {
    this.offerExpirationDate = offerExpirationDate;
    return this;
  }

  /**
   * Get offerExpirationDate
   *
   * @return offerExpirationDate
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Pattern(regexp = "^(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}[\\+\\-]\\d{4})$")
  public String getOfferExpirationDate() {
    return offerExpirationDate;
  }

  public void setOfferExpirationDate(String offerExpirationDate) {
    this.offerExpirationDate = offerExpirationDate;
  }

  public Offer product(Product product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   *
   * @return product
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Offer customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   *
   * @return customer
   */
  @ApiModelProperty(value = "")
  @Valid
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.offerId, offer.offerId)
        && Objects.equals(this.offerType, offer.offerType)
        && Objects.equals(this.offerPrice, offer.offerPrice)
        && Objects.equals(this.offerCreationDate, offer.offerCreationDate)
        && Objects.equals(this.offerExpirationDate, offer.offerExpirationDate)
        && Objects.equals(this.product, offer.product)
        && Objects.equals(this.customer, offer.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        offerId, offerType, offerPrice, offerCreationDate, offerExpirationDate, product, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");

    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    offerPrice: ").append(toIndentedString(offerPrice)).append("\n");
    sb.append("    offerCreationDate: ").append(toIndentedString(offerCreationDate)).append("\n");
    sb.append("    offerExpirationDate: ")
        .append(toIndentedString(offerExpirationDate))
        .append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
