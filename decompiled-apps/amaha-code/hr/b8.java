package hr;

import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b8 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18207u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TemplateActivity f18208v;

    public /* synthetic */ b8(TemplateActivity templateActivity, int i6) {
        this.f18207u = i6;
        this.f18208v = templateActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18207u;
        TemplateActivity act = this.f18208v;
        switch (i6) {
            case 0:
                int i10 = c8.f18261w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 1:
                int i11 = j8.A;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 2:
                int i12 = w8.f19358y;
                kotlin.jvm.internal.i.g(act, "$act");
                act.getOnBackPressedDispatcher().b();
                return;
            case 3:
                int i13 = y8.f19422w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 4:
                int i14 = z8.f19454w;
                kotlin.jvm.internal.i.g(act, "$act");
                if (act.getIntent().hasExtra("source") && r1.b0.c(act, "source", "goals")) {
                    act.n0();
                    return;
                } else {
                    act.t0();
                    return;
                }
            case 5:
                int i15 = z8.f19454w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 6:
                int i16 = b9.f18209w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 7:
                int i17 = g9.f18473w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 8:
                int i18 = g9.f18473w;
                kotlin.jvm.internal.i.g(act, "$act");
                if (act.getIntent().hasExtra("source") && r1.b0.c(act, "source", "goals")) {
                    act.n0();
                    return;
                } else {
                    act.t0();
                    return;
                }
            case 9:
                int i19 = i9.f18591w;
                kotlin.jvm.internal.i.g(act, "$act");
                if (kotlin.jvm.internal.i.b(act.B0(), "s117")) {
                    act.s0(new p6());
                    return;
                } else {
                    act.t0();
                    return;
                }
            case 10:
                int i20 = i9.f18591w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 11:
                int i21 = q9.f19040z;
                kotlin.jvm.internal.i.g(act, "$act");
                act.getOnBackPressedDispatcher().b();
                return;
            case 12:
                int i22 = u9.f19255w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 13:
                int i23 = w9.f19364v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 14:
                int i24 = ba.f18212w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 15:
                int i25 = ca.f18266w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 16:
                int i26 = ea.f18352w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            default:
                int i27 = ga.f18476x;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
        }
    }
}
