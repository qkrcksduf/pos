package pos.domain.entity

import pos.Payment

data class Order(
  val productList: List<Product> = emptyList(),
  val payment: Payment,
  val totalAmount: Int = 0
)