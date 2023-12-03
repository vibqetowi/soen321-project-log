package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import kotlin.Metadata;
/* compiled from: CoachModelInfo.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/model/CoachModelInfo;", "", "()V", "assessmentDone", "", "getAssessmentDone", "()Z", "setAssessmentDone", "(Z)V", "consentGiven", "getConsentGiven", "setConsentGiven", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CoachModelInfo {
    private boolean assessmentDone;
    private boolean consentGiven;

    public final boolean getAssessmentDone() {
        return this.assessmentDone;
    }

    public final boolean getConsentGiven() {
        return this.consentGiven;
    }

    public final void setAssessmentDone(boolean z10) {
        this.assessmentDone = z10;
    }

    public final void setConsentGiven(boolean z10) {
        this.consentGiven = z10;
    }
}
