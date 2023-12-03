package lg;

import java.security.SecureRandom;
import kotlin.jvm.internal.b0;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SessionMetadata.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public long f24357a;

    /* renamed from: b  reason: collision with root package name */
    public long f24358b;

    /* renamed from: c  reason: collision with root package name */
    public long f24359c;

    /* renamed from: d  reason: collision with root package name */
    public String f24360d;

    /* renamed from: e  reason: collision with root package name */
    public final SecureRandom f24361e;

    public j() {
        b();
        this.f24361e = new SecureRandom();
    }

    public final JSONObject a(boolean z10) {
        long j10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$mp_event_id", Long.toHexString(this.f24361e.nextLong()));
            jSONObject.put("$mp_session_id", this.f24360d);
            if (z10) {
                j10 = this.f24357a;
            } else {
                j10 = this.f24358b;
            }
            jSONObject.put("$mp_session_seq_id", j10);
            jSONObject.put("$mp_session_start_sec", this.f24359c);
            if (z10) {
                this.f24357a++;
            } else {
                this.f24358b++;
            }
        } catch (JSONException e10) {
            b0.n("MixpanelAPI.ConfigurationChecker", "Cannot create session metadata JSON object", e10);
        }
        return jSONObject;
    }

    public final void b() {
        this.f24357a = 0L;
        this.f24358b = 0L;
        this.f24360d = Long.toHexString(new SecureRandom().nextLong());
        this.f24359c = System.currentTimeMillis() / 1000;
    }
}
