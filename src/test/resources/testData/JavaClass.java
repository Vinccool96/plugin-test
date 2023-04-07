/**
 * A test class
 * {@link #testMethod()}
 * {@link #testMethod(boolean)}
 * {@link #testMethod(String)}
 * {@link #testMethod(String, boolean)}
 */
class JavaClass<caret> {

    /**
     * A test method without arguments
     */
    public void testMethod() {
    }

    /**
     * A test method with one string argument
     *
     * @param string the {@link String} argument
     */
    public void testMethod(String string) {
    }

    /**
     * A test method with one boolean argument
     *
     * @param b the {@link Boolean} argument
     */
    public void testMethod(boolean b) {
    }

    /**
     * A test method with two arguments
     *
     * @param string the {@link String} argument
     * @param b      the {@link Boolean} argument
     */
    public void testMethod(String string, boolean b) {
    }

}