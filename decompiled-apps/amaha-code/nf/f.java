package nf;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import hd.g;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import nd.z;
import org.json.JSONObject;
import r1.b0;
import ya.k;
/* compiled from: RemoteConfigComponent.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: j  reason: collision with root package name */
    public static final Random f26302j = new Random();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f26303a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f26304b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f26305c;

    /* renamed from: d  reason: collision with root package name */
    public final sc.e f26306d;

    /* renamed from: e  reason: collision with root package name */
    public final se.d f26307e;
    public final tc.b f;

    /* renamed from: g  reason: collision with root package name */
    public final re.b<wc.a> f26308g;

    /* renamed from: h  reason: collision with root package name */
    public final String f26309h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f26310i;

    public f() {
        throw null;
    }

    public f(Context context, @yc.b Executor executor, sc.e eVar, se.d dVar, tc.b bVar, re.b<wc.a> bVar2) {
        this.f26303a = new HashMap();
        this.f26310i = new HashMap();
        this.f26304b = context;
        this.f26305c = executor;
        this.f26306d = eVar;
        this.f26307e = dVar;
        this.f = bVar;
        this.f26308g = bVar2;
        eVar.b();
        this.f26309h = eVar.f31434c.f31445b;
        k.c(executor, new w2.f(5, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [nf.e] */
    public final synchronized b a(String str) {
        of.b c10;
        of.b c11;
        of.b c12;
        com.google.firebase.remoteconfig.internal.b bVar;
        of.d dVar;
        final z zVar;
        c10 = c(str, "fetch");
        c11 = c(str, "activate");
        c12 = c(str, "defaults");
        bVar = new com.google.firebase.remoteconfig.internal.b(this.f26304b.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", this.f26309h, str, "settings"), 0));
        dVar = new of.d(this.f26305c, c11, c12);
        sc.e eVar = this.f26306d;
        re.b<wc.a> bVar2 = this.f26308g;
        eVar.b();
        if (eVar.f31433b.equals("[DEFAULT]") && str.equals("firebase")) {
            zVar = new z((re.b) bVar2);
        } else {
            zVar = null;
        }
        if (zVar != null) {
            dVar.a(new aa.b() { // from class: nf.e
                @Override // aa.b
                public final void a(String str2, of.c cVar) {
                    JSONObject optJSONObject;
                    z zVar2 = z.this;
                    wc.a aVar = (wc.a) ((re.b) zVar2.f26148b).get();
                    if (aVar != null) {
                        JSONObject jSONObject = cVar.f27447e;
                        if (jSONObject.length() >= 1) {
                            JSONObject jSONObject2 = cVar.f27444b;
                            if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str2)) != null) {
                                String optString = optJSONObject.optString("choiceId");
                                if (!optString.isEmpty()) {
                                    synchronized (((Map) zVar2.f26149c)) {
                                        if (!optString.equals(((Map) zVar2.f26149c).get(str2))) {
                                            ((Map) zVar2.f26149c).put(str2, optString);
                                            Bundle a10 = b0.a("arm_key", str2);
                                            a10.putString("arm_value", jSONObject2.optString(str2));
                                            a10.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                            a10.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                            a10.putString("group", optJSONObject.optString("group"));
                                            aVar.b("fp", "personalization_assignment", a10);
                                            Bundle bundle = new Bundle();
                                            bundle.putString("_fpid", optString);
                                            aVar.b("fp", "_fpc", bundle);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
        return b(this.f26306d, str, this.f26307e, this.f, this.f26305c, c10, c11, c12, d(str, c10, bVar), dVar, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized b b(sc.e eVar, String str, se.d dVar, tc.b bVar, Executor executor, of.b bVar2, of.b bVar3, of.b bVar4, com.google.firebase.remoteconfig.internal.a aVar, of.d dVar2, com.google.firebase.remoteconfig.internal.b bVar5) {
        boolean z10;
        tc.b bVar6;
        if (!this.f26303a.containsKey(str)) {
            if (str.equals("firebase")) {
                eVar.b();
                if (eVar.f31433b.equals("[DEFAULT]")) {
                    z10 = true;
                    if (!z10) {
                        bVar6 = bVar;
                    } else {
                        bVar6 = null;
                    }
                    b bVar7 = new b(dVar, bVar6, executor, bVar2, bVar3, bVar4, aVar, dVar2, bVar5);
                    bVar3.b();
                    bVar4.b();
                    bVar2.b();
                    this.f26303a.put(str, bVar7);
                }
            }
            z10 = false;
            if (!z10) {
            }
            b bVar72 = new b(dVar, bVar6, executor, bVar2, bVar3, bVar4, aVar, dVar2, bVar5);
            bVar3.b();
            bVar4.b();
            bVar2.b();
            this.f26303a.put(str, bVar72);
        }
        return (b) this.f26303a.get(str);
    }

    public final of.b c(String str, String str2) {
        of.e eVar;
        String format = String.format("%s_%s_%s_%s.json", "frc", this.f26309h, str, str2);
        Executor executor = this.f26305c;
        Context context = this.f26304b;
        HashMap hashMap = of.e.f27453c;
        synchronized (of.e.class) {
            HashMap hashMap2 = of.e.f27453c;
            if (!hashMap2.containsKey(format)) {
                hashMap2.put(format, new of.e(context, format));
            }
            eVar = (of.e) hashMap2.get(format);
        }
        return of.b.c(executor, eVar);
    }

    public final synchronized com.google.firebase.remoteconfig.internal.a d(String str, of.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        se.d dVar;
        re.b gVar;
        re.b bVar3;
        Executor executor;
        Random random;
        String str2;
        sc.e eVar;
        dVar = this.f26307e;
        sc.e eVar2 = this.f26306d;
        eVar2.b();
        if (eVar2.f31433b.equals("[DEFAULT]")) {
            gVar = this.f26308g;
        } else {
            gVar = new g(9);
        }
        bVar3 = gVar;
        executor = this.f26305c;
        random = f26302j;
        sc.e eVar3 = this.f26306d;
        eVar3.b();
        str2 = eVar3.f31434c.f31444a;
        eVar = this.f26306d;
        eVar.b();
        return new com.google.firebase.remoteconfig.internal.a(dVar, bVar3, executor, random, bVar, new ConfigFetchHttpClient(this.f26304b, eVar.f31434c.f31445b, str2, str, bVar2.f9828a.getLong("fetch_timeout_in_seconds", 60L), bVar2.f9828a.getLong("fetch_timeout_in_seconds", 60L)), bVar2, this.f26310i);
    }
}
