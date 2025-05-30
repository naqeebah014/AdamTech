/*ICartService.java
  Author: Teyana Raubenheimer (230237622)
  Date: 24 May 2025
 */

package za.co.admatech.service;

import za.co.admatech.domain.Cart;

import java.util.List;

public interface ICartService extends IService<Cart, String>{
    List<Cart> getAll();
}
