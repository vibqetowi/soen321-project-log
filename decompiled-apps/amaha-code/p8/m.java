package p8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c9.w;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;
import p8.h;
/* compiled from: TextRenderer.java */
/* loaded from: classes.dex */
public final class m extends com.google.android.exoplayer2.e implements Handler.Callback {
    public final Handler F;
    public final l G;
    public final h H;
    public final androidx.appcompat.widget.l I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public n N;
    public g O;
    public j P;
    public k Q;
    public k R;
    public int S;
    public long T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a0.a aVar, Looper looper) {
        super(3);
        Handler handler;
        h.a aVar2 = h.f28014a;
        this.G = aVar;
        if (looper == null) {
            handler = null;
        } else {
            int i6 = w.f5205a;
            handler = new Handler(looper, this);
        }
        this.F = handler;
        this.H = aVar2;
        this.I = new androidx.appcompat.widget.l(12, 0);
        this.T = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.e
    public final void A(boolean z10, long j10) {
        List<a> emptyList = Collections.emptyList();
        Handler handler = this.F;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.G.h(emptyList);
        }
        this.J = false;
        this.K = false;
        this.T = -9223372036854775807L;
        if (this.M != 0) {
            I();
            g gVar = this.O;
            gVar.getClass();
            gVar.a();
            this.O = null;
            this.M = 0;
            this.L = true;
            n nVar = this.N;
            nVar.getClass();
            this.O = ((h.a) this.H).a(nVar);
            return;
        }
        I();
        g gVar2 = this.O;
        gVar2.getClass();
        gVar2.flush();
    }

    @Override // com.google.android.exoplayer2.e
    public final void E(n[] nVarArr, long j10, long j11) {
        n nVar = nVarArr[0];
        this.N = nVar;
        if (this.O != null) {
            this.M = 1;
            return;
        }
        this.L = true;
        nVar.getClass();
        this.O = ((h.a) this.H).a(nVar);
    }

    public final long G() {
        if (this.S == -1) {
            return Long.MAX_VALUE;
        }
        this.Q.getClass();
        if (this.S >= this.Q.i()) {
            return Long.MAX_VALUE;
        }
        return this.Q.f(this.S);
    }

    public final void H(SubtitleDecoderException subtitleDecoderException) {
        String valueOf = String.valueOf(this.N);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
        sb2.append("Subtitle decoding failed. streamFormat=");
        sb2.append(valueOf);
        ca.a.Q("TextRenderer", sb2.toString(), subtitleDecoderException);
        List<a> emptyList = Collections.emptyList();
        Handler handler = this.F;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.G.h(emptyList);
        }
        I();
        g gVar = this.O;
        gVar.getClass();
        gVar.a();
        this.O = null;
        this.M = 0;
        this.L = true;
        n nVar = this.N;
        nVar.getClass();
        this.O = ((h.a) this.H).a(nVar);
    }

    public final void I() {
        this.P = null;
        this.S = -1;
        k kVar = this.Q;
        if (kVar != null) {
            kVar.n();
            this.Q = null;
        }
        k kVar2 = this.R;
        if (kVar2 != null) {
            kVar2.n();
            this.R = null;
        }
    }

    @Override // o7.u
    public final int a(n nVar) {
        int i6;
        if (((h.a) this.H).b(nVar)) {
            if (nVar.Y == 0) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            return i6 | 0 | 0;
        } else if (!c9.l.i(nVar.F)) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override // com.google.android.exoplayer2.z
    public final boolean b() {
        return this.K;
    }

    @Override // com.google.android.exoplayer2.z, o7.u
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.G.h((List) message.obj);
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
        boolean z10;
        boolean z11;
        androidx.appcompat.widget.l lVar = this.I;
        if (this.D) {
            long j12 = this.T;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                I();
                this.K = true;
            }
        }
        if (this.K) {
            return;
        }
        if (this.R == null) {
            g gVar = this.O;
            gVar.getClass();
            gVar.b(j10);
            try {
                g gVar2 = this.O;
                gVar2.getClass();
                this.R = gVar2.c();
            } catch (SubtitleDecoderException e10) {
                H(e10);
                return;
            }
        }
        if (this.f6462y != 2) {
            return;
        }
        if (this.Q != null) {
            long G = G();
            z10 = false;
            while (G <= j10) {
                this.S++;
                G = G();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        k kVar = this.R;
        if (kVar != null) {
            if (kVar.k(4)) {
                if (!z10 && G() == Long.MAX_VALUE) {
                    if (this.M == 2) {
                        I();
                        g gVar3 = this.O;
                        gVar3.getClass();
                        gVar3.a();
                        this.O = null;
                        this.M = 0;
                        this.L = true;
                        n nVar = this.N;
                        nVar.getClass();
                        this.O = ((h.a) this.H).a(nVar);
                    } else {
                        I();
                        this.K = true;
                    }
                }
            } else if (kVar.f30540v <= j10) {
                k kVar2 = this.Q;
                if (kVar2 != null) {
                    kVar2.n();
                }
                this.S = kVar.d(j10);
                this.Q = kVar;
                this.R = null;
                z10 = true;
            }
        }
        if (z10) {
            this.Q.getClass();
            List<a> h10 = this.Q.h(j10);
            Handler handler = this.F;
            if (handler != null) {
                handler.obtainMessage(0, h10).sendToTarget();
            } else {
                this.G.h(h10);
            }
        }
        if (this.M == 2) {
            return;
        }
        while (!this.J) {
            try {
                j jVar = this.P;
                if (jVar == null) {
                    g gVar4 = this.O;
                    gVar4.getClass();
                    jVar = gVar4.d();
                    if (jVar == null) {
                        return;
                    }
                    this.P = jVar;
                }
                if (this.M == 1) {
                    jVar.f30528u = 4;
                    g gVar5 = this.O;
                    gVar5.getClass();
                    gVar5.e(jVar);
                    this.P = null;
                    this.M = 2;
                    return;
                }
                int F = F(lVar, jVar, 0);
                if (F == -4) {
                    if (jVar.k(4)) {
                        this.J = true;
                        this.L = false;
                    } else {
                        n nVar2 = (n) lVar.f1472w;
                        if (nVar2 == null) {
                            return;
                        }
                        jVar.C = nVar2.J;
                        jVar.t();
                        boolean z12 = this.L;
                        if (!jVar.k(1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.L = z12 & z11;
                    }
                    if (!this.L) {
                        g gVar6 = this.O;
                        gVar6.getClass();
                        gVar6.e(jVar);
                        this.P = null;
                    }
                } else if (F == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                H(e11);
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void y() {
        this.N = null;
        this.T = -9223372036854775807L;
        List<a> emptyList = Collections.emptyList();
        Handler handler = this.F;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.G.h(emptyList);
        }
        I();
        g gVar = this.O;
        gVar.getClass();
        gVar.a();
        this.O = null;
        this.M = 0;
    }
}
