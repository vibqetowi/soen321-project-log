package qg;

import android.content.Context;
import java.util.LinkedHashMap;
/* compiled from: CoreInstanceProvider.kt */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f29578a = new w();

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f29579b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f29580c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f29581d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final LinkedHashMap f29582e = new LinkedHashMap();
    public static final LinkedHashMap f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public static final LinkedHashMap f29583g = new LinkedHashMap();

    public static sg.a a(Context context, ih.p sdkInstance) {
        sg.a aVar;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f29580c;
        sg.a aVar2 = (sg.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (aVar2 == null) {
            synchronized (w.class) {
                aVar = (sg.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (aVar == null) {
                    aVar = new sg.a(context, sdkInstance);
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, aVar);
            }
            return aVar;
        }
        return aVar2;
    }

    public static uh.a b(ih.p sdkInstance) {
        uh.a aVar;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f;
        uh.a aVar2 = (uh.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (aVar2 == null) {
            synchronized (w.class) {
                aVar = (uh.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (aVar == null) {
                    aVar = new uh.a();
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, aVar);
            }
            return aVar;
        }
        return aVar2;
    }

    public static ai.a c(ih.p sdkInstance) {
        ai.a aVar;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f29581d;
        ai.a aVar2 = (ai.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (aVar2 == null) {
            synchronized (w.class) {
                aVar = (ai.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (aVar == null) {
                    aVar = new ai.a();
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, aVar);
            }
            return aVar;
        }
        return aVar2;
    }

    public static g d(ih.p sdkInstance) {
        g gVar;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f29579b;
        g gVar2 = (g) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (gVar2 == null) {
            synchronized (w.class) {
                gVar = (g) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (gVar == null) {
                    gVar = new g(sdkInstance);
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, gVar);
            }
            return gVar;
        }
        return gVar2;
    }

    public static yg.j e(ih.p sdkInstance) {
        yg.j jVar;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f29583g;
        yg.j jVar2 = (yg.j) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (jVar2 == null) {
            synchronized (w.class) {
                jVar = (yg.j) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (jVar == null) {
                    jVar = new yg.j(sdkInstance);
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, jVar);
            }
            return jVar;
        }
        return jVar2;
    }

    public static uh.b f(Context context, ih.p sdkInstance) {
        uh.b bVar;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f29582e;
        uh.b bVar2 = (uh.b) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (bVar2 == null) {
            synchronized (w.class) {
                bVar = (uh.b) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (bVar == null) {
                    wh.h hVar = new wh.h(new wh.f(sdkInstance));
                    ai.g.f583a.getClass();
                    bVar = new uh.b(hVar, new vh.d(context, ai.g.a(context, sdkInstance), sdkInstance), sdkInstance);
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, bVar);
            }
            return bVar;
        }
        return bVar2;
    }
}
