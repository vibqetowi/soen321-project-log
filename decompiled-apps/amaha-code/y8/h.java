package y8;

import c9.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: WebvttSubtitle.java */
/* loaded from: classes.dex */
public final class h implements p8.f {

    /* renamed from: u  reason: collision with root package name */
    public final List<d> f38385u;

    /* renamed from: v  reason: collision with root package name */
    public final long[] f38386v;

    /* renamed from: w  reason: collision with root package name */
    public final long[] f38387w;

    public h(ArrayList arrayList) {
        this.f38385u = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f38386v = new long[arrayList.size() * 2];
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            d dVar = (d) arrayList.get(i6);
            int i10 = i6 * 2;
            long[] jArr = this.f38386v;
            jArr[i10] = dVar.f38358b;
            jArr[i10 + 1] = dVar.f38359c;
        }
        long[] jArr2 = this.f38386v;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f38387w = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // p8.f
    public final int d(long j10) {
        long[] jArr = this.f38387w;
        int b10 = w.b(jArr, j10, false);
        if (b10 >= jArr.length) {
            return -1;
        }
        return b10;
    }

    @Override // p8.f
    public final long f(int i6) {
        boolean z10;
        boolean z11 = true;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        long[] jArr = this.f38387w;
        if (i6 >= jArr.length) {
            z11 = false;
        }
        sc.b.q(z11);
        return jArr[i6];
    }

    @Override // p8.f
    public final List<p8.a> h(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i6 = 0;
        while (true) {
            List<d> list = this.f38385u;
            if (i6 >= list.size()) {
                break;
            }
            int i10 = i6 * 2;
            long[] jArr = this.f38386v;
            if (jArr[i10] <= j10 && j10 < jArr[i10 + 1]) {
                d dVar = list.get(i6);
                p8.a aVar = dVar.f38357a;
                if (aVar.f27987y == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
            i6++;
        }
        Collections.sort(arrayList2, new p0.d(8));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            p8.a aVar2 = ((d) arrayList2.get(i11)).f38357a;
            aVar2.getClass();
            arrayList.add(new p8.a(aVar2.f27983u, aVar2.f27984v, aVar2.f27985w, aVar2.f27986x, (-1) - i11, 1, aVar2.A, aVar2.B, aVar2.C, aVar2.H, aVar2.I, aVar2.D, aVar2.E, aVar2.F, aVar2.G, aVar2.J, aVar2.K));
        }
        return arrayList;
    }

    @Override // p8.f
    public final int i() {
        return this.f38387w.length;
    }
}
