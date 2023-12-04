package io.grpc.netty.shaded.io.netty.handler.codec.spdy;

import com.google.common.base.Ascii;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpConstants;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
final class SpdyCodecUtil {
    static final byte SPDY_DATA_FLAG_FIN = 1;
    static final int SPDY_DATA_FRAME = 0;
    static final byte[] SPDY_DICT = {0, 0, 0, 7, 111, 112, 116, 105, 111, 110, 115, 0, 0, 0, 4, 104, 101, 97, 100, 0, 0, 0, 4, 112, 111, 115, 116, 0, 0, 0, 3, 112, 117, 116, 0, 0, 0, 6, 100, 101, 108, 101, 116, 101, 0, 0, 0, 5, 116, 114, 97, 99, 101, 0, 0, 0, 6, 97, 99, 99, 101, 112, 116, 0, 0, 0, Ascii.SO, 97, 99, 99, 101, 112, 116, 45, 99, 104, 97, 114, 115, 101, 116, 0, 0, 0, Ascii.SI, 97, 99, 99, 101, 112, 116, 45, 101, 110, 99, 111, 100, 105, 110, 103, 0, 0, 0, Ascii.SI, 97, 99, 99, 101, 112, 116, 45, 108, 97, 110, 103, 117, 97, 103, 101, 0, 0, 0, 13, 97, 99, 99, 101, 112, 116, 45, 114, 97, 110, 103, 101, 115, 0, 0, 0, 3, 97, 103, 101, 0, 0, 0, 5, 97, 108, 108, 111, 119, 0, 0, 0, 13, 97, 117, 116, 104, 111, 114, 105, 122, 97, 116, 105, 111, 110, 0, 0, 0, 13, 99, 97, 99, 104, 101, 45, 99, 111, 110, 116, 114, 111, 108, 0, 0, 0, 10, 99, 111, 110, 110, 101, 99, 116, 105, 111, 110, 0, 0, 0, Ascii.FF, 99, 111, 110, 116, 101, 110, 116, 45, 98, 97, 115, 101, 0, 0, 0, Ascii.DLE, 99, 111, 110, 116, 101, 110, 116, 45, 101, 110, 99, 111, 100, 105, 110, 103, 0, 0, 0, Ascii.DLE, 99, 111, 110, 116, 101, 110, 116, 45, 108, 97, 110, 103, 117, 97, 103, 101, 0, 0, 0, Ascii.SO, 99, 111, 110, 116, 101, 110, 116, 45, 108, 101, 110, 103, 116, 104, 0, 0, 0, Ascii.DLE, 99, 111, 110, 116, 101, 110, 116, 45, 108, 111, 99, 97, 116, 105, 111, 110, 0, 0, 0, Ascii.VT, 99, 111, 110, 116, 101, 110, 116, 45, 109, 100, 53, 0, 0, 0, 13, 99, 111, 110, 116, 101, 110, 116, 45, 114, 97, 110, 103, 101, 0, 0, 0, Ascii.FF, 99, 111, 110, 116, 101, 110, 116, 45, 116, 121, 112, 101, 0, 0, 0, 4, 100, 97, 116, 101, 0, 0, 0, 4, 101, 116, 97, 103, 0, 0, 0, 6, 101, 120, 112, 101, 99, 116, 0, 0, 0, 7, 101, 120, 112, 105, 114, 101, 115, 0, 0, 0, 4, 102, 114, 111, 109, 0, 0, 0, 4, 104, 111, 115, 116, 0, 0, 0, 8, 105, 102, 45, 109, 97, 116, 99, 104, 0, 0, 0, 17, 105, 102, 45, 109, 111, 100, 105, 102, 105, 101, 100, 45, 115, 105, 110, 99, 101, 0, 0, 0, 13, 105, 102, 45, 110, 111, 110, 101, 45, 109, 97, 116, 99, 104, 0, 0, 0, 8, 105, 102, 45, 114, 97, 110, 103, 101, 0, 0, 0, 19, 105, 102, 45, 117, 110, 109, 111, 100, 105, 102, 105, 101, 100, 45, 115, 105, 110, 99, 101, 0, 0, 0, 13, 108, 97, 115, 116, 45, 109, 111, 100, 105, 102, 105, 101, 100, 0, 0, 0, 8, 108, 111, 99, 97, 116, 105, 111, 110, 0, 0, 0, Ascii.FF, 109, 97, 120, 45, 102, 111, 114, 119, 97, 114, 100, 115, 0, 0, 0, 6, 112, 114, 97, 103, 109, 97, 0, 0, 0, Ascii.DC2, 112, 114, 111, 120, 121, 45, 97, 117, 116, 104, 101, 110, 116, 105, 99, 97, 116, 101, 0, 0, 0, 19, 112, 114, 111, 120, 121, 45, 97, 117, 116, 104, 111, 114, 105, 122, 97, 116, 105, 111, 110, 0, 0, 0, 5, 114, 97, 110, 103, 101, 0, 0, 0, 7, 114, 101, 102, 101, 114, 101, 114, 0, 0, 0, Ascii.VT, 114, 101, 116, 114, 121, 45, 97, 102, 116, 101, 114, 0, 0, 0, 6, 115, 101, 114, 118, 101, 114, 0, 0, 0, 2, 116, 101, 0, 0, 0, 7, 116, 114, 97, 105, 108, 101, 114, 0, 0, 0, 17, 116, 114, 97, 110, 115, 102, 101, 114, 45, 101, 110, 99, 111, 100, 105, 110, 103, 0, 0, 0, 7, 117, 112, 103, 114, 97, 100, 101, 0, 0, 0, 10, 117, 115, 101, 114, 45, 97, 103, 101, 110, 116, 0, 0, 0, 4, 118, 97, 114, 121, 0, 0, 0, 3, 118, 105, 97, 0, 0, 0, 7, 119, 97, 114, 110, 105, 110, 103, 0, 0, 0, Ascii.DLE, 119, 119, 119, 45, 97, 117, 116, 104, 101, 110, 116, 105, 99, 97, 116, 101, 0, 0, 0, 6, 109, 101, 116, 104, 111, 100, 0, 0, 0, 3, 103, 101, 116, 0, 0, 0, 6, 115, 116, 97, 116, 117, 115, 0, 0, 0, 6, 50, 48, 48, 32, 79, 75, 0, 0, 0, 7, 118, 101, 114, 115, 105, 111, 110, 0, 0, 0, 8, 72, 84, 84, 80, 47, 49, 46, 49, 0, 0, 0, 3, 117, 114, 108, 0, 0, 0, 6, 112, 117, 98, 108, 105, 99, 0, 0, 0, 10, 115, 101, 116, 45, 99, 111, 111, 107, 105, 101, 0, 0, 0, 10, 107, 101, 101, 112, 45, 97, 108, 105, 118, 101, 0, 0, 0, 6, 111, 114, 105, 103, 105, 110, 49, 48, 48, 49, 48, 49, 50, 48, 49, 50, 48, 50, 50, 48, 53, 50, 48, 54, 51, 48, 48, 51, 48, 50, 51, 48, 51, 51, 48, 52, 51, 48, 53, 51, 48, 54, 51, 48, 55, 52, 48, 50, 52, 48, 53, 52, 48, 54, 52, 48, 55, 52, 48, 56, 52, 48, 57, 52, 49, 48, 52, 49, 49, 52, 49, 50, 52, 49, 51, 52, 49, 52, 52, 49, 53, 52, 49, 54, 52, 49, 55, 53, 48, 50, 53, 48, 52, 53, 48, 53, 50, 48, 51, 32, 78, 111, 110, 45, 65, 117, 116, 104, 111, 114, 105, 116, 97, 116, 105, 118, 101, 32, 73, 110, 102, 111, 114, 109, 97, 116, 105, 111, 110, 50, 48, 52, 32, 78, 111, 32, 67, 111, 110, 116, 101, 110, 116, 51, 48, 49, 32, 77, 111, 118, 101, 100, 32, 80, 101, 114, 109, 
    97, 110, 101, 110, 116, 108, 121, 52, 48, 48, 32, 66, 97, 100, 32, 82, 101, 113, 117, 101, 115, 116, 52, 48, 49, 32, 85, 110, 97, 117, 116, 104, 111, 114, 105, 122, 101, 100, 52, 48, 51, 32, 70, 111, 114, 98, 105, 100, 100, 101, 110, 52, 48, 52, 32, 78, 111, 116, 32, 70, 111, 117, 110, 100, 53, 48, 48, 32, 73, 110, 116, 101, 114, 110, 97, 108, 32, 83, 101, 114, 118, 101, 114, 32, 69, 114, 114, 111, 114, 53, 48, 49, 32, 78, 111, 116, 32, 73, 109, 112, 108, 101, 109, 101, 110, 116, 101, 100, 53, 48, 51, 32, 83, 101, 114, 118, 105, 99, 101, 32, 85, 110, 97, 118, 97, 105, 108, 97, 98, 108, 101, 74, 97, 110, 32, 70, 101, 98, 32, 77, 97, 114, 32, 65, 112, 114, 32, 77, 97, 121, 32, 74, 117, 110, 32, 74, 117, 108, 32, 65, 117, 103, 32, 83, 101, 112, 116, 32, 79, 99, 116, 32, 78, 111, 118, 32, 68, 101, 99, 32, 48, 48, HttpConstants.COLON, 48, 48, HttpConstants.COLON, 48, 48, 32, 77, 111, 110, HttpConstants.COMMA, 32, 84, 117, 101, HttpConstants.COMMA, 32, 87, 101, 100, HttpConstants.COMMA, 32, 84, 104, 117, HttpConstants.COMMA, 32, 70, 114, 105, HttpConstants.COMMA, 32, 83, 97, 116, HttpConstants.COMMA, 32, 83, 117, 110, HttpConstants.COMMA, 32, 71, 77, 84, 99, 104, 117, 110, 107, 101, 100, HttpConstants.COMMA, 116, 101, 120, 116, 47, 104, 116, 109, 108, HttpConstants.COMMA, 105, 109, 97, 103, 101, 47, 112, 110, 103, HttpConstants.COMMA, 105, 109, 97, 103, 101, 47, 106, 112, 103, HttpConstants.COMMA, 105, 109, 97, 103, 101, 47, 103, 105, 102, HttpConstants.COMMA, 97, 112, 112, 108, 105, 99, 97, 116, 105, 111, 110, 47, 120, 109, 108, HttpConstants.COMMA, 97, 112, 112, 108, 105, 99, 97, 116, 105, 111, 110, 47, 120, 104, 116, 109, 108, 43, 120, 109, 108, HttpConstants.COMMA, 116, 101, 120, 116, 47, 112, 108, 97, 105, 110, HttpConstants.COMMA, 116, 101, 120, 116, 47, 106, 97, 118, 97, 115, 99, 114, 105, 112, 116, HttpConstants.COMMA, 112, 117, 98, 108, 105, 99, 112, 114, 105, 118, 97, 116, 101, 109, 97, 120, 45, 97, 103, 101, 61, 103, 122, 105, 112, HttpConstants.COMMA, 100, 101, 102, 108, 97, 116, 101, HttpConstants.COMMA, 115, 100, 99, 104, 99, 104, 97, 114, 115, 101, 116, 61, 117, 116, 102, 45, 56, 99, 104, 97, 114, 115, 101, 116, 61, 105, 115, 111, 45, 56, 56, 53, 57, 45, 49, HttpConstants.COMMA, 117, 116, 102, 45, HttpConstants.COMMA, 42, HttpConstants.COMMA, 101, 110, 113, 61, 48, 46};
    static final byte SPDY_FLAG_FIN = 1;
    static final byte SPDY_FLAG_UNIDIRECTIONAL = 2;
    static final int SPDY_GOAWAY_FRAME = 7;
    static final int SPDY_HEADERS_FRAME = 8;
    static final int SPDY_HEADER_FLAGS_OFFSET = 4;
    static final int SPDY_HEADER_LENGTH_OFFSET = 5;
    static final int SPDY_HEADER_SIZE = 8;
    static final int SPDY_HEADER_TYPE_OFFSET = 2;
    static final int SPDY_MAX_LENGTH = 16777215;
    static final int SPDY_MAX_NV_LENGTH = 65535;
    static final int SPDY_PING_FRAME = 6;
    static final int SPDY_PUSH_PROMISE_FRAME = 5;
    static final int SPDY_RST_STREAM_FRAME = 3;
    static final int SPDY_SESSION_STREAM_ID = 0;
    static final byte SPDY_SETTINGS_CLEAR = 1;
    static final int SPDY_SETTINGS_FRAME = 4;
    static final int SPDY_SETTINGS_MAX_ID = 16777215;
    static final byte SPDY_SETTINGS_PERSISTED = 2;
    static final byte SPDY_SETTINGS_PERSIST_VALUE = 1;
    static final int SPDY_SYN_REPLY_FRAME = 2;
    static final int SPDY_SYN_STREAM_FRAME = 1;
    static final int SPDY_WINDOW_UPDATE_FRAME = 9;

