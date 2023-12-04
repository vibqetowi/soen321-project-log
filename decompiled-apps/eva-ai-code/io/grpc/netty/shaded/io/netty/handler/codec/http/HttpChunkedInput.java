package io.grpc.netty.shaded.io.netty.handler.codec.http;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.stream.ChunkedInput;
/* loaded from: classes4.dex */
public class HttpChunkedInput implements ChunkedInput<HttpContent> {
    private final ChunkedInput<ByteBuf> input;
    private final LastHttpContent lastHttpContent;
    private boolean sentLastChunk;

    public HttpChunkedInput(ChunkedInput<ByteBuf> chunkedInput) {
        this.input = chunkedInput;
        this.lastHttpContent = LastHttpContent.EMPTY_LAST_CONTENT;
    }

    public HttpChunkedInput(ChunkedInput<ByteBuf> chunkedInput, LastHttpContent lastHttpContent) {
        this.input = chunkedInput;
        this.lastHttpContent = lastHttpContent;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.stream.ChunkedInput
    public boolean isEndOfInput() throws Exception {
        if (this.input.isEndOfInput()) {
            return this.sentLastChunk;
        }
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.stream.ChunkedInput
    public void close() throws Exception {
        this.input.close();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.grpc.netty.shaded.io.netty.handler.stream.ChunkedInput
    @Deprecated
    public HttpContent readChunk(ChannelHandlerContext channelHandlerContext) throws Exception {
        return readChunk(channelHandlerContext.alloc());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.grpc.netty.shaded.io.netty.handler.stream.ChunkedInput
    public HttpContent readChunk(ByteBufAllocator byteBufAllocator) throws Exception {
        if (this.input.isEndOfInput()) {
            if (this.sentLastChunk) {
                return null;
            }
            this.sentLastChunk = true;
            return this.lastHttpContent;
        }
        ByteBuf readChunk = this.input.readChunk(byteBufAllocator);
        if (readChunk == null) {
            return null;
        }
        return new DefaultHttpContent(readChunk);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.stream.ChunkedInput
    public long length() {
        return this.input.length();
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.stream.ChunkedInput
    public long progress() {
        return this.input.progress();
    }
}
