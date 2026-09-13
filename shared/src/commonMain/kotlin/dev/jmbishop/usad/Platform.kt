package dev.jmbishop.usad

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform