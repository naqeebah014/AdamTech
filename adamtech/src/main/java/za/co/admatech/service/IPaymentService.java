package za.co.admatech.service;

import za.co.admatech.domain.Payment;

import java.util.List;

public interface IPaymentService extends IService<Payment, String> {
   List<Payment> getPayments();
}
