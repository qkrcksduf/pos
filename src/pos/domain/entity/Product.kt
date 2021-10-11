package pos.domain.entity

data class Product(
  val name: String,
  val price: Int,
  var quantity: Int
) {
  fun changeQuantity(product: Product, purchasedQuantity: Int) {
    product.quantity -= purchasedQuantity
  }

}