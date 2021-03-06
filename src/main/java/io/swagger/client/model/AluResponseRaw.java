/**
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
import io.swagger.client.model.WireAccountRaw;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * AluResponseRaw
 */

public class AluResponseRaw   {
  @SerializedName("REFNO")
  private String REFNO = null;

  @SerializedName("ALIAS")
  private String ALIAS = null;

  /**
   * Possible values  * SUCCESS - If the payment was authorized. In this case also REFNO is returned (see response sample)  * FAILED - If the payment could NOT be authorized for various reasons (fraud, insufficient funds etc.). In this case a REFNO is returned, but the payment is Pending (see response sample)  * INPUT_ERROR - If the payment request has erroneous or missing required parameters (see response sample) 
   */
  public enum STATUSEnum {
    @SerializedName("SUCCESS")
    SUCCESS("SUCCESS"),
    
    @SerializedName("FAILED")
    FAILED("FAILED"),
    
    @SerializedName("INPUT_ERROR")
    INPUT_ERROR("INPUT_ERROR");

    private String value;

    STATUSEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("STATUS")
  private STATUSEnum STATUS = null;

  /**
   * Gets or Sets RETURN_CODE
   */
  public enum RETURNCODEEnum {
    @SerializedName("AUTHORIZED")
    AUTHORIZED("AUTHORIZED"),
    
    @SerializedName("3DS_ENROLLED")
    _3DS_ENROLLED("3DS_ENROLLED"),
    
    @SerializedName("ALREADY_AUTHORIZED")
    ALREADY_AUTHORIZED("ALREADY_AUTHORIZED"),
    
    @SerializedName("AUTHORIZATION_FAILED")
    AUTHORIZATION_FAILED("AUTHORIZATION_FAILED"),
    
    @SerializedName("INVALID_CUSTOMER_INFO")
    INVALID_CUSTOMER_INFO("INVALID_CUSTOMER_INFO"),
    
    @SerializedName("INVALID_PAYMENT_INFO")
    INVALID_PAYMENT_INFO("INVALID_PAYMENT_INFO"),
    
    @SerializedName("INVALID_ACCOUNT")
    INVALID_ACCOUNT("INVALID_ACCOUNT"),
    
    @SerializedName("INVALID_PAYMENT_METHOD_CODE")
    INVALID_PAYMENT_METHOD_CODE("INVALID_PAYMENT_METHOD_CODE"),
    
    @SerializedName("INVALID_CURRENCY")
    INVALID_CURRENCY("INVALID_CURRENCY"),
    
    @SerializedName("REQUEST_EXPIRED")
    REQUEST_EXPIRED("REQUEST_EXPIRED"),
    
    @SerializedName("HASH_MISMATCH")
    HASH_MISMATCH("HASH_MISMATCH"),
    
    @SerializedName("WRONG_VERSION")
    WRONG_VERSION("WRONG_VERSION"),
    
    @SerializedName("INVALID_CC_TOKEN")
    INVALID_CC_TOKEN("INVALID_CC_TOKEN"),
    
    @SerializedName("INSTALLMENTS_LOYALTY_POINTS_INCOMPATIBLE")
    INSTALLMENTS_LOYALTY_POINTS_INCOMPATIBLE("INSTALLMENTS_LOYALTY_POINTS_INCOMPATIBLE");

    private String value;

    RETURNCODEEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("RETURN_CODE")
  private RETURNCODEEnum RETURN_CODE = null;

  @SerializedName("RETURN_MESSAGE")
  private String RETURN_MESSAGE = null;

  @SerializedName("DATE")
  private DateTime DATE = null;

  @SerializedName("URL_3DS")
  private String uRL3DS = null;

  @SerializedName("AMOUNT")
  private String AMOUNT = null;

  @SerializedName("CURRENCY")
  private String CURRENCY = null;

  @SerializedName("INSTALLMENTS_NO")
  private String INSTALLMENTS_NO = null;

  @SerializedName("CARD_PROGRAM_NAME")
  private String CARD_PROGRAM_NAME = null;

  @SerializedName("ORDER_REF")
  private String ORDER_REF = null;

  @SerializedName("AUTH_CODE")
  private String AUTH_CODE = null;

  @SerializedName("RRN")
  private String RRN = null;

