package androidx.lifecycle;

import androidx.lifecycle.c;
import androidx.lifecycle.j;
import java.util.HashMap;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements n {

    /* renamed from: u  reason: collision with root package name */
    public final Object f2372u;

    /* renamed from: v  reason: collision with root package name */
    public final c.a f2373v;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2372u = obj;
        this.f2373v = c.f2385c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.n
    public final void c(p pVar, j.b bVar) {
        HashMap hashMap = this.f2373v.f2388a;
        Object obj = this.f2372u;
        c.a.a((List) hashMap.get(bVar), pVar, bVar, obj);
        c.a.a((List) hashMap.get(j.b.ON_ANY), pVar, bVar, obj);
    }
}
