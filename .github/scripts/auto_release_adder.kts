import java.io.File

fun searchReleaseVersion(prBody: String): String {
    var version = ""
    return version
}

fun restoreOutput(releaseBody: String) {
    val outputPath = System.getenv("GITHUB_OUTPUT")
    File(outputPath).appendText("release_body=$releaseBody")
}

fun main() {
    val prBody = args.firstOrNull() ?: "No PR body data"
    restoreOutput(prBody)
}

main()