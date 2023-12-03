package fl;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4Activity;
/* compiled from: NotV4Activity.kt */
/* loaded from: classes2.dex */
public final class s extends BottomSheetBehavior.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotV4Activity f15158a;

    public s(NotV4Activity notV4Activity) {
        this.f15158a = notV4Activity;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void c(int i6, View view) {
        yp.c cVar;
        yp.c cVar2;
        View view2 = null;
        NotV4Activity notV4Activity = this.f15158a;
        if (i6 != 1 && i6 != 3) {
            if (i6 == 4) {
                v.c cVar3 = notV4Activity.F;
                if (cVar3 != null && (cVar2 = (yp.c) cVar3.f34633x) != null) {
                    view2 = cVar2.f38755x;
                }
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        v.c cVar4 = notV4Activity.F;
        if (cVar4 != null && (cVar = (yp.c) cVar4.f34633x) != null) {
            view2 = cVar.f38755x;
        }
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void b(View view) {
    }
}
