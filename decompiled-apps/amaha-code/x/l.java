package x;

import x.d;
/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public final class l extends m {
    @Override // x.m
    public final void V(int i6, int i10, int i11, int i12) {
        int i13 = this.C0 + this.D0;
        boolean z10 = false;
        int i14 = i13 + 0;
        int i15 = this.f37441y0 + this.f37442z0 + 0;
        if (this.f37439x0 > 0) {
            i14 += this.f37438w0[0].u();
            i15 += this.f37438w0[0].o();
        }
        int max = Math.max(this.e0, i14);
        int max2 = Math.max(this.f37368f0, i15);
        if (i6 != 1073741824) {
            if (i6 == Integer.MIN_VALUE) {
                i10 = Math.min(max, i10);
            } else if (i6 == 0) {
                i10 = max;
            } else {
                i10 = 0;
            }
        }
        if (i11 != 1073741824) {
            if (i11 == Integer.MIN_VALUE) {
                i12 = Math.min(max2, i12);
            } else if (i11 == 0) {
                i12 = max2;
            } else {
                i12 = 0;
            }
        }
        this.F0 = i10;
        this.G0 = i12;
        R(i10);
        O(i12);
        if (this.f37439x0 > 0) {
            z10 = true;
        }
        this.E0 = z10;
    }

    @Override // x.e
    public final void e(v.d dVar, boolean z10) {
        super.e(dVar, z10);
        if (this.f37439x0 > 0) {
            e eVar = this.f37438w0[0];
            eVar.H();
            eVar.f37372h0 = 0.5f;
            eVar.f37370g0 = 0.5f;
            d.a aVar = d.a.LEFT;
            eVar.h(aVar, this, aVar, 0);
            d.a aVar2 = d.a.RIGHT;
            eVar.h(aVar2, this, aVar2, 0);
            d.a aVar3 = d.a.TOP;
            eVar.h(aVar3, this, aVar3, 0);
            d.a aVar4 = d.a.BOTTOM;
            eVar.h(aVar4, this, aVar4, 0);
        }
    }
}
