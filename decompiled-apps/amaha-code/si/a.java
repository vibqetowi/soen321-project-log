package si;

import com.theinnerhour.b2b.utils.Constants;
import hh.g;
import java.util.LinkedHashSet;
import java.util.Set;
import ni.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: CampaignMeta.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f31572a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31573b;

    /* renamed from: c  reason: collision with root package name */
    public final long f31574c;

    /* renamed from: d  reason: collision with root package name */
    public final long f31575d;

    /* renamed from: e  reason: collision with root package name */
    public final c f31576e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final b f31577g;

    /* renamed from: h  reason: collision with root package name */
    public final g f31578h;

    /* renamed from: i  reason: collision with root package name */
    public final aj.a f31579i;

    /* renamed from: j  reason: collision with root package name */
    public final int f31580j;

    /* renamed from: k  reason: collision with root package name */
    public final Set<ri.c> f31581k;

    /* renamed from: l  reason: collision with root package name */
    public final int f31582l;

    public a(String str, String str2, long j10, long j11, c cVar, String str3, b bVar, g gVar, aj.a aVar, int i6, LinkedHashSet linkedHashSet, int i10) {
        this.f31572a = str;
        this.f31573b = str2;
        this.f31574c = j10;
        this.f31575d = j11;
        this.f31576e = cVar;
        this.f = str3;
        this.f31577g = bVar;
        this.f31578h = gVar;
        this.f31579i = aVar;
        this.f31580j = i6;
        this.f31581k = linkedHashSet;
        this.f31582l = i10;
    }

    public static JSONObject a(a aVar) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            String str = aVar.f31572a;
            aj.a aVar2 = aVar.f31579i;
            JSONObject put = jSONObject2.put(Constants.CAMPAIGN_ID, str).put("campaign_name", aVar.f31573b).put("expiry_time", sp.b.M(aVar.f31574c)).put("updated_time", sp.b.M(aVar.f31575d));
            c cVar = aVar.f31576e;
            try {
                jSONObject = new JSONObject();
                jSONObject.put("rules", f.a(cVar.f31585a));
            } catch (Exception e10) {
                r rVar = new r(10);
                hh.a aVar3 = hh.g.f17610d;
                g.a.a(1, e10, rVar);
                jSONObject = null;
            }
            put.put("display", jSONObject).put("template_type", aVar.f).put("delivery", b.a(aVar.f31577g)).put("trigger", g.a(aVar.f31578h)).put("campaign_context", aVar2).put("campaign_sub_type", defpackage.d.s(aVar.f31582l).toLowerCase());
            if (aVar2 != null) {
                jSONObject2.put("campaign_context", aVar2.f586b);
            }
            int i6 = aVar.f31580j;
            if (i6 != 0) {
                jSONObject2.put("inapp_type", pl.a.j(i6));
            }
            Set<ri.c> set = aVar.f31581k;
            if (set != null) {
                JSONArray jSONArray = new JSONArray();
                for (ri.c cVar2 : set) {
                    jSONArray.put(cVar2);
                }
                jSONObject2.put("orientations", jSONArray);
            }
            return jSONObject2;
        } catch (Exception e11) {
            r rVar2 = new r(8);
            hh.a aVar4 = hh.g.f17610d;
            g.a.a(1, e11, rVar2);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f31574c != aVar.f31574c || this.f31575d != aVar.f31575d || !this.f31572a.equals(aVar.f31572a) || !this.f31573b.equals(aVar.f31573b) || !this.f31576e.equals(aVar.f31576e) || !this.f.equals(aVar.f) || !this.f31577g.equals(aVar.f31577g)) {
            return false;
        }
        aj.a aVar2 = aVar.f31579i;
        aj.a aVar3 = this.f31579i;
        if (aVar3 == null ? aVar2 == null : !aVar3.equals(aVar2)) {
            return false;
        }
        g gVar = aVar.f31578h;
        g gVar2 = this.f31578h;
        if (gVar2 == null ? gVar != null : !gVar2.equals(gVar)) {
            return false;
        }
        if (this.f31580j != aVar.f31580j) {
            return false;
        }
        return this.f31581k.equals(aVar.f31581k);
    }

    public final String toString() {
        try {
            JSONObject a10 = a(this);
            if (a10 != null) {
                return a10.toString(4);
            }
        } catch (JSONException e10) {
            r rVar = new r(7);
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, rVar);
        }
        return super.toString();
    }
}
