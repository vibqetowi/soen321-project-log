package qi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: Condition.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f29594a;

    /* renamed from: b  reason: collision with root package name */
    public final List<bj.a> f29595b;

    public b(JSONObject jSONObject, ArrayList arrayList) {
        this.f29594a = jSONObject;
        this.f29595b = arrayList;
    }

    public final String toString() {
        return "Condition{conditionAttribute=" + this.f29594a + ", actionList=" + this.f29595b + '}';
    }
}
