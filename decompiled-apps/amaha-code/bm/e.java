package bm;

import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.utils.Extensions;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.d0;
/* compiled from: FirestoreGoalsAdapter.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.adapter.FirestoreGoalsAdapter$handleIconVisibility$1", f = "FirestoreGoalsAdapter.kt", l = {237}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f4447u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f4448v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ yp.n f4449w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ d f4450x;

    /* compiled from: FirestoreGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ yp.n f4451u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ d f4452v;

        public a(d dVar, yp.n nVar) {
            this.f4451u = nVar;
            this.f4452v = dVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public final Object b(Object obj, ls.d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            yp.n nVar = this.f4451u;
            if (booleanValue) {
                Extensions extensions = Extensions.INSTANCE;
                ProgressBar progressBar = nVar.f38877d;
                kotlin.jvm.internal.i.f(progressBar, "binding.pbRowGoalProgress");
                extensions.visible(progressBar);
                AppCompatImageView appCompatImageView = nVar.f38876c;
                kotlin.jvm.internal.i.f(appCompatImageView, "binding.ivRowGoalDelete");
                extensions.gone(appCompatImageView);
                AppCompatImageView appCompatImageView2 = nVar.f38875b;
                kotlin.jvm.internal.i.f(appCompatImageView2, "binding.ivRowGoalCheckMark");
                extensions.gone(appCompatImageView2);
            } else {
                Extensions extensions2 = Extensions.INSTANCE;
                ProgressBar progressBar2 = nVar.f38877d;
                kotlin.jvm.internal.i.f(progressBar2, "binding.pbRowGoalProgress");
                extensions2.gone(progressBar2);
                boolean z10 = this.f4452v.C;
                AppCompatImageView appCompatImageView3 = nVar.f38875b;
                AppCompatImageView appCompatImageView4 = nVar.f38876c;
                if (z10) {
                    kotlin.jvm.internal.i.f(appCompatImageView4, "binding.ivRowGoalDelete");
                    extensions2.visible(appCompatImageView4);
                    kotlin.jvm.internal.i.f(appCompatImageView3, "binding.ivRowGoalCheckMark");
                    extensions2.gone(appCompatImageView3);
                } else {
                    kotlin.jvm.internal.i.f(appCompatImageView4, "binding.ivRowGoalDelete");
                    extensions2.gone(appCompatImageView4);
                    kotlin.jvm.internal.i.f(appCompatImageView3, "binding.ivRowGoalCheckMark");
                    extensions2.visible(appCompatImageView3);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FirestoreGoal firestoreGoal, yp.n nVar, d dVar, ls.d<? super e> dVar2) {
        super(2, dVar2);
        this.f4448v = firestoreGoal;
        this.f4449w = nVar;
        this.f4450x = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new e(this.f4448v, this.f4449w, this.f4450x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        return ms.a.COROUTINE_SUSPENDED;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f4447u;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.flow.p<Boolean> loading = this.f4448v.getLoading();
            a aVar2 = new a(this.f4450x, this.f4449w);
            this.f4447u = 1;
            if (loading.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
