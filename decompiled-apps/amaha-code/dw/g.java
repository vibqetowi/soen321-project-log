package dw;

import dw.h;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes2.dex */
public final class g implements c<Object, b<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f13561a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f13562b;

    public g(Type type, Executor executor) {
        this.f13561a = type;
        this.f13562b = executor;
    }

    @Override // dw.c
    public final Object a(r rVar) {
        Executor executor = this.f13562b;
        if (executor != null) {
            return new h.a(executor, rVar);
        }
        return rVar;
    }

    @Override // dw.c
    public final Type b() {
        return this.f13561a;
    }
}
