package com.google.api.client.json.webtoken;

import com.google.api.client.util.Preconditions;
import java.math.BigInteger;
import java.util.Arrays;
/* loaded from: classes7.dex */
public class DerEncoder {
    private static byte DER_TAG_ASN1_INTEGER = 2;
    private static byte DER_TAG_SIGNATURE_OBJECT = 48;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] encode(byte[] bArr) {
        Preconditions.checkState(bArr.length == 64);
        byte[] byteArray = new BigInteger(1, Arrays.copyOfRange(bArr, 0, 32)).toByteArray();
        byte[] byteArray2 = new BigInteger(1, Arrays.copyOfRange(bArr, 32, 64)).toByteArray();
        int length = byteArray.length + 6 + byteArray2.length;
        byte[] bArr2 = new byte[length];
        bArr2[0] = DER_TAG_SIGNATURE_OBJECT;
        bArr2[1] = (byte) (length - 2);
        bArr2[2] = DER_TAG_ASN1_INTEGER;
        bArr2[3] = (byte) byteArray.length;
        System.arraycopy(byteArray, 0, bArr2, 4, byteArray.length);
        int length2 = byteArray.length + 4;
        bArr2[length2] = DER_TAG_ASN1_INTEGER;
        bArr2[length2 + 1] = (byte) byteArray2.length;
        System.arraycopy(byteArray2, 0, bArr2, length2 + 2, byteArray2.length);
        return bArr2;
    }
}
