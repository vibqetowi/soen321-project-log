package io.grpc.netty.shaded.io.netty.handler.codec.http;

import io.grpc.netty.shaded.io.netty.handler.codec.DecoderResult;
import io.grpc.netty.shaded.io.netty.handler.codec.DecoderResultProvider;
/* loaded from: classes4.dex */
public interface HttpObject extends DecoderResultProvider {
    @Deprecated
    DecoderResult getDecoderResult();
}
