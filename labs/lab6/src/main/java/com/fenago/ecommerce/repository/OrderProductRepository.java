package com.fenago.ecommerce.repository;

import com.fenago.ecommerce.model.OrderProduct;
import com.fenago.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
