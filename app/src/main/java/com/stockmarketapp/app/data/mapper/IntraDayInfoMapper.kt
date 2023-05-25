package com.stockmarketapp.app.data.mapper

import com.stockmarketapp.app.data.remote.dto.IntraDayInfoDto
import com.stockmarketapp.app.domain.model.IntraDayInfo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun IntraDayInfoDto.toIntraDayInfo(): IntraDayInfo {
    val pattern = "yyyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val localDateTime = LocalDateTime.parse(timestamp, formatter)
    return IntraDayInfo(
        date = localDateTime,
        close = close
    )
}