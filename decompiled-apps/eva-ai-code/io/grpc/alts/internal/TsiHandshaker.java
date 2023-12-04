package io.grpc.alts.internal;

import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public interface TsiHandshaker {
    void close();

    TsiFrameProtector createFrameProtector(int i, ByteBufAllocator byteBufAllocator);

    TsiFrameProtector createFrameProtector(ByteBufAllocator byteBufAllocator);

    TsiPeer extractPeer() throws GeneralSecurityException;

    Object extractPeerObject() throws GeneralSecurityException;

    void getBytesToSendToPeer(ByteBuffer byteBuffer) throws GeneralSecurityException;

    boolean isInProgress();

    boolean processBytesFromPeer(ByteBuffer byteBuffer) throws GeneralSecurityException;
}
