package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.f;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
/* compiled from: ActivityResultRegistry.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public Random f984a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f985b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f986c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f987d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f988e = new ArrayList<>();
    public final transient HashMap f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f989g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f990h = new Bundle();

    /* compiled from: ActivityResultRegistry.java */
    /* loaded from: classes.dex */
    public static class a<O> {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.activity.result.b<O> f991a;

        /* renamed from: b  reason: collision with root package name */
        public final e.a<?, O> f992b;

        public a(e.a aVar, androidx.activity.result.b bVar) {
            this.f991a = bVar;
            this.f992b = aVar;
        }
    }

    /* compiled from: ActivityResultRegistry.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final j f993a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<n> f994b = new ArrayList<>();

        public b(j jVar) {
            this.f993a = jVar;
        }
    }

    public final boolean a(int i6, int i10, Intent intent) {
        androidx.activity.result.b<O> bVar;
        String str = (String) this.f985b.get(Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f.get(str);
        if (aVar != null && (bVar = aVar.f991a) != 0 && this.f988e.contains(str)) {
            bVar.b(aVar.f992b.c(intent, i10));
            this.f988e.remove(str);
            return true;
        }
        this.f989g.remove(str);
        this.f990h.putParcelable(str, new androidx.activity.result.a(intent, i10));
        return true;
    }

    public abstract void b(int i6, e.a aVar, Object obj);

    public final d c(final String str, p pVar, final e.a aVar, final androidx.activity.result.b bVar) {
        j lifecycle = pVar.getLifecycle();
        if (!lifecycle.b().d(j.c.STARTED)) {
            e(str);
            HashMap hashMap = this.f987d;
            b bVar2 = (b) hashMap.get(str);
            if (bVar2 == null) {
                bVar2 = new b(lifecycle);
            }
            n nVar = new n() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // androidx.lifecycle.n
                public final void c(p pVar2, j.b bVar3) {
                    boolean equals = j.b.ON_START.equals(bVar3);
                    String str2 = str;
                    f fVar = f.this;
                    if (equals) {
                        HashMap hashMap2 = fVar.f;
                        e.a aVar2 = aVar;
                        b bVar4 = bVar;
                        hashMap2.put(str2, new f.a(aVar2, bVar4));
                        HashMap hashMap3 = fVar.f989g;
                        if (hashMap3.containsKey(str2)) {
                            Object obj = hashMap3.get(str2);
                            hashMap3.remove(str2);
                            bVar4.b(obj);
                        }
                        Bundle bundle = fVar.f990h;
                        a aVar3 = (a) bundle.getParcelable(str2);
                        if (aVar3 != null) {
                            bundle.remove(str2);
                            bVar4.b(aVar2.c(aVar3.f977v, aVar3.f976u));
                        }
                    } else if (j.b.ON_STOP.equals(bVar3)) {
                        fVar.f.remove(str2);
                    } else if (j.b.ON_DESTROY.equals(bVar3)) {
                        fVar.f(str2);
                    }
                }
            };
            bVar2.f993a.a(nVar);
            bVar2.f994b.add(nVar);
            hashMap.put(str, bVar2);
            return new d(this, str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + pVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final e d(String str, e.a aVar, androidx.activity.result.b bVar) {
        e(str);
        this.f.put(str, new a(aVar, bVar));
        HashMap hashMap = this.f989g;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.b(obj);
        }
        Bundle bundle = this.f990h;
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) bundle.getParcelable(str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.b(aVar.c(aVar2.f977v, aVar2.f976u));
        }
        return new e(this, str, aVar);
    }

    public final void e(String str) {
        HashMap hashMap = this.f986c;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        int nextInt = this.f984a.nextInt(2147418112);
        while (true) {
            int i6 = nextInt + 65536;
            HashMap hashMap2 = this.f985b;
            if (hashMap2.containsKey(Integer.valueOf(i6))) {
                nextInt = this.f984a.nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i6), str);
                hashMap.put(str, Integer.valueOf(i6));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f988e.contains(str) && (num = (Integer) this.f986c.remove(str)) != null) {
            this.f985b.remove(num);
        }
        this.f.remove(str);
        HashMap hashMap = this.f989g;
        if (hashMap.containsKey(str)) {
            StringBuilder g5 = defpackage.d.g("Dropping pending result for request ", str, ": ");
            g5.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", g5.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f990h;
        if (bundle.containsKey(str)) {
            StringBuilder g10 = defpackage.d.g("Dropping pending result for request ", str, ": ");
            g10.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", g10.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f987d;
        b bVar = (b) hashMap2.get(str);
        if (bVar != null) {
            ArrayList<n> arrayList = bVar.f994b;
            Iterator<n> it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f993a.c(it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
