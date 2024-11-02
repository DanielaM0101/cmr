package com.example.cmr.response



class JsendResponse<T> (
    val status: String,
    val message: String? = null,
    val data: T? = null,


)
