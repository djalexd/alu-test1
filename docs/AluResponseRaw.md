
# AluResponseRaw

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**REFNO** | **String** | Global PayU reference number for the order.  This is unique across all requests. If any of the required parameters  is missing, this will be empty!  |  [optional]
**ALIAS** | **String** | Unique string representation of the transaction that  can be used by the Merchant in his backend.  |  [optional]
**STATUS** | [**STATUSEnum**](#STATUSEnum) | Possible values  * SUCCESS - If the payment was authorized. In this case also REFNO is returned (see response sample)  * FAILED - If the payment could NOT be authorized for various reasons (fraud, insufficient funds etc.). In this case a REFNO is returned, but the payment is Pending (see response sample)  * INPUT_ERROR - If the payment request has erroneous or missing required parameters (see response sample)  |  [optional]
**RETURN_CODE** | [**RETURNCODEEnum**](#RETURNCODEEnum) |  |  [optional]
**RETURN_MESSAGE** | **String** | A more detailed description of the response code |  [optional]
**DATE** | [**OffsetDateTime**](OffsetDateTime.md) | Date of the response in UTC format |  [optional]
**uRL3DS** | **String** | In case that the credit card is enrolled in 3D Secure system, this parameter will contain an URL where the Merchant should redirect the browser of the Shopper (see response sample). |  [optional]
**AMOUNT** | **String** | Total transacted amount |  [optional]
**CURRENCY** | **String** | The currency in which the order has been processed |  [optional]
**INSTALLMENTS_NO** | **String** | The number of installments |  [optional]
**CARD_PROGRAM_NAME** | **String** | The name of card program used for paying the order |  [optional]
**ORDER_REF** | **String** | Order external reference number in Merchant&#39;s system |  [optional]
**AUTH_CODE** | **String** | Bank authorization code |  [optional]
**RRN** | **String** | Retrieval reference number |  [optional]
**WIRE_ACCOUNTS** | [**List&lt;WireAccountRaw&gt;**](WireAccountRaw.md) | Contains an array of bank accounts used for paying in WIRE method. In case of other payment methods the node will be missing.  |  [optional]
**HASH** | **String** | Signature applied for the all elements from the request using  the same algorithm as the signature from the initial request.  Parameters must be concatenated in the order presented above.  URL_3DS is not included in the signature. If the signature is NOT correct you&#39;ll get a HASH_MISMATCH error  and the HASH tag will be empty.  |  [optional]
**TOKEN_HASH** | **String** | Displayed only if token payments are enabled for this order.   See **Enable Token Payments**  Represents the hash string for the generated token. It can be used by specifying this hash string in the CC_TOKEN field  for OneClick payments.  |  [optional]
**TX_REFNO** | **String** | *[Offline payment methods only]* The acquirer reference number for  the generated transaction. If any error occurs during transaction or the  transfer is rejected, this response element will be empty or missing.  |  [optional]
**URL_REDIRECT** | **String** | [PBL payment methods only] The url to which the merchant  must redirect the user in order to complete the transaction.  |  [optional]


<a name="STATUSEnum"></a>
## Enum: STATUSEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
INPUT_ERROR | &quot;INPUT_ERROR&quot;


<a name="RETURNCODEEnum"></a>
## Enum: RETURNCODEEnum
Name | Value
---- | -----
AUTHORIZED | &quot;AUTHORIZED&quot;
_3DS_ENROLLED | &quot;3DS_ENROLLED&quot;
ALREADY_AUTHORIZED | &quot;ALREADY_AUTHORIZED&quot;
AUTHORIZATION_FAILED | &quot;AUTHORIZATION_FAILED&quot;
INVALID_CUSTOMER_INFO | &quot;INVALID_CUSTOMER_INFO&quot;
INVALID_PAYMENT_INFO | &quot;INVALID_PAYMENT_INFO&quot;
INVALID_ACCOUNT | &quot;INVALID_ACCOUNT&quot;
INVALID_PAYMENT_METHOD_CODE | &quot;INVALID_PAYMENT_METHOD_CODE&quot;
INVALID_CURRENCY | &quot;INVALID_CURRENCY&quot;
REQUEST_EXPIRED | &quot;REQUEST_EXPIRED&quot;
HASH_MISMATCH | &quot;HASH_MISMATCH&quot;
WRONG_VERSION | &quot;WRONG_VERSION&quot;
INVALID_CC_TOKEN | &quot;INVALID_CC_TOKEN&quot;
INSTALLMENTS_LOYALTY_POINTS_INCOMPATIBLE | &quot;INSTALLMENTS_LOYALTY_POINTS_INCOMPATIBLE&quot;



