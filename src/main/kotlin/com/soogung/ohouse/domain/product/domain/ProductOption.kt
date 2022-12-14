package com.soogung.ohouse.domain.product.domain

import javax.persistence.*

@Entity
@Table(name = "tbl_product_option")
class ProductOption(
    @Column(length = 40, nullable = false)
    var name: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    var product: Product,

    @OneToMany(mappedBy = "productOption", cascade = [CascadeType.ALL])
    val detailProducts: List<DetailProduct> = arrayListOf(),

    @Column(name = "product_option_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
) {
}