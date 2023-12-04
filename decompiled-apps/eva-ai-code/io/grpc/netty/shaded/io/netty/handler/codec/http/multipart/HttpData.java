package io.grpc.netty.shaded.io.netty.handler.codec.http.multipart;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
/* loaded from: classes4.dex */
public interface HttpData extends InterfaceHttpData, ByteBufHolder {
    void addContent(ByteBuf byteBuf, boolean z) throws IOException;

    void checkSize(long j) throws IOException;

    HttpData copy();

    long definedLength();

    void delete();

    HttpData duplicate();

    byte[] get() throws IOException;

    ByteBuf getByteBuf() throws IOException;

    Charset getCharset();

    ByteBuf getChunk(int i) throws IOException;

    File getFile() throws IOException;

    long getMaxSize();

    String getString() throws IOException;

    String getString(Charset charset) throws IOException;

    boolean isCompleted();

    boolean isInMemory();

    long length();

    boolean renameTo(File file) throws IOException;

    HttpData replace(ByteBuf byteBuf);

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpData, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    HttpData retain();

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpData, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    HttpData retain(int i);

    HttpData retainedDuplicate();

    void setCharset(Charset charset);

    void setContent(ByteBuf byteBuf) throws IOException;

    void setContent(File file) throws IOException;

    void setContent(InputStream inputStream) throws IOException;

    void setMaxSize(long j);

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpData, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    HttpData touch();

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpData, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    HttpData touch(Object obj);
}
