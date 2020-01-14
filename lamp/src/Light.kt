open class Light(lightName: String) {

    private var status = false

    init {
        println("Initial status $status of $lightName")
    }

    fun getStatus(): Boolean {
        return status
    }
}