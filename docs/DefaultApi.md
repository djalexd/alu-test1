# DefaultApi

All URIs are relative to *https://secure.payu.com.tr/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrder**](DefaultApi.md#createOrder) | **POST** /order/alu/v3 | Create a new order via ALU v3


<a name="createOrder"></a>
# **createOrder**
> AluResponseRaw createOrder(MERCHANT, ORDER_REF, ORDER_DATE, PAY_METHOD, BACK_REF, ORDER_HASH, BILL_LNAME, BILL_FNAME, BILL_EMAIL, BILL_PHONE, BILL_COUNTRYCODE, BILL_CITYPE, BILL_CINUMBER, CC_NUMBER, EXP_MONTH, EXP_YEAR, CC_CVV, CC_OWNER, CC_TOKEN, oRDERPINFO0, oRDERVER0, SELECTED_INSTALLMENTS_NUMBER, CARD_PROGRAM_NAME, ORDER_TIMEOUT, USE_LOYALTY_POINTS, LOYALTY_POINTS_AMOUNT, CAMPAIGN_TYPE, ORDER_SHIPPING, POS_CODE, BILL_FAX, BILL_ADDRESS, bILLADDRESS2, BILL_ZIPCODE, BILL_CITY, BILL_STATE, DELIVERY_LNAME, DELIVERY_FNAME, DELIVERY_EMAIL, DELIVERY_PHONE, DELIVERY_COMPANY, DELIVERY_ADDRESS, dELIVERYADDRESS2, DELIVERY_ZIPCODE, DELIVERY_CITY, DELIVERY_STATE, DELIVERY_COUNTRYCODE, LU_ENABLE_TOKEN, LU_TOKEN_TYPE, CC_NUMBER_TIME, CC_OWNER_TIME, CLIENT_IP, CLIENT_TIME, oRDERPNAME0, oRDERPCODE0, oRDERPRICE0, oRDERVAT0, oRDERPRICETYPE0, oRDERQTY0, PRICES_CURRENCY, oRDERPNAME1, oRDERPCODE1, oRDERPRICE1, oRDERVAT1, oRDERPRICETYPE1, oRDERQTY1, oRDERPNAME2, oRDERPCODE2, oRDERPRICE2, oRDERVAT2, oRDERPRICETYPE2, oRDERQTY2, oRDERPNAME3, oRDERPCODE3, oRDERPRICE3, oRDERVAT3, oRDERPRICETYPE3, oRDERQTY3, oRDERPNAME4, oRDERPCODE4, oRDERPRICE4, oRDERVAT4, oRDERPRICETYPE4, oRDERQTY4, oRDERPNAME5, oRDERPCODE5, oRDERPRICE5, oRDERVAT5, oRDERPRICETYPE5, oRDERQTY5)

