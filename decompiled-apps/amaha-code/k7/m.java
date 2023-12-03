package k7;

import am.w;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.a;
import g7.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import je.y;
import k7.o;
import ke.r;
import rf.s;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements o.a, oe.j, oe.l, ya.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f23045u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f23046v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f23047w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f23048x;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f23045u = obj;
        this.f23046v = obj2;
        this.f23047w = obj3;
        this.f23048x = obj4;
    }

    @Override // k7.o.a
    public final Object apply(Object obj) {
        o oVar = (o) this.f23045u;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        oVar.getClass();
        return (g7.a) o.J(sQLiteDatabase.rawQuery((String) this.f23046v, new String[0]), new i7.a(4, oVar, (Map) this.f23047w, (a.C0246a) this.f23048x));
    }

    @Override // oe.j
    public final void b(Object obj) {
        he.n nVar = (he.n) this.f23045u;
        ya.i iVar = (ya.i) this.f23047w;
        oe.a aVar = (oe.a) this.f23048x;
        ge.e eVar = (ge.e) obj;
        nVar.getClass();
        if (((AtomicBoolean) this.f23046v).compareAndSet(false, true)) {
            ca.a.u0(!iVar.f38392a.isComplete(), "Already fulfilled first user task", new Object[0]);
            iVar.b(eVar);
            return;
        }
        aVar.b(new q7.f(nVar, 22, eVar));
    }

    @Override // oe.l
    public final Object get() {
        je.k kVar = (je.k) this.f23045u;
        List<le.f> list = (List) this.f23047w;
        sc.h hVar = (sc.h) this.f23048x;
        HashMap e10 = kVar.f21850e.e((Set) this.f23046v);
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : e10.entrySet()) {
            if (!(true ^ v.h.b(((ke.n) entry.getValue()).f23286c, 1))) {
                hashSet.add((ke.i) entry.getKey());
            }
        }
        je.h hVar2 = kVar.f;
        hVar2.getClass();
        HashMap hashMap = new HashMap();
        hVar2.f(hashMap, e10.keySet());
        HashMap a10 = hVar2.a(e10, hashMap, new HashSet());
        ArrayList arrayList = new ArrayList();
        for (le.f fVar : list) {
            ke.g gVar = ((y) a10.get(fVar.f24215a)).f21969a;
            ke.o oVar = null;
            for (le.e eVar : fVar.f24217c) {
                s c10 = eVar.f24214b.c(gVar.e(eVar.f24213a));
                if (c10 != null) {
                    if (oVar == null) {
                        oVar = new ke.o();
                    }
                    oVar.f(eVar.f24213a, c10);
                }
            }
            if (oVar != null) {
                arrayList.add(new le.k(fVar.f24215a, oVar, ke.o.c(oVar.b().e0()), new le.l(null, Boolean.TRUE)));
            }
        }
        le.g i6 = kVar.f21848c.i(hVar, arrayList, list);
        i6.getClass();
        HashMap hashMap2 = new HashMap();
        Iterator it = i6.b().iterator();
        while (it.hasNext()) {
            ke.i iVar = (ke.i) it.next();
            ke.n nVar = (ke.n) ((y) a10.get(iVar)).f21969a;
            le.d a11 = i6.a(nVar, ((y) a10.get(iVar)).f21970b);
            if (hashSet.contains(iVar)) {
                a11 = null;
            }
            le.f c11 = le.f.c(nVar, a11);
            if (c11 != null) {
                hashMap2.put(iVar, c11);
            }
            if (!(!v.h.b(nVar.f23286c, 1))) {
                nVar.k(r.f23293v);
            }
        }
        je.b bVar = kVar.f21849d;
        int i10 = i6.f24218a;
        bVar.a(i10, hashMap2);
        return je.g.a(i10, a10);
    }

    @Override // ya.b
    public final Object then(ya.h hVar) {
        Object onSuccessTask;
        com.google.firebase.remoteconfig.internal.a aVar = (com.google.firebase.remoteconfig.internal.a) this.f23045u;
        ya.h hVar2 = (ya.h) this.f23046v;
        ya.h hVar3 = (ya.h) this.f23047w;
        Date date = (Date) this.f23048x;
        int[] iArr = com.google.firebase.remoteconfig.internal.a.f9815j;
        aVar.getClass();
        if (!hVar2.isSuccessful()) {
            return ya.k.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", hVar2.getException()));
        }
        if (!hVar3.isSuccessful()) {
            return ya.k.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", hVar3.getException()));
        }
        try {
            a.C0162a a10 = aVar.a((String) hVar2.getResult(), ((se.g) hVar3.getResult()).a(), date);
            if (a10.f9823a != 0) {
                onSuccessTask = ya.k.e(a10);
            } else {
                onSuccessTask = aVar.f9820e.d(a10.f9824b).onSuccessTask(aVar.f9818c, new w(9, a10));
            }
            return onSuccessTask;
        } catch (FirebaseRemoteConfigException e10) {
            return ya.k.d(e10);
        }
    }
}
