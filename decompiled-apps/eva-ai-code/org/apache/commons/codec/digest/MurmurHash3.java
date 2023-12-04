package org.apache.commons.codec.digest;

import com.google.common.base.Ascii;
import org.apache.commons.codec.binary.StringUtils;
/* loaded from: classes5.dex */
public final class MurmurHash3 {
    private static final long C1 = -8663945395140668459L;
    private static final int C1_32 = -862048943;
    private static final long C2 = 5545529020109919103L;
    private static final int C2_32 = 461845907;
    public static final int DEFAULT_SEED = 104729;
    static final int INTEGER_BYTES = 4;
    static final int LONG_BYTES = 8;
    private static final int M = 5;
    private static final int M_32 = 5;
    private static final int N1 = 1390208809;
    private static final int N2 = 944331445;
    @Deprecated
    public static final long NULL_HASHCODE = 2862933555777941757L;
    private static final int N_32 = -430675100;
    private static final int R1 = 31;
    private static final int R1_32 = 15;
    private static final int R2 = 27;
    private static final int R2_32 = 13;
    private static final int R3 = 33;
    static final int SHORT_BYTES = 2;

    /* JADX INFO: Access modifiers changed from: private */
    public static int fmix32(int i) {
        int i2 = (i ^ (i >>> 16)) * (-2048144789);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
        return i3 ^ (i3 >>> 16);
    }

