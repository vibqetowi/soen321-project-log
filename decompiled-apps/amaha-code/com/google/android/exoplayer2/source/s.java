package com.google.android.exoplayer2.source;

import android.net.Uri;
import b9.f;
import b9.u;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.upstream.Loader;
import java.util.Collections;
import java.util.Map;
/* compiled from: SingleSampleMediaSource.java */
/* loaded from: classes.dex */
public final class s extends a {

    /* renamed from: g  reason: collision with root package name */
    public final b9.h f7016g;

    /* renamed from: h  reason: collision with root package name */
    public final f.a f7017h;

    /* renamed from: i  reason: collision with root package name */
    public final com.google.android.exoplayer2.n f7018i;

    /* renamed from: k  reason: collision with root package name */
    public final b9.r f7020k;

    /* renamed from: m  reason: collision with root package name */
    public final o8.m f7022m;

    /* renamed from: n  reason: collision with root package name */
    public final com.google.android.exoplayer2.q f7023n;

    /* renamed from: o  reason: collision with root package name */
    public u f7024o;

    /* renamed from: j  reason: collision with root package name */
    public final long f7019j = -9223372036854775807L;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f7021l = true;

    public s(q.i iVar, f.a aVar, b9.r rVar) {
        this.f7017h = aVar;
        this.f7020k = rVar;
        q.a aVar2 = new q.a();
        aVar2.f6690b = Uri.EMPTY;
        String uri = iVar.f6741a.toString();
        uri.getClass();
        aVar2.f6689a = uri;
        aVar2.f6695h = com.google.common.collect.s.z(com.google.common.collect.s.K(iVar));
        aVar2.f6696i = null;
        com.google.android.exoplayer2.q a10 = aVar2.a();
        this.f7023n = a10;
        n.a aVar3 = new n.a();
        aVar3.f6656a = null;
        aVar3.f6665k = (String) nc.f.a(iVar.f6742b, "text/x-unknown");
        aVar3.f6658c = iVar.f6743c;
        aVar3.f6659d = iVar.f6744d;
        aVar3.f6660e = iVar.f6745e;
        aVar3.f6657b = iVar.f;
        this.f7018i = new com.google.android.exoplayer2.n(aVar3);
        Map emptyMap = Collections.emptyMap();
        Uri uri2 = iVar.f6741a;
        sc.b.F(uri2, "The uri must be set.");
        this.f7016g = new b9.h(uri2, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.f7022m = new o8.m(-9223372036854775807L, true, false, a10);
    }

    @Override // com.google.android.exoplayer2.source.i
    public final h a(i.a aVar, b9.i iVar, long j10) {
        return new r(this.f7016g, this.f7017h, this.f7024o, this.f7018i, this.f7019j, this.f7020k, new j.a(this.f6820c.f6898c, 0, aVar), this.f7021l);
    }

    @Override // com.google.android.exoplayer2.source.i
    public final com.google.android.exoplayer2.q g() {
        return this.f7023n;
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void l(h hVar) {
        Loader loader = ((r) hVar).C;
        Loader.c<? extends Loader.d> cVar = loader.f7162b;
        if (cVar != null) {
            cVar.a(true);
        }
        loader.f7161a.shutdown();
    }

    @Override // com.google.android.exoplayer2.source.a
    public final void q(u uVar) {
        this.f7024o = uVar;
        r(this.f7022m);
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void j() {
    }

    @Override // com.google.android.exoplayer2.source.a
    public final void s() {
    }
}
