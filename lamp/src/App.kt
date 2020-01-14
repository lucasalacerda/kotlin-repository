fun main(args: Array<String>) {
    val lamp = Lamp("Lamp")
    val flashLight = FlashLight("FlashLight")

    lamp.changeStatus()

    println(lamp.getStatus())

    lamp.changeStatus()

    println(lamp.getStatus())

    println("flashLight ${flashLight.getStatus()}")
    flashLight.changeStatus()
    println("flashLight ${flashLight.getStatus()}")

}
