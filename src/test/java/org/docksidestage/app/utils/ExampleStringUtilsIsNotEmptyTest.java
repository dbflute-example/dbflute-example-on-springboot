package org.docksidestage.app.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.docksidestage.bizfw.utils.ExampleStringUtils;
import org.junit.Test;

/**
 * @author y.shimizu
 */
// POJOのテストなので、JUnitテストの起動のためのアノテーションや継承は必要ない
public class ExampleStringUtilsIsNotEmptyTest {

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
