package au;

import au.d;
import au.p;
import au.s;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import gu.a;
import gu.c;
import gu.g;
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
public final class h extends g.c<h> {
    public static final h O;
    public static final a P = new a();
    public p A;
    public int B;
    public List<r> C;
    public p D;
    public int E;
    public List<p> F;
    public List<Integer> G;
    public int H;
    public List<t> I;
    public s J;
    public List<Integer> K;
    public d L;
    public byte M;
    public int N;

    /* renamed from: v  reason: collision with root package name */
    public final gu.c f3739v;

    /* renamed from: w  reason: collision with root package name */
    public int f3740w;

    /* renamed from: x  reason: collision with root package name */
    public int f3741x;

    /* renamed from: y  reason: collision with root package name */
    public int f3742y;

    /* renamed from: z  reason: collision with root package name */
    public int f3743z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<h> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new h(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.b<h, b> {
        public int A;
        public p B;
        public int C;
        public List<r> D;
        public p E;
        public int F;
        public List<p> G;
        public List<Integer> H;
        public List<t> I;
        public s J;
        public List<Integer> K;
        public d L;

        /* renamed from: x  reason: collision with root package name */
        public int f3744x;

        /* renamed from: y  reason: collision with root package name */
        public int f3745y = 6;

        /* renamed from: z  reason: collision with root package name */
        public int f3746z = 6;

        public b() {
            p pVar = p.N;
            this.B = pVar;
            this.D = Collections.emptyList();
            this.E = pVar;
            this.G = Collections.emptyList();
            this.H = Collections.emptyList();
            this.I = Collections.emptyList();
            this.J = s.A;
            this.K = Collections.emptyList();
            this.L = d.f3687y;
        }

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            h l2 = l();
            if (l2.d()) {
                return l2;
            }
            throw new UninitializedMessageException();
        }

        @Override // gu.g.a
        public final Object clone() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // gu.a.AbstractC0262a
        public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.g.a
        public final g.a i() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // gu.g.a
        public final /* bridge */ /* synthetic */ g.a j(gu.g gVar) {
            m((h) gVar);
            return this;
        }

        public final h l() {
            h hVar = new h(this);
            int i6 = this.f3744x;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            hVar.f3741x = this.f3745y;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            hVar.f3742y = this.f3746z;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            hVar.f3743z = this.A;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            hVar.A = this.B;
            if ((i6 & 16) == 16) {
                i10 |= 16;
            }
            hVar.B = this.C;
            if ((i6 & 32) == 32) {
                this.D = Collections.unmodifiableList(this.D);
                this.f3744x &= -33;
            }
            hVar.C = this.D;
            if ((i6 & 64) == 64) {
                i10 |= 32;
            }
            hVar.D = this.E;
            if ((i6 & 128) == 128) {
                i10 |= 64;
            }
            hVar.E = this.F;
            if ((this.f3744x & 256) == 256) {
                this.G = Collections.unmodifiableList(this.G);
                this.f3744x &= -257;
            }
            hVar.F = this.G;
            if ((this.f3744x & 512) == 512) {
                this.H = Collections.unmodifiableList(this.H);
                this.f3744x &= -513;
            }
            hVar.G = this.H;
            if ((this.f3744x & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 1024) {
                this.I = Collections.unmodifiableList(this.I);
                this.f3744x &= -1025;
            }
            hVar.I = this.I;
            if ((i6 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) == 2048) {
                i10 |= 128;
            }
            hVar.J = this.J;
            if ((this.f3744x & 4096) == 4096) {
                this.K = Collections.unmodifiableList(this.K);
                this.f3744x &= -4097;
            }
            hVar.K = this.K;
            if ((i6 & 8192) == 8192) {
                i10 |= 256;
            }
            hVar.L = this.L;
            hVar.f3740w = i10;
            return hVar;
        }

        public final void m(h hVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            d dVar;
            s sVar;
            p pVar;
            p pVar2;
            if (hVar == h.O) {
                return;
            }
            int i6 = hVar.f3740w;
            boolean z18 = false;
            if ((i6 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = hVar.f3741x;
                this.f3744x |= 1;
                this.f3745y = i10;
            }
            if ((i6 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i11 = hVar.f3742y;
                this.f3744x = 2 | this.f3744x;
                this.f3746z = i11;
            }
            if ((i6 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int i12 = hVar.f3743z;
                this.f3744x = 4 | this.f3744x;
                this.A = i12;
            }
            if ((i6 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                p pVar3 = hVar.A;
                if ((this.f3744x & 8) == 8 && (pVar2 = this.B) != p.N) {
                    p.c s10 = p.s(pVar2);
                    s10.m(pVar3);
                    this.B = s10.l();
                } else {
                    this.B = pVar3;
                }
                this.f3744x |= 8;
            }
            if ((hVar.f3740w & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                int i13 = hVar.B;
                this.f3744x = 16 | this.f3744x;
                this.C = i13;
            }
            if (!hVar.C.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = hVar.C;
                    this.f3744x &= -33;
                } else {
                    if ((this.f3744x & 32) != 32) {
                        this.D = new ArrayList(this.D);
                        this.f3744x |= 32;
                    }
                    this.D.addAll(hVar.C);
                }
            }
            if ((hVar.f3740w & 32) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                p pVar4 = hVar.D;
                if ((this.f3744x & 64) == 64 && (pVar = this.E) != p.N) {
                    p.c s11 = p.s(pVar);
                    s11.m(pVar4);
                    this.E = s11.l();
                } else {
                    this.E = pVar4;
                }
                this.f3744x |= 64;
            }
            if ((hVar.f3740w & 64) == 64) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                int i14 = hVar.E;
                this.f3744x |= 128;
                this.F = i14;
            }
            if (!hVar.F.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = hVar.F;
                    this.f3744x &= -257;
                } else {
                    if ((this.f3744x & 256) != 256) {
                        this.G = new ArrayList(this.G);
                        this.f3744x |= 256;
                    }
                    this.G.addAll(hVar.F);
                }
            }
            if (!hVar.G.isEmpty()) {
                if (this.H.isEmpty()) {
                    this.H = hVar.G;
                    this.f3744x &= -513;
                } else {
                    if ((this.f3744x & 512) != 512) {
                        this.H = new ArrayList(this.H);
                        this.f3744x |= 512;
                    }
                    this.H.addAll(hVar.G);
                }
            }
            if (!hVar.I.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = hVar.I;
                    this.f3744x &= -1025;
                } else {
                    if ((this.f3744x & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 1024) {
                        this.I = new ArrayList(this.I);
                        this.f3744x |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                    }
                    this.I.addAll(hVar.I);
                }
            }
            if ((hVar.f3740w & 128) == 128) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                s sVar2 = hVar.J;
                if ((this.f3744x & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) == 2048 && (sVar = this.J) != s.A) {
                    s.b i15 = s.i(sVar);
                    i15.l(sVar2);
                    this.J = i15.k();
                } else {
                    this.J = sVar2;
                }
                this.f3744x |= Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
            }
            if (!hVar.K.isEmpty()) {
                if (this.K.isEmpty()) {
                    this.K = hVar.K;
                    this.f3744x &= -4097;
                } else {
                    if ((this.f3744x & 4096) != 4096) {
                        this.K = new ArrayList(this.K);
                        this.f3744x |= 4096;
                    }
                    this.K.addAll(hVar.K);
                }
            }
            if ((hVar.f3740w & 256) == 256) {
                z18 = true;
            }
            if (z18) {
                d dVar2 = hVar.L;
                if ((this.f3744x & 8192) == 8192 && (dVar = this.L) != d.f3687y) {
                    d.b bVar = new d.b();
                    bVar.l(dVar);
                    bVar.l(dVar2);
                    this.L = bVar.k();
                } else {
                    this.L = dVar2;
                }
                this.f3744x |= 8192;
            }
            k(hVar);
            this.f16856u = this.f16856u.g(hVar.f3739v);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(gu.d dVar, gu.e eVar) {
            h hVar;
            try {
                try {
                    h.P.getClass();
                    m(new h(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    hVar = null;
                    if (hVar != null) {
                        m(hVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                hVar = (h) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (hVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        h hVar = new h(0);
        O = hVar;
        hVar.q();
    }

    public h() {
        throw null;
    }

    public h(g.b bVar) {
        super(bVar);
        this.H = -1;
        this.M = (byte) -1;
        this.N = -1;
        this.f3739v = bVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    @Override // gu.n
    public final int b() {
        int i6;
        int i10 = this.N;
        if (i10 != -1) {
            return i10;
        }
        if ((this.f3740w & 2) == 2) {
            i6 = CodedOutputStream.b(1, this.f3742y) + 0;
        } else {
            i6 = 0;
        }
        if ((this.f3740w & 4) == 4) {
            i6 += CodedOutputStream.b(2, this.f3743z);
        }
        if ((this.f3740w & 8) == 8) {
            i6 += CodedOutputStream.d(3, this.A);
        }
        for (int i11 = 0; i11 < this.C.size(); i11++) {
            i6 += CodedOutputStream.d(4, this.C.get(i11));
        }
        if ((this.f3740w & 32) == 32) {
            i6 += CodedOutputStream.d(5, this.D);
        }
        for (int i12 = 0; i12 < this.I.size(); i12++) {
            i6 += CodedOutputStream.d(6, this.I.get(i12));
        }
        if ((this.f3740w & 16) == 16) {
            i6 += CodedOutputStream.b(7, this.B);
        }
        if ((this.f3740w & 64) == 64) {
            i6 += CodedOutputStream.b(8, this.E);
        }
        if ((this.f3740w & 1) == 1) {
            i6 += CodedOutputStream.b(9, this.f3741x);
        }
        for (int i13 = 0; i13 < this.F.size(); i13++) {
            i6 += CodedOutputStream.d(10, this.F.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.G.size(); i15++) {
            i14 += CodedOutputStream.c(this.G.get(i15).intValue());
        }
        int i16 = i6 + i14;
        if (!this.G.isEmpty()) {
            i16 = i16 + 1 + CodedOutputStream.c(i14);
        }
        this.H = i14;
        if ((this.f3740w & 128) == 128) {
            i16 += CodedOutputStream.d(30, this.J);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.K.size(); i18++) {
            i17 += CodedOutputStream.c(this.K.get(i18).intValue());
        }
        int size = (this.K.size() * 2) + i16 + i17;
        if ((this.f3740w & 256) == 256) {
            size += CodedOutputStream.d(32, this.L);
        }
        int size2 = this.f3739v.size() + j() + size;
        this.N = size2;
        return size2;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        byte b10 = this.M;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i6 = this.f3740w;
        if ((i6 & 4) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.M = (byte) 0;
            return false;
        }
        if ((i6 & 8) == 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.A.d()) {
            this.M = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.C.size(); i10++) {
            if (!this.C.get(i10).d()) {
                this.M = (byte) 0;
                return false;
            }
        }
        if ((this.f3740w & 32) == 32) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.D.d()) {
            this.M = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            if (!this.F.get(i11).d()) {
                this.M = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.I.size(); i12++) {
            if (!this.I.get(i12).d()) {
                this.M = (byte) 0;
                return false;
            }
        }
        if ((this.f3740w & 128) == 128) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 && !this.J.d()) {
            this.M = (byte) 0;
            return false;
        }
        if ((this.f3740w & 256) == 256) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 && !this.L.d()) {
            this.M = (byte) 0;
            return false;
        } else if (!i()) {
            this.M = (byte) 0;
            return false;
        } else {
            this.M = (byte) 1;
            return true;
        }
    }

    @Override // gu.o
    public final gu.n e() {
        return O;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        g.c.a aVar = new g.c.a(this);
        if ((this.f3740w & 2) == 2) {
            codedOutputStream.m(1, this.f3742y);
        }
        if ((this.f3740w & 4) == 4) {
            codedOutputStream.m(2, this.f3743z);
        }
        if ((this.f3740w & 8) == 8) {
            codedOutputStream.o(3, this.A);
        }
        for (int i6 = 0; i6 < this.C.size(); i6++) {
            codedOutputStream.o(4, this.C.get(i6));
        }
        if ((this.f3740w & 32) == 32) {
            codedOutputStream.o(5, this.D);
        }
        for (int i10 = 0; i10 < this.I.size(); i10++) {
            codedOutputStream.o(6, this.I.get(i10));
        }
        if ((this.f3740w & 16) == 16) {
            codedOutputStream.m(7, this.B);
        }
        if ((this.f3740w & 64) == 64) {
            codedOutputStream.m(8, this.E);
        }
        if ((this.f3740w & 1) == 1) {
            codedOutputStream.m(9, this.f3741x);
        }
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            codedOutputStream.o(10, this.F.get(i11));
        }
        if (this.G.size() > 0) {
            codedOutputStream.v(90);
            codedOutputStream.v(this.H);
        }
        for (int i12 = 0; i12 < this.G.size(); i12++) {
            codedOutputStream.n(this.G.get(i12).intValue());
        }
        if ((this.f3740w & 128) == 128) {
            codedOutputStream.o(30, this.J);
        }
        for (int i13 = 0; i13 < this.K.size(); i13++) {
            codedOutputStream.m(31, this.K.get(i13).intValue());
        }
        if ((this.f3740w & 256) == 256) {
            codedOutputStream.o(32, this.L);
        }
        aVar.a(19000, codedOutputStream);
        codedOutputStream.r(this.f3739v);
    }

    public final void q() {
        this.f3741x = 6;
        this.f3742y = 6;
        this.f3743z = 0;
        p pVar = p.N;
        this.A = pVar;
        this.B = 0;
        this.C = Collections.emptyList();
        this.D = pVar;
        this.E = 0;
        this.F = Collections.emptyList();
        this.G = Collections.emptyList();
        this.I = Collections.emptyList();
        this.J = s.A;
        this.K = Collections.emptyList();
        this.L = d.f3687y;
    }

    public h(int i6) {
        this.H = -1;
        this.M = (byte) -1;
        this.N = -1;
        this.f3739v = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public h(gu.d dVar, gu.e eVar) {
        this.H = -1;
        this.M = (byte) -1;
        this.N = -1;
        q();
        c.b bVar = new c.b();
        CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r52 = 1024;
            if (!z10) {
                try {
                    try {
                        int n10 = dVar.n();
                        p.c cVar = null;
                        d.b bVar2 = null;
                        s.b bVar3 = null;
                        p.c cVar2 = null;
                        switch (n10) {
                            case 0:
                                break;
                            case 8:
                                this.f3740w |= 2;
                                this.f3742y = dVar.k();
                                continue;
                            case 16:
                                this.f3740w |= 4;
                                this.f3743z = dVar.k();
                                continue;
                            case 26:
                                if ((this.f3740w & 8) == 8) {
                                    p pVar = this.A;
                                    pVar.getClass();
                                    cVar = p.s(pVar);
                                }
                                p pVar2 = (p) dVar.g(p.O, eVar);
                                this.A = pVar2;
                                if (cVar != null) {
                                    cVar.m(pVar2);
                                    this.A = cVar.l();
                                }
                                this.f3740w |= 8;
                                continue;
                            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                if (!(z11 & true)) {
                                    this.C = new ArrayList();
                                    z11 |= true;
                                }
                                this.C.add(dVar.g(r.H, eVar));
                                continue;
                            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                if ((this.f3740w & 32) == 32) {
                                    p pVar3 = this.D;
                                    pVar3.getClass();
                                    cVar2 = p.s(pVar3);
                                }
                                p pVar4 = (p) dVar.g(p.O, eVar);
                                this.D = pVar4;
                                if (cVar2 != null) {
                                    cVar2.m(pVar4);
                                    this.D = cVar2.l();
                                }
                                this.f3740w |= 32;
                                continue;
                            case 50:
                                if (!(z11 & true)) {
                                    this.I = new ArrayList();
                                    z11 |= true;
                                }
                                this.I.add(dVar.g(t.G, eVar));
                                continue;
                            case R.styleable.AppCompatTheme_colorError /* 56 */:
                                this.f3740w |= 16;
                                this.B = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                this.f3740w |= 64;
                                this.E = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                this.f3740w |= 1;
                                this.f3741x = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                if (!(z11 & true)) {
                                    this.F = new ArrayList();
                                    z11 |= true;
                                }
                                this.F.add(dVar.g(p.O, eVar));
                                continue;
                            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                if (!(z11 & true)) {
                                    this.G = new ArrayList();
                                    z11 |= true;
                                }
                                this.G.add(Integer.valueOf(dVar.k()));
                                continue;
                            case 90:
                                int d10 = dVar.d(dVar.k());
                                if (!(z11 & true) && dVar.b() > 0) {
                                    this.G = new ArrayList();
                                    z11 |= true;
                                }
                                while (dVar.b() > 0) {
                                    this.G.add(Integer.valueOf(dVar.k()));
                                }
                                dVar.c(d10);
                                continue;
                                break;
                            case 242:
                                if ((this.f3740w & 128) == 128) {
                                    s sVar = this.J;
                                    sVar.getClass();
                                    bVar3 = s.i(sVar);
                                }
                                s sVar2 = (s) dVar.g(s.B, eVar);
                                this.J = sVar2;
                                if (bVar3 != null) {
                                    bVar3.l(sVar2);
                                    this.J = bVar3.k();
                                }
                                this.f3740w |= 128;
                                continue;
                            case 248:
                                if (!(z11 & true)) {
                                    this.K = new ArrayList();
                                    z11 |= true;
                                }
                                this.K.add(Integer.valueOf(dVar.k()));
                                continue;
                            case 250:
                                int d11 = dVar.d(dVar.k());
                                if (!(z11 & true) && dVar.b() > 0) {
                                    this.K = new ArrayList();
                                    z11 |= true;
                                }
                                while (dVar.b() > 0) {
                                    this.K.add(Integer.valueOf(dVar.k()));
                                }
                                dVar.c(d11);
                                continue;
                                break;
                            case 258:
                                if ((this.f3740w & 256) == 256) {
                                    d dVar2 = this.L;
                                    dVar2.getClass();
                                    bVar2 = new d.b();
                                    bVar2.l(dVar2);
                                }
                                d dVar3 = (d) dVar.g(d.f3688z, eVar);
                                this.L = dVar3;
                                if (bVar2 != null) {
                                    bVar2.l(dVar3);
                                    this.L = bVar2.k();
                                }
                                this.f3740w |= 256;
                                continue;
                            default:
                                r52 = o(dVar, j10, eVar, n10);
                                if (r52 == 0) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.C = Collections.unmodifiableList(this.C);
                        }
                        if ((z11 & true) == r52) {
                            this.I = Collections.unmodifiableList(this.I);
                        }
                        if (z11 & true) {
                            this.F = Collections.unmodifiableList(this.F);
                        }
                        if (z11 & true) {
                            this.G = Collections.unmodifiableList(this.G);
                        }
                        if (z11 & true) {
                            this.K = Collections.unmodifiableList(this.K);
                        }
                        try {
                            j10.i();
                        } catch (IOException unused) {
                            this.f3739v = bVar.g();
                            m();
                            throw th2;
                        } catch (Throwable th3) {
                            this.f3739v = bVar.g();
                            throw th3;
                        }
                    }
                } catch (InvalidProtocolBufferException e10) {
                    e10.f23476u = this;
                    throw e10;
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f23476u = this;
                    throw invalidProtocolBufferException;
                }
            } else {
                if (z11 & true) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if (z11 & true) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                if (z11 & true) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                if (z11 & true) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                if (z11 & true) {
                    this.K = Collections.unmodifiableList(this.K);
                }
                try {
                    j10.i();
                } catch (IOException unused2) {
                    this.f3739v = bVar.g();
                    m();
                    return;
                } catch (Throwable th4) {
                    this.f3739v = bVar.g();
                    throw th4;
                }
            }
        }
    }
}
