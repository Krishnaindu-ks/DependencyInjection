package com.ks.dependencyinjection2
interface Weather{
    fun getWeather():String
}
class WeatherService : Weather {
    override fun getWeather(): String {
        return "Sunny"
    }
}