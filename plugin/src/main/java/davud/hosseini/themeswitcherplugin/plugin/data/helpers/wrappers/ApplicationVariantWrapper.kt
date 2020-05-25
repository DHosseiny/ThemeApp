package davud.hosseini.themeswitcherplugin.plugin.data.helpers.wrappers

class ApplicationVariantWrapper(private val applicationVariant: Any) {

    private val clazz = applicationVariant.javaClass
    private val getNameMethod by lazy { clazz.getMethod("getName") }
    private val getFlavorNameMethod by lazy { clazz.getMethod("getFlavorName") }
    private val getProductFlavorsMethod by lazy { clazz.getMethod("getProductFlavors") }
    private val getBuildTypeMethod by lazy { clazz.getMethod("getBuildType") }

    fun getName(): String {
        return getNameMethod.invoke(applicationVariant) as String
    }

    fun getFlavorName(): String {
        return getFlavorNameMethod.invoke(applicationVariant) as String
    }

    @Suppress("UNCHECKED_CAST")
    fun getProductFlavors(): List<ProductFlavorWrapper> {
        return (getProductFlavorsMethod.invoke(applicationVariant) as List<Any>).map {
            ProductFlavorWrapper(
                it)
        }
    }

    fun getBuildType(): AndroidBuildTypeWrapper {
        return AndroidBuildTypeWrapper(getBuildTypeMethod.invoke(applicationVariant))
    }
}