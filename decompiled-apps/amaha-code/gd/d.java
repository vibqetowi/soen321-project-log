package gd;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.utils.SessionManager;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;
import vr.p1;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public class d implements ld.b, md.b, ld.a, bg.d, p1 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f16399u;

    /* renamed from: v  reason: collision with root package name */
    public Object f16400v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(int i6) {
        this(TimeUnit.MINUTES);
        this.f16399u = i6;
        if (i6 == 7) {
            this.f16400v = new gg.i(0);
        } else if (i6 == 10) {
            ZoneOffset offset = ZoneId.systemDefault().getRules().getOffset(Instant.now());
            kotlin.jvm.internal.i.f(offset, "systemDefault().rules.getOffset(Instant.now())");
            this.f16400v = offset;
        } else if (i6 == 11) {
            this.f16400v = new AtomicLong();
        } else if (i6 == 13) {
            this.f16400v = new es.a(100);
        } else if (i6 != 14) {
        }
    }

    public static String b(int i6) {
        if (!is.k.Q1(Integer.valueOf(i6), new Integer[]{11, 12, 13})) {
            int i10 = i6 % 10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "rd";
                    }
                } else {
                    return "nd";
                }
            } else {
                return "st";
            }
        }
        return "th";
    }

    public static Bundle g(String str, HashMap hashMap) {
        Object obj;
        N12AItemListModel n12AItemListModel;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        Object obj4;
        String str4;
        Object obj5;
        String str5;
        Object obj6;
        String str6;
        Object obj7;
        String str7;
        Object obj8;
        int i6;
        Bundle bundle = new Bundle();
        bundle.putBoolean("isBranchedFlow", true);
        if (kotlin.jvm.internal.i.b(str, "N13B")) {
            Integer num = null;
            if (hashMap != null) {
                obj = hashMap.get("n13b_data");
            } else {
                obj = null;
            }
            if (obj instanceof N12AItemListModel) {
                n12AItemListModel = (N12AItemListModel) obj;
            } else {
                n12AItemListModel = null;
            }
            bundle.putSerializable("n13b_data", n12AItemListModel);
            if (hashMap != null) {
                obj2 = hashMap.get("n13b_cta_1");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            bundle.putString("n13b_cta_1", str2);
            if (hashMap != null) {
                obj3 = hashMap.get("n13b_cta_2");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str3 = (String) obj3;
            } else {
                str3 = null;
            }
            bundle.putString("n13b_cta_2", str3);
            if (hashMap != null) {
                obj4 = hashMap.get("n13b_cta_prompt");
            } else {
                obj4 = null;
            }
            if (obj4 instanceof String) {
                str4 = (String) obj4;
            } else {
                str4 = null;
            }
            bundle.putString("n13b_cta_prompt", str4);
            if (hashMap != null) {
                obj5 = hashMap.get("parentSlug");
            } else {
                obj5 = null;
            }
            if (obj5 instanceof String) {
                str5 = (String) obj5;
            } else {
                str5 = null;
            }
            bundle.putString("parentSlug", str5);
            if (hashMap != null) {
                obj6 = hashMap.get("parentDataSlug");
            } else {
                obj6 = null;
            }
            if (obj6 instanceof String) {
                str6 = (String) obj6;
            } else {
                str6 = null;
            }
            bundle.putString("parentDataSlug", str6);
            if (hashMap != null) {
                obj7 = hashMap.get("parentScreenId");
            } else {
                obj7 = null;
            }
            if (obj7 instanceof String) {
                str7 = (String) obj7;
            } else {
                str7 = null;
            }
            bundle.putString("parentScreenId", str7);
            if (hashMap != null) {
                obj8 = hashMap.get("n13b_index");
            } else {
                obj8 = null;
            }
            if (obj8 instanceof Integer) {
                num = (Integer) obj8;
            }
            if (num != null) {
                i6 = num.intValue();
            } else {
                i6 = -1;
            }
            bundle.putInt("n13b_index", i6);
        }
        return bundle;
    }

    public static String j(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(SessionManager.KEY_NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // ld.b
    public final void A(Bundle bundle, String str) {
        md.a aVar = (md.a) this.f16400v;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + j(bundle, str));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // bg.d
    public final dg.b O(String str, bg.a aVar, int i6, int i10, Map map) {
        if (aVar == bg.a.UPC_A) {
            return ((gg.i) this.f16400v).O("0".concat(String.valueOf(str)), bg.a.EAN_13, i6, i10, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }

    @Override // md.b
    public final void a(md.a aVar) {
        boolean z10;
        this.f16400v = aVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // vr.p1
    public final void add(long j10) {
        ((AtomicLong) this.f16400v).getAndAdd(1L);
    }

    public final ArrayList c() {
        q qVar = ((k0) this.f16400v).F;
        if (qVar != null) {
            ArrayList arrayList = new ArrayList();
            for (fd.n nVar : qVar.f16441u) {
                arrayList.add(nVar);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public final String d(long j10, String str) {
        String format = LocalDateTime.ofEpochSecond(j10 / 1000, 0, (ZoneOffset) this.f16400v).format(DateTimeFormatter.ofPattern(str).withLocale(Locale.ENGLISH));
        kotlin.jvm.internal.i.f(format, "ofEpochSecond(\n         …Locale.ENGLISH)\n        )");
        return format;
    }

    @Override // ld.a
    public final void e(Bundle bundle) {
        ((wc.a) this.f16400v).b("clx", "_ae", bundle);
    }

    public final boolean f(CharSequence charSequence, ds.f fVar) {
        String str = fVar.f13339v;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = ((es.a) this.f16400v).a(str).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        return matcher.matches();
    }

    public final ud.b h(JSONObject jSONObject) {
        ud.e hVar;
        int i6 = jSONObject.getInt("settings_version");
        if (i6 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i6 + ". Using default settings values.", null);
            hVar = new ud.a();
        } else {
            hVar = new ud.h();
        }
        return hVar.a((tr.r) this.f16400v, jSONObject);
    }

    public final JSONObject i() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f16400v;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(nd.f.l(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        nd.f.a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    nd.f.a(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            nd.f.a(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            nd.f.a(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public String toString() {
        switch (this.f16399u) {
            case 5:
                return ((URL) this.f16400v).toString();
            case 8:
                return "BaseData(accountMeta=" + ((s5) this.f16400v) + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i6, Object obj) {
        this.f16399u = i6;
        this.f16400v = obj;
    }

    public d(s5 accountMeta) {
        this.f16399u = 8;
        kotlin.jvm.internal.i.g(accountMeta, "accountMeta");
        this.f16400v = accountMeta;
    }

    public d(k0 k0Var) {
        this.f16399u = 0;
        v9.o.h(k0Var);
        this.f16400v = k0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(TimeUnit timeUnit) {
        this(new pv.i(ov.d.f27799i, timeUnit));
        this.f16399u = 14;
        kotlin.jvm.internal.i.g(timeUnit, "timeUnit");
    }

    public d(pv.i iVar) {
        this.f16399u = 14;
        this.f16400v = iVar;
    }

    public d(sd.b bVar) {
        this.f16399u = 3;
        this.f16400v = new File(bVar.f31460b, "com.crashlytics.settings.json");
    }

    public d(Field field) {
        this.f16399u = 6;
        field.getClass();
        this.f16400v = field;
    }
}
