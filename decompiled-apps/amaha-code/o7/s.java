package o7;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import java.util.List;
/* compiled from: PlaybackInfo.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: t  reason: collision with root package name */
    public static final i.a f27234t = new i.a(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final e0 f27235a;

    /* renamed from: b  reason: collision with root package name */
    public final i.a f27236b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27237c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27238d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27239e;
    public final ExoPlaybackException f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27240g;

    /* renamed from: h  reason: collision with root package name */
    public final o8.p f27241h;

    /* renamed from: i  reason: collision with root package name */
    public final z8.l f27242i;

    /* renamed from: j  reason: collision with root package name */
    public final List<g8.a> f27243j;

    /* renamed from: k  reason: collision with root package name */
    public final i.a f27244k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f27245l;

    /* renamed from: m  reason: collision with root package name */
    public final int f27246m;

    /* renamed from: n  reason: collision with root package name */
    public final com.google.android.exoplayer2.v f27247n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f27248o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f27249p;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f27250q;
    public volatile long r;

    /* renamed from: s  reason: collision with root package name */
    public volatile long f27251s;

    public s(e0 e0Var, i.a aVar, long j10, long j11, int i6, ExoPlaybackException exoPlaybackException, boolean z10, o8.p pVar, z8.l lVar, List<g8.a> list, i.a aVar2, boolean z11, int i10, com.google.android.exoplayer2.v vVar, long j12, long j13, long j14, boolean z12, boolean z13) {
        this.f27235a = e0Var;
        this.f27236b = aVar;
        this.f27237c = j10;
        this.f27238d = j11;
        this.f27239e = i6;
        this.f = exoPlaybackException;
        this.f27240g = z10;
        this.f27241h = pVar;
        this.f27242i = lVar;
        this.f27243j = list;
        this.f27244k = aVar2;
        this.f27245l = z11;
        this.f27246m = i10;
        this.f27247n = vVar;
        this.f27250q = j12;
        this.r = j13;
        this.f27251s = j14;
        this.f27248o = z12;
        this.f27249p = z13;
    }

    public static s i(z8.l lVar) {
        e0.a aVar = e0.f6464u;
        i.a aVar2 = f27234t;
        o8.p pVar = o8.p.f27305x;
        s.b bVar = com.google.common.collect.s.f9446v;
        return new s(aVar, aVar2, -9223372036854775807L, 0L, 1, null, false, pVar, lVar, l0.f9412y, aVar2, false, 0, com.google.android.exoplayer2.v.f7194x, 0L, 0L, 0L, false, false);
    }

    public final s a(i.a aVar) {
        return new s(this.f27235a, this.f27236b, this.f27237c, this.f27238d, this.f27239e, this.f, this.f27240g, this.f27241h, this.f27242i, this.f27243j, aVar, this.f27245l, this.f27246m, this.f27247n, this.f27250q, this.r, this.f27251s, this.f27248o, this.f27249p);
    }

    public final s b(i.a aVar, long j10, long j11, long j12, long j13, o8.p pVar, z8.l lVar, List<g8.a> list) {
        return new s(this.f27235a, aVar, j11, j12, this.f27239e, this.f, this.f27240g, pVar, lVar, list, this.f27244k, this.f27245l, this.f27246m, this.f27247n, this.f27250q, j13, j10, this.f27248o, this.f27249p);
    }

    public final s c(boolean z10) {
        return new s(this.f27235a, this.f27236b, this.f27237c, this.f27238d, this.f27239e, this.f, this.f27240g, this.f27241h, this.f27242i, this.f27243j, this.f27244k, this.f27245l, this.f27246m, this.f27247n, this.f27250q, this.r, this.f27251s, z10, this.f27249p);
    }

    public final s d(int i6, boolean z10) {
        return new s(this.f27235a, this.f27236b, this.f27237c, this.f27238d, this.f27239e, this.f, this.f27240g, this.f27241h, this.f27242i, this.f27243j, this.f27244k, z10, i6, this.f27247n, this.f27250q, this.r, this.f27251s, this.f27248o, this.f27249p);
    }

    public final s e(ExoPlaybackException exoPlaybackException) {
        return new s(this.f27235a, this.f27236b, this.f27237c, this.f27238d, this.f27239e, exoPlaybackException, this.f27240g, this.f27241h, this.f27242i, this.f27243j, this.f27244k, this.f27245l, this.f27246m, this.f27247n, this.f27250q, this.r, this.f27251s, this.f27248o, this.f27249p);
    }

    public final s f(com.google.android.exoplayer2.v vVar) {
        return new s(this.f27235a, this.f27236b, this.f27237c, this.f27238d, this.f27239e, this.f, this.f27240g, this.f27241h, this.f27242i, this.f27243j, this.f27244k, this.f27245l, this.f27246m, vVar, this.f27250q, this.r, this.f27251s, this.f27248o, this.f27249p);
    }

    public final s g(int i6) {
        return new s(this.f27235a, this.f27236b, this.f27237c, this.f27238d, i6, this.f, this.f27240g, this.f27241h, this.f27242i, this.f27243j, this.f27244k, this.f27245l, this.f27246m, this.f27247n, this.f27250q, this.r, this.f27251s, this.f27248o, this.f27249p);
    }

    public final s h(e0 e0Var) {
        return new s(e0Var, this.f27236b, this.f27237c, this.f27238d, this.f27239e, this.f, this.f27240g, this.f27241h, this.f27242i, this.f27243j, this.f27244k, this.f27245l, this.f27246m, this.f27247n, this.f27250q, this.r, this.f27251s, this.f27248o, this.f27249p);
    }
}
