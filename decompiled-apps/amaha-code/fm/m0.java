package fm;

import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class m0<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j0 f15447a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15448b;

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ya.h<Void> f15449u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15450v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ya.h<Void> hVar, kotlinx.coroutines.j<? super Boolean> jVar) {
            super(0);
            this.f15449u = hVar;
            this.f15450v = jVar;
        }

        @Override // ss.a
        public final hs.k invoke() {
            boolean isSuccessful = this.f15449u.isSuccessful();
            kotlinx.coroutines.j<Boolean> jVar = this.f15450v;
            if (isSuccessful) {
                if (jVar.a()) {
                    jVar.resumeWith(Boolean.TRUE);
                }
            } else if (jVar.a()) {
                jVar.resumeWith(Boolean.FALSE);
            }
            return hs.k.f19476a;
        }
    }

    public m0(j0 j0Var, kotlinx.coroutines.k kVar) {
        this.f15447a = j0Var;
        this.f15448b = kVar;
    }

    @Override // ya.d
    public final void a(ya.h<Void> it) {
        kotlin.jvm.internal.i.g(it, "it");
        UtilsKt.logError$default(this.f15447a.f15374a, null, new a(it, this.f15448b), 2, null);
    }
}
