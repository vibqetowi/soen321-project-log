package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.buffer.ByteBufUtil;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandlerAdapter;
import io.grpc.netty.shaded.io.netty.util.internal.ReflectionUtil;
import io.grpc.netty.shaded.io.netty.util.internal.SystemPropertyUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.lang.reflect.Field;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
/* loaded from: classes4.dex */
public abstract class SslMasterKeyHandler extends ChannelInboundHandlerAdapter {
    private static final Class<?> SSL_SESSIONIMPL_CLASS;
    private static final Field SSL_SESSIONIMPL_MASTER_SECRET_FIELD;
    public static final String SYSTEM_PROP_KEY = "io.grpc.netty.shaded.io.netty.ssl.masterKeyHandler";
    private static final Throwable UNAVAILABILITY_CAUSE;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(SslMasterKeyHandler.class);

    protected abstract void accept(SecretKey secretKey, SSLSession sSLSession);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Class<?>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v8 */
    static {
        Throwable th;
        Field field;
        ?? r1;
        ?? cls;
        Field field2 = null;
        try {
            cls = Class.forName("sun.security.ssl.SSLSessionImpl");
        } catch (Throwable th2) {
            th = th2;
            field = null;
        }
        try {
            field2 = cls.getDeclaredField("masterSecret");
            th = ReflectionUtil.trySetAccessible(field2, true);
            r1 = cls;
        } catch (Throwable th3) {
            th = th3;
            field = field2;
            field2 = cls;
            logger.debug("sun.security.ssl.SSLSessionImpl is unavailable.", th);
            Field field3 = field;
            r1 = field2;
            field2 = field3;
            UNAVAILABILITY_CAUSE = th;
            SSL_SESSIONIMPL_CLASS = r1;
            SSL_SESSIONIMPL_MASTER_SECRET_FIELD = field2;
        }
        UNAVAILABILITY_CAUSE = th;
        SSL_SESSIONIMPL_CLASS = r1;
        SSL_SESSIONIMPL_MASTER_SECRET_FIELD = field2;
    }

    protected SslMasterKeyHandler() {
    }

    public static void ensureSunSslEngineAvailability() {
        Throwable th = UNAVAILABILITY_CAUSE;
        if (th != null) {
            throw new IllegalStateException("Failed to find SSLSessionImpl on classpath", th);
        }
    }

    public static Throwable sunSslEngineUnavailabilityCause() {
        return UNAVAILABILITY_CAUSE;
    }

    public static boolean isSunSslEngineAvailable() {
        return UNAVAILABILITY_CAUSE == null;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandler
    public final void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object obj) {
        if (obj == SslHandshakeCompletionEvent.SUCCESS && masterKeyHandlerEnabled()) {
            SSLEngine engine = ((SslHandler) channelHandlerContext.pipeline().get(SslHandler.class)).engine();
            SSLSession session = engine.getSession();
            if (isSunSslEngineAvailable() && session.getClass().equals(SSL_SESSIONIMPL_CLASS)) {
                try {
                    accept((SecretKey) SSL_SESSIONIMPL_MASTER_SECRET_FIELD.get(session), session);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Failed to access the field 'masterSecret' via reflection.", e);
                }
            } else if (OpenSsl.isAvailable() && (engine instanceof ReferenceCountedOpenSslEngine)) {
                accept(((ReferenceCountedOpenSslEngine) engine).masterKey(), session);
            }
        }
        channelHandlerContext.fireUserEventTriggered(obj);
    }

    protected boolean masterKeyHandlerEnabled() {
        return SystemPropertyUtil.getBoolean(SYSTEM_PROP_KEY, false);
    }

    public static SslMasterKeyHandler newWireSharkSslMasterKeyHandler() {
        return new WiresharkSslMasterKeyHandler();
    }

    /* loaded from: classes4.dex */
    private static final class WiresharkSslMasterKeyHandler extends SslMasterKeyHandler {
        private static final InternalLogger wireshark_logger = InternalLoggerFactory.getInstance("io.grpc.netty.shaded.io.netty.wireshark");

        private WiresharkSslMasterKeyHandler() {
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.ssl.SslMasterKeyHandler
        protected void accept(SecretKey secretKey, SSLSession sSLSession) {
            if (secretKey.getEncoded().length != 48) {
                throw new IllegalArgumentException("An invalid length master key was provided.");
            }
            wireshark_logger.warn("RSA Session-ID:{} Master-Key:{}", ByteBufUtil.hexDump(sSLSession.getId()).toLowerCase(), ByteBufUtil.hexDump(secretKey.getEncoded()).toLowerCase());
        }
    }
}
