package z3;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;
/* compiled from: EventBridgeContainer.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f39147b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f39148c = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final d f39149a = new d();

    /* compiled from: EventBridgeContainer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static c a(String instanceName) {
            c cVar;
            i.g(instanceName, "instanceName");
            synchronized (c.f39147b) {
                LinkedHashMap linkedHashMap = c.f39148c;
                Object obj = linkedHashMap.get(instanceName);
                if (obj == null) {
                    obj = new c();
                    linkedHashMap.put(instanceName, obj);
                }
                cVar = (c) obj;
            }
            return cVar;
        }
    }
}
