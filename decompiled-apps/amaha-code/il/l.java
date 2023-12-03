package il;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20372a;

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        com.google.android.material.bottomsheet.e eVar;
        KeyEvent.Callback callback;
        switch (this.f20372a) {
            case 0:
                FrameLayout frameLayout = null;
                if (dialogInterface instanceof com.google.android.material.bottomsheet.e) {
                    eVar = (com.google.android.material.bottomsheet.e) dialogInterface;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    callback = eVar.findViewById(R.id.design_bottom_sheet);
                } else {
                    callback = null;
                }
                if (callback instanceof FrameLayout) {
                    frameLayout = (FrameLayout) callback;
                }
                if (frameLayout != null) {
                    BottomSheetBehavior.from(frameLayout).setState(3);
                    return;
                }
                return;
            case 1:
                int i6 = jn.a.f22475x;
                kotlin.jvm.internal.i.e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                FrameLayout frameLayout2 = (FrameLayout) ((com.google.android.material.bottomsheet.e) dialogInterface).findViewById(R.id.design_bottom_sheet);
                kotlin.jvm.internal.i.d(frameLayout2);
                BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout2);
                kotlin.jvm.internal.i.f(from, "from(bottomSheet!!)");
                from.setState(3);
                return;
            default:
                int i10 = wp.a.f37019y;
                kotlin.jvm.internal.i.e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                FrameLayout frameLayout3 = (FrameLayout) ((com.google.android.material.bottomsheet.e) dialogInterface).findViewById(R.id.design_bottom_sheet);
                kotlin.jvm.internal.i.d(frameLayout3);
                BottomSheetBehavior from2 = BottomSheetBehavior.from(frameLayout3);
                kotlin.jvm.internal.i.f(from2, "from(bottomSheet!!)");
                from2.setState(3);
                return;
        }
    }
}
