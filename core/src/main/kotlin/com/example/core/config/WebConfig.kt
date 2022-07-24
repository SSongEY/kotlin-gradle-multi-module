package com.example.core.config

import com.example.core.filter.RequestLoggingFilter
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {

    @Bean
    fun requestLoggingFilter(): FilterRegistrationBean<RequestLoggingFilter> {
        val filterRegistrationBeanRequest: FilterRegistrationBean<RequestLoggingFilter> = FilterRegistrationBean<RequestLoggingFilter>(
            RequestLoggingFilter()
        )
        filterRegistrationBeanRequest.setName("RequestLoggingFilter")
        return filterRegistrationBeanRequest
    }
}
