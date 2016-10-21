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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.AluResponse;
import io.swagger.client.model.Merchant;
import org.joda.time.DateTime;
import java.math.BigDecimal;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Create a new order via ALU v3
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderAluV3PostTest() throws ApiException {
        String MERCHANT = null;
        String ORDER_REF = null;
        DateTime ORDER_DATE = null;
        String ORDER_HASH = null;
        String BILL_LNAME = null;
        String BILL_FNAME = null;
        String BILL_EMAIL = null;
        String BILL_PHONE = null;
        String BILL_COUNTRYCODE = null;
        String BILL_CITYPE = null;
        String BILL_CINUMBER = null;
        String oRDERPNAME0 = null;
        String oRDERPCODE0 = null;
        BigDecimal oRDERPRICE0 = null;
        BigDecimal oRDERQTY0 = null;
        String PAY_METHOD = null;
        String BACK_REF = null;
        String CC_NUMBER = null;
        String EXP_MONTH = null;
        String EXP_YEAR = null;
        String CC_CVV = null;
        String CC_OWNER = null;
        String CC_TOKEN = null;
        String oRDERPINFO0 = null;
        String oRDERVER0 = null;
        BigDecimal SELECTED_INSTALLMENTS_NUMBER = null;
        String CARD_PROGRAM_NAME = null;
        String ORDER_TIMEOUT = null;
        String USE_LOYALTY_POINTS = null;
        String LOYALTY_POINTS_AMOUNT = null;
        String CAMPAIGN_TYPE = null;
        String ORDER_SHIPPING = null;
        String POS_CODE = null;
        String BILL_FAX = null;
        String BILL_ADDRESS = null;
        String bILLADDRESS2 = null;
        String BILL_ZIPCODE = null;
        String BILL_CITY = null;
        String BILL_STATE = null;
        String DELIVERY_LNAME = null;
        String DELIVERY_FNAME = null;
        String DELIVERY_EMAIL = null;
        String DELIVERY_PHONE = null;
        String DELIVERY_COMPANY = null;
        String DELIVERY_ADDRESS = null;
        String dELIVERYADDRESS2 = null;
        String DELIVERY_ZIPCODE = null;
        String DELIVERY_CITY = null;
        String DELIVERY_STATE = null;
        String DELIVERY_COUNTRYCODE = null;
        String LU_ENABLE_TOKEN = null;
        String LU_TOKEN_TYPE = null;
        String CC_NUMBER_TIME = null;
        String CC_OWNER_TIME = null;
        String CLIENT_IP = null;
        String CLIENT_TIME = null;
        BigDecimal oRDERVAT0 = null;
        String oRDERPRICETYPE0 = null;
        String PRICES_CURRENCY = null;
        String oRDERPNAME1 = null;
        String oRDERPCODE1 = null;
        BigDecimal oRDERPRICE1 = null;
        BigDecimal oRDERVAT1 = null;
        String oRDERPRICETYPE1 = null;
        BigDecimal oRDERQTY1 = null;
        String oRDERPNAME2 = null;
        String oRDERPCODE2 = null;
        BigDecimal oRDERPRICE2 = null;
        BigDecimal oRDERVAT2 = null;
        String oRDERPRICETYPE2 = null;
        BigDecimal oRDERQTY2 = null;
        String oRDERPNAME3 = null;
        String oRDERPCODE3 = null;
        BigDecimal oRDERPRICE3 = null;
        BigDecimal oRDERVAT3 = null;
        String oRDERPRICETYPE3 = null;
        BigDecimal oRDERQTY3 = null;
        String oRDERPNAME4 = null;
        String oRDERPCODE4 = null;
        BigDecimal oRDERPRICE4 = null;
        BigDecimal oRDERVAT4 = null;
        String oRDERPRICETYPE4 = null;
        BigDecimal oRDERQTY4 = null;
        String oRDERPNAME5 = null;
        String oRDERPCODE5 = null;
        BigDecimal oRDERPRICE5 = null;
        BigDecimal oRDERVAT5 = null;
        String oRDERPRICETYPE5 = null;
        BigDecimal oRDERQTY5 = null;
        // AluResponse response = api.orderAluV3Post(MERCHANT, ORDER_REF, ORDER_DATE, ORDER_HASH, BILL_LNAME, BILL_FNAME, BILL_EMAIL, BILL_PHONE, BILL_COUNTRYCODE, BILL_CITYPE, BILL_CINUMBER, oRDERPNAME0, oRDERPCODE0, oRDERPRICE0, oRDERQTY0, PAY_METHOD, BACK_REF, CC_NUMBER, EXP_MONTH, EXP_YEAR, CC_CVV, CC_OWNER, CC_TOKEN, oRDERPINFO0, oRDERVER0, SELECTED_INSTALLMENTS_NUMBER, CARD_PROGRAM_NAME, ORDER_TIMEOUT, USE_LOYALTY_POINTS, LOYALTY_POINTS_AMOUNT, CAMPAIGN_TYPE, ORDER_SHIPPING, POS_CODE, BILL_FAX, BILL_ADDRESS, bILLADDRESS2, BILL_ZIPCODE, BILL_CITY, BILL_STATE, DELIVERY_LNAME, DELIVERY_FNAME, DELIVERY_EMAIL, DELIVERY_PHONE, DELIVERY_COMPANY, DELIVERY_ADDRESS, dELIVERYADDRESS2, DELIVERY_ZIPCODE, DELIVERY_CITY, DELIVERY_STATE, DELIVERY_COUNTRYCODE, LU_ENABLE_TOKEN, LU_TOKEN_TYPE, CC_NUMBER_TIME, CC_OWNER_TIME, CLIENT_IP, CLIENT_TIME, oRDERVAT0, oRDERPRICETYPE0, PRICES_CURRENCY, oRDERPNAME1, oRDERPCODE1, oRDERPRICE1, oRDERVAT1, oRDERPRICETYPE1, oRDERQTY1, oRDERPNAME2, oRDERPCODE2, oRDERPRICE2, oRDERVAT2, oRDERPRICETYPE2, oRDERQTY2, oRDERPNAME3, oRDERPCODE3, oRDERPRICE3, oRDERVAT3, oRDERPRICETYPE3, oRDERQTY3, oRDERPNAME4, oRDERPCODE4, oRDERPRICE4, oRDERVAT4, oRDERPRICETYPE4, oRDERQTY4, oRDERPNAME5, oRDERPCODE5, oRDERPRICE5, oRDERVAT5, oRDERPRICETYPE5, oRDERQTY5);

        // TODO: test validations
    }
    
}
