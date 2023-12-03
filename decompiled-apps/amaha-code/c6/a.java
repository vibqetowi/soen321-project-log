package c6;

import com.google.firebase.database.core.ServerValues;
import java.io.File;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import sp.b;
/* compiled from: ErrorReportData.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4989a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4990b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f4991c;

    public a(String str) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f4991c = valueOf;
        this.f4990b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        if (valueOf != null) {
            stringBuffer.append(valueOf.longValue());
            stringBuffer.append(".json");
            String stringBuffer2 = stringBuffer.toString();
            i.f(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
            this.f4989a = stringBuffer2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l2 = this.f4991c;
            if (l2 != null) {
                jSONObject.put(ServerValues.NAME_OP_TIMESTAMP, l2);
            }
            jSONObject.put("error_message", this.f4990b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String jSONObject2 = jSONObject.toString();
        i.f(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    public a(File file) {
        i.g(file, "file");
        String name = file.getName();
        i.f(name, "file.name");
        this.f4989a = name;
        JSONObject T = b.T(name);
        if (T != null) {
            this.f4991c = Long.valueOf(T.optLong(ServerValues.NAME_OP_TIMESTAMP, 0L));
            this.f4990b = T.optString("error_message", null);
        }
    }
}
