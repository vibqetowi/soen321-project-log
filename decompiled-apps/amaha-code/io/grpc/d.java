package io.grpc;

import io.grpc.a;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: EquivalentAddressGroup.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a.b<String> f20451d = new a.b<>("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a  reason: collision with root package name */
    public final List<SocketAddress> f20452a;

    /* renamed from: b  reason: collision with root package name */
    public final a f20453b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20454c;

    public d() {
        throw null;
    }

    public d(List<SocketAddress> list, a aVar) {
        sc.b.s("addrs is empty", !list.isEmpty());
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f20452a = unmodifiableList;
        sc.b.w(aVar, "attrs");
        this.f20453b = aVar;
        this.f20454c = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        List<SocketAddress> list = this.f20452a;
        if (list.size() != dVar.f20452a.size()) {
            return false;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!list.get(i6).equals(dVar.f20452a.get(i6))) {
                return false;
            }
        }
        if (!this.f20453b.equals(dVar.f20453b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20454c;
    }

    public final String toString() {
        return "[" + this.f20452a + "/" + this.f20453b + "]";
    }

    public d(SocketAddress socketAddress) {
        this(Collections.singletonList(socketAddress), a.f20426b);
    }
}
