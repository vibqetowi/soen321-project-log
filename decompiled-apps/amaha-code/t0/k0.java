package t0;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: View.kt */
@ns.e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {414, 416}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k0 extends ns.h implements ss.p<fv.j<? super View>, ls.d<? super hs.k>, Object> {

    /* renamed from: v  reason: collision with root package name */
    public int f32328v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f32329w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ View f32330x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(View view, ls.d<? super k0> dVar) {
        super(dVar);
        this.f32330x = view;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        k0 k0Var = new k0(this.f32330x, dVar);
        k0Var.f32329w = obj;
        return k0Var;
    }

    @Override // ss.p
    public final Object invoke(fv.j<? super View> jVar, ls.d<? super hs.k> dVar) {
        return ((k0) create(jVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f32328v;
        View view = this.f32330x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                fv.j jVar = (fv.j) this.f32329w;
                sp.b.d0(obj);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    kotlin.jvm.internal.i.g(viewGroup, "<this>");
                    i0 i0Var = new i0(viewGroup, null);
                    this.f32329w = null;
                    this.f32328v = 2;
                    jVar.getClass();
                    fv.i iVar = new fv.i();
                    iVar.f15982x = ca.a.M(iVar, iVar, i0Var);
                    Object g5 = jVar.g(iVar, this);
                    if (g5 != aVar) {
                        g5 = hs.k.f19476a;
                    }
                    if (g5 == aVar) {
                        return aVar;
                    }
                }
            }
            return hs.k.f19476a;
        }
        sp.b.d0(obj);
        fv.j jVar2 = (fv.j) this.f32329w;
        this.f32329w = jVar2;
        this.f32328v = 1;
        jVar2.b(view, this);
        return aVar;
    }
}
