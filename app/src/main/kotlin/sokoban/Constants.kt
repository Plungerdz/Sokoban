package sokoban

object Constants {
    private val resourcesPath = System.getenv("RESOURCES_PATH") ?: "ERROR_PATH"
    val levelgenPath = "${resourcesPath}/levelgen"
    val tilesPath = "${resourcesPath}/tiles"
    val outputLevelsPath = "${resourcesPath}/levels"
    val overlaysPath = "${resourcesPath}/overlays"
    val textPath = "${resourcesPath}/text"
}