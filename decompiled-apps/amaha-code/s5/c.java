package s5;

import android.os.Bundle;
import i5.d;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import s5.d;
import w5.e0;
import w5.o;
import w5.p;
/* compiled from: RemoteServiceParametersHelper.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f31276a = new c();

    public static final Bundle a(d.a aVar, String str, List<i5.d> list) {
        if (b6.a.b(c.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("event", aVar.f31282u);
            bundle.putString("app_id", str);
            if (d.a.CUSTOM_APP_EVENTS == aVar) {
                JSONArray b10 = f31276a.b(str, list);
                if (b10.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b10.toString());
            }
            return bundle;
        } catch (Throwable th2) {
            b6.a.a(c.class, th2);
            return null;
        }
    }

    public final JSONArray b(String str, List list) {
        boolean b10;
        o f;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList J2 = u.J2(list);
            n5.a.b(J2);
            boolean z10 = false;
            if (!b6.a.b(this) && (f = p.f(str, false)) != null) {
                z10 = f.f36512a;
            }
            Iterator it = J2.iterator();
            while (it.hasNext()) {
                i5.d dVar = (i5.d) it.next();
                String str2 = dVar.f19846y;
                if (str2 == null) {
                    b10 = true;
                } else {
                    String jSONObject = dVar.f19842u.toString();
                    i.f(jSONObject, "jsonObject.toString()");
                    b10 = i.b(d.a.a(jSONObject), str2);
                }
                if (b10) {
                    boolean z11 = dVar.f19843v;
                    if ((!z11) || (z11 && z10)) {
                        jSONArray.put(dVar.f19842u);
                    }
                } else {
                    e0 e0Var = e0.f36453a;
                    i.n(dVar, "Event with invalid checksum: ");
                    h5.p pVar = h5.p.f17269a;
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }
}
