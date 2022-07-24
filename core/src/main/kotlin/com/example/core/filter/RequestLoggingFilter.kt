package com.example.core.filter

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class RequestLoggingFilter : OncePerRequestFilter() {

    private val accessLogger: Logger = LoggerFactory.getLogger("ACCESS_LOGGER")

    override fun doFilterInternal(originalRequest: HttpServletRequest, originalResponse: HttpServletResponse, filterChain: FilterChain) {
        filterChain.doFilter(originalRequest, originalResponse)
        accessLogger.info("access log")
    }
}
