package pl;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N24ScreenFragment;
/* compiled from: N24ScreenFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.fragments.N24ScreenFragment$renderIndividualBitmap$2$onResourceReady$1$1", f = "N24ScreenFragment.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f28585u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ N24ScreenFragment f28586v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c0 f28587w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(N24ScreenFragment n24ScreenFragment, c0 c0Var, ls.d<? super e0> dVar) {
        super(2, dVar);
        this.f28586v = n24ScreenFragment;
        this.f28587w = c0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new e0(this.f28586v, this.f28587w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((e0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f28585u;
        N24ScreenFragment n24ScreenFragment = this.f28586v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            int i10 = N24ScreenFragment.F;
            ql.t P = n24ScreenFragment.P();
            ConstraintLayout clN24ScreenLayoutGenerator = (ConstraintLayout) n24ScreenFragment._$_findCachedViewById(R.id.clN24ScreenLayoutGenerator);
            kotlin.jvm.internal.i.f(clN24ScreenLayoutGenerator, "clN24ScreenLayoutGenerator");
            this.f28585u = 1;
            P.getClass();
            obj = ta.v.g(kc.f.H(P), null, new ql.u(clN24ScreenLayoutGenerator, this.f28587w, P, null), 3).x(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        hs.f<String, Bitmap> fVar = (hs.f) obj;
        if (fVar != null) {
            n24ScreenFragment.C.add(fVar);
        }
        return hs.k.f19476a;
    }
}
