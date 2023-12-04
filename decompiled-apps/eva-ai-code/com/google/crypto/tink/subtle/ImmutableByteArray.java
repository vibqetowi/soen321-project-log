package com.google.crypto.tink.subtle;
/* loaded from: classes7.dex */
public final class ImmutableByteArray {
    private final byte[] data;

    public static ImmutableByteArray of(final byte[] data) {
        if (data == null) {
            return null;
        }
        return of(data, 0, data.length);
    }

    public static ImmutableByteArray of(final byte[] data, final int start, final int len) {
        return new ImmutableByteArray(data, start, len);
    }

    public byte[] getBytes() {
        byte[] bArr = this.data;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public int getLength() {
        return this.data.length;
    }

    private ImmutableByteArray(final byte[] buf, final int start, final int len) {
        byte[] bArr = new byte[len];
        this.data = bArr;
        System.arraycopy(buf, start, bArr, 0, len);
    }
}
