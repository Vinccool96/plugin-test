import com.intellij.testFramework.fixtures.BasePlatformTestCase

abstract class PluginTestCaseBase : BasePlatformTestCase() {

    override fun getTestDataPath(): String {
        return "src/test/resources/testData"
    }

}