package dl;

import android.app.Dialog;
import androidx.core.widget.NestedScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12993u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f12994v;

    public /* synthetic */ d(Dialog dialog, int i6) {
        this.f12993u = i6;
        this.f12994v = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f12993u;
        Dialog dialog = this.f12994v;
        switch (i6) {
            case 0:
                int i10 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 1:
                int i11 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 2:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 3:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            default:
                int i12 = nn.g1.B;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                NestedScrollView nestedScrollView = (NestedScrollView) dialog.findViewById(R.id.parentScrollView);
                if (nestedScrollView != null) {
                    nestedScrollView.fullScroll(130);
                    return;
                }
                return;
        }
    }
}
