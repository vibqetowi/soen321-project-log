package au;

import au.p;
import au.s;
import au.v;
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
public final class b extends g.c<b> {

    /* renamed from: d0  reason: collision with root package name */
    public static final b f3662d0;
    public static final a e0 = new a();
    public List<r> A;
    public List<p> B;
    public List<Integer> C;
    public int D;
    public List<Integer> E;
    public int F;
    public List<p> G;
    public List<Integer> H;
    public int I;
    public List<au.c> J;
    public List<h> K;
    public List<m> L;
    public List<q> M;
    public List<f> N;
    public List<Integer> O;
    public int P;
    public int Q;
    public p R;
    public int S;
    public List<Integer> T;
    public int U;
    public List<p> V;
    public List<Integer> W;
    public int X;
    public s Y;
    public List<Integer> Z;

    /* renamed from: a0  reason: collision with root package name */
    public v f3663a0;

    /* renamed from: b0  reason: collision with root package name */
    public byte f3664b0;
    public int c0;

    /* renamed from: v  reason: collision with root package name */
    public final gu.c f3665v;

    /* renamed from: w  reason: collision with root package name */
    public int f3666w;

    /* renamed from: x  reason: collision with root package name */
    public int f3667x;

    /* renamed from: y  reason: collision with root package name */
    public int f3668y;

