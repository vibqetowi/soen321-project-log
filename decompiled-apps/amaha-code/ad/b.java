package ad;

import android.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import v9.o;
/* compiled from: DefaultAppCheckToken.java */
/* loaded from: classes.dex */
public final class b extends zc.b {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f477d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f478a;

    /* renamed from: b  reason: collision with root package name */
    public final long f479b;

    /* renamed from: c  reason: collision with root package name */
    public final long f480c;

    public b(long j10, String str, long j11) {
        o.e(str);
        this.f478a = str;
        this.f480c = j10;
        this.f479b = j11;
    }

    public static b c(String str) {
        o.h(str);
        Map N0 = f6.b.N0(str);
        long e10 = e("iat", N0);
        return new b((e("exp", N0) - e10) * 1000, str, e10 * 1000);
    }

    public static b d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.getLong("expiresIn"), jSONObject.getString("token"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e10) {
            Log.e("ad.b", "Could not deserialize token: " + e10.getMessage());
            return null;
        }
    }

    public static long e(String str, Map map) {
        o.h(map);
        o.e(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // zc.b
    public final long a() {
        return this.f479b + this.f480c;
    }

    @Override // zc.b
    public final String b() {
        return this.f478a;
    }
}
