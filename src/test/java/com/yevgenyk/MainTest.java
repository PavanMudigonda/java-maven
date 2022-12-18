package com.yevgenyk;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

/**
 * Main class tests template.
 *
 * @author Yevgeny Kuznetsov
 * @since 1.0.0, 19 August 2019
 **/
public class MainTest {

    @Test
    public void shouldBeTrue() {
        Main.main(new String[0]);
        assertThat("true is not true", true, is(true));
    }

    @Test
    public void shouldHaveTempProperty() {
        assertThat("System property is missing", Main.loadPropertiesFromFile(Main.PROPERTIES_FILE).isEmpty(),
                is(false));
    }
}
