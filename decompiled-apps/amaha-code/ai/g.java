package ai;

import android.content.Context;
import ih.p;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;
import s1.s;
/* compiled from: StorageProvider.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f583a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f584b = new LinkedHashMap();

    public static lh.a a(Context context, p sdkInstance) {
        lh.a aVar;
        i.g(context, "context");
        i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f584b;
        lh.a aVar2 = (lh.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (aVar2 == null) {
            synchronized (g.class) {
                aVar = (lh.a) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (aVar == null) {
                    f583a.getClass();
                    v.c cVar = new v.c(context, sdkInstance);
                    aVar = new lh.a(new s(context, sdkInstance.f20102a), cVar, new vh.b(cVar, sdkInstance));
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, aVar);
            }
            return aVar;
        }
        return aVar2;
    }
}
