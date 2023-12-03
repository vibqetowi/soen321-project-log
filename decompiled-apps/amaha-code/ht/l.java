package ht;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import wu.i1;
/* compiled from: Annotations.kt */
/* loaded from: classes2.dex */
public final class l implements h {

    /* renamed from: u  reason: collision with root package name */
    public final h f19506u;

    /* renamed from: v  reason: collision with root package name */
    public final ss.l<fu.c, Boolean> f19507v;

    public l(h hVar, i1 i1Var) {
        this.f19506u = hVar;
        this.f19507v = i1Var;
    }

    @Override // ht.h
    public final boolean H(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        if (this.f19507v.invoke(fqName).booleanValue()) {
            return this.f19506u.H(fqName);
        }
        return false;
    }

    @Override // ht.h
    public final boolean isEmpty() {
        boolean z10;
        h<c> hVar = this.f19506u;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            return false;
        }
        for (c cVar : hVar) {
            fu.c e10 = cVar.e();
            if (e10 != null && this.f19507v.invoke(e10).booleanValue()) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f19506u) {
            fu.c e10 = cVar.e();
            if (e10 != null && this.f19507v.invoke(e10).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    @Override // ht.h
    public final c l(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        if (this.f19507v.invoke(fqName).booleanValue()) {
            return this.f19506u.l(fqName);
        }
        return null;
    }
}