Create a new order via ALU v3

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String MERCHANT = "MERCHANT_example"; // String | The Merchant's ID, available in Control Panel  (Account Management / Account Settings) 
String ORDER_REF = "ORDER_REF_example"; // String | Order external reference number in Merchant's system 
OffsetDateTime ORDER_DATE = new OffsetDateTime(); // OffsetDateTime | The date when the order is initiated in the system,  in YYYY-MM-DD HH:MM:SS format (e.g.: \"2012-05-01 21:15:45\") Important: Date should be UTC standard +/-10 minutes 
String PAY_METHOD = "CCVISAMC"; // String | Payment method for the order. Possible values: CCVISAMC -  Visa/Mastercard credit card (default), WIRE, UPT, BKM, QIWI,  PAYU_CREDIT, QBANK, COMPAY, TINKOFF_LOAN 
String BACK_REF = "BACK_REF_example"; // String | Return URL on the Merchant webshop side that will be used in case  of 3DS enrolled cards authorizations or for Pay By Link (PBL)  payment methods (such as BKM, QIWI, PayU Credit, QBank, Compay, Tinkoff Loan).             
String ORDER_HASH = "ORDER_HASH_example"; // String | HMAC_MD5 signature applied on all parameters from the request. Source string for HMAC_MD5 will be calculated by adding  the length of each field value at the beginning of field value.   A common key shared between PayU and the merchant is used  for the signature. Find more details on how is HASH generated here. 
String BILL_LNAME = "BILL_LNAME_example"; // String | Shopper's last name 
String BILL_FNAME = "BILL_FNAME_example"; // String | Shopper's first name 
String BILL_EMAIL = "BILL_EMAIL_example"; // String | Email address of the Shopper
String BILL_PHONE = "BILL_PHONE_example"; // String | Shopper's phone number 
String BILL_COUNTRYCODE = "BILL_COUNTRYCODE_example"; // String | Shopper's country code in two letters, ISO format 
String BILL_CITYPE = "BILL_CITYPE_example"; // String | Shopper's ID type - mandatory for UPT. Accepted values:  * PERSONALID (identity card),  * PASSPORT (passport),  * DRVLICENSE (driving license) 
String BILL_CINUMBER = "BILL_CINUMBER_example"; // String | Shopper's ID number (for the specified ID type)   
String CC_NUMBER = "CC_NUMBER_example"; // String | The card number on which the order authorization will be made. 
String EXP_MONTH = "EXP_MONTH_example"; // String | The month in which the card used expires 
String EXP_YEAR = "EXP_YEAR_example"; // String | The year in which the card used expires 
String CC_CVV = "CC_CVV_example"; // String | The CCV/CVV2 code for the card. For some card types or based on merchant settings  this can be empty, otherwise it should have a numerical value. 
String CC_OWNER = "CC_OWNER_example"; // String | The card owner name, as it appears on the card. 
String CC_TOKEN = "CC_TOKEN_example"; // String | The token provided by Modal Checkout. 
String oRDERPINFO0 = "oRDERPINFO0_example"; // String | First item in the so-called array of additional product info
String oRDERVER0 = "oRDERVER0_example"; // String | First item in the so-called array of product version for all ordered products
BigDecimal SELECTED_INSTALLMENTS_NUMBER = new BigDecimal(); // BigDecimal | The number of installments. It can be an integer between 1 and 12. 
String CARD_PROGRAM_NAME = "CARD_PROGRAM_NAME_example"; // String | The name of card program that allows paying an order using installments. 
String ORDER_TIMEOUT = "ORDER_TIMEOUT_example"; // String | The time in seconds after which the order will expire. 
String USE_LOYALTY_POINTS = "USE_LOYALTY_POINTS_example"; // String | A string with value YES. The order will be paid using loyalty points.  It can be used for one time payments and (only when the LOYALTY_POINTS_AMOUNT  parameter is set and smaller than order total amount) also for installments payments. 
String LOYALTY_POINTS_AMOUNT = "LOYALTY_POINTS_AMOUNT_example"; // String | A positive number indicating the money amount worth of loyalty points to be used  for payment. It can be used only together with USE_LOYALTY_POINTS parameter (set to YES). 
String CAMPAIGN_TYPE = "CAMPAIGN_TYPE_example"; // String | A predefined string value indicating the type of campaign to be used. It can only have  one of the following values: EXTRA_INSTALLMENTS or DELAY_INSTALLMENTS.  For bank terminals supporting both campaign types used at the same time, you can set b oth comma separated values, e.g: EXTRA_INSTALLMENTS,DELAY_INSTALLMENTS.   Must be used only with installments transactions (the SELECTED_INSTALLMENTS_NUMBER parameter  must be greater than or equal to 2). 
String ORDER_SHIPPING = "ORDER_SHIPPING_example"; // String | A positive number indicating the price of shipping.  The currency is set by PRICES_CURRENCY. 
String POS_CODE = "POS_CODE_example"; // String | Optional field used to define orders made through a specific POS.  Sent value should be previously confirmed with operation team. 
String BILL_FAX = "BILL_FAX_example"; // String | Shopper's fax number. 
String BILL_ADDRESS = "BILL_ADDRESS_example"; // String | Shopper's address. 
String bILLADDRESS2 = "bILLADDRESS2_example"; // String | Shopper's address (second line). 
String BILL_ZIPCODE = "BILL_ZIPCODE_example"; // String | Address zip code. 
String BILL_CITY = "BILL_CITY_example"; // String | City. 
String BILL_STATE = "BILL_STATE_example"; // String | State / Dept. 
String DELIVERY_LNAME = "DELIVERY_LNAME_example"; // String | Last name of the person where the order will be delivered 
String DELIVERY_FNAME = "DELIVERY_FNAME_example"; // String | First name of the person where the order will be delivered 
String DELIVERY_EMAIL = "DELIVERY_EMAIL_example"; // String | Email address of the person or company where the order will be delivered 
String DELIVERY_PHONE = "DELIVERY_PHONE_example"; // String | The phone of the person of company where the order will be delivered. 
String DELIVERY_COMPANY = "DELIVERY_COMPANY_example"; // String | Company name where the order will be delivered. 
String DELIVERY_ADDRESS = "DELIVERY_ADDRESS_example"; // String | Order delivery address. 
String dELIVERYADDRESS2 = "dELIVERYADDRESS2_example"; // String | More details on order delivery address. 
String DELIVERY_ZIPCODE = "DELIVERY_ZIPCODE_example"; // String | Order delivery address zip code. 
String DELIVERY_CITY = "DELIVERY_CITY_example"; // String | Order delivery city. 
String DELIVERY_STATE = "DELIVERY_STATE_example"; // String | Order delivery state. 
String DELIVERY_COUNTRYCODE = "DELIVERY_COUNTRYCODE_example"; // String | Delivery country code in two letters ISO format. 
String LU_ENABLE_TOKEN = "LU_ENABLE_TOKEN_example"; // String | Enable Token payments for the order. For the initial transaction, we have this parameter set to 1 
String LU_TOKEN_TYPE = "LU_TOKEN_TYPE_example"; // String | The type of the token. For the initial transaction, we have this parameter set to PAY_BY_CLICK 
String CC_NUMBER_TIME = "CC_NUMBER_TIME_example"; // String | Time spent by user to insert card number 
String CC_OWNER_TIME = "CC_OWNER_TIME_example"; // String | Time spent by user to insert card owner 
String CLIENT_IP = "CLIENT_IP_example"; // String | IP address of the Shopper 
String CLIENT_TIME = "CLIENT_TIME_example"; // String | Time collected from the Shopper's browser in YYYY-MM-DD hh:mm;ss format 
String oRDERPNAME0 = "oRDERPNAME0_example"; // String | Product name
String oRDERPCODE0 = "oRDERPCODE0_example"; // String | Product code. If multiple products are sent (in the same or subsequent transactions) with the same product code, PayU will update the product with  the corresponding ORDER_PCODE[] (overwriting all the other product information - name, price, taxes). 
BigDecimal oRDERPRICE0 = new BigDecimal(); // BigDecimal | Unit price for product. Default currency is set by PRICES_CURRENCY, described below.
BigDecimal oRDERVAT0 = new BigDecimal(); // BigDecimal | VAT value for product
String oRDERPRICETYPE0 = "NET"; // String | Specify if ORDER_PRICE[0] parameter includes VAT or not.  * GROSS (VAT is included)  * NET (VAT will be added by PayU) 
Integer oRDERQTY0 = 56; // Integer | Product quantity
String PRICES_CURRENCY = "PRICES_CURRENCY_example"; // String | The currency in which the prices are expressed, for example TRY If the parameter is not specified, the default value is the default currency of the Merchant. 
String oRDERPNAME1 = "oRDERPNAME1_example"; // String | Product #2 
String oRDERPCODE1 = "oRDERPCODE1_example"; // String | Product #2 
BigDecimal oRDERPRICE1 = new BigDecimal(); // BigDecimal | Product #2 
BigDecimal oRDERVAT1 = new BigDecimal(); // BigDecimal | Product #2 
String oRDERPRICETYPE1 = "NET"; // String | Product #2 
Integer oRDERQTY1 = 56; // Integer | Product #2 
String oRDERPNAME2 = "oRDERPNAME2_example"; // String | Product #3 
String oRDERPCODE2 = "oRDERPCODE2_example"; // String | Product #3 
BigDecimal oRDERPRICE2 = new BigDecimal(); // BigDecimal | Product #3 
BigDecimal oRDERVAT2 = new BigDecimal(); // BigDecimal | Product #3 
String oRDERPRICETYPE2 = "NET"; // String | Product #3 
Integer oRDERQTY2 = 56; // Integer | Product #3 
String oRDERPNAME3 = "oRDERPNAME3_example"; // String | Product #4 
String oRDERPCODE3 = "oRDERPCODE3_example"; // String | Product #4 
BigDecimal oRDERPRICE3 = new BigDecimal(); // BigDecimal | Product #4 
BigDecimal oRDERVAT3 = new BigDecimal(); // BigDecimal | Product #4 
String oRDERPRICETYPE3 = "NET"; // String | Product #4 
Integer oRDERQTY3 = 56; // Integer | Product #4 
String oRDERPNAME4 = "oRDERPNAME4_example"; // String | Product #5 
String oRDERPCODE4 = "oRDERPCODE4_example"; // String | Product #5 
BigDecimal oRDERPRICE4 = new BigDecimal(); // BigDecimal | Product #5 
BigDecimal oRDERVAT4 = new BigDecimal(); // BigDecimal | Product #5 
String oRDERPRICETYPE4 = "NET"; // String | Product #5 
Integer oRDERQTY4 = 56; // Integer | Product #5 
String oRDERPNAME5 = "oRDERPNAME5_example"; // String | Product #6 
String oRDERPCODE5 = "oRDERPCODE5_example"; // String | Product #6 
BigDecimal oRDERPRICE5 = new BigDecimal(); // BigDecimal | Product #6 
BigDecimal oRDERVAT5 = new BigDecimal(); // BigDecimal | Product #6 
String oRDERPRICETYPE5 = "NET"; // String | Product #6 
Integer oRDERQTY5 = 56; // Integer | Product #6 
try {
    AluResponseRaw result = apiInstance.createOrder(MERCHANT, ORDER_REF, ORDER_DATE, PAY_METHOD, BACK_REF, ORDER_HASH, BILL_LNAME, BILL_FNAME, BILL_EMAIL, BILL_PHONE, BILL_COUNTRYCODE, BILL_CITYPE, BILL_CINUMBER, CC_NUMBER, EXP_MONTH, EXP_YEAR, CC_CVV, CC_OWNER, CC_TOKEN, oRDERPINFO0, oRDERVER0, SELECTED_INSTALLMENTS_NUMBER, CARD_PROGRAM_NAME, ORDER_TIMEOUT, USE_LOYALTY_POINTS, LOYALTY_POINTS_AMOUNT, CAMPAIGN_TYPE, ORDER_SHIPPING, POS_CODE, BILL_FAX, BILL_ADDRESS, bILLADDRESS2, BILL_ZIPCODE, BILL_CITY, BILL_STATE, DELIVERY_LNAME, DELIVERY_FNAME, DELIVERY_EMAIL, DELIVERY_PHONE, DELIVERY_COMPANY, DELIVERY_ADDRESS, dELIVERYADDRESS2, DELIVERY_ZIPCODE, DELIVERY_CITY, DELIVERY_STATE, DELIVERY_COUNTRYCODE, LU_ENABLE_TOKEN, LU_TOKEN_TYPE, CC_NUMBER_TIME, CC_OWNER_TIME, CLIENT_IP, CLIENT_TIME, oRDERPNAME0, oRDERPCODE0, oRDERPRICE0, oRDERVAT0, oRDERPRICETYPE0, oRDERQTY0, PRICES_CURRENCY, oRDERPNAME1, oRDERPCODE1, oRDERPRICE1, oRDERVAT1, oRDERPRICETYPE1, oRDERQTY1, oRDERPNAME2, oRDERPCODE2, oRDERPRICE2, oRDERVAT2, oRDERPRICETYPE2, oRDERQTY2, oRDERPNAME3, oRDERPCODE3, oRDERPRICE3, oRDERVAT3, oRDERPRICETYPE3, oRDERQTY3, oRDERPNAME4, oRDERPCODE4, oRDERPRICE4, oRDERVAT4, oRDERPRICETYPE4, oRDERQTY4, oRDERPNAME5, oRDERPCODE5, oRDERPRICE5, oRDERVAT5, oRDERPRICETYPE5, oRDERQTY5);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MERCHANT** | **String**| The Merchant&#39;s ID, available in Control Panel  (Account Management / Account Settings)  |
 **ORDER_REF** | **String**| Order external reference number in Merchant&#39;s system  |
 **ORDER_DATE** | **OffsetDateTime**| The date when the order is initiated in the system,  in YYYY-MM-DD HH:MM:SS format (e.g.: \&quot;2012-05-01 21:15:45\&quot;) Important: Date should be UTC standard +/-10 minutes  |
 **PAY_METHOD** | **String**| Payment method for the order. Possible values: CCVISAMC -  Visa/Mastercard credit card (default), WIRE, UPT, BKM, QIWI,  PAYU_CREDIT, QBANK, COMPAY, TINKOFF_LOAN  | [optional] [default to CCVISAMC]
 **BACK_REF** | **String**| Return URL on the Merchant webshop side that will be used in case  of 3DS enrolled cards authorizations or for Pay By Link (PBL)  payment methods (such as BKM, QIWI, PayU Credit, QBank, Compay, Tinkoff Loan).              | [optional]
 **ORDER_HASH** | **String**| HMAC_MD5 signature applied on all parameters from the request. Source string for HMAC_MD5 will be calculated by adding  the length of each field value at the beginning of field value.   A common key shared between PayU and the merchant is used  for the signature. Find more details on how is HASH generated here.  | [optional]
 **BILL_LNAME** | **String**| Shopper&#39;s last name  |
 **BILL_FNAME** | **String**| Shopper&#39;s first name  |
 **BILL_EMAIL** | **String**| Email address of the Shopper |
 **BILL_PHONE** | **String**| Shopper&#39;s phone number  |
 **BILL_COUNTRYCODE** | **String**| Shopper&#39;s country code in two letters, ISO format  |
 **BILL_CITYPE** | **String**| Shopper&#39;s ID type - mandatory for UPT. Accepted values:  * PERSONALID (identity card),  * PASSPORT (passport),  * DRVLICENSE (driving license)  | [enum: PERSONALID, PASSPORT, DRVLICENSE]
 **BILL_CINUMBER** | **String**| Shopper&#39;s ID number (for the specified ID type)    |
 **CC_NUMBER** | **String**| The card number on which the order authorization will be made.  | [optional]
 **EXP_MONTH** | **String**| The month in which the card used expires  | [optional]
 **EXP_YEAR** | **String**| The year in which the card used expires  | [optional]
 **CC_CVV** | **String**| The CCV/CVV2 code for the card. For some card types or based on merchant settings  this can be empty, otherwise it should have a numerical value.  | [optional]
 **CC_OWNER** | **String**| The card owner name, as it appears on the card.  | [optional]
 **CC_TOKEN** | **String**| The token provided by Modal Checkout.  | [optional]
 **oRDERPINFO0** | **String**| First item in the so-called array of additional product info | [optional]
 **oRDERVER0** | **String**| First item in the so-called array of product version for all ordered products | [optional]
 **SELECTED_INSTALLMENTS_NUMBER** | **BigDecimal**| The number of installments. It can be an integer between 1 and 12.  | [optional]
 **CARD_PROGRAM_NAME** | **String**| The name of card program that allows paying an order using installments.  | [optional]
 **ORDER_TIMEOUT** | **String**| The time in seconds after which the order will expire.  | [optional]
 **USE_LOYALTY_POINTS** | **String**| A string with value YES. The order will be paid using loyalty points.  It can be used for one time payments and (only when the LOYALTY_POINTS_AMOUNT  parameter is set and smaller than order total amount) also for installments payments.  | [optional]
 **LOYALTY_POINTS_AMOUNT** | **String**| A positive number indicating the money amount worth of loyalty points to be used  for payment. It can be used only together with USE_LOYALTY_POINTS parameter (set to YES).  | [optional]
 **CAMPAIGN_TYPE** | **String**| A predefined string value indicating the type of campaign to be used. It can only have  one of the following values: EXTRA_INSTALLMENTS or DELAY_INSTALLMENTS.  For bank terminals supporting both campaign types used at the same time, you can set b oth comma separated values, e.g: EXTRA_INSTALLMENTS,DELAY_INSTALLMENTS.   Must be used only with installments transactions (the SELECTED_INSTALLMENTS_NUMBER parameter  must be greater than or equal to 2).  | [optional]
 **ORDER_SHIPPING** | **String**| A positive number indicating the price of shipping.  The currency is set by PRICES_CURRENCY.  | [optional]
 **POS_CODE** | **String**| Optional field used to define orders made through a specific POS.  Sent value should be previously confirmed with operation team.  | [optional]
 **BILL_FAX** | **String**| Shopper&#39;s fax number.  | [optional]
 **BILL_ADDRESS** | **String**| Shopper&#39;s address.  |
 **bILLADDRESS2** | **String**| Shopper&#39;s address (second line).  | [optional]
 **BILL_ZIPCODE** | **String**| Address zip code.  |
 **BILL_CITY** | **String**| City.  |
 **BILL_STATE** | **String**| State / Dept.  | [optional]
 **DELIVERY_LNAME** | **String**| Last name of the person where the order will be delivered  |
 **DELIVERY_FNAME** | **String**| First name of the person where the order will be delivered  |
 **DELIVERY_EMAIL** | **String**| Email address of the person or company where the order will be delivered  | [optional]
 **DELIVERY_PHONE** | **String**| The phone of the person of company where the order will be delivered.  |
 **DELIVERY_COMPANY** | **String**| Company name where the order will be delivered.  | [optional]
 **DELIVERY_ADDRESS** | **String**| Order delivery address.  |
 **dELIVERYADDRESS2** | **String**| More details on order delivery address.  | [optional]
 **DELIVERY_ZIPCODE** | **String**| Order delivery address zip code.  |
 **DELIVERY_CITY** | **String**| Order delivery city.  |
 **DELIVERY_STATE** | **String**| Order delivery state.  |
 **DELIVERY_COUNTRYCODE** | **String**| Delivery country code in two letters ISO format.  |
 **LU_ENABLE_TOKEN** | **String**| Enable Token payments for the order. For the initial transaction, we have this parameter set to 1  | [optional]
 **LU_TOKEN_TYPE** | **String**| The type of the token. For the initial transaction, we have this parameter set to PAY_BY_CLICK  | [optional]
 **CC_NUMBER_TIME** | **String**| Time spent by user to insert card number  | [optional]
 **CC_OWNER_TIME** | **String**| Time spent by user to insert card owner  | [optional]
 **CLIENT_IP** | **String**| IP address of the Shopper  | [optional]
 **CLIENT_TIME** | **String**| Time collected from the Shopper&#39;s browser in YYYY-MM-DD hh:mm;ss format  | [optional]
 **oRDERPNAME0** | **String**| Product name |
 **oRDERPCODE0** | **String**| Product code. If multiple products are sent (in the same or subsequent transactions) with the same product code, PayU will update the product with  the corresponding ORDER_PCODE[] (overwriting all the other product information - name, price, taxes).  |
 **oRDERPRICE0** | **BigDecimal**| Unit price for product. Default currency is set by PRICES_CURRENCY, described below. |
 **oRDERVAT0** | **BigDecimal**| VAT value for product | [optional]
 **oRDERPRICETYPE0** | **String**| Specify if ORDER_PRICE[0] parameter includes VAT or not.  * GROSS (VAT is included)  * NET (VAT will be added by PayU)  | [optional] [default to NET] [enum: GROSS, NET]
 **oRDERQTY0** | **Integer**| Product quantity |
 **PRICES_CURRENCY** | **String**| The currency in which the prices are expressed, for example TRY If the parameter is not specified, the default value is the default currency of the Merchant.  | [optional]
 **oRDERPNAME1** | **String**| Product #2  | [optional]
 **oRDERPCODE1** | **String**| Product #2  | [optional]
 **oRDERPRICE1** | **BigDecimal**| Product #2  | [optional]
 **oRDERVAT1** | **BigDecimal**| Product #2  | [optional]
 **oRDERPRICETYPE1** | **String**| Product #2  | [optional] [default to NET] [enum: GROSS, NET]
 **oRDERQTY1** | **Integer**| Product #2  | [optional]
 **oRDERPNAME2** | **String**| Product #3  | [optional]
 **oRDERPCODE2** | **String**| Product #3  | [optional]
 **oRDERPRICE2** | **BigDecimal**| Product #3  | [optional]
 **oRDERVAT2** | **BigDecimal**| Product #3  | [optional]
 **oRDERPRICETYPE2** | **String**| Product #3  | [optional] [default to NET] [enum: GROSS, NET]
 **oRDERQTY2** | **Integer**| Product #3  | [optional]
 **oRDERPNAME3** | **String**| Product #4  | [optional]
 **oRDERPCODE3** | **String**| Product #4  | [optional]
 **oRDERPRICE3** | **BigDecimal**| Product #4  | [optional]
 **oRDERVAT3** | **BigDecimal**| Product #4  | [optional]
 **oRDERPRICETYPE3** | **String**| Product #4  | [optional] [default to NET] [enum: GROSS, NET]
 **oRDERQTY3** | **Integer**| Product #4  | [optional]
 **oRDERPNAME4** | **String**| Product #5  | [optional]
 **oRDERPCODE4** | **String**| Product #5  | [optional]
 **oRDERPRICE4** | **BigDecimal**| Product #5  | [optional]
 **oRDERVAT4** | **BigDecimal**| Product #5  | [optional]
 **oRDERPRICETYPE4** | **String**| Product #5  | [optional] [default to NET] [enum: GROSS, NET]
 **oRDERQTY4** | **Integer**| Product #5  | [optional]
 **oRDERPNAME5** | **String**| Product #6  | [optional]
 **oRDERPCODE5** | **String**| Product #6  | [optional]
 **oRDERPRICE5** | **BigDecimal**| Product #6  | [optional]
 **oRDERVAT5** | **BigDecimal**| Product #6  | [optional]
 **oRDERPRICETYPE5** | **String**| Product #6  | [optional] [default to NET] [enum: GROSS, NET]
 **oRDERQTY5** | **Integer**| Product #6  | [optional]

### Return type

[**AluResponseRaw**](AluResponseRaw.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

