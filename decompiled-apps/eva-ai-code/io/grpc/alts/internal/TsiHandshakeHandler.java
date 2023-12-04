package io.grpc.alts.internal;

import com.google.common.base.Preconditions;
import com.ifriend.keychain.KeychainModule;
import io.grpc.ChannelLogger;
import io.grpc.InternalChannelz;
import io.grpc.internal.GrpcAttributes;
import io.grpc.netty.shaded.io.grpc.netty.InternalProtocolNegotiationEvent;
import io.grpc.netty.shaded.io.grpc.netty.InternalProtocolNegotiators;
import io.grpc.netty.shaded.io.grpc.netty.ProtocolNegotiationEvent;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.ChannelFuture;
import io.grpc.netty.shaded.io.netty.channel.ChannelFutureListener;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandler;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
import io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener;
import java.security.GeneralSecurityException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public final class TsiHandshakeHandler extends ByteToMessageDecoder {
    private static final int HANDSHAKE_FRAME_SIZE = 1024;
    private static final AsyncSemaphore semaphore = new AsyncSemaphore(32);
    private final HandshakeValidator handshakeValidator;
    private final NettyTsiHandshaker handshaker;
    private final ChannelHandler next;
    private ProtocolNegotiationEvent pne;
    private boolean semaphoreAcquired;

    /* loaded from: classes4.dex */
    public static abstract class HandshakeValidator {
        public abstract SecurityDetails validatePeerObject(Object obj) throws GeneralSecurityException;

        /* loaded from: classes4.dex */
        public static final class SecurityDetails {
            private final InternalChannelz.Security security;
            private final io.grpc.SecurityLevel securityLevel;

            public SecurityDetails(io.grpc.SecurityLevel securityLevel, @Nullable InternalChannelz.Security security) {
                this.securityLevel = (io.grpc.SecurityLevel) Preconditions.checkNotNull(securityLevel, KeychainModule.Maps.SECURITY_LEVEL);
                this.security = security;
            }

            public InternalChannelz.Security getSecurity() {
                return this.security;
            }

            public io.grpc.SecurityLevel getSecurityLevel() {
                return this.securityLevel;
            }
        }
    }

    public TsiHandshakeHandler(ChannelHandler channelHandler, NettyTsiHandshaker nettyTsiHandshaker, HandshakeValidator handshakeValidator) {
        this.handshaker = (NettyTsiHandshaker) Preconditions.checkNotNull(nettyTsiHandshaker, "handshaker");
        this.handshakeValidator = (HandshakeValidator) Preconditions.checkNotNull(handshakeValidator, "handshakeValidator");
        this.next = (ChannelHandler) Preconditions.checkNotNull(channelHandler, "next");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    public void decodeLast(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        decode(channelHandlerContext, byteBuf, list);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (this.handshaker.processBytesFromPeer(byteBuf) && this.handshaker.isInProgress()) {
            sendHandshake(channelHandlerContext);
        }
        if (this.handshaker.isInProgress()) {
            return;
        }
        TsiPeer extractPeer = this.handshaker.extractPeer();
        Object extractPeerObject = this.handshaker.extractPeerObject();
        HandshakeValidator.SecurityDetails validatePeerObject = this.handshakeValidator.validatePeerObject(extractPeerObject);
        TsiFrameProtector createFrameProtector = this.handshaker.createFrameProtector(channelHandlerContext.alloc());
        try {
            TsiFrameHandler tsiFrameHandler = new TsiFrameHandler(createFrameProtector);
            channelHandlerContext.pipeline().addAfter(channelHandlerContext.name(), null, tsiFrameHandler);
            channelHandlerContext.pipeline().addAfter(channelHandlerContext.pipeline().context(tsiFrameHandler).name(), null, this.next);
            channelHandlerContext.pipeline().remove(channelHandlerContext.name());
            fireProtocolNegotiationEvent(channelHandlerContext, extractPeer, extractPeerObject, validatePeerObject);
        } catch (Throwable th) {
            if (createFrameProtector != null) {
                createFrameProtector.destroy();
            }
            throw th;
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder, io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandler
    public void userEventTriggered(final ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
        if (obj instanceof ProtocolNegotiationEvent) {
            Preconditions.checkState(this.pne == null, "negotiation already started");
            this.pne = (ProtocolNegotiationEvent) obj;
            InternalProtocolNegotiators.negotiationLogger(channelHandlerContext).log(ChannelLogger.ChannelLogLevel.INFO, "TsiHandshake started");
            ChannelFuture acquire = semaphore.acquire(channelHandlerContext);
            if (acquire.isSuccess()) {
                this.semaphoreAcquired = true;
                sendHandshake(channelHandlerContext);
                return;
            }
            acquire.addListener((GenericFutureListener<? extends Future<? super Void>>) new ChannelFutureListener() { // from class: io.grpc.alts.internal.TsiHandshakeHandler.1
                @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
                public void operationComplete(ChannelFuture channelFuture) {
                    if (!channelFuture.isSuccess()) {
                        channelHandlerContext.fireExceptionCaught(channelFuture.cause());
                    } else if (channelHandlerContext.isRemoved()) {
                        TsiHandshakeHandler.semaphore.release();
                    } else {
                        TsiHandshakeHandler.this.semaphoreAcquired = true;
                        try {
                            TsiHandshakeHandler.this.sendHandshake(channelHandlerContext);
                        } catch (Exception e) {
                            channelHandlerContext.fireExceptionCaught((Throwable) e);
                        }
                        channelHandlerContext.flush();
                    }
                }
            });
            return;
        }
        super.userEventTriggered(channelHandlerContext, obj);
    }

    private void fireProtocolNegotiationEvent(ChannelHandlerContext channelHandlerContext, TsiPeer tsiPeer, Object obj, HandshakeValidator.SecurityDetails securityDetails) {
        Preconditions.checkState(this.pne != null, "negotiation not yet complete");
        InternalProtocolNegotiators.negotiationLogger(channelHandlerContext).log(ChannelLogger.ChannelLogLevel.INFO, "TsiHandshake finished");
        ProtocolNegotiationEvent protocolNegotiationEvent = this.pne;
        channelHandlerContext.fireUserEventTriggered((Object) InternalProtocolNegotiationEvent.withSecurity(InternalProtocolNegotiationEvent.withAttributes(protocolNegotiationEvent, InternalProtocolNegotiationEvent.getAttributes(protocolNegotiationEvent).toBuilder().set(AltsProtocolNegotiator.TSI_PEER_KEY, tsiPeer).set(AltsProtocolNegotiator.AUTH_CONTEXT_KEY, obj).set(GrpcAttributes.ATTR_SECURITY_LEVEL, securityDetails.getSecurityLevel()).build()), securityDetails.getSecurity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendHandshake(ChannelHandlerContext channelHandlerContext) throws GeneralSecurityException {
        while (true) {
            ByteBuf retain = channelHandlerContext.alloc().buffer(1024).retain();
            try {
                try {
                    this.handshaker.getBytesToSendToPeer(retain);
                    if (!retain.isReadable()) {
                        return;
                    }
                    channelHandlerContext.writeAndFlush(retain).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
                    retain.release(1);
                } catch (GeneralSecurityException e) {
                    throw new GeneralSecurityException("TsiHandshakeHandler encountered exception", e);
                }
            } finally {
                retain.release(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    public void handlerRemoved0(ChannelHandlerContext channelHandlerContext) throws Exception {
        if (this.semaphoreAcquired) {
            semaphore.release();
            this.semaphoreAcquired = false;
        }
        this.handshaker.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class AsyncSemaphore {
        private int permits;
        private final Object lock = new Object();
        private final Queue<ChannelPromise> queue = new LinkedList();

        public AsyncSemaphore(int i) {
            this.permits = i;
        }

        public ChannelFuture acquire(ChannelHandlerContext channelHandlerContext) {
            synchronized (this.lock) {
                int i = this.permits;
                if (i > 0) {
                    this.permits = i - 1;
                    return channelHandlerContext.newSucceededFuture();
                }
                ChannelPromise newPromise = channelHandlerContext.newPromise();
                this.queue.add(newPromise);
                return newPromise;
            }
        }

        public void release() {
            synchronized (this.lock) {
                ChannelPromise poll = this.queue.poll();
                if (poll == null) {
                    this.permits++;
                } else {
                    poll.setSuccess();
                }
            }
        }
    }
}
