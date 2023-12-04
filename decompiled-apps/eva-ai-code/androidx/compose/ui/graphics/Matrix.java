package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: Matrix.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 G2\u00020\u0001:\u0001GB\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020 2\u0006\u0010!\u001a\u00020 ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u001b\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$¢\u0006\u0004\b\u001e\u0010%J\r\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010\u001aJ\u0015\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b-\u0010+J\u0015\u0010.\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b/\u0010+J+\u00100\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J(\u00106\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001e\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010=J\u000f\u0010A\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ+\u0010E\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\bF\u00105R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "", "row", "", "column", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "invert", "", "invert-impl", "([F)V", "map", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "map-impl", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "Landroidx/compose/ui/geometry/Rect;", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "reset", "reset-impl", "rotateX", "degrees", "rotateX-impl", "([FF)V", "rotateY", "rotateY-impl", "rotateZ", "rotateZ-impl", "scale", "x", "y", "z", "scale-impl", "([FFFF)V", "set", "v", "set-impl", "([FIIF)V", "setFrom", "matrix", "setFrom-58bKbWc", "([F[F)V", "timesAssign", "m", "timesAssign-58bKbWc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "translate", "translate-impl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes3.dex */
public final class Matrix {
    public static final Companion Companion = new Companion(null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    /* renamed from: box-impl */
    public static final /* synthetic */ Matrix m3520boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl */
    public static float[] m3521constructorimpl(float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* renamed from: equals-impl */
    public static boolean m3523equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).m3543unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m3524equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* renamed from: hashCode-impl */
    public static int m3526hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public boolean equals(Object obj) {
        return m3523equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m3526hashCodeimpl(this.values);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ float[] m3543unboximpl() {
        return this.values;
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    public final float[] getValues() {
        return this.values;
    }

    /* renamed from: constructor-impl$default */
    public static /* synthetic */ float[] m3522constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m3521constructorimpl(fArr);
    }

    /* renamed from: get-impl */
    public static final float m3525getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 4) + i2];
    }

    /* renamed from: set-impl */
    public static final void m3537setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 4) + i2] = f;
    }

    /* renamed from: map-MK-Hz9U */
    public static final long m3528mapMKHz9U(float[] fArr, long j) {
        float m3018getXimpl = Offset.m3018getXimpl(j);
        float m3019getYimpl = Offset.m3019getYimpl(j);
        float f = 1 / (((fArr[3] * m3018getXimpl) + (fArr[7] * m3019getYimpl)) + fArr[15]);
        if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
            f = 0.0f;
        }
        return OffsetKt.Offset(((fArr[0] * m3018getXimpl) + (fArr[4] * m3019getYimpl) + fArr[12]) * f, f * ((fArr[1] * m3018getXimpl) + (fArr[5] * m3019getYimpl) + fArr[13]));
    }

    /* renamed from: map-impl */
    public static final Rect m3529mapimpl(float[] fArr, Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long m3528mapMKHz9U = m3528mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long m3528mapMKHz9U2 = m3528mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long m3528mapMKHz9U3 = m3528mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long m3528mapMKHz9U4 = m3528mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m3018getXimpl(m3528mapMKHz9U), Offset.m3018getXimpl(m3528mapMKHz9U2)), Math.min(Offset.m3018getXimpl(m3528mapMKHz9U3), Offset.m3018getXimpl(m3528mapMKHz9U4))), Math.min(Math.min(Offset.m3019getYimpl(m3528mapMKHz9U), Offset.m3019getYimpl(m3528mapMKHz9U2)), Math.min(Offset.m3019getYimpl(m3528mapMKHz9U3), Offset.m3019getYimpl(m3528mapMKHz9U4))), Math.max(Math.max(Offset.m3018getXimpl(m3528mapMKHz9U), Offset.m3018getXimpl(m3528mapMKHz9U2)), Math.max(Offset.m3018getXimpl(m3528mapMKHz9U3), Offset.m3018getXimpl(m3528mapMKHz9U4))), Math.max(Math.max(Offset.m3019getYimpl(m3528mapMKHz9U), Offset.m3019getYimpl(m3528mapMKHz9U2)), Math.max(Offset.m3019getYimpl(m3528mapMKHz9U3), Offset.m3019getYimpl(m3528mapMKHz9U4))));
    }

    /* renamed from: map-impl */
    public static final void m3530mapimpl(float[] fArr, MutableRect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long m3528mapMKHz9U = m3528mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long m3528mapMKHz9U2 = m3528mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long m3528mapMKHz9U3 = m3528mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long m3528mapMKHz9U4 = m3528mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        rect.setLeft(Math.min(Math.min(Offset.m3018getXimpl(m3528mapMKHz9U), Offset.m3018getXimpl(m3528mapMKHz9U2)), Math.min(Offset.m3018getXimpl(m3528mapMKHz9U3), Offset.m3018getXimpl(m3528mapMKHz9U4))));
        rect.setTop(Math.min(Math.min(Offset.m3019getYimpl(m3528mapMKHz9U), Offset.m3019getYimpl(m3528mapMKHz9U2)), Math.min(Offset.m3019getYimpl(m3528mapMKHz9U3), Offset.m3019getYimpl(m3528mapMKHz9U4))));
        rect.setRight(Math.max(Math.max(Offset.m3018getXimpl(m3528mapMKHz9U), Offset.m3018getXimpl(m3528mapMKHz9U2)), Math.max(Offset.m3018getXimpl(m3528mapMKHz9U3), Offset.m3018getXimpl(m3528mapMKHz9U4))));
        rect.setBottom(Math.max(Math.max(Offset.m3019getYimpl(m3528mapMKHz9U), Offset.m3019getYimpl(m3528mapMKHz9U2)), Math.max(Offset.m3019getYimpl(m3528mapMKHz9U3), Offset.m3019getYimpl(m3528mapMKHz9U4))));
    }

    /* renamed from: timesAssign-58bKbWc */
    public static final void m3539timesAssign58bKbWc(float[] fArr, float[] m) {
        float m3545dotp89u6pk;
        float m3545dotp89u6pk2;
        float m3545dotp89u6pk3;
        float m3545dotp89u6pk4;
        float m3545dotp89u6pk5;
        float m3545dotp89u6pk6;
        float m3545dotp89u6pk7;
        float m3545dotp89u6pk8;
        float m3545dotp89u6pk9;
        float m3545dotp89u6pk10;
        float m3545dotp89u6pk11;
        float m3545dotp89u6pk12;
        float m3545dotp89u6pk13;
        float m3545dotp89u6pk14;
        float m3545dotp89u6pk15;
        float m3545dotp89u6pk16;
        Intrinsics.checkNotNullParameter(m, "m");
        m3545dotp89u6pk = MatrixKt.m3545dotp89u6pk(fArr, 0, m, 0);
        m3545dotp89u6pk2 = MatrixKt.m3545dotp89u6pk(fArr, 0, m, 1);
        m3545dotp89u6pk3 = MatrixKt.m3545dotp89u6pk(fArr, 0, m, 2);
        m3545dotp89u6pk4 = MatrixKt.m3545dotp89u6pk(fArr, 0, m, 3);
        m3545dotp89u6pk5 = MatrixKt.m3545dotp89u6pk(fArr, 1, m, 0);
        m3545dotp89u6pk6 = MatrixKt.m3545dotp89u6pk(fArr, 1, m, 1);
        m3545dotp89u6pk7 = MatrixKt.m3545dotp89u6pk(fArr, 1, m, 2);
        m3545dotp89u6pk8 = MatrixKt.m3545dotp89u6pk(fArr, 1, m, 3);
        m3545dotp89u6pk9 = MatrixKt.m3545dotp89u6pk(fArr, 2, m, 0);
        m3545dotp89u6pk10 = MatrixKt.m3545dotp89u6pk(fArr, 2, m, 1);
        m3545dotp89u6pk11 = MatrixKt.m3545dotp89u6pk(fArr, 2, m, 2);
        m3545dotp89u6pk12 = MatrixKt.m3545dotp89u6pk(fArr, 2, m, 3);
        m3545dotp89u6pk13 = MatrixKt.m3545dotp89u6pk(fArr, 3, m, 0);
        m3545dotp89u6pk14 = MatrixKt.m3545dotp89u6pk(fArr, 3, m, 1);
        m3545dotp89u6pk15 = MatrixKt.m3545dotp89u6pk(fArr, 3, m, 2);
        m3545dotp89u6pk16 = MatrixKt.m3545dotp89u6pk(fArr, 3, m, 3);
        fArr[0] = m3545dotp89u6pk;
        fArr[1] = m3545dotp89u6pk2;
        fArr[2] = m3545dotp89u6pk3;
        fArr[3] = m3545dotp89u6pk4;
        fArr[4] = m3545dotp89u6pk5;
        fArr[5] = m3545dotp89u6pk6;
        fArr[6] = m3545dotp89u6pk7;
        fArr[7] = m3545dotp89u6pk8;
        fArr[8] = m3545dotp89u6pk9;
        fArr[9] = m3545dotp89u6pk10;
        fArr[10] = m3545dotp89u6pk11;
        fArr[11] = m3545dotp89u6pk12;
        fArr[12] = m3545dotp89u6pk13;
        fArr[13] = m3545dotp89u6pk14;
        fArr[14] = m3545dotp89u6pk15;
        fArr[15] = m3545dotp89u6pk16;
    }

    public String toString() {
        return m3540toStringimpl(this.values);
    }

    /* renamed from: toString-impl */
    public static String m3540toStringimpl(float[] fArr) {
        return StringsKt.trimIndent("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: setFrom-58bKbWc */
    public static final void m3538setFrom58bKbWc(float[] fArr, float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        for (int i = 0; i < 16; i++) {
            fArr[i] = matrix[i];
        }
    }

    /* renamed from: rotateX-impl */
    public static final void m3532rotateXimpl(float[] fArr, float f) {
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[9];
        float f7 = fArr[10];
        float f8 = fArr[13];
        float f9 = fArr[14];
        fArr[1] = (f2 * cos) - (f3 * sin);
        fArr[2] = (f2 * sin) + (f3 * cos);
        fArr[5] = (f4 * cos) - (f5 * sin);
        fArr[6] = (f4 * sin) + (f5 * cos);
        fArr[9] = (f6 * cos) - (f7 * sin);
        fArr[10] = (f6 * sin) + (f7 * cos);
        fArr[13] = (f8 * cos) - (f9 * sin);
        fArr[14] = (f8 * sin) + (f9 * cos);
    }

    /* renamed from: rotateY-impl */
    public static final void m3533rotateYimpl(float[] fArr, float f) {
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[2];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[8];
        float f7 = fArr[10];
        float f8 = fArr[12];
        float f9 = fArr[14];
        fArr[0] = (f2 * cos) + (f3 * sin);
        fArr[2] = ((-f2) * sin) + (f3 * cos);
        fArr[4] = (f4 * cos) + (f5 * sin);
        fArr[6] = ((-f4) * sin) + (f5 * cos);
        fArr[8] = (f6 * cos) + (f7 * sin);
        fArr[10] = ((-f6) * sin) + (f7 * cos);
        fArr[12] = (f8 * cos) + (f9 * sin);
        fArr[14] = ((-f8) * sin) + (f9 * cos);
    }

    /* renamed from: rotateZ-impl */
    public static final void m3534rotateZimpl(float[] fArr, float f) {
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = -sin;
        float f5 = fArr[1];
        float f6 = fArr[5];
        float f7 = fArr[2];
        float f8 = fArr[6];
        float f9 = fArr[3];
        float f10 = fArr[7];
        fArr[0] = (cos * f2) + (sin * f3);
        fArr[1] = (cos * f5) + (sin * f6);
        fArr[2] = (cos * f7) + (sin * f8);
        fArr[3] = (cos * f9) + (sin * f10);
        fArr[4] = (f2 * f4) + (f3 * cos);
        fArr[5] = (f5 * f4) + (f6 * cos);
        fArr[6] = (f7 * f4) + (f8 * cos);
        fArr[7] = (f4 * f9) + (cos * f10);
    }

    /* renamed from: scale-impl$default */
    public static /* synthetic */ void m3536scaleimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        m3535scaleimpl(fArr, f, f2, f3);
    }

    /* renamed from: translate-impl$default */
    public static /* synthetic */ void m3542translateimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m3541translateimpl(fArr, f, f2, f3);
    }

    /* compiled from: Matrix.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/Matrix$Companion;", "", "()V", "Perspective0", "", "Perspective1", "Perspective2", "ScaleX", "ScaleY", "ScaleZ", "SkewX", "SkewY", "TranslateX", "TranslateY", "TranslateZ", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: invert-impl */
    public static final void m3527invertimpl(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f17 * f28) - (f18 * f27)) + (f19 * f26)) + (f20 * f25)) - (f21 * f24)) + (f22 * f23);
        if (f29 == 0.0f) {
            return;
        }
        float f30 = 1.0f / f29;
        fArr[0] = (((f6 * f28) - (f7 * f27)) + (f8 * f26)) * f30;
        fArr[1] = ((((-f2) * f28) + (f3 * f27)) - (f4 * f26)) * f30;
        fArr[2] = (((f14 * f22) - (f15 * f21)) + (f16 * f20)) * f30;
        fArr[3] = ((((-f10) * f22) + (f11 * f21)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr[4] = (((f31 * f28) + (f7 * f25)) - (f8 * f24)) * f30;
        fArr[5] = (((f28 * f) - (f3 * f25)) + (f4 * f24)) * f30;
        float f32 = -f13;
        fArr[6] = (((f32 * f22) + (f15 * f19)) - (f16 * f18)) * f30;
        fArr[7] = (((f22 * f9) - (f11 * f19)) + (f12 * f18)) * f30;
        fArr[8] = (((f5 * f27) - (f6 * f25)) + (f8 * f23)) * f30;
        fArr[9] = ((((-f) * f27) + (f25 * f2)) - (f4 * f23)) * f30;
        fArr[10] = (((f13 * f21) - (f14 * f19)) + (f16 * f17)) * f30;
        fArr[11] = ((((-f9) * f21) + (f19 * f10)) - (f12 * f17)) * f30;
        fArr[12] = (((f31 * f26) + (f6 * f24)) - (f7 * f23)) * f30;
        fArr[13] = (((f * f26) - (f2 * f24)) + (f3 * f23)) * f30;
        fArr[14] = (((f32 * f20) + (f14 * f18)) - (f15 * f17)) * f30;
        fArr[15] = (((f9 * f20) - (f10 * f18)) + (f11 * f17)) * f30;
    }

    /* renamed from: reset-impl */
    public static final void m3531resetimpl(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    /* renamed from: scale-impl */
    public static final void m3535scaleimpl(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* renamed from: translate-impl */
    public static final void m3541translateimpl(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
    }
}
