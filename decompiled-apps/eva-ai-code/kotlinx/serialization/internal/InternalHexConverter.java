package kotlinx.serialization.internal;

import com.google.common.base.Ascii;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: Platform.common.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/internal/InternalHexConverter;", "", "()V", "hexCode", "", "hexToInt", "", "ch", "", "parseHexBinary", "", "s", "printHexBinary", "data", "lowerCase", "", "toHexString", "n", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InternalHexConverter {
    public static final InternalHexConverter INSTANCE = new InternalHexConverter();
    private static final String hexCode = "0123456789ABCDEF";

    private final int hexToInt(char c) {
        boolean z = true;
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'A';
        if (!('A' <= c && c < 'G')) {
            c2 = 'a';
            if ('a' > c || c >= 'g') {
                z = false;
            }
            if (!z) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    private InternalHexConverter() {
    }

    public final byte[] parseHexBinary(String s) {
        int i;
        Intrinsics.checkNotNullParameter(s, "s");
        int length = s.length();
        if (!(length % 2 == 0)) {
            throw new IllegalArgumentException("HexBinary string must be even length".toString());
        }
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 < length; i2 += 2) {
            int hexToInt = hexToInt(s.charAt(i2));
            int hexToInt2 = hexToInt(s.charAt(i2 + 1));
            if (!((hexToInt == -1 || hexToInt2 == -1) ? false : true)) {
                throw new IllegalArgumentException(("Invalid hex chars: " + s.charAt(i2) + s.charAt(i)).toString());
            }
            bArr[i2 / 2] = (byte) ((hexToInt << 4) + hexToInt2);
        }
        return bArr;
    }

    public static /* synthetic */ String printHexBinary$default(InternalHexConverter internalHexConverter, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return internalHexConverter.printHexBinary(bArr, z);
    }

    public final String printHexBinary(byte[] data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb = new StringBuilder(data.length * 2);
        for (byte b : data) {
            sb.append(hexCode.charAt((b >> 4) & 15));
            sb.append(hexCode.charAt(b & Ascii.SI));
        }
        if (!z) {
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "r.toString()");
            return sb2;
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "r.toString()");
        String lowerCase = sb3.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final String toHexString(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) (i >> (24 - (i2 * 8)));
        }
        String trimStart = StringsKt.trimStart(printHexBinary(bArr, true), '0');
        if (!(trimStart.length() > 0)) {
            trimStart = null;
        }
        return trimStart == null ? "0" : trimStart;
    }
}
