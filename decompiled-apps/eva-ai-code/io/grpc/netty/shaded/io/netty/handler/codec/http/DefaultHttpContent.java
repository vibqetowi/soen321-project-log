package io.grpc.netty.shaded.io.netty.handler.codec.http;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
/* loaded from: classes4.dex */
public class DefaultHttpContent extends DefaultHttpObject implements HttpContent {
    private final ByteBuf content;

    public DefaultHttpContent(ByteBuf byteBuf) {
        this.content = (ByteBuf) ObjectUtil.checkNotNull(byteBuf, FirebaseAnalytics.Param.CONTENT);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    public ByteBuf content() {
        return this.content;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpContent, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    public HttpContent copy() {
        return replace(this.content.copy());
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpContent, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    public HttpContent duplicate() {
        return replace(this.content.duplicate());
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpContent, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    public HttpContent retainedDuplicate() {
        return replace(this.content.retainedDuplicate());
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpContent, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder
    public HttpContent replace(ByteBuf byteBuf) {
        return new DefaultHttpContent(byteBuf);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public int refCnt() {
        return this.content.refCnt();
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpContent, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public HttpContent retain() {
        this.content.retain();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpContent, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public HttpContent retain(int i) {
        this.content.retain(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpContent, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public HttpContent touch() {
        this.content.touch();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpContent, io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public HttpContent touch(Object obj) {
        this.content.touch(obj);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public boolean release() {
        return this.content.release();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public boolean release(int i) {
        return this.content.release(i);
    }

    public String toString() {
        return StringUtil.simpleClassName(this) + "(data: " + content() + ", decoderResult: " + decoderResult() + ')';
    }
}
