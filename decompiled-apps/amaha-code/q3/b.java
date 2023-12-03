package q3;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import com.google.android.gms.internal.cast.w;
import com.theinnerhour.b2b.utils.SessionManager;
import hs.k;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.d0;
import ls.d;
import ns.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ss.q;
import u3.g;
import y3.e;
import y3.f;
import y3.h;
/* compiled from: AndroidStorage.kt */
/* loaded from: classes.dex */
public final class b implements g, f {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f29121a;

    /* renamed from: b  reason: collision with root package name */
    public final e f29122b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f29123c;

    /* compiled from: AndroidStorage.kt */
    @ns.e(c = "com.amplitude.android.utilities.AndroidStorage", f = "AndroidStorage.kt", l = {R.styleable.AppCompatTheme_autoCompleteTextViewStyle}, m = "writeEvent")
    /* loaded from: classes.dex */
    public static final class a extends c {

        /* renamed from: u  reason: collision with root package name */
        public b f29124u;

        /* renamed from: v  reason: collision with root package name */
        public v3.a f29125v;

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f29126w;

        /* renamed from: y  reason: collision with root package name */
        public int f29128y;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f29126w = obj;
            this.f29128y |= LinearLayoutManager.INVALID_OFFSET;
            return b.this.h(null, this);
        }
    }

    public b(Context context, String apiKey) {
        i.g(context, "context");
        i.g(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(i.n(apiKey, "amplitude-android-"), 0);
        i.f(sharedPreferences, "context.getSharedPrefere…y\", Context.MODE_PRIVATE)");
        this.f29121a = sharedPreferences;
        File dir = context.getDir("amplitude-disk-queue", 0);
        i.f(dir, "context.getDir(\"amplitud…e\", Context.MODE_PRIVATE)");
        this.f29122b = new e(dir, apiKey, new q3.a(sharedPreferences));
        this.f29123c = new LinkedHashMap();
    }

    @Override // u3.g
    public final ArrayList a() {
        e eVar = this.f29122b;
        eVar.getClass();
        File[] listFiles = eVar.f38209a.listFiles(new y3.d(eVar, 1));
        if (listFiles == null) {
            listFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    @Override // u3.g
    public final k b(g.a aVar, String str) {
        this.f29121a.edit().putString(aVar.f33792u, str).apply();
        return k.f19476a;
    }

    @Override // u3.g
    public final h c(w3.f fVar, u3.e configuration, d0 scope, a0 dispatcher, Object events, String eventsString) {
        i.g(configuration, "configuration");
        i.g(scope, "scope");
        i.g(dispatcher, "dispatcher");
        i.g(events, "events");
        i.g(eventsString, "eventsString");
        return new h(this, fVar, configuration, scope, dispatcher, (String) events, eventsString);
    }

    @Override // y3.f
    public final void d(String insertId) {
        i.g(insertId, "insertId");
        this.f29123c.remove(insertId);
    }

    @Override // y3.f
    public final void e(String filePath, JSONArray events) {
        i.g(filePath, "filePath");
        i.g(events, "events");
        e eVar = this.f29122b;
        eVar.getClass();
        File file = new File(filePath);
        if (file.exists()) {
            String name = file.getName();
            String n10 = i.n("-1.tmp", name);
            File file2 = eVar.f38209a;
            File file3 = new File(file2, n10);
            File file4 = new File(file2, i.n("-2.tmp", name));
            int length = events.length() / 2;
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            xs.e it = kotlin.jvm.internal.h.k0(0, events.length()).iterator();
            while (it.f38001w) {
                int nextInt = it.nextInt();
                if (nextInt < length) {
                    jSONArray.put(events.getJSONObject(nextInt));
                } else {
                    jSONArray2.put(events.getJSONObject(nextInt));
                }
            }
            String jSONArray3 = jSONArray.toString();
            i.f(jSONArray3, "firstHalf.toString()");
            String jSONArray4 = jSONArray2.toString();
            i.f(jSONArray4, "secondHalf.toString()");
            eVar.f(file3, jSONArray3);
            eVar.f(file4, jSONArray4);
            e.f38207g.remove(filePath);
            new File(filePath).delete();
        }
    }

    @Override // u3.g
    public final Object f(d<? super k> dVar) {
        Object d10 = this.f29122b.d(dVar);
        if (d10 == ms.a.COROUTINE_SUSPENDED) {
            return d10;
        }
        return k.f19476a;
    }

    @Override // u3.g
    public final Object g(Object obj, w3.d dVar) {
        return this.f29122b.c((String) obj, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0205 A[Catch: JSONException -> 0x024a, TRY_LEAVE, TryCatch #1 {JSONException -> 0x024a, blocks: (B:159:0x01f9, B:165:0x0205, B:168:0x020e, B:174:0x021a, B:177:0x0223, B:183:0x022f, B:186:0x0238, B:192:0x0244), top: B:225:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021a A[Catch: JSONException -> 0x024a, TRY_LEAVE, TryCatch #1 {JSONException -> 0x024a, blocks: (B:159:0x01f9, B:165:0x0205, B:168:0x020e, B:174:0x021a, B:177:0x0223, B:183:0x022f, B:186:0x0238, B:192:0x0244), top: B:225:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0223 A[Catch: JSONException -> 0x024a, TRY_ENTER, TryCatch #1 {JSONException -> 0x024a, blocks: (B:159:0x01f9, B:165:0x0205, B:168:0x020e, B:174:0x021a, B:177:0x0223, B:183:0x022f, B:186:0x0238, B:192:0x0244), top: B:225:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022f A[Catch: JSONException -> 0x024a, TRY_LEAVE, TryCatch #1 {JSONException -> 0x024a, blocks: (B:159:0x01f9, B:165:0x0205, B:168:0x020e, B:174:0x021a, B:177:0x0223, B:183:0x022f, B:186:0x0238, B:192:0x0244), top: B:225:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0238 A[Catch: JSONException -> 0x024a, TRY_ENTER, TryCatch #1 {JSONException -> 0x024a, blocks: (B:159:0x01f9, B:165:0x0205, B:168:0x020e, B:174:0x021a, B:177:0x0223, B:183:0x022f, B:186:0x0238, B:192:0x0244), top: B:225:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0244 A[Catch: JSONException -> 0x024a, TRY_LEAVE, TryCatch #1 {JSONException -> 0x024a, blocks: (B:159:0x01f9, B:165:0x0205, B:168:0x020e, B:174:0x021a, B:177:0x0223, B:183:0x022f, B:186:0x0238, B:192:0x0244), top: B:225:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x026e A[Catch: JSONException -> 0x0286, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0286, blocks: (B:201:0x0262, B:207:0x026e, B:210:0x0277, B:214:0x0280), top: B:223:0x0262 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0280 A[Catch: JSONException -> 0x0286, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0286, blocks: (B:201:0x0262, B:207:0x026e, B:210:0x0277, B:214:0x0280), top: B:223:0x0262 }] */
    @Override // u3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(v3.a event, d<? super k> dVar) {
        a aVar;
        int i6;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        String str3;
        boolean z13;
        String str4;
        boolean z14;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f29128y;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f29128y = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f29126w;
                ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                i6 = aVar.f29128y;
                if (i6 == 0) {
                    if (i6 == 1) {
                        event = aVar.f29125v;
                        b bVar = aVar.f29124u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    i.g(event, "event");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_type", event.a());
                    Object obj2 = event.f34776a;
                    if (obj2 != null) {
                        jSONObject.put("user_id", obj2);
                    }
                    Object obj3 = event.f34777b;
                    if (obj3 != null) {
                        jSONObject.put("device_id", obj3);
                    }
                    Object obj4 = event.f34778c;
                    if (obj4 != null) {
                        jSONObject.put("time", obj4);
                    }
                    jSONObject.put("event_properties", sc.b.k0(hc.d.m0(event.M)));
                    jSONObject.put("user_properties", sc.b.k0(hc.d.m0(event.N)));
                    jSONObject.put("groups", sc.b.k0(hc.d.m0(event.O)));
                    jSONObject.put("group_properties", sc.b.k0(hc.d.m0(event.P)));
                    Object obj5 = event.f34783i;
                    if (obj5 != null) {
                        jSONObject.put("app_version", obj5);
                    }
                    Object obj6 = event.f34785k;
                    if (obj6 != null) {
                        jSONObject.put("platform", obj6);
                    }
                    Object obj7 = event.f34786l;
                    if (obj7 != null) {
                        jSONObject.put("os_name", obj7);
                    }
                    Object obj8 = event.f34787m;
                    if (obj8 != null) {
                        jSONObject.put("os_version", obj8);
                    }
                    Object obj9 = event.f34788n;
                    if (obj9 != null) {
                        jSONObject.put("device_brand", obj9);
                    }
                    Object obj10 = event.f34789o;
                    if (obj10 != null) {
                        jSONObject.put("device_manufacturer", obj10);
                    }
                    Object obj11 = event.f34790p;
                    if (obj11 != null) {
                        jSONObject.put("device_model", obj11);
                    }
                    Object obj12 = event.f34791q;
                    if (obj12 != null) {
                        jSONObject.put("carrier", obj12);
                    }
                    Object obj13 = event.r;
                    if (obj13 != null) {
                        jSONObject.put("country", obj13);
                    }
                    Object obj14 = event.f34792s;
                    if (obj14 != null) {
                        jSONObject.put("region", obj14);
                    }
                    Object obj15 = event.f34793t;
                    if (obj15 != null) {
                        jSONObject.put("city", obj15);
                    }
                    Object obj16 = event.f34794u;
                    if (obj16 != null) {
                        jSONObject.put("dma", obj16);
                    }
                    Object obj17 = event.A;
                    if (obj17 != null) {
                        jSONObject.put("language", obj17);
                    }
                    Object obj18 = event.G;
                    if (obj18 != null) {
                        jSONObject.put("price", obj18);
                    }
                    Object obj19 = event.H;
                    if (obj19 != null) {
                        jSONObject.put("quantity", obj19);
                    }
                    Object obj20 = event.F;
                    if (obj20 != null) {
                        jSONObject.put("revenue", obj20);
                    }
                    Object obj21 = event.I;
                    if (obj21 != null) {
                        jSONObject.put("productId", obj21);
                    }
                    Object obj22 = event.J;
                    if (obj22 != null) {
                        jSONObject.put("revenueType", obj22);
                    }
                    Object obj23 = event.f34781g;
                    if (obj23 != null) {
                        jSONObject.put("location_lat", obj23);
                    }
                    Object obj24 = event.f34782h;
                    if (obj24 != null) {
                        jSONObject.put("location_lng", obj24);
                    }
                    Object obj25 = event.C;
                    if (obj25 != null) {
                        jSONObject.put("ip", obj25);
                    }
                    Object obj26 = event.f34784j;
                    if (obj26 != null) {
                        jSONObject.put("version_name", obj26);
                    }
                    Object obj27 = event.f34795v;
                    if (obj27 != null) {
                        jSONObject.put("idfa", obj27);
                    }
                    Object obj28 = event.f34796w;
                    if (obj28 != null) {
                        jSONObject.put("idfv", obj28);
                    }
                    Object obj29 = event.f34797x;
                    if (obj29 != null) {
                        jSONObject.put("adid", obj29);
                    }
                    Object obj30 = event.f34799z;
                    if (obj30 != null) {
                        jSONObject.put("android_id", obj30);
                    }
                    Object obj31 = event.f34779d;
                    if (obj31 != null) {
                        jSONObject.put("event_id", obj31);
                    }
                    Object valueOf = Long.valueOf(event.f34780e);
                    if (valueOf != null) {
                        jSONObject.put("session_id", valueOf);
                    }
                    Object obj32 = event.f;
                    if (obj32 != null) {
                        jSONObject.put("insert_id", obj32);
                    }
                    Object obj33 = event.B;
                    if (obj33 != null) {
                        jSONObject.put("library", obj33);
                    }
                    Object obj34 = event.K;
                    if (obj34 != null) {
                        jSONObject.put(SessionManager.KEY_PARTNER_ID, obj34);
                    }
                    Object obj35 = event.f34798y;
                    if (obj35 != null) {
                        jSONObject.put("android_app_set_id", obj35);
                    }
                    v3.e eVar = event.D;
                    boolean z15 = false;
                    if (eVar != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        String str5 = eVar.f34802a;
                        if (str5 != null) {
                            try {
                            } catch (JSONException unused) {
                                w.g(4, "JSON Serialization of tacking plan object failed");
                            }
                            if (str5.length() != 0) {
                                z11 = false;
                                if (!z11) {
                                    jSONObject2.put("branch", str5);
                                }
                                str2 = eVar.f34803b;
                                if (str2 != null && str2.length() != 0) {
                                    z12 = false;
                                    if (!z12) {
                                        jSONObject2.put("source", str2);
                                    }
                                    str3 = eVar.f34804c;
                                    if (str3 != null && str3.length() != 0) {
                                        z13 = false;
                                        if (!z13) {
                                            jSONObject2.put("version", str3);
                                        }
                                        str4 = eVar.f34805d;
                                        if (str4 != null && str4.length() != 0) {
                                            z14 = false;
                                            if (!z14) {
                                                jSONObject2.put("versionId", str4);
                                            }
                                            jSONObject.put("plan", jSONObject2);
                                        }
                                        z14 = true;
                                        if (!z14) {
                                        }
                                        jSONObject.put("plan", jSONObject2);
                                    }
                                    z13 = true;
                                    if (!z13) {
                                    }
                                    str4 = eVar.f34805d;
                                    if (str4 != null) {
                                        z14 = false;
                                        if (!z14) {
                                        }
                                        jSONObject.put("plan", jSONObject2);
                                    }
                                    z14 = true;
                                    if (!z14) {
                                    }
                                    jSONObject.put("plan", jSONObject2);
                                }
                                z12 = true;
                                if (!z12) {
                                }
                                str3 = eVar.f34804c;
                                if (str3 != null) {
                                    z13 = false;
                                    if (!z13) {
                                    }
                                    str4 = eVar.f34805d;
                                    if (str4 != null) {
                                    }
                                    z14 = true;
                                    if (!z14) {
                                    }
                                    jSONObject.put("plan", jSONObject2);
                                }
                                z13 = true;
                                if (!z13) {
                                }
                                str4 = eVar.f34805d;
                                if (str4 != null) {
                                }
                                z14 = true;
                                if (!z14) {
                                }
                                jSONObject.put("plan", jSONObject2);
                            }
                        }
                        z11 = true;
                        if (!z11) {
                        }
                        str2 = eVar.f34803b;
                        if (str2 != null) {
                            z12 = false;
                            if (!z12) {
                            }
                            str3 = eVar.f34804c;
                            if (str3 != null) {
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            str4 = eVar.f34805d;
                            if (str4 != null) {
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            jSONObject.put("plan", jSONObject2);
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        str3 = eVar.f34804c;
                        if (str3 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        str4 = eVar.f34805d;
                        if (str4 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        jSONObject.put("plan", jSONObject2);
                    }
                    v3.d dVar2 = event.E;
                    if (dVar2 != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        String str6 = dVar2.f34800a;
                        if (str6 != null) {
                            try {
                            } catch (JSONException unused2) {
                                w.g(4, "JSON Serialization of ingestion metadata object failed");
                            }
                            if (str6.length() != 0) {
                                z10 = false;
                                if (!z10) {
                                    jSONObject3.put("source_name", str6);
                                }
                                str = dVar2.f34801b;
                                if (!((str != null || str.length() == 0) ? true : true)) {
                                    jSONObject3.put("source_version", str);
                                }
                                jSONObject.put("ingestion_metadata", jSONObject3);
                            }
                        }
                        z10 = true;
                        if (!z10) {
                        }
                        str = dVar2.f34801b;
                        if (!((str != null || str.length() == 0) ? true : true)) {
                        }
                        jSONObject.put("ingestion_metadata", jSONObject3);
                    }
                    String jSONObject4 = jSONObject.toString();
                    i.f(jSONObject4, "eventToJsonObject(event).toString()");
                    aVar.f29124u = this;
                    aVar.f29125v = event;
                    aVar.f29128y = 1;
                    if (this.f29122b.e(jSONObject4, aVar) == aVar2) {
                        return aVar2;
                    }
                }
                event.getClass();
                return k.f19476a;
            }
        }
        aVar = new a(dVar);
        Object obj36 = aVar.f29126w;
        ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
        i6 = aVar.f29128y;
        if (i6 == 0) {
        }
        event.getClass();
        return k.f19476a;
    }

    @Override // y3.f
    public final q<v3.a, Integer, String, k> i(String str) {
        return (q) this.f29123c.get(str);
    }

    @Override // u3.g
    public final String j(g.a aVar) {
        return this.f29121a.getString(aVar.f33792u, null);
    }

    @Override // y3.f
    public final boolean k(String filePath) {
        i.g(filePath, "filePath");
        this.f29122b.getClass();
        e.f38207g.remove(filePath);
        return new File(filePath).delete();
    }
}
