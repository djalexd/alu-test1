/*
 * Gecad ePayment API
 * Move your app forward with the Uber API
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WireAccount
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-20T17:53:39.583+02:00")
public class WireAccount {
  @SerializedName("bankIdentifier")
  private String bankIdentifier = null;

  @SerializedName("bankAccount")
  private String bankAccount = null;

  @SerializedName("bankRoutingNumber")
  private String bankRoutingNumber = null;

  @SerializedName("iban")
  private String iban = null;

  @SerializedName("swift")
  private String swift = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("recipientName")
  private String recipientName = null;

  @SerializedName("recipientVatId")
  private String recipientVatId = null;

  public WireAccount bankIdentifier(String bankIdentifier) {
    this.bankIdentifier = bankIdentifier;
    return this;
  }

   /**
   * Bank identifier
   * @return bankIdentifier
  **/
  @ApiModelProperty(example = "null", value = "Bank identifier")
  public String getBankIdentifier() {
    return bankIdentifier;
  }

  public void setBankIdentifier(String bankIdentifier) {
    this.bankIdentifier = bankIdentifier;
  }

  public WireAccount bankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Bank account
   * @return bankAccount
  **/
  @ApiModelProperty(example = "null", value = "Bank account")
  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public WireAccount bankRoutingNumber(String bankRoutingNumber) {
    this.bankRoutingNumber = bankRoutingNumber;
    return this;
  }

   /**
   * Bank routing number
   * @return bankRoutingNumber
  **/
  @ApiModelProperty(example = "null", value = "Bank routing number")
  public String getBankRoutingNumber() {
    return bankRoutingNumber;
  }

  public void setBankRoutingNumber(String bankRoutingNumber) {
    this.bankRoutingNumber = bankRoutingNumber;
  }

  public WireAccount iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * IBAN account
   * @return iban
  **/
  @ApiModelProperty(example = "null", value = "IBAN account")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public WireAccount swift(String swift) {
    this.swift = swift;
    return this;
  }

   /**
   * Bank swift
   * @return swift
  **/
  @ApiModelProperty(example = "null", value = "Bank swift")
  public String getSwift() {
    return swift;
  }

  public void setSwift(String swift) {
    this.swift = swift;
  }

  public WireAccount country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public WireAccount recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

   /**
   * Wire payment Recipient name
   * @return recipientName
  **/
  @ApiModelProperty(example = "null", value = "Wire payment Recipient name")
  public String getRecipientName() {
    return recipientName;
  }

  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }

  public WireAccount recipientVatId(String recipientVatId) {
    this.recipientVatId = recipientVatId;
    return this;
  }

   /**
   * Wire payment recipient VAT id
   * @return recipientVatId
  **/
  @ApiModelProperty(example = "null", value = "Wire payment recipient VAT id")
  public String getRecipientVatId() {
    return recipientVatId;
  }

  public void setRecipientVatId(String recipientVatId) {
    this.recipientVatId = recipientVatId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WireAccount wireAccount = (WireAccount) o;
    return Objects.equals(this.bankIdentifier, wireAccount.bankIdentifier) &&
        Objects.equals(this.bankAccount, wireAccount.bankAccount) &&
        Objects.equals(this.bankRoutingNumber, wireAccount.bankRoutingNumber) &&
        Objects.equals(this.iban, wireAccount.iban) &&
        Objects.equals(this.swift, wireAccount.swift) &&
        Objects.equals(this.country, wireAccount.country) &&
        Objects.equals(this.recipientName, wireAccount.recipientName) &&
        Objects.equals(this.recipientVatId, wireAccount.recipientVatId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankIdentifier, bankAccount, bankRoutingNumber, iban, swift, country, recipientName, recipientVatId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireAccount {\n");
    
    sb.append("    bankIdentifier: ").append(toIndentedString(bankIdentifier)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankRoutingNumber: ").append(toIndentedString(bankRoutingNumber)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    swift: ").append(toIndentedString(swift)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    recipientVatId: ").append(toIndentedString(recipientVatId)).append("\n");
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

