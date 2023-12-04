package com.ifriend.presentation.features.onboarding.steps.view.info;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingInfoState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JY\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\""}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/info/OnboardingInfoState;", "", "titleLabel", "", "subtitleLabel", "isSubtitleVisible", "", "descriptionLabel", "isDescriptionVisible", "buttonLabel", "isButtonActive", "buttonDescriptionLabel", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)V", "getButtonDescriptionLabel", "()Ljava/lang/String;", "getButtonLabel", "getDescriptionLabel", "()Z", "getSubtitleLabel", "getTitleLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingInfoState {
    public static final int $stable = 0;
    private final String buttonDescriptionLabel;
    private final String buttonLabel;
    private final String descriptionLabel;
    private final boolean isButtonActive;
    private final boolean isDescriptionVisible;
    private final boolean isSubtitleVisible;
    private final String subtitleLabel;
    private final String titleLabel;

    public OnboardingInfoState() {
        this(null, null, false, null, false, null, false, null, 255, null);
    }

    public final String component1() {
        return this.titleLabel;
    }

    public final String component2() {
        return this.subtitleLabel;
    }

    public final boolean component3() {
        return this.isSubtitleVisible;
    }

    public final String component4() {
        return this.descriptionLabel;
    }

    public final boolean component5() {
        return this.isDescriptionVisible;
    }

    public final String component6() {
        return this.buttonLabel;
    }

    public final boolean component7() {
        return this.isButtonActive;
    }

    public final String component8() {
        return this.buttonDescriptionLabel;
    }

    public final OnboardingInfoState copy(String titleLabel, String subtitleLabel, boolean z, String descriptionLabel, boolean z2, String buttonLabel, boolean z3, String buttonDescriptionLabel) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(subtitleLabel, "subtitleLabel");
        Intrinsics.checkNotNullParameter(descriptionLabel, "descriptionLabel");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        Intrinsics.checkNotNullParameter(buttonDescriptionLabel, "buttonDescriptionLabel");
        return new OnboardingInfoState(titleLabel, subtitleLabel, z, descriptionLabel, z2, buttonLabel, z3, buttonDescriptionLabel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingInfoState) {
            OnboardingInfoState onboardingInfoState = (OnboardingInfoState) obj;
            return Intrinsics.areEqual(this.titleLabel, onboardingInfoState.titleLabel) && Intrinsics.areEqual(this.subtitleLabel, onboardingInfoState.subtitleLabel) && this.isSubtitleVisible == onboardingInfoState.isSubtitleVisible && Intrinsics.areEqual(this.descriptionLabel, onboardingInfoState.descriptionLabel) && this.isDescriptionVisible == onboardingInfoState.isDescriptionVisible && Intrinsics.areEqual(this.buttonLabel, onboardingInfoState.buttonLabel) && this.isButtonActive == onboardingInfoState.isButtonActive && Intrinsics.areEqual(this.buttonDescriptionLabel, onboardingInfoState.buttonDescriptionLabel);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.titleLabel.hashCode() * 31) + this.subtitleLabel.hashCode()) * 31;
        boolean z = this.isSubtitleVisible;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.descriptionLabel.hashCode()) * 31;
        boolean z2 = this.isDescriptionVisible;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int hashCode3 = (((hashCode2 + i2) * 31) + this.buttonLabel.hashCode()) * 31;
        boolean z3 = this.isButtonActive;
        return ((hashCode3 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + this.buttonDescriptionLabel.hashCode();
    }

    public String toString() {
        String str = this.titleLabel;
        String str2 = this.subtitleLabel;
        boolean z = this.isSubtitleVisible;
        String str3 = this.descriptionLabel;
        boolean z2 = this.isDescriptionVisible;
        String str4 = this.buttonLabel;
        boolean z3 = this.isButtonActive;
        String str5 = this.buttonDescriptionLabel;
        return "OnboardingInfoState(titleLabel=" + str + ", subtitleLabel=" + str2 + ", isSubtitleVisible=" + z + ", descriptionLabel=" + str3 + ", isDescriptionVisible=" + z2 + ", buttonLabel=" + str4 + ", isButtonActive=" + z3 + ", buttonDescriptionLabel=" + str5 + ")";
    }

    public OnboardingInfoState(String titleLabel, String subtitleLabel, boolean z, String descriptionLabel, boolean z2, String buttonLabel, boolean z3, String buttonDescriptionLabel) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(subtitleLabel, "subtitleLabel");
        Intrinsics.checkNotNullParameter(descriptionLabel, "descriptionLabel");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        Intrinsics.checkNotNullParameter(buttonDescriptionLabel, "buttonDescriptionLabel");
        this.titleLabel = titleLabel;
        this.subtitleLabel = subtitleLabel;
        this.isSubtitleVisible = z;
        this.descriptionLabel = descriptionLabel;
        this.isDescriptionVisible = z2;
        this.buttonLabel = buttonLabel;
        this.isButtonActive = z3;
        this.buttonDescriptionLabel = buttonDescriptionLabel;
    }

    public /* synthetic */ OnboardingInfoState(String str, String str2, boolean z, String str3, boolean z2, String str4, boolean z3, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? "" : str4, (i & 64) == 0 ? z3 : false, (i & 128) == 0 ? str5 : "");
    }

    public final String getTitleLabel() {
        return this.titleLabel;
    }

    public final String getSubtitleLabel() {
        return this.subtitleLabel;
    }

    public final boolean isSubtitleVisible() {
        return this.isSubtitleVisible;
    }

    public final String getDescriptionLabel() {
        return this.descriptionLabel;
    }

    public final boolean isDescriptionVisible() {
        return this.isDescriptionVisible;
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final boolean isButtonActive() {
        return this.isButtonActive;
    }

    public final String getButtonDescriptionLabel() {
        return this.buttonDescriptionLabel;
    }
}
