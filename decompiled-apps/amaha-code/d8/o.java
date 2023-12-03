package d8;

import android.util.Log;
import com.google.android.exoplayer2.n;
import d8.d0;
/* compiled from: Id3Reader.java */
/* loaded from: classes.dex */
public final class o implements j {

    /* renamed from: b  reason: collision with root package name */
    public u7.v f12518b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12519c;

    /* renamed from: e  reason: collision with root package name */
    public int f12521e;
    public int f;

    /* renamed from: a  reason: collision with root package name */
    public final c9.q f12517a = new c9.q(10);

    /* renamed from: d  reason: collision with root package name */
    public long f12520d = -9223372036854775807L;

    @Override // d8.j
    public final void a(c9.q qVar) {
        sc.b.E(this.f12518b);
        if (!this.f12519c) {
            return;
        }
        int i6 = qVar.f5188c - qVar.f5187b;
        int i10 = this.f;
        if (i10 < 10) {
            int min = Math.min(i6, 10 - i10);
            byte[] bArr = qVar.f5186a;
            int i11 = qVar.f5187b;
            c9.q qVar2 = this.f12517a;
            System.arraycopy(bArr, i11, qVar2.f5186a, this.f, min);
            if (this.f + min == 10) {
                qVar2.A(0);
                if (73 == qVar2.q() && 68 == qVar2.q() && 51 == qVar2.q()) {
                    qVar2.B(3);
                    this.f12521e = qVar2.p() + 10;
                } else {
                    Log.w("Id3Reader", "Discarding invalid ID3 tag");
                    this.f12519c = false;
                    return;
                }
            }
        }
        int min2 = Math.min(i6, this.f12521e - this.f);
        this.f12518b.a(min2, qVar);
        this.f += min2;
    }

    @Override // d8.j
    public final void c() {
        this.f12519c = false;
        this.f12520d = -9223372036854775807L;
    }

    @Override // d8.j
    public final void d(u7.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        u7.v n10 = jVar.n(dVar.f12351d, 5);
        this.f12518b = n10;
        n.a aVar = new n.a();
        dVar.b();
        aVar.f6656a = dVar.f12352e;
        aVar.f6665k = "application/id3";
        n10.e(new com.google.android.exoplayer2.n(aVar));
    }

    @Override // d8.j
    public final void e() {
        int i6;
        sc.b.E(this.f12518b);
        if (this.f12519c && (i6 = this.f12521e) != 0 && this.f == i6) {
            long j10 = this.f12520d;
            if (j10 != -9223372036854775807L) {
                this.f12518b.d(j10, 1, i6, 0, null);
            }
            this.f12519c = false;
        }
    }

    @Override // d8.j
    public final void f(int i6, long j10) {
        if ((i6 & 4) == 0) {
            return;
        }
        this.f12519c = true;
        if (j10 != -9223372036854775807L) {
            this.f12520d = j10;
        }
        this.f12521e = 0;
        this.f = 0;
    }
}
