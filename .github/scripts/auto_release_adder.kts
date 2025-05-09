import java.io.File

val NO_VERSION_DATA = "NO_VERSION_DATA"
val NO_BODY_DATA = "NO_BODY_DATA"

fun searchReleaseVersion(prBody: String): String {
    val versionRegex = Regex("v\\d+\\.\\d+\\.\\d+")
    return versionRegex.find(prBody)?.value ?: NO_VERSION_DATA
}

fun searchReleaseBody(prBody: String): String {
    var bodyRegex = Regex("# 변경 사항\\s*(.*)")
    return bodyRegex.find(prBody)?.value ?: NO_BODY_DATA
}

fun restoreOutput(releaseVersion: String, releaseBody: String) {
    val outputPath = System.getenv("GITHUB_OUTPUT")
    File(outputPath).appendText("release_version=$releaseVersion\n")
    File(outputPath).appendText("release_body=$releaseBody\n")
}

fun main() {
    val prBody = args.firstOrNull() ?: NO_BODY_DATA
    //var version = searchReleaseVersion(prBody = prBody)
    var version = "v1.0.0"
    //var body = searchReleaseBody(prBody = prBody)
    var body = prBody
    restoreOutput(releaseVersion = version, releaseBody = body)
}

main()