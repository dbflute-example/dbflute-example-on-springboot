package org.docksidestage.app.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

// POJOのテストなので、JUnitテストの起動のためのアノテーションや継承は必要ない
public class ExampleStringUtilsIsEmptyTest {

    @Test
    public void test_whenTargetStringIsNull_returnsTrue() {
        assertThat(ExampleStringUtils.isEmpty(null), is(true));
    }

    @Test
    public void test_whenTargetStringIsZeroLengthEmptyString_returnsTrue() {
        assertThat(ExampleStringUtils.isEmpty(""), is(true));
    }

    @Test
    public void test_whenTargetStringIsNonZeroLengthEmptyString_returnsFalse() {
        assertThat(ExampleStringUtils.isEmpty(" "), is(false));
    }

    @Test
    public void test_whenTargetStringIsNonEmptyString_returnsFalse() {
        assertThat(ExampleStringUtils.isEmpty("Test"), is(false));
        assertThat(ExampleStringUtils.isEmpty(" Test"), is(false));
    }
}