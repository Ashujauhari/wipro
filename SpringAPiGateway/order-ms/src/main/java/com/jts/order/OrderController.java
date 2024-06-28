package com.jts.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //http://localhost:8080/order/getPaymentDetails
@RequestMapping("/order")
public class OrderController {

	@GetMapping("/getPaymentDetails")
	public String getPaymentDetails() {
		return "Payment details fetched succesfully.";
	}
}
