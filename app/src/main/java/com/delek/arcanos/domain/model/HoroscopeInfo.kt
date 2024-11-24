package com.delek.arcanos.domain.model

import com.delek.arcanos.R

sealed class HoroscopeInfo(val img: Int, val name: Int) {

    object Aries : HoroscopeInfo(R.drawable.sign_aries, R.string.aries)
    object Taurus : HoroscopeInfo(R.drawable.sign_tauro, R.string.tauro)
    object Gemini : HoroscopeInfo(R.drawable.sign_geminis, R.string.gemini)
    object Cancer : HoroscopeInfo(R.drawable.sign_cancer, R.string.cancer)
    object Leo : HoroscopeInfo(R.drawable.sign_leo, R.string.leo)
    object Virgo : HoroscopeInfo(R.drawable.sign_virgo, R.string.virgo)
    object Libra : HoroscopeInfo(R.drawable.sign_libra, R.string.libra)
    object Scorpio : HoroscopeInfo(R.drawable.sign_escorpio, R.string.scorpio)
    object Sagittarius : HoroscopeInfo(R.drawable.sign_sagitario, R.string.sagittaurius)
    object Capricorn : HoroscopeInfo(R.drawable.sign_capricornio, R.string.capricorn)
    object Aquarius : HoroscopeInfo(R.drawable.sign_aquario, R.string.aquarius)
    object Pisces : HoroscopeInfo(R.drawable.sign_piscis, R.string.pisces)

}