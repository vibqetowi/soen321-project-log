package pe;

import ad.k;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import o0.l;
import ya.v;
/* compiled from: DefaultHeartBeatController.java */
/* loaded from: classes.dex */
public final class d implements f, g {

    /* renamed from: a  reason: collision with root package name */
    public final re.b<h> f28396a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f28397b;

    /* renamed from: c  reason: collision with root package name */
    public final re.b<mf.f> f28398c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<e> f28399d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f28400e;

    public d() {
        throw null;
    }

    public d(Context context, String str, Set<e> set, re.b<mf.f> bVar, Executor executor) {
        this.f28396a = new k(context, str, 1);
        this.f28399d = set;
        this.f28400e = executor;
        this.f28398c = bVar;
        this.f28397b = context;
    }

    @Override // pe.f
    public final v a() {
        if (!l.a(this.f28397b)) {
            return ya.k.e("");
        }
        return ya.k.c(this.f28400e, new b(this, 0));
    }

    @Override // pe.g
    public final synchronized int b() {
        long currentTimeMillis = System.currentTimeMillis();
        h hVar = this.f28396a.get();
        if (hVar.i(currentTimeMillis)) {
            hVar.g();
            return 3;
        }
        return 1;
    }

    public final void c() {
        if (this.f28399d.size() <= 0) {
            ya.k.e(null);
        } else if (!l.a(this.f28397b)) {
            ya.k.e(null);
        } else {
            ya.k.c(this.f28400e, new b(this, 1));
        }
    }
}
