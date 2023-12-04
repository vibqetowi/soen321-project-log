package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.handler.ssl.ApplicationProtocolConfig;
@Deprecated
/* loaded from: classes4.dex */
public interface OpenSslApplicationProtocolNegotiator extends ApplicationProtocolNegotiator {
    ApplicationProtocolConfig.Protocol protocol();

    ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedListenerFailureBehavior();

    ApplicationProtocolConfig.SelectorFailureBehavior selectorFailureBehavior();
}
