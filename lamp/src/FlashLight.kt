class FlashLight(lightName: String): GenericLamp, Light(lightName) {
    override fun changeStatus() {
        super.getStatus() != super.getStatus()
    }
}