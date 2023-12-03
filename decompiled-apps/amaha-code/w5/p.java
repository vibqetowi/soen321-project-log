package w5;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import h5.q;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;
import w5.i;
import w5.o;
/* compiled from: FetchedAppSettingsManager.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f36526a = new p();

    /* renamed from: b  reason: collision with root package name */
    public static final String f36527b = p.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f36528c = ca.a.P0("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap f36529d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReference<a> f36530e = new AtomicReference<>(a.NOT_LOADED);
    public static final ConcurrentLinkedQueue<b> f = new ConcurrentLinkedQueue<>();

    /* renamed from: g  reason: collision with root package name */
    public static boolean f36531g;

    /* compiled from: FetchedAppSettingsManager.kt */
    /* loaded from: classes.dex */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 4);
        }
    }

    /* compiled from: FetchedAppSettingsManager.kt */
    /* loaded from: classes.dex */
    public interface b {
        void onError();

        void onSuccess();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f36528c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = h5.q.f17287j;
        h5.q g5 = q.c.g(null, "app", null);
        g5.f17297i = true;
        g5.f17293d = bundle;
        JSONObject jSONObject = g5.c().f17319d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final o b(String str) {
        return (o) f36529d.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c() {
        boolean z10;
        boolean z11;
        boolean z12;
        Context a10 = h5.p.a();
        String b10 = h5.p.b();
        boolean A = e0.A(b10);
        a aVar = a.ERROR;
        AtomicReference<a> atomicReference = f36530e;
        p pVar = f36526a;
        if (A) {
            atomicReference.set(aVar);
            pVar.e();
        } else if (f36529d.containsKey(b10)) {
            atomicReference.set(a.SUCCESS);
            pVar.e();
        } else {
            a aVar2 = a.NOT_LOADED;
            a aVar3 = a.LOADING;
            while (true) {
                if (atomicReference.compareAndSet(aVar2, aVar3)) {
                    z10 = true;
                    break;
                } else if (atomicReference.get() != aVar2) {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                while (true) {
                    if (atomicReference.compareAndSet(aVar, aVar3)) {
                        z12 = true;
                        break;
                    } else if (atomicReference.get() != aVar) {
                        z12 = false;
                        break;
                    }
                }
                if (!z12) {
                    z11 = false;
                    if (z11) {
                        pVar.e();
                        return;
                    } else {
                        h5.p.c().execute(new s5.a(2, a10, defpackage.b.o(new Object[]{b10}, 1, "com.facebook.internal.APP_SETTINGS.%s", "java.lang.String.format(format, *args)"), b10));
                        return;
                    }
                }
            }
            z11 = true;
            if (z11) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0224 A[LOOP:1: B:62:0x015c->B:103:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022e A[EDGE_INSN: B:113:0x022e->B:104:0x022e ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007b A[EDGE_INSN: B:115:0x007b->B:25:0x007b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[LOOP:3: B:8:0x0027->B:26:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o d(JSONObject jSONObject, String applicationId) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        String str;
        String str2;
        String str3;
        i iVar;
        JSONArray jSONArray;
        HashMap hashMap4;
        String optString;
        boolean z10;
        boolean z11;
        boolean z12;
        JSONArray optJSONArray;
        int length;
        JSONArray jSONArray2;
        String str4;
        o.a aVar;
        int i6;
        kotlin.jvm.internal.i.g(applicationId, "applicationId");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        i.a aVar2 = i.f36468d;
        boolean z13 = true;
        String str5 = SessionManager.KEY_NAME;
        if (optJSONArray2 == null) {
            iVar = null;
        } else {
            int length2 = optJSONArray2.length();
            if (length2 > 0) {
                int i10 = 0;
                HashMap hashMap5 = null;
                HashMap hashMap6 = null;
                HashMap hashMap7 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = optJSONArray2.optJSONObject(i10);
                    if (optJSONObject == null || (optString = optJSONObject.optString(SessionManager.KEY_NAME)) == null) {
                        jSONArray = optJSONArray2;
                    } else {
                        jSONArray = optJSONArray2;
                        if (gv.n.A0(optString, "other", z13)) {
                            str6 = optJSONObject.optString("recovery_message", null);
                            hashMap5 = i.a.c(optJSONObject);
                        } else {
                            hashMap4 = hashMap5;
                            if (gv.n.A0(optString, "transient", true)) {
                                str7 = optJSONObject.optString("recovery_message", null);
                                hashMap6 = i.a.c(optJSONObject);
                            } else if (gv.n.A0(optString, "login_recoverable", true)) {
                                str8 = optJSONObject.optString("recovery_message", null);
                                hashMap7 = i.a.c(optJSONObject);
                            }
                            if (i11 < length2) {
                                break;
                            }
                            i10 = i11;
                            optJSONArray2 = jSONArray;
                            hashMap5 = hashMap4;
                            z13 = true;
                        }
                    }
                    hashMap4 = hashMap5;
                    if (i11 < length2) {
                    }
                }
                hashMap2 = hashMap6;
                hashMap3 = hashMap7;
                str = str6;
                str2 = str7;
                str3 = str8;
                hashMap = hashMap4;
            } else {
                hashMap = null;
                hashMap2 = null;
                hashMap3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            iVar = new i(hashMap, hashMap2, hashMap3, str, str2, str3);
        }
        if (iVar == null) {
            iVar = aVar2.a();
        }
        i iVar2 = iVar;
        int optInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        if ((optInt & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((optInt & 16) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((optInt & 32) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        if (optJSONArray3 != null && kotlin.jvm.internal.i.b(null, Boolean.TRUE)) {
            m5.e eVar = m5.e.f24850a;
            m5.e.a("OnReceiveMapping", optJSONArray3.toString());
        }
        boolean optBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String optString2 = jSONObject.optString("gdpv4_nux_content", "");
        kotlin.jvm.internal.i.f(optString2, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = jSONObject.optInt("app_events_session_timeout", 60);
        EnumSet<b0> enumSet = b0.f36437v;
        long optLong = jSONObject.optLong("seamless_login");
        EnumSet result = EnumSet.noneOf(b0.class);
        Iterator<E> it = b0.f36437v.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if ((b0Var.f36441u & optLong) != 0) {
                result.add(b0Var);
            }
        }
        kotlin.jvm.internal.i.f(result, "result");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap hashMap8 = new HashMap();
        if (optJSONObject2 != null && (optJSONArray = optJSONObject2.optJSONArray("data")) != null && (length = optJSONArray.length()) > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i12);
                kotlin.jvm.internal.i.f(optJSONObject3, "dialogConfigData.optJSONObject(i)");
                String dialogNameWithFeature = optJSONObject3.optString(str5);
                if (!e0.A(dialogNameWithFeature)) {
                    kotlin.jvm.internal.i.f(dialogNameWithFeature, "dialogNameWithFeature");
                    int i14 = 0;
                    List a12 = gv.r.a1(dialogNameWithFeature, new String[]{"|"}, 0, 6);
                    if (a12.size() == 2) {
                        String str9 = (String) is.u.g2(a12);
                        String str10 = (String) is.u.o2(a12);
                        if (!e0.A(str9) && !e0.A(str10)) {
                            String optString3 = optJSONObject3.optString(Constants.NOTIFICATION_URL);
                            if (!e0.A(optString3)) {
                                Uri.parse(optString3);
                            }
                            JSONArray optJSONArray4 = optJSONObject3.optJSONArray("versions");
                            if (optJSONArray4 != null) {
                                int length3 = optJSONArray4.length();
                                int[] iArr = new int[length3];
                                if (length3 > 0) {
                                    while (true) {
                                        jSONArray2 = optJSONArray;
                                        int i15 = i14 + 1;
                                        str4 = str5;
                                        int optInt3 = optJSONArray4.optInt(i14, -1);
                                        if (optInt3 == -1) {
                                            String versionString = optJSONArray4.optString(i14);
                                            if (!e0.A(versionString)) {
                                                try {
                                                    kotlin.jvm.internal.i.f(versionString, "versionString");
                                                    i6 = Integer.parseInt(versionString);
                                                } catch (NumberFormatException unused) {
                                                    e0 e0Var = e0.f36453a;
                                                    h5.p pVar = h5.p.f17269a;
                                                    i6 = -1;
                                                }
                                                optInt3 = i6;
                                            }
                                        }
                                        iArr[i14] = optInt3;
                                        if (i15 >= length3) {
                                            break;
                                        }
                                        i14 = i15;
                                        optJSONArray = jSONArray2;
                                        str5 = str4;
                                    }
                                    aVar = new o.a(str9, str10);
                                    if (aVar != null) {
                                        String str11 = aVar.f36524a;
                                        Map map = (Map) hashMap8.get(str11);
                                        if (map == null) {
                                            map = new HashMap();
                                            hashMap8.put(str11, map);
                                        }
                                        map.put(aVar.f36525b, aVar);
                                    }
                                    if (i13 >= length) {
                                        break;
                                    }
                                    i12 = i13;
                                    optJSONArray = jSONArray2;
                                    str5 = str4;
                                }
                            }
                            jSONArray2 = optJSONArray;
                            str4 = str5;
                            aVar = new o.a(str9, str10);
                            if (aVar != null) {
                            }
                            if (i13 >= length) {
                            }
                        }
                    }
                }
                jSONArray2 = optJSONArray;
                str4 = str5;
                aVar = null;
                if (aVar != null) {
                }
                if (i13 >= length) {
                }
            }
        }
        String optString4 = jSONObject.optString("smart_login_bookmark_icon_url");
        kotlin.jvm.internal.i.f(optString4, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString5 = jSONObject.optString("smart_login_menu_icon_url");
        kotlin.jvm.internal.i.f(optString5, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString6 = jSONObject.optString("sdk_update_message");
        kotlin.jvm.internal.i.f(optString6, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        o oVar = new o(optBoolean, optString2, optInt2, result, hashMap8, z10, iVar2, optString4, optString5, z11, z12, optJSONArray3, optString6, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
        f36529d.put(applicationId, oVar);
        return oVar;
    }

    public static final o f(String applicationId, boolean z10) {
        kotlin.jvm.internal.i.g(applicationId, "applicationId");
        if (!z10) {
            ConcurrentHashMap concurrentHashMap = f36529d;
            if (concurrentHashMap.containsKey(applicationId)) {
                return (o) concurrentHashMap.get(applicationId);
            }
        }
        p pVar = f36526a;
        pVar.getClass();
        o d10 = d(a(), applicationId);
        if (kotlin.jvm.internal.i.b(applicationId, h5.p.b())) {
            f36530e.set(a.SUCCESS);
            pVar.e();
        }
        return d10;
    }

    public final synchronized void e() {
        a aVar = f36530e.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            o oVar = (o) f36529d.get(h5.p.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = f;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        handler.post(new androidx.activity.b(15, concurrentLinkedQueue.poll()));
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue2 = f;
                    if (!concurrentLinkedQueue2.isEmpty()) {
                        handler.post(new g.v(concurrentLinkedQueue2.poll(), 25, oVar));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
