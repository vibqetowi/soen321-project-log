package j5;

import gv.r;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
/* compiled from: MetadataRule.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final CopyOnWriteArraySet f21674d = new CopyOnWriteArraySet();

    /* renamed from: a  reason: collision with root package name */
    public final String f21675a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21676b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f21677c;

    /* compiled from: MetadataRule.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(JSONObject jSONObject) {
            boolean z10;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                if (optJSONObject != null) {
                    String k10 = optJSONObject.optString("k");
                    String v10 = optJSONObject.optString("v");
                    i.f(k10, "k");
                    if (k10.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        CopyOnWriteArraySet a10 = c.a();
                        i.f(key, "key");
                        List a12 = r.a1(k10, new String[]{","}, 0, 6);
                        i.f(v10, "v");
                        a10.add(new c(key, a12, v10));
                    }
                }
            }
        }
    }

    public c(String str, List list, String str2) {
        this.f21675a = str;
        this.f21676b = str2;
        this.f21677c = list;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a() {
        if (b6.a.b(c.class)) {
            return null;
        }
        try {
            return f21674d;
        } catch (Throwable th2) {
            b6.a.a(c.class, th2);
            return null;
        }
    }

    public final String b() {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            return this.f21675a;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }
}
