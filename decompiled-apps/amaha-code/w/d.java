package w;

import android.content.Context;
import i5.q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w5.a;
/* compiled from: KeyCache.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public HashMap f36208a;

    public d(int i6) {
        if (i6 != 1) {
            if (i6 != 2) {
                this.f36208a = new HashMap();
                return;
            } else {
                this.f36208a = new HashMap();
                return;
            }
        }
        this.f36208a = new HashMap();
    }

    public final synchronized void a(i5.p pVar) {
        Set<Map.Entry<i5.a, List<i5.d>>> set;
        if (!b6.a.b(pVar)) {
            set = pVar.f19879u.entrySet();
            kotlin.jvm.internal.i.f(set, "events.entries");
        } else {
            set = null;
        }
        for (Map.Entry<i5.a, List<i5.d>> entry : set) {
            q e10 = e(entry.getKey());
            if (e10 != null) {
                for (i5.d dVar : entry.getValue()) {
                    e10.a(dVar);
                }
            }
        }
    }

    public final synchronized q b(i5.a accessTokenAppIdPair) {
        kotlin.jvm.internal.i.g(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (q) this.f36208a.get(accessTokenAppIdPair);
    }

    public final synchronized int c() {
        int i6;
        i6 = 0;
        for (q qVar : this.f36208a.values()) {
            i6 += qVar.c();
        }
        return i6;
    }

    public final float d(Object obj, String str) {
        HashMap hashMap;
        float[] fArr;
        if (!this.f36208a.containsKey(obj) || (hashMap = (HashMap) this.f36208a.get(obj)) == null || !hashMap.containsKey(str) || (fArr = (float[]) hashMap.get(str)) == null || fArr.length <= 0) {
            return Float.NaN;
        }
        return fArr[0];
    }

    public final synchronized q e(i5.a aVar) {
        q qVar = (q) this.f36208a.get(aVar);
        if (qVar == null) {
            Context a10 = h5.p.a();
            w5.a aVar2 = w5.a.f;
            w5.a a11 = a.C0610a.a(a10);
            if (a11 != null) {
                qVar = new q(a11, kc.f.D(a10));
            }
        }
        if (qVar == null) {
            return null;
        }
        this.f36208a.put(aVar, qVar);
        return qVar;
    }

    public final synchronized Set f() {
        Set keySet;
        keySet = this.f36208a.keySet();
        kotlin.jvm.internal.i.f(keySet, "stateMap.keys");
        return keySet;
    }
}
