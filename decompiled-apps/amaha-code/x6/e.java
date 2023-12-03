package x6;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LegendRenderer.java */
/* loaded from: classes.dex */
public final class e extends g3.f {

    /* renamed from: c  reason: collision with root package name */
    public final Paint f37624c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f37625d;

    /* renamed from: e  reason: collision with root package name */
    public final q6.e f37626e;
    public final ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint.FontMetrics f37627g;

    /* renamed from: h  reason: collision with root package name */
    public final Path f37628h;

    public e(y6.g gVar, q6.e eVar) {
        super(1, gVar);
        this.f = new ArrayList(16);
        this.f37627g = new Paint.FontMetrics();
        this.f37628h = new Path();
        this.f37626e = eVar;
        Paint paint = new Paint(1);
        this.f37624c = paint;
        paint.setTextSize(y6.f.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.f37625d = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Type inference failed for: r11v13, types: [v6.d] */
    /* JADX WARN: Type inference failed for: r6v16, types: [v6.d] */
    public final void d(r6.h<?> hVar) {
        q6.f[] fVarArr;
        boolean z10;
        float c10;
        q6.e eVar;
        float f;
        ArrayList arrayList;
        float f2;
        float f10;
        boolean z11;
        float c11;
        String str;
        float f11;
        float f12;
        String p10;
        q6.e eVar2 = this.f37626e;
        eVar2.getClass();
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        for (int i6 = 0; i6 < hVar.c(); i6++) {
            ?? b10 = hVar.b(i6);
            List<Integer> M = b10.M();
            int c0 = b10.c0();
            if (b10 instanceof v6.a) {
                v6.a aVar = (v6.a) b10;
                if (aVar.V()) {
                    String[] X = aVar.X();
                    for (int i10 = 0; i10 < M.size() && i10 < aVar.N(); i10++) {
                        String str2 = X[i10 % X.length];
                        int b11 = b10.b();
                        float A = b10.A();
                        float w10 = b10.w();
                        b10.j();
                        arrayList2.add(new q6.f(str2, b11, A, w10, null, M.get(i10).intValue()));
                    }
                    if (aVar.p() != null) {
                        arrayList2.add(new q6.f(b10.p(), 1, Float.NaN, Float.NaN, null, 1122867));
                    }
                }
            }
            if (b10 instanceof v6.g) {
                v6.g gVar = (v6.g) b10;
                for (int i11 = 0; i11 < M.size() && i11 < c0; i11++) {
                    gVar.x(i11).getClass();
                    int b12 = b10.b();
                    float A2 = b10.A();
                    float w11 = b10.w();
                    b10.j();
                    arrayList2.add(new q6.f(null, b12, A2, w11, null, M.get(i11).intValue()));
                }
                if (gVar.p() != null) {
                    arrayList2.add(new q6.f(b10.p(), 1, Float.NaN, Float.NaN, null, 1122867));
                }
            } else {
                if (b10 instanceof v6.c) {
                    v6.c cVar = (v6.c) b10;
                    if (cVar.j0() != 1122867) {
                        int j02 = cVar.j0();
                        int Y = cVar.Y();
                        int b13 = b10.b();
                        float A3 = b10.A();
                        float w12 = b10.w();
                        b10.j();
                        arrayList2.add(new q6.f(null, b13, A3, w12, null, j02));
                        String p11 = b10.p();
                        int b14 = b10.b();
                        float A4 = b10.A();
                        float w13 = b10.w();
                        b10.j();
                        arrayList2.add(new q6.f(p11, b14, A4, w13, null, Y));
                    }
                }
                for (int i12 = 0; i12 < M.size() && i12 < c0; i12++) {
                    if (i12 < M.size() - 1 && i12 < c0 - 1) {
                        p10 = null;
                    } else {
                        p10 = hVar.b(i6).p();
                    }
                    int b15 = b10.b();
                    float A5 = b10.A();
                    float w14 = b10.w();
                    b10.j();
                    arrayList2.add(new q6.f(p10, b15, A5, w14, null, M.get(i12).intValue()));
                }
            }
        }
        eVar2.f = (q6.f[]) arrayList2.toArray(new q6.f[arrayList2.size()]);
        Paint paint = this.f37624c;
        paint.setTextSize(eVar2.f29201d);
        paint.setColor(eVar2.f29202e);
        y6.g gVar2 = (y6.g) this.f16181b;
        float f13 = eVar2.f29209l;
        float c12 = y6.f.c(f13);
        float c13 = y6.f.c(eVar2.f29213p);
        float f14 = eVar2.f29212o;
        float c14 = y6.f.c(f14);
        float c15 = y6.f.c(eVar2.f29211n);
        float c16 = y6.f.c(0.0f);
        q6.f[] fVarArr2 = eVar2.f;
        int length = fVarArr2.length;
        y6.f.c(f14);
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (q6.f fVar : eVar2.f) {
            if (Float.isNaN(fVar.f29222c)) {
                f12 = f13;
            } else {
                f12 = fVar.f29222c;
            }
            float c17 = y6.f.c(f12);
            if (c17 > f15) {
                f15 = c17;
            }
            String str3 = fVar.f29220a;
            if (str3 != null) {
                float measureText = (int) paint.measureText(str3);
                if (measureText > f16) {
                    f16 = measureText;
                }
            }
        }
        float f17 = 0.0f;
        for (q6.f fVar2 : eVar2.f) {
            String str4 = fVar2.f29220a;
            if (str4 != null) {
                float a10 = y6.f.a(paint, str4);
                if (a10 > f17) {
                    f17 = a10;
                }
            }
        }
        eVar2.f29216t = f17;
        int d10 = v.h.d(eVar2.f29206i);
        if (d10 != 0) {
            if (d10 == 1) {
                Paint.FontMetrics fontMetrics = y6.f.f;
                paint.getFontMetrics(fontMetrics);
                float f18 = fontMetrics.descent - fontMetrics.ascent;
                float f19 = 0.0f;
                float f20 = 0.0f;
                float f21 = 0.0f;
                int i13 = 0;
                boolean z12 = false;
                while (i13 < length) {
                    q6.f fVar3 = fVarArr2[i13];
                    float f22 = f21;
                    if (fVar3.f29221b != 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    float f23 = fVar3.f29222c;
                    if (Float.isNaN(f23)) {
                        c11 = c12;
                    } else {
                        c11 = y6.f.c(f23);
                    }
                    if (!z12) {
                        f22 = 0.0f;
                    }
                    if (z11) {
                        if (z12) {
                            f22 += c13;
                        }
                        f22 += c11;
                    }
                    float f24 = c12;
                    float f25 = f22;
                    if (fVar3.f29220a != null) {
                        if (z11 && !z12) {
                            f11 = f25 + c14;
                        } else if (z12) {
                            f19 = Math.max(f19, f25);
                            f20 += f18 + c16;
                            f11 = 0.0f;
                            z12 = false;
                        } else {
                            f11 = f25;
                        }
                        f21 = f11 + ((int) paint.measureText(str));
                        if (i13 < length - 1) {
                            f20 = f18 + c16 + f20;
                        }
                    } else {
                        float f26 = f25 + c11;
                        if (i13 < length - 1) {
                            f26 += c13;
                        }
                        f21 = f26;
                        z12 = true;
                    }
                    f19 = Math.max(f19, f21);
                    i13++;
                    c12 = f24;
                }
                eVar2.r = f19;
                eVar2.f29215s = f20;
            }
        } else {
            Paint.FontMetrics fontMetrics2 = y6.f.f;
            paint.getFontMetrics(fontMetrics2);
            float f27 = fontMetrics2.descent - fontMetrics2.ascent;
            paint.getFontMetrics(fontMetrics2);
            float f28 = (fontMetrics2.ascent - fontMetrics2.top) + fontMetrics2.bottom + c16;
            gVar2.a();
            ArrayList arrayList3 = eVar2.f29218v;
            arrayList3.clear();
            ArrayList arrayList4 = eVar2.f29217u;
            arrayList4.clear();
            ArrayList arrayList5 = eVar2.f29219w;
            arrayList5.clear();
            float f29 = 0.0f;
            int i14 = -1;
            int i15 = 0;
            float f30 = 0.0f;
            float f31 = 0.0f;
            while (i15 < length) {
                q6.f fVar4 = fVarArr2[i15];
                q6.f[] fVarArr3 = fVarArr2;
                float f32 = f28;
                if (fVar4.f29221b != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float f33 = fVar4.f29222c;
                if (Float.isNaN(f33)) {
                    eVar = eVar2;
                    c10 = c12;
                } else {
                    c10 = y6.f.c(f33);
                    eVar = eVar2;
                }
                arrayList3.add(Boolean.FALSE);
                if (i14 == -1) {
                    f = 0.0f;
                } else {
                    f = f29 + c13;
                }
                String str5 = fVar4.f29220a;
                if (str5 != null) {
                    arrayList4.add(y6.f.b(paint, str5));
                    if (z10) {
                        f10 = c10 + c14;
                    } else {
                        f10 = 0.0f;
                    }
                    arrayList = arrayList3;
                    f29 = f + f10 + ((y6.a) arrayList4.get(i15)).f38270b;
                } else {
                    arrayList = arrayList3;
                    arrayList4.add(y6.a.b(0.0f, 0.0f));
                    if (!z10) {
                        c10 = 0.0f;
                    }
                    f29 = f + c10;
                    if (i14 == -1) {
                        i14 = i15;
                    }
                }
                if (str5 != null || i15 == length - 1) {
                    if (f31 == 0.0f) {
                        f2 = 0.0f;
                    } else {
                        f2 = c15;
                    }
                    float f34 = f2 + f29 + f31;
                    if (i15 == length - 1) {
                        arrayList5.add(y6.a.b(f34, f27));
                        f30 = Math.max(f30, f34);
                    }
                    f31 = f34;
                }
                if (str5 != null) {
                    i14 = -1;
                }
                i15++;
                fVarArr2 = fVarArr3;
                f28 = f32;
                eVar2 = eVar;
                arrayList3 = arrayList;
            }
            float f35 = f28;
            eVar2.r = f30;
            eVar2.f29215s = (f35 * (arrayList5.size() == 0 ? 0 : arrayList5.size() - 1)) + (f27 * arrayList5.size());
        }
        eVar2.f29215s += eVar2.f29200c;
        eVar2.r += eVar2.f29199b;
    }

    public final void e(Canvas canvas, float f, float f2, q6.f fVar, q6.e eVar) {
        int i6 = fVar.f;
        if (i6 != 1122868 && i6 != 1122867 && i6 != 0) {
            int save = canvas.save();
            int i10 = fVar.f29221b;
            if (i10 == 3) {
                i10 = eVar.f29208k;
            }
            Paint paint = this.f37625d;
            paint.setColor(i6);
            float f10 = fVar.f29222c;
            if (Float.isNaN(f10)) {
                f10 = eVar.f29209l;
            }
            float c10 = y6.f.c(f10);
            float f11 = c10 / 2.0f;
            int d10 = v.h.d(i10);
            if (d10 != 2) {
                if (d10 != 3) {
                    if (d10 != 4) {
                        if (d10 == 5) {
                            float f12 = fVar.f29223d;
                            if (Float.isNaN(f12)) {
                                f12 = eVar.f29210m;
                            }
                            float c11 = y6.f.c(f12);
                            DashPathEffect dashPathEffect = fVar.f29224e;
                            if (dashPathEffect == null) {
                                eVar.getClass();
                                dashPathEffect = null;
                            }
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(c11);
                            paint.setPathEffect(dashPathEffect);
                            Path path = this.f37628h;
                            path.reset();
                            path.moveTo(f, f2);
                            path.lineTo(f + c10, f2);
                            canvas.drawPath(path, paint);
                        }
                    }
                } else {
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawRect(f, f2 - f11, f + c10, f2 + f11, paint);
                }
                canvas.restoreToCount(save);
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f + f11, f2, f11, paint);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Canvas canvas) {
        float f;
        Paint paint;
        float f2;
        float f10;
        float f11;
        float f12;
        boolean z10;
        float c10;
        float f13;
        float f14;
        int i6;
        String str;
        boolean z11;
        float f15;
        ArrayList arrayList;
        ArrayList arrayList2;
        float f16;
        String str2;
        int i10;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        boolean z12;
        float c11;
        float f23;
        int i11;
        float f24;
        q6.f fVar;
        float f25;
        Paint paint2;
        float f26;
        float f27;
        float f28;
        float a10;
        float f29;
        double d10;
        float f30;
        q6.e eVar = this.f37626e;
        if (!eVar.f29198a) {
            return;
        }
        Paint paint3 = this.f37624c;
        paint3.setTextSize(eVar.f29201d);
        paint3.setColor(eVar.f29202e);
        Paint.FontMetrics fontMetrics = this.f37627g;
        DisplayMetrics displayMetrics = y6.f.f38290a;
        paint3.getFontMetrics(fontMetrics);
        float f31 = fontMetrics.descent - fontMetrics.ascent;
        paint3.getFontMetrics(fontMetrics);
        float c12 = y6.f.c(0.0f) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
        float a11 = f31 - (y6.f.a(paint3, "ABC") / 2.0f);
        q6.f[] fVarArr = eVar.f;
        float c13 = y6.f.c(eVar.f29212o);
        float c14 = y6.f.c(eVar.f29211n);
        float c15 = y6.f.c(eVar.f29209l);
        float c16 = y6.f.c(eVar.f29213p);
        float f32 = eVar.f29200c;
        float f33 = eVar.f29199b;
        int i12 = eVar.f29204g;
        int d11 = v.h.d(i12);
        int i13 = eVar.f29206i;
        int i14 = eVar.f29207j;
        float f34 = c16;
        Object obj = this.f16181b;
        if (d11 != 0) {
            f = c14;
            if (d11 != 1) {
                if (d11 != 2) {
                    paint = paint3;
                    f2 = f31;
                    f10 = 0.0f;
                } else {
                    if (i13 == 2) {
                        f30 = ((y6.g) obj).f38301c;
                    } else {
                        f30 = ((y6.g) obj).f38300b.right;
                    }
                    float f35 = f30 - f33;
                    if (i14 == 1) {
                        f35 -= eVar.r;
                    }
                    f10 = f35;
                    paint = paint3;
                    f2 = f31;
                }
            } else {
                if (i13 == 2) {
                    a10 = ((y6.g) obj).f38301c / 2.0f;
                } else {
                    y6.g gVar = (y6.g) obj;
                    a10 = (gVar.a() / 2.0f) + gVar.f38300b.left;
                }
                if (i14 == 1) {
                    f29 = f33;
                } else {
                    f29 = -f33;
                }
                f11 = a10 + f29;
                if (i13 == 2) {
                    f2 = f31;
                    double d12 = f11;
                    if (i14 == 1) {
                        paint = paint3;
                        d10 = ((-eVar.r) / 2.0d) + f33;
                    } else {
                        paint = paint3;
                        d10 = (eVar.r / 2.0d) - f33;
                    }
                    f11 = (float) (d12 + d10);
                } else {
                    paint = paint3;
                    f2 = f31;
                }
                f10 = f11;
            }
        } else {
            f = c14;
            paint = paint3;
            f2 = f31;
            if (i13 != 2) {
                f33 += ((y6.g) obj).f38300b.left;
            }
            if (i14 == 2) {
                f11 = eVar.r + f33;
                f10 = f11;
            } else {
                f10 = f33;
            }
        }
        int d13 = v.h.d(i13);
        int i15 = eVar.f29205h;
        if (d13 != 0) {
            if (d13 == 1) {
                int d14 = v.h.d(i15);
                if (d14 != 0) {
                    if (d14 != 1) {
                        if (d14 != 2) {
                            f22 = 0.0f;
                        } else {
                            if (i12 == 2) {
                                f28 = ((y6.g) obj).f38302d;
                            } else {
                                f28 = ((y6.g) obj).f38300b.bottom;
                            }
                            f22 = f28 - (eVar.f29215s + f32);
                        }
                    } else {
                        f22 = ((((y6.g) obj).f38302d / 2.0f) - (eVar.f29215s / 2.0f)) + eVar.f29200c;
                    }
                } else {
                    if (i12 == 2) {
                        f21 = 0.0f;
                    } else {
                        f21 = ((y6.g) obj).f38300b.top;
                    }
                    f22 = f21 + f32;
                }
                float f36 = f22;
                boolean z13 = false;
                int i16 = 0;
                float f37 = 0.0f;
                while (i16 < fVarArr.length) {
                    q6.f fVar2 = fVarArr[i16];
                    if (fVar2.f29221b != 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    float f38 = fVar2.f29222c;
                    if (Float.isNaN(f38)) {
                        c11 = c15;
                    } else {
                        c11 = y6.f.c(f38);
                    }
                    if (z12) {
                        if (i14 == 1) {
                            f27 = f10 + f37;
                        } else {
                            f27 = f10 - (c11 - f37);
                        }
                        f25 = f27;
                        f23 = f34;
                        f24 = a11;
                        fVar = fVar2;
                        e(canvas, f25, f36 + a11, fVar2, this.f37626e);
                        i11 = 1;
                        if (i14 == 1) {
                            f25 += c11;
                        }
                    } else {
                        f23 = f34;
                        i11 = 1;
                        f24 = a11;
                        fVar = fVar2;
                        f25 = f10;
                    }
                    String str3 = fVar.f29220a;
                    if (str3 != null) {
                        if (z12 && !z13) {
                            if (i14 == i11) {
                                f26 = c13;
                            } else {
                                f26 = -c13;
                            }
                            f25 += f26;
                        } else if (z13) {
                            f25 = f10;
                        }
                        if (i14 == 2) {
                            paint2 = paint;
                            f25 -= (int) paint2.measureText(str3);
                        } else {
                            paint2 = paint;
                        }
                        float f39 = f25;
                        if (!z13) {
                            canvas.drawText(str3, f39, f36 + f2, paint2);
                        } else {
                            f36 += f2 + c12;
                            canvas.drawText(str3, f39, f36 + f2, paint2);
                        }
                        f36 = f2 + c12 + f36;
                        f37 = 0.0f;
                    } else {
                        paint2 = paint;
                        f37 = c11 + f23 + f37;
                        z13 = true;
                    }
                    i16++;
                    paint = paint2;
                    a11 = f24;
                    f34 = f23;
                }
                return;
            }
            return;
        }
        Paint paint4 = paint;
        ArrayList arrayList3 = eVar.f29219w;
        ArrayList arrayList4 = eVar.f29217u;
        ArrayList arrayList5 = eVar.f29218v;
        int d15 = v.h.d(i15);
        if (d15 != 0) {
            if (d15 != 1) {
                if (d15 != 2) {
                    f12 = 0.0f;
                } else {
                    f12 = (((y6.g) obj).f38302d - f32) - eVar.f29215s;
                }
            } else {
                f12 = ((((y6.g) obj).f38302d - eVar.f29215s) / 2.0f) + f32;
            }
        } else {
            f12 = f32;
        }
        int length = fVarArr.length;
        float f40 = f10;
        int i17 = 0;
        int i18 = 0;
        while (i18 < length) {
            int i19 = length;
            q6.f fVar3 = fVarArr[i18];
            float f41 = f40;
            q6.f[] fVarArr2 = fVarArr;
            if (fVar3.f29221b != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f42 = fVar3.f29222c;
            if (Float.isNaN(f42)) {
                c10 = c15;
            } else {
                c10 = y6.f.c(f42);
            }
            if (i18 < arrayList5.size() && ((Boolean) arrayList5.get(i18)).booleanValue()) {
                f14 = f2 + c12 + f12;
                f13 = f10;
            } else {
                f13 = f41;
                f14 = f12;
            }
            if (f13 == f10 && i12 == 2) {
                i6 = i12;
                if (i17 < arrayList3.size()) {
                    if (i14 == 2) {
                        f20 = ((y6.a) arrayList3.get(i17)).f38270b;
                    } else {
                        f20 = -((y6.a) arrayList3.get(i17)).f38270b;
                    }
                    f13 += f20 / 2.0f;
                    i17++;
                    int i20 = i17;
                    str = fVar3.f29220a;
                    if (str != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z10) {
                        if (i14 == 2) {
                            f13 -= c10;
                        }
                        float f43 = f13;
                        f15 = f10;
                        str2 = str;
                        arrayList = arrayList3;
                        i10 = i18;
                        arrayList2 = arrayList5;
                        f16 = f;
                        e(canvas, f43, f14 + a11, fVar3, this.f37626e);
                        if (i14 == 1) {
                            f13 = f43 + c10;
                        } else {
                            f13 = f43;
                        }
                    } else {
                        f15 = f10;
                        arrayList = arrayList3;
                        arrayList2 = arrayList5;
                        f16 = f;
                        str2 = str;
                        i10 = i18;
                    }
                    if (z11) {
                        if (z10) {
                            if (i14 == 2) {
                                f19 = -c13;
                            } else {
                                f19 = c13;
                            }
                            f13 += f19;
                        }
                        if (i14 == 2) {
                            f13 -= ((y6.a) arrayList4.get(i10)).f38270b;
                        }
                        canvas.drawText(str2, f13, f14 + f2, paint4);
                        if (i14 == 1) {
                            f13 += ((y6.a) arrayList4.get(i10)).f38270b;
                        }
                        if (i14 == 2) {
                            f18 = -f16;
                        } else {
                            f18 = f16;
                        }
                        f40 = f13 + f18;
                    } else {
                        if (i14 == 2) {
                            f17 = -f34;
                        } else {
                            f17 = f34;
                        }
                        f40 = f13 + f17;
                    }
                    i18 = i10 + 1;
                    f = f16;
                    length = i19;
                    f12 = f14;
                    fVarArr = fVarArr2;
                    i12 = i6;
                    i17 = i20;
                    arrayList3 = arrayList;
                    f10 = f15;
                    arrayList5 = arrayList2;
                }
            } else {
                i6 = i12;
            }
            int i202 = i17;
            str = fVar3.f29220a;
            if (str != null) {
            }
            if (!z10) {
            }
            if (z11) {
            }
            i18 = i10 + 1;
            f = f16;
            length = i19;
            f12 = f14;
            fVarArr = fVarArr2;
            i12 = i6;
            i17 = i202;
            arrayList3 = arrayList;
            f10 = f15;
            arrayList5 = arrayList2;
        }
    }
}
