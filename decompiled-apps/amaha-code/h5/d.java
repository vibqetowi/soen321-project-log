package h5;

import h5.f;
import h5.q;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements q.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17199a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17200b;

    public /* synthetic */ d(int i6, Object obj) {
        this.f17199a = i6;
        this.f17200b = obj;
    }

    @Override // h5.q.b
    public final void a(u uVar) {
        n nVar = uVar.f17318c;
        JSONObject jSONObject = uVar.f17319d;
        int i6 = this.f17199a;
        Boolean bool = null;
        Object obj = this.f17200b;
        switch (i6) {
            case 0:
                f.d refreshResult = (f.d) obj;
                kotlin.jvm.internal.i.g(refreshResult, "$refreshResult");
                if (jSONObject != null) {
                    refreshResult.f17219a = jSONObject.optString("access_token");
                    refreshResult.f17220b = jSONObject.optInt("expires_at");
                    refreshResult.f17221c = jSONObject.optInt("expires_in");
                    refreshResult.f17222d = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                    refreshResult.f17223e = jSONObject.optString("graph_domain", null);
                    return;
                }
                return;
            case 1:
            default:
                ArrayList<c6.a> validReports = (ArrayList) obj;
                kotlin.jvm.internal.i.g(validReports, "$validReports");
                if (nVar == null) {
                    if (jSONObject != null) {
                        try {
                            bool = Boolean.valueOf(jSONObject.getBoolean("success"));
                        } catch (JSONException unused) {
                            return;
                        }
                    }
                    if (kotlin.jvm.internal.i.b(bool, Boolean.TRUE)) {
                        for (c6.a aVar : validReports) {
                            sp.b.o(aVar.f4989a);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                defpackage.e.t(obj);
                return;
            case 3:
                y5.a instrumentData = (y5.a) obj;
                kotlin.jvm.internal.i.g(instrumentData, "$instrumentData");
                if (nVar == null) {
                    if (jSONObject != null) {
                        try {
                            bool = Boolean.valueOf(jSONObject.getBoolean("success"));
                        } catch (JSONException unused2) {
                            return;
                        }
                    }
                    if (kotlin.jvm.internal.i.b(bool, Boolean.TRUE)) {
                        sp.b.o(instrumentData.f38256a);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
