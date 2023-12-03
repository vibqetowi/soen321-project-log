package au;

import androidx.recyclerview.widget.k;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import gu.a;
import gu.c;
import gu.g;
import gu.h;
import gu.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class p extends g.c<p> {
    public static final p N;
    public static final a O = new a();
    public p A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public p G;
    public int H;
    public p I;
    public int J;
    public int K;
    public byte L;
    public int M;

    /* renamed from: v  reason: collision with root package name */
    public final gu.c f3806v;

    /* renamed from: w  reason: collision with root package name */
    public int f3807w;

    /* renamed from: x  reason: collision with root package name */
    public List<b> f3808x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3809y;

    /* renamed from: z  reason: collision with root package name */
    public int f3810z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<p> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new p(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class c extends g.b<p, c> {
        public int A;
        public p B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public p H;
        public int I;
        public p J;
        public int K;
        public int L;

        /* renamed from: x  reason: collision with root package name */
        public int f3827x;

        /* renamed from: y  reason: collision with root package name */
        public List<b> f3828y = Collections.emptyList();

        /* renamed from: z  reason: collision with root package name */
        public boolean f3829z;

        public c() {
            p pVar = p.N;
            this.B = pVar;
            this.H = pVar;
            this.J = pVar;
        }

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            p l2 = l();
            if (l2.d()) {
                return l2;
            }
            throw new UninitializedMessageException();
        }

        @Override // gu.g.a
        public final Object clone() {
            c cVar = new c();
            cVar.m(l());
            return cVar;
        }

        @Override // gu.a.AbstractC0262a
        public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.g.a
        public final g.a i() {
            c cVar = new c();
            cVar.m(l());
            return cVar;
        }

        @Override // gu.g.a
        public final /* bridge */ /* synthetic */ g.a j(gu.g gVar) {
            m((p) gVar);
            return this;
        }

        public final p l() {
            p pVar = new p(this);
            int i6 = this.f3827x;
            int i10 = 1;
            if ((i6 & 1) == 1) {
                this.f3828y = Collections.unmodifiableList(this.f3828y);
                this.f3827x &= -2;
            }
            pVar.f3808x = this.f3828y;
            if ((i6 & 2) != 2) {
                i10 = 0;
            }
            pVar.f3809y = this.f3829z;
            if ((i6 & 4) == 4) {
                i10 |= 2;
            }
            pVar.f3810z = this.A;
            if ((i6 & 8) == 8) {
                i10 |= 4;
            }
            pVar.A = this.B;
            if ((i6 & 16) == 16) {
                i10 |= 8;
            }
            pVar.B = this.C;
            if ((i6 & 32) == 32) {
                i10 |= 16;
            }
            pVar.C = this.D;
            if ((i6 & 64) == 64) {
                i10 |= 32;
            }
            pVar.D = this.E;
            if ((i6 & 128) == 128) {
                i10 |= 64;
            }
            pVar.E = this.F;
            if ((i6 & 256) == 256) {
                i10 |= 128;
            }
            pVar.F = this.G;
            if ((i6 & 512) == 512) {
                i10 |= 256;
            }
            pVar.G = this.H;
            if ((i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 1024) {
                i10 |= 512;
            }
            pVar.H = this.I;
            if ((i6 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) == 2048) {
                i10 |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
            }
            pVar.I = this.J;
            if ((i6 & 4096) == 4096) {
                i10 |= Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
            }
            pVar.J = this.K;
            if ((i6 & 8192) == 8192) {
                i10 |= 4096;
            }
            pVar.K = this.L;
            pVar.f3807w = i10;
            return pVar;
        }

        public final c m(p pVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            p pVar2;
            p pVar3;
            p pVar4;
            p pVar5 = p.N;
            if (pVar == pVar5) {
                return this;
            }
            boolean z21 = true;
            if (!pVar.f3808x.isEmpty()) {
                if (this.f3828y.isEmpty()) {
                    this.f3828y = pVar.f3808x;
                    this.f3827x &= -2;
                } else {
                    if ((this.f3827x & 1) != 1) {
                        this.f3828y = new ArrayList(this.f3828y);
                        this.f3827x |= 1;
                    }
                    this.f3828y.addAll(pVar.f3808x);
                }
            }
            int i6 = pVar.f3807w;
            if ((i6 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                boolean z22 = pVar.f3809y;
                this.f3827x |= 2;
                this.f3829z = z22;
            }
            if ((i6 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i10 = pVar.f3810z;
                this.f3827x |= 4;
                this.A = i10;
            }
            if ((i6 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                p pVar6 = pVar.A;
                if ((this.f3827x & 8) == 8 && (pVar4 = this.B) != pVar5) {
                    c s10 = p.s(pVar4);
                    s10.m(pVar6);
                    this.B = s10.l();
                } else {
                    this.B = pVar6;
                }
                this.f3827x |= 8;
            }
            if ((pVar.f3807w & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                int i11 = pVar.B;
                this.f3827x |= 16;
                this.C = i11;
            }
            if (pVar.q()) {
                int i12 = pVar.C;
                this.f3827x |= 32;
                this.D = i12;
            }
            int i13 = pVar.f3807w;
            if ((i13 & 32) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                int i14 = pVar.D;
                this.f3827x |= 64;
                this.E = i14;
            }
            if ((i13 & 64) == 64) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                int i15 = pVar.E;
                this.f3827x |= 128;
                this.F = i15;
            }
            if ((i13 & 128) == 128) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                int i16 = pVar.F;
                this.f3827x |= 256;
                this.G = i16;
            }
            if ((i13 & 256) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                p pVar7 = pVar.G;
                if ((this.f3827x & 512) == 512 && (pVar3 = this.H) != pVar5) {
                    c s11 = p.s(pVar3);
                    s11.m(pVar7);
                    this.H = s11.l();
                } else {
                    this.H = pVar7;
                }
                this.f3827x |= 512;
            }
            int i17 = pVar.f3807w;
            if ((i17 & 512) == 512) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                int i18 = pVar.H;
                this.f3827x |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                this.I = i18;
            }
            if ((i17 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 1024) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (z19) {
                p pVar8 = pVar.I;
                if ((this.f3827x & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) == 2048 && (pVar2 = this.J) != pVar5) {
                    c s12 = p.s(pVar2);
                    s12.m(pVar8);
                    this.J = s12.l();
                } else {
                    this.J = pVar8;
                }
                this.f3827x |= Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
            }
            int i19 = pVar.f3807w;
            if ((i19 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) == 2048) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (z20) {
                int i20 = pVar.J;
                this.f3827x |= 4096;
                this.K = i20;
            }
            if ((i19 & 4096) != 4096) {
                z21 = false;
            }
            if (z21) {
                int i21 = pVar.K;
                this.f3827x |= 8192;
                this.L = i21;
            }
            k(pVar);
            this.f16856u = this.f16856u.g(pVar.f3806v);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(gu.d dVar, gu.e eVar) {
            p pVar;
            try {
                try {
                    p.O.getClass();
                    m(new p(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    pVar = null;
                    if (pVar != null) {
                        m(pVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                pVar = (p) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (pVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        p pVar = new p(0);
        N = pVar;
        pVar.r();
    }

    public p() {
        throw null;
    }

    public p(g.b bVar) {
        super(bVar);
        this.L = (byte) -1;
        this.M = -1;
        this.f3806v = bVar.f16856u;
    }

    public static c s(p pVar) {
        return new c().m(pVar);
    }

    @Override // gu.n
    public final n.a a() {
        return s(this);
    }

    @Override // gu.n
    public final int b() {
        int i6;
        int i10 = this.M;
        if (i10 != -1) {
            return i10;
        }
        if ((this.f3807w & 4096) == 4096) {
            i6 = CodedOutputStream.b(1, this.K) + 0;
        } else {
            i6 = 0;
        }
        for (int i11 = 0; i11 < this.f3808x.size(); i11++) {
            i6 += CodedOutputStream.d(2, this.f3808x.get(i11));
        }
        if ((this.f3807w & 1) == 1) {
            i6 += CodedOutputStream.h(3) + 1;
        }
        if ((this.f3807w & 2) == 2) {
            i6 += CodedOutputStream.b(4, this.f3810z);
        }
        if ((this.f3807w & 4) == 4) {
            i6 += CodedOutputStream.d(5, this.A);
        }
        if ((this.f3807w & 16) == 16) {
            i6 += CodedOutputStream.b(6, this.C);
        }
        if ((this.f3807w & 32) == 32) {
            i6 += CodedOutputStream.b(7, this.D);
        }
        if ((this.f3807w & 8) == 8) {
            i6 += CodedOutputStream.b(8, this.B);
        }
        if ((this.f3807w & 64) == 64) {
            i6 += CodedOutputStream.b(9, this.E);
        }
        if ((this.f3807w & 256) == 256) {
            i6 += CodedOutputStream.d(10, this.G);
        }
        if ((this.f3807w & 512) == 512) {
            i6 += CodedOutputStream.b(11, this.H);
        }
        if ((this.f3807w & 128) == 128) {
            i6 += CodedOutputStream.b(12, this.F);
        }
        if ((this.f3807w & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 1024) {
            i6 += CodedOutputStream.d(13, this.I);
        }
        if ((this.f3807w & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) == 2048) {
            i6 += CodedOutputStream.b(14, this.J);
        }
        int size = this.f3806v.size() + j() + i6;
        this.M = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new c();
    }

    @Override // gu.o
    public final boolean d() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte b10 = this.L;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < this.f3808x.size(); i6++) {
            if (!this.f3808x.get(i6).d()) {
                this.L = (byte) 0;
                return false;
            }
        }
        if ((this.f3807w & 4) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.A.d()) {
            this.L = (byte) 0;
            return false;
        }
        if ((this.f3807w & 256) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.G.d()) {
            this.L = (byte) 0;
            return false;
        }
        if ((this.f3807w & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 1024) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.I.d()) {
            this.L = (byte) 0;
            return false;
        } else if (!i()) {
            this.L = (byte) 0;
            return false;
        } else {
            this.L = (byte) 1;
            return true;
        }
    }

    @Override // gu.o
    public final gu.n e() {
        return N;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        g.c.a aVar = new g.c.a(this);
        if ((this.f3807w & 4096) == 4096) {
            codedOutputStream.m(1, this.K);
        }
        for (int i6 = 0; i6 < this.f3808x.size(); i6++) {
            codedOutputStream.o(2, this.f3808x.get(i6));
        }
        if ((this.f3807w & 1) == 1) {
            boolean z10 = this.f3809y;
            codedOutputStream.x(3, 0);
            codedOutputStream.q(z10 ? 1 : 0);
        }
        if ((this.f3807w & 2) == 2) {
            codedOutputStream.m(4, this.f3810z);
        }
        if ((this.f3807w & 4) == 4) {
            codedOutputStream.o(5, this.A);
        }
        if ((this.f3807w & 16) == 16) {
            codedOutputStream.m(6, this.C);
        }
        if ((this.f3807w & 32) == 32) {
            codedOutputStream.m(7, this.D);
        }
        if ((this.f3807w & 8) == 8) {
            codedOutputStream.m(8, this.B);
        }
        if ((this.f3807w & 64) == 64) {
            codedOutputStream.m(9, this.E);
        }
        if ((this.f3807w & 256) == 256) {
            codedOutputStream.o(10, this.G);
        }
        if ((this.f3807w & 512) == 512) {
            codedOutputStream.m(11, this.H);
        }
        if ((this.f3807w & 128) == 128) {
            codedOutputStream.m(12, this.F);
        }
        if ((this.f3807w & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 1024) {
            codedOutputStream.o(13, this.I);
        }
        if ((this.f3807w & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) == 2048) {
            codedOutputStream.m(14, this.J);
        }
        aVar.a(k.d.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
        codedOutputStream.r(this.f3806v);
    }

    public final boolean q() {
        if ((this.f3807w & 16) == 16) {
            return true;
        }
        return false;
    }

    public final void r() {
        this.f3808x = Collections.emptyList();
        this.f3809y = false;
        this.f3810z = 0;
        p pVar = N;
        this.A = pVar;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = pVar;
        this.H = 0;
        this.I = pVar;
        this.J = 0;
        this.K = 0;
    }

    public final c t() {
        return s(this);
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends gu.g implements gu.o {
        public static final b B;
        public static final a C = new a();
        public int A;

        /* renamed from: u  reason: collision with root package name */
        public final gu.c f3811u;

        /* renamed from: v  reason: collision with root package name */
        public int f3812v;

        /* renamed from: w  reason: collision with root package name */
        public c f3813w;

        /* renamed from: x  reason: collision with root package name */
        public p f3814x;

        /* renamed from: y  reason: collision with root package name */
        public int f3815y;

        /* renamed from: z  reason: collision with root package name */
        public byte f3816z;

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes2.dex */
        public static class a extends gu.b<b> {
            @Override // gu.p
            public final Object a(gu.d dVar, gu.e eVar) {
                return new b(dVar, eVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: au.p$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0069b extends g.a<b, C0069b> implements gu.o {

            /* renamed from: v  reason: collision with root package name */
            public int f3817v;

            /* renamed from: w  reason: collision with root package name */
            public c f3818w = c.INV;

            /* renamed from: x  reason: collision with root package name */
            public p f3819x = p.N;

            /* renamed from: y  reason: collision with root package name */
            public int f3820y;

            @Override // gu.a.AbstractC0262a, gu.n.a
            public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
                m(dVar, eVar);
                return this;
            }

            @Override // gu.n.a
            public final gu.n build() {
                b k10 = k();
                if (k10.d()) {
                    return k10;
                }
                throw new UninitializedMessageException();
            }

            @Override // gu.g.a
            public final Object clone() {
                C0069b c0069b = new C0069b();
                c0069b.l(k());
                return c0069b;
            }

            @Override // gu.a.AbstractC0262a
            public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, gu.e eVar) {
                m(dVar, eVar);
                return this;
            }

            @Override // gu.g.a
            public final C0069b i() {
                C0069b c0069b = new C0069b();
                c0069b.l(k());
                return c0069b;
            }

            @Override // gu.g.a
            public final /* bridge */ /* synthetic */ C0069b j(b bVar) {
                l(bVar);
                return this;
            }

            public final b k() {
                b bVar = new b(this);
                int i6 = this.f3817v;
                int i10 = 1;
                if ((i6 & 1) != 1) {
                    i10 = 0;
                }
                bVar.f3813w = this.f3818w;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                bVar.f3814x = this.f3819x;
                if ((i6 & 4) == 4) {
                    i10 |= 4;
                }
                bVar.f3815y = this.f3820y;
                bVar.f3812v = i10;
                return bVar;
            }

            public final void l(b bVar) {
                boolean z10;
                boolean z11;
                p pVar;
                if (bVar == b.B) {
                    return;
                }
                boolean z12 = true;
                if ((bVar.f3812v & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    c cVar = bVar.f3813w;
                    cVar.getClass();
                    this.f3817v |= 1;
                    this.f3818w = cVar;
                }
                if ((bVar.f3812v & 2) == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    p pVar2 = bVar.f3814x;
                    if ((this.f3817v & 2) == 2 && (pVar = this.f3819x) != p.N) {
                        c s10 = p.s(pVar);
                        s10.m(pVar2);
                        this.f3819x = s10.l();
                    } else {
                        this.f3819x = pVar2;
                    }
                    this.f3817v |= 2;
                }
                if ((bVar.f3812v & 4) != 4) {
                    z12 = false;
                }
                if (z12) {
                    int i6 = bVar.f3815y;
                    this.f3817v |= 4;
                    this.f3820y = i6;
                }
                this.f16856u = this.f16856u.g(bVar.f3811u);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(gu.d dVar, gu.e eVar) {
                b bVar;
                try {
                    try {
                        b.C.getClass();
                        l(new b(dVar, eVar));
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = null;
                        if (bVar != null) {
                            l(bVar);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    bVar = (b) e10.f23476u;
                    try {
                        throw e10;
                    } catch (Throwable th3) {
                        th = th3;
                        if (bVar != null) {
                        }
                        throw th;
                    }
                }
            }
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes2.dex */
        public enum c implements h.a {
            IN(0),
            OUT(1),
            INV(2),
            STAR(3);
            

            /* renamed from: u  reason: collision with root package name */
            public final int f3826u;

            c(int i6) {
                this.f3826u = i6;
            }

            @Override // gu.h.a
            public final int e() {
                return this.f3826u;
            }
        }

        static {
            b bVar = new b();
            B = bVar;
            bVar.f3813w = c.INV;
            bVar.f3814x = p.N;
            bVar.f3815y = 0;
        }

        public b(g.a aVar) {
            super(0);
            this.f3816z = (byte) -1;
            this.A = -1;
            this.f3811u = aVar.f16856u;
        }

        @Override // gu.n
        public final n.a a() {
            C0069b c0069b = new C0069b();
            c0069b.l(this);
            return c0069b;
        }

        @Override // gu.n
        public final int b() {
            int i6 = this.A;
            if (i6 != -1) {
                return i6;
            }
            int i10 = 0;
            if ((this.f3812v & 1) == 1) {
                i10 = 0 + CodedOutputStream.a(1, this.f3813w.f3826u);
            }
            if ((this.f3812v & 2) == 2) {
                i10 += CodedOutputStream.d(2, this.f3814x);
            }
            if ((this.f3812v & 4) == 4) {
                i10 += CodedOutputStream.b(3, this.f3815y);
            }
            int size = this.f3811u.size() + i10;
            this.A = size;
            return size;
        }

        @Override // gu.n
        public final n.a c() {
            return new C0069b();
        }

        @Override // gu.o
        public final boolean d() {
            boolean z10;
            byte b10 = this.f3816z;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if ((this.f3812v & 2) == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f3814x.d()) {
                this.f3816z = (byte) 0;
                return false;
            }
            this.f3816z = (byte) 1;
            return true;
        }

        @Override // gu.n
        public final void f(CodedOutputStream codedOutputStream) {
            b();
            if ((this.f3812v & 1) == 1) {
                codedOutputStream.l(1, this.f3813w.f3826u);
            }
            if ((this.f3812v & 2) == 2) {
                codedOutputStream.o(2, this.f3814x);
            }
            if ((this.f3812v & 4) == 4) {
                codedOutputStream.m(3, this.f3815y);
            }
            codedOutputStream.r(this.f3811u);
        }

        public b() {
            this.f3816z = (byte) -1;
            this.A = -1;
            this.f3811u = gu.c.f16833u;
        }

        public b(gu.d dVar, gu.e eVar) {
            this.f3816z = (byte) -1;
            this.A = -1;
            c cVar = c.INV;
            this.f3813w = cVar;
            this.f3814x = p.N;
            boolean z10 = false;
            this.f3815y = 0;
            c.b bVar = new c.b();
            CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        try {
                            int n10 = dVar.n();
                            if (n10 != 0) {
                                c cVar2 = null;
                                c cVar3 = null;
                                if (n10 == 8) {
                                    int k10 = dVar.k();
                                    if (k10 == 0) {
                                        cVar3 = c.IN;
                                    } else if (k10 == 1) {
                                        cVar3 = c.OUT;
                                    } else if (k10 == 2) {
                                        cVar3 = cVar;
                                    } else if (k10 == 3) {
                                        cVar3 = c.STAR;
                                    }
                                    if (cVar3 == null) {
                                        j10.v(n10);
                                        j10.v(k10);
                                    } else {
                                        this.f3812v |= 1;
                                        this.f3813w = cVar3;
                                    }
                                } else if (n10 == 18) {
                                    if ((this.f3812v & 2) == 2) {
                                        p pVar = this.f3814x;
                                        pVar.getClass();
                                        cVar2 = p.s(pVar);
                                    }
                                    p pVar2 = (p) dVar.g(p.O, eVar);
                                    this.f3814x = pVar2;
                                    if (cVar2 != null) {
                                        cVar2.m(pVar2);
                                        this.f3814x = cVar2.l();
                                    }
                                    this.f3812v |= 2;
                                } else if (n10 != 24) {
                                    if (!dVar.q(n10, j10)) {
                                    }
                                } else {
                                    this.f3812v |= 4;
                                    this.f3815y = dVar.k();
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                            invalidProtocolBufferException.f23476u = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        e11.f23476u = this;
                        throw e11;
                    }
                } catch (Throwable th2) {
                    try {
                        j10.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f3811u = bVar.g();
                        throw th3;
                    }
                    this.f3811u = bVar.g();
                    throw th2;
                }
            }
            try {
                j10.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f3811u = bVar.g();
                throw th4;
            }
            this.f3811u = bVar.g();
        }
    }

    public p(int i6) {
        this.L = (byte) -1;
        this.M = -1;
        this.f3806v = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(gu.d dVar, gu.e eVar) {
        this.L = (byte) -1;
        this.M = -1;
        r();
        c.b bVar = new c.b();
        CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = dVar.n();
                        a aVar = O;
                        c cVar = null;
                        switch (n10) {
                            case 0:
                                break;
                            case 8:
                                this.f3807w |= 4096;
                                this.K = dVar.k();
                                continue;
                            case 18:
                                if (!(z11 & true)) {
                                    this.f3808x = new ArrayList();
                                    z11 |= true;
                                }
                                this.f3808x.add(dVar.g(b.C, eVar));
                                continue;
                            case 24:
                                this.f3807w |= 1;
                                this.f3809y = dVar.l() != 0;
                                continue;
                            case 32:
                                this.f3807w |= 2;
                                this.f3810z = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                if ((this.f3807w & 4) == 4) {
                                    p pVar = this.A;
                                    pVar.getClass();
                                    cVar = s(pVar);
                                }
                                p pVar2 = (p) dVar.g(aVar, eVar);
                                this.A = pVar2;
                                if (cVar != null) {
                                    cVar.m(pVar2);
                                    this.A = cVar.l();
                                }
                                this.f3807w |= 4;
                                continue;
                            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                this.f3807w |= 16;
                                this.C = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_colorError /* 56 */:
                                this.f3807w |= 32;
                                this.D = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                this.f3807w |= 8;
                                this.B = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                this.f3807w |= 64;
                                this.E = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                if ((this.f3807w & 256) == 256) {
                                    p pVar3 = this.G;
                                    pVar3.getClass();
                                    cVar = s(pVar3);
                                }
                                p pVar4 = (p) dVar.g(aVar, eVar);
                                this.G = pVar4;
                                if (cVar != null) {
                                    cVar.m(pVar4);
                                    this.G = cVar.l();
                                }
                                this.f3807w |= 256;
                                continue;
                            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                this.f3807w |= 512;
                                this.H = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                                this.f3807w |= 128;
                                this.F = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                                if ((this.f3807w & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 1024) {
                                    p pVar5 = this.I;
                                    pVar5.getClass();
                                    cVar = s(pVar5);
                                }
                                p pVar6 = (p) dVar.g(aVar, eVar);
                                this.I = pVar6;
                                if (cVar != null) {
                                    cVar.m(pVar6);
                                    this.I = cVar.l();
                                }
                                this.f3807w |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                                continue;
                            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                                this.f3807w |= Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
                                this.J = dVar.k();
                                continue;
                            default:
                                if (!o(dVar, j10, eVar, n10)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f23476u = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f23476u = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f3808x = Collections.unmodifiableList(this.f3808x);
                }
                try {
                    j10.i();
                } catch (IOException unused) {
                    this.f3806v = bVar.g();
                    m();
                    throw th2;
                } catch (Throwable th3) {
                    this.f3806v = bVar.g();
                    throw th3;
                }
            }
        }
        if (z11 & true) {
            this.f3808x = Collections.unmodifiableList(this.f3808x);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
            this.f3806v = bVar.g();
            m();
        } catch (Throwable th4) {
            this.f3806v = bVar.g();
            throw th4;
        }
    }
}
