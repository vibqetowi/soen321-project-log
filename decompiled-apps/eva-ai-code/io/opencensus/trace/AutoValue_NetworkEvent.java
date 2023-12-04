package io.opencensus.trace;

import io.opencensus.common.Timestamp;
import io.opencensus.trace.NetworkEvent;
import javax.annotation.Nullable;
@Deprecated
/* loaded from: classes4.dex */
final class AutoValue_NetworkEvent extends NetworkEvent {
    private final long compressedMessageSize;
    private final Timestamp kernelTimestamp;
    private final long messageId;
    private final NetworkEvent.Type type;
    private final long uncompressedMessageSize;

    private AutoValue_NetworkEvent(@Nullable Timestamp timestamp, NetworkEvent.Type type, long j, long j2, long j3) {
        this.kernelTimestamp = timestamp;
        this.type = type;
        this.messageId = j;
        this.uncompressedMessageSize = j2;
        this.compressedMessageSize = j3;
    }

    @Override // io.opencensus.trace.NetworkEvent
    @Nullable
    public Timestamp getKernelTimestamp() {
        return this.kernelTimestamp;
    }

    @Override // io.opencensus.trace.NetworkEvent
    public NetworkEvent.Type getType() {
        return this.type;
    }

    @Override // io.opencensus.trace.NetworkEvent
    public long getMessageId() {
        return this.messageId;
    }

    @Override // io.opencensus.trace.NetworkEvent
    public long getUncompressedMessageSize() {
        return this.uncompressedMessageSize;
    }

    @Override // io.opencensus.trace.NetworkEvent
    public long getCompressedMessageSize() {
        return this.compressedMessageSize;
    }

    public String toString() {
        return "NetworkEvent{kernelTimestamp=" + this.kernelTimestamp + ", type=" + this.type + ", messageId=" + this.messageId + ", uncompressedMessageSize=" + this.uncompressedMessageSize + ", compressedMessageSize=" + this.compressedMessageSize + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkEvent) {
            NetworkEvent networkEvent = (NetworkEvent) obj;
            Timestamp timestamp = this.kernelTimestamp;
            if (timestamp != null ? timestamp.equals(networkEvent.getKernelTimestamp()) : networkEvent.getKernelTimestamp() == null) {
                if (this.type.equals(networkEvent.getType()) && this.messageId == networkEvent.getMessageId() && this.uncompressedMessageSize == networkEvent.getUncompressedMessageSize() && this.compressedMessageSize == networkEvent.getCompressedMessageSize()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Timestamp timestamp = this.kernelTimestamp;
        int hashCode = timestamp == null ? 0 : timestamp.hashCode();
        long j = this.messageId;
        long j2 = this.uncompressedMessageSize;
        long j3 = this.compressedMessageSize;
        return (int) ((((int) ((((int) (((((hashCode ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ (j ^ (j >>> 32)))) * 1000003) ^ (j2 ^ (j2 >>> 32)))) * 1000003) ^ (j3 ^ (j3 >>> 32)));
    }

    /* loaded from: classes4.dex */
    static final class Builder extends NetworkEvent.Builder {
        private Long compressedMessageSize;
        private Timestamp kernelTimestamp;
        private Long messageId;
        private NetworkEvent.Type type;
        private Long uncompressedMessageSize;

        @Override // io.opencensus.trace.NetworkEvent.Builder
        public NetworkEvent.Builder setKernelTimestamp(@Nullable Timestamp timestamp) {
            this.kernelTimestamp = timestamp;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.opencensus.trace.NetworkEvent.Builder
        public NetworkEvent.Builder setType(NetworkEvent.Type type) {
            if (type == null) {
                throw new NullPointerException("Null type");
            }
            this.type = type;
            return this;
        }

        @Override // io.opencensus.trace.NetworkEvent.Builder
        NetworkEvent.Builder setMessageId(long j) {
            this.messageId = Long.valueOf(j);
            return this;
        }

        @Override // io.opencensus.trace.NetworkEvent.Builder
        public NetworkEvent.Builder setUncompressedMessageSize(long j) {
            this.uncompressedMessageSize = Long.valueOf(j);
            return this;
        }

        @Override // io.opencensus.trace.NetworkEvent.Builder
        public NetworkEvent.Builder setCompressedMessageSize(long j) {
            this.compressedMessageSize = Long.valueOf(j);
            return this;
        }

        @Override // io.opencensus.trace.NetworkEvent.Builder
        public NetworkEvent build() {
            String str = this.type == null ? " type" : "";
            if (this.messageId == null) {
                str = str + " messageId";
            }
            if (this.uncompressedMessageSize == null) {
                str = str + " uncompressedMessageSize";
            }
            if (this.compressedMessageSize == null) {
                str = str + " compressedMessageSize";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_NetworkEvent(this.kernelTimestamp, this.type, this.messageId.longValue(), this.uncompressedMessageSize.longValue(), this.compressedMessageSize.longValue());
        }
    }
}
