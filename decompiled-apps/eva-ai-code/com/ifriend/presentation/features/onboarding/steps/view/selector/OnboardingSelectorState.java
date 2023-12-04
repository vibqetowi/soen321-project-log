package com.ifriend.presentation.features.onboarding.steps.view.selector;

import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonUiParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: OnboardingSelectorState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/selector/OnboardingSelectorState;", "", "titleLabel", "", "options", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "getTitleLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingSelectorState {
    public static final int $stable = 0;
    private final ImmutableList<SelectButtonUiParams> options;
    private final String titleLabel;

    public OnboardingSelectorState() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingSelectorState copy$default(OnboardingSelectorState onboardingSelectorState, String str, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingSelectorState.titleLabel;
        }
        if ((i & 2) != 0) {
            immutableList = onboardingSelectorState.options;
        }
        return onboardingSelectorState.copy(str, immutableList);
    }

    public final String component1() {
        return this.titleLabel;
    }

    public final ImmutableList<SelectButtonUiParams> component2() {
        return this.options;
    }

    public final OnboardingSelectorState copy(String titleLabel, ImmutableList<SelectButtonUiParams> options) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(options, "options");
        return new OnboardingSelectorState(titleLabel, options);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingSelectorState) {
            OnboardingSelectorState onboardingSelectorState = (OnboardingSelectorState) obj;
            return Intrinsics.areEqual(this.titleLabel, onboardingSelectorState.titleLabel) && Intrinsics.areEqual(this.options, onboardingSelectorState.options);
        }
        return false;
    }

    public int hashCode() {
        return (this.titleLabel.hashCode() * 31) + this.options.hashCode();
    }

    public String toString() {
        String str = this.titleLabel;
        ImmutableList<SelectButtonUiParams> immutableList = this.options;
        return "OnboardingSelectorState(titleLabel=" + str + ", options=" + immutableList + ")";
    }

    public OnboardingSelectorState(String titleLabel, ImmutableList<SelectButtonUiParams> options) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(options, "options");
        this.titleLabel = titleLabel;
        this.options = options;
    }

    public final String getTitleLabel() {
        return this.titleLabel;
    }

    public /* synthetic */ OnboardingSelectorState(String str, PersistentList persistentList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ExtensionsKt.persistentListOf() : persistentList);
    }

    public final ImmutableList<SelectButtonUiParams> getOptions() {
        return this.options;
    }
}
