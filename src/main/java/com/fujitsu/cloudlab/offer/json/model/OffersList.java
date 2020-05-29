package com.fujitsu.cloudlab.offer.json.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fujitsu.cloudlab.offer.json.model.Offer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OffersList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-29T10:52:59.498-05:00")

public class OffersList implements Serializable{
  @JsonProperty("offers")
  @Valid
  private List<Offer> offers = null;

  public OffersList offers(List<Offer> offers) {
    this.offers = offers;
    return this;
  }

  public OffersList addOffersItem(Offer offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<Offer>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Offers is list of offers
   * @return offers
  **/
  @ApiModelProperty(value = "Offers is list of offers")

  @Valid

  public List<Offer> getOffers() {
    return offers;
  }

  public void setOffers(List<Offer> offers) {
    this.offers = offers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffersList offersList = (OffersList) o;
    return Objects.equals(this.offers, offersList.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffersList {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