  @SerializedName("WIRE_ACCOUNTS")
  private List<WireAccountRaw> WIRE_ACCOUNTS = new ArrayList<WireAccountRaw>();

  @SerializedName("HASH")
  private String HASH = null;

  @SerializedName("TOKEN_HASH")
  private String TOKEN_HASH = null;

  @SerializedName("TX_REFNO")
  private String TX_REFNO = null;

  @SerializedName("URL_REDIRECT")
  private String URL_REDIRECT = null;

  public AluResponseRaw REFNO(String REFNO) {
    this.REFNO = REFNO;
    return this;
  }

   /**
   * Global PayU reference number for the order.  This is unique across all requests. If any of the required parameters  is missing, this will be empty! 
   * @return REFNO
  **/
  @ApiModelProperty(example = "null", value = "Global PayU reference number for the order.  This is unique across all requests. If any of the required parameters  is missing, this will be empty! ")
  public String getREFNO() {
    return REFNO;
  }

  public void setREFNO(String REFNO) {
    this.REFNO = REFNO;
  }

  public AluResponseRaw ALIAS(String ALIAS) {
    this.ALIAS = ALIAS;
    return this;
  }

   /**
   * Unique string representation of the transaction that  can be used by the Merchant in his backend. 
   * @return ALIAS
  **/
  @ApiModelProperty(example = "null", value = "Unique string representation of the transaction that  can be used by the Merchant in his backend. ")
  public String getALIAS() {
    return ALIAS;
  }

  public void setALIAS(String ALIAS) {
    this.ALIAS = ALIAS;
  }

  public AluResponseRaw STATUS(STATUSEnum STATUS) {
    this.STATUS = STATUS;
    return this;
  }

   /**
   * Possible values  * SUCCESS - If the payment was authorized. In this case also REFNO is returned (see response sample)  * FAILED - If the payment could NOT be authorized for various reasons (fraud, insufficient funds etc.). In this case a REFNO is returned, but the payment is Pending (see response sample)  * INPUT_ERROR - If the payment request has erroneous or missing required parameters (see response sample) 
   * @return STATUS
  **/
  @ApiModelProperty(example = "null", value = "Possible values  * SUCCESS - If the payment was authorized. In this case also REFNO is returned (see response sample)  * FAILED - If the payment could NOT be authorized for various reasons (fraud, insufficient funds etc.). In this case a REFNO is returned, but the payment is Pending (see response sample)  * INPUT_ERROR - If the payment request has erroneous or missing required parameters (see response sample) ")
  public STATUSEnum getSTATUS() {
    return STATUS;
  }

  public void setSTATUS(STATUSEnum STATUS) {
    this.STATUS = STATUS;
  }

  public AluResponseRaw RETURN_CODE(RETURNCODEEnum RETURN_CODE) {
    this.RETURN_CODE = RETURN_CODE;
    return this;
  }

   /**
   * Get RETURN_CODE
   * @return RETURN_CODE
  **/
  @ApiModelProperty(example = "null", value = "")
  public RETURNCODEEnum getRETURNCODE() {
    return RETURN_CODE;
  }

  public void setRETURNCODE(RETURNCODEEnum RETURN_CODE) {
    this.RETURN_CODE = RETURN_CODE;
  }

  public AluResponseRaw RETURN_MESSAGE(String RETURN_MESSAGE) {
    this.RETURN_MESSAGE = RETURN_MESSAGE;
    return this;
  }

   /**
   * A more detailed description of the response code
   * @return RETURN_MESSAGE
  **/
  @ApiModelProperty(example = "null", value = "A more detailed description of the response code")
  public String getRETURNMESSAGE() {
    return RETURN_MESSAGE;
  }

  public void setRETURNMESSAGE(String RETURN_MESSAGE) {
    this.RETURN_MESSAGE = RETURN_MESSAGE;
  }

  public AluResponseRaw DATE(DateTime DATE) {
    this.DATE = DATE;
    return this;
  }

   /**
   * Date of the response in UTC format
   * @return DATE
  **/
  @ApiModelProperty(example = "null", value = "Date of the response in UTC format")
  public DateTime getDATE() {
    return DATE;
  }

  public void setDATE(DateTime DATE) {
    this.DATE = DATE;
  }

