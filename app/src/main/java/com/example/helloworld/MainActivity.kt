
fun main() {
    print("hello world")

    fun joinOptions(options: Collection<String>) =
        options.joinToString(postfix = "]", prefix = "[")

    print(joinOptions(listOf("a", "b")))
}
