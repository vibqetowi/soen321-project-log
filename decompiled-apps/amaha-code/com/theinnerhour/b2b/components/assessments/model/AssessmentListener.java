package com.theinnerhour.b2b.components.assessments.model;

import com.appsflyer.R;
import kotlin.Metadata;
import rr.b;
/* compiled from: AssessmentListener.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0014\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005H&J&\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000eH&¨\u0006\u0018"}, d2 = {"Lcom/theinnerhour/b2b/components/assessments/model/AssessmentListener;", "", "Lhs/k;", "onAssessmentStarted", "onIntroScreenShown", "", "symptomSlug", "", "score", "onOptionSelected", "Lrr/b;", "customFragment", "goToNextScreen", "screenPosition", "", "isBack", "goToScreen", "onAssessmentCompleted", "toastMsg", "onError", "closeWithPopup", "finish", "showFeedback", "onExit", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface AssessmentListener {

    /* compiled from: AssessmentListener.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void goToNextScreen$default(AssessmentListener assessmentListener, b bVar, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 1) != 0) {
                    bVar = null;
                }
                assessmentListener.goToNextScreen(bVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToNextScreen");
        }

        public static /* synthetic */ void goToScreen$default(AssessmentListener assessmentListener, int i6, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                assessmentListener.goToScreen(i6, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToScreen");
        }

        public static /* synthetic */ void onExit$default(AssessmentListener assessmentListener, boolean z10, boolean z11, boolean z12, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 1) != 0) {
                    z10 = false;
                }
                if ((i6 & 2) != 0) {
                    z11 = false;
                }
                if ((i6 & 4) != 0) {
                    z12 = false;
                }
                assessmentListener.onExit(z10, z11, z12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onExit");
        }
    }

    void goToNextScreen(b bVar);

    void goToScreen(int i6, boolean z10);

    void onAssessmentCompleted();

    void onAssessmentStarted();

    void onError(String str);

    void onExit(boolean z10, boolean z11, boolean z12);

    void onIntroScreenShown();

    void onOptionSelected(String str, int i6);
}
