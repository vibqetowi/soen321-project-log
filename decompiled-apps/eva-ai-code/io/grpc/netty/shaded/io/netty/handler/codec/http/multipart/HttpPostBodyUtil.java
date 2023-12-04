package io.grpc.netty.shaded.io.netty.handler.codec.http.multipart;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaders;
/* loaded from: classes4.dex */
final class HttpPostBodyUtil {
    public static final String DEFAULT_BINARY_CONTENT_TYPE = "application/octet-stream";
    public static final String DEFAULT_TEXT_CONTENT_TYPE = "text/plain";
    public static final int chunkSize = 8096;

    /* loaded from: classes4.dex */
    public enum TransferEncodingMechanism {
        BIT7("7bit"),
        BIT8("8bit"),
        BINARY(HttpHeaders.Values.BINARY);
        
        private final String value;

        TransferEncodingMechanism(String str) {
            this.value = str;
        }

        public String value() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    private HttpPostBodyUtil() {
    }

    /* loaded from: classes4.dex */
    static class SeekAheadOptimize {
        ByteBuf buffer;
        byte[] bytes;
        int limit;
        int origPos;
        int pos;
        int readerIndex;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SeekAheadOptimize(ByteBuf byteBuf) {
            if (!byteBuf.hasArray()) {
                throw new IllegalArgumentException("buffer hasn't backing byte array");
            }
            this.buffer = byteBuf;
            this.bytes = byteBuf.array();
            this.readerIndex = byteBuf.readerIndex();
            int arrayOffset = byteBuf.arrayOffset() + this.readerIndex;
            this.pos = arrayOffset;
            this.origPos = arrayOffset;
            this.limit = byteBuf.arrayOffset() + byteBuf.writerIndex();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void setReadPosition(int i) {
            int i2 = this.pos - i;
            this.pos = i2;
            int readPosition = getReadPosition(i2);
            this.readerIndex = readPosition;
            this.buffer.readerIndex(readPosition);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getReadPosition(int i) {
            return (i - this.origPos) + this.readerIndex;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int findNonWhitespace(String str, int i) {
        while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int findEndOfString(String str) {
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return length;
    }
}
