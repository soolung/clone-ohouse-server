package com.soogung.ohouse.domain.product.presentation.dto.request

import com.soogung.ohouse.domain.product.domain.ProductDelivery
import com.soogung.ohouse.domain.product.domain.type.DeliveryType

data class ProductDeliveryRequest(
    val deliveryType: DeliveryType,
    val freeShippingPrice: Int?,
    val price: Int,
) {
    fun toEntity(): ProductDelivery {
        return ProductDelivery(
            price = price,
            freeShippingPrice = freeShippingPrice,
            deliveryType = deliveryType,
        )
    }
}
