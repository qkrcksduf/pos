package pos.router

import pos.application.OrderService.getOrders
import pos.application.OrderService.order

object OrderController {

  fun productOrder() {
    order()
  }

  fun salesManagement() {
    getOrders()
  }

}