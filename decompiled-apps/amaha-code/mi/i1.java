package mi;

import android.content.Context;
import java.util.LinkedHashMap;
/* compiled from: InAppInstanceProvider.kt */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public static final i1 f25206a = new i1();

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f25207b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f25208c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f25209d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final LinkedHashMap f25210e = new LinkedHashMap();

    public static vi.a a(ih.p sdkInstance) {
        vi.a aVar;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f25210e;
        vi.a aVar2 = (vi.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (aVar2 == null) {
            synchronized (i1.class) {
                f25206a.getClass();
                aVar = (vi.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (aVar == null) {
                    aVar = new vi.a();
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, aVar);
            }
            return aVar;
        }
        return aVar2;
    }

    public static h1 b(ih.p sdkInstance) {
        h1 h1Var;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f25208c;
        h1 h1Var2 = (h1) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (h1Var2 == null) {
            synchronized (i1.class) {
                f25206a.getClass();
                h1Var = (h1) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (h1Var == null) {
                    h1Var = new h1(sdkInstance);
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, h1Var);
            }
            return h1Var;
        }
        return h1Var2;
    }

    public static c0 c(ih.p sdkInstance) {
        c0 c0Var;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f25207b;
        c0 c0Var2 = (c0) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (c0Var2 == null) {
            synchronized (i1.class) {
                c0Var = (c0) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (c0Var == null) {
                    c0Var = new c0(sdkInstance);
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, c0Var);
            }
            return c0Var;
        }
        return c0Var2;
    }

    public static vi.o d(Context context, ih.p sdkInstance) {
        vi.o oVar;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f25209d;
        vi.o oVar2 = (vi.o) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (oVar2 == null) {
            synchronized (i1.class) {
                oVar = (vi.o) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (oVar == null) {
                    ai.g.f583a.getClass();
                    oVar = new vi.o(new wi.b(context, ai.g.a(context, sdkInstance), sdkInstance), new xi.l(sdkInstance), sdkInstance);
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, oVar);
            }
            return oVar;
        }
        return oVar2;
    }
}
