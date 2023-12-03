package fq;

import android.view.View;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15761u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ rr.a f15762v;

    public /* synthetic */ m0(rr.a aVar, int i6) {
        this.f15761u = i6;
        this.f15762v = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f15761u;
        rr.a act = this.f15762v;
        switch (i6) {
            case 0:
                int i10 = n0.f15767v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.o0();
                return;
            case 1:
                int i11 = o0.f15772x;
                kotlin.jvm.internal.i.g(act, "$act");
                act.o0();
                return;
            case 2:
                int i12 = b1.f15669w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.t0();
                return;
            case 3:
                int i13 = b1.f15669w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            case 4:
                int i14 = c1.f15676w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.t0();
                return;
            default:
                int i15 = c1.f15676w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
        }
    }
}
