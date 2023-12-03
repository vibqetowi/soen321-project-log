package cn;

import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
/* compiled from: LibraryViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchTopicalCourses$1", f = "LibraryViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class w0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k0 f5821u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(k0 k0Var, ls.d<? super w0> dVar) {
        super(2, dVar);
        this.f5821u = k0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new w0(this.f5821u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((w0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        sp.b.d0(obj);
        ArrayList<MiniCourse> topicalCourseList = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
        if (topicalCourseList != null && !topicalCourseList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        k0 k0Var = this.f5821u;
        if (z10) {
            k0Var.N.l(new ArrayList());
            k0Var.O.l(new ArrayList());
            k0Var.H.l(Boolean.FALSE);
        } else {
            k0Var.getClass();
            try {
                ta.v.H(kc.f.H(k0Var), null, 0, new v0(k0Var, null), 3);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(k0Var.f5596y, e10);
            }
        }
        return hs.k.f19476a;
    }
}
