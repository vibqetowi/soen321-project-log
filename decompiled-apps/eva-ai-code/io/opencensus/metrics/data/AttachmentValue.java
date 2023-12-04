package io.opencensus.metrics.data;
/* loaded from: classes4.dex */
public abstract class AttachmentValue {
    public abstract String getValue();

    /* loaded from: classes4.dex */
    public static abstract class AttachmentValueString extends AttachmentValue {
        public static AttachmentValueString create(String str) {
            return new AutoValue_AttachmentValue_AttachmentValueString(str);
        }
    }
}