    private SpdyCodecUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getUnsignedShort(ByteBuf byteBuf, int i) {
        return (byteBuf.getByte(i + 1) & 255) | ((byteBuf.getByte(i) & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getUnsignedMedium(ByteBuf byteBuf, int i) {
        return (byteBuf.getByte(i + 2) & 255) | ((byteBuf.getByte(i) & 255) << 16) | ((byteBuf.getByte(i + 1) & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getUnsignedInt(ByteBuf byteBuf, int i) {
        return (byteBuf.getByte(i + 3) & 255) | ((byteBuf.getByte(i) & Byte.MAX_VALUE) << 24) | ((byteBuf.getByte(i + 1) & 255) << 16) | ((byteBuf.getByte(i + 2) & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getSignedInt(ByteBuf byteBuf, int i) {
        return (byteBuf.getByte(i + 3) & 255) | ((byteBuf.getByte(i) & 255) << 24) | ((byteBuf.getByte(i + 1) & 255) << 16) | ((byteBuf.getByte(i + 2) & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isServerId(int i) {
        return i % 2 == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void validateHeaderName(CharSequence charSequence) {
        ObjectUtil.checkNotNull(charSequence, "name");
        if (charSequence.length() == 0) {
            throw new IllegalArgumentException("name cannot be length zero");
        }
        if (charSequence.length() > 65535) {
            throw new IllegalArgumentException("name exceeds allowable length: " + ((Object) charSequence));
        }
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (charAt == 0) {
                throw new IllegalArgumentException("name contains null character: " + ((Object) charSequence));
            } else if (charAt >= 'A' && charAt <= 'Z') {
                throw new IllegalArgumentException("name must be all lower case.");
            } else {
                if (charAt > 127) {
                    throw new IllegalArgumentException("name contains non-ascii character: " + ((Object) charSequence));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void validateHeaderValue(CharSequence charSequence) {
        ObjectUtil.checkNotNull(charSequence, "value");
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) == 0) {
                throw new IllegalArgumentException("value contains null character: " + ((Object) charSequence));
            }
        }
    }
}
