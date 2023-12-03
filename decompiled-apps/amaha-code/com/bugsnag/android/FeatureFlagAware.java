package com.bugsnag.android;
/* loaded from: classes.dex */
interface FeatureFlagAware {
    void addFeatureFlag(String str);

    void addFeatureFlag(String str, String str2);

    void addFeatureFlags(Iterable<FeatureFlag> iterable);

    void clearFeatureFlag(String str);

    void clearFeatureFlags();
}
