package com.stockmarketapp.app.data.mapper

import com.stockmarketapp.app.data.local.CompanyListingEntity
import com.stockmarketapp.app.data.remote.dto.CompanyInfoDto
import com.stockmarketapp.app.domain.model.CompanyInfo
import com.stockmarketapp.app.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo{
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: "",
    )
}