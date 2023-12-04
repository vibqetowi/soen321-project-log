package io.grpc.netty.shaded.io.netty.handler.codec.socksx.v4;

import io.grpc.netty.shaded.io.netty.handler.codec.socksx.AbstractSocksMessage;
import io.grpc.netty.shaded.io.netty.handler.codec.socksx.SocksVersion;
/* loaded from: classes4.dex */
public abstract class AbstractSocks4Message extends AbstractSocksMessage implements Socks4Message {
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.socksx.SocksMessage
    public final SocksVersion version() {
        return SocksVersion.SOCKS4a;
    }
}
