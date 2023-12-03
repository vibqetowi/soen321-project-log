package i5;

import android.content.Context;
import android.os.Bundle;
import i5.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q5.e;
import w5.e0;
/* compiled from: SessionEventsState.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final w5.a f19881a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19882b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f19883c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f19884d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f19885e;

    public q(w5.a aVar, String str) {
        this.f19881a = aVar;
        this.f19882b = str;
    }

    public final synchronized void a(d event) {
        if (b6.a.b(this)) {
            return;
        }
        kotlin.jvm.internal.i.g(event, "event");
        if (this.f19883c.size() + this.f19884d.size() >= 1000) {
            this.f19885e++;
        } else {
            this.f19883c.add(event);
        }
    }

    public final synchronized void b(boolean z10) {
        if (b6.a.b(this)) {
            return;
        }
        if (z10) {
            this.f19883c.addAll(this.f19884d);
        }
        this.f19884d.clear();
        this.f19885e = 0;
    }

    public final synchronized int c() {
        if (b6.a.b(this)) {
            return 0;
        }
        return this.f19883c.size();
    }

    public final synchronized List<d> d() {
        if (b6.a.b(this)) {
            return null;
        }
        ArrayList arrayList = this.f19883c;
        this.f19883c = new ArrayList();
        return arrayList;
    }

    public final int e(h5.q qVar, Context context, boolean z10, boolean z11) {
        boolean b10;
        if (b6.a.b(this)) {
            return 0;
        }
        try {
            synchronized (this) {
                int i6 = this.f19885e;
                n5.a aVar = n5.a.f25885a;
                n5.a.b(this.f19883c);
                this.f19884d.addAll(this.f19883c);
                this.f19883c.clear();
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f19884d.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    String str = dVar.f19846y;
                    if (str == null) {
                        b10 = true;
                    } else {
                        String jSONObject = dVar.f19842u.toString();
                        kotlin.jvm.internal.i.f(jSONObject, "jsonObject.toString()");
                        b10 = kotlin.jvm.internal.i.b(d.a.a(jSONObject), str);
                    }
                    if (b10) {
                        if (z10 || !dVar.f19843v) {
                            jSONArray.put(dVar.f19842u);
                        }
                    } else {
                        e0 e0Var = e0.f36453a;
                        kotlin.jvm.internal.i.n(dVar, "Event with invalid checksum: ");
                        h5.p pVar = h5.p.f17269a;
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                hs.k kVar = hs.k.f19476a;
                f(qVar, context, i6, jSONArray, z11);
                return jSONArray.length();
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return 0;
        }
    }

    public final void f(h5.q qVar, Context context, int i6, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject;
        try {
            if (b6.a.b(this)) {
                return;
            }
            try {
                HashMap hashMap = q5.e.f29149a;
                jSONObject = q5.e.a(e.a.CUSTOM_APP_EVENTS, this.f19881a, this.f19882b, z10, context);
                if (this.f19885e > 0) {
                    jSONObject.put("num_skipped_events", i6);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            qVar.f17292c = jSONObject;
            Bundle bundle = qVar.f17293d;
            String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.i.f(jSONArray2, "events.toString()");
            bundle.putString("custom_events", jSONArray2);
            qVar.f17294e = jSONArray2;
            qVar.f17293d = bundle;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
