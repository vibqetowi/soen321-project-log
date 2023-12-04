package com.ifriend.presentation.features.onboarding.steps.view.chip;

import com.ifriend.presentation.features.onboarding.steps.view.common.ChipSelectButtonUiParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: OnboardingChipState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/chip/OnboardingChipState;", "", "titleLabel", "", "chips", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/ChipSelectButtonUiParams;", "buttonLabel", "isButtonEnabled", "", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Z)V", "getButtonLabel", "()Ljava/lang/String;", "getChips", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "getTitleLabel", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingChipState {
    public static final int $stable = 0;
    private final String buttonLabel;
    private final ImmutableList<ChipSelectButtonUiParams> chips;
    private final boolean isButtonEnabled;
    private final String titleLabel;

    public OnboardingChipState() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingChipState copy$default(OnboardingChipState onboardingChipState, String str, ImmutableList immutableList, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingChipState.titleLabel;
        }
        if ((i & 2) != 0) {
            immutableList = onboardingChipState.chips;
        }
        if ((i & 4) != 0) {
            str2 = onboardingChipState.buttonLabel;
        }
        if ((i & 8) != 0) {
            z = onboardingChipState.isButtonEnabled;
        }
        return onboardingChipState.copy(str, immutableList, str2, z);
    }

    public final String component1() {
        return this.titleLabel;
    }

    public final ImmutableList<ChipSelectButtonUiParams> component2() {
        return this.chips;
    }

    public final String component3() {
        return this.buttonLabel;
    }

    public final boolean component4() {
        return this.isButtonEnabled;
    }

    public final OnboardingChipState copy(String titleLabel, ImmutableList<ChipSelectButtonUiParams> chips, String buttonLabel, boolean z) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(chips, "chips");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        return new OnboardingChipState(titleLabel, chips, buttonLabel, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingChipState) {
            OnboardingChipState onboardingChipState = (OnboardingChipState) obj;
            return Intrinsics.areEqual(this.titleLabel, onboardingChipState.titleLabel) && Intrinsics.areEqual(this.chips, onboardingChipState.chips) && Intrinsics.areEqual(this.buttonLabel, onboardingChipState.buttonLabel) && this.isButtonEnabled == onboardingChipState.isButtonEnabled;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.titleLabel.hashCode() * 31) + this.chips.hashCode()) * 31) + this.buttonLabel.hashCode()) * 31;
        boolean z = this.isButtonEnabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.titleLabel;
        ImmutableList<ChipSelectButtonUiParams> immutableList = this.chips;
        String str2 = this.buttonLabel;
        boolean z = this.isButtonEnabled;
        return "OnboardingChipState(titleLabel=" + str + ", chips=" + immutableList + ", buttonLabel=" + str2 + ", isButtonEnabled=" + z + ")";
    }

    public OnboardingChipState(String titleLabel, ImmutableList<ChipSelectButtonUiParams> chips, String buttonLabel, boolean z) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(chips, "chips");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.titleLabel = titleLabel;
        this.chips = chips;
        this.buttonLabel = buttonLabel;
        this.isButtonEnabled = z;
    }

    public final String getTitleLabel() {
        return this.titleLabel;
    }

    public /* synthetic */ OnboardingChipState(String str, PersistentList persistentList, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ExtensionsKt.persistentListOf() : persistentList, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
    }

    public final ImmutableList<ChipSelectButtonUiParams> getChips() {
        return this.chips;
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final boolean isButtonEnabled() {
        return this.isButtonEnabled;
    }
}
