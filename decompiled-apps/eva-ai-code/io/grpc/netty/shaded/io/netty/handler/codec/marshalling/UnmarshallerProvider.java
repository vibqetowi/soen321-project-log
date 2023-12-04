package io.grpc.netty.shaded.io.netty.handler.codec.marshalling;

import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import org.jboss.marshalling.Unmarshaller;
/* loaded from: classes4.dex */
public interface UnmarshallerProvider {
    Unmarshaller getUnmarshaller(ChannelHandlerContext channelHandlerContext) throws Exception;
}
