package com.google.firebase.database.tubesock;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
class MessageBuilderFactory {

    /* loaded from: classes.dex */
    public static class BinaryBuilder implements Builder {
        private int pendingByteCount = 0;
        private List<byte[]> pendingBytes = new ArrayList();

        @Override // com.google.firebase.database.tubesock.MessageBuilderFactory.Builder
        public boolean appendBytes(byte[] bArr) {
            this.pendingBytes.add(bArr);
            this.pendingByteCount += bArr.length;
            return true;
        }

        @Override // com.google.firebase.database.tubesock.MessageBuilderFactory.Builder
        public WebSocketMessage toMessage() {
            byte[] bArr = new byte[this.pendingByteCount];
            int i6 = 0;
            for (int i10 = 0; i10 < this.pendingBytes.size(); i10++) {
                byte[] bArr2 = this.pendingBytes.get(i10);
                System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
                i6 += bArr2.length;
            }
            return new WebSocketMessage(bArr);
        }
    }

    /* loaded from: classes.dex */
    public interface Builder {
        boolean appendBytes(byte[] bArr);

        WebSocketMessage toMessage();
    }

    /* loaded from: classes.dex */
    public static class TextBuilder implements Builder {
        private static ThreadLocal<CharsetDecoder> localDecoder = new ThreadLocal<CharsetDecoder>() { // from class: com.google.firebase.database.tubesock.MessageBuilderFactory.TextBuilder.1
            @Override // java.lang.ThreadLocal
            public CharsetDecoder initialValue() {
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                newDecoder.onMalformedInput(CodingErrorAction.REPORT);
                newDecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newDecoder;
            }
        };
        private static ThreadLocal<CharsetEncoder> localEncoder = new ThreadLocal<CharsetEncoder>() { // from class: com.google.firebase.database.tubesock.MessageBuilderFactory.TextBuilder.2
            @Override // java.lang.ThreadLocal
            public CharsetEncoder initialValue() {
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                newEncoder.onMalformedInput(CodingErrorAction.REPORT);
                newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newEncoder;
            }
        };
        private StringBuilder builder = new StringBuilder();
        private ByteBuffer carryOver;

        private String decodeString(byte[] bArr) {
            try {
                return localDecoder.get().decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException unused) {
                return null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
            if (r6.remaining() <= 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
            r5.carryOver = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
            com.google.firebase.database.tubesock.MessageBuilderFactory.TextBuilder.localEncoder.get().encode(java.nio.CharBuffer.wrap(r2));
            r2.flip();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
            return r2.toString();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private String decodeStringStreaming(byte[] bArr) {
            try {
                ByteBuffer buffer = getBuffer(bArr);
                int remaining = (int) (buffer.remaining() * localDecoder.get().averageCharsPerByte());
                CharBuffer allocate = CharBuffer.allocate(remaining);
                while (true) {
                    CoderResult decode = localDecoder.get().decode(buffer, allocate, false);
                    if (decode.isError()) {
                        return null;
                    }
                    if (decode.isUnderflow()) {
                        break;
                    } else if (decode.isOverflow()) {
                        remaining = (remaining * 2) + 1;
                        CharBuffer allocate2 = CharBuffer.allocate(remaining);
                        allocate.flip();
                        allocate2.put(allocate);
                        allocate = allocate2;
                    }
                }
            } catch (CharacterCodingException unused) {
                return null;
            }
        }

        private ByteBuffer getBuffer(byte[] bArr) {
            ByteBuffer byteBuffer = this.carryOver;
            if (byteBuffer != null) {
                ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + bArr.length);
                allocate.put(this.carryOver);
                this.carryOver = null;
                allocate.put(bArr);
                allocate.flip();
                return allocate;
            }
            return ByteBuffer.wrap(bArr);
        }

        @Override // com.google.firebase.database.tubesock.MessageBuilderFactory.Builder
        public boolean appendBytes(byte[] bArr) {
            String decodeString = decodeString(bArr);
            if (decodeString != null) {
                this.builder.append(decodeString);
                return true;
            }
            return false;
        }

        @Override // com.google.firebase.database.tubesock.MessageBuilderFactory.Builder
        public WebSocketMessage toMessage() {
            if (this.carryOver != null) {
                return null;
            }
            return new WebSocketMessage(this.builder.toString());
        }
    }

    public static Builder builder(byte b10) {
        if (b10 == 2) {
            return new BinaryBuilder();
        }
        return new TextBuilder();
    }
}