  public AluResponseRaw uRL3DS(String uRL3DS) {
    this.uRL3DS = uRL3DS;
    return this;
  }

   /**
   * In case that the credit card is enrolled in 3D Secure system, this parameter will contain an URL where the Merchant should redirect the browser of the Shopper (see response sample).
   * @return uRL3DS
  **/
  @ApiModelProperty(example = "null", value = "In case that the credit card is enrolled in 3D Secure system, this parameter will contain an URL where the Merchant should redirect the browser of the Shopper (see response sample).")
  public String getURL3DS() {
    return uRL3DS;
  }

  public void setURL3DS(String uRL3DS) {
    this.uRL3DS = uRL3DS;
  }

  public AluResponseRaw AMOUNT(String AMOUNT) {
    this.AMOUNT = AMOUNT;
    return this;
  }

   /**
   * Total transacted amount
   * @return AMOUNT
  **/
  @ApiModelProperty(example = "null", value = "Total transacted amount")
  public String getAMOUNT() {
    return AMOUNT;
  }

  public void setAMOUNT(String AMOUNT) {
    this.AMOUNT = AMOUNT;
  }

  public AluResponseRaw CURRENCY(String CURRENCY) {
    this.CURRENCY = CURRENCY;
    return this;
  }

   /**
   * The currency in which the order has been processed
   * @return CURRENCY
  **/
  @ApiModelProperty(example = "null", value = "The currency in which the order has been processed")
  public String getCURRENCY() {
    return CURRENCY;
  }

  public void setCURRENCY(String CURRENCY) {
    this.CURRENCY = CURRENCY;
  }

  public AluResponseRaw INSTALLMENTS_NO(String INSTALLMENTS_NO) {
    this.INSTALLMENTS_NO = INSTALLMENTS_NO;
    return this;
  }

   /**
   * The number of installments
   * @return INSTALLMENTS_NO
  **/
  @ApiModelProperty(example = "null", value = "The number of installments")
  public String getINSTALLMENTSNO() {
    return INSTALLMENTS_NO;
  }

  public void setINSTALLMENTSNO(String INSTALLMENTS_NO) {
    this.INSTALLMENTS_NO = INSTALLMENTS_NO;
  }

  public AluResponseRaw CARD_PROGRAM_NAME(String CARD_PROGRAM_NAME) {
    this.CARD_PROGRAM_NAME = CARD_PROGRAM_NAME;
    return this;
  }

   /**
   * The name of card program used for paying the order
   * @return CARD_PROGRAM_NAME
  **/
  @ApiModelProperty(example = "null", value = "The name of card program used for paying the order")
  public String getCARDPROGRAMNAME() {
    return CARD_PROGRAM_NAME;
  }

  public void setCARDPROGRAMNAME(String CARD_PROGRAM_NAME) {
    this.CARD_PROGRAM_NAME = CARD_PROGRAM_NAME;
  }

  public AluResponseRaw ORDER_REF(String ORDER_REF) {
    this.ORDER_REF = ORDER_REF;
    return this;
  }

   /**
   * Order external reference number in Merchant's system
   * @return ORDER_REF
  **/
  @ApiModelProperty(example = "null", value = "Order external reference number in Merchant's system")
  public String getORDERREF() {
    return ORDER_REF;
  }

  public void setORDERREF(String ORDER_REF) {
    this.ORDER_REF = ORDER_REF;
  }

  public AluResponseRaw AUTH_CODE(String AUTH_CODE) {
    this.AUTH_CODE = AUTH_CODE;
    return this;
  }

   /**
   * Bank authorization code
   * @return AUTH_CODE
  **/
  @ApiModelProperty(example = "null", value = "Bank authorization code")
  public String getAUTHCODE() {
    return AUTH_CODE;
  }

  public void setAUTHCODE(String AUTH_CODE) {
    this.AUTH_CODE = AUTH_CODE;
  }

  public AluResponseRaw RRN(String RRN) {
    this.RRN = RRN;
    return this;
  }

   /**
   * Retrieval reference number
   * @return RRN
  **/
  @ApiModelProperty(example = "null", value = "Retrieval reference number")
  public String getRRN() {
    return RRN;
  }

  public void setRRN(String RRN) {
    this.RRN = RRN;
  }

