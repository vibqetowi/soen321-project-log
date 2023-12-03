package j0;

import android.graphics.Path;
import android.util.Log;
import com.appsflyer.R;
import java.util.ArrayList;
/* compiled from: PathParser.java */
/* loaded from: classes.dex */
public final class g {
    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            a aVar = aVarArr[i6];
            char c10 = aVar.f21628a;
            a aVar2 = aVarArr2[i6];
            if (c10 != aVar2.f21628a || aVar.f21629b.length != aVar2.f21629b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i6) {
        if (i6 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i10 = i6 - 0;
                int min = Math.min(i10, length - 0);
                float[] fArr2 = new float[i10];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r13 == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[Catch: NumberFormatException -> 0x00b9, LOOP:3: B:29:0x006d->B:49:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a[] c(String str) {
        String trim;
        float[] fArr;
        int i6;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i11 < str.length()) {
            while (i11 < str.length()) {
                char charAt = str.charAt(i11);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i11++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i12, i11).trim();
                    if (trim.length() > 0) {
                        if (trim.charAt(i10) != 'z' && trim.charAt(i10) != 'Z') {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i13 = 0;
                                for (int i14 = 1; i14 < length; i14 = i6) {
                                    boolean z10 = false;
                                    boolean z11 = false;
                                    boolean z12 = false;
                                    boolean z13 = false;
                                    i6 = i14;
                                    while (i6 < trim.length()) {
                                        char charAt2 = trim.charAt(i6);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                        if (i6 != i14) {
                                                        }
                                                        break;
                                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                        if (!z12) {
                                                            z12 = true;
                                                            break;
                                                        }
                                                        z11 = true;
                                                        break;
                                                }
                                                z13 = false;
                                                if (!z10) {
                                                }
                                            } else {
                                                z13 = true;
                                                if (!z10) {
                                                    i6++;
                                                } else {
                                                    if (i14 < i6) {
                                                        fArr2[i13] = Float.parseFloat(trim.substring(i14, i6));
                                                        i13++;
                                                    }
                                                    if (z11) {
                                                        i6++;
                                                    }
                                                }
                                            }
                                        }
                                        z10 = true;
                                        z13 = false;
                                        if (!z10) {
                                        }
                                    }
                                    if (i14 < i6) {
                                    }
                                    if (z11) {
                                    }
                                }
                                fArr = b(fArr2, i13);
                                i10 = 0;
                            } catch (NumberFormatException e10) {
                                throw new RuntimeException(defpackage.b.m("error in parsing \"", trim, "\""), e10);
                            }
                        } else {
                            fArr = new float[i10];
                        }
                        arrayList.add(new a(trim.charAt(i10), fArr));
                    }
                    i12 = i11;
                    i11++;
                    i10 = 0;
                }
                i11++;
            }
            trim = str.substring(i12, i11).trim();
            if (trim.length() > 0) {
            }
            i12 = i11;
            i11++;
            i10 = 0;
        }
        if (i11 - i12 == 1 && i12 < str.length()) {
            arrayList.add(new a(str.charAt(i12), new float[0]));
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c10 = c(str);
        if (c10 != null) {
            try {
                a.b(c10, path);
                return path;
            } catch (RuntimeException e10) {
                throw new RuntimeException(defpackage.c.r("Error in parsing ", str), e10);
            }
        }
        return null;
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            aVarArr2[i6] = new a(aVarArr[i6]);
        }
        return aVarArr2;
    }

    /* compiled from: PathParser.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public char f21628a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f21629b;

        public a(char c10, float[] fArr) {
            this.f21628a = c10;
            this.f21629b = fArr;
        }

        public static void a(Path path, float f, float f2, float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f14);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = f;
            double d13 = f2;
            double d14 = (d13 * sin) + (d12 * cos);
            double d15 = d12;
            double d16 = f12;
            double d17 = d14 / d16;
            double d18 = f13;
            double d19 = ((d13 * cos) + ((-f) * sin)) / d18;
            double d20 = d13;
            double d21 = f11;
            double d22 = ((d21 * sin) + (f10 * cos)) / d16;
            double d23 = ((d21 * cos) + ((-f10) * sin)) / d18;
            double d24 = d17 - d22;
            double d25 = d19 - d23;
            double d26 = (d17 + d22) / 2.0d;
            double d27 = (d19 + d23) / 2.0d;
            double d28 = (d25 * d25) + (d24 * d24);
            if (d28 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d29 = (1.0d / d28) - 0.25d;
            if (d29 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d28);
                float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
                a(path, f, f2, f10, f11, f12 * sqrt, f13 * sqrt, f14, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d29);
            double d30 = d24 * sqrt2;
            double d31 = sqrt2 * d25;
            if (z10 == z11) {
                d10 = d26 - d31;
                d11 = d27 + d30;
            } else {
                d10 = d26 + d31;
                d11 = d27 - d30;
            }
            double atan2 = Math.atan2(d19 - d11, d17 - d10);
            double atan22 = Math.atan2(d23 - d11, d22 - d10) - atan2;
            int i6 = 0;
            int i10 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z11 != (i10 >= 0)) {
                atan22 = i10 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d32 = d10 * d16;
            double d33 = d11 * d18;
            double d34 = (d32 * cos) - (d33 * sin);
            double d35 = (d33 * cos) + (d32 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d36 = -d16;
            double d37 = d36 * cos2;
            double d38 = d18 * sin2;
            double d39 = (d37 * sin3) - (d38 * cos3);
            double d40 = d36 * sin2;
            double d41 = d18 * cos2;
            double d42 = (cos3 * d41) + (sin3 * d40);
            double d43 = atan22 / ceil;
            double d44 = atan2;
            while (i6 < ceil) {
                double d45 = d44 + d43;
                double sin4 = Math.sin(d45);
                double cos4 = Math.cos(d45);
                double d46 = d43;
                double d47 = (((d16 * cos2) * cos4) + d34) - (d38 * sin4);
                double d48 = d34;
                double d49 = (d41 * sin4) + (d16 * sin2 * cos4) + d35;
                double d50 = (d37 * sin4) - (d38 * cos4);
                double d51 = (cos4 * d41) + (sin4 * d40);
                double d52 = d45 - d44;
                double tan = Math.tan(d52 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d52)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d39 * sqrt3) + d15), (float) ((d42 * sqrt3) + d20), (float) (d47 - (sqrt3 * d50)), (float) (d49 - (sqrt3 * d51)), (float) d47, (float) d49);
                i6++;
                d41 = d41;
                d40 = d40;
                ceil = ceil;
                cos2 = cos2;
                d44 = d45;
                d16 = d16;
                d42 = d51;
                d39 = d50;
                d15 = d47;
                d20 = d49;
                d43 = d46;
                d34 = d48;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i6;
            int i10;
            char c10;
            a aVar;
            int i11;
            boolean z10;
            boolean z11;
            float f;
            float f2;
            boolean z12;
            boolean z13;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            a[] aVarArr2 = aVarArr;
            float[] fArr = new float[6];
            char c11 = 'm';
            char c12 = 0;
            char c13 = 'm';
            int i12 = 0;
            while (i12 < aVarArr2.length) {
                a aVar2 = aVarArr2[i12];
                char c14 = aVar2.f21628a;
                float f29 = fArr[c12];
                float f30 = fArr[1];
                float f31 = fArr[2];
                float f32 = fArr[3];
                float f33 = fArr[4];
                float f34 = fArr[5];
                switch (c14) {
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        i6 = 7;
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    case 'c':
                        i6 = 6;
                        break;
                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    case 'V':
                    case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                    case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                        i6 = 1;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                    case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                    case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                        i6 = 4;
                        break;
                    case 'Z':
                    case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                        path.close();
                        path.moveTo(f33, f34);
                        f29 = f33;
                        f31 = f29;
                        f30 = f34;
                        f32 = f30;
                    default:
                        i6 = 2;
                        break;
                }
                float f35 = f33;
                float f36 = f34;
                float f37 = f29;
                float f38 = f30;
                int i13 = 0;
                while (true) {
                    float[] fArr2 = aVar2.f21629b;
                    if (i13 < fArr2.length) {
                        if (c14 != 'A') {
                            if (c14 != 'C') {
                                if (c14 != 'H') {
                                    if (c14 != 'Q') {
                                        if (c14 != 'V') {
                                            if (c14 != 'a') {
                                                if (c14 != 'c') {
                                                    if (c14 != 'h') {
                                                        if (c14 != 'q') {
                                                            if (c14 != 'v') {
                                                                if (c14 != 'L') {
                                                                    if (c14 != 'M') {
                                                                        if (c14 != 'S') {
                                                                            if (c14 != 'T') {
                                                                                if (c14 != 'l') {
                                                                                    if (c14 != c11) {
                                                                                        if (c14 != 's') {
                                                                                            if (c14 == 't') {
                                                                                                if (c13 != 'q' && c13 != 't' && c13 != 'Q' && c13 != 'T') {
                                                                                                    f28 = 0.0f;
                                                                                                    f27 = 0.0f;
                                                                                                } else {
                                                                                                    f27 = f37 - f31;
                                                                                                    f28 = f38 - f32;
                                                                                                }
                                                                                                int i14 = i13 + 0;
                                                                                                int i15 = i13 + 1;
                                                                                                path.rQuadTo(f27, f28, fArr2[i14], fArr2[i15]);
                                                                                                float f39 = f27 + f37;
                                                                                                float f40 = f28 + f38;
                                                                                                f37 += fArr2[i14];
                                                                                                f38 += fArr2[i15];
                                                                                                f32 = f40;
                                                                                                f31 = f39;
                                                                                            }
                                                                                            i10 = i13;
                                                                                        } else {
                                                                                            if (c13 != 'c' && c13 != 's' && c13 != 'C' && c13 != 'S') {
                                                                                                f25 = 0.0f;
                                                                                                f26 = 0.0f;
                                                                                            } else {
                                                                                                float f41 = f37 - f31;
                                                                                                f25 = f38 - f32;
                                                                                                f26 = f41;
                                                                                            }
                                                                                            int i16 = i13 + 0;
                                                                                            int i17 = i13 + 1;
                                                                                            int i18 = i13 + 2;
                                                                                            int i19 = i13 + 3;
                                                                                            i10 = i13;
                                                                                            f10 = f38;
                                                                                            float f42 = f37;
                                                                                            path.rCubicTo(f26, f25, fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                                                            f11 = fArr2[i16] + f42;
                                                                                            f12 = fArr2[i17] + f10;
                                                                                            f13 = f42 + fArr2[i18];
                                                                                            f14 = fArr2[i19];
                                                                                        }
                                                                                    } else {
                                                                                        i10 = i13;
                                                                                        float f43 = fArr2[i10 + 0];
                                                                                        f37 += f43;
                                                                                        float f44 = fArr2[i10 + 1];
                                                                                        f38 += f44;
                                                                                        if (i10 > 0) {
                                                                                            path.rLineTo(f43, f44);
                                                                                        } else {
                                                                                            path.rMoveTo(f43, f44);
                                                                                            f36 = f38;
                                                                                            f35 = f37;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i10 = i13;
                                                                                    f17 = f38;
                                                                                    int i20 = i10 + 0;
                                                                                    float f45 = fArr2[i20];
                                                                                    int i21 = i10 + 1;
                                                                                    path.rLineTo(f45, fArr2[i21]);
                                                                                    f37 += fArr2[i20];
                                                                                    f18 = fArr2[i21];
                                                                                }
                                                                            } else {
                                                                                i10 = i13;
                                                                                float f46 = f38;
                                                                                float f47 = f37;
                                                                                if (c13 != 'q' && c13 != 't' && c13 != 'Q' && c13 != 'T') {
                                                                                    f23 = f47;
                                                                                    f24 = f46;
                                                                                } else {
                                                                                    f23 = (f47 * 2.0f) - f31;
                                                                                    f24 = (f46 * 2.0f) - f32;
                                                                                }
                                                                                int i22 = i10 + 0;
                                                                                int i23 = i10 + 1;
                                                                                path.quadTo(f23, f24, fArr2[i22], fArr2[i23]);
                                                                                f32 = f24;
                                                                                f31 = f23;
                                                                                c10 = c14;
                                                                                aVar = aVar2;
                                                                                i11 = i12;
                                                                                f37 = fArr2[i22];
                                                                                f38 = fArr2[i23];
                                                                            }
                                                                        } else {
                                                                            i10 = i13;
                                                                            float f48 = f38;
                                                                            float f49 = f37;
                                                                            if (c13 != 'c' && c13 != 's' && c13 != 'C' && c13 != 'S') {
                                                                                f22 = f49;
                                                                                f21 = f48;
                                                                            } else {
                                                                                f21 = (f48 * 2.0f) - f32;
                                                                                f22 = (f49 * 2.0f) - f31;
                                                                            }
                                                                            int i24 = i10 + 0;
                                                                            int i25 = i10 + 1;
                                                                            int i26 = i10 + 2;
                                                                            int i27 = i10 + 3;
                                                                            path.cubicTo(f22, f21, fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                                                                            float f50 = fArr2[i24];
                                                                            float f51 = fArr2[i25];
                                                                            f16 = fArr2[i26];
                                                                            f15 = fArr2[i27];
                                                                            f31 = f50;
                                                                            f32 = f51;
                                                                            f37 = f16;
                                                                            f38 = f15;
                                                                        }
                                                                    } else {
                                                                        i10 = i13;
                                                                        f19 = fArr2[i10 + 0];
                                                                        f20 = fArr2[i10 + 1];
                                                                        if (i10 > 0) {
                                                                            path.lineTo(f19, f20);
                                                                        } else {
                                                                            path.moveTo(f19, f20);
                                                                            f35 = f19;
                                                                            f36 = f20;
                                                                        }
                                                                    }
                                                                    f37 = f35;
                                                                    f38 = f36;
                                                                } else {
                                                                    i10 = i13;
                                                                    int i28 = i10 + 0;
                                                                    int i29 = i10 + 1;
                                                                    path.lineTo(fArr2[i28], fArr2[i29]);
                                                                    f19 = fArr2[i28];
                                                                    f20 = fArr2[i29];
                                                                }
                                                                f37 = f19;
                                                                f38 = f20;
                                                            } else {
                                                                i10 = i13;
                                                                f17 = f38;
                                                                int i30 = i10 + 0;
                                                                path.rLineTo(0.0f, fArr2[i30]);
                                                                f18 = fArr2[i30];
                                                            }
                                                            f38 = f17 + f18;
                                                        } else {
                                                            i10 = i13;
                                                            f10 = f38;
                                                            float f52 = f37;
                                                            int i31 = i10 + 0;
                                                            float f53 = fArr2[i31];
                                                            int i32 = i10 + 1;
                                                            int i33 = i10 + 2;
                                                            int i34 = i10 + 3;
                                                            path.rQuadTo(f53, fArr2[i32], fArr2[i33], fArr2[i34]);
                                                            f11 = fArr2[i31] + f52;
                                                            f12 = fArr2[i32] + f10;
                                                            float f54 = f52 + fArr2[i33];
                                                            float f55 = fArr2[i34];
                                                            f13 = f54;
                                                            f14 = f55;
                                                        }
                                                    } else {
                                                        i10 = i13;
                                                        int i35 = i10 + 0;
                                                        path.rLineTo(fArr2[i35], 0.0f);
                                                        f37 += fArr2[i35];
                                                    }
                                                    c10 = c14;
                                                    aVar = aVar2;
                                                    i11 = i12;
                                                } else {
                                                    i10 = i13;
                                                    f10 = f38;
                                                    float f56 = f37;
                                                    int i36 = i10 + 2;
                                                    int i37 = i10 + 3;
                                                    int i38 = i10 + 4;
                                                    int i39 = i10 + 5;
                                                    path.rCubicTo(fArr2[i10 + 0], fArr2[i10 + 1], fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                                                    f11 = fArr2[i36] + f56;
                                                    f12 = fArr2[i37] + f10;
                                                    f13 = f56 + fArr2[i38];
                                                    f14 = fArr2[i39];
                                                }
                                                f15 = f10 + f14;
                                                f31 = f11;
                                                f32 = f12;
                                                f16 = f13;
                                                f37 = f16;
                                                f38 = f15;
                                                c10 = c14;
                                                aVar = aVar2;
                                                i11 = i12;
                                            } else {
                                                i10 = i13;
                                                float f57 = f38;
                                                float f58 = f37;
                                                int i40 = i10 + 5;
                                                float f59 = fArr2[i40] + f58;
                                                int i41 = i10 + 6;
                                                float f60 = fArr2[i41] + f57;
                                                float f61 = fArr2[i10 + 0];
                                                float f62 = fArr2[i10 + 1];
                                                float f63 = fArr2[i10 + 2];
                                                if (fArr2[i10 + 3] != 0.0f) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (fArr2[i10 + 4] != 0.0f) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                c10 = c14;
                                                aVar = aVar2;
                                                i11 = i12;
                                                a(path, f58, f57, f59, f60, f61, f62, f63, z12, z13);
                                                f37 = f58 + fArr2[i40];
                                                f38 = f57 + fArr2[i41];
                                            }
                                        } else {
                                            i10 = i13;
                                            c10 = c14;
                                            aVar = aVar2;
                                            i11 = i12;
                                            int i42 = i10 + 0;
                                            path.lineTo(f37, fArr2[i42]);
                                            f38 = fArr2[i42];
                                        }
                                    } else {
                                        i10 = i13;
                                        c10 = c14;
                                        aVar = aVar2;
                                        i11 = i12;
                                        int i43 = i10 + 0;
                                        int i44 = i10 + 1;
                                        int i45 = i10 + 2;
                                        int i46 = i10 + 3;
                                        path.quadTo(fArr2[i43], fArr2[i44], fArr2[i45], fArr2[i46]);
                                        f = fArr2[i43];
                                        f2 = fArr2[i44];
                                        f37 = fArr2[i45];
                                        f38 = fArr2[i46];
                                    }
                                } else {
                                    i10 = i13;
                                    c10 = c14;
                                    aVar = aVar2;
                                    i11 = i12;
                                    int i47 = i10 + 0;
                                    path.lineTo(fArr2[i47], f38);
                                    f37 = fArr2[i47];
                                }
                                i13 = i10 + i6;
                                aVar2 = aVar;
                                c13 = c10;
                                c14 = c13;
                                i12 = i11;
                                c11 = 'm';
                            } else {
                                i10 = i13;
                                c10 = c14;
                                aVar = aVar2;
                                i11 = i12;
                                int i48 = i10 + 2;
                                int i49 = i10 + 3;
                                int i50 = i10 + 4;
                                int i51 = i10 + 5;
                                path.cubicTo(fArr2[i10 + 0], fArr2[i10 + 1], fArr2[i48], fArr2[i49], fArr2[i50], fArr2[i51]);
                                float f64 = fArr2[i50];
                                float f65 = fArr2[i51];
                                f = fArr2[i48];
                                f37 = f64;
                                f38 = f65;
                                f2 = fArr2[i49];
                            }
                            f31 = f;
                            f32 = f2;
                            i13 = i10 + i6;
                            aVar2 = aVar;
                            c13 = c10;
                            c14 = c13;
                            i12 = i11;
                            c11 = 'm';
                        } else {
                            i10 = i13;
                            float f66 = f38;
                            float f67 = f37;
                            c10 = c14;
                            aVar = aVar2;
                            i11 = i12;
                            int i52 = i10 + 5;
                            float f68 = fArr2[i52];
                            int i53 = i10 + 6;
                            float f69 = fArr2[i53];
                            float f70 = fArr2[i10 + 0];
                            float f71 = fArr2[i10 + 1];
                            float f72 = fArr2[i10 + 2];
                            if (fArr2[i10 + 3] != 0.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fArr2[i10 + 4] != 0.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            a(path, f67, f66, f68, f69, f70, f71, f72, z10, z11);
                            f37 = fArr2[i52];
                            f38 = fArr2[i53];
                        }
                        f32 = f38;
                        f31 = f37;
                        i13 = i10 + i6;
                        aVar2 = aVar;
                        c13 = c10;
                        c14 = c13;
                        i12 = i11;
                        c11 = 'm';
                    }
                }
                int i54 = i12;
                fArr[0] = f37;
                fArr[1] = f38;
                fArr[2] = f31;
                fArr[3] = f32;
                fArr[4] = f35;
                fArr[5] = f36;
                i12 = i54 + 1;
                c13 = aVarArr[i54].f21628a;
                c11 = 'm';
                c12 = 0;
                aVarArr2 = aVarArr;
            }
        }

        public a(a aVar) {
            this.f21628a = aVar.f21628a;
            float[] fArr = aVar.f21629b;
            this.f21629b = g.b(fArr, fArr.length);
        }
    }
}
