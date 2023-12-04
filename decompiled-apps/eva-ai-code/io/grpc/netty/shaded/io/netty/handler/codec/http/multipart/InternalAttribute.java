package io.grpc.netty.shaded.io.netty.handler.codec.http.multipart;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.Unpooled;
import io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpData;
import io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
final class InternalAttribute extends AbstractReferenceCounted implements InterfaceHttpData {
    private final Charset charset;
    private int size;
    private final List<ByteBuf> value = new ArrayList();

    @Override // io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted
    protected void deallocate() {
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpData
    public String getName() {
        return "InternalAttribute";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InternalAttribute(Charset charset) {
        this.charset = charset;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpData
    public InterfaceHttpData.HttpDataType getHttpDataType() {
        return InterfaceHttpData.HttpDataType.InternalAttribute;
    }

    public void addValue(String str) {
        ObjectUtil.checkNotNull(str, "value");
        ByteBuf copiedBuffer = Unpooled.copiedBuffer(str, this.charset);
        this.value.add(copiedBuffer);
        this.size += copiedBuffer.readableBytes();
    }

    public void addValue(String str, int i) {
        ObjectUtil.checkNotNull(str, "value");
        ByteBuf copiedBuffer = Unpooled.copiedBuffer(str, this.charset);
        this.value.add(i, copiedBuffer);
        this.size += copiedBuffer.readableBytes();
    }

    public void setValue(String str, int i) {
        ObjectUtil.checkNotNull(str, "value");
        ByteBuf copiedBuffer = Unpooled.copiedBuffer(str, this.charset);
        ByteBuf byteBuf = this.value.set(i, copiedBuffer);
        if (byteBuf != null) {
            this.size -= byteBuf.readableBytes();
            byteBuf.release();
        }
        this.size += copiedBuffer.readableBytes();
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof InternalAttribute) {
            return getName().equalsIgnoreCase(((InternalAttribute) obj).getName());
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(InterfaceHttpData interfaceHttpData) {
        if (!(interfaceHttpData instanceof InternalAttribute)) {
            throw new ClassCastException("Cannot compare " + getHttpDataType() + " with " + interfaceHttpData.getHttpDataType());
        }
        return compareTo((InternalAttribute) interfaceHttpData);
    }

    public int compareTo(InternalAttribute internalAttribute) {
        return getName().compareToIgnoreCase(internalAttribute.getName());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ByteBuf byteBuf : this.value) {
            sb.append(byteBuf.toString(this.charset));
        }
        return sb.toString();
    }

    public int size() {
        return this.size;
    }

    public ByteBuf toByteBuf() {
        return Unpooled.compositeBuffer().addComponents(this.value).writerIndex(size()).readerIndex(0);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public InterfaceHttpData retain() {
        for (ByteBuf byteBuf : this.value) {
            byteBuf.retain();
        }
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public InterfaceHttpData retain(int i) {
        for (ByteBuf byteBuf : this.value) {
            byteBuf.retain(i);
        }
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public InterfaceHttpData touch() {
        for (ByteBuf byteBuf : this.value) {
            byteBuf.touch();
        }
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public InterfaceHttpData touch(Object obj) {
        for (ByteBuf byteBuf : this.value) {
            byteBuf.touch(obj);
        }
        return this;
    }
}
