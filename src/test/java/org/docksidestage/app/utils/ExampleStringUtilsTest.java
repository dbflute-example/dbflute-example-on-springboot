package org.docksidestage.app.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

// ExampleStringUtilsはPOJOなので、JUnitテストの起動のためのアノテーションは必要ない
public class ExampleStringUtilsTest {

    @Test
    public void test_whenTargetStringIsNull_returnsFalse() {
        assertThat(ExampleStringUtils.isNotEmpty(null), is(false));
    }

    @Test
    public void test_whenTargetStringIsZeroLengthEmptyString_returnsFalse() {
        assertThat(ExampleStringUtils.isNotEmpty(""), is(false));
    }

    @Test
    public void test_whenTargetStringIsNonZeroLengthEmptyString_returnsTrue() {
        assertThat(ExampleStringUtils.isNotEmpty(" "), is(true));
    }

    @Test
    public void test_whenTargetStringIsNonEmptyString_returnsTrue() {
        assertThat(ExampleStringUtils.isNotEmpty("Test"), is(true));
        assertThat(ExampleStringUtils.isNotEmpty(" Test"), is(true));
    }
}
