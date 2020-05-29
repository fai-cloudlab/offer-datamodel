package com.fujitsu.cloudlab.offer.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/** Product */
@Validated
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.SpringCodegen",
    date = "2020-05-29T10:52:59.498-05:00")
public class Product implements Serializable {
  @JsonProperty("productCode")
  private String productCode = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("productCategory")
  private String productCategory = null;

  @JsonProperty("productDescription")
  private String productDescription = null;

  @JsonProperty("productPrice")
  private Price productPrice = null;

  public Product productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

  /**
   * Get productCode
   *
   * @return productCode
   */
  @ApiModelProperty(example = "LPTP001", required = true, value = "")
  @NotNull
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public Product productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   *
   * @return productType
   */
  @ApiModelProperty(example = "Laptop", required = true, value = "")
  @NotNull
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public Product productCategory(String productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Get productCategory
   *
   * @return productCategory
   */
  @ApiModelProperty(example = "Home Computing", required = true, value = "")
  @NotNull
  public String getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  public Product productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * Get productDescription
   *
   * @return productDescription
   */
  @ApiModelProperty(example = "Laptop XPS7950", required = true, value = "")
  @NotNull
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public Product productPrice(Price productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  /**
   * Get productPrice
   *
   * @return productPrice
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public Price getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(Price productPrice) {
    this.productPrice = productPrice;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.productCode, product.productCode)
        && Objects.equals(this.productType, product.productType)
        && Objects.equals(this.productCategory, product.productCategory)
        && Objects.equals(this.productDescription, product.productDescription)
        && Objects.equals(this.productPrice, product.productPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        productCode, productType, productCategory, productDescription, productPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");

    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
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
