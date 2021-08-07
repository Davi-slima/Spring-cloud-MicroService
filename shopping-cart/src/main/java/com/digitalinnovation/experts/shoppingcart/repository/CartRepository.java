package com.digitalinnovation.experts.shoppingcart.repository;

import com.digitalinnovation.experts.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);
}
