package com.stockmarketapp.app.domain.repository

import com.stockmarketapp.app.domain.model.CompanyInfo
import com.stockmarketapp.app.domain.model.CompanyListing
import com.stockmarketapp.app.domain.model.IntraDayInfo
import com.stockmarketapp.app.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntraDayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>

}