package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.Course;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: UserOnboardingModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/ExpertCareMatchingCourseModel;", "Lcom/theinnerhour/b2b/model/Course;", "matchingResponse", "Lcom/theinnerhour/b2b/components/onboarding/model/MatchingFlowUserResponseModel;", "(Lcom/theinnerhour/b2b/components/onboarding/model/MatchingFlowUserResponseModel;)V", "getMatchingResponse", "()Lcom/theinnerhour/b2b/components/onboarding/model/MatchingFlowUserResponseModel;", "setMatchingResponse", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ExpertCareMatchingCourseModel extends Course {
    private MatchingFlowUserResponseModel matchingResponse;

    public ExpertCareMatchingCourseModel() {
        this(null, 1, null);
    }

    public static /* synthetic */ ExpertCareMatchingCourseModel copy$default(ExpertCareMatchingCourseModel expertCareMatchingCourseModel, MatchingFlowUserResponseModel matchingFlowUserResponseModel, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            matchingFlowUserResponseModel = expertCareMatchingCourseModel.matchingResponse;
        }
        return expertCareMatchingCourseModel.copy(matchingFlowUserResponseModel);
    }

    public final MatchingFlowUserResponseModel component1() {
        return this.matchingResponse;
    }

    public final ExpertCareMatchingCourseModel copy(MatchingFlowUserResponseModel matchingFlowUserResponseModel) {
        return new ExpertCareMatchingCourseModel(matchingFlowUserResponseModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ExpertCareMatchingCourseModel) && i.b(this.matchingResponse, ((ExpertCareMatchingCourseModel) obj).matchingResponse)) {
            return true;
        }
        return false;
    }

    public final MatchingFlowUserResponseModel getMatchingResponse() {
        return this.matchingResponse;
    }

    public int hashCode() {
        MatchingFlowUserResponseModel matchingFlowUserResponseModel = this.matchingResponse;
        if (matchingFlowUserResponseModel == null) {
            return 0;
        }
        return matchingFlowUserResponseModel.hashCode();
    }

    public final void setMatchingResponse(MatchingFlowUserResponseModel matchingFlowUserResponseModel) {
        this.matchingResponse = matchingFlowUserResponseModel;
    }

    public String toString() {
        return "ExpertCareMatchingCourseModel(matchingResponse=" + this.matchingResponse + ')';
    }

    public ExpertCareMatchingCourseModel(MatchingFlowUserResponseModel matchingFlowUserResponseModel) {
        this.matchingResponse = matchingFlowUserResponseModel;
    }

    public /* synthetic */ ExpertCareMatchingCourseModel(MatchingFlowUserResponseModel matchingFlowUserResponseModel, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : matchingFlowUserResponseModel);
    }
}
