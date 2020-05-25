///*
// * Created by DHosseiny. ThemeSwitcher project.
// */
//
package davud.hosseini.themeswitcherplugin.plugin.data.storage
//
//import davud.hosseini.themeswitcherplugin.plugin.data.helpers.AndroidVariantHelper
//import java.io.File
//
//class IncrementalDirsProvider(androidVariantHelper: AndroidVariantHelper) {
//    private val incrementalDir = File(androidVariantHelper.incrementalDir)
//
//    fun getRawStringsDir(): File {
//        return getIncrementalDirAndCreateIfNotExists("strings")
//    }
//
//    fun getTemplateStringsDir(): File {
//        return getIncrementalDirAndCreateIfNotExists("templates")
//    }
//
//    private fun getIncrementalDirAndCreateIfNotExists(dirName: String): File {
//        val dir = File(incrementalDir, dirName)
//        if (!dir.exists()) {
//            dir.mkdirs()
//        }
//
//        return dir
//    }
//}
