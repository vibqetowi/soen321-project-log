package io.grpc;

import io.grpc.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public final class ManagedChannelRegistry {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f20418c = Logger.getLogger(ManagedChannelRegistry.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static ManagedChannelRegistry f20419d;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<ManagedChannelProvider> f20420a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public List<ManagedChannelProvider> f20421b = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class ProviderNotFoundException extends RuntimeException {
    }

    /* loaded from: classes2.dex */
    public class a implements Comparator<ManagedChannelProvider> {
        @Override // java.util.Comparator
        public final int compare(ManagedChannelProvider managedChannelProvider, ManagedChannelProvider managedChannelProvider2) {
            return managedChannelProvider.c() - managedChannelProvider2.c();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements p.a<ManagedChannelProvider> {
        @Override // io.grpc.p.a
        public final boolean a(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.b();
        }

        @Override // io.grpc.p.a
        public final int b(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.c();
        }
    }

    public static List<Class<?>> b() {
        Logger logger = f20418c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(wr.g.class);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e11);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e12) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e12);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final synchronized void a(ManagedChannelProvider managedChannelProvider) {
        sc.b.s("isAvailable() returned false", managedChannelProvider.b());
        this.f20420a.add(managedChannelProvider);
    }

    public final ManagedChannelProvider c() {
        List<ManagedChannelProvider> list;
        synchronized (this) {
            list = this.f20421b;
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public final synchronized void d() {
        ArrayList arrayList = new ArrayList(this.f20420a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f20421b = Collections.unmodifiableList(arrayList);
    }
}
