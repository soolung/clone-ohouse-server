package com.soogung.ohouse.domain.product.presentation.dto.request

import com.soogung.ohouse.domain.product.domain.Product
import org.hibernate.validator.constraints.Length
import javax.validation.Valid

data class CreateProductRequest(
    @field:Length(min = 2, max = 30)
    val name: String,

    val isDiscount: Boolean,

    val discountDegree: Double?,

    @field:Valid
    val productOption: List<ProductOptionRequest>,

    @field:Valid
    val images: List<ProductImageRequest>,

    @field:Valid
    val delivery: ProductDeliveryRequest,
) {
    fun toEntity(): Product {
        return Product(
            name = name,
            isDiscount = isDiscount,
            discountDegree = discountDegree
        )
    }
}