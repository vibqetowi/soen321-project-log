package io.grpc.netty.shaded.io.netty.handler.codec.http2;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import io.grpc.netty.shaded.io.netty.util.ByteProcessor;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class HpackHuffmanEncoder {
    private final int[] codes;
    private final EncodeProcessor encodeProcessor;
    private final EncodedLengthProcessor encodedLengthProcessor;
    private final byte[] lengths;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HpackHuffmanEncoder() {
        this(HpackUtil.HUFFMAN_CODES, HpackUtil.HUFFMAN_CODE_LENGTHS);
    }

    private HpackHuffmanEncoder(int[] iArr, byte[] bArr) {
        this.encodedLengthProcessor = new EncodedLengthProcessor();
        this.encodeProcessor = new EncodeProcessor();
        this.codes = iArr;
        this.lengths = bArr;
    }

    public void encode(ByteBuf byteBuf, CharSequence charSequence) {
        ObjectUtil.checkNotNull(byteBuf, "out");
        if (charSequence instanceof AsciiString) {
            AsciiString asciiString = (AsciiString) charSequence;
            try {
                try {
                    this.encodeProcessor.out = byteBuf;
                    asciiString.forEachByte(this.encodeProcessor);
                } catch (Exception e) {
                    PlatformDependent.throwException(e);
                }
                return;
            } finally {
                this.encodeProcessor.end();
            }
        }
        encodeSlowPath(byteBuf, charSequence);
    }

    private void encodeSlowPath(ByteBuf byteBuf, CharSequence charSequence) {
        long j = 0;
        int i = 0;
        byte b = 0;
        while (i < charSequence.length()) {
            int charAt = charSequence.charAt(i) & 255;
            int i2 = this.codes[charAt];
            byte b2 = this.lengths[charAt];
            j = (j << b2) | i2;
            int i3 = b + b2;
            while (i3 >= 8) {
                i3 = (i3 == 1 ? 1 : 0) - 8;
                byteBuf.writeByte((int) (j >> i3));
            }
            i++;
            b = i3;
        }
        if (b > 0) {
            byteBuf.writeByte((int) ((j << (8 - b)) | (255 >>> b)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEncodedLength(CharSequence charSequence) {
        if (charSequence instanceof AsciiString) {
            AsciiString asciiString = (AsciiString) charSequence;
            try {
                this.encodedLengthProcessor.reset();
                asciiString.forEachByte(this.encodedLengthProcessor);
                return this.encodedLengthProcessor.length();
            } catch (Exception e) {
                PlatformDependent.throwException(e);
                return -1;
            }
        }
        return getEncodedLengthSlowPath(charSequence);
    }

    private int getEncodedLengthSlowPath(CharSequence charSequence) {
        long j = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            j += this.lengths[charSequence.charAt(i) & 255];
        }
        return (int) ((j + 7) >> 3);
    }

    /* loaded from: classes4.dex */
    private final class EncodeProcessor implements ByteProcessor {
        private long current;
        private int n;
        ByteBuf out;

        private EncodeProcessor() {
        }

        @Override // io.grpc.netty.shaded.io.netty.util.ByteProcessor
        public boolean process(byte b) {
            int i;
            byte b2 = HpackHuffmanEncoder.this.lengths[b & 255];
            long j = this.current << b2;
            this.current = j;
            this.current = j | HpackHuffmanEncoder.this.codes[i];
            this.n += b2;
            while (true) {
                int i2 = this.n;
                if (i2 < 8) {
                    return true;
                }
                int i3 = i2 - 8;
                this.n = i3;
                this.out.writeByte((int) (this.current >> i3));
            }
        }

        void end() {
            try {
                int i = this.n;
                if (i > 0) {
                    long j = (this.current << (8 - i)) | (255 >>> i);
                    this.current = j;
                    this.out.writeByte((int) j);
                }
            } finally {
                this.out = null;
                this.current = 0L;
                this.n = 0;
            }
        }
    }

    /* loaded from: classes4.dex */
    private final class EncodedLengthProcessor implements ByteProcessor {
        private long len;

        private EncodedLengthProcessor() {
        }

        @Override // io.grpc.netty.shaded.io.netty.util.ByteProcessor
        public boolean process(byte b) {
            this.len += HpackHuffmanEncoder.this.lengths[b & 255];
            return true;
        }

        void reset() {
            this.len = 0L;
        }

        int length() {
            return (int) ((this.len + 7) >> 3);
        }
    }
}
