package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer;
import okio.ByteString;
import okio._Base64Kt;
import okio._JvmPlatformKt;
import okio._UtilKt;
import org.apache.commons.lang3.StringUtils;
/* compiled from: -ByteString.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0080\b\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\r\u0010\u0011\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0080\b\u001a-\u0010\u0016\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u000f\u0010\u001c\u001a\u0004\u0018\u00010\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\tH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0080\b\u001a\u0017\u0010\"\u001a\u00020 *\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010#H\u0080\b\u001a\u0015\u0010$\u001a\u00020%*\u00020\f2\u0006\u0010&\u001a\u00020\u0007H\u0080\b\u001a\r\u0010'\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010(\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010)\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u001d\u0010*\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\r\u0010,\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\tH\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\fH\u0080\b\u001a\u001d\u00102\u001a\u00020\f*\u00020\f2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0080\b\u001a\r\u00105\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00106\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00107\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u00108\u001a\u00020\f*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010:\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a$\u0010;\u001a\u00020\u0017*\u00020\f2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006>"}, d2 = {"HEX_DIGIT_CHARS", "", "getHEX_DIGIT_CHARS$annotations", "()V", "getHEX_DIGIT_CHARS", "()[C", "codePointIndexToCharIndex", "", "s", "", "codePointCount", "commonOf", "Lokio/ByteString;", "data", "decodeHexDigit", "c", "", "commonBase64", "", "commonBase64Url", "commonCompareTo", "other", "commonCopyInto", "", TypedValues.CycleType.S_WAVE_OFFSET, TypedValues.AttributesType.S_TARGET, "targetOffset", "byteCount", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", "", "suffix", "commonEquals", "", "commonGetByte", "", "pos", "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", "otherOffset", "commonStartsWith", "prefix", "commonSubstring", "beginIndex", "endIndex", "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToByteString", "commonToString", "commonUtf8", "commonWrite", "buffer", "Lokio/Buffer;", "okio"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class _ByteStringKt {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }

    public static final String commonUtf8(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio == null) {
            String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
            byteString.setUtf8$okio(utf8String);
            return utf8String;
        }
        return utf8$okio;
    }

    public static final String commonBase64(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return _Base64Kt.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return _Base64Kt.encodeBase64(byteString.getData$okio(), _Base64Kt.getBASE64_URL_SAFE());
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final String commonHex(ByteString byteString) {
        byte[] data$okio;
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i = 0;
        for (byte b : byteString.getData$okio()) {
            int i2 = i + 1;
            cArr[i] = getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = getHEX_DIGIT_CHARS()[b & Ascii.SI];
        }
        return StringsKt.concatToString(cArr);
    }

    public static final ByteString commonToAsciiLowercase(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        for (int i = 0; i < byteString.getData$okio().length; i++) {
            byte b = byteString.getData$okio()[i];
            if (b >= 65 && b <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final ByteString commonToAsciiUppercase(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        for (int i = 0; i < byteString.getData$okio().length; i++) {
            byte b = byteString.getData$okio()[i];
            if (b >= 97 && b <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        copyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final ByteString commonSubstring(ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        int resolveDefaultParameter = _UtilKt.resolveDefaultParameter(byteString, i2);
        if (!(i >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (resolveDefaultParameter <= byteString.getData$okio().length) {
            if (resolveDefaultParameter - i >= 0) {
                return (i == 0 && resolveDefaultParameter == byteString.getData$okio().length) ? byteString : new ByteString(ArraysKt.copyOfRange(byteString.getData$okio(), i, resolveDefaultParameter));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
    }

    public static final byte commonGetByte(ByteString byteString, int i) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio()[i];
    }

    public static final int commonGetSize(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final byte[] commonToByteArray(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static final byte[] commonInternalArray(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i, ByteString other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return other.rangeEquals(i2, byteString.getData$okio(), i, i3);
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i, byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return i >= 0 && i <= byteString.getData$okio().length - i3 && i2 >= 0 && i2 <= other.length - i3 && _UtilKt.arrayRangeEquals(byteString.getData$okio(), i, other, i2, i3);
    }

    public static final void commonCopyInto(ByteString byteString, int i, byte[] target, int i2, int i3) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        ArraysKt.copyInto(byteString.getData$okio(), target, i2, i, i3 + i);
    }

    public static final boolean commonStartsWith(ByteString byteString, ByteString prefix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final boolean commonStartsWith(ByteString byteString, byte[] prefix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }

    public static final boolean commonEndsWith(ByteString byteString, ByteString suffix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEndsWith(ByteString byteString, byte[] suffix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonIndexOf(ByteString byteString, byte[] other, int i) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = byteString.getData$okio().length - other.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!_UtilKt.arrayRangeEquals(byteString.getData$okio(), max, other, 0, other.length)) {
                if (max == length) {
                    return -1;
                }
                max++;
            }
            return max;
        }
        return -1;
    }

    public static final int commonLastIndexOf(ByteString byteString, ByteString other, int i) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i);
    }

    public static final int commonLastIndexOf(ByteString byteString, byte[] other, int i) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        for (int min = Math.min(_UtilKt.resolveDefaultParameter(byteString, i), byteString.getData$okio().length - other.length); -1 < min; min--) {
            if (_UtilKt.arrayRangeEquals(byteString.getData$okio(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public static final boolean commonEquals(ByteString byteString, Object obj) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString2 = (ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final int commonHashCode(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(hashCode);
        return hashCode;
    }

    public static final int commonCompareTo(ByteString byteString, ByteString other) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int min = Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            int i2 = byteString.getByte(i) & 255;
            int i3 = other.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final ByteString commonOf(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return new ByteString(copyOf);
    }

    public static final ByteString commonToByteString(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int resolveDefaultParameter = _UtilKt.resolveDefaultParameter(bArr, i2);
        _UtilKt.checkOffsetAndCount(bArr.length, i, resolveDefaultParameter);
        return new ByteString(ArraysKt.copyOfRange(bArr, i, resolveDefaultParameter + i));
    }

    public static final ByteString commonEncodeUtf8(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final ByteString commonDecodeBase64(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] decodeBase64ToArray = _Base64Kt.decodeBase64ToArray(str);
        if (decodeBase64ToArray != null) {
            return new ByteString(decodeBase64ToArray);
        }
        return null;
    }

    public static final ByteString commonDecodeHex(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(str.length() % 2 == 0)) {
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((decodeHexDigit(str.charAt(i2)) << 4) + decodeHexDigit(str.charAt(i2 + 1)));
        }
        return new ByteString(bArr);
    }

    public static final void commonWrite(ByteString byteString, Buffer buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i, i2);
    }

    public static final int decodeHexDigit(char c) {
        boolean z = true;
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    public static final String commonToString(ByteString byteString) {
        ByteString byteString2 = byteString;
        Intrinsics.checkNotNullParameter(byteString2, "<this>");
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int codePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (codePointIndexToCharIndex == -1) {
            if (byteString.getData$okio().length <= 64) {
                return "[hex=" + byteString.hex() + AbstractJsonLexerKt.END_LIST;
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(byteString.getData$okio().length);
            sb.append(" hex=");
            int resolveDefaultParameter = _UtilKt.resolveDefaultParameter(byteString2, 64);
            if (!(resolveDefaultParameter <= byteString.getData$okio().length)) {
                throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
            }
            if (!(resolveDefaultParameter + 0 >= 0)) {
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            if (resolveDefaultParameter != byteString.getData$okio().length) {
                byteString2 = new ByteString(ArraysKt.copyOfRange(byteString.getData$okio(), 0, resolveDefaultParameter));
            }
            sb.append(byteString2.hex());
            sb.append("…]");
            return sb.toString();
        }
        String utf8 = byteString.utf8();
        String substring = utf8.substring(0, codePointIndexToCharIndex);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), StringUtils.CR, "\\r", false, 4, (Object) null);
        if (codePointIndexToCharIndex < utf8.length()) {
            return "[size=" + byteString.getData$okio().length + " text=" + replace$default + "…]";
        }
        return "[text=" + replace$default + AbstractJsonLexerKt.END_LIST;
    }

    /* JADX WARN: Removed duplicated region for block: B:553:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0081 A[EDGE_INSN: B:556:0x0081->B:350:0x0081 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x00da A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int codePointIndexToCharIndex(byte[] bArr, int i) {
        byte b;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (i3 < length) {
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                int i6 = i5 + 1;
                if (i5 == i) {
                    return i4;
                }
                if (b2 != 10 && b2 != 13) {
                    if (!(b2 >= 0 && b2 < 32)) {
                        if (!(Byte.MAX_VALUE <= b2 && b2 < 160)) {
                            z2 = false;
                            if (z2) {
                                return -1;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
                if (b2 == 65533) {
                    return -1;
                }
                i4 += b2 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i5 = i6;
                    if (i3 < length && (b = bArr[i3]) >= 0) {
                        i3++;
                        i6 = i5 + 1;
                        if (i5 == i) {
                            return i4;
                        }
                        if (b != 10 && b != 13) {
                            if (!(b >= 0 && b < 32)) {
                                if (!(Byte.MAX_VALUE <= b && b < 160)) {
                                    z = false;
                                    if (z) {
                                        break loop0;
                                    }
                                }
                            }
                            z = true;
                            if (z) {
                            }
                        }
                        if (b == 65533) {
                            break loop0;
                        }
                        i4 += b < 65536 ? 1 : 2;
                    }
                }
                return -1;
            }
            if ((b2 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length <= i7) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b3 = bArr[i7];
                if (!((b3 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                int i8 = (b3 ^ 3968) ^ (b2 << 6);
                if (i8 < 128) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                i2 = i5 + 1;
                if (i5 == i) {
                    return i4;
                }
                if (i8 != 10 && i8 != 13) {
                    if (!(i8 >= 0 && i8 < 32)) {
                        if (!(127 <= i8 && i8 < 160)) {
                            z5 = false;
                            if (z5) {
                                return -1;
                            }
                        }
                    }
                    z5 = true;
                    if (z5) {
                    }
                }
                if (i8 == 65533) {
                    return -1;
                }
                i4 += i8 < 65536 ? 1 : 2;
                Unit unit = Unit.INSTANCE;
                i3 += 2;
            } else if ((b2 >> 4) == -2) {
                int i9 = i3 + 2;
                if (length <= i9) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b4 = bArr[i3 + 1];
                if (!((b4 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b5 = bArr[i9];
                if (!((b5 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                int i10 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << Ascii.FF);
                if (i10 < 2048) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                if (55296 <= i10 && i10 < 57344) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                i2 = i5 + 1;
                if (i5 == i) {
                    return i4;
                }
                if (i10 != 10 && i10 != 13) {
                    if (!(i10 >= 0 && i10 < 32)) {
                        if (!(127 <= i10 && i10 < 160)) {
                            z4 = false;
                            if (z4) {
                                return -1;
                            }
                        }
                    }
                    z4 = true;
                    if (z4) {
                    }
                }
                if (i10 == 65533) {
                    return -1;
                }
                i4 += i10 < 65536 ? 1 : 2;
                Unit unit2 = Unit.INSTANCE;
                i3 += 3;
            } else if ((b2 >> 3) != -2) {
                if (i5 == i) {
                    return i4;
                }
                return -1;
            } else {
                int i11 = i3 + 3;
                if (length <= i11) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b6 = bArr[i3 + 1];
                if (!((b6 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b7 = bArr[i3 + 2];
                if (!((b7 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b8 = bArr[i11];
                if (!((b8 & 192) == 128)) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                int i12 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << Ascii.FF)) ^ (b2 << Ascii.DC2);
                if (i12 > 1114111) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                if (55296 <= i12 && i12 < 57344) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                } else if (i12 < 65536) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                } else {
                    i2 = i5 + 1;
                    if (i5 == i) {
                        return i4;
                    }
                    if (i12 != 10 && i12 != 13) {
                        if (!(i12 >= 0 && i12 < 32)) {
                            if (!(127 <= i12 && i12 < 160)) {
                                z3 = false;
                                if (z3) {
                                    return -1;
                                }
                            }
                        }
                        z3 = true;
                        if (z3) {
                        }
                    }
                    if (i12 == 65533) {
                        return -1;
                    }
                    i4 += i12 < 65536 ? 1 : 2;
                    Unit unit3 = Unit.INSTANCE;
                    i3 += 4;
                }
            }
            i5 = i2;
        }
        return i4;
    }
}
