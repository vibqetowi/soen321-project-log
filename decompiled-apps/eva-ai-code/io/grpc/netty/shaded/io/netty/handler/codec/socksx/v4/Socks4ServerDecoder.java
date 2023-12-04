package io.grpc.netty.shaded.io.netty.handler.codec.socksx.v4;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.DecoderException;
import io.grpc.netty.shaded.io.netty.handler.codec.DecoderResult;
import io.grpc.netty.shaded.io.netty.handler.codec.ReplayingDecoder;
import io.grpc.netty.shaded.io.netty.handler.codec.socksx.SocksVersion;
import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
import io.grpc.netty.shaded.io.netty.util.NetUtil;
import java.util.List;
/* loaded from: classes4.dex */
public class Socks4ServerDecoder extends ReplayingDecoder<State> {
    private static final int MAX_FIELD_LENGTH = 255;
    private String dstAddr;
    private int dstPort;
    private Socks4CommandType type;
    private String userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum State {
        START,
        READ_USERID,
        READ_DOMAIN,
        SUCCESS,
        FAILURE
    }

    public Socks4ServerDecoder() {
        super(State.START);
        setSingleDecode(true);
    }

    /* renamed from: io.grpc.netty.shaded.io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State = iArr;
            try {
                iArr[State.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State[State.READ_USERID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State[State.READ_DOMAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State[State.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State[State.FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[Catch: Exception -> 0x00b3, TryCatch #0 {Exception -> 0x00b3, blocks: (B:3:0x0002, B:14:0x0021, B:25:0x0093, B:27:0x0099, B:19:0x0062, B:21:0x006c, B:23:0x0076, B:24:0x007e, B:18:0x0055, B:15:0x002a, B:17:0x0036, B:28:0x00a1, B:29:0x00b2), top: B:33:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        int actualReadableBytes;
        try {
            int i = AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State[state().ordinal()];
            if (i == 1) {
                short readUnsignedByte = byteBuf.readUnsignedByte();
                if (readUnsignedByte != SocksVersion.SOCKS4a.byteValue()) {
                    throw new DecoderException("unsupported protocol version: " + ((int) readUnsignedByte));
                }
                this.type = Socks4CommandType.valueOf(byteBuf.readByte());
                this.dstPort = byteBuf.readUnsignedShort();
                this.dstAddr = NetUtil.intToIpAddress(byteBuf.readInt());
                checkpoint(State.READ_USERID);
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        byteBuf.skipBytes(actualReadableBytes());
                        return;
                    }
                    actualReadableBytes = actualReadableBytes();
                    if (actualReadableBytes > 0) {
                        list.add(byteBuf.readRetainedSlice(actualReadableBytes));
                        return;
                    }
                    return;
                }
                if (!"0.0.0.0".equals(this.dstAddr) && this.dstAddr.startsWith("0.0.0.")) {
                    this.dstAddr = readString("dstAddr", byteBuf);
                }
                list.add(new DefaultSocks4CommandRequest(this.type, this.dstAddr, this.dstPort, this.userId));
                checkpoint(State.SUCCESS);
                actualReadableBytes = actualReadableBytes();
                if (actualReadableBytes > 0) {
                }
            }
            this.userId = readString("userid", byteBuf);
            checkpoint(State.READ_DOMAIN);
            if (!"0.0.0.0".equals(this.dstAddr)) {
                this.dstAddr = readString("dstAddr", byteBuf);
            }
            list.add(new DefaultSocks4CommandRequest(this.type, this.dstAddr, this.dstPort, this.userId));
            checkpoint(State.SUCCESS);
            actualReadableBytes = actualReadableBytes();
            if (actualReadableBytes > 0) {
            }
        } catch (Exception e) {
            fail(list, e);
        }
    }

    private void fail(List<Object> list, Exception exc) {
        if (!(exc instanceof DecoderException)) {
            exc = new DecoderException(exc);
        }
        Socks4CommandType socks4CommandType = this.type;
        if (socks4CommandType == null) {
            socks4CommandType = Socks4CommandType.CONNECT;
        }
        String str = this.dstAddr;
        if (str == null) {
            str = "";
        }
        int i = this.dstPort;
        if (i == 0) {
            i = 65535;
        }
        String str2 = this.userId;
        DefaultSocks4CommandRequest defaultSocks4CommandRequest = new DefaultSocks4CommandRequest(socks4CommandType, str, i, str2 != null ? str2 : "");
        defaultSocks4CommandRequest.setDecoderResult(DecoderResult.failure(exc));
        list.add(defaultSocks4CommandRequest);
        checkpoint(State.FAILURE);
    }

    private static String readString(String str, ByteBuf byteBuf) {
        int bytesBefore = byteBuf.bytesBefore(256, (byte) 0);
        if (bytesBefore < 0) {
            throw new DecoderException("field '" + str + "' longer than 255 chars");
        }
        String byteBuf2 = byteBuf.readSlice(bytesBefore).toString(CharsetUtil.US_ASCII);
        byteBuf.skipBytes(1);
        return byteBuf2;
    }
}
