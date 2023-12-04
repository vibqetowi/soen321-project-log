package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.Ed25519;
import java.lang.reflect.Array;
import java.math.BigInteger;
/* loaded from: classes7.dex */
final class Ed25519Constants {
    static final Ed25519.CachedXYT[] B2;
    static final Ed25519.CachedXYT[][] B_TABLE;
    static final long[] D;
    static final long[] D2;
    private static final BigInteger D2_BI;
    private static final BigInteger D_BI;
    private static final BigInteger P_BI;
    static final long[] SQRTM1;
    private static final BigInteger SQRTM1_BI;

    Ed25519Constants() {
    }

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        P_BI = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        D_BI = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        D2_BI = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        SQRTM1_BI = modPow;
        Point point = new Point();
        point.y = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        point.x = recoverX(point.y);
        D = Field25519.expand(toLittleEndian(mod));
        D2 = Field25519.expand(toLittleEndian(mod2));
        SQRTM1 = Field25519.expand(toLittleEndian(modPow));
        B_TABLE = (Ed25519.CachedXYT[][]) Array.newInstance(Ed25519.CachedXYT.class, 32, 8);
        Point point2 = point;
        for (int i = 0; i < 32; i++) {
            Point point3 = point2;
            for (int i2 = 0; i2 < 8; i2++) {
                B_TABLE[i][i2] = getCachedXYT(point3);
                point3 = edwards(point3, point2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                point2 = edwards(point2, point2);
            }
        }
        Point edwards = edwards(point, point);
        B2 = new Ed25519.CachedXYT[8];
        for (int i4 = 0; i4 < 8; i4++) {
            B2[i4] = getCachedXYT(point);
            point = edwards(point, edwards);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class Point {
        private BigInteger x;
        private BigInteger y;

        private Point() {
        }
    }

    private static BigInteger recoverX(BigInteger y) {
        BigInteger subtract = y.pow(2).subtract(BigInteger.ONE);
        BigInteger add = D_BI.multiply(y.pow(2)).add(BigInteger.ONE);
        BigInteger bigInteger = P_BI;
        BigInteger multiply = subtract.multiply(add.modInverse(bigInteger));
        BigInteger modPow = multiply.modPow(bigInteger.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger);
        if (!modPow.pow(2).subtract(multiply).mod(bigInteger).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(SQRTM1_BI).mod(bigInteger);
        }
        return modPow.testBit(0) ? bigInteger.subtract(modPow) : modPow;
    }

    private static Point edwards(Point a, Point b) {
        Point point = new Point();
        BigInteger multiply = D_BI.multiply(a.x.multiply(b.x).multiply(a.y).multiply(b.y));
        BigInteger bigInteger = P_BI;
        BigInteger mod = multiply.mod(bigInteger);
        point.x = a.x.multiply(b.y).add(b.x.multiply(a.y)).multiply(BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger);
        point.y = a.y.multiply(b.y).add(a.x.multiply(b.x)).multiply(BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return point;
    }

    private static byte[] toLittleEndian(BigInteger n) {
        byte[] bArr = new byte[32];
        byte[] byteArray = n.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = (32 - i) - 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    private static Ed25519.CachedXYT getCachedXYT(Point p) {
        BigInteger add = p.y.add(p.x);
        BigInteger bigInteger = P_BI;
        return new Ed25519.CachedXYT(Field25519.expand(toLittleEndian(add.mod(bigInteger))), Field25519.expand(toLittleEndian(p.y.subtract(p.x).mod(bigInteger))), Field25519.expand(toLittleEndian(D2_BI.multiply(p.x).multiply(p.y).mod(bigInteger))));
    }
}
