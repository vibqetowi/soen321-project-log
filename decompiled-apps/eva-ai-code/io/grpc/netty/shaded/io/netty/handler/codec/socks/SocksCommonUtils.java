package io.grpc.netty.shaded.io.netty.handler.codec.socks;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
/* loaded from: classes4.dex */
final class SocksCommonUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final SocksRequest UNKNOWN_SOCKS_REQUEST = new UnknownSocksRequest();
    public static final SocksResponse UNKNOWN_SOCKS_RESPONSE = new UnknownSocksResponse();
    private static final char ipv6hextetSeparator = ':';

    private SocksCommonUtils() {
    }

    public static String ipv6toStr(byte[] bArr) {
        StringBuilder sb = new StringBuilder(39);
        ipv6toStr(sb, bArr, 0, 8);
        return sb.toString();
    }

    private static void ipv6toStr(StringBuilder sb, byte[] bArr, int i, int i2) {
        int i3 = i2 - 1;
        while (i < i3) {
            appendHextet(sb, bArr, i);
            sb.append(':');
            i++;
        }
        appendHextet(sb, bArr, i);
    }

    private static void appendHextet(StringBuilder sb, byte[] bArr, int i) {
        StringUtil.toHexString(sb, bArr, i << 1, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String readUsAscii(ByteBuf byteBuf, int i) {
        String byteBuf2 = byteBuf.toString(byteBuf.readerIndex(), i, CharsetUtil.US_ASCII);
        byteBuf.skipBytes(i);
        return byteBuf2;
    }
}
