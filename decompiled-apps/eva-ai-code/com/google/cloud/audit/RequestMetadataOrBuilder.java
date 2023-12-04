package com.google.cloud.audit;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.rpc.context.AttributeContext;
/* loaded from: classes7.dex */
public interface RequestMetadataOrBuilder extends MessageOrBuilder {
    String getCallerIp();

    ByteString getCallerIpBytes();

    String getCallerNetwork();

    ByteString getCallerNetworkBytes();

    String getCallerSuppliedUserAgent();

    ByteString getCallerSuppliedUserAgentBytes();

    AttributeContext.Peer getDestinationAttributes();

    AttributeContext.PeerOrBuilder getDestinationAttributesOrBuilder();

    AttributeContext.Request getRequestAttributes();

    AttributeContext.RequestOrBuilder getRequestAttributesOrBuilder();

    boolean hasDestinationAttributes();

    boolean hasRequestAttributes();
}
