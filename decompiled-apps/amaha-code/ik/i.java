package ik;

import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.TimerTask;
/* compiled from: ExptInitialAssessmentA3VarBTeleConsultationFragment.kt */
/* loaded from: classes2.dex */
public final class i extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f20197u;

    public i(k kVar) {
        this.f20197u = kVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ExptInitialAssessmentActivity exptInitialAssessmentActivity;
        boolean z10;
        RecyclerView recyclerView;
        k kVar = this.f20197u;
        try {
            if (kVar.isAdded()) {
                androidx.fragment.app.p requireActivity = kVar.requireActivity();
                if (requireActivity instanceof ExptInitialAssessmentActivity) {
                    exptInitialAssessmentActivity = (ExptInitialAssessmentActivity) requireActivity;
                } else {
                    exptInitialAssessmentActivity = null;
                }
                if (exptInitialAssessmentActivity != null) {
                    z10 = true;
                    if (exptInitialAssessmentActivity.Y) {
                        if (!z10 && (recyclerView = (RecyclerView) kVar._$_findCachedViewById(R.id.rvCsaA3OfferingSelfCare)) != null) {
                            recyclerView.j0(700, 0);
                            return;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(kVar.f20214u, e10);
        }
    }
}
