package io.grpc.netty.shaded.io.netty.internal.tcnative;

import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
public final class Buffer {
    public static native long address(ByteBuffer byteBuffer);

    public static native long size(ByteBuffer byteBuffer);

    private Buffer() {
    }
}
