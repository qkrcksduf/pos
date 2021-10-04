package pos

class Product(
  val name: String,
  val price: Int
) {
  companion object {
    fun addProduct() {
      print("상품 이름, 가격을 입력하세요 >> ")

      val name = scanner.next()
      val price = scanner.nextInt()

      productList.add(Product(name, price))
    }

    fun updateProduct() {
      print("변경할 상품의 이름을 입력하세요 >> ")
      val currentName = scanner.next()

      print("변경할 이름과 가격을 입력하세요 >> ")
      val updatedName = scanner.next()
      val price = scanner.nextInt()

      val product: Product? = productList.find { it.name == currentName }
      if (product != null) {
        productList.remove(product)
        productList.add(Product(updatedName, price))
      } else {
        println("존재하지 않는 상품입니다.")
      }
    }


    fun deleteProduct() {
      print("삭제할 상품의 이름을 입력하세요 >> ")
      val name = scanner.next()

      val product: Product? = productList.find { it.name == name }
      if (product != null) {
        productList.remove(product)
      } else {
        println("존재하지 않는 상품입니다.")
      }
    }

    fun selectProduct() {
      println("------------상품 목록----------")
      productList.forEach {
        println("name: ${it.name}, price: ${it.price}")
      }
    }

  }
  override fun toString(): String {
    return "(name = $name, price = $price)"
  }

}