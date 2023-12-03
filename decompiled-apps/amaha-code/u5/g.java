package u5;

import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.utils.Constants;
import gv.n;
import h5.p;
import h5.q;
import i5.r;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import w5.e0;
/* compiled from: ViewOnClickListener.kt */
/* loaded from: classes.dex */
public final class g implements View.OnClickListener {

    /* renamed from: y  reason: collision with root package name */
    public static final HashSet f33832y;

    /* renamed from: u  reason: collision with root package name */
    public final View.OnClickListener f33833u;

    /* renamed from: v  reason: collision with root package name */
    public final WeakReference<View> f33834v;

    /* renamed from: w  reason: collision with root package name */
    public final WeakReference<View> f33835w;

    /* renamed from: x  reason: collision with root package name */
    public final String f33836x;

    /* compiled from: ViewOnClickListener.kt */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final boolean a(String str, String str2) {
            LinkedHashMap linkedHashMap;
            String str3;
            HashSet hashSet = g.f33832y;
            b bVar = b.f33813a;
            if (!b6.a.b(b.class)) {
                try {
                    linkedHashMap = b.f33814b;
                } catch (Throwable th2) {
                    b6.a.a(b.class, th2);
                }
                if (linkedHashMap.containsKey(str)) {
                    str3 = (String) linkedHashMap.get(str);
                    if (str3 != null) {
                        return false;
                    }
                    if (!i.b(str3, "other")) {
                        r rVar = new r(str3, str2, 1);
                        e0 e0Var = e0.f36453a;
                        try {
                            p.c().execute(rVar);
                        } catch (Exception unused) {
                        }
                    }
                    return true;
                }
            }
            str3 = null;
            if (str3 != null) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void b(View hostView, View view, String str) {
            HashSet hashSet;
            Field field;
            Field field2;
            Object obj;
            i.g(hostView, "hostView");
            int hashCode = hostView.hashCode();
            HashSet hashSet2 = g.f33832y;
            HashSet hashSet3 = null;
            if (!b6.a.b(g.class)) {
                try {
                    hashSet = g.f33832y;
                } catch (Throwable th2) {
                    b6.a.a(g.class, th2);
                }
                if (hashSet.contains(Integer.valueOf(hashCode))) {
                    m5.f fVar = m5.f.f24853a;
                    g gVar = new g(hostView, view, str);
                    if (!b6.a.b(m5.f.class)) {
                        try {
                            try {
                                field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                                try {
                                    field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                                } catch (ClassNotFoundException | NoSuchFieldException unused) {
                                    field2 = null;
                                    if (field == null) {
                                    }
                                    hostView.setOnClickListener(gVar);
                                    if (!b6.a.b(g.class)) {
                                    }
                                    hashSet3.add(Integer.valueOf(hashCode));
                                    return;
                                }
                            } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                                field = null;
                            }
                            if (field == null && field2 != null) {
                                field.setAccessible(true);
                                field2.setAccessible(true);
                                try {
                                    field.setAccessible(true);
                                    obj = field.get(hostView);
                                } catch (IllegalAccessException unused3) {
                                    obj = null;
                                }
                                if (obj == null) {
                                    hostView.setOnClickListener(gVar);
                                } else {
                                    field2.set(obj, gVar);
                                }
                            } else {
                                hostView.setOnClickListener(gVar);
                            }
                        } catch (Exception unused4) {
                        } catch (Throwable th3) {
                            b6.a.a(m5.f.class, th3);
                        }
                    }
                    if (!b6.a.b(g.class)) {
                        try {
                            hashSet3 = g.f33832y;
                        } catch (Throwable th4) {
                            b6.a.a(g.class, th4);
                        }
                    }
                    hashSet3.add(Integer.valueOf(hashCode));
                    return;
                }
                return;
            }
            hashSet = null;
            if (hashSet.contains(Integer.valueOf(hashCode))) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void c(String event, String str, float[] fArr) {
            boolean contains;
            boolean contains2;
            d dVar = d.f33819a;
            if (!b6.a.b(d.class)) {
                try {
                    i.g(event, "event");
                    contains = d.f33821c.contains(event);
                } catch (Throwable th2) {
                    b6.a.a(d.class, th2);
                }
                if (!contains) {
                    i5.i iVar = new i5.i(p.a(), (String) null);
                    if (!b6.a.b(iVar)) {
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putString("_is_suggested_event", "1");
                            bundle.putString("_button_text", str);
                            iVar.d(bundle, event);
                            return;
                        } catch (Throwable th3) {
                            b6.a.a(iVar, th3);
                            return;
                        }
                    }
                    return;
                }
                d dVar2 = d.f33819a;
                if (!b6.a.b(d.class)) {
                    try {
                        i.g(event, "event");
                        contains2 = d.f33822d.contains(event);
                    } catch (Throwable th4) {
                        b6.a.a(d.class, th4);
                    }
                    if (!contains2) {
                        Bundle bundle2 = new Bundle();
                        try {
                            bundle2.putString("event_name", event);
                            JSONObject jSONObject = new JSONObject();
                            StringBuilder sb2 = new StringBuilder();
                            int length = fArr.length;
                            int i6 = 0;
                            while (i6 < length) {
                                float f = fArr[i6];
                                i6++;
                                sb2.append(f);
                                sb2.append(",");
                            }
                            jSONObject.put("dense", sb2.toString());
                            jSONObject.put("button_text", str);
                            bundle2.putString("metadata", jSONObject.toString());
                            String str2 = q.f17287j;
                            String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{p.b()}, 1));
                            i.f(format, "java.lang.String.format(locale, format, *args)");
                            q h10 = q.c.h(null, format, null, null);
                            h10.f17293d = bundle2;
                            h10.c();
                            return;
                        } catch (JSONException unused) {
                            return;
                        }
                    }
                    return;
                }
                contains2 = false;
                if (!contains2) {
                }
            }
            contains = false;
            if (!contains) {
            }
        }
    }

    static {
        new a();
        f33832y = new HashSet();
    }

    public g(View view, View view2, String str) {
        this.f33833u = m5.f.e(view);
        this.f33834v = new WeakReference<>(view2);
        this.f33835w = new WeakReference<>(view);
        String lowerCase = str.toLowerCase();
        i.f(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f33836x = n.F0(lowerCase, Constants.SCREEN_ACTIVITY, "");
    }

    public final void a() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            View view = this.f33834v.get();
            View view2 = this.f33835w.get();
            if (view != null && view2 != null) {
                try {
                    String d10 = c.d(view2);
                    String b10 = b.b(view2, d10);
                    if (b10 == null || a.a(b10, d10)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", c.b(view, view2));
                    jSONObject.put("screenname", this.f33836x);
                    if (!b6.a.b(this)) {
                        try {
                            f fVar = new f(jSONObject, d10, this, b10);
                            e0 e0Var = e0.f36453a;
                            p.c().execute(fVar);
                        } catch (Throwable th2) {
                            b6.a.a(this, th2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th3) {
            b6.a.a(this, th3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            i.g(view, "view");
            View.OnClickListener onClickListener = this.f33833u;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            a();
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
