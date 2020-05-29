package com.fujitsu.cloudlab.offer.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/** Customer details */
@ApiModel(description = "Customer details")
@Validated
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.SpringCodegen",
    date = "2020-05-29T10:52:59.498-05:00")
public class Customer implements Serializable {
  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("billingAddress")
  private String billingAddress = null;

  @JsonProperty("phone")
  private String phone = null;

  public Customer customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Customer Identifier represents a person or organization that initiates contact with a company
   * or responds to a company initiation of contact.
   *
   * @return customerId
   */
  @ApiModelProperty(
      value =
          "Customer Identifier represents a person or organization that initiates contact with a company or responds to a company initiation of contact.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Customer emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Electronic Mail (Email) Address specifies a character string which, when input within a
   * particular context, will direct information to a resource available to a specific owner.
   *
   * @return emailAddress
   */
  @ApiModelProperty(
      value =
          "Electronic Mail (Email) Address specifies a character string which, when input within a particular context, will direct information to a resource available to a specific owner.  ")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First Name of the customer
   *
   * @return firstName
   */
  @ApiModelProperty(value = "First Name of the customer")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last Name of the customer
   *
   * @return lastName
   */
  @ApiModelProperty(value = "Last Name of the customer")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer billingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Billing address of the customer
   *
   * @return billingAddress
   */
  @ApiModelProperty(value = "Billing address of the customer")
  public String getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }

  public Customer phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the customer.
   *
   * @return phone
   */
  @ApiModelProperty(value = "Phone number of the customer.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerId, customer.customerId)
        && Objects.equals(this.emailAddress, customer.emailAddress)
        && Objects.equals(this.firstName, customer.firstName)
        && Objects.equals(this.lastName, customer.lastName)
        && Objects.equals(this.billingAddress, customer.billingAddress)
        && Objects.equals(this.phone, customer.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, emailAddress, firstName, lastName, billingAddress, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");

    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
