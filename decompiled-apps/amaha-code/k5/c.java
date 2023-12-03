package k5;

import android.content.SharedPreferences;
import h5.n;
import h5.p;
import h5.q;
import h5.u;
import h5.w;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.e0;
import w5.v;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements q.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22970a;

    public /* synthetic */ c(int i6) {
        this.f22970a = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    @Override // h5.q.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(u uVar) {
        boolean z10;
        boolean z11;
        w wVar = w.APP_EVENTS;
        switch (this.f22970a) {
            case 0:
                d.f22971a.getClass();
                String str = d.f22972b;
                Object obj = null;
                r2 = null;
                r2 = null;
                r2 = null;
                r2 = null;
                r2 = null;
                LinkedHashMap linkedHashMap = null;
                boolean z12 = false;
                n nVar = uVar.f17318c;
                if (nVar != null) {
                    v.a aVar = v.f36544d;
                    if (str != null) {
                        nVar.toString();
                        String.valueOf(nVar.C);
                        p.i(wVar);
                        if (!b6.a.b(d.class)) {
                            try {
                                SharedPreferences sharedPreferences = p.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                                if (sharedPreferences != null) {
                                    String string = sharedPreferences.getString("dataset_id", null);
                                    String string2 = sharedPreferences.getString("endpoint", null);
                                    String string3 = sharedPreferences.getString("access_key", null);
                                    if (string != null && !gv.n.B0(string)) {
                                        z10 = false;
                                        if (!z10) {
                                            if (string2 != null && !gv.n.B0(string2)) {
                                                z11 = false;
                                                if (!z11) {
                                                    if (!((string3 == null || gv.n.B0(string3)) ? true : true)) {
                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                        linkedHashMap2.put("endpoint", string2);
                                                        linkedHashMap2.put("dataset_id", string);
                                                        linkedHashMap2.put("access_key", string3);
                                                        p.i(wVar);
                                                        linkedHashMap = linkedHashMap2;
                                                    }
                                                }
                                            }
                                            z11 = true;
                                            if (!z11) {
                                            }
                                        }
                                    }
                                    z10 = true;
                                    if (!z10) {
                                    }
                                }
                            } catch (Throwable th2) {
                                b6.a.a(d.class, th2);
                            }
                        }
                        if (linkedHashMap != null) {
                            URL url = new URL(String.valueOf(linkedHashMap.get("endpoint")));
                            HashSet<Integer> hashSet = f.f22988a;
                            String valueOf = String.valueOf(linkedHashMap.get("dataset_id"));
                            f.a(valueOf, url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(linkedHashMap.get("access_key")));
                            d.f22973c = true;
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                v.a aVar2 = v.f36544d;
                if (str != null) {
                    p.i(wVar);
                    try {
                        e0 e0Var = e0.f36453a;
                        JSONObject jSONObject = uVar.f17317b;
                        if (jSONObject != null) {
                            obj = jSONObject.get("data");
                        }
                        if (obj != null) {
                            HashMap h10 = e0.h(new JSONObject((String) is.u.i2(e0.g((JSONArray) obj))));
                            String str2 = (String) h10.get("endpoint");
                            String str3 = (String) h10.get("dataset_id");
                            String str4 = (String) h10.get("access_key");
                            if (str2 != null && str3 != null && str4 != null) {
                                try {
                                    f.a(str3, str2, str4);
                                    d.a(h10);
                                    if (h10.get("is_enabled") != null) {
                                        Object obj2 = h10.get("is_enabled");
                                        if (obj2 != null) {
                                            z12 = ((Boolean) obj2).booleanValue();
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                        }
                                    }
                                    d.f22973c = z12;
                                    return;
                                } catch (MalformedURLException e10) {
                                    v.a aVar3 = v.f36544d;
                                    ca.a.o1(e10);
                                    p.i(wVar);
                                    return;
                                }
                            }
                            v.a.a(wVar, str, "CloudBridge Settings API response doesn't have valid data");
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                    } catch (NullPointerException e11) {
                        v.a aVar4 = v.f36544d;
                        ca.a.o1(e11);
                        p.i(wVar);
                        return;
                    } catch (JSONException e12) {
                        v.a aVar5 = v.f36544d;
                        ca.a.o1(e12);
                        p.i(wVar);
                        return;
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            default:
                v.a aVar6 = v.f36544d;
                v.a.a(wVar, l5.e.a(), "App index sent to FB!");
                return;
        }
    }
}
