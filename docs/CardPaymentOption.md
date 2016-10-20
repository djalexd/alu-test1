
# CardPaymentOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ccNumber** | **String** | The card number on which the order authorization will be made  |  [optional]
**ccOwner** | **String** | The card owner name, as it appears on the card.  |  [optional]
**expMonth** | **Integer** | The month in which the card used expires  |  [optional]
**expYear** | **Integer** | The year in which the card used expires  |  [optional]
**cvv** | **Integer** | The CCV/CVV2 code for the card. For some card types or  based on merchant settings this can be empty,  otherwise it should have a numerical value  |  [optional]
**enableToken** | **Boolean** | Enable Token payments for the order. For the initial transaction,  we have this parameter set to 1  |  [optional]
**ccNumberTime** | **String** | Time spent by user to insert card number  |  [optional]
**ccOwnerTime** | **String** | Time spent by user to insert card owner  |  [optional]



