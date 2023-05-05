package com.ks.dependencyinjection2

class DependencyProvider {
    val weatherService:WeatherService by lazy {
        WeatherService()
    }
}