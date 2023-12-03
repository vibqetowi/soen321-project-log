package gt;

import pu.i;
/* compiled from: ScopesHolderForClass.kt */
/* loaded from: classes2.dex */
public final class o0<T extends pu.i> {

    /* renamed from: a  reason: collision with root package name */
    public final e f16795a;

    /* renamed from: b  reason: collision with root package name */
    public final ss.l<xu.e, T> f16796b;

    /* renamed from: c  reason: collision with root package name */
    public final xu.e f16797c;

    /* renamed from: d  reason: collision with root package name */
    public final vu.i f16798d;
    public static final /* synthetic */ ys.m<Object>[] f = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(o0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final a f16794e = new a();

    /* compiled from: ScopesHolderForClass.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static o0 a(ss.l lVar, e classDescriptor, vu.l storageManager, xu.e kotlinTypeRefinerForOwnerModule) {
            kotlin.jvm.internal.i.g(classDescriptor, "classDescriptor");
            kotlin.jvm.internal.i.g(storageManager, "storageManager");
            kotlin.jvm.internal.i.g(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            return new o0(classDescriptor, storageManager, lVar, kotlinTypeRefinerForOwnerModule);
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<T> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ o0<T> f16799u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o0<T> o0Var) {
            super(0);
            this.f16799u = o0Var;
        }

        @Override // ss.a
        public final Object invoke() {
            o0<T> o0Var = this.f16799u;
            return o0Var.f16796b.invoke(o0Var.f16797c);
        }
    }

    public o0(e eVar, vu.l lVar, ss.l lVar2, xu.e eVar2) {
        this.f16795a = eVar;
        this.f16796b = lVar2;
        this.f16797c = eVar2;
        this.f16798d = lVar.e(new b(this));
    }

    public final T a(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlinTypeRefiner.E(mu.a.j(this.f16795a));
        return (T) kotlin.jvm.internal.h.C(this.f16798d, f[0]);
    }
}
