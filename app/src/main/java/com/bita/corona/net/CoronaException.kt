package com.bita.corona.net

class CoronaException(val code: String, override val message: String) : Exception(message) {
    companion object {
        private const val serialVersionUID: Long = 123
    }
}