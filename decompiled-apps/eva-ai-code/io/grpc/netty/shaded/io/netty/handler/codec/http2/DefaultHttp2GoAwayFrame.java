package io.grpc.netty.shaded.io.netty.handler.codec.http2;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder;
import io.grpc.netty.shaded.io.netty.buffer.Unpooled;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
/* loaded from: classes4.dex */
public final class DefaultHttp2GoAwayFrame extends DefaultByteBufHolder implements Http2GoAwayFrame {
    private final long errorCode;
    private int extraStreamIds;
    private final int lastStreamId;

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Frame
    public String name() {
        return "GOAWAY";
    }

    public DefaultHttp2GoAwayFrame(Http2Error http2Error) {
        this(http2Error.code());
    }

    public DefaultHttp2GoAwayFrame(long j) {
        this(j, Unpooled.EMPTY_BUFFER);
    }

    public DefaultHttp2GoAwayFrame(Http2Error http2Error, ByteBuf byteBuf) {
        this(http2Error.code(), byteBuf);
    }

    public DefaultHttp2GoAwayFrame(long j, ByteBuf byteBuf) {
        this(-1, j, byteBuf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultHttp2GoAwayFrame(int i, long j, ByteBuf byteBuf) {
        super(byteBuf);
        this.errorCode = j;
        this.lastStreamId = i;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2GoAwayFrame
    public long errorCode() {
        return this.errorCode;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2GoAwayFrame
    public int extraStreamIds() {
        return this.extraStreamIds;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2GoAwayFrame
    public Http2GoAwayFrame setExtraStreamIds(int i) {
        ObjectUtil.checkPositiveOrZero(i, "extraStreamIds");
        this.extraStreamIds = i;
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2GoAwayFrame
    public int lastStreamId() {
        return this.lastStreamId;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    public Http2GoAwayFrame copy() {
        return new DefaultHttp2GoAwayFrame(this.lastStreamId, this.errorCode, content().copy());
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    public Http2GoAwayFrame duplicate() {
        return (Http2GoAwayFrame) super.duplicate();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    public Http2GoAwayFrame retainedDuplicate() {
        return (Http2GoAwayFrame) super.retainedDuplicate();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    public Http2GoAwayFrame replace(ByteBuf byteBuf) {
        return new DefaultHttp2GoAwayFrame(this.errorCode, byteBuf).setExtraStreamIds(this.extraStreamIds);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public Http2GoAwayFrame retain() {
        super.retain();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public Http2GoAwayFrame retain(int i) {
        super.retain(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public Http2GoAwayFrame touch() {
        super.touch();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public Http2GoAwayFrame touch(Object obj) {
        super.touch(obj);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder
    public boolean equals(Object obj) {
        if (obj instanceof DefaultHttp2GoAwayFrame) {
            DefaultHttp2GoAwayFrame defaultHttp2GoAwayFrame = (DefaultHttp2GoAwayFrame) obj;
            return this.errorCode == defaultHttp2GoAwayFrame.errorCode && this.extraStreamIds == defaultHttp2GoAwayFrame.extraStreamIds && super.equals(defaultHttp2GoAwayFrame);
        }
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder
    public int hashCode() {
        long j = this.errorCode;
        return (((super.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.extraStreamIds;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.DefaultByteBufHolder
    public String toString() {
        return StringUtil.simpleClassName(this) + "(errorCode=" + this.errorCode + ", content=" + content() + ", extraStreamIds=" + this.extraStreamIds + ", lastStreamId=" + this.lastStreamId + ')';
    }
}