    /* renamed from: z  reason: collision with root package name */
    public int f3669z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<b> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new b(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: au.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0067b extends g.b<b, C0067b> {
        public int A;
        public int N;
        public int P;

        /* renamed from: x  reason: collision with root package name */
        public int f3670x;

        /* renamed from: z  reason: collision with root package name */
        public int f3672z;

        /* renamed from: y  reason: collision with root package name */
        public int f3671y = 6;
        public List<r> B = Collections.emptyList();
        public List<p> C = Collections.emptyList();
        public List<Integer> D = Collections.emptyList();
        public List<Integer> E = Collections.emptyList();
        public List<p> F = Collections.emptyList();
        public List<Integer> G = Collections.emptyList();
        public List<au.c> H = Collections.emptyList();
        public List<h> I = Collections.emptyList();
        public List<m> J = Collections.emptyList();
        public List<q> K = Collections.emptyList();
        public List<f> L = Collections.emptyList();
        public List<Integer> M = Collections.emptyList();
        public p O = p.N;
        public List<Integer> Q = Collections.emptyList();
        public List<p> R = Collections.emptyList();
        public List<Integer> S = Collections.emptyList();
        public s T = s.A;
        public List<Integer> U = Collections.emptyList();
        public v V = v.f3889y;

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            b l2 = l();
            if (l2.d()) {
                return l2;
            }
            throw new UninitializedMessageException();
        }

        @Override // gu.g.a
        public final Object clone() {
            C0067b c0067b = new C0067b();
            c0067b.m(l());
            return c0067b;
        }

        @Override // gu.a.AbstractC0262a
        public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.g.a
        public final g.a i() {
            C0067b c0067b = new C0067b();
            c0067b.m(l());
            return c0067b;
        }

        @Override // gu.g.a
        public final /* bridge */ /* synthetic */ g.a j(gu.g gVar) {
            m((b) gVar);
            return this;
        }

        public final b l() {
            b bVar = new b(this);
            int i6 = this.f3670x;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            bVar.f3667x = this.f3671y;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            bVar.f3668y = this.f3672z;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            bVar.f3669z = this.A;
            if ((i6 & 8) == 8) {
                this.B = Collections.unmodifiableList(this.B);
                this.f3670x &= -9;
            }
            bVar.A = this.B;
            if ((this.f3670x & 16) == 16) {
                this.C = Collections.unmodifiableList(this.C);
                this.f3670x &= -17;
            }
            bVar.B = this.C;
            if ((this.f3670x & 32) == 32) {
                this.D = Collections.unmodifiableList(this.D);
                this.f3670x &= -33;
            }
            bVar.C = this.D;
            if ((this.f3670x & 64) == 64) {
                this.E = Collections.unmodifiableList(this.E);
                this.f3670x &= -65;
            }
            bVar.E = this.E;
            if ((this.f3670x & 128) == 128) {
                this.F = Collections.unmodifiableList(this.F);
                this.f3670x &= -129;
            }
            bVar.G = this.F;
            if ((this.f3670x & 256) == 256) {
                this.G = Collections.unmodifiableList(this.G);
                this.f3670x &= -257;
            }
            bVar.H = this.G;
            if ((this.f3670x & 512) == 512) {
                this.H = Collections.unmodifiableList(this.H);
                this.f3670x &= -513;
            }
            bVar.J = this.H;
            if ((this.f3670x & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 1024) {
                this.I = Collections.unmodifiableList(this.I);
                this.f3670x &= -1025;
            }
            bVar.K = this.I;
            if ((this.f3670x & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) == 2048) {
                this.J = Collections.unmodifiableList(this.J);
                this.f3670x &= -2049;
            }
            bVar.L = this.J;
            if ((this.f3670x & 4096) == 4096) {
                this.K = Collections.unmodifiableList(this.K);
                this.f3670x &= -4097;
            }
            bVar.M = this.K;
            if ((this.f3670x & 8192) == 8192) {
                this.L = Collections.unmodifiableList(this.L);
                this.f3670x &= -8193;
            }
            bVar.N = this.L;
            if ((this.f3670x & 16384) == 16384) {
                this.M = Collections.unmodifiableList(this.M);
                this.f3670x &= -16385;
            }
            bVar.O = this.M;
            if ((i6 & 32768) == 32768) {
                i10 |= 8;
            }
            bVar.Q = this.N;
            if ((i6 & 65536) == 65536) {
                i10 |= 16;
            }
            bVar.R = this.O;
            if ((i6 & 131072) == 131072) {
                i10 |= 32;
            }
            bVar.S = this.P;
            if ((this.f3670x & 262144) == 262144) {
                this.Q = Collections.unmodifiableList(this.Q);
                this.f3670x &= -262145;
            }
            bVar.T = this.Q;
            if ((this.f3670x & 524288) == 524288) {
                this.R = Collections.unmodifiableList(this.R);
                this.f3670x &= -524289;
            }
            bVar.V = this.R;
            if ((this.f3670x & 1048576) == 1048576) {
                this.S = Collections.unmodifiableList(this.S);
                this.f3670x &= -1048577;
            }
            bVar.W = this.S;
            if ((i6 & 2097152) == 2097152) {
                i10 |= 64;
            }
            bVar.Y = this.T;
            if ((this.f3670x & 4194304) == 4194304) {
                this.U = Collections.unmodifiableList(this.U);
                this.f3670x &= -4194305;
            }
            bVar.Z = this.U;
            if ((i6 & 8388608) == 8388608) {
                i10 |= 128;
            }
            bVar.f3663a0 = this.V;
            bVar.f3666w = i10;
            return bVar;
        }

        public final C0067b m(b bVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            v vVar;
            s sVar;
            p pVar;
            if (bVar == b.f3662d0) {
                return this;
            }
            int i6 = bVar.f3666w;
            boolean z17 = false;
            if ((i6 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = bVar.f3667x;
                this.f3670x |= 1;
                this.f3671y = i10;
            }
            if ((i6 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i11 = bVar.f3668y;
                this.f3670x = 2 | this.f3670x;
                this.f3672z = i11;
            }
            if ((i6 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int i12 = bVar.f3669z;
                this.f3670x = 4 | this.f3670x;
                this.A = i12;
            }
            if (!bVar.A.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = bVar.A;
                    this.f3670x &= -9;
                } else {
                    if ((this.f3670x & 8) != 8) {
                        this.B = new ArrayList(this.B);
                        this.f3670x |= 8;
                    }
                    this.B.addAll(bVar.A);
                }
            }
            if (!bVar.B.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = bVar.B;
                    this.f3670x &= -17;
                } else {
                    if ((this.f3670x & 16) != 16) {
                        this.C = new ArrayList(this.C);
                        this.f3670x |= 16;
                    }
                    this.C.addAll(bVar.B);
                }
            }
            if (!bVar.C.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = bVar.C;
                    this.f3670x &= -33;
                } else {
                    if ((this.f3670x & 32) != 32) {
                        this.D = new ArrayList(this.D);
                        this.f3670x |= 32;
                    }
                    this.D.addAll(bVar.C);
                }
            }
            if (!bVar.E.isEmpty()) {
                if (this.E.isEmpty()) {
                    this.E = bVar.E;
                    this.f3670x &= -65;
                } else {
                    if ((this.f3670x & 64) != 64) {
                        this.E = new ArrayList(this.E);
                        this.f3670x |= 64;
                    }
                    this.E.addAll(bVar.E);
                }
            }
            if (!bVar.G.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = bVar.G;
                    this.f3670x &= -129;
                } else {
                    if ((this.f3670x & 128) != 128) {
                        this.F = new ArrayList(this.F);
                        this.f3670x |= 128;
                    }
                    this.F.addAll(bVar.G);
                }
            }
            if (!bVar.H.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = bVar.H;
                    this.f3670x &= -257;
                } else {
                    if ((this.f3670x & 256) != 256) {
                        this.G = new ArrayList(this.G);
                        this.f3670x |= 256;
                    }
                    this.G.addAll(bVar.H);
                }
            }
            if (!bVar.J.isEmpty()) {
                if (this.H.isEmpty()) {
                    this.H = bVar.J;
                    this.f3670x &= -513;
                } else {
                    if ((this.f3670x & 512) != 512) {
                        this.H = new ArrayList(this.H);
                        this.f3670x |= 512;
                    }
                    this.H.addAll(bVar.J);
                }
            }
            if (!bVar.K.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = bVar.K;
                    this.f3670x &= -1025;
                } else {
                    if ((this.f3670x & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 1024) {
                        this.I = new ArrayList(this.I);
                        this.f3670x |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                    }
                    this.I.addAll(bVar.K);
                }
            }
            if (!bVar.L.isEmpty()) {
                if (this.J.isEmpty()) {
                    this.J = bVar.L;
                    this.f3670x &= -2049;
                } else {
                    if ((this.f3670x & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 2048) {
                        this.J = new ArrayList(this.J);
                        this.f3670x |= Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
                    }
                    this.J.addAll(bVar.L);
                }
            }
            if (!bVar.M.isEmpty()) {
                if (this.K.isEmpty()) {
                    this.K = bVar.M;
                    this.f3670x &= -4097;
                } else {
                    if ((this.f3670x & 4096) != 4096) {
                        this.K = new ArrayList(this.K);
                        this.f3670x |= 4096;
                    }
                    this.K.addAll(bVar.M);
                }
            }
            if (!bVar.N.isEmpty()) {
                if (this.L.isEmpty()) {
                    this.L = bVar.N;
                    this.f3670x &= -8193;
                } else {
                    if ((this.f3670x & 8192) != 8192) {
                        this.L = new ArrayList(this.L);
                        this.f3670x |= 8192;
                    }
                    this.L.addAll(bVar.N);
                }
            }
            if (!bVar.O.isEmpty()) {
                if (this.M.isEmpty()) {
                    this.M = bVar.O;
                    this.f3670x &= -16385;
                } else {
                    if ((this.f3670x & 16384) != 16384) {
                        this.M = new ArrayList(this.M);
                        this.f3670x |= 16384;
                    }
                    this.M.addAll(bVar.O);
                }
            }
            int i13 = bVar.f3666w;
            if ((i13 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                int i14 = bVar.Q;
                this.f3670x |= 32768;
                this.N = i14;
            }
            if ((i13 & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                p pVar2 = bVar.R;
                if ((this.f3670x & 65536) == 65536 && (pVar = this.O) != p.N) {
                    p.c s10 = p.s(pVar);
                    s10.m(pVar2);
                    this.O = s10.l();
                } else {
                    this.O = pVar2;
                }
                this.f3670x |= 65536;
            }
            if ((bVar.f3666w & 32) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                int i15 = bVar.S;
                this.f3670x |= 131072;
                this.P = i15;
            }
            if (!bVar.T.isEmpty()) {
                if (this.Q.isEmpty()) {
                    this.Q = bVar.T;
                    this.f3670x &= -262145;
                } else {
                    if ((this.f3670x & 262144) != 262144) {
                        this.Q = new ArrayList(this.Q);
                        this.f3670x |= 262144;
                    }
                    this.Q.addAll(bVar.T);
                }
            }
            if (!bVar.V.isEmpty()) {
                if (this.R.isEmpty()) {
                    this.R = bVar.V;
                    this.f3670x &= -524289;
                } else {
                    if ((this.f3670x & 524288) != 524288) {
                        this.R = new ArrayList(this.R);
                        this.f3670x |= 524288;
                    }
                    this.R.addAll(bVar.V);
                }
            }
            if (!bVar.W.isEmpty()) {
                if (this.S.isEmpty()) {
                    this.S = bVar.W;
                    this.f3670x &= -1048577;
                } else {
                    if ((this.f3670x & 1048576) != 1048576) {
                        this.S = new ArrayList(this.S);
                        this.f3670x |= 1048576;
                    }
                    this.S.addAll(bVar.W);
                }
            }
            if ((bVar.f3666w & 64) == 64) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                s sVar2 = bVar.Y;
                if ((this.f3670x & 2097152) == 2097152 && (sVar = this.T) != s.A) {
                    s.b i16 = s.i(sVar);
                    i16.l(sVar2);
                    this.T = i16.k();
                } else {
                    this.T = sVar2;
                }
                this.f3670x |= 2097152;
            }
            if (!bVar.Z.isEmpty()) {
                if (this.U.isEmpty()) {
                    this.U = bVar.Z;
                    this.f3670x &= -4194305;
                } else {
                    if ((this.f3670x & 4194304) != 4194304) {
                        this.U = new ArrayList(this.U);
                        this.f3670x |= 4194304;
                    }
                    this.U.addAll(bVar.Z);
                }
            }
            if ((bVar.f3666w & 128) == 128) {
                z17 = true;
            }
            if (z17) {
                v vVar2 = bVar.f3663a0;
                if ((this.f3670x & 8388608) == 8388608 && (vVar = this.V) != v.f3889y) {
                    v.b bVar2 = new v.b();
                    bVar2.l(vVar);
                    bVar2.l(vVar2);
                    this.V = bVar2.k();
                } else {
                    this.V = vVar2;
                }
                this.f3670x |= 8388608;
            }
            k(bVar);
            this.f16856u = this.f16856u.g(bVar.f3665v);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(gu.d dVar, gu.e eVar) {
            b bVar;
            try {
                try {
                    b.e0.getClass();
                    m(new b(dVar, eVar));
                } catch (InvalidProtocolBufferException e10) {
                    bVar = (b) e10.f23476u;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bVar != null) {
                            m(bVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = null;
                if (bVar != null) {
                }
                throw th;
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum c implements h.a {
        CLASS(0),
        INTERFACE(1),
        ENUM_CLASS(2),
        /* JADX INFO: Fake field, exist only in values array */
        ENUM_ENTRY(3),
        ANNOTATION_CLASS(4),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(5),
        COMPANION_OBJECT(6);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f3678u;

        c(int i6) {
            this.f3678u = i6;
        }

        @Override // gu.h.a
        public final int e() {
            return this.f3678u;
        }
    }

    static {
        b bVar = new b(0);
        f3662d0 = bVar;
        bVar.q();
    }

    public b() {
        throw null;
    }

    public b(g.b bVar) {
        super(bVar);
        this.D = -1;
        this.F = -1;
        this.I = -1;
        this.P = -1;
        this.U = -1;
        this.X = -1;
        this.f3664b0 = (byte) -1;
        this.c0 = -1;
        this.f3665v = bVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        C0067b c0067b = new C0067b();
        c0067b.m(this);
        return c0067b;
    }

    @Override // gu.n
    public final int b() {
        int i6;
        int i10 = this.c0;
        if (i10 != -1) {
            return i10;
        }
        if ((this.f3666w & 1) == 1) {
            i6 = CodedOutputStream.b(1, this.f3667x) + 0;
        } else {
            i6 = 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.C.size(); i12++) {
            i11 += CodedOutputStream.c(this.C.get(i12).intValue());
        }
        int i13 = i6 + i11;
        if (!this.C.isEmpty()) {
            i13 = i13 + 1 + CodedOutputStream.c(i11);
        }
        this.D = i11;
        if ((this.f3666w & 2) == 2) {
            i13 += CodedOutputStream.b(3, this.f3668y);
        }
        if ((this.f3666w & 4) == 4) {
            i13 += CodedOutputStream.b(4, this.f3669z);
        }
        for (int i14 = 0; i14 < this.A.size(); i14++) {
            i13 += CodedOutputStream.d(5, this.A.get(i14));
        }
        for (int i15 = 0; i15 < this.B.size(); i15++) {
            i13 += CodedOutputStream.d(6, this.B.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.E.size(); i17++) {
            i16 += CodedOutputStream.c(this.E.get(i17).intValue());
        }
        int i18 = i13 + i16;
        if (!this.E.isEmpty()) {
            i18 = i18 + 1 + CodedOutputStream.c(i16);
        }
        this.F = i16;
        for (int i19 = 0; i19 < this.J.size(); i19++) {
            i18 += CodedOutputStream.d(8, this.J.get(i19));
        }
        for (int i20 = 0; i20 < this.K.size(); i20++) {
            i18 += CodedOutputStream.d(9, this.K.get(i20));
        }
        for (int i21 = 0; i21 < this.L.size(); i21++) {
            i18 += CodedOutputStream.d(10, this.L.get(i21));
        }
        for (int i22 = 0; i22 < this.M.size(); i22++) {
            i18 += CodedOutputStream.d(11, this.M.get(i22));
        }
        for (int i23 = 0; i23 < this.N.size(); i23++) {
            i18 += CodedOutputStream.d(13, this.N.get(i23));
        }
        int i24 = 0;
        for (int i25 = 0; i25 < this.O.size(); i25++) {
            i24 += CodedOutputStream.c(this.O.get(i25).intValue());
        }
        int i26 = i18 + i24;
        if (!this.O.isEmpty()) {
            i26 = i26 + 2 + CodedOutputStream.c(i24);
        }
        this.P = i24;
        if ((this.f3666w & 8) == 8) {
            i26 += CodedOutputStream.b(17, this.Q);
        }
        if ((this.f3666w & 16) == 16) {
            i26 += CodedOutputStream.d(18, this.R);
        }
        if ((this.f3666w & 32) == 32) {
            i26 += CodedOutputStream.b(19, this.S);
        }
        for (int i27 = 0; i27 < this.G.size(); i27++) {
            i26 += CodedOutputStream.d(20, this.G.get(i27));
        }
        int i28 = 0;
        for (int i29 = 0; i29 < this.H.size(); i29++) {
            i28 += CodedOutputStream.c(this.H.get(i29).intValue());
        }
        int i30 = i26 + i28;
        if (!this.H.isEmpty()) {
            i30 = i30 + 2 + CodedOutputStream.c(i28);
        }
        this.I = i28;
        int i31 = 0;
        for (int i32 = 0; i32 < this.T.size(); i32++) {
            i31 += CodedOutputStream.c(this.T.get(i32).intValue());
        }
        int i33 = i30 + i31;
        if (!this.T.isEmpty()) {
            i33 = i33 + 2 + CodedOutputStream.c(i31);
        }
        this.U = i31;
        for (int i34 = 0; i34 < this.V.size(); i34++) {
            i33 += CodedOutputStream.d(23, this.V.get(i34));
        }
        int i35 = 0;
        for (int i36 = 0; i36 < this.W.size(); i36++) {
            i35 += CodedOutputStream.c(this.W.get(i36).intValue());
        }
        int i37 = i33 + i35;
        if (!this.W.isEmpty()) {
            i37 = i37 + 2 + CodedOutputStream.c(i35);
        }
        this.X = i35;
        if ((this.f3666w & 64) == 64) {
            i37 += CodedOutputStream.d(30, this.Y);
        }
        int i38 = 0;
        for (int i39 = 0; i39 < this.Z.size(); i39++) {
            i38 += CodedOutputStream.c(this.Z.get(i39).intValue());
        }
        int size = (this.Z.size() * 2) + i37 + i38;
        if ((this.f3666w & 128) == 128) {
            size += CodedOutputStream.d(32, this.f3663a0);
        }
        int size2 = this.f3665v.size() + j() + size;
        this.c0 = size2;
        return size2;
    }

    @Override // gu.n
    public final n.a c() {
        return new C0067b();
    }

    @Override // gu.o
    public final boolean d() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte b10 = this.f3664b0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f3666w & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f3664b0 = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.A.size(); i6++) {
            if (!this.A.get(i6).d()) {
                this.f3664b0 = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            if (!this.B.get(i10).d()) {
                this.f3664b0 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            if (!this.G.get(i11).d()) {
                this.f3664b0 = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.J.size(); i12++) {
            if (!this.J.get(i12).d()) {
                this.f3664b0 = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.K.size(); i13++) {
            if (!this.K.get(i13).d()) {
                this.f3664b0 = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.L.size(); i14++) {
            if (!this.L.get(i14).d()) {
                this.f3664b0 = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.M.size(); i15++) {
            if (!this.M.get(i15).d()) {
                this.f3664b0 = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.N.size(); i16++) {
            if (!this.N.get(i16).d()) {
                this.f3664b0 = (byte) 0;
                return false;
            }
        }
        if ((this.f3666w & 16) == 16) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.R.d()) {
            this.f3664b0 = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.V.size(); i17++) {
            if (!this.V.get(i17).d()) {
                this.f3664b0 = (byte) 0;
                return false;
            }
        }
        if ((this.f3666w & 64) == 64) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.Y.d()) {
            this.f3664b0 = (byte) 0;
            return false;
        } else if (!i()) {
            this.f3664b0 = (byte) 0;
            return false;
        } else {
            this.f3664b0 = (byte) 1;
            return true;
        }
    }

    @Override // gu.o
    public final gu.n e() {
        return f3662d0;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        g.c.a aVar = new g.c.a(this);
        if ((this.f3666w & 1) == 1) {
            codedOutputStream.m(1, this.f3667x);
        }
        if (this.C.size() > 0) {
            codedOutputStream.v(18);
            codedOutputStream.v(this.D);
        }
        for (int i6 = 0; i6 < this.C.size(); i6++) {
            codedOutputStream.n(this.C.get(i6).intValue());
        }
        if ((this.f3666w & 2) == 2) {
            codedOutputStream.m(3, this.f3668y);
        }
        if ((this.f3666w & 4) == 4) {
            codedOutputStream.m(4, this.f3669z);
        }
        for (int i10 = 0; i10 < this.A.size(); i10++) {
            codedOutputStream.o(5, this.A.get(i10));
        }
        for (int i11 = 0; i11 < this.B.size(); i11++) {
            codedOutputStream.o(6, this.B.get(i11));
        }
        if (this.E.size() > 0) {
            codedOutputStream.v(58);
            codedOutputStream.v(this.F);
        }
        for (int i12 = 0; i12 < this.E.size(); i12++) {
            codedOutputStream.n(this.E.get(i12).intValue());
        }
        for (int i13 = 0; i13 < this.J.size(); i13++) {
            codedOutputStream.o(8, this.J.get(i13));
        }
        for (int i14 = 0; i14 < this.K.size(); i14++) {
            codedOutputStream.o(9, this.K.get(i14));
        }
        for (int i15 = 0; i15 < this.L.size(); i15++) {
            codedOutputStream.o(10, this.L.get(i15));
        }
        for (int i16 = 0; i16 < this.M.size(); i16++) {
            codedOutputStream.o(11, this.M.get(i16));
        }
        for (int i17 = 0; i17 < this.N.size(); i17++) {
            codedOutputStream.o(13, this.N.get(i17));
        }
        if (this.O.size() > 0) {
            codedOutputStream.v(130);
            codedOutputStream.v(this.P);
        }
        for (int i18 = 0; i18 < this.O.size(); i18++) {
            codedOutputStream.n(this.O.get(i18).intValue());
        }
        if ((this.f3666w & 8) == 8) {
            codedOutputStream.m(17, this.Q);
        }
        if ((this.f3666w & 16) == 16) {
            codedOutputStream.o(18, this.R);
        }
        if ((this.f3666w & 32) == 32) {
            codedOutputStream.m(19, this.S);
        }
        for (int i19 = 0; i19 < this.G.size(); i19++) {
            codedOutputStream.o(20, this.G.get(i19));
        }
        if (this.H.size() > 0) {
            codedOutputStream.v(170);
            codedOutputStream.v(this.I);
        }
        for (int i20 = 0; i20 < this.H.size(); i20++) {
            codedOutputStream.n(this.H.get(i20).intValue());
        }
        if (this.T.size() > 0) {
            codedOutputStream.v(178);
            codedOutputStream.v(this.U);
        }
        for (int i21 = 0; i21 < this.T.size(); i21++) {
            codedOutputStream.n(this.T.get(i21).intValue());
        }
        for (int i22 = 0; i22 < this.V.size(); i22++) {
            codedOutputStream.o(23, this.V.get(i22));
        }
        if (this.W.size() > 0) {
            codedOutputStream.v(194);
            codedOutputStream.v(this.X);
        }
        for (int i23 = 0; i23 < this.W.size(); i23++) {
            codedOutputStream.n(this.W.get(i23).intValue());
        }
        if ((this.f3666w & 64) == 64) {
            codedOutputStream.o(30, this.Y);
        }
        for (int i24 = 0; i24 < this.Z.size(); i24++) {
            codedOutputStream.m(31, this.Z.get(i24).intValue());
        }
        if ((this.f3666w & 128) == 128) {
            codedOutputStream.o(32, this.f3663a0);
        }
        aVar.a(19000, codedOutputStream);
        codedOutputStream.r(this.f3665v);
    }

    public final void q() {
        this.f3667x = 6;
        this.f3668y = 0;
        this.f3669z = 0;
        this.A = Collections.emptyList();
        this.B = Collections.emptyList();
        this.C = Collections.emptyList();
        this.E = Collections.emptyList();
        this.G = Collections.emptyList();
        this.H = Collections.emptyList();
        this.J = Collections.emptyList();
        this.K = Collections.emptyList();
        this.L = Collections.emptyList();
        this.M = Collections.emptyList();
        this.N = Collections.emptyList();
        this.O = Collections.emptyList();
        this.Q = 0;
        this.R = p.N;
        this.S = 0;
        this.T = Collections.emptyList();
        this.V = Collections.emptyList();
        this.W = Collections.emptyList();
        this.Y = s.A;
        this.Z = Collections.emptyList();
        this.f3663a0 = v.f3889y;
    }

    public b(int i6) {
        this.D = -1;
        this.F = -1;
        this.I = -1;
        this.P = -1;
        this.U = -1;
        this.X = -1;
        this.f3664b0 = (byte) -1;
        this.c0 = -1;
        this.f3665v = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(gu.d dVar, gu.e eVar) {
        v.b bVar;
        this.D = -1;
        this.F = -1;
        this.I = -1;
        this.P = -1;
        this.U = -1;
        this.X = -1;
        this.f3664b0 = (byte) -1;
        this.c0 = -1;
        q();
        c.b v10 = gu.c.v();
        CodedOutputStream j10 = CodedOutputStream.j(v10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = dVar.n();
                    switch (n10) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f3666w |= 1;
                            this.f3667x = dVar.f();
                            break;
                        case 16:
                            if (!(z11 & true)) {
                                this.C = new ArrayList();
                                z11 |= true;
                            }
                            this.C.add(Integer.valueOf(dVar.f()));
                            break;
                        case 18:
                            int d10 = dVar.d(dVar.k());
                            if (!(z11 & true) && dVar.b() > 0) {
                                this.C = new ArrayList();
                                z11 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.C.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d10);
                            break;
                        case 24:
                            this.f3666w |= 2;
                            this.f3668y = dVar.f();
                            break;
                        case 32:
                            this.f3666w |= 4;
                            this.f3669z = dVar.f();
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            if (!(z11 & true)) {
                                this.A = new ArrayList();
                                z11 |= true;
                            }
                            this.A.add(dVar.g(r.H, eVar));
                            break;
                        case 50:
                            if (!(z11 & true)) {
                                this.B = new ArrayList();
                                z11 |= true;
                            }
                            this.B.add(dVar.g(p.O, eVar));
                            break;
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                            if (!(z11 & true)) {
                                this.E = new ArrayList();
                                z11 |= true;
                            }
                            this.E.add(Integer.valueOf(dVar.f()));
                            break;
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            int d11 = dVar.d(dVar.k());
                            if (!(z11 & true) && dVar.b() > 0) {
                                this.E = new ArrayList();
                                z11 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.E.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d11);
                            break;
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            if (!(z11 & true)) {
                                this.J = new ArrayList();
                                z11 |= true;
                            }
                            this.J.add(dVar.g(au.c.D, eVar));
                            break;
                        case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                            if (!(z11 & true)) {
                                this.K = new ArrayList();
                                z11 |= true;
                            }
                            this.K.add(dVar.g(h.P, eVar));
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                            if (!(z11 & true)) {
                                this.L = new ArrayList();
                                z11 |= true;
                            }
                            this.L.add(dVar.g(m.P, eVar));
                            break;
                        case 90:
                            if (!(z11 & true)) {
                                this.M = new ArrayList();
                                z11 |= true;
                            }
                            this.M.add(dVar.g(q.J, eVar));
                            break;
                        case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                            if (!(z11 & true)) {
                                this.N = new ArrayList();
                                z11 |= true;
                            }
                            this.N.add(dVar.g(f.B, eVar));
                            break;
                        case 128:
                            if (!(z11 & true)) {
                                this.O = new ArrayList();
                                z11 |= true;
                            }
                            this.O.add(Integer.valueOf(dVar.f()));
                            break;
                        case 130:
                            int d12 = dVar.d(dVar.k());
                            if (!(z11 & true) && dVar.b() > 0) {
                                this.O = new ArrayList();
                                z11 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.O.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d12);
                            break;
                        case 136:
                            this.f3666w |= 8;
                            this.Q = dVar.f();
                            break;
                        case 146:
                            p.c t3 = (this.f3666w & 16) == 16 ? this.R.t() : null;
                            p pVar = (p) dVar.g(p.O, eVar);
                            this.R = pVar;
                            if (t3 != null) {
                                t3.m(pVar);
                                this.R = t3.l();
                            }
                            this.f3666w |= 16;
                            break;
                        case 152:
                            this.f3666w |= 32;
                            this.S = dVar.f();
                            break;
                        case 162:
                            if (!(z11 & true)) {
                                this.G = new ArrayList();
                                z11 |= true;
                            }
                            this.G.add(dVar.g(p.O, eVar));
                            break;
                        case 168:
                            if (!(z11 & true)) {
                                this.H = new ArrayList();
                                z11 |= true;
                            }
                            this.H.add(Integer.valueOf(dVar.f()));
                            break;
                        case 170:
                            int d13 = dVar.d(dVar.k());
                            if (!(z11 & true) && dVar.b() > 0) {
                                this.H = new ArrayList();
                                z11 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.H.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d13);
                            break;
                        case 176:
                            if (!(z11 & true)) {
                                this.T = new ArrayList();
                                z11 |= true;
                            }
                            this.T.add(Integer.valueOf(dVar.f()));
                            break;
                        case 178:
                            int d14 = dVar.d(dVar.k());
                            if (!(z11 & true) && dVar.b() > 0) {
                                this.T = new ArrayList();
                                z11 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.T.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d14);
                            break;
                        case 186:
                            if (!(z11 & true)) {
                                this.V = new ArrayList();
                                z11 |= true;
                            }
                            this.V.add(dVar.g(p.O, eVar));
                            break;
                        case 192:
                            if (!(z11 & true)) {
                                this.W = new ArrayList();
                                z11 |= true;
                            }
                            this.W.add(Integer.valueOf(dVar.f()));
                            break;
                        case 194:
                            int d15 = dVar.d(dVar.k());
                            if (!(z11 & true) && dVar.b() > 0) {
                                this.W = new ArrayList();
                                z11 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.W.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d15);
                            break;
                        case 242:
                            s.b j11 = (this.f3666w & 64) == 64 ? this.Y.j() : null;
                            s sVar = (s) dVar.g(s.B, eVar);
                            this.Y = sVar;
                            if (j11 != null) {
                                j11.l(sVar);
                                this.Y = j11.k();
                            }
                            this.f3666w |= 64;
                            break;
                        case 248:
                            if (!(z11 & true)) {
                                this.Z = new ArrayList();
                                z11 |= true;
                            }
                            this.Z.add(Integer.valueOf(dVar.f()));
                            break;
                        case 250:
                            int d16 = dVar.d(dVar.k());
                            if (!(z11 & true) && dVar.b() > 0) {
                                this.Z = new ArrayList();
                                z11 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.Z.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d16);
                            break;
                        case 258:
                            if ((this.f3666w & 128) == 128) {
                                v vVar = this.f3663a0;
                                vVar.getClass();
                                bVar = new v.b();
                                bVar.l(vVar);
                            } else {
                                bVar = null;
                            }
                            v vVar2 = (v) dVar.g(v.f3890z, eVar);
                            this.f3663a0 = vVar2;
                            if (bVar != null) {
                                bVar.l(vVar2);
                                this.f3663a0 = bVar.k();
                            }
                            this.f3666w |= 128;
                            break;
                        default:
                            if (o(dVar, j10, eVar, n10)) {
                                break;
                            }
                            z10 = true;
                            break;
                    }
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.C = Collections.unmodifiableList(this.C);
                    }
                    if (z11 & true) {
                        this.A = Collections.unmodifiableList(this.A);
                    }
                    if (z11 & true) {
                        this.B = Collections.unmodifiableList(this.B);
                    }
                    if (z11 & true) {
                        this.E = Collections.unmodifiableList(this.E);
                    }
                    if (z11 & true) {
                        this.J = Collections.unmodifiableList(this.J);
                    }
                    if (z11 & true) {
                        this.K = Collections.unmodifiableList(this.K);
                    }
                    if (z11 & true) {
                        this.L = Collections.unmodifiableList(this.L);
                    }
                    if (z11 & true) {
                        this.M = Collections.unmodifiableList(this.M);
                    }
                    if (z11 & true) {
                        this.N = Collections.unmodifiableList(this.N);
                    }
                    if (z11 & true) {
                        this.O = Collections.unmodifiableList(this.O);
                    }
                    if (z11 & true) {
                        this.G = Collections.unmodifiableList(this.G);
                    }
                    if (z11 & true) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    if (z11 & true) {
                        this.T = Collections.unmodifiableList(this.T);
                    }
                    if (z11 & true) {
                        this.V = Collections.unmodifiableList(this.V);
                    }
                    if (z11 & true) {
                        this.W = Collections.unmodifiableList(this.W);
                    }
                    if (z11 & true) {
                        this.Z = Collections.unmodifiableList(this.Z);
                    }
                    try {
                        j10.i();
                    } catch (IOException unused) {
                        this.f3665v = v10.g();
                        m();
                        throw th2;
                    } catch (Throwable th3) {
                        this.f3665v = v10.g();
                        throw th3;
                    }
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.a(this);
                throw e10;
            } catch (IOException e11) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                invalidProtocolBufferException.a(this);
                throw invalidProtocolBufferException;
            }
        }
        if (z11 & true) {
            this.C = Collections.unmodifiableList(this.C);
        }
        if (z11 & true) {
            this.A = Collections.unmodifiableList(this.A);
        }
        if (z11 & true) {
            this.B = Collections.unmodifiableList(this.B);
        }
        if (z11 & true) {
            this.E = Collections.unmodifiableList(this.E);
        }
        if (z11 & true) {
            this.J = Collections.unmodifiableList(this.J);
        }
        if (z11 & true) {
            this.K = Collections.unmodifiableList(this.K);
        }
        if (z11 & true) {
            this.L = Collections.unmodifiableList(this.L);
        }
        if (z11 & true) {
            this.M = Collections.unmodifiableList(this.M);
        }
        if (z11 & true) {
            this.N = Collections.unmodifiableList(this.N);
        }
        if (z11 & true) {
            this.O = Collections.unmodifiableList(this.O);
        }
        if (z11 & true) {
            this.G = Collections.unmodifiableList(this.G);
        }
        if (z11 & true) {
            this.H = Collections.unmodifiableList(this.H);
        }
        if (z11 & true) {
            this.T = Collections.unmodifiableList(this.T);
        }
        if (z11 & true) {
            this.V = Collections.unmodifiableList(this.V);
        }
        if (z11 & true) {
            this.W = Collections.unmodifiableList(this.W);
        }
        if (z11 & true) {
            this.Z = Collections.unmodifiableList(this.Z);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
            this.f3665v = v10.g();
            m();
        } catch (Throwable th4) {
            this.f3665v = v10.g();
            throw th4;
        }
    }
}