  public AluResponseRaw WIRE_ACCOUNTS(List<WireAccountRaw> WIRE_ACCOUNTS) {
    this.WIRE_ACCOUNTS = WIRE_ACCOUNTS;
    return this;
  }

  public AluResponseRaw addWIREACCOUNTSItem(WireAccountRaw WIRE_ACCOUNTSItem) {
    this.WIRE_ACCOUNTS.add(WIRE_ACCOUNTSItem);
    return this;
  }

   /**
   * Contains an array of bank accounts used for paying in WIRE method. In case of other payment methods the node will be missing. 
   * @return WIRE_ACCOUNTS
  **/
  @ApiModelProperty(example = "null", value = "Contains an array of bank accounts used for paying in WIRE method. In case of other payment methods the node will be missing. ")
  public List<WireAccountRaw> getWIREACCOUNTS() {
    return WIRE_ACCOUNTS;
  }

  public void setWIREACCOUNTS(List<WireAccountRaw> WIRE_ACCOUNTS) {
    this.WIRE_ACCOUNTS = WIRE_ACCOUNTS;
  }

  public AluResponseRaw HASH(String HASH) {
    this.HASH = HASH;
    return this;
  }

   /**
   * Signature applied for the all elements from the request using  the same algorithm as the signature from the initial request.  Parameters must be concatenated in the order presented above.  URL_3DS is not included in the signature. If the signature is NOT correct you'll get a HASH_MISMATCH error  and the HASH tag will be empty. 
   * @return HASH
  **/
  @ApiModelProperty(example = "null", value = "Signature applied for the all elements from the request using  the same algorithm as the signature from the initial request.  Parameters must be concatenated in the order presented above.  URL_3DS is not included in the signature. If the signature is NOT correct you'll get a HASH_MISMATCH error  and the HASH tag will be empty. ")
  public String getHASH() {
    return HASH;
  }

  public void setHASH(String HASH) {
    this.HASH = HASH;
  }

  public AluResponseRaw TOKEN_HASH(String TOKEN_HASH) {
    this.TOKEN_HASH = TOKEN_HASH;
    return this;
  }

   /**
   * Displayed only if token payments are enabled for this order.   See **Enable Token Payments**  Represents the hash string for the generated token. It can be used by specifying this hash string in the CC_TOKEN field  for OneClick payments. 
   * @return TOKEN_HASH
  **/
  @ApiModelProperty(example = "null", value = "Displayed only if token payments are enabled for this order.   See **Enable Token Payments**  Represents the hash string for the generated token. It can be used by specifying this hash string in the CC_TOKEN field  for OneClick payments. ")
  public String getTOKENHASH() {
    return TOKEN_HASH;
  }

  public void setTOKENHASH(String TOKEN_HASH) {
    this.TOKEN_HASH = TOKEN_HASH;
  }

  public AluResponseRaw TX_REFNO(String TX_REFNO) {
    this.TX_REFNO = TX_REFNO;
    return this;
  }

   /**
   * *[Offline payment methods only]* The acquirer reference number for  the generated transaction. If any error occurs during transaction or the  transfer is rejected, this response element will be empty or missing. 
   * @return TX_REFNO
  **/
  @ApiModelProperty(example = "null", value = "*[Offline payment methods only]* The acquirer reference number for  the generated transaction. If any error occurs during transaction or the  transfer is rejected, this response element will be empty or missing. ")
  public String getTXREFNO() {
    return TX_REFNO;
  }

  public void setTXREFNO(String TX_REFNO) {
    this.TX_REFNO = TX_REFNO;
  }

  public AluResponseRaw URL_REDIRECT(String URL_REDIRECT) {
    this.URL_REDIRECT = URL_REDIRECT;
    return this;
  }

   /**
   * [PBL payment methods only] The url to which the merchant  must redirect the user in order to complete the transaction. 
   * @return URL_REDIRECT
  **/
  @ApiModelProperty(example = "null", value = "[PBL payment methods only] The url to which the merchant  must redirect the user in order to complete the transaction. ")
  public String getURLREDIRECT() {
    return URL_REDIRECT;
  }

