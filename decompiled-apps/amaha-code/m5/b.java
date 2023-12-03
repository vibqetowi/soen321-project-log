package m5;

import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ParameterComponent.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f24838a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24839b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f24840c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24841d;

    public b(JSONObject jSONObject) {
        int length;
        String string = jSONObject.getString(SessionManager.KEY_NAME);
        i.f(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f24838a = string;
        String optString = jSONObject.optString("value");
        i.f(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f24839b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        i.f(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f24841d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i6 = 0;
            while (true) {
                int i10 = i6 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i6);
                i.f(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new c(jSONObject2));
                if (i10 >= length) {
                    break;
                }
                i6 = i10;
            }
        }
        this.f24840c = arrayList;
    }
}
