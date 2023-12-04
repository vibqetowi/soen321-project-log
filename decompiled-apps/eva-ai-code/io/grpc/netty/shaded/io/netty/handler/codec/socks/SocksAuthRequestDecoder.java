package io.grpc.netty.shaded.io.netty.handler.codec.socks;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.ReplayingDecoder;
import java.util.List;
/* loaded from: classes4.dex */
public class SocksAuthRequestDecoder extends ReplayingDecoder<State> {
    private String username;

    /* loaded from: classes4.dex */
    enum State {
        CHECK_PROTOCOL_VERSION,
        READ_USERNAME,
        READ_PASSWORD
    }

    public SocksAuthRequestDecoder() {
        super(State.CHECK_PROTOCOL_VERSION);
    }

    /* renamed from: io.grpc.netty.shaded.io.netty.handler.codec.socks.SocksAuthRequestDecoder$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socks$SocksAuthRequestDecoder$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$socks$SocksAuthRequestDecoder$State = iArr;
            try {
                iArr[State.CHECK_PROTOCOL_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socks$SocksAuthRequestDecoder$State[State.READ_USERNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socks$SocksAuthRequestDecoder$State[State.READ_PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        int i = AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAuthRequestDecoder$State[state().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new Error();
                }
                list.add(new SocksAuthRequest(this.username, SocksCommonUtils.readUsAscii(byteBuf, byteBuf.readByte())));
                channelHandlerContext.pipeline().remove(this);
            }
        } else if (byteBuf.readByte() != SocksSubnegotiationVersion.AUTH_PASSWORD.byteValue()) {
            list.add(SocksCommonUtils.UNKNOWN_SOCKS_REQUEST);
            channelHandlerContext.pipeline().remove(this);
        } else {
            checkpoint(State.READ_USERNAME);
        }
        this.username = SocksCommonUtils.readUsAscii(byteBuf, byteBuf.readByte());
        checkpoint(State.READ_PASSWORD);
        list.add(new SocksAuthRequest(this.username, SocksCommonUtils.readUsAscii(byteBuf, byteBuf.readByte())));
        channelHandlerContext.pipeline().remove(this);
    }
}