  public void setURLREDIRECT(String URL_REDIRECT) {
    this.URL_REDIRECT = URL_REDIRECT;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AluResponseRaw aluResponseRaw = (AluResponseRaw) o;
    return Objects.equals(this.REFNO, aluResponseRaw.REFNO) &&
        Objects.equals(this.ALIAS, aluResponseRaw.ALIAS) &&
        Objects.equals(this.STATUS, aluResponseRaw.STATUS) &&
        Objects.equals(this.RETURN_CODE, aluResponseRaw.RETURN_CODE) &&
        Objects.equals(this.RETURN_MESSAGE, aluResponseRaw.RETURN_MESSAGE) &&
        Objects.equals(this.DATE, aluResponseRaw.DATE) &&
        Objects.equals(this.uRL3DS, aluResponseRaw.uRL3DS) &&
        Objects.equals(this.AMOUNT, aluResponseRaw.AMOUNT) &&
        Objects.equals(this.CURRENCY, aluResponseRaw.CURRENCY) &&
        Objects.equals(this.INSTALLMENTS_NO, aluResponseRaw.INSTALLMENTS_NO) &&
        Objects.equals(this.CARD_PROGRAM_NAME, aluResponseRaw.CARD_PROGRAM_NAME) &&
        Objects.equals(this.ORDER_REF, aluResponseRaw.ORDER_REF) &&
        Objects.equals(this.AUTH_CODE, aluResponseRaw.AUTH_CODE) &&
        Objects.equals(this.RRN, aluResponseRaw.RRN) &&
        Objects.equals(this.WIRE_ACCOUNTS, aluResponseRaw.WIRE_ACCOUNTS) &&
        Objects.equals(this.HASH, aluResponseRaw.HASH) &&
        Objects.equals(this.TOKEN_HASH, aluResponseRaw.TOKEN_HASH) &&
        Objects.equals(this.TX_REFNO, aluResponseRaw.TX_REFNO) &&
        Objects.equals(this.URL_REDIRECT, aluResponseRaw.URL_REDIRECT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(REFNO, ALIAS, STATUS, RETURN_CODE, RETURN_MESSAGE, DATE, uRL3DS, AMOUNT, CURRENCY, INSTALLMENTS_NO, CARD_PROGRAM_NAME, ORDER_REF, AUTH_CODE, RRN, WIRE_ACCOUNTS, HASH, TOKEN_HASH, TX_REFNO, URL_REDIRECT);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AluResponseRaw {\n");
    
    sb.append("    REFNO: ").append(toIndentedString(REFNO)).append("\n");
    sb.append("    ALIAS: ").append(toIndentedString(ALIAS)).append("\n");
    sb.append("    STATUS: ").append(toIndentedString(STATUS)).append("\n");
    sb.append("    RETURN_CODE: ").append(toIndentedString(RETURN_CODE)).append("\n");
    sb.append("    RETURN_MESSAGE: ").append(toIndentedString(RETURN_MESSAGE)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("    uRL3DS: ").append(toIndentedString(uRL3DS)).append("\n");
    sb.append("    AMOUNT: ").append(toIndentedString(AMOUNT)).append("\n");
    sb.append("    CURRENCY: ").append(toIndentedString(CURRENCY)).append("\n");
    sb.append("    INSTALLMENTS_NO: ").append(toIndentedString(INSTALLMENTS_NO)).append("\n");
    sb.append("    CARD_PROGRAM_NAME: ").append(toIndentedString(CARD_PROGRAM_NAME)).append("\n");
    sb.append("    ORDER_REF: ").append(toIndentedString(ORDER_REF)).append("\n");
    sb.append("    AUTH_CODE: ").append(toIndentedString(AUTH_CODE)).append("\n");
    sb.append("    RRN: ").append(toIndentedString(RRN)).append("\n");
    sb.append("    WIRE_ACCOUNTS: ").append(toIndentedString(WIRE_ACCOUNTS)).append("\n");
    sb.append("    HASH: ").append(toIndentedString(HASH)).append("\n");
    sb.append("    TOKEN_HASH: ").append(toIndentedString(TOKEN_HASH)).append("\n");
    sb.append("    TX_REFNO: ").append(toIndentedString(TX_REFNO)).append("\n");
    sb.append("    URL_REDIRECT: ").append(toIndentedString(URL_REDIRECT)).append("\n");
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

