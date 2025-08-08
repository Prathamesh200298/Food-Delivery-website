package com.zosh.service;

import com.razorpay.RazorpayException;
import com.zosh.model.Order;
import com.zosh.model.PaymentResponse;

public interface PaymentService {

	PaymentResponse createRazorpayPaymentLink(Order order) throws RazorpayException;
}