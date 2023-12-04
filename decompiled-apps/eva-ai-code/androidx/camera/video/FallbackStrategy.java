package androidx.camera.video;
/* loaded from: classes.dex */
public class FallbackStrategy {
    static final int FALLBACK_RULE_HIGHER = 2;
    static final int FALLBACK_RULE_HIGHER_OR_LOWER = 1;
    static final int FALLBACK_RULE_LOWER = 4;
    static final int FALLBACK_RULE_LOWER_OR_HIGHER = 3;
    static final int FALLBACK_RULE_NONE = 0;
    static final FallbackStrategy NONE = new AutoValue_FallbackStrategy_RuleStrategy(Quality.NONE, 0);

    private FallbackStrategy() {
    }

    public static FallbackStrategy higherQualityOrLowerThan(Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 1);
    }

    public static FallbackStrategy higherQualityThan(Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 2);
    }

    public static FallbackStrategy lowerQualityOrHigherThan(Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 3);
    }

    public static FallbackStrategy lowerQualityThan(Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class RuleStrategy extends FallbackStrategy {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Quality getFallbackQuality();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int getFallbackRule();

        /* JADX INFO: Access modifiers changed from: package-private */
        public RuleStrategy() {
            super();
        }
    }
}
