package com.facebook.internal.gatekeeper;

import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GateKeeperRuntimeCache.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u0006J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00072\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\u0005J$\u0010\r\u001a\u00020\u000e2\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0010\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u0006J\u001c\u0010\u0012\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0013\u001a\u00020\u0007J$\u0010\u0014\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eJ\"\u0010\u0016\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\tR*\u0010\u0003\u001a\u001e\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/gatekeeper/GateKeeperRuntimeCache;", "", "()V", "gateKeepers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/facebook/internal/gatekeeper/AppID;", "Lcom/facebook/internal/gatekeeper/GateKeeper;", "dumpGateKeepers", "", "appId", "getGateKeeper", "name", "getGateKeeperValue", "", "defaultValue", "resetCache", "", "setGateKeeper", "gateKeeper", "setGateKeeperValue", "value", "setGateKeepers", "gateKeeperList", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GateKeeperRuntimeCache {
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, GateKeeper>> gateKeepers = new ConcurrentHashMap<>();

    public static /* synthetic */ void setGateKeepers$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeepers(str, list);
    }

    public final void setGateKeepers(String appId, List<GateKeeper> gateKeeperList) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = new ConcurrentHashMap<>();
        for (GateKeeper gateKeeper : gateKeeperList) {
            concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
        }
        this.gateKeepers.put(appId, concurrentHashMap);
    }

    public static /* synthetic */ List dumpGateKeepers$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.dumpGateKeepers(str);
    }

    public final List<GateKeeper> dumpGateKeepers(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = this.gateKeepers.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap2 = concurrentHashMap;
        ArrayList arrayList = new ArrayList(concurrentHashMap2.size());
        for (Map.Entry<String, GateKeeper> entry : concurrentHashMap2.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    public static /* synthetic */ boolean getGateKeeperValue$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.getGateKeeperValue(str, str2, z);
    }

    public final boolean getGateKeeperValue(String appId, String name, boolean z) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(name, "name");
        GateKeeper gateKeeper = getGateKeeper(appId, name);
        return gateKeeper == null ? z : gateKeeper.getValue();
    }

    public static /* synthetic */ void setGateKeeperValue$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeeperValue(str, str2, z);
    }

    public final void setGateKeeperValue(String appId, String name, boolean z) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(name, "name");
        setGateKeeper(appId, new GateKeeper(name, z));
    }

    public static /* synthetic */ GateKeeper getGateKeeper$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.getGateKeeper(str, str2);
    }

    public final GateKeeper getGateKeeper(String appId, String name) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(name, "name");
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = this.gateKeepers.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(name);
    }

    public static /* synthetic */ void setGateKeeper$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, GateKeeper gateKeeper, int i, Object obj) {
        if ((i & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeeper(str, gateKeeper);
    }

    public final void setGateKeeper(String appId, GateKeeper gateKeeper) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(gateKeeper, "gateKeeper");
        if (!this.gateKeepers.containsKey(appId)) {
            this.gateKeepers.put(appId, new ConcurrentHashMap<>());
        }
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = this.gateKeepers.get(appId);
        if (concurrentHashMap == null) {
            return;
        }
        concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
    }

    public static /* synthetic */ void resetCache$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.resetCache(str);
    }

    public final void resetCache(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.gateKeepers.remove(appId);
    }
}
