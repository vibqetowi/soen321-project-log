package kotlin.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;
/* compiled from: HexExtensions.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a@\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u001a@\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u001a \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a,\u0010\u0018\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002\u001a,\u0010\u001d\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H\u0002\u001a\u001c\u0010#\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002\u001a\u0014\u0010$\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000bH\u0002\u001a*\u0010%\u001a\u00020&*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010%\u001a\u00020&*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010)\u001a\u00020**\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010)\u001a\u00020**\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010+\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010+\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010,\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010,\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a0\u0010-\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(2\u0006\u0010 \u001a\u00020\u000bH\u0003\u001a*\u0010.\u001a\u00020/*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010.\u001a\u00020/*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020&2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u00100\u001a\u00020\u0005*\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020*2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020\b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020/2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u001c\u00101\u001a\u00020\u0005*\u00020\b2\u0006\u0010'\u001a\u00020(2\u0006\u00102\u001a\u00020\u000bH\u0003\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"HEX_DIGITS_TO_DECIMAL", "", "getHEX_DIGITS_TO_DECIMAL$annotations", "()V", "LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "charsPerSet", "", "charsPerElement", "elementsPerSet", "", "elementSeparatorLength", "formattedStringLength", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "parsedByteArrayMaxSize", "stringLength", "wholeElementsPerSet", "checkContainsAt", "part", FirebaseAnalytics.Param.INDEX, "endIndex", "partName", "checkHexLength", "", "startIndex", "maxDigits", "requireMaxLength", "", "checkNewLineAt", "decimalFromHexDigitAt", "hexToByte", "", "format", "Lkotlin/text/HexFormat;", "hexToByteArray", "", "hexToInt", "hexToLong", "hexToLongImpl", "hexToShort", "", "toHexString", "toHexStringImpl", "bits", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HexExtensionsKt {
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    private static /* synthetic */ void getHEX_DIGITS_TO_DECIMAL$annotations() {
    }

    static {
        int[] iArr = new int[128];
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            iArr[i2] = -1;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < r0.length()) {
            iArr[r0.charAt(i3)] = i4;
            i3++;
            i4++;
        }
        int i5 = 0;
        while (i < r0.length()) {
            iArr[r0.charAt(i)] = i5;
            i++;
            i5++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr;
    }

    public static final String toHexString(byte[] bArr, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, i, i2, hexFormat);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String toHexString(byte[] bArr, int i, int i2, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, bArr.length);
        if (i == i2) {
            return "";
        }
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytes = format.getBytes();
        int bytesPerLine = bytes.getBytesPerLine();
        int bytesPerGroup = bytes.getBytesPerGroup();
        String bytePrefix = bytes.getBytePrefix();
        String byteSuffix = bytes.getByteSuffix();
        String byteSeparator = bytes.getByteSeparator();
        String groupSeparator = bytes.getGroupSeparator();
        int formattedStringLength = formattedStringLength(i2 - i, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        StringBuilder sb = new StringBuilder(formattedStringLength);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < i2; i5++) {
            int i6 = bArr[i5] & 255;
            if (i3 == bytesPerLine) {
                sb.append('\n');
                i3 = 0;
            } else {
                if (i4 == bytesPerGroup) {
                    sb.append(groupSeparator);
                }
                if (i4 == 0) {
                    sb.append(byteSeparator);
                }
                sb.append(bytePrefix);
                sb.append(str.charAt(i6 >> 4));
                sb.append(str.charAt(i6 & 15));
                sb.append(byteSuffix);
                i4++;
                i3++;
            }
            i4 = 0;
            if (i4 == 0) {
            }
            sb.append(bytePrefix);
            sb.append(str.charAt(i6 >> 4));
            sb.append(str.charAt(i6 & 15));
            sb.append(byteSuffix);
            i4++;
            i3++;
        }
        if (formattedStringLength == sb.length()) {
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
            return sb2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final int formattedStringLength(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (!(i > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = (i - 1) / i2;
        int i11 = (i2 - 1) / i3;
        int i12 = i % i2;
        if (i12 != 0) {
            i2 = i12;
        }
        long j = i10 + (((i11 * i10) + ((i2 - 1) / i3)) * i4) + (((i8 - i10) - i9) * i5) + (i * (i6 + 2 + i7));
        if (RangesKt.intRangeContains((ClosedRange<Integer>) new IntRange(0, Integer.MAX_VALUE), j)) {
            return (int) j;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m7492toStringimpl(ULong.m7446constructorimpl(j))));
    }

    public static final byte[] hexToByteArray(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    static /* synthetic */ byte[] hexToByteArray$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByteArray(str, i, i2, hexFormat);
    }

    private static final byte[] hexToByteArray(String str, int i, int i2, HexFormat hexFormat) {
        int i3 = i;
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i3, i2, str.length());
        if (i3 == i2) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        int bytesPerLine = bytes.getBytesPerLine();
        int bytesPerGroup = bytes.getBytesPerGroup();
        String bytePrefix = bytes.getBytePrefix();
        String byteSuffix = bytes.getByteSuffix();
        String byteSeparator = bytes.getByteSeparator();
        String groupSeparator = bytes.getGroupSeparator();
        String str2 = byteSeparator;
        int parsedByteArrayMaxSize = parsedByteArrayMaxSize(i2 - i3, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] bArr = new byte[parsedByteArrayMaxSize];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < i2) {
            if (i5 == bytesPerLine) {
                i3 = checkNewLineAt(str, i3, i2);
                i5 = 0;
            } else if (i6 == bytesPerGroup) {
                i3 = checkContainsAt(str, groupSeparator, i3, i2, "group separator");
            } else {
                if (i6 != 0) {
                    i3 = checkContainsAt(str, str2, i3, i2, "byte separator");
                }
                i5++;
                i6++;
                int checkContainsAt = checkContainsAt(str, bytePrefix, i3, i2, "byte prefix");
                checkHexLength(str, checkContainsAt, RangesKt.coerceAtMost(checkContainsAt + 2, i2), 2, true);
                int i7 = checkContainsAt + 1;
                bArr[i4] = (byte) ((decimalFromHexDigitAt(str, checkContainsAt) << 4) | decimalFromHexDigitAt(str, i7));
                i3 = checkContainsAt(str, byteSuffix, i7 + 1, i2, "byte suffix");
                i4++;
                str2 = str2;
            }
            i6 = 0;
            i5++;
            i6++;
            int checkContainsAt2 = checkContainsAt(str, bytePrefix, i3, i2, "byte prefix");
            checkHexLength(str, checkContainsAt2, RangesKt.coerceAtMost(checkContainsAt2 + 2, i2), 2, true);
            int i72 = checkContainsAt2 + 1;
            bArr[i4] = (byte) ((decimalFromHexDigitAt(str, checkContainsAt2) << 4) | decimalFromHexDigitAt(str, i72));
            i3 = checkContainsAt(str, byteSuffix, i72 + 1, i2, "byte suffix");
            i4++;
            str2 = str2;
        }
        if (i4 == parsedByteArrayMaxSize) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i4);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final int parsedByteArrayMaxSize(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long charsPerSet;
        if (!(i > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j = i6 + 2 + i7;
        long charsPerSet2 = charsPerSet(j, i3, i5);
        if (i2 <= i3) {
            charsPerSet = charsPerSet(j, i2, i5);
        } else {
            charsPerSet = charsPerSet(charsPerSet2, i2 / i3, i4);
            int i8 = i2 % i3;
            if (i8 != 0) {
                charsPerSet = charsPerSet + i4 + charsPerSet(j, i8, i5);
            }
        }
        long j2 = i;
        long wholeElementsPerSet = wholeElementsPerSet(j2, charsPerSet, 1);
        long j3 = j2 - ((charsPerSet + 1) * wholeElementsPerSet);
        long wholeElementsPerSet2 = wholeElementsPerSet(j3, charsPerSet2, i4);
        long j4 = j3 - ((charsPerSet2 + i4) * wholeElementsPerSet2);
        long wholeElementsPerSet3 = wholeElementsPerSet(j4, j, i5);
        return (int) ((j4 - ((j + ((long) i5)) * wholeElementsPerSet3) > 0 ? 1 : 0) + (wholeElementsPerSet * i2) + (wholeElementsPerSet2 * i3) + wholeElementsPerSet3);
    }

    private static final long charsPerSet(long j, int i, int i2) {
        if (i > 0) {
            long j2 = i;
            return (j * j2) + (i2 * (j2 - 1));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final long wholeElementsPerSet(long j, long j2, int i) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }

    private static final int checkNewLineAt(String str, int i, int i2) {
        if (str.charAt(i) == '\r') {
            int i3 = i + 1;
            return (i3 >= i2 || str.charAt(i3) != '\n') ? i3 : i + 2;
        } else if (str.charAt(i) == '\n') {
            return i + 1;
        } else {
            throw new NumberFormatException("Expected a new line at index " + i + ", but was " + str.charAt(i));
        }
    }

    public static final String toHexString(byte b, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(b, format, 8);
    }

    public static /* synthetic */ String toHexString$default(byte b, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(b, hexFormat);
    }

    public static final byte hexToByte(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    static /* synthetic */ byte hexToByte$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByte(str, i, i2, hexFormat);
    }

    private static final byte hexToByte(String str, int i, int i2, HexFormat hexFormat) {
        return (byte) hexToLongImpl(str, i, i2, hexFormat, 2);
    }

    public static final String toHexString(short s, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(s, format, 16);
    }

    public static /* synthetic */ String toHexString$default(short s, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(s, hexFormat);
    }

    public static final short hexToShort(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort(str, 0, str.length(), format);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    static /* synthetic */ short hexToShort$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToShort(str, i, i2, hexFormat);
    }

    private static final short hexToShort(String str, int i, int i2, HexFormat hexFormat) {
        return (short) hexToLongImpl(str, i, i2, hexFormat, 4);
    }

    public static final String toHexString(int i, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(i, format, 32);
    }

    public static /* synthetic */ String toHexString$default(int i, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(i, hexFormat);
    }

    public static final int hexToInt(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt(str, 0, str.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    static /* synthetic */ int hexToInt$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToInt(str, i, i2, hexFormat);
    }

    private static final int hexToInt(String str, int i, int i2, HexFormat hexFormat) {
        return (int) hexToLongImpl(str, i, i2, hexFormat, 8);
    }

    public static final String toHexString(long j, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(j, format, 64);
    }

    public static /* synthetic */ String toHexString$default(long j, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(j, hexFormat);
    }

    public static final long hexToLong(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong(str, 0, str.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    static /* synthetic */ long hexToLong$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToLong(str, i, i2, hexFormat);
    }

    private static final long hexToLong(String str, int i, int i2, HexFormat hexFormat) {
        return hexToLongImpl(str, i, i2, hexFormat, 16);
    }

    private static final String toHexStringImpl(long j, HexFormat hexFormat, int i) {
        if (!((i & 3) == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        String prefix = hexFormat.getNumber().getPrefix();
        String suffix = hexFormat.getNumber().getSuffix();
        boolean removeLeadingZeros = hexFormat.getNumber().getRemoveLeadingZeros();
        StringBuilder sb = new StringBuilder(prefix.length() + (i >> 2) + suffix.length());
        sb.append(prefix);
        while (i > 0) {
            i -= 4;
            int i2 = (int) ((j >> i) & 15);
            removeLeadingZeros = removeLeadingZeros && i2 == 0 && i > 0;
            if (!removeLeadingZeros) {
                sb.append(str.charAt(i2));
            }
        }
        sb.append(suffix);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    static /* synthetic */ long hexToLongImpl$default(String str, int i, int i2, HexFormat hexFormat, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = str.length();
        }
        return hexToLongImpl(str, i, i2, hexFormat, i3);
    }

    private static final long hexToLongImpl(String str, int i, int i2, HexFormat hexFormat, int i3) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        String prefix = hexFormat.getNumber().getPrefix();
        String suffix = hexFormat.getNumber().getSuffix();
        if (prefix.length() + suffix.length() >= i2 - i) {
            StringBuilder sb = new StringBuilder("Expected a hexadecimal number with prefix \"");
            sb.append(prefix);
            sb.append("\" and suffix \"");
            sb.append(suffix);
            sb.append("\", but was ");
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            throw new NumberFormatException(sb.toString());
        }
        int checkContainsAt = checkContainsAt(str, prefix, i, i2, "prefix");
        int length = i2 - suffix.length();
        checkContainsAt(str, suffix, length, i2, "suffix");
        checkHexLength(str, checkContainsAt, length, i3, false);
        long j = 0;
        while (checkContainsAt < length) {
            j = (j << 4) | decimalFromHexDigitAt(str, checkContainsAt);
            checkContainsAt++;
        }
        return j;
    }

    private static final int checkContainsAt(String str, String str2, int i, int i2, String str3) {
        int length = str2.length() + i;
        if (length > i2 || !StringsKt.regionMatches(str, i, str2, 0, str2.length(), true)) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(str3);
            sb.append(" \"");
            sb.append(str2);
            sb.append("\" at index ");
            sb.append(i);
            sb.append(", but was ");
            int coerceAtMost = RangesKt.coerceAtMost(length, i2);
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(i, coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            throw new NumberFormatException(sb.toString());
        }
        return length;
    }

    private static final void checkHexLength(String str, int i, int i2, int i3, boolean z) {
        int i4 = i2 - i;
        boolean z2 = true;
        if (!z ? i4 > i3 : i4 != i3) {
            z2 = false;
        }
        if (z2) {
            return;
        }
        String str2 = z ? "exactly" : "at most";
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was " + substring + " of length " + i4);
    }

    private static final int decimalFromHexDigitAt(String str, int i) {
        int i2;
        char charAt = str.charAt(i);
        if (charAt > 127 || (i2 = HEX_DIGITS_TO_DECIMAL[charAt]) < 0) {
            throw new NumberFormatException("Expected a hexadecimal digit at index " + i + ", but was " + str.charAt(i));
        }
        return i2;
    }
}
