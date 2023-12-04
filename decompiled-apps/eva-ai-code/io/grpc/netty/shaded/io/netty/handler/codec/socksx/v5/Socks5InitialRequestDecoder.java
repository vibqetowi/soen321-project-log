package io.grpc.netty.shaded.io.netty.handler.codec.socksx.v5;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.DecoderException;
import io.grpc.netty.shaded.io.netty.handler.codec.DecoderResult;
import io.grpc.netty.shaded.io.netty.handler.codec.ReplayingDecoder;
import io.grpc.netty.shaded.io.netty.handler.codec.socksx.SocksVersion;
import java.util.List;
/* loaded from: classes4.dex */
public class Socks5InitialRequestDecoder extends ReplayingDecoder<State> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum State {
        INIT,
        SUCCESS,
        FAILURE
    }

    public Socks5InitialRequestDecoder() {
        super(State.INIT);
    }

    /* renamed from: io.grpc.netty.shaded.io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialRequestDecoder$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialRequestDecoder$State = iArr;
            try {
                iArr[State.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialRequestDecoder$State[State.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialRequestDecoder$State[State.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        try {
            int i = AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialRequestDecoder$State[state().ordinal()];
            if (i == 1) {
                byte readByte = byteBuf.readByte();
                if (readByte != SocksVersion.SOCKS5.byteValue()) {
                    throw new DecoderException("unsupported version: " + ((int) readByte) + " (expected: " + ((int) SocksVersion.SOCKS5.byteValue()) + ')');
                }
                int readUnsignedByte = byteBuf.readUnsignedByte();
                Socks5AuthMethod[] socks5AuthMethodArr = new Socks5AuthMethod[readUnsignedByte];
                for (int i2 = 0; i2 < readUnsignedByte; i2++) {
                    socks5AuthMethodArr[i2] = Socks5AuthMethod.valueOf(byteBuf.readByte());
                }
                list.add(new DefaultSocks5InitialRequest(socks5AuthMethodArr));
                checkpoint(State.SUCCESS);
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                byteBuf.skipBytes(actualReadableBytes());
                return;
            }
            int actualReadableBytes = actualReadableBytes();
            if (actualReadableBytes > 0) {
                list.add(byteBuf.readRetainedSlice(actualReadableBytes));
            }
        } catch (Exception e) {
            fail(list, e);
        }
    }

    private void fail(List<Object> list, Exception exc) {
        if (!(exc instanceof DecoderException)) {
            exc = new DecoderException(exc);
        }
        checkpoint(State.FAILURE);
        DefaultSocks5InitialRequest defaultSocks5InitialRequest = new DefaultSocks5InitialRequest(Socks5AuthMethod.NO_AUTH);
        defaultSocks5InitialRequest.setDecoderResult(DecoderResult.failure(exc));
        list.add(defaultSocks5InitialRequest);
    }
}
