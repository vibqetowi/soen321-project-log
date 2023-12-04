package androidx.compose.ui.graphics;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import org.apache.commons.codec.language.Soundex;
/* compiled from: Float16.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0081@\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001RB\u0014\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u0014\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0007B\u0012\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\nJ\u0016\u0010\u0015\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\nJ\u001e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b.\u0010(J\u0016\u0010/\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\nJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bB\u0010\u000eJ\r\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bJ\u0010\nJ\u000f\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010@J\u0016\u0010M\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010\nJ\u001b\u0010O\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010QR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0088\u0001\bø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes3.dex */
public final class Float16 implements Comparable<Float16> {
    private static final int FP16_COMBINED = 32767;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_EXPONENT_MASK = 31;
    private static final int FP16_EXPONENT_MAX = 31744;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_SIGNIFICAND_MASK = 1023;
    private static final int FP16_SIGN_MASK = 32768;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final float FP32_DENORMAL_FLOAT;
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_EXPONENT_MASK = 255;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_SIGN_SHIFT = 31;
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m3395constructorimpl((short) 5120);
    private static final short LowestValue = m3395constructorimpl((short) -1025);
    private static final short MaxValue = m3395constructorimpl((short) 31743);
    private static final short MinNormal = m3395constructorimpl((short) SilenceSkippingAudioProcessor.DEFAULT_SILENCE_THRESHOLD_LEVEL);
    private static final short MinValue = m3395constructorimpl((short) 1);
    private static final short NaN = m3395constructorimpl((short) 32256);
    private static final short NegativeInfinity = m3395constructorimpl((short) -1024);
    private static final short NegativeZero = m3395constructorimpl((short) ShortCompanionObject.MIN_VALUE);
    private static final short PositiveInfinity = m3395constructorimpl((short) 31744);
    private static final short PositiveZero = m3395constructorimpl((short) 0);
    private static final short One = m3394constructorimpl(1.0f);
    private static final short NegativeOne = m3394constructorimpl(-1.0f);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Float16 m3390boximpl(short s) {
        return new Float16(s);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m3395constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m3396equalsimpl(short s, Object obj) {
        return (obj instanceof Float16) && s == ((Float16) obj).m3421unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m3397equalsimpl0(short s, short s2) {
        return s == s2;
    }

    /* renamed from: getExponent-impl  reason: not valid java name */
    public static final int m3399getExponentimpl(short s) {
        return ((s >>> 10) & 31) - 15;
    }

    /* renamed from: getSignificand-impl  reason: not valid java name */
    public static final int m3401getSignificandimpl(short s) {
        return s & 1023;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m3402hashCodeimpl(short s) {
        return s;
    }

    /* renamed from: isFinite-impl  reason: not valid java name */
    public static final boolean m3403isFiniteimpl(short s) {
        return (s & ShortCompanionObject.MAX_VALUE) != FP16_EXPONENT_MAX;
    }

    /* renamed from: isInfinite-impl  reason: not valid java name */
    public static final boolean m3404isInfiniteimpl(short s) {
        return (s & ShortCompanionObject.MAX_VALUE) == FP16_EXPONENT_MAX;
    }

    /* renamed from: isNaN-impl  reason: not valid java name */
    public static final boolean m3405isNaNimpl(short s) {
        return (s & ShortCompanionObject.MAX_VALUE) > FP16_EXPONENT_MAX;
    }

    /* renamed from: isNormalized-impl  reason: not valid java name */
    public static final boolean m3406isNormalizedimpl(short s) {
        int i = s & FP16_EXPONENT_MAX;
        return (i == 0 || i == FP16_EXPONENT_MAX) ? false : true;
    }

    /* renamed from: toRawBits-impl  reason: not valid java name */
    public static final int m3415toRawBitsimpl(short s) {
        return s & UShort.MAX_VALUE;
    }

    public boolean equals(Object obj) {
        return m3396equalsimpl(this.halfValue, obj);
    }

    public int hashCode() {
        return m3402hashCodeimpl(this.halfValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short m3421unboximpl() {
        return this.halfValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m3420compareTo41bOqos(float16.m3421unboximpl());
    }

    private /* synthetic */ Float16(short s) {
        this.halfValue = s;
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m3394constructorimpl(float f) {
        return m3395constructorimpl(Companion.floatToHalf(f));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m3393constructorimpl(double d) {
        return m3394constructorimpl((float) d);
    }

    /* renamed from: toByte-impl  reason: not valid java name */
    public static final byte m3409toByteimpl(short s) {
        return (byte) m3411toFloatimpl(s);
    }

    /* renamed from: toShort-impl  reason: not valid java name */
    public static final short m3416toShortimpl(short s) {
        return (short) m3411toFloatimpl(s);
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    public static final int m3413toIntimpl(short s) {
        return (int) m3411toFloatimpl(s);
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    public static final long m3414toLongimpl(short s) {
        return m3411toFloatimpl(s);
    }

    /* renamed from: toFloat-impl  reason: not valid java name */
    public static final float m3411toFloatimpl(short s) {
        int i;
        int i2;
        int i3;
        int i4 = s & UShort.MAX_VALUE;
        int i5 = 32768 & i4;
        int i6 = (i4 >>> 10) & 31;
        int i7 = i4 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i = (i6 - 15) + 127;
            }
            int i9 = i;
            i2 = i8;
            i3 = i9;
        } else if (i7 != 0) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            float intBitsToFloat = Float.intBitsToFloat(i7 + FP32_DENORMAL_MAGIC) - FP32_DENORMAL_FLOAT;
            return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i10 = i3 << 23;
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(i10 | (i5 << 16) | i2);
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    public static final double m3410toDoubleimpl(short s) {
        return m3411toFloatimpl(s);
    }

    /* renamed from: toBits-impl  reason: not valid java name */
    public static final int m3408toBitsimpl(short s) {
        return m3405isNaNimpl(s) ? NaN : s & UShort.MAX_VALUE;
    }

    public String toString() {
        return m3417toStringimpl(this.halfValue);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m3417toStringimpl(short s) {
        return String.valueOf(m3411toFloatimpl(s));
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public int m3420compareTo41bOqos(short s) {
        return m3392compareTo41bOqos(this.halfValue, s);
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public static int m3392compareTo41bOqos(short s, short s2) {
        if (m3405isNaNimpl(s)) {
            return !m3405isNaNimpl(s2) ? 1 : 0;
        }
        if (m3405isNaNimpl(s2)) {
            return -1;
        }
        Companion companion = Companion;
        return Intrinsics.compare(companion.toCompareValue(s), companion.toCompareValue(s2));
    }

    /* renamed from: getSign-slo4al4  reason: not valid java name */
    public static final short m3400getSignslo4al4(short s) {
        if (m3405isNaNimpl(s)) {
            return NaN;
        }
        return m3392compareTo41bOqos(s, NegativeZero) < 0 ? NegativeOne : m3392compareTo41bOqos(s, PositiveZero) > 0 ? One : s;
    }

    /* renamed from: withSign-qCeQghg  reason: not valid java name */
    public static final short m3419withSignqCeQghg(short s, short s2) {
        return m3395constructorimpl((short) ((s & ShortCompanionObject.MAX_VALUE) | (s2 & ShortCompanionObject.MIN_VALUE)));
    }

    /* renamed from: absoluteValue-slo4al4  reason: not valid java name */
    public static final short m3389absoluteValueslo4al4(short s) {
        return m3395constructorimpl((short) (s & ShortCompanionObject.MAX_VALUE));
    }

    /* renamed from: round-slo4al4  reason: not valid java name */
    public static final short m3407roundslo4al4(short s) {
        int i = s & UShort.MAX_VALUE;
        int i2 = i & FP16_COMBINED;
        if (i2 < 15360) {
            i = (i & 32768) | ((i2 < 14336 ? 0 : 65535) & 15360);
        } else if (i2 < 25600) {
            int i3 = 25 - (i2 >> 10);
            i = (i + (1 << (i3 - 1))) & (~((1 << i3) - 1));
        }
        return m3395constructorimpl((short) i);
    }

    /* renamed from: ceil-slo4al4  reason: not valid java name */
    public static final short m3391ceilslo4al4(short s) {
        int i = s & UShort.MAX_VALUE;
        int i2 = i & FP16_COMBINED;
        if (i2 < 15360) {
            i = ((-((~(i >> 15)) & (i2 == 0 ? 0 : 1))) & 15360) | (32768 & i);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + (i3 & ((i >> 15) - 1))) & (~i3);
        }
        return m3395constructorimpl((short) i);
    }

    /* renamed from: floor-slo4al4  reason: not valid java name */
    public static final short m3398floorslo4al4(short s) {
        int i = s & UShort.MAX_VALUE;
        int i2 = i & FP16_COMBINED;
        if (i2 < 15360) {
            i = ((i <= 32768 ? 0 : 65535) & 15360) | (i & 32768);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + ((-(i >> 15)) & i3)) & (~i3);
        }
        return m3395constructorimpl((short) i);
    }

    /* renamed from: trunc-slo4al4  reason: not valid java name */
    public static final short m3418truncslo4al4(short s) {
        int i;
        int i2 = s & UShort.MAX_VALUE;
        int i3 = i2 & FP16_COMBINED;
        if (i3 >= 15360) {
            if (i3 < 25600) {
                i = ~((1 << (25 - (i3 >> 10))) - 1);
            }
            return m3395constructorimpl((short) i2);
        }
        i = 32768;
        i2 &= i;
        return m3395constructorimpl((short) i2);
    }

    /* renamed from: toHexString-impl  reason: not valid java name */
    public static final String m3412toHexStringimpl(short s) {
        StringBuilder sb = new StringBuilder();
        int i = s & UShort.MAX_VALUE;
        int i2 = i >>> 15;
        int i3 = (i >>> 10) & 31;
        int i4 = i & 1023;
        if (i3 != 31) {
            if (i2 == 1) {
                sb.append(Soundex.SILENT_MARKER);
            }
            if (i3 != 0) {
                sb.append("0x1.");
                String num = Integer.toString(i4, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(num, ""));
                sb.append('p');
                sb.append(String.valueOf(i3 - 15));
            } else if (i4 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                String num2 = Integer.toString(i4, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num2, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(num2, ""));
                sb.append("p-14");
            }
        } else if (i4 == 0) {
            if (i2 != 0) {
                sb.append(Soundex.SILENT_MARKER);
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "o.toString()");
        return sb2;
    }

    /* compiled from: Float16.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0012H\u0002J\u0010\u00104\u001a\u00020\t2\u0006\u00105\u001a\u000202H\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u000e\u0010\u001c\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001e\u0010\u0006R\u000e\u0010\u001f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u001c\u0010\"\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u001c\u0010$\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u001c\u0010&\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u0019\u0010(\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010)\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b*\u0010\u0006R\u0019\u0010+\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010,\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u001c\u0010.\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u000e\u00100\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", ExifInterface.LATITUDE_SOUTH, "FP16_COMBINED", "", "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeOne", "NegativeZero", "getNegativeZero-slo4al4", "One", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "floatToHalf", "", "f", "toCompareValue", "value", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int toCompareValue(short s) {
            return (s & ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - (s & UShort.MAX_VALUE) : s & UShort.MAX_VALUE;
        }

        private Companion() {
        }

        /* renamed from: getEpsilon-slo4al4  reason: not valid java name */
        public final short m3422getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4  reason: not valid java name */
        public final short m3423getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4  reason: not valid java name */
        public final short m3424getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4  reason: not valid java name */
        public final short m3425getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4  reason: not valid java name */
        public final short m3426getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4  reason: not valid java name */
        public final short m3427getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4  reason: not valid java name */
        public final short m3428getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4  reason: not valid java name */
        public final short m3429getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4  reason: not valid java name */
        public final short m3430getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4  reason: not valid java name */
        public final short m3431getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short floatToHalf(float f) {
            int i;
            int i2;
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            int i3 = floatToRawIntBits >>> 31;
            int i4 = (floatToRawIntBits >>> 23) & 255;
            int i5 = floatToRawIntBits & Float16.FP32_SIGNIFICAND_MASK;
            int i6 = 31;
            int i7 = 0;
            if (i4 == 255) {
                if (i5 != 0) {
                    i2 = 512;
                    i7 = i2;
                }
                i = (i3 << 15) | (i6 << 10) | i7;
            } else {
                int i8 = (i4 - 127) + 15;
                if (i8 >= 31) {
                    i6 = 49;
                } else if (i8 > 0) {
                    i7 = i5 >> 13;
                    if ((i5 & 4096) != 0) {
                        i = (((i8 << 10) | i7) + 1) | (i3 << 15);
                    } else {
                        i6 = i8;
                    }
                } else if (i8 >= -10) {
                    int i9 = (i5 | 8388608) >> (1 - i8);
                    if ((i9 & 4096) != 0) {
                        i9 += 8192;
                    }
                    i2 = i9 >> 13;
                    i6 = 0;
                    i7 = i2;
                } else {
                    i6 = 0;
                }
                i = (i3 << 15) | (i6 << 10) | i7;
            }
            return (short) i;
        }
    }

    static {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        FP32_DENORMAL_FLOAT = Float.intBitsToFloat(FP32_DENORMAL_MAGIC);
    }
}
