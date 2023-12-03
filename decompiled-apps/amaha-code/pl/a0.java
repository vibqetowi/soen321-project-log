package pl;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N1ScreenFragment;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28545a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.f f28546b;

    public /* synthetic */ a0(com.google.android.material.bottomsheet.f fVar, int i6) {
        this.f28545a = i6;
        this.f28546b = fVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i6 = this.f28545a;
        com.google.android.material.bottomsheet.f fVar = this.f28546b;
        switch (i6) {
            case 0:
                N1ScreenFragment.a this$0 = (N1ScreenFragment.a) fVar;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                View findViewById = ((com.google.android.material.bottomsheet.e) dialogInterface).findViewById(R.id.design_bottom_sheet);
                kotlin.jvm.internal.i.d(findViewById);
                BottomSheetBehavior from = BottomSheetBehavior.from(findViewById);
                kotlin.jvm.internal.i.f(from, "from(bottomSheet!!)");
                from.setState(3);
                from.setSkipCollapsed(true);
                findViewById.setFitsSystemWindows(true);
                findViewById.setBackgroundColor(0);
                Dialog dialog = this$0.getDialog();
                kotlin.jvm.internal.i.d(dialog);
                Window window = dialog.getWindow();
                kotlin.jvm.internal.i.d(window);
                window.setGravity(80);
                com.google.android.material.bottomsheet.e eVar = this$0.f11024w;
                if (eVar != null) {
                    Window window2 = eVar.getWindow();
                    if (window2 != null) {
                        window2.setLayout(-1, -1);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("dialog");
                throw null;
            default:
                NotificationPermissionBottomSheet.onCreateDialog$lambda$1((NotificationPermissionBottomSheet) fVar, dialogInterface);
                return;
        }
    }
}
