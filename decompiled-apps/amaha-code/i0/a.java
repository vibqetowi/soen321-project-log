package i0;

import android.graphics.Color;
/* compiled from: CamColor.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f19607a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19608b;

    /* renamed from: c  reason: collision with root package name */
    public final float f19609c;

    /* renamed from: d  reason: collision with root package name */
    public final float f19610d;

    /* renamed from: e  reason: collision with root package name */
    public final float f19611e;
    public final float f;

    public a(float f, float f2, float f10, float f11, float f12, float f13) {
        this.f19607a = f;
        this.f19608b = f2;
        this.f19609c = f10;
        this.f19610d = f11;
        this.f19611e = f12;
        this.f = f13;
    }

    public static a a(int i6) {
        float f;
        float pow;
        i iVar = i.f19642k;
        float S = sc.b.S(Color.red(i6));
        float S2 = sc.b.S(Color.green(i6));
        float S3 = sc.b.S(Color.blue(i6));
        float[][] fArr = sc.b.F;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * S3) + (fArr2[1] * S2) + (fArr2[0] * S);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * S3) + (fArr3[1] * S2) + (fArr3[0] * S);
        float[] fArr4 = fArr[2];
        float f11 = (S3 * fArr4[2]) + (S2 * fArr4[1]) + (S * fArr4[0]);
        float[][] fArr5 = sc.b.C;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f13 = fArr7[1] * f10;
        float f14 = fArr7[2] * f11;
        float[] fArr8 = fArr5[2];
        float f15 = f2 * fArr8[0];
        float f16 = f11 * fArr8[2];
        float[] fArr9 = iVar.f19648g;
        float f17 = fArr9[0] * f12;
        float f18 = fArr9[1] * (f14 + f13 + (fArr7[0] * f2));
        float f19 = fArr9[2] * (f16 + (f10 * fArr8[1]) + f15);
        float abs = Math.abs(f17);
        float f20 = iVar.f19649h;
        float pow2 = (float) Math.pow((abs * f20) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f18) * f20) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f19) * f20) / 100.0d, 0.42d);
        float signum = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f19) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d10 = signum3;
        float f21 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d10)) / 11.0f;
        float f22 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f23 = signum2 * 20.0f;
        float f24 = ((21.0f * signum3) + ((signum * 20.0f) + f23)) / 20.0f;
        float f25 = (((signum * 40.0f) + f23) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f26 = atan2;
        float f27 = (3.1415927f * f26) / 180.0f;
        float f28 = f25 * iVar.f19644b;
        float f29 = iVar.f19643a;
        double d11 = f28 / f29;
        float f30 = iVar.f19651j;
        float f31 = iVar.f19646d;
        float pow5 = ((float) Math.pow(d11, f30 * f31)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f32 = f29 + 4.0f;
        if (f26 < 20.14d) {
            f = 360.0f + f26;
        } else {
            f = f26;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, iVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * iVar.f19647e) * iVar.f19645c) * ((float) Math.sqrt((f22 * f22) + (f21 * f21)))) / (f24 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f31) / f32);
        float f33 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((iVar.f19650i * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d12 = f27;
        return new a(f26, pow6, pow5, f33, log * ((float) Math.cos(d12)), log * ((float) Math.sin(d12)));
    }

    public static a b(float f, float f2, float f10) {
        i iVar;
        double d10;
        float f11 = i.f19642k.f19646d;
        Math.sqrt(f / 100.0d);
        Math.sqrt(((f2 / ((float) Math.sqrt(d10))) * iVar.f19646d) / (iVar.f19643a + 4.0f));
        float f12 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((iVar.f19650i * f2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f10) / 180.0f;
        return new a(f10, f2, f, f12, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public final int c(i iVar) {
        float f;
        float[] fArr;
        float f2 = this.f19608b;
        float f10 = this.f19609c;
        if (f2 != 0.0d) {
            double d10 = f10;
            if (d10 != 0.0d) {
                f = f2 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, iVar.f), 0.73d), 1.1111111111111112d);
                double d11 = (this.f19607a * 3.1415927f) / 180.0f;
                float pow2 = iVar.f19643a * ((float) Math.pow(f10 / 100.0d, (1.0d / iVar.f19646d) / iVar.f19651j));
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f * 3846.1538f * iVar.f19647e * iVar.f19645c;
                float f11 = pow2 / iVar.f19644b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f12 = (((0.305f + f11) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f13 = cos2 * f12;
                float f14 = f12 * sin;
                float f15 = f11 * 460.0f;
                float f16 = ((288.0f * f14) + ((451.0f * f13) + f15)) / 1403.0f;
                float f17 = ((f15 - (891.0f * f13)) - (261.0f * f14)) / 1403.0f;
                float f18 = ((f15 - (f13 * 220.0f)) - (f14 * 6300.0f)) / 1403.0f;
                float signum = Math.signum(f16);
                float f19 = 100.0f / iVar.f19649h;
                float pow3 = signum * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
                float signum2 = Math.signum(f17) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
                float[] fArr2 = iVar.f19648g;
                float f20 = pow3 / fArr2[0];
                float f21 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(f18) * f19) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = sc.b.D;
                float[] fArr4 = fArr3[0];
                float f22 = (fArr4[2] * signum3) + (fArr4[1] * f21) + (fArr4[0] * f20);
                float[] fArr5 = fArr3[1];
                float f23 = fArr5[1] * f21;
                float f24 = fArr5[2] * signum3;
                float f25 = f20 * fArr3[2][0];
                return j0.d.b(f22, f24 + f23 + (fArr5[0] * f20), (signum3 * fArr[2]) + (f21 * fArr[1]) + f25);
            }
        }
        f = 0.0f;
        float pow4 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, iVar.f), 0.73d), 1.1111111111111112d);
        double d112 = (this.f19607a * 3.1415927f) / 180.0f;
        float pow22 = iVar.f19643a * ((float) Math.pow(f10 / 100.0d, (1.0d / iVar.f19646d) / iVar.f19651j));
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f * 3846.1538f * iVar.f19647e * iVar.f19645c;
        float f112 = pow22 / iVar.f19644b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f122 = (((0.305f + f112) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f132 = cos22 * f122;
        float f142 = f122 * sin2;
        float f152 = f112 * 460.0f;
        float f162 = ((288.0f * f142) + ((451.0f * f132) + f152)) / 1403.0f;
        float f172 = ((f152 - (891.0f * f132)) - (261.0f * f142)) / 1403.0f;
        float f182 = ((f152 - (f132 * 220.0f)) - (f142 * 6300.0f)) / 1403.0f;
        float signum4 = Math.signum(f162);
        float f192 = 100.0f / iVar.f19649h;
        float pow32 = signum4 * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f162) * 27.13d) / (400.0d - Math.abs(f162))), 2.380952380952381d));
        float signum22 = Math.signum(f172) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f172) * 27.13d) / (400.0d - Math.abs(f172))), 2.380952380952381d));
        float[] fArr22 = iVar.f19648g;
        float f202 = pow32 / fArr22[0];
        float f212 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(f182) * f192) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = sc.b.D;
        float[] fArr42 = fArr32[0];
        float f222 = (fArr42[2] * signum32) + (fArr42[1] * f212) + (fArr42[0] * f202);
        float[] fArr52 = fArr32[1];
        float f232 = fArr52[1] * f212;
        float f242 = fArr52[2] * signum32;
        float f252 = f202 * fArr32[2][0];
        return j0.d.b(f222, f242 + f232 + (fArr52[0] * f202), (signum32 * fArr[2]) + (f212 * fArr[1]) + f252);
    }
}
