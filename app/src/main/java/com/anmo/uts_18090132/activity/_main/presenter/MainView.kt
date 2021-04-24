package com.anmo.uts_18090132.activity._main.presenter

import com.anmo.uts_18090132.model.Keranjang

interface MainView {
    fun onSuccessReportLastDay(keranjang: List<Keranjang?>?)
    fun onSuccessReportLastWeek(keranjang: List<Keranjang?>?)
    fun onSuccessReportLastMonth(keranjang: List<Keranjang?>?)
    fun onSuccessReportNowDay(keranjang: List<Keranjang?>?)
    fun onSuccessReportNowWeek(keranjang: List<Keranjang?>?)
    fun onSuccessReportNowMonth(keranjang: List<Keranjang?>?)

    fun onFailedReport(msg: String?)
}