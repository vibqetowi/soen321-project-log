package wr;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import wr.h;
/* compiled from: OutboundFlowController.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final c f37189a;

    /* renamed from: b  reason: collision with root package name */
    public final yr.c f37190b;

    /* renamed from: c  reason: collision with root package name */
    public int f37191c;

    /* renamed from: d  reason: collision with root package name */
    public final b f37192d;

    /* compiled from: OutboundFlowController.java */
    /* loaded from: classes2.dex */
    public interface a {
        void b(int i6);
    }

    /* compiled from: OutboundFlowController.java */
    /* loaded from: classes2.dex */
    public final class b {

        /* renamed from: b  reason: collision with root package name */
        public final int f37194b;

        /* renamed from: c  reason: collision with root package name */
        public int f37195c;

        /* renamed from: d  reason: collision with root package name */
        public int f37196d;

        /* renamed from: e  reason: collision with root package name */
        public final a f37197e;

        /* renamed from: a  reason: collision with root package name */
        public final zv.e f37193a = new zv.e();
        public boolean f = false;

        public b(int i6, int i10, h.b bVar) {
            this.f37194b = i6;
            this.f37195c = i10;
            this.f37197e = bVar;
        }

        public final int a(int i6) {
            if (i6 > 0 && SubsamplingScaleImageView.TILE_SIZE_AUTO - i6 < this.f37195c) {
                throw new IllegalArgumentException("Window size overflow for stream: " + this.f37194b);
            }
            int i10 = this.f37195c + i6;
            this.f37195c = i10;
            return i10;
        }

        public final int b() {
            return Math.min(this.f37195c, o.this.f37192d.f37195c);
        }

        public final void c(int i6, zv.e eVar, boolean z10) {
            boolean z11;
            do {
                o oVar = o.this;
                int min = Math.min(i6, oVar.f37190b.A0());
                int i10 = -min;
                oVar.f37192d.a(i10);
                a(i10);
                try {
                    if (eVar.f39885v == min && z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    oVar.f37190b.P(z11, this.f37194b, eVar, min);
                    this.f37197e.b(min);
                    i6 -= min;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } while (i6 > 0);
        }
    }

    /* compiled from: OutboundFlowController.java */
    /* loaded from: classes2.dex */
    public interface c {
        b[] b();
    }

    public o(c cVar, wr.b bVar) {
        sc.b.w(cVar, "transport");
        this.f37189a = cVar;
        this.f37190b = bVar;
        this.f37191c = 65535;
        this.f37192d = new b(0, 65535, null);
    }

    public final void a(boolean z10, b bVar, zv.e eVar, boolean z11) {
        boolean z12;
        sc.b.w(eVar, "source");
        int b10 = bVar.b();
        zv.e eVar2 = bVar.f37193a;
        if (eVar2.f39885v > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i6 = (int) eVar.f39885v;
        if (!z12 && b10 >= i6) {
            bVar.c(i6, eVar, z10);
        } else {
            if (!z12 && b10 > 0) {
                bVar.c(b10, eVar, false);
            }
            eVar2.n(eVar, (int) eVar.f39885v);
            bVar.f = z10 | bVar.f;
        }
        if (z11) {
            try {
                this.f37190b.flush();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final boolean b(int i6) {
        if (i6 >= 0) {
            int i10 = i6 - this.f37191c;
            this.f37191c = i6;
            for (b bVar : this.f37189a.b()) {
                bVar.a(i10);
            }
            if (i10 <= 0) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException(defpackage.c.p("Invalid initial window size: ", i6));
    }

    public final void c(b bVar, int i6) {
        boolean z10;
        if (bVar == null) {
            this.f37192d.a(i6);
            d();
            return;
        }
        bVar.a(i6);
        int b10 = bVar.b();
        int min = Math.min(b10, bVar.b());
        boolean z11 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            zv.e eVar = bVar.f37193a;
            long j10 = eVar.f39885v;
            if (j10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || min <= 0) {
                break;
            }
            if (min >= j10) {
                int i12 = (int) j10;
                i10 += i12;
                bVar.c(i12, eVar, bVar.f);
            } else {
                i10 += min;
                bVar.c(min, eVar, false);
            }
            i11++;
            min = Math.min(b10 - i10, bVar.b());
        }
        if (i11 > 0) {
            z11 = true;
        }
        if (z11) {
            try {
                this.f37190b.flush();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d() {
        boolean z10;
        b[] b10;
        boolean z11;
        c cVar = this.f37189a;
        b[] b11 = cVar.b();
        Collections.shuffle(Arrays.asList(b11));
        int i6 = this.f37192d.f37195c;
        int length = b11.length;
        while (true) {
            z10 = false;
            if (length <= 0 || i6 <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i6 / length);
            int i10 = 0;
            for (int i11 = 0; i11 < length && i6 > 0; i11++) {
                b bVar = b11[i11];
                int min = Math.min(i6, Math.min(Math.max(0, Math.min(bVar.f37195c, (int) bVar.f37193a.f39885v)) - bVar.f37196d, ceil));
                if (min > 0) {
                    bVar.f37196d += min;
                    i6 -= min;
                }
                if (Math.max(0, Math.min(bVar.f37195c, (int) bVar.f37193a.f39885v)) - bVar.f37196d > 0) {
                    b11[i10] = bVar;
                    i10++;
                }
            }
            length = i10;
        }
        int i12 = 0;
        for (b bVar2 : cVar.b()) {
            int i13 = bVar2.f37196d;
            int min2 = Math.min(i13, bVar2.b());
            int i14 = 0;
            while (true) {
                zv.e eVar = bVar2.f37193a;
                long j10 = eVar.f39885v;
                if (j10 > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && min2 > 0) {
                    if (min2 >= j10) {
                        int i15 = (int) j10;
                        i14 += i15;
                        bVar2.c(i15, eVar, bVar2.f);
                    } else {
                        i14 += min2;
                        bVar2.c(min2, eVar, false);
                    }
                    i12++;
                    min2 = Math.min(i13 - i14, bVar2.b());
                }
            }
            bVar2.f37196d = 0;
        }
        if (i12 > 0) {
            z10 = true;
        }
        if (z10) {
            try {
                this.f37190b.flush();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
