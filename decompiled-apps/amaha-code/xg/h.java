package xg;

import com.google.firebase.database.core.ServerValues;
import hh.g;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: EventUtil.kt */
/* loaded from: classes.dex */
public final class h {

    /* compiled from: EventUtil.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f37771u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_EventUtil transformEventAttributesForEvaluationPackage() : ";
        }
    }

    public static final JSONObject a(JSONObject eventAttributes) {
        kotlin.jvm.internal.i.g(eventAttributes, "eventAttributes");
        JSONObject jSONObject = new JSONObject();
        try {
            if (eventAttributes.has("EVENT_ATTRS")) {
                jSONObject = new JSONObject(eventAttributes.getString("EVENT_ATTRS"));
            }
            if (eventAttributes.has("EVENT_ATTRS_CUST")) {
                JSONObject jSONObject2 = new JSONObject(eventAttributes.getString("EVENT_ATTRS_CUST"));
                if (jSONObject2.has(ServerValues.NAME_OP_TIMESTAMP)) {
                    JSONArray jSONArray = jSONObject2.getJSONArray(ServerValues.NAME_OP_TIMESTAMP);
                    int length = jSONArray.length();
                    int i6 = 0;
                    while (i6 < length) {
                        int i10 = i6 + 1;
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i6);
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Date date = new Date();
                            date.setTime(jSONObject3.getLong(next));
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
                            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                            jSONObject.put(next, simpleDateFormat.format(date));
                        }
                        i6 = i10;
                    }
                }
            }
        } catch (JSONException e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, a.f37771u);
        }
        return jSONObject;
    }
}
