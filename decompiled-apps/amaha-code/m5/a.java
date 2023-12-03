package m5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: EventBinding.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f24832a;

    /* renamed from: b  reason: collision with root package name */
    public final List<m5.c> f24833b;

    /* renamed from: c  reason: collision with root package name */
    public final List<m5.b> f24834c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24835d;

    /* compiled from: EventBinding.kt */
    /* renamed from: m5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0402a {
        /* JADX INFO: Fake field, exist only in values array */
        CLICK,
        /* JADX INFO: Fake field, exist only in values array */
        SELECTED,
        /* JADX INFO: Fake field, exist only in values array */
        TEXT_CHANGED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0402a[] valuesCustom() {
            return (EnumC0402a[]) Arrays.copyOf(values(), 3);
        }
    }

    /* compiled from: EventBinding.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static a a(JSONObject jSONObject) {
            int length;
            String eventName = jSONObject.getString("event_name");
            String string = jSONObject.getString("method");
            i.f(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            i.f(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            i.f(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c valueOf = c.valueOf(upperCase);
            String string2 = jSONObject.getString("event_type");
            i.f(string2, "mapping.getString(\"event_type\")");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            i.f(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            EnumC0402a valueOf2 = EnumC0402a.valueOf(upperCase2);
            String appVersion = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i6 = 0;
            if (length2 > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jsonPath = jSONArray.getJSONObject(i10);
                    i.f(jsonPath, "jsonPath");
                    arrayList.add(new m5.c(jsonPath));
                    if (i11 >= length2) {
                        break;
                    }
                    i10 = i11;
                }
            }
            String pathType = jSONObject.optString("path_type", "absolute");
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i12 = i6 + 1;
                    JSONObject jsonParameter = optJSONArray.getJSONObject(i6);
                    i.f(jsonParameter, "jsonParameter");
                    arrayList2.add(new m5.b(jsonParameter));
                    if (i12 >= length) {
                        break;
                    }
                    i6 = i12;
                }
            }
            String componentId = jSONObject.optString("component_id");
            String activityName = jSONObject.optString("activity_name");
            i.f(eventName, "eventName");
            i.f(appVersion, "appVersion");
            i.f(componentId, "componentId");
            i.f(pathType, "pathType");
            i.f(activityName, "activityName");
            return new a(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }
    }

    /* compiled from: EventBinding.kt */
    /* loaded from: classes.dex */
    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        MANUAL,
        /* JADX INFO: Fake field, exist only in values array */
        INFERENCE;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            return (c[]) Arrays.copyOf(values(), 2);
        }
    }

    public a(String str, c method, EnumC0402a type, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5) {
        i.g(method, "method");
        i.g(type, "type");
        this.f24832a = str;
        this.f24833b = arrayList;
        this.f24834c = arrayList2;
        this.f24835d = str5;
    }
}
