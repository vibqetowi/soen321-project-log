package oh;

import kotlin.jvm.internal.i;
import org.json.JSONObject;
/* compiled from: ReportAddPayload.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f27467a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f27468b;

    public d(JSONObject batchData, JSONObject queryParams) {
        i.g(batchData, "batchData");
        i.g(queryParams, "queryParams");
        this.f27467a = batchData;
        this.f27468b = queryParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (i.b(this.f27467a, dVar.f27467a) && i.b(this.f27468b, dVar.f27468b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27468b.hashCode() + (this.f27467a.hashCode() * 31);
    }

    public final String toString() {
        return "ReportAddPayload(batchData=" + this.f27467a + ", queryParams=" + this.f27468b + ')';
    }
}
