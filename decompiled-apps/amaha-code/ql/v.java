package ql;

import fm.j0;
import java.util.List;
/* compiled from: NewDynamicActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$fetchActivityInfoForId$1$1$3", f = "NewDynamicActivityViewModel.kt", l = {528}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29824u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f29825v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t f29826w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f29827x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f29828y;

    /* compiled from: NewDynamicActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$fetchActivityInfoForId$1$1$3$1", f = "NewDynamicActivityViewModel.kt", l = {526}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public t f29829u;

        /* renamed from: v  reason: collision with root package name */
        public int f29830v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ t f29831w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f29832x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f29833y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, String str, String str2, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f29831w = tVar;
            this.f29832x = str;
            this.f29833y = str2;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f29831w, this.f29832x, this.f29833y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f29830v;
            boolean z10 = true;
            if (i6 != 0) {
                if (i6 == 1) {
                    tVar = this.f29829u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                t tVar2 = this.f29831w;
                j0 f = t.f(tVar2);
                this.f29829u = tVar2;
                this.f29830v = 1;
                f.getClass();
                Object h10 = j0.h(this.f29832x, this.f29833y, this, true);
                if (h10 == aVar) {
                    return aVar;
                }
                tVar = tVar2;
                obj = h10;
            }
            if (obj != null) {
                z10 = false;
            }
            tVar.B = z10;
            return hs.k.f19476a;
        }
    }

    /* compiled from: NewDynamicActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$fetchActivityInfoForId$1$1$3$2", f = "NewDynamicActivityViewModel.kt", l = {527}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public t f29834u;

        /* renamed from: v  reason: collision with root package name */
        public int f29835v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ t f29836w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f29837x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f29838y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, String str, String str2, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f29836w = tVar;
            this.f29837x = str;
            this.f29838y = str2;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f29836w, this.f29837x, this.f29838y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f29835v;
            boolean z10 = true;
            if (i6 != 0) {
                if (i6 == 1) {
                    tVar = this.f29834u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                t tVar2 = this.f29836w;
                j0 f = t.f(tVar2);
                this.f29834u = tVar2;
                this.f29835v = 1;
                Object k10 = f.k(this.f29837x, this.f29838y, this);
                if (k10 == aVar) {
                    return aVar;
                }
                tVar = tVar2;
                obj = k10;
            }
            if (obj == null) {
                z10 = false;
            }
            tVar.C = z10;
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar, String str, String str2, ls.d<? super v> dVar) {
        super(2, dVar);
        this.f29826w = tVar;
        this.f29827x = str;
        this.f29828y = str2;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        v vVar = new v(this.f29826w, this.f29827x, this.f29828y, dVar);
        vVar.f29825v = obj;
        return vVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((v) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29824u;
        t tVar = this.f29826w;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f29825v;
            String str = this.f29827x;
            String str2 = this.f29828y;
            List P0 = ca.a.P0(ta.v.g(d0Var, null, new a(tVar, str, str2, null), 3), ta.v.g(d0Var, null, new b(tVar, str2, str, null), 3));
            this.f29824u = 1;
            obj = ca.a.n(P0, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list = (List) obj;
        tVar.L.i(Boolean.TRUE);
        return hs.k.f19476a;
    }
}
