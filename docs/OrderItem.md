
# OrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Order item name |  [optional]
**code** | **String** | Product code. If multiple products are sent (in the same or subsequent transactions) with the same product code, PayU will update the product with  the corresponding index (overwriting all the other product information - name, price, taxes).  |  [optional]
**info** | **String** | Holds additional information about this order item  |  [optional]
**version** | **String** | First item in the so-called array of product version for all ordered products  |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) | Unit price for product. Default currency is set by PRICES_CURRENCY  |  [optional]
**vat** | [**BigDecimal**](BigDecimal.md) | VAT value for product |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Specify if ORDER_PRICE[0] parameter includes VAT or not. * GROSS (VAT is included) * NET (VAT will be added by PayU)  |  [optional]
**quantity** | **Integer** | Number of items |  [optional]


<a name="PriceTypeEnum"></a>
## Enum: PriceTypeEnum
Name | Value
---- | -----
GROSS | &quot;GROSS&quot;
NET | &quot;NET&quot;



