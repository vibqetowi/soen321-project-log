package x8;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import c9.q;
import c9.w;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.List;
import nc.c;
import p8.a;
import p8.e;
import p8.f;
/* compiled from: Tx3gDecoder.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: m  reason: collision with root package name */
    public final q f37685m = new q();

    /* renamed from: n  reason: collision with root package name */
    public final boolean f37686n;

    /* renamed from: o  reason: collision with root package name */
    public final int f37687o;

    /* renamed from: p  reason: collision with root package name */
    public final int f37688p;

    /* renamed from: q  reason: collision with root package name */
    public final String f37689q;
    public final float r;

    /* renamed from: s  reason: collision with root package name */
    public final int f37690s;

    public a(List<byte[]> list) {
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f37687o = bArr[24];
            this.f37688p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f37689q = "Serif".equals(w.l(43, bArr, bArr.length - 43)) ? "serif" : "sans-serif";
            int i6 = bArr[25] * 20;
            this.f37690s = i6;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f37686n = z10;
            if (z10) {
                this.r = w.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i6, 0.0f, 0.95f);
                return;
            } else {
                this.r = 0.85f;
                return;
            }
        }
        this.f37687o = 0;
        this.f37688p = -1;
        this.f37689q = "sans-serif";
        this.f37686n = false;
        this.r = 0.85f;
        this.f37690s = -1;
    }

    public static void i(SpannableStringBuilder spannableStringBuilder, int i6, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (i6 != i10) {
            int i14 = i13 | 33;
            boolean z12 = true;
            if ((i6 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i6 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            }
            if ((i6 & 4) == 0) {
                z12 = false;
            }
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (!z12 && !z10 && !z11) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
            }
        }
    }

    @Override // p8.e
    public final f h(byte[] bArr, int i6, boolean z10) {
        boolean z11;
        String o10;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        int i13;
        int i14;
        float f;
        int i15;
        q qVar = this.f37685m;
        qVar.y(bArr, i6);
        int i16 = 2;
        int i17 = 1;
        if (qVar.f5188c - qVar.f5187b >= 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            int v10 = qVar.v();
            int i18 = 8;
            if (v10 == 0) {
                o10 = "";
            } else {
                int i19 = qVar.f5188c;
                int i20 = qVar.f5187b;
                if (i19 - i20 >= 2) {
                    byte[] bArr2 = qVar.f5186a;
                    char c10 = (char) ((bArr2[i20 + 1] & 255) | ((bArr2[i20] & 255) << 8));
                    if (c10 == 65279 || c10 == 65534) {
                        o10 = qVar.o(v10, c.f25990e);
                    }
                }
                o10 = qVar.o(v10, c.f25988c);
            }
            if (o10.isEmpty()) {
                return b.f37691v;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(o10);
            i(spannableStringBuilder, this.f37687o, 0, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            int i21 = this.f37688p;
            if (i21 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i21 & 255) << 24) | (i21 >>> 8)), 0, length, 16711713);
            }
            int length2 = spannableStringBuilder.length();
            String str = this.f37689q;
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float f2 = this.r;
            while (true) {
                int i22 = qVar.f5188c;
                int i23 = qVar.f5187b;
                if (i22 - i23 >= i18) {
                    int c11 = qVar.c();
                    int c12 = qVar.c();
                    if (c12 == 1937013100) {
                        if (qVar.f5188c - qVar.f5187b >= i16) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            int v11 = qVar.v();
                            int i24 = 0;
                            while (i24 < v11) {
                                if (qVar.f5188c - qVar.f5187b >= 12) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    int v12 = qVar.v();
                                    int v13 = qVar.v();
                                    qVar.B(i16);
                                    int q10 = qVar.q();
                                    qVar.B(i17);
                                    int c13 = qVar.c();
                                    if (v13 > spannableStringBuilder.length()) {
                                        int length3 = spannableStringBuilder.length();
                                        i11 = i24;
                                        i12 = v11;
                                        StringBuilder sb2 = new StringBuilder(68);
                                        sb2.append("Truncating styl end (");
                                        sb2.append(v13);
                                        sb2.append(") to cueText.length() (");
                                        sb2.append(length3);
                                        sb2.append(").");
                                        Log.w("Tx3gDecoder", sb2.toString());
                                        v13 = spannableStringBuilder.length();
                                    } else {
                                        i11 = i24;
                                        i12 = v11;
                                    }
                                    int i25 = v13;
                                    if (v12 >= i25) {
                                        StringBuilder sb3 = new StringBuilder(60);
                                        sb3.append("Ignoring styl with start (");
                                        sb3.append(v12);
                                        sb3.append(") >= end (");
                                        sb3.append(i25);
                                        sb3.append(").");
                                        Log.w("Tx3gDecoder", sb3.toString());
                                        i15 = i23;
                                        i13 = i11;
                                        i14 = i12;
                                        f = f2;
                                    } else {
                                        i13 = i11;
                                        i14 = i12;
                                        f = f2;
                                        i15 = i23;
                                        i(spannableStringBuilder, q10, this.f37687o, v12, i25, 0);
                                        if (c13 != i21) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan((c13 >>> 8) | ((c13 & 255) << 24)), v12, i25, 33);
                                        }
                                    }
                                    i24 = i13 + 1;
                                    v11 = i14;
                                    f2 = f;
                                    i23 = i15;
                                    i16 = 2;
                                    i17 = 1;
                                } else {
                                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                                }
                            }
                            i10 = i23;
                        } else {
                            throw new SubtitleDecoderException("Unexpected subtitle format.");
                        }
                    } else {
                        float f10 = f2;
                        i10 = i23;
                        if (c12 == 1952608120 && this.f37686n) {
                            i16 = 2;
                            if (qVar.f5188c - qVar.f5187b >= 2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                f2 = w.g(qVar.v() / this.f37690s, 0.0f, 0.95f);
                            } else {
                                throw new SubtitleDecoderException("Unexpected subtitle format.");
                            }
                        } else {
                            i16 = 2;
                            f2 = f10;
                        }
                    }
                    qVar.A(i10 + c11);
                    i17 = 1;
                    i18 = 8;
                } else {
                    float f11 = f2;
                    a.C0467a c0467a = new a.C0467a();
                    c0467a.f27989a = spannableStringBuilder;
                    c0467a.f27993e = f11;
                    c0467a.f = 0;
                    c0467a.f27994g = 0;
                    return new b(c0467a.a());
                }
            }
        } else {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }
}
