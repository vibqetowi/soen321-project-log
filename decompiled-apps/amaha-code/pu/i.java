package pu;

import is.y;
import java.util.Collection;
import java.util.Set;
/* compiled from: MemberScope.kt */
/* loaded from: classes2.dex */
public interface i extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f29004a = a.f29005a;

    /* compiled from: MemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f29005a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final C0490a f29006b = C0490a.f29007u;

        /* compiled from: MemberScope.kt */
        /* renamed from: pu.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0490a extends kotlin.jvm.internal.k implements ss.l<fu.e, Boolean> {

            /* renamed from: u  reason: collision with root package name */
            public static final C0490a f29007u = new C0490a();

            public C0490a() {
                super(1);
            }

            @Override // ss.l
            public final Boolean invoke(fu.e eVar) {
                fu.e it = eVar;
                kotlin.jvm.internal.i.g(it, "it");
                return Boolean.TRUE;
            }
        }
    }

    /* compiled from: MemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class b extends j {

        /* renamed from: b  reason: collision with root package name */
        public static final b f29008b = new b();

        @Override // pu.j, pu.i
        public final Set<fu.e> b() {
            return y.f20678u;
        }

        @Override // pu.j, pu.i
        public final Set<fu.e> d() {
            return y.f20678u;
        }

        @Override // pu.j, pu.i
        public final Set<fu.e> e() {
            return y.f20678u;
        }
    }

    Collection a(fu.e eVar, ot.c cVar);

    Set<fu.e> b();

    Collection c(fu.e eVar, ot.c cVar);

    Set<fu.e> d();

    Set<fu.e> e();
}
