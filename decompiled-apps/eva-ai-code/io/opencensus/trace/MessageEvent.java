package io.opencensus.trace;

import io.opencensus.internal.Utils;
import io.opencensus.trace.AutoValue_MessageEvent;
/* loaded from: classes4.dex */
public abstract class MessageEvent extends BaseMessageEvent {

    /* loaded from: classes4.dex */
    public static abstract class Builder {
        public abstract MessageEvent build();

        public abstract Builder setCompressedMessageSize(long j);

        abstract Builder setMessageId(long j);

        abstract Builder setType(Type type);

        public abstract Builder setUncompressedMessageSize(long j);
    }

    /* loaded from: classes4.dex */
    public enum Type {
        SENT,
        RECEIVED
    }

    public abstract long getCompressedMessageSize();

    public abstract long getMessageId();

    public abstract Type getType();

    public abstract long getUncompressedMessageSize();

    public static Builder builder(Type type, long j) {
        return new AutoValue_MessageEvent.Builder().setType((Type) Utils.checkNotNull(type, "type")).setMessageId(j).setUncompressedMessageSize(0L).setCompressedMessageSize(0L);
    }
}
