package ji;

import android.content.Context;
import java.util.LinkedHashMap;
/* compiled from: FcmInstanceProvider.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f22046a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f22047b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f22048c = new LinkedHashMap();

    public static e a(ih.p pVar) {
        e eVar;
        LinkedHashMap linkedHashMap = f22047b;
        e eVar2 = (e) linkedHashMap.get((String) pVar.f20102a.f5133c);
        if (eVar2 == null) {
            synchronized (f.class) {
                eVar = (e) linkedHashMap.get((String) pVar.f20102a.f5133c);
                if (eVar == null) {
                    eVar = new e(pVar);
                }
                linkedHashMap.put((String) pVar.f20102a.f5133c, eVar);
            }
            return eVar;
        }
        return eVar2;
    }

    public static ki.a b(Context context, ih.p sdkInstance) {
        ki.a aVar;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f22048c;
        ki.a aVar2 = (ki.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (aVar2 == null) {
            synchronized (f.class) {
                aVar = (ki.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (aVar == null) {
                    aVar = new ki.a(new ki.c(context, sdkInstance));
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, aVar);
            }
            return aVar;
        }
        return aVar2;
    }
}
