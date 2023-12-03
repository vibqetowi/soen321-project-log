package wn;

import com.theinnerhour.b2b.utils.LogHelper;
import fe.y;
import kotlinx.coroutines.d0;
/* compiled from: MultiTrackerMigrationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerMigrationViewModel$performBatchOperation$2$1", f = "MultiTrackerMigrationViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ y f36815u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f36816v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f36817w;

    /* compiled from: MultiTrackerMigrationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f36818a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ls.d<? super Boolean> dVar) {
            this.f36818a = dVar;
        }

        @Override // ya.d
        public final void a(ya.h<Void> it) {
            kotlin.jvm.internal.i.g(it, "it");
            this.f36818a.resumeWith(Boolean.valueOf(it.isSuccessful()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(y yVar, k kVar, ls.d<? super Boolean> dVar, ls.d<? super n> dVar2) {
        super(2, dVar2);
        this.f36815u = yVar;
        this.f36816v = kVar;
        this.f36817w = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new n(this.f36815u, this.f36816v, this.f36817w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((n) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        try {
            this.f36815u.a().addOnCompleteListener(new a(this.f36817w));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f36816v.f36803x, e10);
        }
        return hs.k.f19476a;
    }
}
