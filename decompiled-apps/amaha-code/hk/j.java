package hk;

import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import java.util.ArrayList;
/* compiled from: ExptInitialAssessmentActivity.kt */
/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.k implements ss.l<ArrayList<TherapistPackagesModel>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExptInitialAssessmentActivity f17647u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ExptInitialAssessmentActivity exptInitialAssessmentActivity) {
        super(1);
        this.f17647u = exptInitialAssessmentActivity;
    }

    @Override // ss.l
    public final hs.k invoke(ArrayList<TherapistPackagesModel> arrayList) {
        boolean z10;
        ArrayList<TherapistPackagesModel> arrayList2 = arrayList;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f17647u.Z = arrayList2;
        }
        return hs.k.f19476a;
    }
}
