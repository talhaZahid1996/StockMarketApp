package com.stockmarketapp.app.presentation.company_info

import com.stockmarketapp.app.domain.model.CompanyInfo
import com.stockmarketapp.app.domain.model.CompanyListing
import com.stockmarketapp.app.domain.model.IntraDayInfo

data class CompanyInfoState(
    val stockInfos: List<IntraDayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null,
)
