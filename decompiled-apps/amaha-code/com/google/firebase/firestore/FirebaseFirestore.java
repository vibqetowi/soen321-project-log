package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.firestore.c;
import fe.l;
import fe.w;
import fe.y;
import he.n;
import ke.f;
import ke.p;
import ne.q;
import sc.e;
/* loaded from: classes.dex */
public class FirebaseFirestore {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9610a;

    /* renamed from: b  reason: collision with root package name */
    public final f f9611b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9612c;

    /* renamed from: d  reason: collision with root package name */
    public final com.android.volley.toolbox.a f9613d;

    /* renamed from: e  reason: collision with root package name */
    public final com.android.volley.toolbox.a f9614e;
    public final oe.a f;

    /* renamed from: g  reason: collision with root package name */
    public final w f9615g;

    /* renamed from: h  reason: collision with root package name */
    public final c f9616h;

    /* renamed from: i  reason: collision with root package name */
    public volatile n f9617i;

    /* renamed from: j  reason: collision with root package name */
    public final q f9618j;

    public FirebaseFirestore(Context context, f fVar, String str, ge.d dVar, ge.b bVar, oe.a aVar, q qVar) {
        context.getClass();
        this.f9610a = context;
        this.f9611b = fVar;
        this.f9615g = new w(fVar);
        str.getClass();
        this.f9612c = str;
        this.f9613d = dVar;
        this.f9614e = bVar;
        this.f = aVar;
        this.f9618j = qVar;
        this.f9616h = new c(new c.a());
    }

    public static FirebaseFirestore d() {
        FirebaseFirestore firebaseFirestore;
        l lVar = (l) e.e().c(l.class);
        ca.a.w(lVar, "Firestore component is not present.");
        synchronized (lVar) {
            firebaseFirestore = (FirebaseFirestore) lVar.f14998a.get("(default)");
            if (firebaseFirestore == null) {
                firebaseFirestore = e(lVar.f15000c, lVar.f14999b, lVar.f15001d, lVar.f15002e, lVar.f);
                lVar.f14998a.put("(default)", firebaseFirestore);
            }
        }
        return firebaseFirestore;
    }

    public static FirebaseFirestore e(Context context, e eVar, re.a aVar, re.a aVar2, q qVar) {
        eVar.b();
        String str = eVar.f31434c.f31449g;
        if (str != null) {
            f fVar = new f(str, "(default)");
            oe.a aVar3 = new oe.a();
            ge.d dVar = new ge.d(aVar);
            ge.b bVar = new ge.b(aVar2);
            eVar.b();
            return new FirebaseFirestore(context, fVar, eVar.f31433b, dVar, bVar, aVar3, qVar);
        }
        throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
    }

    @Keep
    public static void setClientLanguage(String str) {
        ne.n.f26247j = str;
    }

    public final y a() {
        c();
        return new y(this);
    }

    public final fe.c b(String str) {
        c();
        return new fe.c(p.u(str), this);
    }

    public final void c() {
        if (this.f9617i != null) {
            return;
        }
        synchronized (this.f9611b) {
            if (this.f9617i != null) {
                return;
            }
            f fVar = this.f9611b;
            String str = this.f9612c;
            c cVar = this.f9616h;
            this.f9617i = new n(this.f9610a, new e9.c(fVar, str, cVar.f9630a, cVar.f9631b), cVar, this.f9613d, this.f9614e, this.f, this.f9618j);
        }
    }
}
