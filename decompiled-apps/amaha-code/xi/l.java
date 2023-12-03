package xi;

import android.net.Uri;
import androidx.recyclerview.widget.k;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.n;
import hh.g;
import ih.o;
import ih.p;
import is.w;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s1.s;
/* compiled from: RemoteRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public final f f37803a;

    /* renamed from: b  reason: collision with root package name */
    public final j f37804b;

    public l(p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f37803a = new f(sdkInstance);
        this.f37804b = new j(sdkInstance);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7 A[Catch: Exception -> 0x0086, TRY_LEAVE, TryCatch #1 {Exception -> 0x0086, blocks: (B:3:0x0006, B:6:0x005b, B:9:0x0089, B:12:0x009b, B:18:0x00a7, B:21:0x00b0, B:23:0x00b7, B:24:0x00c0, B:26:0x00c6, B:27:0x00d0, B:28:0x00d5), top: B:52:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[Catch: Exception -> 0x0086, LOOP:0: B:24:0x00c0->B:26:0x00c6, LOOP_END, TryCatch #1 {Exception -> 0x0086, blocks: (B:3:0x0006, B:6:0x005b, B:9:0x0089, B:12:0x009b, B:18:0x00a7, B:21:0x00b0, B:23:0x00b7, B:24:0x00c0, B:26:0x00c6, B:27:0x00d0, B:28:0x00d5), top: B:52:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012c  */
    @Override // xi.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ih.m d(ti.b bVar) {
        xh.a cVar;
        Object a10;
        Uri.Builder appendQueryParameter;
        JSONObject jSONObject;
        String str;
        boolean z10;
        Set<String> set;
        f fVar = this.f37803a;
        p pVar = fVar.f37796a;
        try {
            appendQueryParameter = f6.b.A0(pVar).appendEncodedPath("v3/campaigns/inapp/").appendEncodedPath("live").appendEncodedPath(bVar.f33030g).appendQueryParameter("unique_id", (String) bVar.f22022e).appendQueryParameter("sdk_ver", String.valueOf(bVar.f22019b)).appendQueryParameter("os", (String) bVar.f).appendQueryParameter("device_type", bVar.f33035l.toString()).appendQueryParameter("inapp_ver", bVar.f33036m);
            jSONObject = new JSONObject();
            s sVar = bVar.f33031h;
            if (sVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(SessionManager.KEY_NAME, (String) sVar.f31225w);
                jSONObject2.put("time", (String) sVar.f31226x);
                JSONObject jSONObject3 = (JSONObject) sVar.f31224v;
                kotlin.jvm.internal.i.f(jSONObject3, "campaignRequest.triggerMeta.attributes");
                jSONObject2.put("attributes", jSONObject3);
                jSONObject.put("event", jSONObject2);
            }
            JSONObject value = ((di.l) bVar.f22021d).f12898b;
            kotlin.jvm.internal.i.g(value, "value");
            jSONObject.put("query_params", value);
            str = bVar.f33032i;
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new b(fVar));
            cVar = new xh.c(-100, "");
        }
        if (str != null && !n.B0(str)) {
            z10 = false;
            if (!z10) {
                jSONObject.put("screen_name", str);
            }
            set = bVar.f33033j;
            if (set != null && (!set.isEmpty())) {
                JSONArray jSONArray = new JSONArray();
                for (String str2 : set) {
                    jSONArray.put(str2);
                }
                jSONObject.put("contexts", jSONArray);
            }
            JSONObject value2 = bVar.f33034k.f586b;
            kotlin.jvm.internal.i.g(value2, "value");
            jSONObject.put("campaign_context", value2);
            Uri build = appendQueryParameter.build();
            kotlin.jvm.internal.i.f(build, "uriBuilder.build()");
            xh.b z02 = f6.b.z0(build, 2, pVar);
            z02.f37776c = jSONObject;
            cVar = new xh.e(z02.a(), pVar).e();
            j jVar = this.f37804b;
            jVar.getClass();
            if (!(cVar instanceof xh.c)) {
                xh.c cVar2 = (xh.c) cVar;
                return new ih.n(new ti.a(cVar2.f37783b, cVar2.f37782a, false));
            } else if (cVar instanceof xh.d) {
                try {
                    JSONObject jSONObject4 = new JSONObject(cVar.f37784a);
                    String string = jSONObject4.getString("inapp_type");
                    kotlin.jvm.internal.i.f(string, "responseJson.getString(ResponseParser.INAPP_TYPE)");
                    int d10 = v.h.d(pl.a.o(string));
                    if (d10 != 0) {
                        if (d10 == 1) {
                            a10 = j.b(jSONObject4);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        a10 = j.a(jSONObject4);
                    }
                    return new o(a10);
                } catch (Exception e11) {
                    jVar.f37801a.f20105d.a(1, e11, new g(jVar));
                    return new ih.n(new ti.a(((xh.d) cVar).f37784a, k.d.DEFAULT_DRAG_ANIMATION_DURATION, true));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        z10 = true;
        if (!z10) {
        }
        set = bVar.f33033j;
        if (set != null) {
            JSONArray jSONArray2 = new JSONArray();
            while (r7.hasNext()) {
            }
            jSONObject.put("contexts", jSONArray2);
        }
        JSONObject value22 = bVar.f33034k.f586b;
        kotlin.jvm.internal.i.g(value22, "value");
        jSONObject.put("campaign_context", value22);
        Uri build2 = appendQueryParameter.build();
        kotlin.jvm.internal.i.f(build2, "uriBuilder.build()");
        xh.b z022 = f6.b.z0(build2, 2, pVar);
        z022.f37776c = jSONObject;
        cVar = new xh.e(z022.a(), pVar).e();
        j jVar2 = this.f37804b;
        jVar2.getClass();
        if (!(cVar instanceof xh.c)) {
        }
    }

    @Override // xi.k
    public final ih.m e(oh.c cVar) {
        xh.a cVar2;
        f fVar = this.f37803a;
        p pVar = fVar.f37796a;
        Object obj = cVar.f27465g;
        try {
            hh.g.b(pVar.f20105d, 0, new d(fVar, cVar), 3);
            Uri.Builder appendQueryParameter = f6.b.A0(pVar).appendEncodedPath("v3/campaigns/inapp/").appendEncodedPath("live/stats").appendQueryParameter("sdk_ver", String.valueOf(cVar.f22019b)).appendQueryParameter("os", (String) cVar.f).appendQueryParameter("unique_id", (String) cVar.f22022e).appendQueryParameter("inapp_ver", (String) cVar.f27466h);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stats", ((pi.p) obj).f28514d);
            jSONObject.put("query_params", ((di.l) cVar.f22021d).f12898b);
            Uri build = appendQueryParameter.build();
            kotlin.jvm.internal.i.f(build, "uriBuilder.build()");
            xh.b z02 = f6.b.z0(build, 2, pVar);
            z02.f37776c = jSONObject;
            z02.f37775b.put("MOE-INAPP-BATCH-ID", ((pi.p) obj).f28513c);
            cVar2 = new xh.e(z02.a(), pVar).e();
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new e(fVar));
            cVar2 = new xh.c(-100, "");
        }
        this.f37804b.getClass();
        if (cVar2 instanceof xh.d) {
            return new o(Boolean.TRUE);
        }
        if (cVar2 instanceof xh.c) {
            return new ih.n(null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xi.k
    public final ih.m k(ti.b bVar) {
        xh.a cVar;
        Object a10;
        f fVar = this.f37803a;
        p pVar = fVar.f37796a;
        boolean z10 = true;
        try {
            Uri build = f6.b.A0(pVar).appendEncodedPath("v3/campaigns/inapp/").appendEncodedPath("test").appendEncodedPath(bVar.f33030g).appendQueryParameter("sdk_ver", String.valueOf(bVar.f22019b)).appendQueryParameter("os", (String) bVar.f).appendQueryParameter("unique_id", (String) bVar.f22022e).appendQueryParameter("device_type", bVar.f33035l.toString()).appendQueryParameter("inapp_ver", bVar.f33036m).build();
            kotlin.jvm.internal.i.f(build, "uriBuilder.build()");
            cVar = new xh.e(f6.b.z0(build, 1, pVar).a(), pVar).e();
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new c(fVar));
            cVar = new xh.c(-100, "");
        }
        this.f37804b.getClass();
        if (cVar instanceof xh.c) {
            int i6 = ((xh.c) cVar).f37782a;
            if (i6 == -100) {
                return new ih.n("No Internet Connection.\n Please connect to internet and try again.");
            }
            if ((500 > i6 || i6 >= 600) ? false : false) {
                return new ih.n("Could not reach MoEngage Server.\n Please try again or contact MoEngage Support.");
            }
            return new ih.n("No Internet Connection.\n Please connect to internet and try again.");
        } else if (cVar instanceof xh.d) {
            JSONObject jSONObject = new JSONObject(((xh.d) cVar).f37784a);
            String string = jSONObject.getString("inapp_type");
            kotlin.jvm.internal.i.f(string, "responseJson.getString(ResponseParser.INAPP_TYPE)");
            int d10 = v.h.d(pl.a.o(string));
            if (d10 != 0) {
                if (d10 == 1) {
                    a10 = j.b(jSONObject);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                a10 = j.a(jSONObject);
            }
            return new o(a10);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xi.k
    public final ih.m v(oh.a aVar) {
        xh.a cVar;
        w wVar;
        f fVar = this.f37803a;
        p pVar = fVar.f37796a;
        try {
            Uri.Builder appendQueryParameter = f6.b.A0(pVar).appendEncodedPath("v3/campaigns/inapp/").appendEncodedPath("live").appendQueryParameter("unique_id", (String) aVar.f22022e).appendQueryParameter("sdk_ver", String.valueOf(aVar.f22019b)).appendQueryParameter("os", (String) aVar.f).appendQueryParameter("device_type", ((ih.h) aVar.f27461h).toString()).appendQueryParameter("inapp_ver", (String) aVar.f27462i).appendQueryParameter("push_opt_in_status", String.valueOf(aVar.f27460g));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("query_params", ((di.l) aVar.f22021d).f12898b);
            Uri build = appendQueryParameter.build();
            kotlin.jvm.internal.i.f(build, "uriBuilder.build()");
            xh.b z02 = f6.b.z0(build, 2, pVar);
            z02.f37776c = jSONObject;
            cVar = new xh.e(z02.a(), pVar).e();
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new a(fVar));
            cVar = new xh.c(-100, "");
        }
        j jVar = this.f37804b;
        jVar.getClass();
        if (cVar instanceof xh.c) {
            return new ih.n(null);
        }
        if (cVar instanceof xh.d) {
            JSONObject jSONObject2 = new JSONObject(((xh.d) cVar).f37784a);
            p pVar2 = jVar.f37801a;
            w wVar2 = w.f20676u;
            try {
            } catch (Exception e11) {
                pVar2.f20105d.a(1, e11, new i(jVar));
            }
            if (jSONObject2.has("campaigns")) {
                JSONArray jSONArray = jSONObject2.getJSONArray("campaigns");
                if (jSONArray.length() != 0) {
                    String tag = jVar.f37802b;
                    kotlin.jvm.internal.i.g(tag, "tag");
                    int i6 = 0;
                    try {
                        int length = jSONArray.length();
                        int i10 = 0;
                        while (i10 < length) {
                            int i11 = i10 + 1;
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                            hh.a aVar2 = hh.g.f17610d;
                            g.a.b(0, new di.h(jSONObject3, tag), 3);
                            i10 = i11;
                        }
                    } catch (JSONException e12) {
                        hh.a aVar3 = hh.g.f17610d;
                        g.a.a(1, e12, di.i.f12894u);
                    }
                    ArrayList arrayList = new ArrayList();
                    int length2 = jSONArray.length();
                    while (i6 < length2) {
                        int i12 = i6 + 1;
                        try {
                            JSONObject campaignJson = jSONArray.getJSONObject(i6);
                            kotlin.jvm.internal.i.f(campaignJson, "campaignJson");
                            arrayList.add(df.b.v(campaignJson));
                        } catch (Exception e13) {
                            pVar2.f20105d.a(1, e13, new h(jVar));
                        }
                        i6 = i12;
                    }
                    wVar = arrayList;
                    return new o(new ti.c(wVar, jSONObject2.optLong("sync_interval", -1L), jSONObject2.getLong("min_delay_btw_inapps")));
                }
            }
            wVar = wVar2;
            return new o(new ti.c(wVar, jSONObject2.optLong("sync_interval", -1L), jSONObject2.getLong("min_delay_btw_inapps")));
        }
        throw new NoWhenBranchMatchedException();
    }
}
