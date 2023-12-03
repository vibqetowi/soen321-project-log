package com.google.android.exoplayer2.source;

import android.net.Uri;
import b9.f;
import b9.t;
import b9.u;
import c9.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader;
import com.theinnerhour.b2b.utils.Constants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o7.x;
/* compiled from: SingleSampleMediaPeriod.java */
/* loaded from: classes.dex */
public final class r implements h, Loader.a<b> {
    public final long B;
    public final com.google.android.exoplayer2.n D;
    public final boolean E;
    public boolean F;
    public byte[] G;
    public int H;

    /* renamed from: u  reason: collision with root package name */
    public final b9.h f7003u;

    /* renamed from: v  reason: collision with root package name */
    public final f.a f7004v;

    /* renamed from: w  reason: collision with root package name */
    public final u f7005w;

    /* renamed from: x  reason: collision with root package name */
    public final b9.r f7006x;

    /* renamed from: y  reason: collision with root package name */
    public final j.a f7007y;

    /* renamed from: z  reason: collision with root package name */
    public final o8.p f7008z;
    public final ArrayList<a> A = new ArrayList<>();
    public final Loader C = new Loader("SingleSampleMediaPeriod");

    /* compiled from: SingleSampleMediaPeriod.java */
    /* loaded from: classes.dex */
    public final class a implements o8.k {

        /* renamed from: u  reason: collision with root package name */
        public int f7009u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f7010v;

        public a() {
        }

        public final void a() {
            if (!this.f7010v) {
                r rVar = r.this;
                j.a aVar = rVar.f7007y;
                aVar.b(new o8.e(1, c9.l.g(rVar.D.F), rVar.D, 0, null, aVar.a(0L), -9223372036854775807L));
                this.f7010v = true;
            }
        }

        @Override // o8.k
        public final void b() {
            IOException iOException;
            r rVar = r.this;
            if (!rVar.E) {
                Loader loader = rVar.C;
                IOException iOException2 = loader.f7163c;
                if (iOException2 == null) {
                    Loader.c<? extends Loader.d> cVar = loader.f7162b;
                    if (cVar != null && (iOException = cVar.f7170y) != null && cVar.f7171z > cVar.f7166u) {
                        throw iOException;
                    }
                    return;
                }
                throw iOException2;
            }
        }

        @Override // o8.k
        public final int c(long j10) {
            a();
            if (j10 > 0 && this.f7009u != 2) {
                this.f7009u = 2;
                return 1;
            }
            return 0;
        }

        @Override // o8.k
        public final int f(androidx.appcompat.widget.l lVar, DecoderInputBuffer decoderInputBuffer, int i6) {
            a();
            r rVar = r.this;
            boolean z10 = rVar.F;
            if (z10 && rVar.G == null) {
                this.f7009u = 2;
            }
            int i10 = this.f7009u;
            if (i10 == 2) {
                decoderInputBuffer.j(4);
                return -4;
            } else if ((i6 & 2) == 0 && i10 != 0) {
                if (!z10) {
                    return -3;
                }
                rVar.G.getClass();
                decoderInputBuffer.j(1);
                decoderInputBuffer.f6362y = 0L;
                if ((i6 & 4) == 0) {
                    decoderInputBuffer.r(rVar.H);
                    decoderInputBuffer.f6360w.put(rVar.G, 0, rVar.H);
                }
                if ((i6 & 1) == 0) {
                    this.f7009u = 2;
                }
                return -4;
            } else {
                lVar.f1472w = rVar.D;
                this.f7009u = 1;
                return -5;
            }
        }

        @Override // o8.k
        public final boolean isReady() {
            return r.this.F;
        }
    }

