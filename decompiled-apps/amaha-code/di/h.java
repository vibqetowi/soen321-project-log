package di;

import org.json.JSONObject;
/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f12892u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ JSONObject f12893v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(JSONObject jSONObject, String str) {
        super(0);
        this.f12892u = str;
        this.f12893v = jSONObject;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f12892u + " \n " + ((Object) this.f12893v.toString(4));
    }
}
