package es.rudo.demokmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform