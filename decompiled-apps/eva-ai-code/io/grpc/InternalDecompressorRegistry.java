package io.grpc;
/* loaded from: classes4.dex */
public final class InternalDecompressorRegistry {
    private InternalDecompressorRegistry() {
    }

    public static byte[] getRawAdvertisedMessageEncodings(DecompressorRegistry decompressorRegistry) {
        return decompressorRegistry.getRawAdvertisedMessageEncodings();
    }
}
