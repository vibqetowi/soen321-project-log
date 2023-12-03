package nf;

import android.util.Log;
import id.g;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import k7.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.u;
import ya.h;
import ya.k;
/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final tc.b f26289a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f26290b;

    /* renamed from: c  reason: collision with root package name */
    public final of.b f26291c;

    /* renamed from: d  reason: collision with root package name */
    public final of.b f26292d;

    /* renamed from: e  reason: collision with root package name */
    public final of.b f26293e;
    public final com.google.firebase.remoteconfig.internal.a f;

    /* renamed from: g  reason: collision with root package name */
    public final of.d f26294g;

    /* renamed from: h  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.b f26295h;

    /* renamed from: i  reason: collision with root package name */
    public final se.d f26296i;

    public b(se.d dVar, tc.b bVar, Executor executor, of.b bVar2, of.b bVar3, of.b bVar4, com.google.firebase.remoteconfig.internal.a aVar, of.d dVar2, com.google.firebase.remoteconfig.internal.b bVar5) {
        this.f26296i = dVar;
        this.f26289a = bVar;
        this.f26290b = executor;
        this.f26291c = bVar2;
        this.f26292d = bVar3;
        this.f26293e = bVar4;
        this.f = aVar;
        this.f26294g = dVar2;
        this.f26295h = bVar5;
    }

    public static b e() {
        return ((f) sc.e.e().c(f.class)).a("firebase");
    }

    public static ArrayList i(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i6);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final h<Boolean> a() {
        h<of.c> b10 = this.f26291c.b();
        h<of.c> b11 = this.f26292d.b();
        return k.h(b10, b11).continueWithTask(this.f26290b, new i7.a(8, this, b10, b11));
    }

    public final h<Boolean> b() {
        com.google.firebase.remoteconfig.internal.a aVar = this.f;
        com.google.firebase.remoteconfig.internal.b bVar = aVar.f9821g;
        bVar.getClass();
        long j10 = bVar.f9828a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.a.f9814i);
        return aVar.f9820e.b().continueWithTask(aVar.f9818c, new j(3, j10, aVar)).onSuccessTask(g.f19977u, new com.google.firebase.messaging.j(4)).onSuccessTask(this.f26290b, new a(this));
    }

    public final HashMap c() {
        of.f fVar;
        of.d dVar = this.f26294g;
        dVar.getClass();
        HashSet hashSet = new HashSet();
        of.b bVar = dVar.f27451c;
        hashSet.addAll(of.d.d(bVar));
        of.b bVar2 = dVar.f27452d;
        hashSet.addAll(of.d.d(bVar2));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String e10 = of.d.e(bVar, str);
            if (e10 != null) {
                dVar.b(of.d.c(bVar), str);
                fVar = new of.f(e10, 2);
            } else {
                String e11 = of.d.e(bVar2, str);
                if (e11 != null) {
                    fVar = new of.f(e11, 1);
                } else {
                    of.d.f(str, "FirebaseRemoteConfigValue");
                    fVar = new of.f("", 0);
                }
            }
            hashMap.put(str, fVar);
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r3.matcher(r0).matches() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(String str) {
        of.d dVar = this.f26294g;
        of.b bVar = dVar.f27451c;
        String e10 = of.d.e(bVar, str);
        Pattern pattern = of.d.f;
        Pattern pattern2 = of.d.f27448e;
        if (e10 != null) {
            if (pattern2.matcher(e10).matches()) {
                dVar.b(of.d.c(bVar), str);
                return true;
            } else if (pattern.matcher(e10).matches()) {
                dVar.b(of.d.c(bVar), str);
                return false;
            }
        }
        String e11 = of.d.e(dVar.f27452d, str);
        if (e11 != null) {
            if (!pattern2.matcher(e11).matches()) {
            }
            return true;
        }
        of.d.f(str, "Boolean");
        return false;
    }

    public final String f(String str) {
        of.d dVar = this.f26294g;
        of.b bVar = dVar.f27451c;
        String e10 = of.d.e(bVar, str);
        if (e10 != null) {
            dVar.b(of.d.c(bVar), str);
            return e10;
        }
        String e11 = of.d.e(dVar.f27452d, str);
        if (e11 == null) {
            of.d.f(str, "String");
            return "";
        }
        return e11;
    }

    public final void g(c cVar) {
        k.c(this.f26290b, new u(this, 6, cVar));
    }

    public final void h(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap2.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                hashMap2.put((String) entry.getKey(), value.toString());
            }
        }
        try {
            Date date = of.c.f;
            new JSONObject();
            this.f26293e.d(new of.c(new JSONObject(hashMap2), of.c.f, new JSONArray(), new JSONObject())).onSuccessTask(g.f19977u, new com.google.firebase.messaging.j(3));
        } catch (JSONException e10) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e10);
            k.e(null);
        }
    }
}
