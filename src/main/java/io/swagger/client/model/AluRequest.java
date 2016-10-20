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
import io.swagger.client.model.AluPaymentOption;
import io.swagger.client.model.Billing;
import io.swagger.client.model.Delivery;
import io.swagger.client.model.Merchant;
import io.swagger.client.model.OrderItem;
import io.swagger.client.model.Shipping;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 2.0 model version for ALU entities
 */
@ApiModel(description = "2.0 model version for ALU entities")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-20T17:53:39.583+02:00")
public class AluRequest {
  @SerializedName("merchant")
  private Merchant merchant = null;

  @SerializedName("orderRef")
  private String orderRef = null;

  @SerializedName("orderDate")
  private DateTime orderDate = null;

  @SerializedName("orderTimeout")
  private Integer orderTimeout = null;

  @SerializedName("clientIp")
  private String clientIp = "127.0.0.1";

  @SerializedName("clientTime")
  private String clientTime = null;

  @SerializedName("posCode")
  private String posCode = null;

  /**
   * Payment method for the order. Possible values: CCVISAMC -  Visa/Mastercard credit card (default), WIRE, UPT, BKM, QIWI,  PAYU_CREDIT, QBANK, COMPAY, TINKOFF_LOAN 
   */
  public enum PayMethodEnum {
    @SerializedName("CCVISAMC")
    CCVISAMC("CCVISAMC"),
    
    @SerializedName("WIRE")
    WIRE("WIRE"),
    
    @SerializedName("UPT")
    UPT("UPT"),
    
    @SerializedName("BKM")
    BKM("BKM"),
    
    @SerializedName("QIWI")
    QIWI("QIWI"),
    
    @SerializedName("PAYU_CREDIT")
    PAYU_CREDIT("PAYU_CREDIT"),
    
    @SerializedName("QBANK")
    QBANK("QBANK"),
    
    @SerializedName("COMPAY")
    COMPAY("COMPAY"),
    
    @SerializedName("TINKOFF_LOAN")
    TINKOFF_LOAN("TINKOFF_LOAN");

    private String value;

    PayMethodEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("payMethod")
  private PayMethodEnum payMethod = PayMethodEnum.CCVISAMC;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("continueUri")
  private String continueUri = null;

  @SerializedName("billing")
  private Billing billing = null;

  @SerializedName("delivery")
  private Delivery delivery = null;

  @SerializedName("orderItems")
  private List<OrderItem> orderItems = new ArrayList<OrderItem>();

  @SerializedName("paymentOptions")
  private AluPaymentOption paymentOptions = null;

  @SerializedName("shipping")
  private Shipping shipping = null;

  public AluRequest merchant(Merchant merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @ApiModelProperty(example = "null", value = "")
  public Merchant getMerchant() {
    return merchant;
  }

  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
  }

  public AluRequest orderRef(String orderRef) {
    this.orderRef = orderRef;
    return this;
  }

   /**
   * Order external reference number in Merchant's system 
   * @return orderRef
  **/
  @ApiModelProperty(example = "null", value = "Order external reference number in Merchant's system ")
  public String getOrderRef() {
    return orderRef;
  }

  public void setOrderRef(String orderRef) {
    this.orderRef = orderRef;
  }

