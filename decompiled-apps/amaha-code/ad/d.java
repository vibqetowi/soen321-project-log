package ad;

import android.content.Context;
import bd.a;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.b0;
import v9.o;
import ya.v;
/* compiled from: DefaultFirebaseAppCheck.java */
/* loaded from: classes.dex */
public final class d extends zc.d {

    /* renamed from: a  reason: collision with root package name */
    public final sc.e f483a;

    /* renamed from: b  reason: collision with root package name */
    public final re.b<pe.f> f484b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f485c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f486d;

    /* renamed from: e  reason: collision with root package name */
    public final l f487e;
    public final n f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f488g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f489h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f490i;

    /* renamed from: j  reason: collision with root package name */
    public final v f491j;

    /* renamed from: k  reason: collision with root package name */
    public final a.C0082a f492k;

    /* renamed from: l  reason: collision with root package name */
    public zc.a f493l;

    /* renamed from: m  reason: collision with root package name */
    public zc.b f494m;

    public d(sc.e eVar, re.b<pe.f> bVar, @yc.d Executor executor, @yc.c Executor executor2, @yc.a Executor executor3, @yc.b ScheduledExecutorService scheduledExecutorService) {
        o.h(eVar);
        o.h(bVar);
        this.f483a = eVar;
        this.f484b = bVar;
        this.f485c = new ArrayList();
        this.f486d = new ArrayList();
        eVar.b();
        String g5 = eVar.g();
        Context context = eVar.f31432a;
        this.f487e = new l(context, g5);
        eVar.b();
        this.f = new n(context, this, executor2, scheduledExecutorService);
        this.f488g = executor;
        this.f489h = executor2;
        this.f490i = executor3;
        ya.i iVar = new ya.i();
        executor3.execute(new q7.f(this, 10, iVar));
        this.f491j = iVar.f38392a;
        this.f492k = new a.C0082a();
    }

    @Override // cd.b
    public final void a(cd.a aVar) {
        o.h(aVar);
        this.f485c.add(aVar);
        n nVar = this.f;
        int size = this.f486d.size() + this.f485c.size();
        if (nVar.f525d == 0 && size > 0) {
            nVar.f525d = size;
            if (nVar.a()) {
                g gVar = nVar.f522a;
                long j10 = nVar.f526e;
                ((a.C0082a) nVar.f523b).getClass();
                gVar.b(j10 - System.currentTimeMillis());
            }
        } else if (nVar.f525d > 0 && size == 0) {
            nVar.f522a.a();
        }
        nVar.f525d = size;
        if (d()) {
            aVar.onAppCheckTokenChanged(c.c(this.f494m));
        }
    }

    @Override // cd.b
    public final ya.h<zc.c> b(boolean z10) {
        p7.m mVar = new p7.m(4, this, z10);
        return this.f491j.continueWithTask(this.f489h, mVar);
    }

    @Override // zc.d
    public final void c() {
        b0 b0Var = b0.I;
        boolean k10 = this.f483a.k();
        this.f493l = b0Var.i(this.f483a);
        this.f.f = k10;
    }

    public final boolean d() {
        zc.b bVar = this.f494m;
        if (bVar != null) {
            long a10 = bVar.a();
            this.f492k.getClass();
            if (a10 - System.currentTimeMillis() > 300000) {
                return true;
            }
        }
        return false;
    }
}
