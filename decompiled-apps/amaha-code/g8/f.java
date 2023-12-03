package g8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.widget.l;
import androidx.work.k;
import c9.w;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.n;
import g8.a;
import g8.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* compiled from: MetadataRenderer.java */
/* loaded from: classes.dex */
public final class f extends com.google.android.exoplayer2.e implements Handler.Callback {
    public final c F;
    public final e G;
    public final Handler H;
    public final d I;
    public b J;
    public boolean K;
    public boolean L;
    public long M;
    public long N;
    public a O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a0.a aVar, Looper looper) {
        super(5);
        Handler handler;
        c.a aVar2 = c.f16379a;
        this.G = aVar;
        if (looper == null) {
            handler = null;
        } else {
            int i6 = w.f5205a;
            handler = new Handler(looper, this);
        }
        this.H = handler;
        this.F = aVar2;
        this.I = new d();
        this.N = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.e
    public final void A(boolean z10, long j10) {
        this.O = null;
        this.N = -9223372036854775807L;
        this.K = false;
        this.L = false;
    }

    @Override // com.google.android.exoplayer2.e
    public final void E(n[] nVarArr, long j10, long j11) {
        this.J = this.F.b(nVarArr[0]);
    }

    public final void G(a aVar, ArrayList arrayList) {
        int i6 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f16378u;
            if (i6 < bVarArr.length) {
                n C = bVarArr[i6].C();
                if (C != null) {
                    c cVar = this.F;
                    if (cVar.a(C)) {
                        k b10 = cVar.b(C);
                        byte[] c0 = bVarArr[i6].c0();
                        c0.getClass();
                        d dVar = this.I;
                        dVar.n();
                        dVar.r(c0.length);
                        ByteBuffer byteBuffer = dVar.f6360w;
                        int i10 = w.f5205a;
                        byteBuffer.put(c0);
                        dVar.t();
                        a a10 = b10.a(dVar);
                        if (a10 != null) {
                            G(a10, arrayList);
                        }
                        i6++;
                    }
                }
                arrayList.add(bVarArr[i6]);
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // o7.u
    public final int a(n nVar) {
        int i6;
        if (!this.F.a(nVar)) {
            return 0;
        }
        if (nVar.Y == 0) {
            i6 = 4;
        } else {
            i6 = 2;
        }
        return i6 | 0 | 0;
    }

    @Override // com.google.android.exoplayer2.z
    public final boolean b() {
        return this.L;
    }

    @Override // com.google.android.exoplayer2.z, o7.u
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.G.a((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.z
    public final boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.z
    public final void n(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.K && this.O == null) {
                d dVar = this.I;
                dVar.n();
                l lVar = this.f6459v;
                lVar.i();
                int F = F(lVar, dVar, 0);
                if (F == -4) {
                    if (dVar.k(4)) {
                        this.K = true;
                    } else {
                        dVar.C = this.M;
                        dVar.t();
                        b bVar = this.J;
                        int i6 = w.f5205a;
                        a a10 = bVar.a(dVar);
                        if (a10 != null) {
                            ArrayList arrayList = new ArrayList(a10.f16378u.length);
                            G(a10, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.O = new a(arrayList);
                                this.N = dVar.f6362y;
                            }
                        }
                    }
                } else if (F == -5) {
                    n nVar = (n) lVar.f1472w;
                    nVar.getClass();
                    this.M = nVar.J;
                }
            }
            a aVar = this.O;
            if (aVar != null && this.N <= j10) {
                Handler handler = this.H;
                if (handler != null) {
                    handler.obtainMessage(0, aVar).sendToTarget();
                } else {
                    this.G.a(aVar);
                }
                this.O = null;
                this.N = -9223372036854775807L;
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.K && this.O == null) {
                this.L = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void y() {
        this.O = null;
        this.N = -9223372036854775807L;
        this.J = null;
    }
}