  public AluRequest orderDate(DateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * The date when the order is initiated in the system,  in YYYY-MM-DD HH:MM:SS format (e.g.: \"2012-05-01 21:15:45\") Important: Date should be UTC standard +/-10 minutes 
   * @return orderDate
  **/
  @ApiModelProperty(example = "null", value = "The date when the order is initiated in the system,  in YYYY-MM-DD HH:MM:SS format (e.g.: \"2012-05-01 21:15:45\") Important: Date should be UTC standard +/-10 minutes ")
  public DateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(DateTime orderDate) {
    this.orderDate = orderDate;
  }

  public AluRequest orderTimeout(Integer orderTimeout) {
    this.orderTimeout = orderTimeout;
    return this;
  }

   /**
   * The time in seconds after which the order will expire. 
   * @return orderTimeout
  **/
  @ApiModelProperty(example = "null", value = "The time in seconds after which the order will expire. ")
  public Integer getOrderTimeout() {
    return orderTimeout;
  }

  public void setOrderTimeout(Integer orderTimeout) {
    this.orderTimeout = orderTimeout;
  }

  public AluRequest clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

   /**
   * ip address of the shopper
   * @return clientIp
  **/
  @ApiModelProperty(example = "null", value = "ip address of the shopper")
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public AluRequest clientTime(String clientTime) {
    this.clientTime = clientTime;
    return this;
  }

   /**
   * Time collected from the Shopper's browser in YYYY-MM-DD hh:mm;ss format 
   * @return clientTime
  **/
  @ApiModelProperty(example = "null", value = "Time collected from the Shopper's browser in YYYY-MM-DD hh:mm;ss format ")
  public String getClientTime() {
    return clientTime;
  }

  public void setClientTime(String clientTime) {
    this.clientTime = clientTime;
  }

  public AluRequest posCode(String posCode) {
    this.posCode = posCode;
    return this;
  }

   /**
   * Optional field used to define orders made through a specific POS.  Sent value should be previously confirmed with operation team.  
   * @return posCode
  **/
  @ApiModelProperty(example = "null", value = "Optional field used to define orders made through a specific POS.  Sent value should be previously confirmed with operation team.  ")
  public String getPosCode() {
    return posCode;
  }

  public void setPosCode(String posCode) {
    this.posCode = posCode;
  }

  public AluRequest payMethod(PayMethodEnum payMethod) {
    this.payMethod = payMethod;
    return this;
  }

   /**
   * Payment method for the order. Possible values: CCVISAMC -  Visa/Mastercard credit card (default), WIRE, UPT, BKM, QIWI,  PAYU_CREDIT, QBANK, COMPAY, TINKOFF_LOAN 
   * @return payMethod
  **/
  @ApiModelProperty(example = "null", value = "Payment method for the order. Possible values: CCVISAMC -  Visa/Mastercard credit card (default), WIRE, UPT, BKM, QIWI,  PAYU_CREDIT, QBANK, COMPAY, TINKOFF_LOAN ")
  public PayMethodEnum getPayMethod() {
    return payMethod;
  }

  public void setPayMethod(PayMethodEnum payMethod) {
    this.payMethod = payMethod;
  }

  public AluRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency in which the prices are expressed, for example TRY. If the parameter is not specified, the default value is  the default currency of the Merchant. 
   * @return currency
  **/
  @ApiModelProperty(example = "null", value = "The currency in which the prices are expressed, for example TRY. If the parameter is not specified, the default value is  the default currency of the Merchant. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AluRequest continueUri(String continueUri) {
    this.continueUri = continueUri;
    return this;
  }

   /**
   * Return URL on the Merchant webshop side that will be used in case  of 3DS enrolled cards authorizations or for Pay By Link (PBL)  payment methods (such as BKM, QIWI, PayU Credit, QBank, Compay, Tinkoff Loan).             
   * @return continueUri
  **/
  @ApiModelProperty(example = "null", value = "Return URL on the Merchant webshop side that will be used in case  of 3DS enrolled cards authorizations or for Pay By Link (PBL)  payment methods (such as BKM, QIWI, PayU Credit, QBank, Compay, Tinkoff Loan).             ")
  public String getContinueUri() {
    return continueUri;
  }

  public void setContinueUri(String continueUri) {
    this.continueUri = continueUri;
  }

  public AluRequest billing(Billing billing) {
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @ApiModelProperty(example = "null", value = "")
  public Billing getBilling() {
    return billing;
  }

  public void setBilling(Billing billing) {
    this.billing = billing;
  }

  public AluRequest delivery(Delivery delivery) {
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @ApiModelProperty(example = "null", value = "")
  public Delivery getDelivery() {
    return delivery;
  }

  public void setDelivery(Delivery delivery) {
    this.delivery = delivery;
  }

  public AluRequest orderItems(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public AluRequest addOrderItemsItem(OrderItem orderItemsItem) {
    this.orderItems.add(orderItemsItem);
    return this;
  }

   /**
   * Get orderItems
   * @return orderItems
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OrderItem> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }

  public AluRequest paymentOptions(AluPaymentOption paymentOptions) {
    this.paymentOptions = paymentOptions;
    return this;
  }

   /**
   * Get paymentOptions
   * @return paymentOptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public AluPaymentOption getPaymentOptions() {
    return paymentOptions;
  }

  public void setPaymentOptions(AluPaymentOption paymentOptions) {
    this.paymentOptions = paymentOptions;
  }

  public AluRequest shipping(Shipping shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @ApiModelProperty(example = "null", value = "")
  public Shipping getShipping() {
    return shipping;
  }

  public void setShipping(Shipping shipping) {
    this.shipping = shipping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AluRequest aluRequest = (AluRequest) o;
    return Objects.equals(this.merchant, aluRequest.merchant) &&
        Objects.equals(this.orderRef, aluRequest.orderRef) &&
        Objects.equals(this.orderDate, aluRequest.orderDate) &&
        Objects.equals(this.orderTimeout, aluRequest.orderTimeout) &&
        Objects.equals(this.clientIp, aluRequest.clientIp) &&
        Objects.equals(this.clientTime, aluRequest.clientTime) &&
        Objects.equals(this.posCode, aluRequest.posCode) &&
        Objects.equals(this.payMethod, aluRequest.payMethod) &&
        Objects.equals(this.currency, aluRequest.currency) &&
        Objects.equals(this.continueUri, aluRequest.continueUri) &&
        Objects.equals(this.billing, aluRequest.billing) &&
        Objects.equals(this.delivery, aluRequest.delivery) &&
        Objects.equals(this.orderItems, aluRequest.orderItems) &&
        Objects.equals(this.paymentOptions, aluRequest.paymentOptions) &&
        Objects.equals(this.shipping, aluRequest.shipping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, orderRef, orderDate, orderTimeout, clientIp, clientTime, posCode, payMethod, currency, continueUri, billing, delivery, orderItems, paymentOptions, shipping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AluRequest {\n");
    
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    orderRef: ").append(toIndentedString(orderRef)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    orderTimeout: ").append(toIndentedString(orderTimeout)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    clientTime: ").append(toIndentedString(clientTime)).append("\n");
    sb.append("    posCode: ").append(toIndentedString(posCode)).append("\n");
    sb.append("    payMethod: ").append(toIndentedString(payMethod)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    continueUri: ").append(toIndentedString(continueUri)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    paymentOptions: ").append(toIndentedString(paymentOptions)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
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

