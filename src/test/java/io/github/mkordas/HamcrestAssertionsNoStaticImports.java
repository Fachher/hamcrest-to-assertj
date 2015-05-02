package io.github.mkordas;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

public class HamcrestAssertionsNoStaticImports {
    @Test
    public void noStaticImports() {
        Assert.assertThat(1, Is.is(1));
        Assert.assertThat(2, IsEqual.equalTo(2));
        Assert.assertThat(3, Matchers.is(3));
        Assert.assertThat(4, CoreMatchers.is(4));
    }
}