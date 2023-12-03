package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import b9.u;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: BaseMediaSource.java */
/* loaded from: classes.dex */
public abstract class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<i.b> f6818a = new ArrayList<>(1);

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<i.b> f6819b = new HashSet<>(1);

    /* renamed from: c  reason: collision with root package name */
    public final j.a f6820c = new j.a();

    /* renamed from: d  reason: collision with root package name */
    public final c.a f6821d = new c.a();

    /* renamed from: e  reason: collision with root package name */
    public Looper f6822e;
    public e0 f;

    @Override // com.google.android.exoplayer2.source.i
    public final void b(i.b bVar) {
        ArrayList<i.b> arrayList = this.f6818a;
        arrayList.remove(bVar);
        if (arrayList.isEmpty()) {
            this.f6822e = null;
            this.f = null;
            this.f6819b.clear();
            s();
            return;
        }
        f(bVar);
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void c(i.b bVar, u uVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f6822e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        sc.b.q(z10);
        e0 e0Var = this.f;
        this.f6818a.add(bVar);
        if (this.f6822e == null) {
            this.f6822e = myLooper;
            this.f6819b.add(bVar);
            q(uVar);
        } else if (e0Var != null) {
            n(bVar);
            bVar.a(this, e0Var);
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void d(Handler handler, j jVar) {
        j.a aVar = this.f6820c;
        aVar.getClass();
        aVar.f6898c.add(new j.a.C0139a(handler, jVar));
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void e(j jVar) {
        CopyOnWriteArrayList<j.a.C0139a> copyOnWriteArrayList = this.f6820c.f6898c;
        Iterator<j.a.C0139a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j.a.C0139a next = it.next();
            if (next.f6901b == jVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void f(i.b bVar) {
        HashSet<i.b> hashSet = this.f6819b;
        boolean z10 = !hashSet.isEmpty();
        hashSet.remove(bVar);
        if (z10 && hashSet.isEmpty()) {
            o();
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void h(Handler handler, com.google.android.exoplayer2.drm.c cVar) {
        c.a aVar = this.f6821d;
        aVar.getClass();
        aVar.f6440c.add(new c.a.C0135a(handler, cVar));
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void i(com.google.android.exoplayer2.drm.c cVar) {
        CopyOnWriteArrayList<c.a.C0135a> copyOnWriteArrayList = this.f6821d.f6440c;
        Iterator<c.a.C0135a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            c.a.C0135a next = it.next();
            if (next.f6442b == cVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void n(i.b bVar) {
        this.f6822e.getClass();
        HashSet<i.b> hashSet = this.f6819b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(bVar);
        if (isEmpty) {
            p();
        }
    }

    public abstract void q(u uVar);

    public final void r(e0 e0Var) {
        this.f = e0Var;
        Iterator<i.b> it = this.f6818a.iterator();
        while (it.hasNext()) {
            it.next().a(this, e0Var);
        }
    }

    public abstract void s();

    @Override // com.google.android.exoplayer2.source.i
    public final /* synthetic */ void k() {
    }

    @Override // com.google.android.exoplayer2.source.i
    public final /* synthetic */ void m() {
    }

    public void o() {
    }

    public void p() {
    }
}
