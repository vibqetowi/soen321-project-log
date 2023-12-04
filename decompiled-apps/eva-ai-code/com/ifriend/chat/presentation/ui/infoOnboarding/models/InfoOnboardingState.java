package com.ifriend.chat.presentation.ui.infoOnboarding.models;

import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import com.ifriend.ui.base.mvvm.BaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InfoOnboardingState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/chat/presentation/ui/infoOnboarding/models/InfoOnboardingState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "slide", "Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;", "(Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;)V", "getSlide", "()Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoOnboardingState extends BaseState {
    public static final int $stable = 8;
    private final InfoOnboardingSlide slide;

    public static /* synthetic */ InfoOnboardingState copy$default(InfoOnboardingState infoOnboardingState, InfoOnboardingSlide infoOnboardingSlide, int i, Object obj) {
        if ((i & 1) != 0) {
            infoOnboardingSlide = infoOnboardingState.slide;
        }
        return infoOnboardingState.copy(infoOnboardingSlide);
    }

    public final InfoOnboardingSlide component1() {
        return this.slide;
    }

    public final InfoOnboardingState copy(InfoOnboardingSlide slide) {
        Intrinsics.checkNotNullParameter(slide, "slide");
        return new InfoOnboardingState(slide);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InfoOnboardingState) && Intrinsics.areEqual(this.slide, ((InfoOnboardingState) obj).slide);
    }

    public int hashCode() {
        return this.slide.hashCode();
    }

    public String toString() {
        InfoOnboardingSlide infoOnboardingSlide = this.slide;
        return "InfoOnboardingState(slide=" + infoOnboardingSlide + ")";
    }

    public final InfoOnboardingSlide getSlide() {
        return this.slide;
    }

    public InfoOnboardingState(InfoOnboardingSlide slide) {
        Intrinsics.checkNotNullParameter(slide, "slide");
        this.slide = slide;
    }
}
