package y3;

import is.u;
import is.y;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: Response.kt */
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    public final String f38193a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Integer> f38194b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Integer> f38195c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<Integer> f38196d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<String> f38197e;

    public b(JSONObject jSONObject) {
        this.f38193a = sc.b.L("error", jSONObject);
        sc.b.L("missing_field", jSONObject);
        y yVar = y.f20678u;
        this.f38194b = yVar;
        this.f38195c = yVar;
        this.f38196d = yVar;
        this.f38197e = yVar;
        if (jSONObject.has("events_with_invalid_fields")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events_with_invalid_fields");
            kotlin.jvm.internal.i.f(jSONObject2, "response.getJSONObject(\"…nts_with_invalid_fields\")");
            this.f38194b = sc.b.G(jSONObject2);
        }
        if (jSONObject.has("events_with_missing_fields")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("events_with_missing_fields");
            kotlin.jvm.internal.i.f(jSONObject3, "response.getJSONObject(\"…nts_with_missing_fields\")");
            this.f38195c = sc.b.G(jSONObject3);
        }
        if (jSONObject.has("silenced_devices")) {
            JSONArray jSONArray = jSONObject.getJSONArray("silenced_devices");
            kotlin.jvm.internal.i.f(jSONArray, "response.getJSONArray(\"silenced_devices\")");
            this.f38197e = u.M2((Iterable) jSONArray);
        }
        if (jSONObject.has("silenced_events")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("silenced_events");
            kotlin.jvm.internal.i.f(jSONArray2, "response.getJSONArray(\"silenced_events\")");
            this.f38196d = is.k.j2(sc.b.g0(jSONArray2));
        }
    }
}
