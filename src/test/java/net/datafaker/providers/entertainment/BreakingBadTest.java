package net.datafaker.providers.entertainment;

import java.util.Arrays;
import java.util.Collection;

class BreakingBadTest extends EntertainmentFakerTest {

    private final BreakingBad breakingBad = getFaker().breakingBad();

    @Override
    protected Collection<TestSpec> providerListTest() {
        return Arrays.asList(
            TestSpec.of(breakingBad::character, "breaking_bad.characters"),
            TestSpec.of(breakingBad::episode, "breaking_bad.episodes"));
    }
}
