package davud.hosseini.themeswitcherplugin.plugin.model

class TasksNamesModel(val buildVariant: String) {

    companion object {
        private const val GATHER_RAW_STRINGS_NAME_FORMAT = "gather%sRawStrings"
        private const val GATHER_STRING_TEMPLATES_NAME_FORMAT = "gather%sStringTemplates"
        private const val RESOLVE_PLACEHOLDERS_NAME_FORMAT = "resolve%sPlaceholders"
        private const val ANDROID_GENERATE_RES_VALUES_TASK_NAME_FORMAT = "generate%sResValues"
        private const val ANDROID_MERGE_RESOURCES_TASK_NAME_FORMAT = "merge%sResources"
    }

    private val capitalizedBuildVariant = buildVariant.capitalize()

    val gatherRawStringsName: String by lazy {
        GATHER_RAW_STRINGS_NAME_FORMAT.format(capitalizedBuildVariant)
    }

    val gatherStringTemplatesName: String by lazy {
        GATHER_STRING_TEMPLATES_NAME_FORMAT.format(capitalizedBuildVariant)
    }

    val resolvePlaceholdersName: String by lazy {
        RESOLVE_PLACEHOLDERS_NAME_FORMAT.format(capitalizedBuildVariant)
    }

    val generateResValuesName: String by lazy {
        ANDROID_GENERATE_RES_VALUES_TASK_NAME_FORMAT.format(capitalizedBuildVariant)
    }

    val mergeResourcesName: String by lazy {
        ANDROID_MERGE_RESOURCES_TASK_NAME_FORMAT.format(capitalizedBuildVariant)
    }
}