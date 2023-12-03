package ud;

import org.json.JSONObject;
import tr.r;
import ud.b;
/* compiled from: DefaultSettingsJsonTransform.java */
/* loaded from: classes.dex */
public final class a implements e {
    public static b b(r rVar) {
        b.C0568b c0568b = new b.C0568b(8);
        b.a aVar = new b.a(true, false, false);
        rVar.getClass();
        return new b(System.currentTimeMillis() + 3600000, c0568b, aVar, 10.0d, 1.2d, 60);
    }

    @Override // ud.e
    public final b a(r rVar, JSONObject jSONObject) {
        return b(rVar);
    }
}
