package io.grpc;

import io.grpc.p;
import java.util.Comparator;
/* compiled from: ServiceProviders.java */
/* loaded from: classes2.dex */
public final class o implements Comparator<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p.a f20502u;

    public o(p.a aVar) {
        this.f20502u = aVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        p.a aVar = this.f20502u;
        int b10 = aVar.b(obj) - aVar.b(obj2);
        if (b10 != 0) {
            return b10;
        }
        return obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
