package fq;

import android.view.View;
import com.theinnerhour.b2b.activity.T8Activity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15789u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ T8Activity f15790v;

    public /* synthetic */ r(T8Activity t8Activity, int i6) {
        this.f15789u = i6;
        this.f15790v = t8Activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f15789u;
        T8Activity act = this.f15790v;
        switch (i6) {
            case 0:
                int i10 = t.f15798x;
                kotlin.jvm.internal.i.g(act, "$act");
                act.B.put("edit_back", Boolean.TRUE);
                act.onBackPressed();
                return;
            case 1:
                int i11 = g0.f15712w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 2:
                int i12 = g0.f15712w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.s0(new i());
                return;
            case 3:
                int i13 = e1.f15699w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.v0().W();
                return;
            case 4:
                int i14 = f1.f15706w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 5:
                int i15 = f1.f15706w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 6:
                int i16 = j1.f15736v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.v0().W();
                return;
            case 7:
                int i17 = j1.f15736v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.v0().W();
                return;
            case 8:
                int i18 = j1.f15736v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.v0().W();
                return;
            case 9:
                int i19 = j1.f15736v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.v0().W();
                return;
            case 10:
                int i20 = j1.f15736v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.v0().W();
                return;
            case 11:
                int i21 = k1.f15749w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            default:
                int i22 = k1.f15749w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
        }
    }
}
