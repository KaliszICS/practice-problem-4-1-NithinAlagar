import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;

public class PracticeProblemTest {

    // =========================================================
    // Tests for seriesInclusive
    // =========================================================

    @Test
    @DisplayName("seriesInclusive(5) should return '1 2 3 4 5'")
    void seriesInclusiveTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesInclusive", cArg);
            assertEquals("1 2 3 4 5", (String) method.invoke(null, 5));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesInclusive(10) should return '1 2 3 4 5 6 7 8 9 10'")
    void seriesInclusiveTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesInclusive", cArg);
            assertEquals("1 2 3 4 5 6 7 8 9 10", (String) method.invoke(null, 10));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesInclusive(1) should return '1'")
    void seriesInclusiveTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesInclusive", cArg);
            assertEquals("1", (String) method.invoke(null, 1));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesInclusive(0) should return '' (empty string)")
    void seriesInclusiveTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesInclusive", cArg);
            assertEquals("", (String) method.invoke(null, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesInclusive(-5) should return '' (empty string)")
    void seriesInclusiveTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesInclusive", cArg);
            assertEquals("", (String) method.invoke(null, -5));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesInclusive(-1) should return '' (empty string)")
    void seriesInclusiveTest6() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesInclusive", cArg);
            assertEquals("", (String) method.invoke(null, -1));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesInclusive(3) should return '1 2 3'")
    void seriesInclusiveTest7() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesInclusive", cArg);
            assertEquals("1 2 3", (String) method.invoke(null, 3));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesInclusive(3) should not have a trailing space")
    void seriesInclusiveTest8() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesInclusive", cArg);
            String result = (String) method.invoke(null, 3);
            assertFalse(result.endsWith(" "), "Result should not end with a space");
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // =========================================================
    // Tests for seriesExclusive
    // =========================================================

    @Test
    @DisplayName("seriesExclusive(5) should return '0 1 2 3 4'")
    void seriesExclusiveTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesExclusive", cArg);
            assertEquals("0 1 2 3 4", (String) method.invoke(null, 5));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesExclusive(10) should return '0 1 2 3 4 5 6 7 8 9'")
    void seriesExclusiveTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesExclusive", cArg);
            assertEquals("0 1 2 3 4 5 6 7 8 9", (String) method.invoke(null, 10));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesExclusive(1) should return '0'")
    void seriesExclusiveTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesExclusive", cArg);
            assertEquals("0", (String) method.invoke(null, 1));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesExclusive(0) should return '' (empty string)")
    void seriesExclusiveTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesExclusive", cArg);
            assertEquals("", (String) method.invoke(null, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesExclusive(-5) should return '' (empty string)")
    void seriesExclusiveTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesExclusive", cArg);
            assertEquals("", (String) method.invoke(null, -5));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesExclusive(-1) should return '' (empty string)")
    void seriesExclusiveTest6() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesExclusive", cArg);
            assertEquals("", (String) method.invoke(null, -1));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesExclusive(3) should return '0 1 2'")
    void seriesExclusiveTest7() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesExclusive", cArg);
            assertEquals("0 1 2", (String) method.invoke(null, 3));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("seriesExclusive(3) should not have a trailing space")
    void seriesExclusiveTest8() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("seriesExclusive", cArg);
            String result = (String) method.invoke(null, 3);
            assertFalse(result.endsWith(" "), "Result should not end with a space");
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }
}