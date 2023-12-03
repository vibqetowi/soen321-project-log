package r8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p8.a;
import p8.e;
import p8.f;
import q8.d;
import r8.b;
import u7.x;
/* compiled from: DvbDecoder.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: m  reason: collision with root package name */
    public final b f30558m;

    public a(List<byte[]> list) {
        byte[] bArr = list.get(0);
        int length = bArr.length;
        this.f30558m = new b(((bArr[0] & 255) << 8) | (bArr[1] & 255), (bArr[3] & 255) | ((bArr[2] & 255) << 8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0250, code lost:
        if ((r4.f30573b + 1) == r2.f30567g.getHeight()) goto L91;
     */
    @Override // p8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f h(byte[] bArr, int i6, boolean z10) {
        d dVar;
        b.h hVar;
        int i10;
        List unmodifiableList;
        d dVar2;
        int i11;
        b.C0518b c0518b;
        ArrayList arrayList;
        int i12;
        b.h hVar2;
        Paint paint;
        int[] iArr;
        b.f fVar;
        int i13;
        int i14;
        int i15;
        int i16;
        b bVar = this.f30558m;
        if (z10) {
            b.h hVar3 = bVar.f;
            hVar3.f30599c.clear();
            hVar3.f30600d.clear();
            hVar3.f30601e.clear();
            hVar3.f.clear();
            hVar3.f30602g.clear();
            hVar3.f30603h = null;
            hVar3.f30604i = null;
        }
        bVar.getClass();
        x xVar = new x(bArr, i6);
        while (true) {
            int b10 = xVar.b();
            int i17 = 2;
            int i18 = 1;
            hVar = bVar.f;
            if (b10 >= 48 && xVar.i(8) == 15) {
                int i19 = xVar.i(8);
                int i20 = 16;
                int i21 = xVar.i(16);
                int i22 = xVar.i(16);
                int f = xVar.f() + i22;
                if (i22 * 8 > xVar.b()) {
                    Log.w("DvbParser", "Data field length exceeds limit");
                    xVar.r(xVar.b());
                } else {
                    switch (i19) {
                        case 16:
                            if (i21 == hVar.f30597a) {
                                b.d dVar3 = hVar.f30604i;
                                int i23 = 8;
                                xVar.i(8);
                                int i24 = xVar.i(4);
                                int i25 = xVar.i(2);
                                xVar.r(2);
                                int i26 = i22 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i26 > 0) {
                                    int i27 = xVar.i(i23);
                                    xVar.r(i23);
                                    i26 -= 6;
                                    sparseArray.put(i27, new b.e(xVar.i(16), xVar.i(16)));
                                    i23 = 8;
                                }
                                b.d dVar4 = new b.d(i24, i25, sparseArray);
                                if (i25 != 0) {
                                    hVar.f30604i = dVar4;
                                    hVar.f30599c.clear();
                                    hVar.f30600d.clear();
                                    hVar.f30601e.clear();
                                    break;
                                } else if (dVar3 != null && dVar3.f30581a != i24) {
                                    hVar.f30604i = dVar4;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            b.d dVar5 = hVar.f30604i;
                            if (i21 == hVar.f30597a && dVar5 != null) {
                                int i28 = xVar.i(8);
                                xVar.r(4);
                                boolean h10 = xVar.h();
                                xVar.r(3);
                                int i29 = xVar.i(16);
                                int i30 = xVar.i(16);
                                xVar.i(3);
                                int i31 = xVar.i(3);
                                xVar.r(2);
                                int i32 = xVar.i(8);
                                int i33 = xVar.i(8);
                                int i34 = xVar.i(4);
                                int i35 = xVar.i(2);
                                xVar.r(2);
                                int i36 = i22 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i36 > 0) {
                                    int i37 = xVar.i(i20);
                                    int i38 = xVar.i(i17);
                                    xVar.i(i17);
                                    int i39 = xVar.i(12);
                                    xVar.r(4);
                                    int i40 = xVar.i(12);
                                    i36 -= 6;
                                    if (i38 == i18 || i38 == 2) {
                                        xVar.i(8);
                                        xVar.i(8);
                                        i36 -= 2;
                                    }
                                    sparseArray2.put(i37, new b.g(i39, i40));
                                    i17 = 2;
                                    i18 = 1;
                                    i20 = 16;
                                }
                                b.f fVar2 = new b.f(i28, h10, i29, i30, i31, i32, i33, i34, i35, sparseArray2);
                                SparseArray<b.f> sparseArray3 = hVar.f30599c;
                                if (dVar5.f30582b == 0 && (fVar = sparseArray3.get(i28)) != null) {
                                    int i41 = 0;
                                    while (true) {
                                        SparseArray<b.g> sparseArray4 = fVar.f30594j;
                                        if (i41 < sparseArray4.size()) {
                                            fVar2.f30594j.put(sparseArray4.keyAt(i41), sparseArray4.valueAt(i41));
                                            i41++;
                                        }
                                    }
                                }
                                sparseArray3.put(fVar2.f30586a, fVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (i21 == hVar.f30597a) {
                                b.a e10 = b.e(i22, xVar);
                                hVar.f30600d.put(e10.f30568a, e10);
                                break;
                            } else if (i21 == hVar.f30598b) {
                                b.a e11 = b.e(i22, xVar);
                                hVar.f.put(e11.f30568a, e11);
                                break;
                            }
                            break;
                        case 19:
                            if (i21 == hVar.f30597a) {
                                b.c f2 = b.f(xVar);
                                hVar.f30601e.put(f2.f30577a, f2);
                                break;
                            } else if (i21 == hVar.f30598b) {
                                b.c f10 = b.f(xVar);
                                hVar.f30602g.put(f10.f30577a, f10);
                                break;
                            }
                            break;
                        case 20:
                            if (i21 == hVar.f30597a) {
                                xVar.r(4);
                                boolean h11 = xVar.h();
                                xVar.r(3);
                                int i42 = xVar.i(16);
                                int i43 = xVar.i(16);
                                if (h11) {
                                    int i44 = xVar.i(16);
                                    i13 = xVar.i(16);
                                    i16 = xVar.i(16);
                                    i14 = xVar.i(16);
                                    i15 = i44;
                                } else {
                                    i13 = i42;
                                    i14 = i43;
                                    i15 = 0;
                                    i16 = 0;
                                }
                                hVar.f30603h = new b.C0518b(i42, i43, i15, i13, i16, i14);
                                break;
                            }
                            break;
                    }
                    xVar.s(f - xVar.f());
                }
            }
        }
        b.d dVar6 = hVar.f30604i;
        if (dVar6 == null) {
            unmodifiableList = Collections.emptyList();
            dVar2 = dVar;
        } else {
            b.C0518b c0518b2 = hVar.f30603h;
            if (c0518b2 == null) {
                c0518b2 = bVar.f30565d;
            }
            Bitmap bitmap = bVar.f30567g;
            Canvas canvas = bVar.f30564c;
            if (bitmap != null) {
                i10 = 1;
                if (c0518b2.f30572a + 1 == bitmap.getWidth()) {
                }
            } else {
                i10 = 1;
            }
            Bitmap createBitmap = Bitmap.createBitmap(c0518b2.f30572a + i10, c0518b2.f30573b + i10, Bitmap.Config.ARGB_8888);
            bVar.f30567g = createBitmap;
            canvas.setBitmap(createBitmap);
            ArrayList arrayList2 = new ArrayList();
            int i45 = 0;
            while (true) {
                SparseArray<b.e> sparseArray5 = dVar6.f30583c;
                if (i45 < sparseArray5.size()) {
                    canvas.save();
                    b.e valueAt = sparseArray5.valueAt(i45);
                    b.f fVar3 = hVar.f30599c.get(sparseArray5.keyAt(i45));
                    int i46 = valueAt.f30584a + c0518b2.f30574c;
                    int i47 = valueAt.f30585b + c0518b2.f30576e;
                    int min = Math.min(fVar3.f30588c + i46, c0518b2.f30575d);
                    int i48 = fVar3.f30589d;
                    int i49 = i47 + i48;
                    canvas.clipRect(i46, i47, min, Math.min(i49, c0518b2.f));
                    SparseArray<b.a> sparseArray6 = hVar.f30600d;
                    int i50 = fVar3.f;
                    b.a aVar = sparseArray6.get(i50);
                    if (aVar == null && (aVar = hVar.f.get(i50)) == null) {
                        aVar = bVar.f30566e;
                    }
                    b.d dVar7 = dVar6;
                    int i51 = 0;
                    while (true) {
                        SparseArray<b.g> sparseArray7 = fVar3.f30594j;
                        if (i51 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i51);
                            b.g valueAt2 = sparseArray7.valueAt(i51);
                            d dVar8 = dVar;
                            b.c cVar = hVar.f30601e.get(keyAt);
                            if (cVar == null) {
                                cVar = hVar.f30602g.get(keyAt);
                            }
                            if (cVar != null) {
                                if (cVar.f30578b) {
                                    hVar2 = hVar;
                                    paint = null;
                                } else {
                                    paint = bVar.f30562a;
                                    hVar2 = hVar;
                                }
                                int i52 = fVar3.f30590e;
                                i12 = i45;
                                int i53 = valueAt2.f30595a + i46;
                                int i54 = valueAt2.f30596b + i47;
                                arrayList = arrayList2;
                                if (i52 == 3) {
                                    iArr = aVar.f30571d;
                                } else if (i52 == 2) {
                                    iArr = aVar.f30570c;
                                } else {
                                    iArr = aVar.f30569b;
                                }
                                c0518b = c0518b2;
                                int[] iArr2 = iArr;
                                Paint paint2 = paint;
                                b.d(cVar.f30579c, iArr2, i52, i53, i54, paint2, canvas);
                                b.d(cVar.f30580d, iArr2, i52, i53, i54 + 1, paint2, canvas);
                            } else {
                                c0518b = c0518b2;
                                arrayList = arrayList2;
                                i12 = i45;
                                hVar2 = hVar;
                            }
                            i51++;
                            dVar = dVar8;
                            hVar = hVar2;
                            i45 = i12;
                            arrayList2 = arrayList;
                            c0518b2 = c0518b;
                        } else {
                            d dVar9 = dVar;
                            b.C0518b c0518b3 = c0518b2;
                            ArrayList arrayList3 = arrayList2;
                            int i55 = i45;
                            b.h hVar4 = hVar;
                            boolean z11 = fVar3.f30587b;
                            int i56 = fVar3.f30588c;
                            if (z11) {
                                int i57 = fVar3.f30590e;
                                if (i57 == 3) {
                                    i11 = aVar.f30571d[fVar3.f30591g];
                                } else if (i57 == 2) {
                                    i11 = aVar.f30570c[fVar3.f30592h];
                                } else {
                                    i11 = aVar.f30569b[fVar3.f30593i];
                                }
                                Paint paint3 = bVar.f30563b;
                                paint3.setColor(i11);
                                canvas.drawRect(i46, i47, i46 + i56, i49, paint3);
                            }
                            a.C0467a c0467a = new a.C0467a();
                            c0467a.f27990b = Bitmap.createBitmap(bVar.f30567g, i46, i47, i56, i48);
                            float f11 = c0518b3.f30572a;
                            c0467a.f27995h = i46 / f11;
                            c0467a.f27996i = 0;
                            float f12 = i47;
                            float f13 = c0518b3.f30573b;
                            c0467a.f27993e = f12 / f13;
                            c0467a.f = 0;
                            c0467a.f27994g = 0;
                            c0467a.f27999l = i56 / f11;
                            c0467a.f28000m = i48 / f13;
                            arrayList3.add(c0467a.a());
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            i45 = i55 + 1;
                            dVar = dVar9;
                            arrayList2 = arrayList3;
                            c0518b2 = c0518b3;
                            dVar6 = dVar7;
                            hVar = hVar4;
                        }
                    }
                } else {
                    unmodifiableList = Collections.unmodifiableList(arrayList2);
                    dVar2 = dVar;
                }
            }
        }
        return new d(1, unmodifiableList);
    }
}
