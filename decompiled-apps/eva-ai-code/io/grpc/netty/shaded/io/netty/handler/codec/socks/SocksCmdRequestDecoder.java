package io.grpc.netty.shaded.io.netty.handler.codec.socks;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.ReplayingDecoder;
import io.grpc.netty.shaded.io.netty.util.NetUtil;
import java.util.List;
/* loaded from: classes4.dex */
public class SocksCmdRequestDecoder extends ReplayingDecoder<State> {
    private SocksAddressType addressType;
    private SocksCmdType cmdType;

    /* loaded from: classes4.dex */
    enum State {
        CHECK_PROTOCOL_VERSION,
        READ_CMD_HEADER,
        READ_CMD_ADDRESS
    }

    public SocksCmdRequestDecoder() {
        super(State.CHECK_PROTOCOL_VERSION);
    }

    /* renamed from: io.grpc.netty.shaded.io.netty.handler.codec.socks.SocksCmdRequestDecoder$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socks$SocksAddressType;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socks$SocksCmdRequestDecoder$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$socks$SocksCmdRequestDecoder$State = iArr;
            try {
                iArr[State.CHECK_PROTOCOL_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socks$SocksCmdRequestDecoder$State[State.READ_CMD_HEADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socks$SocksCmdRequestDecoder$State[State.READ_CMD_ADDRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SocksAddressType.values().length];
            $SwitchMap$io$netty$handler$codec$socks$SocksAddressType = iArr2;
            try {
                iArr2[SocksAddressType.IPv4.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socks$SocksAddressType[SocksAddressType.DOMAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socks$SocksAddressType[SocksAddressType.IPv6.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socks$SocksAddressType[SocksAddressType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        int i;
        int i2 = AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksCmdRequestDecoder$State[state().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new Error();
                }
                i = AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType[this.addressType.ordinal()];
                if (i != 1) {
                    list.add(new SocksCmdRequest(this.cmdType, this.addressType, NetUtil.intToIpAddress(byteBuf.readInt()), byteBuf.readUnsignedShort()));
                } else if (i == 2) {
                    list.add(new SocksCmdRequest(this.cmdType, this.addressType, SocksCommonUtils.readUsAscii(byteBuf, byteBuf.readByte()), byteBuf.readUnsignedShort()));
                } else if (i == 3) {
                    byte[] bArr = new byte[16];
                    byteBuf.readBytes(bArr);
                    list.add(new SocksCmdRequest(this.cmdType, this.addressType, SocksCommonUtils.ipv6toStr(bArr), byteBuf.readUnsignedShort()));
                } else if (i == 4) {
                    list.add(SocksCommonUtils.UNKNOWN_SOCKS_REQUEST);
                } else {
                    throw new Error();
                }
                channelHandlerContext.pipeline().remove(this);
            }
        } else if (byteBuf.readByte() != SocksProtocolVersion.SOCKS5.byteValue()) {
            list.add(SocksCommonUtils.UNKNOWN_SOCKS_REQUEST);
            channelHandlerContext.pipeline().remove(this);
        } else {
            checkpoint(State.READ_CMD_HEADER);
        }
        this.cmdType = SocksCmdType.valueOf(byteBuf.readByte());
        byteBuf.skipBytes(1);
        this.addressType = SocksAddressType.valueOf(byteBuf.readByte());
        checkpoint(State.READ_CMD_ADDRESS);
        i = AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType[this.addressType.ordinal()];
        if (i != 1) {
        }
        channelHandlerContext.pipeline().remove(this);
    }
}
