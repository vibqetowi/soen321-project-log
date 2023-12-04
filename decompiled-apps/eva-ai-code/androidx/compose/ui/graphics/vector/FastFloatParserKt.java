package androidx.compose.ui.graphics.vector;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: FastFloatParser.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082\b\u001a\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0082\b\u001a\u0019\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0082\b\"\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0010"}, d2 = {"isDigit", "", "", "(C)Z", "charAt", "s", "", FirebaseAnalytics.Param.INDEX, "", "fullMultiplicationHighBits", "", "x", "y", "parseFourDigits", "str", TypedValues.CycleType.S_WAVE_OFFSET, "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FastFloatParserKt {
    private static final long fullMultiplicationHighBits(long j, long j2) {
        long j3 = j & 4294967295L;
        long j4 = j >>> 32;
        long j5 = j2 & 4294967295L;
        long j6 = j2 >>> 32;
        long j7 = j4 * j6;
        long j8 = j6 * j3;
        return j7 + ((((j4 * j5) + ((j3 * j5) >>> 32)) + (4294967295L & j8)) >>> 32) + (j8 >>> 32);
    }

    private static final boolean isDigit(char c) {
        return ((char) (c + 65488)) < '\n';
    }

    private static final char charAt(CharSequence charSequence, int i) {
        if (i < charSequence.length()) {
            return charSequence.charAt(i);
        }
        return (char) 0;
    }

    private static final int parseFourDigits(CharSequence charSequence, int i) {
        long charAt = (charSequence.charAt(i + 3) << 48) | charSequence.charAt(i) | (charSequence.charAt(i + 1) << 16) | (charSequence.charAt(i + 2) << 32);
        long j = charAt - 13511005043687472L;
        if ((((charAt + 19703549022044230L) | j) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (int) ((j * 281475406208040961L) >>> 48);
    }
}
