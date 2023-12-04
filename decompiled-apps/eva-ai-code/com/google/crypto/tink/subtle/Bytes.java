package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes7.dex */
public final class Bytes {
    public static final boolean equal(final byte[] x, final byte[] y) {
        if (x == null || y == null || x.length != y.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < x.length; i2++) {
            i |= x[i2] ^ y[i2];
        }
        return i == 0;
    }

    public static byte[] concat(byte[]... chunks) throws GeneralSecurityException {
        int i = 0;
        for (byte[] bArr : chunks) {
            if (i > Integer.MAX_VALUE - bArr.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += bArr.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : chunks) {
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 += bArr3.length;
        }
        return bArr2;
    }

    public static final byte[] xor(final byte[] x, int offsetX, final byte[] y, int offsetY, int len) {
        if (len < 0 || x.length - len < offsetX || y.length - len < offsetY) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr = new byte[len];
        for (int i = 0; i < len; i++) {
            bArr[i] = (byte) (x[i + offsetX] ^ y[i + offsetY]);
        }
        return bArr;
    }

    public static final void xor(ByteBuffer output, ByteBuffer x, ByteBuffer y, int len) {
        if (len < 0 || x.remaining() < len || y.remaining() < len || output.remaining() < len) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i = 0; i < len; i++) {
            output.put((byte) (x.get() ^ y.get()));
        }
    }

    public static final byte[] xor(final byte[] x, final byte[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("The lengths of x and y should match.");
        }
        return xor(x, 0, y, 0, x.length);
    }

    public static final byte[] xorEnd(final byte[] a, final byte[] b) {
        if (a.length < b.length) {
            throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
        }
        int length = a.length - b.length;
        byte[] copyOf = Arrays.copyOf(a, a.length);
        for (int i = 0; i < b.length; i++) {
            int i2 = length + i;
            copyOf[i2] = (byte) (copyOf[i2] ^ b[i]);
        }
        return copyOf;
    }

    public static byte[] intToByteArray(int capacity, int value) {
        byte[] bArr = new byte[capacity];
        for (int i = 0; i < capacity; i++) {
            bArr[i] = (byte) ((value >> (i * 8)) & 255);
        }
        return bArr;
    }

    public static int byteArrayToInt(byte[] bytes) {
        return byteArrayToInt(bytes, bytes.length);
    }

    public static int byteArrayToInt(byte[] bytes, int length) {
        return byteArrayToInt(bytes, 0, length);
    }

    public static int byteArrayToInt(byte[] bytes, int offset, int length) {
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += (bytes[i2 + offset] & 255) << (i2 * 8);
        }
        return i;
    }
}
