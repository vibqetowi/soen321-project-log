package hk;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.os.Handler;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import ik.s;
import java.util.ArrayList;
import wo.v;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements DialogInterface.OnDismissListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17640u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.c f17641v;

    public /* synthetic */ f(androidx.appcompat.app.c cVar, int i6) {
        this.f17640u = i6;
        this.f17641v = cVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ObjectAnimator objectAnimator;
        int i6 = this.f17640u;
        androidx.appcompat.app.c cVar = this.f17641v;
        s sVar = null;
        switch (i6) {
            case 0:
                ExptInitialAssessmentActivity this$0 = (ExptInitialAssessmentActivity) cVar;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                rr.b bVar = this$0.f10587x;
                if (bVar != null) {
                    boolean z10 = bVar instanceof s;
                    if (z10) {
                        if (z10) {
                            sVar = (s) bVar;
                        }
                        if (sVar != null && (objectAnimator = sVar.f20292v) != null) {
                            objectAnimator.resume();
                            return;
                        }
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("currentFragment");
                throw null;
            case 1:
                V2DashboardActivity this$02 = (V2DashboardActivity) cVar;
                int i10 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                ArrayList<Object> arrayList = this$02.f10675w;
                if (arrayList.size() > 0) {
                    arrayList.remove(0);
                }
                new Handler().postDelayed(new dl.e(this$02, 4), 1500L);
                return;
            default:
                ExperimentEditProfileActivity this$03 = (ExperimentEditProfileActivity) cVar;
                int i11 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                v vVar = this$03.f11567w;
                if (vVar != null) {
                    vVar.H.k(this$03);
                    v vVar2 = this$03.f11567w;
                    if (vVar2 != null) {
                        vVar2.G.k(this$03);
                        v vVar3 = this$03.f11567w;
                        if (vVar3 != null) {
                            vVar3.J.k(this$03);
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("editProfileViewModel");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.i.q("editProfileViewModel");
                    throw null;
                }
                kotlin.jvm.internal.i.q("editProfileViewModel");
                throw null;
        }
    }
}
