
# DocumentId

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | Shopper&#39;s ID type - mandatory for UPT.  Accepted values:  * PERSONALID (identity card) * PASSPORT (passport) * DRVLICENSE (driving license)  |  [optional]
**documentNumber** | **String** | Shopper&#39;s ID number (for the specified ID type)    |  [optional]


<a name="DocumentTypeEnum"></a>
## Enum: DocumentTypeEnum
Name | Value
---- | -----
PERSONALID | &quot;PERSONALID&quot;
PASSPORT | &quot;PASSPORT&quot;
DRVLICENSE | &quot;DRVLICENSE&quot;



