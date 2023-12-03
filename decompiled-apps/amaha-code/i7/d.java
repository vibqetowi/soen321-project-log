package i7;

import android.content.Context;
import j7.b;
import j7.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: classes.dex */
public final class d implements f7.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19903u;

    /* renamed from: v  reason: collision with root package name */
    public final gs.a f19904v;

    public /* synthetic */ d(gs.a aVar, int i6) {
        this.f19903u = i6;
        this.f19904v = aVar;
    }

    @Override // gs.a
    public final Object get() {
        int i6 = this.f19903u;
        gs.a aVar = this.f19904v;
        switch (i6) {
            case 0:
                m7.a aVar2 = (m7.a) aVar.get();
                HashMap hashMap = new HashMap();
                a7.d dVar = a7.d.DEFAULT;
                b.a aVar3 = new b.a();
                Set<d.b> emptySet = Collections.emptySet();
                if (emptySet != null) {
                    aVar3.f21696c = emptySet;
                    aVar3.f21694a = 30000L;
                    aVar3.f21695b = 86400000L;
                    hashMap.put(dVar, aVar3.a());
                    a7.d dVar2 = a7.d.HIGHEST;
                    b.a aVar4 = new b.a();
                    Set<d.b> emptySet2 = Collections.emptySet();
                    if (emptySet2 != null) {
                        aVar4.f21696c = emptySet2;
                        aVar4.f21694a = 1000L;
                        aVar4.f21695b = 86400000L;
                        hashMap.put(dVar2, aVar4.a());
                        a7.d dVar3 = a7.d.VERY_LOW;
                        b.a aVar5 = new b.a();
                        Set<d.b> emptySet3 = Collections.emptySet();
                        if (emptySet3 != null) {
                            aVar5.f21696c = emptySet3;
                            aVar5.f21694a = 86400000L;
                            aVar5.f21695b = 86400000L;
                            Set<d.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(d.b.DEVICE_IDLE)));
                            if (unmodifiableSet != null) {
                                aVar5.f21696c = unmodifiableSet;
                                hashMap.put(dVar3, aVar5.a());
                                if (aVar2 != null) {
                                    if (hashMap.keySet().size() >= a7.d.values().length) {
                                        new HashMap();
                                        return new j7.a(aVar2, hashMap);
                                    }
                                    throw new IllegalStateException("Not all priorities have been configured");
                                }
                                throw new NullPointerException("missing required property: clock");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            default:
                String packageName = ((Context) aVar.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
