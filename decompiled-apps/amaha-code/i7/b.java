package i7;

import a7.h;
import d7.j;
import d7.w;
import j7.m;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import u5.f;
/* compiled from: DefaultScheduler.java */
/* loaded from: classes.dex */
public final class b implements c {
    public static final Logger f = Logger.getLogger(w.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final m f19898a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f19899b;

    /* renamed from: c  reason: collision with root package name */
    public final e7.e f19900c;

    /* renamed from: d  reason: collision with root package name */
    public final k7.d f19901d;

    /* renamed from: e  reason: collision with root package name */
    public final l7.a f19902e;

    public b(Executor executor, e7.e eVar, m mVar, k7.d dVar, l7.a aVar) {
        this.f19899b = executor;
        this.f19900c = eVar;
        this.f19898a = mVar;
        this.f19901d = dVar;
        this.f19902e = aVar;
    }

    @Override // i7.c
    public final void a(h hVar, d7.h hVar2, j jVar) {
        this.f19899b.execute(new f(this, jVar, hVar, hVar2, 1));
    }
}
