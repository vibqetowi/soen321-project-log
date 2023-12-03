package fq;

import android.view.View;
import com.theinnerhour.b2b.activity.T5Activity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g1 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15715u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ T5Activity f15716v;

    public /* synthetic */ g1(T5Activity t5Activity, int i6) {
        this.f15715u = i6;
        this.f15716v = t5Activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f15715u;
        T5Activity act = this.f15716v;
        switch (i6) {
            case 0:
                int i10 = h1.f15721v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.v0().W();
                return;
            case 1:
                int i11 = h1.f15721v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.v0().W();
                return;
            case 2:
                int i12 = h1.f15721v;
                kotlin.jvm.internal.i.g(act, "$act");
                act.v0().W();
                return;
            case 3:
                int i13 = i1.f15729w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
            default:
                int i14 = i1.f15729w;
                kotlin.jvm.internal.i.g(act, "$act");
                act.onBackPressed();
                return;
        }
    }
}
