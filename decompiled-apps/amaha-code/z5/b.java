package z5;

import h5.n;
import h5.q;
import h5.u;
import java.util.List;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements q.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f39194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f39195b;

    public /* synthetic */ b(int i6, List list) {
        this.f39194a = i6;
        this.f39195b = list;
    }

    @Override // h5.q.b
    public final void a(u uVar) {
        JSONObject jSONObject = uVar.f17319d;
        n nVar = uVar.f17318c;
        int i6 = this.f39194a;
        Boolean bool = null;
        List<y5.a> validReports = this.f39195b;
        switch (i6) {
            case 0:
                if (!b6.a.b(c.class)) {
                    try {
                        i.g(validReports, "$validReports");
                        if (nVar == null) {
                            if (jSONObject != null) {
                                try {
                                    bool = Boolean.valueOf(jSONObject.getBoolean("success"));
                                } catch (JSONException unused) {
                                    return;
                                }
                            }
                            if (i.b(bool, Boolean.TRUE)) {
                                for (y5.a aVar : validReports) {
                                    sp.b.o(aVar.f38256a);
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        b6.a.a(c.class, th2);
                        return;
                    }
                }
                return;
            default:
                i.g(validReports, "$validReports");
                if (nVar == null) {
                    if (jSONObject != null) {
                        try {
                            bool = Boolean.valueOf(jSONObject.getBoolean("success"));
                        } catch (JSONException unused2) {
                            return;
                        }
                    }
                    if (i.b(bool, Boolean.TRUE)) {
                        for (y5.a aVar2 : validReports) {
                            sp.b.o(aVar2.f38256a);
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
