package hr;

import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
/* compiled from: ScreenS122Fragment.kt */
/* loaded from: classes2.dex */
public final class b5 extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TemplateActivity f18201u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c5 f18202v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f18203w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(TemplateActivity templateActivity, c5 c5Var, String str) {
        super(1);
        this.f18201u = templateActivity;
        this.f18202v = c5Var;
        this.f18203w = str;
    }

    @Override // ss.l
    public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
        hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
        TemplateActivity templateActivity = this.f18201u;
        if (fVar2 != null) {
            boolean z10 = templateActivity.K;
            String str = this.f18203w;
            c5 c5Var = this.f18202v;
            if (z10) {
                int i6 = c5.C;
                fm.a K = c5Var.K();
                K.f15174h0.e(c5Var.getViewLifecycleOwner(), new r3(13, new z4(templateActivity)));
                K.j(c5Var.f18237y, str);
            } else {
                templateActivity.K = true;
                int i10 = c5.C;
                fm.a K2 = c5Var.K();
                K2.f15177k0.e(c5Var.getViewLifecycleOwner(), new r3(14, new a5(templateActivity)));
                K2.h(c5Var.f18237y, str);
            }
        } else {
            templateActivity.s0(new w5());
        }
        return hs.k.f19476a;
    }
}
