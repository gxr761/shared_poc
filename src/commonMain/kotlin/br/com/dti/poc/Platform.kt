package br.com.dti.poc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform