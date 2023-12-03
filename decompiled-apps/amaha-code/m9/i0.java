package m9;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import m9.d;
import m9.g;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class i0 extends g.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f24994a;

    public i0(d dVar) {
        this.f24994a = dVar;
    }

    @Override // m9.g.a
    public final void a() {
        d dVar = this.f24994a;
        long d10 = dVar.d();
        if (d10 != dVar.f24953b) {
            dVar.f24953b = d10;
            dVar.a();
            if (dVar.f24953b != 0) {
                dVar.b();
            }
        }
    }

    @Override // m9.g.a
    public final void b(int[] iArr) {
        ArrayList g5 = p9.a.g(iArr);
        d dVar = this.f24994a;
        if (dVar.f24955d.equals(g5)) {
            return;
        }
        dVar.e();
        dVar.f.evictAll();
        dVar.f24957g.clear();
        dVar.f24955d = g5;
        d.c(dVar);
        Iterator it = dVar.f24963m.iterator();
        while (it.hasNext()) {
            ((d.a) it.next()).getClass();
        }
        dVar.f();
    }

    @Override // m9.g.a
    public final void c(int[] iArr, int i6) {
        int i10;
        d dVar = this.f24994a;
        if (i6 == 0) {
            i10 = dVar.f24955d.size();
        } else {
            i10 = dVar.f24956e.get(i6, -1);
            if (i10 == -1) {
                dVar.b();
                return;
            }
        }
        dVar.e();
        dVar.f24955d.addAll(i10, p9.a.g(iArr));
        d.c(dVar);
        Iterator it = dVar.f24963m.iterator();
        while (it.hasNext()) {
            ((d.a) it.next()).getClass();
        }
        dVar.f();
    }

    @Override // m9.g.a
    public final void d(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i6 = 0;
        while (true) {
            d dVar = this.f24994a;
            if (i6 < length) {
                int i10 = iArr[i6];
                dVar.f.remove(Integer.valueOf(i10));
                int i11 = dVar.f24956e.get(i10, -1);
                if (i11 == -1) {
                    dVar.b();
                    return;
                } else {
                    arrayList.add(Integer.valueOf(i11));
                    i6++;
                }
            } else {
                Collections.sort(arrayList);
                dVar.e();
                p9.a.f(arrayList);
                Iterator it = dVar.f24963m.iterator();
                while (it.hasNext()) {
                    ((d.a) it.next()).getClass();
                }
                dVar.f();
                return;
            }
        }
    }

    @Override // m9.g.a
    public final void e(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i6 = 0;
        while (true) {
            d dVar = this.f24994a;
            if (i6 < length) {
                int i10 = iArr[i6];
                dVar.f.remove(Integer.valueOf(i10));
                SparseIntArray sparseIntArray = dVar.f24956e;
                int i11 = sparseIntArray.get(i10, -1);
                if (i11 == -1) {
                    dVar.b();
                    return;
                }
                sparseIntArray.delete(i10);
                arrayList.add(Integer.valueOf(i11));
                i6++;
            } else if (arrayList.isEmpty()) {
                return;
            } else {
                Collections.sort(arrayList);
                dVar.e();
                dVar.f24955d.removeAll(p9.a.g(iArr));
                d.c(dVar);
                p9.a.f(arrayList);
                Iterator it = dVar.f24963m.iterator();
                while (it.hasNext()) {
                    ((d.a) it.next()).getClass();
                }
                dVar.f();
                return;
            }
        }
    }

    @Override // m9.g.a
    public final void f(k9.l[] lVarArr) {
        HashSet hashSet = new HashSet();
        d dVar = this.f24994a;
        dVar.f24957g.clear();
        int length = lVarArr.length;
        int i6 = 0;
        while (true) {
            SparseIntArray sparseIntArray = dVar.f24956e;
            if (i6 < length) {
                k9.l lVar = lVarArr[i6];
                int i10 = lVar.f23160v;
                dVar.f.put(Integer.valueOf(i10), lVar);
                int i11 = sparseIntArray.get(i10, -1);
                if (i11 == -1) {
                    dVar.b();
                    return;
                } else {
                    hashSet.add(Integer.valueOf(i11));
                    i6++;
                }
            } else {
                ArrayList arrayList = dVar.f24957g;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i12 = sparseIntArray.get(((Integer) it.next()).intValue(), -1);
                    if (i12 != -1) {
                        hashSet.add(Integer.valueOf(i12));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                dVar.e();
                p9.a.f(arrayList2);
                Iterator it2 = dVar.f24963m.iterator();
                while (it2.hasNext()) {
                    ((d.a) it2.next()).getClass();
                }
                dVar.f();
                return;
            }
        }
    }
}
