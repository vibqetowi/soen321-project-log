package dl;

import android.app.Dialog;
import android.view.Window;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class u1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13114u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13114u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Boolean it = bool;
        kotlin.jvm.internal.i.f(it, "it");
        if (it.booleanValue()) {
            int i6 = V3DashboardActivity.f10714r1;
            V3DashboardActivity v3DashboardActivity = this.f13114u;
            v3DashboardActivity.getClass();
            String str = gk.a.f16573a;
            gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_show");
            Dialog dialog = UiUtils.Companion.getDialog(R.layout.dialog_topical_remove, v3DashboardActivity);
            Window window = dialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.getAttributes().windowAnimations = R.style.DialogGrowInAndSlideOut;
            ((RobertoTextView) dialog.findViewById(R.id.btnTopicalCancel)).setOnClickListener(new k0(dialog, v3DashboardActivity, 3));
            ((RobertoTextView) dialog.findViewById(R.id.btnTopicalPositive)).setOnClickListener(new k0(dialog, v3DashboardActivity, 4));
            dialog.setCancelable(false);
            dialog.show();
        }
        return hs.k.f19476a;
    }
}
