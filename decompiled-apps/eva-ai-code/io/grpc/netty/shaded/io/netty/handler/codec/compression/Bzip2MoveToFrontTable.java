package io.grpc.netty.shaded.io.netty.handler.codec.compression;

import com.google.common.base.Ascii;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpConstants;
import okio.Utf8;
/* loaded from: classes4.dex */
final class Bzip2MoveToFrontTable {
    private final byte[] mtf = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, 13, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, HttpConstants.DOUBLE_QUOTE, 35, 36, 37, 38, 39, 40, 41, 42, 43, HttpConstants.COMMA, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, HttpConstants.COLON, HttpConstants.SEMICOLON, 60, 61, 62, Utf8.REPLACEMENT_BYTE, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, Byte.MAX_VALUE, Byte.MIN_VALUE, -127, -126, -125, -124, -123, -122, -121, -120, -119, -118, -117, -116, -115, -114, -113, -112, -111, -110, -109, -108, -107, -106, -105, -104, -103, -102, -101, -100, -99, -98, -97, -96, -95, -94, -93, -92, -91, -90, -89, -88, -87, -86, -85, -84, -83, -82, -81, -80, -79, -78, -77, -76, -75, -74, -73, -72, -71, -70, -69, -68, -67, -66, -65, -64, -63, -62, -61, -60, -59, -58, -57, -56, -55, -54, -53, -52, -51, -50, -49, -48, -47, -46, -45, -44, -43, -42, -41, -40, -39, -38, -37, -36, -35, -34, -33, -32, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1};

    /* JADX INFO: Access modifiers changed from: package-private */
    public int valueToFront(byte b) {
        byte[] bArr = this.mtf;
        int i = 0;
        byte b2 = bArr[0];
        if (b != b2) {
            bArr[0] = b;
            while (b != b2) {
                i++;
                byte[] bArr2 = this.mtf;
                byte b3 = bArr2[i];
                bArr2[i] = b2;
                b2 = b3;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte indexToFront(int i) {
        byte[] bArr = this.mtf;
        byte b = bArr[i];
        System.arraycopy(bArr, 0, bArr, 1, i);
        this.mtf[0] = b;
        return b;
    }
}
