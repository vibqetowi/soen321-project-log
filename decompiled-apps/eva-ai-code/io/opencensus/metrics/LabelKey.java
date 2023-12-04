package io.opencensus.metrics;
/* loaded from: classes4.dex */
public abstract class LabelKey {
    public abstract String getDescription();

    public abstract String getKey();

    public static LabelKey create(String str, String str2) {
        return new AutoValue_LabelKey(str, str2);
    }
}