    public r(b9.h hVar, f.a aVar, u uVar, com.google.android.exoplayer2.n nVar, long j10, b9.r rVar, j.a aVar2, boolean z10) {
        this.f7003u = hVar;
        this.f7004v = aVar;
        this.f7005w = uVar;
        this.D = nVar;
        this.B = j10;
        this.f7006x = rVar;
        this.f7007y = aVar2;
        this.E = z10;
        this.f7008z = new o8.p(new o8.o(nVar));
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.a
    public final void a(b bVar, long j10, long j11, boolean z10) {
        t tVar = bVar.f7014c;
        Uri uri = tVar.f4214c;
        o8.d dVar = new o8.d(tVar.f4215d);
        this.f7006x.getClass();
        this.f7007y.c(dVar, 0L, this.B);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.a
    public final void b(b bVar, long j10, long j11) {
        b bVar2 = bVar;
        this.H = (int) bVar2.f7014c.f4213b;
        byte[] bArr = bVar2.f7015d;
        bArr.getClass();
        this.G = bArr;
        this.F = true;
        t tVar = bVar2.f7014c;
        Uri uri = tVar.f4214c;
        o8.d dVar = new o8.d(tVar.f4215d);
        this.f7006x.getClass();
        this.f7007y.e(dVar, this.D, 0L, this.B);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final long c() {
        if (!this.F && !this.C.a()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final boolean d(long j10) {
        boolean z10;
        if (!this.F) {
            Loader loader = this.C;
            if (!loader.a()) {
                if (loader.f7163c != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    b9.f a10 = this.f7004v.a();
                    u uVar = this.f7005w;
                    if (uVar != null) {
                        a10.c(uVar);
                    }
                    b bVar = new b(a10, this.f7003u);
                    this.f7007y.i(new o8.d(bVar.f7012a, this.f7003u, loader.b(bVar, this, ((com.google.android.exoplayer2.upstream.a) this.f7006x).a(1))), this.D, 0L, this.B);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final boolean f() {
        return this.C.a();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final long g() {
        if (this.F) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    @Override // com.google.android.exoplayer2.upstream.Loader.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Loader.b j(b bVar, long j10, long j11, IOException iOException, int i6) {
        long j12;
        int i10;
        boolean z10;
        Loader.b bVar2;
        boolean z11;
        boolean z12;
        t tVar = bVar.f7014c;
        Uri uri = tVar.f4214c;
        o8.d dVar = new o8.d(tVar.f4215d);
        w.E(this.B);
        b9.r rVar = this.f7006x;
        com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) rVar;
        aVar.getClass();
        boolean z13 = false;
        if (!(iOException instanceof ParserException) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException instanceof Loader.UnexpectedLoaderException)) {
            int i11 = DataSourceException.f7152v;
            Throwable th2 = iOException;
            while (true) {
                if (th2 != null) {
                    if ((th2 instanceof DataSourceException) && ((DataSourceException) th2).f7153u == 2008) {
                        z12 = true;
                        break;
                    }
                    th2 = th2.getCause();
                } else {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                j12 = Math.min((i6 - 1) * 1000, 5000);
                i10 = (j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1));
                if (i10 == 0 && i6 < aVar.a(1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!this.E && z10) {
                    ca.a.B1("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
                    this.F = true;
                    bVar2 = Loader.f7159d;
                } else if (i10 == 0) {
                    bVar2 = new Loader.b(0, j12);
                } else {
                    bVar2 = Loader.f7160e;
                }
                Loader.b bVar3 = bVar2;
                int i12 = bVar3.f7164a;
                z11 = !((i12 != 0 || i12 == 1) ? true : true);
                this.f7007y.g(dVar, 1, this.D, 0L, this.B, iOException, z11);
                if (z11) {
                    rVar.getClass();
                }
                return bVar3;
            }
        }
        j12 = -9223372036854775807L;
        i10 = (j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1));
        if (i10 == 0) {
        }
        z10 = true;
        if (!this.E) {
        }
        if (i10 == 0) {
        }
        Loader.b bVar32 = bVar2;
        int i122 = bVar32.f7164a;
        z11 = !((i122 != 0 || i122 == 1) ? true : true);
        this.f7007y.g(dVar, 1, this.D, 0L, this.B, iOException, z11);
        if (z11) {
        }
        return bVar32;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long k(z8.d[] dVarArr, boolean[] zArr, o8.k[] kVarArr, boolean[] zArr2, long j10) {
        for (int i6 = 0; i6 < dVarArr.length; i6++) {
            o8.k kVar = kVarArr[i6];
            ArrayList<a> arrayList = this.A;
            if (kVar != null && (dVarArr[i6] == null || !zArr[i6])) {
                arrayList.remove(kVar);
                kVarArr[i6] = null;
            }
            if (kVarArr[i6] == null && dVarArr[i6] != null) {
                a aVar = new a();
                arrayList.add(aVar);
                kVarArr[i6] = aVar;
                zArr2[i6] = true;
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long m(long j10) {
        int i6 = 0;
        while (true) {
            ArrayList<a> arrayList = this.A;
            if (i6 < arrayList.size()) {
                a aVar = arrayList.get(i6);
                if (aVar.f7009u == 2) {
                    aVar.f7009u = 1;
                }
                i6++;
            } else {
                return j10;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long s() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void t(h.a aVar, long j10) {
        aVar.b(this);
    }

    @Override // com.google.android.exoplayer2.source.h
    public final o8.p u() {
        return this.f7008z;
    }

    /* compiled from: SingleSampleMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class b implements Loader.d {

        /* renamed from: a  reason: collision with root package name */
        public final long f7012a = o8.d.f27264b.getAndIncrement();

        /* renamed from: b  reason: collision with root package name */
        public final b9.h f7013b;

        /* renamed from: c  reason: collision with root package name */
        public final t f7014c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f7015d;

        public b(b9.f fVar, b9.h hVar) {
            this.f7013b = hVar;
            this.f7014c = new t(fVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.d
        public final void a() {
            t tVar = this.f7014c;
            tVar.f4213b = 0L;
            try {
                tVar.h(this.f7013b);
                int i6 = 0;
                while (i6 != -1) {
                    int i10 = (int) tVar.f4213b;
                    byte[] bArr = this.f7015d;
                    if (bArr == null) {
                        this.f7015d = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
                    } else if (i10 == bArr.length) {
                        this.f7015d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.f7015d;
                    i6 = tVar.read(bArr2, i10, bArr2.length - i10);
                }
            } finally {
                try {
                    tVar.close();
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.d
        public final void b() {
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void l() {
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final void h(long j10) {
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void r(boolean z10, long j10) {
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long w(long j10, x xVar) {
        return j10;
    }
}
