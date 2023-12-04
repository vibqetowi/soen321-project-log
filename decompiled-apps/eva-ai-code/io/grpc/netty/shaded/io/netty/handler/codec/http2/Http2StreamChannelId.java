package io.grpc.netty.shaded.io.netty.handler.codec.http2;

import io.grpc.netty.shaded.io.netty.channel.ChannelId;
/* loaded from: classes4.dex */
final class Http2StreamChannelId implements ChannelId {
    private static final long serialVersionUID = -6642338822166867585L;
    private final int id;
    private final ChannelId parentId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Http2StreamChannelId(ChannelId channelId, int i) {
        this.parentId = channelId;
        this.id = i;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelId
    public String asShortText() {
        return this.parentId.asShortText() + '/' + this.id;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelId
    public String asLongText() {
        return this.parentId.asLongText() + '/' + this.id;
    }

    @Override // java.lang.Comparable
    public int compareTo(ChannelId channelId) {
        if (channelId instanceof Http2StreamChannelId) {
            Http2StreamChannelId http2StreamChannelId = (Http2StreamChannelId) channelId;
            int compareTo = this.parentId.compareTo(http2StreamChannelId.parentId);
            return compareTo == 0 ? this.id - http2StreamChannelId.id : compareTo;
        }
        return this.parentId.compareTo(channelId);
    }

    public int hashCode() {
        return (this.id * 31) + this.parentId.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Http2StreamChannelId) {
            Http2StreamChannelId http2StreamChannelId = (Http2StreamChannelId) obj;
            return this.id == http2StreamChannelId.id && this.parentId.equals(http2StreamChannelId.parentId);
        }
        return false;
    }

    public String toString() {
        return asShortText();
    }
}
