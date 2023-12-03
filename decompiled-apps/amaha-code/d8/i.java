package d8;

import com.google.android.exoplayer2.n;
import d8.d0;
import java.util.Collections;
import java.util.List;
/* compiled from: DvbSubtitleReader.java */
/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    public final List<d0.a> f12398a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.v[] f12399b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12400c;

    /* renamed from: d  reason: collision with root package name */
    public int f12401d;

    /* renamed from: e  reason: collision with root package name */
    public int f12402e;
    public long f = -9223372036854775807L;

    public i(List<d0.a> list) {
        this.f12398a = list;
        this.f12399b = new u7.v[list.size()];
    }

    @Override // d8.j
    public final void a(c9.q qVar) {
        u7.v[] vVarArr;
        boolean z10;
        boolean z11;
        if (this.f12400c) {
            if (this.f12401d == 2) {
                if (qVar.f5188c - qVar.f5187b == 0) {
                    z11 = false;
                } else {
                    if (qVar.q() != 32) {
                        this.f12400c = false;
                    }
                    this.f12401d--;
                    z11 = this.f12400c;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f12401d == 1) {
                if (qVar.f5188c - qVar.f5187b == 0) {
                    z10 = false;
                } else {
                    if (qVar.q() != 0) {
                        this.f12400c = false;
                    }
                    this.f12401d--;
                    z10 = this.f12400c;
                }
                if (!z10) {
                    return;
                }
            }
            int i6 = qVar.f5187b;
            int i10 = qVar.f5188c - i6;
            for (u7.v vVar : this.f12399b) {
                qVar.A(i6);
                vVar.a(i10, qVar);
            }
            this.f12402e += i10;
        }
    }

    @Override // d8.j
    public final void c() {
        this.f12400c = false;
        this.f = -9223372036854775807L;
    }

    @Override // d8.j
    public final void d(u7.j jVar, d0.d dVar) {
        int i6 = 0;
        while (true) {
            u7.v[] vVarArr = this.f12399b;
            if (i6 < vVarArr.length) {
                d0.a aVar = this.f12398a.get(i6);
                dVar.a();
                dVar.b();
                u7.v n10 = jVar.n(dVar.f12351d, 3);
                n.a aVar2 = new n.a();
                dVar.b();
                aVar2.f6656a = dVar.f12352e;
                aVar2.f6665k = "application/dvbsubs";
                aVar2.f6667m = Collections.singletonList(aVar.f12344b);
                aVar2.f6658c = aVar.f12343a;
                n10.e(new com.google.android.exoplayer2.n(aVar2));
                vVarArr[i6] = n10;
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // d8.j
    public final void e() {
        if (this.f12400c) {
            if (this.f != -9223372036854775807L) {
                for (u7.v vVar : this.f12399b) {
                    vVar.d(this.f, 1, this.f12402e, 0, null);
                }
            }
            this.f12400c = false;
        }
    }

    @Override // d8.j
    public final void f(int i6, long j10) {
        if ((i6 & 4) == 0) {
            return;
        }
        this.f12400c = true;
        if (j10 != -9223372036854775807L) {
            this.f = j10;
        }
        this.f12402e = 0;
        this.f12401d = 2;
    }
}