    private static long fmix64(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private MurmurHash3() {
    }

    public static int hash32(long j, long j2) {
        return hash32(j, j2, (int) DEFAULT_SEED);
    }

    public static int hash32(long j, long j2, int i) {
        long reverseBytes = Long.reverseBytes(j);
        long reverseBytes2 = Long.reverseBytes(j2);
        int i2 = (int) reverseBytes2;
        return fmix32(mix32((int) (reverseBytes2 >>> 32), mix32(i2, mix32((int) (reverseBytes >>> 32), mix32((int) reverseBytes, i)))) ^ 16);
    }

    public static int hash32(long j) {
        return hash32(j, (int) DEFAULT_SEED);
    }

    public static int hash32(long j, int i) {
        long reverseBytes = Long.reverseBytes(j);
        return fmix32(mix32((int) (reverseBytes >>> 32), mix32((int) reverseBytes, i)) ^ 8);
    }

    @Deprecated
    public static int hash32(byte[] bArr) {
        return hash32(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    @Deprecated
    public static int hash32(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash32(bytesUtf8, 0, bytesUtf8.length, DEFAULT_SEED);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i) {
        return hash32(bArr, i, (int) DEFAULT_SEED);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i, int i2) {
        return hash32(bArr, 0, i, i2);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            i3 = mix32(getLittleEndianInt(bArr, (i5 << 2) + i), i3);
        }
        int i6 = (i4 << 2) + i;
        int i7 = (i + i2) - i6;
        if (i7 != 1) {
            if (i7 != 2) {
                r1 = i7 == 3 ? 0 ^ (bArr[i6 + 2] << Ascii.DLE) : 0;
                return fmix32(i3 ^ i2);
            }
            r1 ^= bArr[i6 + 1] << 8;
        }
        i3 ^= Integer.rotateLeft((bArr[i6] ^ r1) * C1_32, 15) * C2_32;
        return fmix32(i3 ^ i2);
    }

    public static int hash32x86(byte[] bArr) {
        return hash32x86(bArr, 0, bArr.length, 0);
    }

    public static int hash32x86(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            i3 = mix32(getLittleEndianInt(bArr, (i5 << 2) + i), i3);
        }
        int i6 = (i4 << 2) + i;
        int i7 = (i + i2) - i6;
        if (i7 != 1) {
            if (i7 != 2) {
                r1 = i7 == 3 ? 0 ^ ((bArr[i6 + 2] & 255) << 16) : 0;
                return fmix32(i3 ^ i2);
            }
            r1 ^= (bArr[i6 + 1] & 255) << 8;
        }
        i3 ^= Integer.rotateLeft(((bArr[i6] & 255) ^ r1) * C1_32, 15) * C2_32;
        return fmix32(i3 ^ i2);
    }

    @Deprecated
    public static long hash64(long j) {
        return fmix64(((Long.rotateLeft((Long.rotateLeft(Long.reverseBytes(j) * C1, 31) * C2) ^ 104729, 27) * 5) + 1390208809) ^ 8);
    }

    @Deprecated
    public static long hash64(int i) {
        return fmix64(((Long.rotateLeft((Integer.reverseBytes(i) & 4294967295L) * C1, 31) * C2) ^ 104729) ^ 4);
    }

    @Deprecated
    public static long hash64(short s) {
        return fmix64(((Long.rotateLeft(((((s & 255) << 8) ^ 0) ^ (255 & ((s & 65280) >> 8))) * C1, 31) * C2) ^ 104729) ^ 2);
    }

    @Deprecated
    public static long hash64(byte[] bArr) {
        return hash64(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    @Deprecated
    public static long hash64(byte[] bArr, int i, int i2) {
        return hash64(bArr, i, i2, DEFAULT_SEED);
    }

    @Deprecated
    public static long hash64(byte[] bArr, int i, int i2, int i3) {
        int i4;
        long j = i3;
        int i5 = i2 >> 3;
        for (int i6 = 0; i6 < i5; i6++) {
            j = (Long.rotateLeft(j ^ (Long.rotateLeft(getLittleEndianLong(bArr, i + (i6 << 3)) * C1, 31) * C2), 27) * 5) + 1390208809;
        }
        long j2 = 0;
        switch ((i + i2) - (i + (i5 << 3))) {
            case 7:
                j2 = 0 ^ ((bArr[i4 + 6] & 255) << 48);
            case 6:
                j2 ^= (bArr[i4 + 5] & 255) << 40;
            case 5:
                j2 ^= (bArr[i4 + 4] & 255) << 32;
            case 4:
                j2 ^= (bArr[i4 + 3] & 255) << 24;
            case 3:
                j2 ^= (bArr[i4 + 2] & 255) << 16;
            case 2:
                j2 ^= (bArr[i4 + 1] & 255) << 8;
            case 1:
                j ^= Long.rotateLeft(((bArr[i4] & 255) ^ j2) * C1, 31) * C2;
                break;
        }
        return fmix64(i2 ^ j);
    }

    public static long[] hash128(byte[] bArr) {
        return hash128(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    public static long[] hash128x64(byte[] bArr) {
        return hash128x64(bArr, 0, bArr.length, 0);
    }

    @Deprecated
    public static long[] hash128(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash128(bytesUtf8, 0, bytesUtf8.length, DEFAULT_SEED);
    }

    @Deprecated
    public static long[] hash128(byte[] bArr, int i, int i2, int i3) {
        return hash128x64Internal(bArr, i, i2, i3);
    }

    public static long[] hash128x64(byte[] bArr, int i, int i2, int i3) {
        return hash128x64Internal(bArr, i, i2, i3 & 4294967295L);
    }

    private static long[] hash128x64Internal(byte[] bArr, int i, int i2, long j) {
        int i3;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        byte[] bArr2 = bArr;
        int i4 = i2 >> 4;
        long j9 = j;
        long j10 = j9;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i + (i5 << 4);
            long littleEndianLong = getLittleEndianLong(bArr2, i6);
            long littleEndianLong2 = getLittleEndianLong(bArr2, i6 + 8);
            long rotateLeft = ((Long.rotateLeft((Long.rotateLeft(littleEndianLong * C1, 31) * C2) ^ j9, 27) + j10) * 5) + 1390208809;
            j10 = ((Long.rotateLeft(j10 ^ (Long.rotateLeft(C2 * littleEndianLong2, 33) * C1), 31) + rotateLeft) * 5) + 944331445;
            i5++;
            j9 = rotateLeft;
            bArr2 = bArr;
        }
        long j11 = 0;
        switch ((i + i2) - (i + (i4 << 4))) {
            case 1:
                j2 = j9;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 2:
                j2 = j9;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 3:
                j2 = j9;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 4:
                j2 = j9;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 5:
                j2 = j9;
                j11 ^= (bArr[i3 + 4] & 255) << 32;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 6:
                j2 = j9;
                j11 ^= (bArr[i3 + 5] & 255) << 40;
                j11 ^= (bArr[i3 + 4] & 255) << 32;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 7:
                j2 = j9;
                j11 ^= (bArr[i3 + 6] & 255) << 48;
                j11 ^= (bArr[i3 + 5] & 255) << 40;
                j11 ^= (bArr[i3 + 4] & 255) << 32;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 8:
                j2 = j9;
                j11 = 0 ^ ((bArr[i3 + 7] & 255) << 56);
                j11 ^= (bArr[i3 + 6] & 255) << 48;
                j11 ^= (bArr[i3 + 5] & 255) << 40;
                j11 ^= (bArr[i3 + 4] & 255) << 32;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 9:
                j2 = j9;
                j3 = 0;
                j10 ^= Long.rotateLeft((j3 ^ (bArr[i3 + 8] & 255)) * C2, 33) * C1;
                j11 = 0 ^ ((bArr[i3 + 7] & 255) << 56);
                j11 ^= (bArr[i3 + 6] & 255) << 48;
                j11 ^= (bArr[i3 + 5] & 255) << 40;
                j11 ^= (bArr[i3 + 4] & 255) << 32;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 10:
                j2 = j9;
                j4 = 0;
                j3 = j4 ^ ((bArr[i3 + 9] & 255) << 8);
                j10 ^= Long.rotateLeft((j3 ^ (bArr[i3 + 8] & 255)) * C2, 33) * C1;
                j11 = 0 ^ ((bArr[i3 + 7] & 255) << 56);
                j11 ^= (bArr[i3 + 6] & 255) << 48;
                j11 ^= (bArr[i3 + 5] & 255) << 40;
                j11 ^= (bArr[i3 + 4] & 255) << 32;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 11:
                j2 = j9;
                j5 = 0;
                j4 = j5 ^ ((bArr[i3 + 10] & 255) << 16);
                j3 = j4 ^ ((bArr[i3 + 9] & 255) << 8);
                j10 ^= Long.rotateLeft((j3 ^ (bArr[i3 + 8] & 255)) * C2, 33) * C1;
                j11 = 0 ^ ((bArr[i3 + 7] & 255) << 56);
                j11 ^= (bArr[i3 + 6] & 255) << 48;
                j11 ^= (bArr[i3 + 5] & 255) << 40;
                j11 ^= (bArr[i3 + 4] & 255) << 32;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 12:
                j2 = j9;
                j6 = 0;
                j5 = j6 ^ ((bArr[i3 + 11] & 255) << 24);
                j4 = j5 ^ ((bArr[i3 + 10] & 255) << 16);
                j3 = j4 ^ ((bArr[i3 + 9] & 255) << 8);
                j10 ^= Long.rotateLeft((j3 ^ (bArr[i3 + 8] & 255)) * C2, 33) * C1;
                j11 = 0 ^ ((bArr[i3 + 7] & 255) << 56);
                j11 ^= (bArr[i3 + 6] & 255) << 48;
                j11 ^= (bArr[i3 + 5] & 255) << 40;
                j11 ^= (bArr[i3 + 4] & 255) << 32;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 13:
                j2 = j9;
                j7 = 0;
                j6 = j7 ^ ((bArr[i3 + 12] & 255) << 32);
                j5 = j6 ^ ((bArr[i3 + 11] & 255) << 24);
                j4 = j5 ^ ((bArr[i3 + 10] & 255) << 16);
                j3 = j4 ^ ((bArr[i3 + 9] & 255) << 8);
                j10 ^= Long.rotateLeft((j3 ^ (bArr[i3 + 8] & 255)) * C2, 33) * C1;
                j11 = 0 ^ ((bArr[i3 + 7] & 255) << 56);
                j11 ^= (bArr[i3 + 6] & 255) << 48;
                j11 ^= (bArr[i3 + 5] & 255) << 40;
                j11 ^= (bArr[i3 + 4] & 255) << 32;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 14:
                j8 = 0;
                j2 = j9;
                j7 = ((bArr[i3 + 13] & 255) << 40) ^ j8;
                j6 = j7 ^ ((bArr[i3 + 12] & 255) << 32);
                j5 = j6 ^ ((bArr[i3 + 11] & 255) << 24);
                j4 = j5 ^ ((bArr[i3 + 10] & 255) << 16);
                j3 = j4 ^ ((bArr[i3 + 9] & 255) << 8);
                j10 ^= Long.rotateLeft((j3 ^ (bArr[i3 + 8] & 255)) * C2, 33) * C1;
                j11 = 0 ^ ((bArr[i3 + 7] & 255) << 56);
                j11 ^= (bArr[i3 + 6] & 255) << 48;
                j11 ^= (bArr[i3 + 5] & 255) << 40;
                j11 ^= (bArr[i3 + 4] & 255) << 32;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
            case 15:
                j8 = ((bArr[i3 + 14] & 255) << 48) ^ 0;
                j2 = j9;
                j7 = ((bArr[i3 + 13] & 255) << 40) ^ j8;
                j6 = j7 ^ ((bArr[i3 + 12] & 255) << 32);
                j5 = j6 ^ ((bArr[i3 + 11] & 255) << 24);
                j4 = j5 ^ ((bArr[i3 + 10] & 255) << 16);
                j3 = j4 ^ ((bArr[i3 + 9] & 255) << 8);
                j10 ^= Long.rotateLeft((j3 ^ (bArr[i3 + 8] & 255)) * C2, 33) * C1;
                j11 = 0 ^ ((bArr[i3 + 7] & 255) << 56);
                j11 ^= (bArr[i3 + 6] & 255) << 48;
                j11 ^= (bArr[i3 + 5] & 255) << 40;
                j11 ^= (bArr[i3 + 4] & 255) << 32;
                j11 ^= (bArr[i3 + 3] & 255) << 24;
                j11 ^= (bArr[i3 + 2] & 255) << 16;
                j11 ^= (bArr[i3 + 1] & 255) << 8;
                j9 = j2 ^ (Long.rotateLeft((j11 ^ (bArr[i3] & 255)) * C1, 31) * C2);
                break;
        }
        long j12 = i2;
        long j13 = j9 ^ j12;
        long j14 = j12 ^ j10;
        long j15 = j13 + j14;
        long j16 = j14 + j15;
        long fmix64 = fmix64(j15);
        long fmix642 = fmix64(j16);
        long j17 = fmix64 + fmix642;
        return new long[]{j17, fmix642 + j17};
    }

    private static long getLittleEndianLong(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLittleEndianInt(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mix32(int i, int i2) {
        return (Integer.rotateLeft((Integer.rotateLeft(i * C1_32, 15) * C2_32) ^ i2, 13) * 5) + N_32;
    }

    /* loaded from: classes5.dex */
    public static class IncrementalHash32x86 {
        private static final int BLOCK_SIZE = 4;
        private int hash;
        private int totalLen;
        private final byte[] unprocessed = new byte[3];
        private int unprocessedLength;

        private static int orBytes(byte b, byte b2, byte b3, byte b4) {
            return (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16) | ((b4 & 255) << 24);
        }

        public final void start(int i) {
            this.totalLen = 0;
            this.unprocessedLength = 0;
            this.hash = i;
        }

        public final void add(byte[] bArr, int i, int i2) {
            int orBytes;
            if (i2 <= 0) {
                return;
            }
            this.totalLen += i2;
            int i3 = this.unprocessedLength;
            if ((i3 + i2) - 4 < 0) {
                System.arraycopy(bArr, i, this.unprocessed, i3, i2);
                this.unprocessedLength += i2;
                return;
            }
            if (i3 > 0) {
                if (i3 == 1) {
                    orBytes = orBytes(this.unprocessed[0], bArr[i], bArr[i + 1], bArr[i + 2]);
                } else if (i3 == 2) {
                    byte[] bArr2 = this.unprocessed;
                    orBytes = orBytes(bArr2[0], bArr2[1], bArr[i], bArr[i + 1]);
                } else if (i3 == 3) {
                    byte[] bArr3 = this.unprocessed;
                    orBytes = orBytes(bArr3[0], bArr3[1], bArr3[2], bArr[i]);
                } else {
                    throw new IllegalStateException("Unprocessed length should be 1, 2, or 3: " + this.unprocessedLength);
                }
                this.hash = MurmurHash3.mix32(orBytes, this.hash);
                int i4 = 4 - this.unprocessedLength;
                i += i4;
                i2 -= i4;
            }
            int i5 = i2 >> 2;
            for (int i6 = 0; i6 < i5; i6++) {
                this.hash = MurmurHash3.mix32(MurmurHash3.getLittleEndianInt(bArr, (i6 << 2) + i), this.hash);
            }
            int i7 = i5 << 2;
            int i8 = i2 - i7;
            this.unprocessedLength = i8;
            if (i8 != 0) {
                System.arraycopy(bArr, i + i7, this.unprocessed, 0, i8);
            }
        }

        public final int end() {
            return finalise(this.hash, this.unprocessedLength, this.unprocessed, this.totalLen);
        }

        int finalise(int i, int i2, byte[] bArr, int i3) {
            int i4;
            int i5;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i5 = ((bArr[2] & 255) << 16) ^ 0;
                    }
                    return MurmurHash3.fmix32(i ^ i3);
                }
                i5 = 0;
                i4 = i5 ^ ((bArr[1] & 255) << 8);
            } else {
                i4 = 0;
            }
            i ^= Integer.rotateLeft((i4 ^ (bArr[0] & 255)) * MurmurHash3.C1_32, 15) * MurmurHash3.C2_32;
            return MurmurHash3.fmix32(i ^ i3);
        }
    }

    @Deprecated
    /* loaded from: classes5.dex */
    public static class IncrementalHash32 extends IncrementalHash32x86 {
        @Override // org.apache.commons.codec.digest.MurmurHash3.IncrementalHash32x86
        @Deprecated
        int finalise(int i, int i2, byte[] bArr, int i3) {
            int i4;
            int i5;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i5 = (bArr[2] << Ascii.DLE) ^ 0;
                    }
                    return MurmurHash3.fmix32(i ^ i3);
                }
                i5 = 0;
                i4 = i5 ^ (bArr[1] << 8);
            } else {
                i4 = 0;
            }
            i ^= Integer.rotateLeft((i4 ^ bArr[0]) * MurmurHash3.C1_32, 15) * MurmurHash3.C2_32;
            return MurmurHash3.fmix32(i ^ i3);
        }
    }
}
