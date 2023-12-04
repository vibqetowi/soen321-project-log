package com.ifriend.platform.tools.api.speech.voice;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: StreamingRecognize.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ifriend/platform/tools/api/speech/voice/StreamingRecognize;", "", "text", "", "isFinal", "", "(Ljava/lang/String;Z)V", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamingRecognize {
    private final boolean isFinal;
    private final String text;

    public static /* synthetic */ StreamingRecognize copy$default(StreamingRecognize streamingRecognize, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamingRecognize.text;
        }
        if ((i & 2) != 0) {
            z = streamingRecognize.isFinal;
        }
        return streamingRecognize.copy(str, z);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.isFinal;
    }

    public final StreamingRecognize copy(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new StreamingRecognize(text, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreamingRecognize) {
            StreamingRecognize streamingRecognize = (StreamingRecognize) obj;
            return Intrinsics.areEqual(this.text, streamingRecognize.text) && this.isFinal == streamingRecognize.isFinal;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        boolean z = this.isFinal;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.text;
        boolean z = this.isFinal;
        return "StreamingRecognize(text=" + str + ", isFinal=" + z + ")";
    }

    public StreamingRecognize(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.isFinal = z;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isFinal() {
        return this.isFinal;
    }
}
