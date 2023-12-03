package r5;

import android.os.Bundle;
import android.text.TextUtils;
import com.theinnerhour.b2b.utils.Constants;
import gv.n;
import h5.p;
import h5.q;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q5.g;
import w5.e0;
import w5.l;
import xs.f;
/* compiled from: ModelManager.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f30467a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap f30468b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f30469c = ca.a.P0("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f30470d = ca.a.P0(Constants.SUBSCRIPTION_NONE, "address", "health");

    /* compiled from: ModelManager.kt */
    /* loaded from: classes.dex */
    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 2);
        }

        public final String d() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return "app_event_pred";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "integrity_detect";
        }

        public final String f() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return "MTML_APP_EVENT_PRED";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "MTML_INTEGRITY_DETECT";
        }
    }

    /* compiled from: ModelManager.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f30474a;

        /* renamed from: b  reason: collision with root package name */
        public final String f30475b;

        /* renamed from: c  reason: collision with root package name */
        public final String f30476c;

        /* renamed from: d  reason: collision with root package name */
        public final int f30477d;

        /* renamed from: e  reason: collision with root package name */
        public final float[] f30478e;
        public File f;

        /* renamed from: g  reason: collision with root package name */
        public r5.b f30479g;

        /* renamed from: h  reason: collision with root package name */
        public Runnable f30480h;

        /* compiled from: ModelManager.kt */
        /* loaded from: classes.dex */
        public static final class a {
            public static b a(JSONObject jSONObject) {
                String useCase;
                String assetUri;
                String optString;
                int i6;
                float[] fArr;
                if (jSONObject != null) {
                    try {
                        useCase = jSONObject.getString("use_case");
                        assetUri = jSONObject.getString("asset_uri");
                        optString = jSONObject.optString("rules_uri", null);
                        i6 = jSONObject.getInt("version_id");
                        c cVar = c.f30467a;
                        JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                        if (!b6.a.b(c.class)) {
                            cVar.getClass();
                            if (!b6.a.b(cVar) && jSONArray != null) {
                                fArr = new float[jSONArray.length()];
                                int length = jSONArray.length();
                                if (length > 0) {
                                    int i10 = 0;
                                    while (true) {
                                        int i11 = i10 + 1;
                                        try {
                                            String string = jSONArray.getString(i10);
                                            i.f(string, "jsonArray.getString(i)");
                                            fArr[i10] = Float.parseFloat(string);
                                        } catch (JSONException unused) {
                                        }
                                        if (i11 >= length) {
                                            break;
                                        }
                                        i10 = i11;
                                    }
                                }
                                i.f(useCase, "useCase");
                                i.f(assetUri, "assetUri");
                            }
                        }
                        fArr = null;
                        i.f(useCase, "useCase");
                        i.f(assetUri, "assetUri");
                    } catch (Exception unused2) {
                        return null;
                    }
                }
                return new b(useCase, assetUri, optString, i6, fArr);
            }

            public static void b(b bVar, ArrayList arrayList) {
                File[] listFiles;
                boolean z10;
                File a10 = e.a();
                int i6 = bVar.f30477d;
                String str = bVar.f30474a;
                if (a10 != null && (listFiles = a10.listFiles()) != null) {
                    if (listFiles.length == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        String str2 = str + '_' + i6;
                        int length = listFiles.length;
                        int i10 = 0;
                        while (i10 < length) {
                            File file = listFiles[i10];
                            i10++;
                            String name = file.getName();
                            i.f(name, "name");
                            if (n.H0(name, str) && !n.H0(name, str2)) {
                                file.delete();
                            }
                        }
                    }
                }
                f0.b bVar2 = new f0.b(4, arrayList);
                File file2 = new File(e.a(), str + '_' + i6);
                String str3 = bVar.f30475b;
                if (str3 != null && !file2.exists()) {
                    new g(str3, file2, bVar2).execute(new String[0]);
                } else {
                    bVar2.c(file2);
                }
            }
        }

        public b(String str, String str2, String str3, int i6, float[] fArr) {
            this.f30474a = str;
            this.f30475b = str2;
            this.f30476c = str3;
            this.f30477d = i6;
            this.f30478e = fArr;
        }
    }

    public static final File d() {
        a aVar = a.MTML_APP_EVENT_PREDICTION;
        if (b6.a.b(c.class)) {
            return null;
        }
        try {
            b bVar = (b) f30468b.get(aVar.f());
            if (bVar == null) {
                return null;
            }
            return bVar.f;
        } catch (Throwable th2) {
            b6.a.a(c.class, th2);
            return null;
        }
    }

    public static final String[] f(a aVar, float[][] fArr, String[] strArr) {
        r5.b bVar;
        boolean z10;
        if (b6.a.b(c.class)) {
            return null;
        }
        try {
            b bVar2 = (b) f30468b.get(aVar.f());
            if (bVar2 == null) {
                bVar = null;
            } else {
                bVar = bVar2.f30479g;
            }
            if (bVar == null) {
                return null;
            }
            float[] fArr2 = bVar2.f30478e;
            int length = strArr.length;
            boolean z11 = false;
            int length2 = fArr[0].length;
            r5.a aVar2 = new r5.a(new int[]{length, length2});
            if (length > 0) {
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    System.arraycopy(fArr[i6], 0, aVar2.f30454c, i6 * length2, length2);
                    if (i10 >= length) {
                        break;
                    }
                    i6 = i10;
                }
            }
            r5.a a10 = bVar.a(aVar2, strArr, aVar.d());
            if (a10 == null || fArr2 == null) {
                return null;
            }
            if (a10.f30454c.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            if (fArr2.length == 0) {
                z11 = true;
            }
            if (z11) {
                return null;
            }
            int ordinal = aVar.ordinal();
            c cVar = f30467a;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return cVar.h(a10, fArr2);
                }
                throw new NoWhenBranchMatchedException();
            }
            return cVar.g(a10, fArr2);
        } catch (Throwable th2) {
            b6.a.a(c.class, th2);
            return null;
        }
    }

    public final void a(JSONObject jSONObject) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    b a10 = b.a.a(jSONObject.getJSONObject(keys.next()));
                    if (a10 != null) {
                        f30468b.put(a10.f30474a, a10);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (gv.r.J0(r7, "en") != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:5:0x0007, B:6:0x001a, B:8:0x0020, B:10:0x003e, B:12:0x0050, B:28:0x0086, B:29:0x0092, B:31:0x009e, B:33:0x00b0, B:36:0x00c2, B:38:0x00c8, B:15:0x0057, B:16:0x0059, B:22:0x006d), top: B:43:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z10;
        Locale locale;
        if (b6.a.b(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i6 = 0;
            for (Map.Entry entry : f30468b.entrySet()) {
                String str2 = (String) entry.getKey();
                b bVar = (b) entry.getValue();
                if (i.b(str2, a.MTML_APP_EVENT_PREDICTION.f())) {
                    str = bVar.f30475b;
                    i6 = Math.max(i6, bVar.f30477d);
                    l lVar = l.f36497a;
                    if (l.c(l.b.SuggestedEvents)) {
                        if (!b6.a.b(this)) {
                            e0 e0Var = e0.f36453a;
                            try {
                                locale = p.a().getResources().getConfiguration().locale;
                            } catch (Exception unused) {
                                locale = null;
                            }
                            if (locale != null) {
                                String language = locale.getLanguage();
                                i.f(language, "locale.language");
                            }
                            z10 = true;
                            if (z10) {
                                bVar.f30480h = new i5.b(11);
                                arrayList.add(bVar);
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                    }
                }
                if (i.b(str2, a.MTML_INTEGRITY_DETECT.f())) {
                    str = bVar.f30475b;
                    i6 = Math.max(i6, bVar.f30477d);
                    l lVar2 = l.f36497a;
                    if (l.c(l.b.IntelligentIntegrity)) {
                        bVar.f30480h = new i5.b(12);
                        arrayList.add(bVar);
                    }
                }
            }
            if (str != null && i6 > 0 && !arrayList.isEmpty()) {
                b.a.b(new b("MTML", str, null, i6, null), arrayList);
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final JSONObject c() {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            String str = q.f17287j;
            q g5 = q.c.g(null, "app/model_asset", null);
            g5.f17293d = bundle;
            JSONObject jSONObject = g5.c().f17317b;
            if (jSONObject == null) {
                return null;
            }
            return e(jSONObject);
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length > 0) {
                    int i6 = 0;
                    while (true) {
                        int i10 = i6 + 1;
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i6);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                        jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                        jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                        jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                        if (jSONObject3.has("rules_uri")) {
                            jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                        }
                        jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                        if (i10 < length) {
                            i6 = i10;
                        } else {
                            return jSONObject2;
                        }
                    }
                } else {
                    return jSONObject2;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final String[] g(r5.a aVar, float[] fArr) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f30452a;
            int i6 = iArr[0];
            int i10 = iArr[1];
            float[] fArr2 = aVar.f30454c;
            if (i10 != fArr.length) {
                return null;
            }
            f k02 = h.k0(0, i6);
            ArrayList arrayList = new ArrayList(is.i.H1(k02, 10));
            xs.e it = k02.iterator();
            while (it.f38001w) {
                int nextInt = it.nextInt();
                String str = Constants.SUBSCRIPTION_NONE;
                int length = fArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = i12 + 1;
                    if (fArr2[(nextInt * i10) + i12] >= fArr[i11]) {
                        str = f30470d.get(i12);
                    }
                    i11++;
                    i12 = i13;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final String[] h(r5.a aVar, float[] fArr) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f30452a;
            int i6 = iArr[0];
            int i10 = iArr[1];
            float[] fArr2 = aVar.f30454c;
            if (i10 != fArr.length) {
                return null;
            }
            f k02 = h.k0(0, i6);
            ArrayList arrayList = new ArrayList(is.i.H1(k02, 10));
            xs.e it = k02.iterator();
            while (it.f38001w) {
                int nextInt = it.nextInt();
                String str = "other";
                int length = fArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = i12 + 1;
                    if (fArr2[(nextInt * i10) + i12] >= fArr[i11]) {
                        str = f30469c.get(i12);
                    }
                    i11++;
                    i12 = i13;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }
}
