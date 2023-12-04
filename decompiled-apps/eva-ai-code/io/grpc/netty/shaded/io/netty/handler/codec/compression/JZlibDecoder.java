package io.grpc.netty.shaded.io.netty.handler.codec.compression;

import com.jcraft.jzlib.Inflater;
import com.jcraft.jzlib.JZlib;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.util.List;
/* loaded from: classes4.dex */
public class JZlibDecoder extends ZlibDecoder {
    private byte[] dictionary;
    private volatile boolean finished;
    private final Inflater z;

    public JZlibDecoder() {
        this(ZlibWrapper.ZLIB, 0);
    }

    public JZlibDecoder(int i) {
        this(ZlibWrapper.ZLIB, i);
    }

    public JZlibDecoder(ZlibWrapper zlibWrapper) {
        this(zlibWrapper, 0);
    }

    public JZlibDecoder(ZlibWrapper zlibWrapper, int i) {
        super(i);
        Inflater inflater = new Inflater();
        this.z = inflater;
        ObjectUtil.checkNotNull(zlibWrapper, "wrapper");
        int init = inflater.init(ZlibUtil.convertWrapperType(zlibWrapper));
        if (init != 0) {
            ZlibUtil.fail(inflater, "initialization failure", init);
        }
    }

    public JZlibDecoder(byte[] bArr) {
        this(bArr, 0);
    }

    public JZlibDecoder(byte[] bArr, int i) {
        super(i);
        Inflater inflater = new Inflater();
        this.z = inflater;
        this.dictionary = (byte[]) ObjectUtil.checkNotNull(bArr, "dictionary");
        int inflateInit = inflater.inflateInit(JZlib.W_ZLIB);
        if (inflateInit != 0) {
            ZlibUtil.fail(inflater, "initialization failure", inflateInit);
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.compression.ZlibDecoder
    public boolean isClosed() {
        return this.finished;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (this.finished) {
            byteBuf.skipBytes(byteBuf.readableBytes());
            return;
        }
        int readableBytes = byteBuf.readableBytes();
        if (readableBytes == 0) {
            return;
        }
        try {
            this.z.avail_in = readableBytes;
            if (byteBuf.hasArray()) {
                this.z.next_in = byteBuf.array();
                this.z.next_in_index = byteBuf.arrayOffset() + byteBuf.readerIndex();
            } else {
                byte[] bArr = new byte[readableBytes];
                byteBuf.getBytes(byteBuf.readerIndex(), bArr);
                this.z.next_in = bArr;
                this.z.next_in_index = 0;
            }
            int i = this.z.next_in_index;
            ByteBuf prepareDecompressBuffer = prepareDecompressBuffer(channelHandlerContext, null, readableBytes << 1);
            while (true) {
                prepareDecompressBuffer = prepareDecompressBuffer(channelHandlerContext, prepareDecompressBuffer, this.z.avail_in << 1);
                this.z.avail_out = prepareDecompressBuffer.writableBytes();
                this.z.next_out = prepareDecompressBuffer.array();
                this.z.next_out_index = prepareDecompressBuffer.arrayOffset() + prepareDecompressBuffer.writerIndex();
                int i2 = this.z.next_out_index;
                int inflate = this.z.inflate(2);
                int i3 = this.z.next_out_index - i2;
                if (i3 > 0) {
                    prepareDecompressBuffer.writerIndex(prepareDecompressBuffer.writerIndex() + i3);
                }
                if (inflate != -5) {
                    if (inflate != 0) {
                        if (inflate == 1) {
                            this.finished = true;
                            this.z.inflateEnd();
                            break;
                        } else if (inflate == 2) {
                            byte[] bArr2 = this.dictionary;
                            if (bArr2 == null) {
                                ZlibUtil.fail(this.z, "decompression failure", inflate);
                            } else {
                                int inflateSetDictionary = this.z.inflateSetDictionary(bArr2, bArr2.length);
                                if (inflateSetDictionary != 0) {
                                    ZlibUtil.fail(this.z, "failed to set the dictionary", inflateSetDictionary);
                                }
                            }
                        } else {
                            ZlibUtil.fail(this.z, "decompression failure", inflate);
                        }
                    } else {
                        continue;
                    }
                } else if (this.z.avail_in <= 0) {
                    break;
                }
            }
            byteBuf.skipBytes(this.z.next_in_index - i);
            if (prepareDecompressBuffer.isReadable()) {
                list.add(prepareDecompressBuffer);
            } else {
                prepareDecompressBuffer.release();
            }
        } finally {
            this.z.next_in = null;
            this.z.next_out = null;
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.compression.ZlibDecoder
    protected void decompressionBufferExhausted(ByteBuf byteBuf) {
        this.finished = true;
    }
}
