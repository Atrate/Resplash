package com.b_lam.resplash.di

import com.b_lam.resplash.util.NotificationManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val managerModule = module {

    single(createdAtStart = true) { NotificationManager(androidContext()) }
}