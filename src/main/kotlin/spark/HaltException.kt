package spark

import javax.servlet.http.HttpServletResponse;

class HaltException @JvmOverloads constructor(
        private val _statusCode: Int = HttpServletResponse.SC_OK,
        private val _body: String? = null
) : RuntimeException(null, null, false, false) {
    /**
     * @return the statusCode
     */
    @get:Deprecated("replaced by {@link #statusCode()}")
    val statusCode: Int = _statusCode

    /**
     * @return the body
     */
    @get:Deprecated("replaced by {@link #body()}")
    val body: String? = _body

    /**
     * @return the statusCode
     */
    fun statusCode(): Int = statusCode


    /**
     * @return the body
     */
    fun body(): String? = body

    companion object {
        private const val serialVersionUID = 1L
    }
}
