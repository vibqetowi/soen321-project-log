package j$.time.zone;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList f21077a;

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f21078b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile Set f21079c;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f21077a = copyOnWriteArrayList;
        f21078b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static Set a() {
        return f21079c;
    }

    public static ZoneRules b(String str, boolean z10) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f21078b;
        i iVar = (i) concurrentHashMap.get(str);
        if (iVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new f("No time-zone data files registered");
            }
            throw new f("Unknown time-zone ID: " + str);
        }
        return iVar.c(str);
    }

    public static void e(i iVar) {
        Objects.requireNonNull(iVar, "provider");
        synchronized (i.class) {
            for (String str : iVar.d()) {
                Objects.requireNonNull(str, "zoneId");
                if (((i) f21078b.putIfAbsent(str, iVar)) != null) {
                    throw new f("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
                }
            }
            f21079c = Collections.unmodifiableSet(new HashSet(f21078b.keySet()));
        }
        f21077a.add(iVar);
    }

    protected abstract ZoneRules c(String str);

    protected abstract Set d();
}
