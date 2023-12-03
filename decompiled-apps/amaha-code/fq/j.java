package fq;

import android.view.View;
import com.theinnerhour.b2b.activity.T1Activity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15732u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ T1Activity f15733v;

    public /* synthetic */ j(T1Activity t1Activity, int i6) {
        this.f15732u = i6;
        this.f15733v = t1Activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f15732u;
        T1Activity act = this.f15733v;
        switch (i6) {
            case 0:
                int i10 = k.f15738z;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 1:
                int i11 = n.f15763w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 2:
                int i12 = n.f15763w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.t0();
                return;
            case 3:
                int i13 = n.f15763w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.o0();
                return;
            case 4:
                int i14 = u.f15804v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                act.onBackPressed();
                act.onBackPressed();
                return;
            case 5:
                int i15 = u.f15804v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 6:
                int i16 = v.f15807w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 7:
                int i17 = v.f15807w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.t0();
                return;
            default:
                int i18 = v.f15807w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.o0();
                return;
        }
    }
}
