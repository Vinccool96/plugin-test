import com.intellij.codeInsight.documentation.DocumentationManager

class DocumentationProviderTest : PluginTestCaseBase() {

    fun testDocumentation() {
        myFixture.configureByFiles("JavaClass.java")
        val originalElement = myFixture.elementAtCaret

        var element = DocumentationManager.getInstance(project)
            .findTargetElement(myFixture.editor, originalElement.containingFile, originalElement)
        if (element == null) {
            element = originalElement;
        }
        val documentationProvider = DocumentationManager.getProviderFromElement(element)
        val generateDoc = documentationProvider.generateDoc(element, originalElement)
        val a = 1 + 2
    }

}