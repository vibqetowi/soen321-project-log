package zk;

import android.view.View;
import androidx.fragment.app.p;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f39429u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f39430v;

    public /* synthetic */ e(p pVar, int i6) {
        this.f39429u = i6;
        this.f39430v = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f39429u;
        p activity = this.f39430v;
        switch (i6) {
            case 0:
                int i10 = g.f39434z;
                kotlin.jvm.internal.i.g(activity, "$activity");
                activity.onBackPressed();
                return;
            default:
                int i11 = j.D;
                kotlin.jvm.internal.i.g(activity, "$activity");
                activity.onBackPressed();
                return;
        }
    }
}
