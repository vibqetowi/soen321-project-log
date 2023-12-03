package m5;

import kotlin.jvm.internal.i;
import org.json.JSONObject;
/* compiled from: PathComponent.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f24842a;

    /* renamed from: b  reason: collision with root package name */
    public final int f24843b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24844c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24845d;

    /* renamed from: e  reason: collision with root package name */
    public final String f24846e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f24847g;

    /* renamed from: h  reason: collision with root package name */
    public final int f24848h;

    public c(JSONObject jSONObject) {
        String string = jSONObject.getString("class_name");
        i.f(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f24842a = string;
        this.f24843b = jSONObject.optInt("index", -1);
        this.f24844c = jSONObject.optInt("id");
        String optString = jSONObject.optString("text");
        i.f(optString, "component.optString(PATH_TEXT_KEY)");
        this.f24845d = optString;
        String optString2 = jSONObject.optString("tag");
        i.f(optString2, "component.optString(PATH_TAG_KEY)");
        this.f24846e = optString2;
        String optString3 = jSONObject.optString("description");
        i.f(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f = optString3;
        String optString4 = jSONObject.optString("hint");
        i.f(optString4, "component.optString(PATH_HINT_KEY)");
        this.f24847g = optString4;
        this.f24848h = jSONObject.optInt("match_bitmask");
    }
}
