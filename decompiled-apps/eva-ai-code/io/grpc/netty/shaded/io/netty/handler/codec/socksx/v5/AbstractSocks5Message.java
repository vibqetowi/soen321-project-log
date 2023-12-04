package io.grpc.netty.shaded.io.netty.handler.codec.socksx.v5;

import io.grpc.netty.shaded.io.netty.handler.codec.socksx.AbstractSocksMessage;
import io.grpc.netty.shaded.io.netty.handler.codec.socksx.SocksVersion;
/* loaded from: classes4.dex */
public abstract class AbstractSocks5Message extends AbstractSocksMessage implements Socks5Message {
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.socksx.SocksMessage
    public final SocksVersion version() {
        return SocksVersion.SOCKS5;
    }
}
