package com.ifriend.presentation.features.onboarding.steps.view.grid;

import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonWithImageUiParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: OnboardingGridState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/grid/OnboardingGridState;", "", "titleLabel", "", "buttons", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonWithImageUiParams;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getButtons", "()Lkotlinx/collections/immutable/ImmutableList;", "getTitleLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingGridState {
    public static final int $stable = 0;
    private final ImmutableList<SelectButtonWithImageUiParams> buttons;
    private final String titleLabel;

    public OnboardingGridState() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingGridState copy$default(OnboardingGridState onboardingGridState, String str, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingGridState.titleLabel;
        }
        if ((i & 2) != 0) {
            immutableList = onboardingGridState.buttons;
        }
        return onboardingGridState.copy(str, immutableList);
    }

    public final String component1() {
        return this.titleLabel;
    }

    public final ImmutableList<SelectButtonWithImageUiParams> component2() {
        return this.buttons;
    }

    public final OnboardingGridState copy(String titleLabel, ImmutableList<SelectButtonWithImageUiParams> buttons) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new OnboardingGridState(titleLabel, buttons);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingGridState) {
            OnboardingGridState onboardingGridState = (OnboardingGridState) obj;
            return Intrinsics.areEqual(this.titleLabel, onboardingGridState.titleLabel) && Intrinsics.areEqual(this.buttons, onboardingGridState.buttons);
        }
        return false;
    }

    public int hashCode() {
        return (this.titleLabel.hashCode() * 31) + this.buttons.hashCode();
    }

    public String toString() {
        String str = this.titleLabel;
        ImmutableList<SelectButtonWithImageUiParams> immutableList = this.buttons;
        return "OnboardingGridState(titleLabel=" + str + ", buttons=" + immutableList + ")";
    }

    public OnboardingGridState(String titleLabel, ImmutableList<SelectButtonWithImageUiParams> buttons) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.titleLabel = titleLabel;
        this.buttons = buttons;
    }

    public final String getTitleLabel() {
        return this.titleLabel;
    }

    public /* synthetic */ OnboardingGridState(String str, PersistentList persistentList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ExtensionsKt.persistentListOf() : persistentList);
    }

    public final ImmutableList<SelectButtonWithImageUiParams> getButtons() {
        return this.buttons;
    }
}
