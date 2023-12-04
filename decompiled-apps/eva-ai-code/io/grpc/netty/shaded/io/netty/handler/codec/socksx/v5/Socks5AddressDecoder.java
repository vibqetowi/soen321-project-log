package io.grpc.netty.shaded.io.netty.handler.codec.socksx.v5;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.handler.codec.DecoderException;
import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
import io.grpc.netty.shaded.io.netty.util.NetUtil;
/* loaded from: classes4.dex */
public interface Socks5AddressDecoder {
    public static final Socks5AddressDecoder DEFAULT = new Socks5AddressDecoder() { // from class: io.grpc.netty.shaded.io.netty.handler.codec.socksx.v5.Socks5AddressDecoder.1
        private static final int IPv6_LEN = 16;

        @Override // io.grpc.netty.shaded.io.netty.handler.codec.socksx.v5.Socks5AddressDecoder
        public String decodeAddress(Socks5AddressType socks5AddressType, ByteBuf byteBuf) throws Exception {
            if (socks5AddressType == Socks5AddressType.IPv4) {
                return NetUtil.intToIpAddress(byteBuf.readInt());
            }
            if (socks5AddressType == Socks5AddressType.DOMAIN) {
                short readUnsignedByte = byteBuf.readUnsignedByte();
                String byteBuf2 = byteBuf.toString(byteBuf.readerIndex(), readUnsignedByte, CharsetUtil.US_ASCII);
                byteBuf.skipBytes(readUnsignedByte);
                return byteBuf2;
            } else if (socks5AddressType == Socks5AddressType.IPv6) {
                if (byteBuf.hasArray()) {
                    int readerIndex = byteBuf.readerIndex();
                    byteBuf.readerIndex(readerIndex + 16);
                    return NetUtil.bytesToIpAddress(byteBuf.array(), byteBuf.arrayOffset() + readerIndex, 16);
                }
                byte[] bArr = new byte[16];
                byteBuf.readBytes(bArr);
                return NetUtil.bytesToIpAddress(bArr);
            } else {
                throw new DecoderException("unsupported address type: " + (socks5AddressType.byteValue() & 255));
            }
        }
    };

    String decodeAddress(Socks5AddressType socks5AddressType, ByteBuf byteBuf) throws Exception;
}
