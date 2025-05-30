/*Cart.java
  Cart Class
  Author: Teyana Raubenheimer (230237622)
  Date: 14 May 2025
 */

package za.co.admatech.factory;

import za.co.admatech.domain.Cart;
import za.co.admatech.domain.CartItem;
import za.co.admatech.domain.Customer;
import za.co.admatech.util.Helper;

public class CartFactory {
    public static Cart createCart(String customerID, String cartItemID) {
      String cartID =  Helper.generateId();

      if (Helper.isNullOrEmpty(customerID) || Helper.isNullOrEmpty(cartItemID)) {
          return null;
      }

            return new Cart.Builder()
                    .setCartID(cartID)
                    .setCustomerID(customerID)
                    .setCartItemID(cartItemID)
                    .build();


}
    }
