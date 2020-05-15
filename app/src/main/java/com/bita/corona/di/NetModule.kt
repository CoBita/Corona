package com.bita.corona.di

import com.and.base.net.Net
import com.bita.corona.Const
import com.bita.corona.net.CoronaRequestInterceptor
import com.bita.corona.net.CoronaResponseInterceptor
import com.bita.corona.net.HeaderInterceptor
import com.bita.corona.net.NetConst
import org.koin.dsl.module

val netModule = module {

    val baseUrl = NetConst.BASE_URl
    val serviceKey = Const.SERVICE_KEY
    val type = "json"
    single { arrayOf(CoronaResponseInterceptor(), HeaderInterceptor(), CoronaRequestInterceptor(serviceKey, type)) }
    single { Net(baseUrl, interceptors = get()) }

}