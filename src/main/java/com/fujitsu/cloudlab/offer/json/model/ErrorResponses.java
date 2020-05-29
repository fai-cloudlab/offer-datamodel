package com.fujitsu.cloudlab.offer.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Technical details about the error including error code, message and additional details, if any
 */
@ApiModel(
    description =
        "Technical details about the error including error code, message and additional details, if any")
@Validated
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.SpringCodegen",
    date = "2020-05-29T10:52:59.498-05:00")
public class ErrorResponses implements Serializable {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("developerMessage")
  private String developerMessage = null;

  public ErrorResponses code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Highest level error code sent by API.
   *
   * @return code
   */
  @ApiModelProperty(value = "Highest level error code sent by API.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorResponses message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Consumer friendly error message sent by API.
   *
   * @return message
   */
  @ApiModelProperty(value = "Consumer friendly error message sent by API.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorResponses developerMessage(String developerMessage) {
    this.developerMessage = developerMessage;
    return this;
  }

  /**
   * Technical details about the error for the understanding of API consumer developer.
   *
   * @return developerMessage
   */
  @ApiModelProperty(
      value = "Technical details about the error for the understanding of API consumer developer.")
  public String getDeveloperMessage() {
    return developerMessage;
  }

  public void setDeveloperMessage(String developerMessage) {
    this.developerMessage = developerMessage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponses errorResponses = (ErrorResponses) o;
    return Objects.equals(this.code, errorResponses.code)
        && Objects.equals(this.message, errorResponses.message)
        && Objects.equals(this.developerMessage, errorResponses.developerMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, developerMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponses {\n");

    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    developerMessage: ").append(toIndentedString(developerMessage)).append("\n");
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
