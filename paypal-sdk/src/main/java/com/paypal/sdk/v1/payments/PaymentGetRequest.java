// This class was generated on Mon, 09 Apr 2018 18:13:18 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// PaymentGetRequest.java
// @version 0.1.0-dev+291f3f
// @type request
// @data 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
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Shows details for a payment, by ID, that has yet to complete. For example, shows details for a payment that was created, approved, or failed.
 */
public class PaymentGetRequest extends HttpRequest<Payment> {

    public PaymentGetRequest(String paymentId) {
        super("/v1/payments/payment/{payment_id}?", "GET", Payment.class);
        try {
            path(path().replace("{payment_id}", URLEncoder.encode(String.valueOf(paymentId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
}
