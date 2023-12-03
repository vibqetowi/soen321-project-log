package o5;

import android.content.Context;
import g.v;
import gv.n;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: InAppPurchaseBillingClientWrapper.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: u  reason: collision with root package name */
    public static e f27130u;

    /* renamed from: a  reason: collision with root package name */
    public final Context f27134a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f27135b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f27136c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<?> f27137d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f27138e;
    public final Class<?> f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f27139g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f27140h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f27141i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f27142j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f27143k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f27144l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f27145m;

    /* renamed from: n  reason: collision with root package name */
    public final Method f27146n;

    /* renamed from: o  reason: collision with root package name */
    public final Method f27147o;

    /* renamed from: p  reason: collision with root package name */
    public final Method f27148p;

    /* renamed from: q  reason: collision with root package name */
    public final i f27149q;
    public final CopyOnWriteArraySet r;

    /* renamed from: s  reason: collision with root package name */
    public static final b f27128s = new b();

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicBoolean f27129t = new AtomicBoolean(false);

    /* renamed from: v  reason: collision with root package name */
    public static final AtomicBoolean f27131v = new AtomicBoolean(false);

    /* renamed from: w  reason: collision with root package name */
    public static final ConcurrentHashMap f27132w = new ConcurrentHashMap();

    /* renamed from: x  reason: collision with root package name */
    public static final ConcurrentHashMap f27133x = new ConcurrentHashMap();

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* loaded from: classes.dex */
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (b6.a.b(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.i.g(proxy, "proxy");
                kotlin.jvm.internal.i.g(m10, "m");
                if (kotlin.jvm.internal.i.b(m10.getName(), "onBillingSetupFinished")) {
                    b bVar = e.f27128s;
                    b.c().set(true);
                } else {
                    String name = m10.getName();
                    kotlin.jvm.internal.i.f(name, "m.name");
                    if (n.z0(name, "onBillingServiceDisconnected")) {
                        b bVar2 = e.f27128s;
                        b.c().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                b6.a.a(this, th2);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* loaded from: classes.dex */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:100:0x01c0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:101:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void a(Context context) {
            AtomicBoolean atomicBoolean;
            AtomicBoolean atomicBoolean2;
            i iVar;
            i iVar2;
            Class<?> cls;
            Object obj;
            Object d10;
            i iVar3 = i.f27165g;
            Object obj2 = null;
            if (!b6.a.b(i.class)) {
                try {
                    atomicBoolean = i.f27166h;
                } catch (Throwable th2) {
                    b6.a.a(i.class, th2);
                }
                if (!atomicBoolean.get()) {
                    if (!b6.a.b(i.class)) {
                        try {
                            iVar = i.f27165g;
                        } catch (Throwable th3) {
                            b6.a.a(i.class, th3);
                        }
                    }
                    iVar = null;
                } else {
                    Class<?> a10 = j.a("com.android.billingclient.api.SkuDetailsParams");
                    Class<?> a11 = j.a("com.android.billingclient.api.SkuDetailsParams$Builder");
                    if (a10 != null && a11 != null) {
                        Method c10 = j.c(a10, "newBuilder", new Class[0]);
                        Method c11 = j.c(a11, "setType", String.class);
                        Method c12 = j.c(a11, "setSkusList", List.class);
                        Method c13 = j.c(a11, "build", new Class[0]);
                        if (c10 != null && c11 != null && c12 != null && c13 != null) {
                            i iVar4 = new i(a10, a11, c10, c11, c12, c13);
                            if (!b6.a.b(i.class)) {
                                try {
                                    i.f27165g = iVar4;
                                } catch (Throwable th4) {
                                    b6.a.a(i.class, th4);
                                }
                            }
                        }
                    }
                    if (!b6.a.b(i.class)) {
                        try {
                            atomicBoolean2 = i.f27166h;
                        } catch (Throwable th5) {
                            b6.a.a(i.class, th5);
                        }
                        atomicBoolean2.set(true);
                        if (!b6.a.b(i.class)) {
                            try {
                                iVar = i.f27165g;
                            } catch (Throwable th6) {
                                b6.a.a(i.class, th6);
                            }
                        }
                        iVar = null;
                    }
                    atomicBoolean2 = null;
                    atomicBoolean2.set(true);
                    if (!b6.a.b(i.class)) {
                    }
                    iVar = null;
                }
                iVar2 = iVar;
                if (iVar2 != null) {
                    return;
                }
                Class<?> a12 = j.a("com.android.billingclient.api.BillingClient");
                Class<?> a13 = j.a("com.android.billingclient.api.Purchase");
                Class<?> a14 = j.a("com.android.billingclient.api.Purchase$PurchasesResult");
                Class<?> a15 = j.a("com.android.billingclient.api.SkuDetails");
                Class<?> a16 = j.a("com.android.billingclient.api.PurchaseHistoryRecord");
                Class<?> a17 = j.a("com.android.billingclient.api.SkuDetailsResponseListener");
                Class<?> a18 = j.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
                if (a12 != null && a14 != null && a13 != null && a15 != null && a17 != null && a16 != null && a18 != null) {
                    Method c14 = j.c(a12, "queryPurchases", String.class);
                    Method c15 = j.c(a14, "getPurchasesList", new Class[0]);
                    Method c16 = j.c(a13, "getOriginalJson", new Class[0]);
                    Method c17 = j.c(a15, "getOriginalJson", new Class[0]);
                    Method c18 = j.c(a16, "getOriginalJson", new Class[0]);
                    Class[] clsArr = new Class[2];
                    if (!b6.a.b(iVar2)) {
                        try {
                            cls = iVar2.f27167a;
                        } catch (Throwable th7) {
                            b6.a.a(iVar2, th7);
                        }
                        clsArr[0] = cls;
                        clsArr[1] = a17;
                        Method c19 = j.c(a12, "querySkuDetailsAsync", clsArr);
                        Method c20 = j.c(a12, "queryPurchaseHistoryAsync", String.class, a18);
                        if (c14 == null && c15 != null && c16 != null && c17 != null && c18 != null && c19 != null && c20 != null) {
                            Class<?> a19 = j.a("com.android.billingclient.api.BillingClient$Builder");
                            Class<?> a20 = j.a("com.android.billingclient.api.PurchasesUpdatedListener");
                            if (a19 != null && a20 != null) {
                                Method c21 = j.c(a12, "newBuilder", Context.class);
                                Method c22 = j.c(a19, "enablePendingPurchases", new Class[0]);
                                Method c23 = j.c(a19, "setListener", a20);
                                Method c24 = j.c(a19, "build", new Class[0]);
                                if (c21 != null && c22 != null && c23 != null && c24 != null) {
                                    Object d11 = j.d(a12, null, c21, context);
                                    if (d11 != null) {
                                        Object d12 = j.d(a19, d11, c23, Proxy.newProxyInstance(a20.getClassLoader(), new Class[]{a20}, new d()));
                                        if (d12 != null && (d10 = j.d(a19, d12, c22, new Object[0])) != null) {
                                            obj2 = j.d(a19, d10, c24, new Object[0]);
                                        }
                                    }
                                    obj = obj2;
                                    if (obj != null) {
                                        return;
                                    }
                                    e eVar = new e(context, obj, a12, a14, a13, a15, a16, a17, a18, c14, c15, c16, c17, c18, c19, c20, iVar2);
                                    if (!b6.a.b(e.class)) {
                                        try {
                                            e.f27130u = eVar;
                                        } catch (Throwable th8) {
                                            b6.a.a(e.class, th8);
                                        }
                                    }
                                    e a21 = e.a();
                                    if (a21 != null) {
                                        if (!b6.a.b(e.class)) {
                                            try {
                                                a21.e();
                                                return;
                                            } catch (Throwable th9) {
                                                b6.a.a(e.class, th9);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
                                }
                            }
                            obj = null;
                            if (obj != null) {
                            }
                        } else {
                            return;
                        }
                    }
                    cls = null;
                    clsArr[0] = cls;
                    clsArr[1] = a17;
                    Method c192 = j.c(a12, "querySkuDetailsAsync", clsArr);
                    Method c202 = j.c(a12, "queryPurchaseHistoryAsync", String.class, a18);
                    if (c14 == null) {
                        return;
                    }
                    return;
                }
                return;
            }
            atomicBoolean = null;
            if (!atomicBoolean.get()) {
            }
            iVar2 = iVar;
            if (iVar2 != null) {
            }
        }

        public static ConcurrentHashMap b() {
            if (!b6.a.b(e.class)) {
                try {
                    return e.f27132w;
                } catch (Throwable th2) {
                    b6.a.a(e.class, th2);
                }
            }
            return null;
        }

        public static AtomicBoolean c() {
            if (!b6.a.b(e.class)) {
                try {
                    return e.f27131v;
                } catch (Throwable th2) {
                    b6.a.a(e.class, th2);
                }
            }
            return null;
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* loaded from: classes.dex */
    public final class c implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f27150a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f27151b;

        public c(e this$0, v vVar) {
            kotlin.jvm.internal.i.g(this$0, "this$0");
            this.f27151b = this$0;
            this.f27150a = vVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0047 A[Catch: Exception -> 0x000f, all -> 0x009c, TryCatch #0 {Exception -> 0x000f, blocks: (B:9:0x0019, B:18:0x002d, B:26:0x003c, B:28:0x0047, B:32:0x004e, B:40:0x0062, B:42:0x0071, B:48:0x0080, B:49:0x0083, B:38:0x005e, B:24:0x0038, B:16:0x0029), top: B:57:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x004e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x004d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0071 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x000f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(List<?> list) {
            boolean b10;
            e eVar;
            CopyOnWriteArraySet copyOnWriteArraySet;
            Class<?> cls;
            Method method;
            Object d10;
            String str;
            Context context;
            if (b6.a.b(this)) {
                return;
            }
            try {
                for (Object obj : list) {
                    try {
                        int i6 = j.f27172a;
                        b10 = b6.a.b(e.class);
                        eVar = this.f27151b;
                        copyOnWriteArraySet = null;
                    } catch (Exception unused) {
                    }
                    if (!b10) {
                        try {
                            cls = eVar.f27139g;
                        } catch (Throwable th2) {
                            b6.a.a(e.class, th2);
                        }
                        if (!b6.a.b(e.class)) {
                            try {
                                method = eVar.f27146n;
                            } catch (Throwable th3) {
                                b6.a.a(e.class, th3);
                            }
                            d10 = j.d(cls, obj, method, new Object[0]);
                            if (d10 instanceof String) {
                                str = (String) d10;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (!b6.a.b(e.class)) {
                                    try {
                                        context = eVar.f27134a;
                                    } catch (Throwable th4) {
                                        b6.a.a(e.class, th4);
                                    }
                                    jSONObject.put("packageName", context.getPackageName());
                                    if (!jSONObject.has("productId")) {
                                        String skuID = jSONObject.getString("productId");
                                        if (!b6.a.b(e.class)) {
                                            try {
                                                copyOnWriteArraySet = eVar.r;
                                            } catch (Throwable th5) {
                                                b6.a.a(e.class, th5);
                                            }
                                        }
                                        copyOnWriteArraySet.add(skuID);
                                        b bVar = e.f27128s;
                                        ConcurrentHashMap b11 = b.b();
                                        kotlin.jvm.internal.i.f(skuID, "skuID");
                                        b11.put(skuID, jSONObject);
                                    }
                                }
                                context = null;
                                jSONObject.put("packageName", context.getPackageName());
                                if (!jSONObject.has("productId")) {
                                }
                            }
                        }
                        method = null;
                        d10 = j.d(cls, obj, method, new Object[0]);
                        if (d10 instanceof String) {
                        }
                        if (str != null) {
                        }
                    }
                    cls = null;
                    if (!b6.a.b(e.class)) {
                    }
                    method = null;
                    d10 = j.d(cls, obj, method, new Object[0]);
                    if (d10 instanceof String) {
                    }
                    if (str != null) {
                    }
                }
                this.f27150a.run();
            } catch (Throwable th6) {
                b6.a.a(this, th6);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) {
            Object obj;
            if (b6.a.b(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.i.g(proxy, "proxy");
                kotlin.jvm.internal.i.g(method, "method");
                if (kotlin.jvm.internal.i.b(method.getName(), "onPurchaseHistoryResponse")) {
                    if (objArr == null) {
                        obj = null;
                    } else {
                        obj = objArr[1];
                    }
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                b6.a.a(this, th2);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* loaded from: classes.dex */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (b6.a.b(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.i.g(proxy, "proxy");
                kotlin.jvm.internal.i.g(m10, "m");
                return null;
            } catch (Throwable th2) {
                b6.a.a(this, th2);
                return null;
            }
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* renamed from: o5.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0450e implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f27152a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f27153b;

        public C0450e(e this$0, Runnable runnable) {
            kotlin.jvm.internal.i.g(this$0, "this$0");
            this.f27153b = this$0;
            this.f27152a = runnable;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0047 A[Catch: Exception -> 0x000f, all -> 0x007c, TryCatch #0 {Exception -> 0x000f, blocks: (B:9:0x0019, B:18:0x002d, B:26:0x003c, B:28:0x0047, B:32:0x004e, B:34:0x0059, B:40:0x006a, B:41:0x006d, B:24:0x0038, B:16:0x0029), top: B:49:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x004e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x004d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(List<?> list) {
            boolean b10;
            ConcurrentHashMap concurrentHashMap;
            e eVar;
            Class<?> cls;
            Method method;
            Object d10;
            String str;
            if (b6.a.b(this)) {
                return;
            }
            try {
                for (Object obj : list) {
                    try {
                        int i6 = j.f27172a;
                        b10 = b6.a.b(e.class);
                        concurrentHashMap = null;
                        eVar = this.f27153b;
                    } catch (Exception unused) {
                    }
                    if (!b10) {
                        try {
                            cls = eVar.f;
                        } catch (Throwable th2) {
                            b6.a.a(e.class, th2);
                        }
                        if (!b6.a.b(e.class)) {
                            try {
                                method = eVar.f27145m;
                            } catch (Throwable th3) {
                                b6.a.a(e.class, th3);
                            }
                            d10 = j.d(cls, obj, method, new Object[0]);
                            if (d10 instanceof String) {
                                str = (String) d10;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String skuID = jSONObject.getString("productId");
                                    b bVar = e.f27128s;
                                    if (!b6.a.b(e.class)) {
                                        try {
                                            concurrentHashMap = e.f27133x;
                                        } catch (Throwable th4) {
                                            b6.a.a(e.class, th4);
                                        }
                                    }
                                    kotlin.jvm.internal.i.f(skuID, "skuID");
                                    concurrentHashMap.put(skuID, jSONObject);
                                }
                            }
                        }
                        method = null;
                        d10 = j.d(cls, obj, method, new Object[0]);
                        if (d10 instanceof String) {
                        }
                        if (str != null) {
                        }
                    }
                    cls = null;
                    if (!b6.a.b(e.class)) {
                    }
                    method = null;
                    d10 = j.d(cls, obj, method, new Object[0]);
                    if (d10 instanceof String) {
                    }
                    if (str != null) {
                    }
                }
                this.f27152a.run();
            } catch (Throwable th5) {
                b6.a.a(this, th5);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method m10, Object[] objArr) {
            Object obj;
            if (b6.a.b(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.i.g(proxy, "proxy");
                kotlin.jvm.internal.i.g(m10, "m");
                if (kotlin.jvm.internal.i.b(m10.getName(), "onSkuDetailsResponse")) {
                    if (objArr == null) {
                        obj = null;
                    } else {
                        obj = objArr[1];
                    }
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                b6.a.a(this, th2);
                return null;
            }
        }
    }

    public e() {
        throw null;
    }

    public e(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, i iVar) {
        this.f27134a = context;
        this.f27135b = obj;
        this.f27136c = cls;
        this.f27137d = cls2;
        this.f27138e = cls3;
        this.f = cls4;
        this.f27139g = cls5;
        this.f27140h = cls6;
        this.f27141i = cls7;
        this.f27142j = method;
        this.f27143k = method2;
        this.f27144l = method3;
        this.f27145m = method4;
        this.f27146n = method5;
        this.f27147o = method6;
        this.f27148p = method7;
        this.f27149q = iVar;
        this.r = new CopyOnWriteArraySet();
    }

    public static final /* synthetic */ e a() {
        if (b6.a.b(e.class)) {
            return null;
        }
        try {
            return f27130u;
        } catch (Throwable th2) {
            b6.a.a(e.class, th2);
            return null;
        }
    }

    public final void b(i5.b bVar) {
        List list;
        String str;
        if (b6.a.b(this)) {
            return;
        }
        try {
            int i6 = j.f27172a;
            Object d10 = j.d(this.f27137d, j.d(this.f27136c, this.f27135b, this.f27142j, "inapp"), this.f27143k, new Object[0]);
            if (d10 instanceof List) {
                list = (List) d10;
            } else {
                list = null;
            }
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    int i10 = j.f27172a;
                    Object d11 = j.d(this.f27138e, obj, this.f27144l, new Object[0]);
                    if (d11 instanceof String) {
                        str = (String) d11;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String skuID = jSONObject.getString("productId");
                            arrayList.add(skuID);
                            ConcurrentHashMap concurrentHashMap = f27132w;
                            kotlin.jvm.internal.i.f(skuID, "skuID");
                            concurrentHashMap.put(skuID, jSONObject);
                        }
                    }
                }
                d(arrayList, bVar);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void c(v vVar) {
        Class<?> cls = this.f27141i;
        if (b6.a.b(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new c(this, vVar));
            int i6 = j.f27172a;
            j.d(this.f27136c, this.f27135b, this.f27148p, "inapp", newProxyInstance);
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        Class<?> cls = this.f27140h;
        if (b6.a.b(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0450e(this, runnable));
            Object a10 = this.f27149q.a(arrayList);
            int i6 = j.f27172a;
            j.d(this.f27136c, this.f27135b, this.f27147o, a10, newProxyInstance);
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void e() {
        Method c10;
        Class<?> cls = this.f27136c;
        if (b6.a.b(this)) {
            return;
        }
        try {
            Class<?> a10 = j.a("com.android.billingclient.api.BillingClientStateListener");
            if (a10 == null || (c10 = j.c(cls, "startConnection", a10)) == null) {
                return;
            }
            j.d(cls, this.f27135b, c10, Proxy.newProxyInstance(a10.getClassLoader(), new Class[]{a10}, new a()));
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
