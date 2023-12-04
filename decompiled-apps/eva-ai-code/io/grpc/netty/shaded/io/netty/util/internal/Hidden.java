package io.grpc.netty.shaded.io.netty.util.internal;

import io.grpc.alts.CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0;
import io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocalThread;
import java.util.function.Function;
import java.util.function.Predicate;
import reactor.blockhound.BlockHound;
import reactor.blockhound.integration.BlockHoundIntegration;
/* loaded from: classes4.dex */
class Hidden {
    Hidden() {
    }

    /* loaded from: classes4.dex */
    public static final class NettyBlockHoundIntegration implements BlockHoundIntegration {
        public int compareTo(BlockHoundIntegration blockHoundIntegration) {
            return 0;
        }

        public void applyTo(BlockHound.Builder builder) {
            builder.allowBlockingCallsInside("io.grpc.netty.shaded.io.netty.channel.nio.NioEventLoop", "handleLoopException");
            builder.allowBlockingCallsInside("io.grpc.netty.shaded.io.netty.channel.kqueue.KQueueEventLoop", "handleLoopException");
            builder.allowBlockingCallsInside("io.grpc.netty.shaded.io.netty.channel.epoll.EpollEventLoop", "handleLoopException");
            builder.allowBlockingCallsInside("io.grpc.netty.shaded.io.netty.util.HashedWheelTimer$Worker", "waitForNextTick");
            builder.allowBlockingCallsInside("io.grpc.netty.shaded.io.netty.util.concurrent.SingleThreadEventExecutor", "confirmShutdown");
            builder.allowBlockingCallsInside("io.grpc.netty.shaded.io.netty.handler.ssl.SslHandler", "handshake");
            builder.allowBlockingCallsInside("io.grpc.netty.shaded.io.netty.handler.ssl.SslHandler", "runAllDelegatedTasks");
            builder.allowBlockingCallsInside("io.grpc.netty.shaded.io.netty.util.concurrent.GlobalEventExecutor", "takeTask");
            builder.allowBlockingCallsInside("io.grpc.netty.shaded.io.netty.util.concurrent.GlobalEventExecutor", "addTask");
            builder.allowBlockingCallsInside("io.grpc.netty.shaded.io.netty.util.concurrent.SingleThreadEventExecutor", "takeTask");
            builder.allowBlockingCallsInside("io.grpc.netty.shaded.io.netty.handler.ssl.ReferenceCountedOpenSslClientContext$ExtendedTrustManagerVerifyCallback", "verify");
            builder.allowBlockingCallsInside("sun.security.ssl.SSLEngineImpl", "unwrap");
            builder.nonBlockingThreadPredicate(new Function<Predicate<Thread>, Predicate<Thread>>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.Hidden.NettyBlockHoundIntegration.1
                @Override // java.util.function.Function
                public /* bridge */ /* synthetic */ Predicate<Thread> apply(Predicate<Thread> predicate) {
                    return apply2(CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7227m((Object) predicate));
                }

                /* renamed from: apply  reason: avoid collision after fix types in other method */
                public Predicate<Thread> apply2(final Predicate<Thread> predicate) {
                    return new Predicate<Thread>() { // from class: io.grpc.netty.shaded.io.netty.util.internal.Hidden.NettyBlockHoundIntegration.1.1
                        @Override // java.util.function.Predicate
                        public boolean test(Thread thread) {
                            boolean test;
                            test = predicate.test(thread);
                            return test || (thread instanceof FastThreadLocalThread);
                        }
                    };
                }
            });
        }
    }
}
