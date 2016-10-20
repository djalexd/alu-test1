
# AluRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchant** | [**Merchant**](Merchant.md) |  |  [optional]
**orderRef** | **String** | Order external reference number in Merchant&#39;s system  |  [optional]
**orderDate** | [**DateTime**](DateTime.md) | The date when the order is initiated in the system,  in YYYY-MM-DD HH:MM:SS format (e.g.: \&quot;2012-05-01 21:15:45\&quot;) Important: Date should be UTC standard +/-10 minutes  |  [optional]
**orderTimeout** | **Integer** | The time in seconds after which the order will expire.  |  [optional]
**clientIp** | **String** | ip address of the shopper |  [optional]
**clientTime** | **String** | Time collected from the Shopper&#39;s browser in YYYY-MM-DD hh:mm;ss format  |  [optional]
**posCode** | **String** | Optional field used to define orders made through a specific POS.  Sent value should be previously confirmed with operation team.   |  [optional]
**payMethod** | [**PayMethodEnum**](#PayMethodEnum) | Payment method for the order. Possible values: CCVISAMC -  Visa/Mastercard credit card (default), WIRE, UPT, BKM, QIWI,  PAYU_CREDIT, QBANK, COMPAY, TINKOFF_LOAN  |  [optional]
**currency** | **String** | The currency in which the prices are expressed, for example TRY. If the parameter is not specified, the default value is  the default currency of the Merchant.  |  [optional]
**continueUri** | **String** | Return URL on the Merchant webshop side that will be used in case  of 3DS enrolled cards authorizations or for Pay By Link (PBL)  payment methods (such as BKM, QIWI, PayU Credit, QBank, Compay, Tinkoff Loan).              |  [optional]
**billing** | [**Billing**](Billing.md) |  |  [optional]
**delivery** | [**Delivery**](Delivery.md) |  |  [optional]
**orderItems** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional]
**paymentOptions** | [**AluPaymentOption**](AluPaymentOption.md) |  |  [optional]
**shipping** | [**Shipping**](Shipping.md) |  |  [optional]


<a name="PayMethodEnum"></a>
## Enum: PayMethodEnum
Name | Value
---- | -----
CCVISAMC | &quot;CCVISAMC&quot;
WIRE | &quot;WIRE&quot;
UPT | &quot;UPT&quot;
BKM | &quot;BKM&quot;
QIWI | &quot;QIWI&quot;
PAYU_CREDIT | &quot;PAYU_CREDIT&quot;
QBANK | &quot;QBANK&quot;
COMPAY | &quot;COMPAY&quot;
TINKOFF_LOAN | &quot;TINKOFF_LOAN&quot;



