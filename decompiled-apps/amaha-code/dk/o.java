package dk;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
/* compiled from: MiniCourseActivity.kt */
/* loaded from: classes2.dex */
public final class o extends BottomSheetBehavior.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MiniCourseActivity f12941a;

    public o(MiniCourseActivity miniCourseActivity) {
        this.f12941a = miniCourseActivity;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void c(int i6, View view) {
        View v02;
        MiniCourseActivity miniCourseActivity = this.f12941a;
        if (i6 != 1 && i6 != 3) {
            if (i6 == 4 && (v02 = miniCourseActivity.v0(R.id.viewMiniCourseActivityBlanketForeground)) != null) {
                v02.setVisibility(8);
                return;
            }
            return;
        }
        View v03 = miniCourseActivity.v0(R.id.viewMiniCourseActivityBlanketForeground);
        if (v03 != null) {
            v03.setVisibility(0);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void b(View view) {
    }
}
