package au;

import au.p;
import au.t;
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
public final class m extends g.c<m> {
    public static final m O;
    public static final a P = new a();
    public p A;
    public int B;
    public List<r> C;
    public p D;
    public int E;
    public List<p> F;
    public List<Integer> G;
    public int H;
    public t I;
    public int J;
    public int K;
    public List<Integer> L;
    public byte M;
    public int N;

    /* renamed from: v  reason: collision with root package name */
    public final gu.c f3767v;

    /* renamed from: w  reason: collision with root package name */
    public int f3768w;

    /* renamed from: x  reason: collision with root package name */
    public int f3769x;

    /* renamed from: y  reason: collision with root package name */
    public int f3770y;

    /* renamed from: z  reason: collision with root package name */
    public int f3771z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<m> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new m(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.b<m, b> {
        public int A;
        public p B;
        public int C;
        public List<r> D;
        public p E;
        public int F;
        public List<p> G;
        public List<Integer> H;
        public t I;
        public int J;
        public int K;
        public List<Integer> L;

        /* renamed from: x  reason: collision with root package name */
        public int f3772x;

        /* renamed from: y  reason: collision with root package name */
        public int f3773y = 518;

        /* renamed from: z  reason: collision with root package name */
        public int f3774z = 2054;

        public b() {
            p pVar = p.N;
            this.B = pVar;
            this.D = Collections.emptyList();
            this.E = pVar;
            this.G = Collections.emptyList();
            this.H = Collections.emptyList();
            this.I = t.F;
            this.L = Collections.emptyList();
        }

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            m l2 = l();
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
            m((m) gVar);
            return this;
        }

        public final m l() {
            m mVar = new m(this);
            int i6 = this.f3772x;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            mVar.f3769x = this.f3773y;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            mVar.f3770y = this.f3774z;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            mVar.f3771z = this.A;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            mVar.A = this.B;
            if ((i6 & 16) == 16) {
                i10 |= 16;
            }
            mVar.B = this.C;
            if ((i6 & 32) == 32) {
                this.D = Collections.unmodifiableList(this.D);
                this.f3772x &= -33;
            }
            mVar.C = this.D;
            if ((i6 & 64) == 64) {
                i10 |= 32;
            }
            mVar.D = this.E;
            if ((i6 & 128) == 128) {
                i10 |= 64;
            }
            mVar.E = this.F;
            if ((this.f3772x & 256) == 256) {
                this.G = Collections.unmodifiableList(this.G);
                this.f3772x &= -257;
            }
            mVar.F = this.G;
            if ((this.f3772x & 512) == 512) {
                this.H = Collections.unmodifiableList(this.H);
                this.f3772x &= -513;
            }
            mVar.G = this.H;
            if ((i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 1024) {
                i10 |= 128;
            }
            mVar.I = this.I;
            if ((i6 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) == 2048) {
                i10 |= 256;
            }
            mVar.J = this.J;
            if ((i6 & 4096) == 4096) {
                i10 |= 512;
            }
            mVar.K = this.K;
            if ((this.f3772x & 8192) == 8192) {
                this.L = Collections.unmodifiableList(this.L);
                this.f3772x &= -8193;
            }
            mVar.L = this.L;
            mVar.f3768w = i10;
            return mVar;
        }

        public final void m(m mVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            t tVar;
            p pVar;
            p pVar2;
            if (mVar == m.O) {
                return;
            }
            int i6 = mVar.f3768w;
            boolean z19 = false;
            if ((i6 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = mVar.f3769x;
                this.f3772x |= 1;
                this.f3773y = i10;
            }
            if ((i6 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i11 = mVar.f3770y;
                this.f3772x = 2 | this.f3772x;
                this.f3774z = i11;
            }
            if ((i6 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int i12 = mVar.f3771z;
                this.f3772x = 4 | this.f3772x;
                this.A = i12;
            }
            if ((i6 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                p pVar3 = mVar.A;
                if ((this.f3772x & 8) == 8 && (pVar2 = this.B) != p.N) {
                    p.c s10 = p.s(pVar2);
                    s10.m(pVar3);
                    this.B = s10.l();
                } else {
                    this.B = pVar3;
                }
                this.f3772x |= 8;
            }
            if ((mVar.f3768w & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                int i13 = mVar.B;
                this.f3772x = 16 | this.f3772x;
                this.C = i13;
            }
            if (!mVar.C.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = mVar.C;
                    this.f3772x &= -33;
                } else {
                    if ((this.f3772x & 32) != 32) {
                        this.D = new ArrayList(this.D);
                        this.f3772x |= 32;
                    }
                    this.D.addAll(mVar.C);
                }
            }
            if ((mVar.f3768w & 32) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                p pVar4 = mVar.D;
                if ((this.f3772x & 64) == 64 && (pVar = this.E) != p.N) {
                    p.c s11 = p.s(pVar);
                    s11.m(pVar4);
                    this.E = s11.l();
                } else {
                    this.E = pVar4;
                }
                this.f3772x |= 64;
            }
            if ((mVar.f3768w & 64) == 64) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                int i14 = mVar.E;
                this.f3772x |= 128;
                this.F = i14;
            }
            if (!mVar.F.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = mVar.F;
                    this.f3772x &= -257;
                } else {
                    if ((this.f3772x & 256) != 256) {
                        this.G = new ArrayList(this.G);
                        this.f3772x |= 256;
                    }
                    this.G.addAll(mVar.F);
                }
            }
            if (!mVar.G.isEmpty()) {
                if (this.H.isEmpty()) {
                    this.H = mVar.G;
                    this.f3772x &= -513;
                } else {
                    if ((this.f3772x & 512) != 512) {
                        this.H = new ArrayList(this.H);
                        this.f3772x |= 512;
                    }
                    this.H.addAll(mVar.G);
                }
            }
            if ((mVar.f3768w & 128) == 128) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                t tVar2 = mVar.I;
                if ((this.f3772x & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 1024 && (tVar = this.I) != t.F) {
                    t.b bVar = new t.b();
                    bVar.m(tVar);
                    bVar.m(tVar2);
                    this.I = bVar.l();
                } else {
                    this.I = tVar2;
                }
                this.f3772x |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
            }
            int i15 = mVar.f3768w;
            if ((i15 & 256) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                int i16 = mVar.J;
                this.f3772x |= Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
                this.J = i16;
            }
            if ((i15 & 512) == 512) {
                z19 = true;
            }
            if (z19) {
                int i17 = mVar.K;
                this.f3772x |= 4096;
                this.K = i17;
            }
            if (!mVar.L.isEmpty()) {
                if (this.L.isEmpty()) {
                    this.L = mVar.L;
                    this.f3772x &= -8193;
                } else {
                    if ((this.f3772x & 8192) != 8192) {
                        this.L = new ArrayList(this.L);
                        this.f3772x |= 8192;
                    }
                    this.L.addAll(mVar.L);
                }
            }
            k(mVar);
            this.f16856u = this.f16856u.g(mVar.f3767v);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(gu.d dVar, gu.e eVar) {
            m mVar;
            try {
                try {
                    m.P.getClass();
                    m(new m(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    mVar = null;
                    if (mVar != null) {
                        m(mVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                mVar = (m) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (mVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        m mVar = new m(0);
        O = mVar;
        mVar.q();
    }

    public m() {
        throw null;
    }

    public m(g.b bVar) {
        super(bVar);
        this.H = -1;
        this.M = (byte) -1;
        this.N = -1;
        this.f3767v = bVar.f16856u;
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
        if ((this.f3768w & 2) == 2) {
            i6 = CodedOutputStream.b(1, this.f3770y) + 0;
        } else {
            i6 = 0;
        }
        if ((this.f3768w & 4) == 4) {
            i6 += CodedOutputStream.b(2, this.f3771z);
        }
        if ((this.f3768w & 8) == 8) {
            i6 += CodedOutputStream.d(3, this.A);
        }
        for (int i11 = 0; i11 < this.C.size(); i11++) {
            i6 += CodedOutputStream.d(4, this.C.get(i11));
        }
        if ((this.f3768w & 32) == 32) {
            i6 += CodedOutputStream.d(5, this.D);
        }
        if ((this.f3768w & 128) == 128) {
            i6 += CodedOutputStream.d(6, this.I);
        }
        if ((this.f3768w & 256) == 256) {
            i6 += CodedOutputStream.b(7, this.J);
        }
        if ((this.f3768w & 512) == 512) {
            i6 += CodedOutputStream.b(8, this.K);
        }
        if ((this.f3768w & 16) == 16) {
            i6 += CodedOutputStream.b(9, this.B);
        }
        if ((this.f3768w & 64) == 64) {
            i6 += CodedOutputStream.b(10, this.E);
        }
        if ((this.f3768w & 1) == 1) {
            i6 += CodedOutputStream.b(11, this.f3769x);
        }
        for (int i12 = 0; i12 < this.F.size(); i12++) {
            i6 += CodedOutputStream.d(12, this.F.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.G.size(); i14++) {
            i13 += CodedOutputStream.c(this.G.get(i14).intValue());
        }
        int i15 = i6 + i13;
        if (!this.G.isEmpty()) {
            i15 = i15 + 1 + CodedOutputStream.c(i13);
        }
        this.H = i13;
        int i16 = 0;
        for (int i17 = 0; i17 < this.L.size(); i17++) {
            i16 += CodedOutputStream.c(this.L.get(i17).intValue());
        }
        int size = (this.L.size() * 2) + i15 + i16;
        int size2 = this.f3767v.size() + j() + size;
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
        byte b10 = this.M;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i6 = this.f3768w;
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
        if ((this.f3768w & 32) == 32) {
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
        if ((this.f3768w & 128) == 128) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 && !this.I.d()) {
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
        if ((this.f3768w & 2) == 2) {
            codedOutputStream.m(1, this.f3770y);
        }
        if ((this.f3768w & 4) == 4) {
            codedOutputStream.m(2, this.f3771z);
        }
        if ((this.f3768w & 8) == 8) {
            codedOutputStream.o(3, this.A);
        }
        for (int i6 = 0; i6 < this.C.size(); i6++) {
            codedOutputStream.o(4, this.C.get(i6));
        }
        if ((this.f3768w & 32) == 32) {
            codedOutputStream.o(5, this.D);
        }
        if ((this.f3768w & 128) == 128) {
            codedOutputStream.o(6, this.I);
        }
        if ((this.f3768w & 256) == 256) {
            codedOutputStream.m(7, this.J);
        }
        if ((this.f3768w & 512) == 512) {
            codedOutputStream.m(8, this.K);
        }
        if ((this.f3768w & 16) == 16) {
            codedOutputStream.m(9, this.B);
        }
        if ((this.f3768w & 64) == 64) {
            codedOutputStream.m(10, this.E);
        }
        if ((this.f3768w & 1) == 1) {
            codedOutputStream.m(11, this.f3769x);
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            codedOutputStream.o(12, this.F.get(i10));
        }
        if (this.G.size() > 0) {
            codedOutputStream.v(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader);
            codedOutputStream.v(this.H);
        }
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            codedOutputStream.n(this.G.get(i11).intValue());
        }
        for (int i12 = 0; i12 < this.L.size(); i12++) {
            codedOutputStream.m(31, this.L.get(i12).intValue());
        }
        aVar.a(19000, codedOutputStream);
        codedOutputStream.r(this.f3767v);
    }

    public final void q() {
        this.f3769x = 518;
        this.f3770y = 2054;
        this.f3771z = 0;
        p pVar = p.N;
        this.A = pVar;
        this.B = 0;
        this.C = Collections.emptyList();
        this.D = pVar;
        this.E = 0;
        this.F = Collections.emptyList();
        this.G = Collections.emptyList();
        this.I = t.F;
        this.J = 0;
        this.K = 0;
        this.L = Collections.emptyList();
    }

    public m(int i6) {
        this.H = -1;
        this.M = (byte) -1;
        this.N = -1;
        this.f3767v = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public m(gu.d dVar, gu.e eVar) {
        this.H = -1;
        this.M = (byte) -1;
        this.N = -1;
        q();
        c.b bVar = new c.b();
        CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r52 = 256;
            if (!z10) {
                try {
                    try {
                        int n10 = dVar.n();
                        p.c cVar = null;
                        t.b bVar2 = null;
                        p.c cVar2 = null;
                        switch (n10) {
                            case 0:
                                break;
                            case 8:
                                this.f3768w |= 2;
                                this.f3770y = dVar.k();
                                continue;
                            case 16:
                                this.f3768w |= 4;
                                this.f3771z = dVar.k();
                                continue;
                            case 26:
                                if ((this.f3768w & 8) == 8) {
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
                                this.f3768w |= 8;
                                continue;
                            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                if (!(z11 & true)) {
                                    this.C = new ArrayList();
                                    z11 |= true;
                                }
                                this.C.add(dVar.g(r.H, eVar));
                                continue;
                            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                if ((this.f3768w & 32) == 32) {
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
                                this.f3768w |= 32;
                                continue;
                            case 50:
                                if ((this.f3768w & 128) == 128) {
                                    t tVar = this.I;
                                    tVar.getClass();
                                    bVar2 = new t.b();
                                    bVar2.m(tVar);
                                }
                                t tVar2 = (t) dVar.g(t.G, eVar);
                                this.I = tVar2;
                                if (bVar2 != null) {
                                    bVar2.m(tVar2);
                                    this.I = bVar2.l();
                                }
                                this.f3768w |= 128;
                                continue;
                            case R.styleable.AppCompatTheme_colorError /* 56 */:
                                this.f3768w |= 256;
                                this.J = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                this.f3768w |= 512;
                                this.K = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                this.f3768w |= 16;
                                this.B = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                this.f3768w |= 64;
                                this.E = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                this.f3768w |= 1;
                                this.f3769x = dVar.k();
                                continue;
                            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                                if (!(z11 & true)) {
                                    this.F = new ArrayList();
                                    z11 |= true;
                                }
                                this.F.add(dVar.g(p.O, eVar));
                                continue;
                            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                                if (!(z11 & true)) {
                                    this.G = new ArrayList();
                                    z11 |= true;
                                }
                                this.G.add(Integer.valueOf(dVar.k()));
                                continue;
                            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
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
                            case 248:
                                if (!(z11 & true)) {
                                    this.L = new ArrayList();
                                    z11 |= true;
                                }
                                this.L.add(Integer.valueOf(dVar.k()));
                                continue;
                            case 250:
                                int d11 = dVar.d(dVar.k());
                                if (!(z11 & true) && dVar.b() > 0) {
                                    this.L = new ArrayList();
                                    z11 |= true;
                                }
                                while (dVar.b() > 0) {
                                    this.L.add(Integer.valueOf(dVar.k()));
                                }
                                dVar.c(d11);
                                continue;
                                break;
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
                            this.F = Collections.unmodifiableList(this.F);
                        }
                        if (z11 & true) {
                            this.G = Collections.unmodifiableList(this.G);
                        }
                        if (z11 & true) {
                            this.L = Collections.unmodifiableList(this.L);
                        }
                        try {
                            j10.i();
                        } catch (IOException unused) {
                            this.f3767v = bVar.g();
                            m();
                            throw th2;
                        } catch (Throwable th3) {
                            this.f3767v = bVar.g();
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
                    this.F = Collections.unmodifiableList(this.F);
                }
                if (z11 & true) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                if (z11 & true) {
                    this.L = Collections.unmodifiableList(this.L);
                }
                try {
                    j10.i();
                } catch (IOException unused2) {
                    this.f3767v = bVar.g();
                    m();
                    return;
                } catch (Throwable th4) {
                    this.f3767v = bVar.g();
                    throw th4;
                }
            }
        }
    }
}
