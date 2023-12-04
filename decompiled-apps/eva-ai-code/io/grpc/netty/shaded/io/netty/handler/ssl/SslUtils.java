package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufUtil;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.base64.Base64;
import io.grpc.netty.shaded.io.netty.handler.codec.base64.Base64Dialect;
import io.grpc.netty.shaded.io.netty.util.NetUtil;
import io.grpc.netty.shaded.io.netty.util.internal.EmptyArrays;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.TrustManager;
import kotlin.UShort;
import kotlin.jvm.internal.ShortCompanionObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SslUtils {
    static final String[] DEFAULT_CIPHER_SUITES;
    static final String[] DEFAULT_TLSV13_CIPHER_SUITES;
    static final String INVALID_CIPHER = "SSL_NULL_WITH_NULL_NULL";
    static final int NOT_ENCRYPTED = -2;
    static final int NOT_ENOUGH_DATA = -1;
    static final String PROTOCOL_SSL_V2 = "SSLv2";
    static final String PROTOCOL_SSL_V2_HELLO = "SSLv2Hello";
    static final String PROTOCOL_SSL_V3 = "SSLv3";
    static final String PROTOCOL_TLS_V1 = "TLSv1";
    static final String PROTOCOL_TLS_V1_1 = "TLSv1.1";
    static final String PROTOCOL_TLS_V1_2 = "TLSv1.2";
    static final String PROTOCOL_TLS_V1_3 = "TLSv1.3";
    static final int SSL_CONTENT_TYPE_ALERT = 21;
    static final int SSL_CONTENT_TYPE_APPLICATION_DATA = 23;
    static final int SSL_CONTENT_TYPE_CHANGE_CIPHER_SPEC = 20;
    static final int SSL_CONTENT_TYPE_EXTENSION_HEARTBEAT = 24;
    static final int SSL_CONTENT_TYPE_HANDSHAKE = 22;
    static final int SSL_RECORD_HEADER_LENGTH = 5;
    private static final boolean TLSV1_3_JDK_DEFAULT_ENABLED;
    private static final boolean TLSV1_3_JDK_SUPPORTED;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(SslUtils.class);
    static final Set<String> TLSV13_CIPHERS = Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList("TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_128_CCM_8_SHA256", "TLS_AES_128_CCM_SHA256")));
    static final String[] TLSV13_CIPHER_SUITES = {"TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384"};

    private static short unsignedByte(byte b) {
        return (short) (b & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    static {
        boolean z;
        Throwable th;
        SSLContext sSLContext;
        boolean z2 = false;
        try {
            sSLContext = SSLContext.getInstance("TLS");
            th = null;
            sSLContext.init(null, new TrustManager[0], null);
            String[] protocols = sSLContext.getSupportedSSLParameters().getProtocols();
            int length = protocols.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (PROTOCOL_TLS_V1_3.equals(protocols[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        try {
            String[] protocols2 = sSLContext.getDefaultSSLParameters().getProtocols();
            int length2 = protocols2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                } else if (PROTOCOL_TLS_V1_3.equals(protocols2[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            th = th;
            if (th != null) {
            }
            TLSV1_3_JDK_SUPPORTED = z;
            TLSV1_3_JDK_DEFAULT_ENABLED = z2;
            if (!z) {
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
            arrayList.add("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
            arrayList.add("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
            arrayList.add("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
            arrayList.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
            arrayList.add("TLS_RSA_WITH_AES_128_GCM_SHA256");
            arrayList.add("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add("TLS_RSA_WITH_AES_256_CBC_SHA");
            Collections.addAll(arrayList, DEFAULT_TLSV13_CIPHER_SUITES);
            DEFAULT_CIPHER_SUITES = (String[]) arrayList.toArray(EmptyArrays.EMPTY_STRINGS);
        }
        if (th != null) {
            logger.debug("JDK SSLEngine supports TLSv1.3: {}", Boolean.valueOf(z));
        } else {
            logger.debug("Unable to detect if JDK SSLEngine supports TLSv1.3, assuming no", th);
        }
        TLSV1_3_JDK_SUPPORTED = z;
        TLSV1_3_JDK_DEFAULT_ENABLED = z2;
        if (!z) {
            DEFAULT_TLSV13_CIPHER_SUITES = TLSV13_CIPHER_SUITES;
        } else {
            DEFAULT_TLSV13_CIPHER_SUITES = EmptyArrays.EMPTY_STRINGS;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        arrayList2.add("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        arrayList2.add("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        arrayList2.add("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        arrayList2.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        arrayList2.add("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        arrayList2.add("TLS_RSA_WITH_AES_128_GCM_SHA256");
        arrayList2.add("TLS_RSA_WITH_AES_128_CBC_SHA");
        arrayList2.add("TLS_RSA_WITH_AES_256_CBC_SHA");
        Collections.addAll(arrayList2, DEFAULT_TLSV13_CIPHER_SUITES);
        DEFAULT_CIPHER_SUITES = (String[]) arrayList2.toArray(EmptyArrays.EMPTY_STRINGS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isTLSv13SupportedByJDK() {
        return TLSV1_3_JDK_SUPPORTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isTLSv13EnabledByJDK() {
        return TLSV1_3_JDK_DEFAULT_ENABLED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void addIfSupported(Set<String> set, List<String> list, String... strArr) {
        for (String str : strArr) {
            if (set.contains(str)) {
                list.add(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void useFallbackCiphersIfDefaultIsEmpty(List<String> list, Iterable<String> iterable) {
        if (list.isEmpty()) {
            for (String str : iterable) {
                if (!str.startsWith("SSL_") && !str.contains("_RC4_")) {
                    list.add(str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void useFallbackCiphersIfDefaultIsEmpty(List<String> list, String... strArr) {
        useFallbackCiphersIfDefaultIsEmpty(list, Arrays.asList(strArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SSLHandshakeException toSSLHandshakeException(Throwable th) {
        if (th instanceof SSLHandshakeException) {
            return (SSLHandshakeException) th;
        }
        return (SSLHandshakeException) new SSLHandshakeException(th.getMessage()).initCause(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r4 <= 5) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getEncryptedPacketLength(ByteBuf byteBuf, int i) {
        boolean z;
        int i2;
        boolean z2 = false;
        switch (byteBuf.getUnsignedByte(i)) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            if (byteBuf.getUnsignedByte(i + 1) == 3) {
                i2 = unsignedShortBE(byteBuf, i + 3) + 5;
            } else {
                i2 = 0;
            }
            if (!z2) {
                int i3 = (byteBuf.getUnsignedByte(i) & 128) != 0 ? 2 : 3;
                short unsignedByte = byteBuf.getUnsignedByte(i + i3 + 1);
                if (unsignedByte != 2 && unsignedByte != 3) {
                    return -2;
                }
                i2 = i3 == 2 ? (shortBE(byteBuf, i) & ShortCompanionObject.MAX_VALUE) + 2 : (shortBE(byteBuf, i) & 16383) + 3;
                if (i2 <= i3) {
                    return -1;
                }
            }
            return i2;
        }
        i2 = 0;
        z2 = z;
        if (!z2) {
        }
        return i2;
    }

    private static int unsignedShortBE(ByteBuf byteBuf, int i) {
        return byteBuf.order() == ByteOrder.BIG_ENDIAN ? byteBuf.getUnsignedShort(i) : byteBuf.getUnsignedShortLE(i);
    }

    private static short shortBE(ByteBuf byteBuf, int i) {
        return byteBuf.order() == ByteOrder.BIG_ENDIAN ? byteBuf.getShort(i) : byteBuf.getShortLE(i);
    }

    private static int unsignedShortBE(ByteBuffer byteBuffer, int i) {
        return shortBE(byteBuffer, i) & UShort.MAX_VALUE;
    }

    private static short shortBE(ByteBuffer byteBuffer, int i) {
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? byteBuffer.getShort(i) : ByteBufUtil.swapShort(byteBuffer.getShort(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getEncryptedPacketLength(ByteBuffer[] byteBufferArr, int i) {
        ByteBuffer byteBuffer = byteBufferArr[i];
        if (byteBuffer.remaining() >= 5) {
            return getEncryptedPacketLength(byteBuffer);
        }
        ByteBuffer allocate = ByteBuffer.allocate(5);
        while (true) {
            int i2 = i + 1;
            ByteBuffer duplicate = byteBufferArr[i].duplicate();
            if (duplicate.remaining() > allocate.remaining()) {
                duplicate.limit(duplicate.position() + allocate.remaining());
            }
            allocate.put(duplicate);
            if (!allocate.hasRemaining()) {
                allocate.flip();
                return getEncryptedPacketLength(allocate);
            }
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r5 <= 5) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getEncryptedPacketLength(ByteBuffer byteBuffer) {
        boolean z;
        int i;
        int position = byteBuffer.position();
        boolean z2 = false;
        switch (unsignedByte(byteBuffer.get(position))) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            if (unsignedByte(byteBuffer.get(position + 1)) == 3) {
                i = unsignedShortBE(byteBuffer, position + 3) + 5;
            } else {
                i = 0;
            }
            if (!z2) {
                int i2 = (unsignedByte(byteBuffer.get(position)) & 128) != 0 ? 2 : 3;
                short unsignedByte = unsignedByte(byteBuffer.get(position + i2 + 1));
                if (unsignedByte != 2 && unsignedByte != 3) {
                    return -2;
                }
                i = i2 == 2 ? (shortBE(byteBuffer, position) & ShortCompanionObject.MAX_VALUE) + 2 : (shortBE(byteBuffer, position) & 16383) + 3;
                if (i <= i2) {
                    return -1;
                }
            }
            return i;
        }
        i = 0;
        z2 = z;
        if (!z2) {
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void handleHandshakeFailure(ChannelHandlerContext channelHandlerContext, Throwable th, boolean z) {
        channelHandlerContext.flush();
        if (z) {
            channelHandlerContext.fireUserEventTriggered((Object) new SslHandshakeCompletionEvent(th));
        }
        channelHandlerContext.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zeroout(ByteBuf byteBuf) {
        if (byteBuf.isReadOnly()) {
            return;
        }
        byteBuf.setZero(0, byteBuf.capacity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zerooutAndRelease(ByteBuf byteBuf) {
        zeroout(byteBuf);
        byteBuf.release();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuf toBase64(ByteBufAllocator byteBufAllocator, ByteBuf byteBuf) {
        ByteBuf encode = Base64.encode(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes(), true, Base64Dialect.STANDARD, byteBufAllocator);
        byteBuf.readerIndex(byteBuf.writerIndex());
        return encode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidHostNameForSNI(String str) {
        return (str == null || str.indexOf(46) <= 0 || str.endsWith(".") || NetUtil.isValidIpV4Address(str) || NetUtil.isValidIpV6Address(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isTLSv13Cipher(String str) {
        return TLSV13_CIPHERS.contains(str);
    }

    private SslUtils() {
    }
}
