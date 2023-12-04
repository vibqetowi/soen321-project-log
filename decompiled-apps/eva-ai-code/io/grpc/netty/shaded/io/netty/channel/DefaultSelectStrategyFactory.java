package io.grpc.netty.shaded.io.netty.channel;
/* loaded from: classes4.dex */
public final class DefaultSelectStrategyFactory implements SelectStrategyFactory {
    public static final SelectStrategyFactory INSTANCE = new DefaultSelectStrategyFactory();

    private DefaultSelectStrategyFactory() {
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.SelectStrategyFactory
    public SelectStrategy newSelectStrategy() {
        return DefaultSelectStrategy.INSTANCE;
    }
}
