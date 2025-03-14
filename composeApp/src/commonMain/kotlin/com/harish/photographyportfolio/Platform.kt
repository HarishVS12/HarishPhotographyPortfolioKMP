package com.harish.photographyportfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform