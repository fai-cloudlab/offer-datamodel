package com.fujitsu.cloudlab.offer.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/** Price */
@Validated
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.SpringCodegen",
    date = "2020-05-29T10:52:59.498-05:00")
public class Price implements Serializable {
  @JsonProperty("value")
  private Double value = null;

  @JsonProperty("currency")
  private String currency = null;

  public Price value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(example = "999.99", required = true, value = "")
  @NotNull
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public Price currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency Code identifies a medium of exchange which allows for the translation of
   * different-valued denominations of money across the world. Example: USD = US Dollar (ISO 4217
   * format)
   *
   * @return currency
   */
  @ApiModelProperty(
      example = "USD",
      required = true,
      value =
          "Currency Code identifies a medium of exchange which allows for the translation of different-valued denominations of money across the world. Example:  USD = US Dollar  (ISO 4217 format)")
  @NotNull
  @Pattern(regexp = "^[A-Z]{3}$")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.value, price.value) && Objects.equals(this.currency, price.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");

    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
