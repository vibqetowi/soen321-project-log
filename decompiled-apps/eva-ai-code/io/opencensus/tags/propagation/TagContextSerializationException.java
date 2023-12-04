package io.opencensus.tags.propagation;
/* loaded from: classes4.dex */
public final class TagContextSerializationException extends Exception {
    private static final long serialVersionUID = 0;

    public TagContextSerializationException(String str) {
        super(str);
    }

    public TagContextSerializationException(String str, Throwable th) {
        super(str, th);
    }
}
