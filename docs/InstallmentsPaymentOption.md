
# InstallmentsPaymentOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberOfInstallments** | **Integer** | The number of installments. It can be an integer between 1 and 12  |  [optional]
**cardProgramName** | **String** | The name of card program that allows paying an order using installments  |  [optional]
**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | A predefined string value indicating the type of campaign to be used. It can only have  one of the following values: * EXTRA_INSTALLMENTS * DELAY_INSTALLMENTS  For bank terminals supporting both campaign types used at the same time, you can set  both comma separated values, e.g: EXTRA_INSTALLMENTS,DELAY_INSTALLMENTS.     Must be used only with installments transactions (SELECTED_INSTALLMENTS_NUMBER &gt;&#x3D; 2).  |  [optional]


<a name="CampaignTypeEnum"></a>
## Enum: CampaignTypeEnum
Name | Value
---- | -----
EXTRA_INSTALLMENTS | &quot;EXTRA_INSTALLMENTS&quot;
DELAY_INSTALLMENTS | &quot;DELAY_INSTALLMENTS&quot;



