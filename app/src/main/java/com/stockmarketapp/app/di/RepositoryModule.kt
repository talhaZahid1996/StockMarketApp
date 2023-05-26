package com.stockmarketapp.app.di

import com.stockmarketapp.app.data.csv.CSVParser
import com.stockmarketapp.app.data.csv.CompanyListingParser
import com.stockmarketapp.app.data.csv.IntradayInfoParser
import com.stockmarketapp.app.data.repository.StockRepositoryImpl
import com.stockmarketapp.app.domain.model.CompanyListing
import com.stockmarketapp.app.domain.model.IntraDayInfo
import com.stockmarketapp.app.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingParser: CompanyListingParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntraDayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository

}