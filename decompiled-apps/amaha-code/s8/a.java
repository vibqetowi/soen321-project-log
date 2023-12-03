package s8;

import android.graphics.Bitmap;
import c9.q;
import c9.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p8.a;
import p8.e;
import p8.f;
import q8.d;
/* compiled from: PgsDecoder.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: m  reason: collision with root package name */
    public final q f31306m = new q();

    /* renamed from: n  reason: collision with root package name */
    public final q f31307n = new q();

    /* renamed from: o  reason: collision with root package name */
    public final C0533a f31308o = new C0533a();

    /* renamed from: p  reason: collision with root package name */
    public Inflater f31309p;

    /* compiled from: PgsDecoder.java */
    /* renamed from: s8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0533a {

        /* renamed from: a  reason: collision with root package name */
        public final q f31310a = new q();

        /* renamed from: b  reason: collision with root package name */
        public final int[] f31311b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        public boolean f31312c;

        /* renamed from: d  reason: collision with root package name */
        public int f31313d;

        /* renamed from: e  reason: collision with root package name */
        public int f31314e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f31315g;

        /* renamed from: h  reason: collision with root package name */
        public int f31316h;

        /* renamed from: i  reason: collision with root package name */
        public int f31317i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p8.e
    public final f h(byte[] bArr, int i6, boolean z10) {
        ArrayList arrayList;
        p8.a aVar;
        int i10;
        int i11;
        int q10;
        int i12;
        int s10;
        q qVar = this.f31306m;
        qVar.y(bArr, i6);
        int i13 = qVar.f5188c;
        int i14 = qVar.f5187b;
        if (i13 - i14 > 0 && (qVar.f5186a[i14] & 255) == 120) {
            if (this.f31309p == null) {
                this.f31309p = new Inflater();
            }
            Inflater inflater = this.f31309p;
            q qVar2 = this.f31307n;
            if (w.v(qVar, qVar2, inflater)) {
                qVar.y(qVar2.f5186a, qVar2.f5188c);
            }
        }
        C0533a c0533a = this.f31308o;
        int i15 = 0;
        c0533a.f31313d = 0;
        c0533a.f31314e = 0;
        c0533a.f = 0;
        c0533a.f31315g = 0;
        c0533a.f31316h = 0;
        c0533a.f31317i = 0;
        c0533a.f31310a.x(0);
        c0533a.f31312c = false;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            int i16 = qVar.f5188c;
            if (i16 - qVar.f5187b >= 3) {
                int q11 = qVar.q();
                int v10 = qVar.v();
                int i17 = qVar.f5187b + v10;
                if (i17 > i16) {
                    qVar.A(i16);
                    arrayList = arrayList2;
                    aVar = null;
                } else {
                    int[] iArr = c0533a.f31311b;
                    q qVar3 = c0533a.f31310a;
                    if (q11 != 128) {
                        boolean z11 = true;
                        switch (q11) {
                            case 20:
                                if (v10 % 5 == 2) {
                                    qVar.B(2);
                                    Arrays.fill(iArr, i15);
                                    int i18 = v10 / 5;
                                    int i19 = 0;
                                    while (i19 < i18) {
                                        int q12 = qVar.q();
                                        int[] iArr2 = iArr;
                                        double q13 = qVar.q();
                                        double q14 = qVar.q() - 128;
                                        double q15 = qVar.q() - 128;
                                        iArr2[q12] = (w.h((int) ((1.402d * q14) + q13), 0, 255) << 16) | (qVar.q() << 24) | (w.h((int) ((q13 - (0.34414d * q15)) - (q14 * 0.71414d)), 0, 255) << 8) | w.h((int) ((q15 * 1.772d) + q13), 0, 255);
                                        i19++;
                                        iArr = iArr2;
                                        arrayList2 = arrayList2;
                                    }
                                    arrayList = arrayList2;
                                    c0533a.f31312c = true;
                                    break;
                                }
                                arrayList = arrayList2;
                                break;
                            case 21:
                                if (v10 >= 4) {
                                    qVar.B(3);
                                    if ((128 & qVar.q()) == 0) {
                                        z11 = false;
                                    }
                                    int i20 = v10 - 4;
                                    if (z11) {
                                        if (i20 >= 7 && (s10 = qVar.s()) >= 4) {
                                            c0533a.f31316h = qVar.v();
                                            c0533a.f31317i = qVar.v();
                                            qVar3.x(s10 - 4);
                                            i20 -= 7;
                                        }
                                    }
                                    int i21 = qVar3.f5187b;
                                    int i22 = qVar3.f5188c;
                                    if (i21 < i22 && i20 > 0) {
                                        int min = Math.min(i20, i22 - i21);
                                        qVar.b(i21, qVar3.f5186a, min);
                                        qVar3.A(i21 + min);
                                    }
                                }
                                arrayList = arrayList2;
                                break;
                            case 22:
                                if (v10 >= 19) {
                                    c0533a.f31313d = qVar.v();
                                    c0533a.f31314e = qVar.v();
                                    qVar.B(11);
                                    c0533a.f = qVar.v();
                                    c0533a.f31315g = qVar.v();
                                }
                                arrayList = arrayList2;
                                break;
                            default:
                                arrayList = arrayList2;
                                break;
                        }
                        i15 = 0;
                        aVar = null;
                    } else {
                        arrayList = arrayList2;
                        if (c0533a.f31313d != 0 && c0533a.f31314e != 0 && c0533a.f31316h != 0 && c0533a.f31317i != 0 && (i10 = qVar3.f5188c) != 0 && qVar3.f5187b == i10 && c0533a.f31312c) {
                            qVar3.A(0);
                            int i23 = c0533a.f31316h * c0533a.f31317i;
                            int[] iArr3 = new int[i23];
                            int i24 = 0;
                            while (i24 < i23) {
                                int q16 = qVar3.q();
                                if (q16 != 0) {
                                    i11 = i24 + 1;
                                    iArr3[i24] = iArr[q16];
                                } else {
                                    int q17 = qVar3.q();
                                    if (q17 != 0) {
                                        if ((q17 & 64) == 0) {
                                            q10 = q17 & 63;
                                        } else {
                                            q10 = ((q17 & 63) << 8) | qVar3.q();
                                        }
                                        if ((q17 & 128) == 0) {
                                            i12 = 0;
                                        } else {
                                            i12 = iArr[qVar3.q()];
                                        }
                                        i11 = q10 + i24;
                                        Arrays.fill(iArr3, i24, i11, i12);
                                    }
                                }
                                i24 = i11;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(iArr3, c0533a.f31316h, c0533a.f31317i, Bitmap.Config.ARGB_8888);
                            a.C0467a c0467a = new a.C0467a();
                            c0467a.f27990b = createBitmap;
                            float f = c0533a.f31313d;
                            c0467a.f27995h = c0533a.f / f;
                            c0467a.f27996i = 0;
                            float f2 = c0533a.f31314e;
                            c0467a.f27993e = c0533a.f31315g / f2;
                            c0467a.f = 0;
                            c0467a.f27994g = 0;
                            c0467a.f27999l = c0533a.f31316h / f;
                            c0467a.f28000m = c0533a.f31317i / f2;
                            aVar = c0467a.a();
                        } else {
                            aVar = null;
                        }
                        i15 = 0;
                        c0533a.f31313d = 0;
                        c0533a.f31314e = 0;
                        c0533a.f = 0;
                        c0533a.f31315g = 0;
                        c0533a.f31316h = 0;
                        c0533a.f31317i = 0;
                        qVar3.x(0);
                        c0533a.f31312c = false;
                    }
                    qVar.A(i17);
                }
                ArrayList arrayList3 = arrayList;
                if (aVar != null) {
                    arrayList3.add(aVar);
                }
                arrayList2 = arrayList3;
            } else {
                return new d(2, Collections.unmodifiableList(arrayList2));
            }
        }
    }
}
