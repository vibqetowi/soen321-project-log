package fj;

import android.content.Context;
import java.util.LinkedHashMap;
/* compiled from: PushBaseInstanceProvider.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f15071a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f15072b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f15073c = new LinkedHashMap();

    public static lj.i a(ih.p sdkInstance) {
        lj.i iVar;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f15073c;
        lj.i iVar2 = (lj.i) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (iVar2 == null) {
            synchronized (d.class) {
                iVar = (lj.i) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (iVar == null) {
                    iVar = new lj.i();
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, iVar);
            }
            return iVar;
        }
        return iVar2;
    }

    public static lj.k b(Context context, ih.p sdkInstance) {
        lj.k kVar;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        LinkedHashMap linkedHashMap = f15072b;
        lj.k kVar2 = (lj.k) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
        if (kVar2 == null) {
            synchronized (d.class) {
                kVar = (lj.k) linkedHashMap.get((String) sdkInstance.f20102a.f5133c);
                if (kVar == null) {
                    kVar = new lj.k(new mj.b(context, sdkInstance), sdkInstance);
                }
                linkedHashMap.put((String) sdkInstance.f20102a.f5133c, kVar);
            }
            return kVar;
        }
        return kVar2;
    }
}
