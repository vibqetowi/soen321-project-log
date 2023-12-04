package com.ifriend.presentation.features.onboarding.steps.view.wheel;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingWheelState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006#"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/wheel/OnboardingWheelState;", "", "titleLabel", "", "subtitleLabel", FirebaseAnalytics.Param.ITEMS, "", "selectedIndex", "", "buttonInfoLabel", "buttonLabel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "getButtonInfoLabel", "()Ljava/lang/String;", "getButtonLabel", "getItems", "()Ljava/util/List;", "getSelectedIndex", "()I", "selectedItem", "getSelectedItem", "getSubtitleLabel", "getTitleLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingWheelState {
    public static final int $stable = 8;
    private final String buttonInfoLabel;
    private final String buttonLabel;
    private final List<String> items;
    private final int selectedIndex;
    private final String subtitleLabel;
    private final String titleLabel;

    public OnboardingWheelState() {
        this(null, null, null, 0, null, null, 63, null);
    }

    public static /* synthetic */ OnboardingWheelState copy$default(OnboardingWheelState onboardingWheelState, String str, String str2, List list, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = onboardingWheelState.titleLabel;
        }
        if ((i2 & 2) != 0) {
            str2 = onboardingWheelState.subtitleLabel;
        }
        String str5 = str2;
        List<String> list2 = list;
        if ((i2 & 4) != 0) {
            list2 = onboardingWheelState.items;
        }
        List list3 = list2;
        if ((i2 & 8) != 0) {
            i = onboardingWheelState.selectedIndex;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = onboardingWheelState.buttonInfoLabel;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = onboardingWheelState.buttonLabel;
        }
        return onboardingWheelState.copy(str, str5, list3, i3, str6, str4);
    }

    public final String component1() {
        return this.titleLabel;
    }

    public final String component2() {
        return this.subtitleLabel;
    }

    public final List<String> component3() {
        return this.items;
    }

    public final int component4() {
        return this.selectedIndex;
    }

    public final String component5() {
        return this.buttonInfoLabel;
    }

    public final String component6() {
        return this.buttonLabel;
    }

    public final OnboardingWheelState copy(String titleLabel, String subtitleLabel, List<String> items, int i, String buttonInfoLabel, String buttonLabel) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(subtitleLabel, "subtitleLabel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonInfoLabel, "buttonInfoLabel");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        return new OnboardingWheelState(titleLabel, subtitleLabel, items, i, buttonInfoLabel, buttonLabel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingWheelState) {
            OnboardingWheelState onboardingWheelState = (OnboardingWheelState) obj;
            return Intrinsics.areEqual(this.titleLabel, onboardingWheelState.titleLabel) && Intrinsics.areEqual(this.subtitleLabel, onboardingWheelState.subtitleLabel) && Intrinsics.areEqual(this.items, onboardingWheelState.items) && this.selectedIndex == onboardingWheelState.selectedIndex && Intrinsics.areEqual(this.buttonInfoLabel, onboardingWheelState.buttonInfoLabel) && Intrinsics.areEqual(this.buttonLabel, onboardingWheelState.buttonLabel);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.titleLabel.hashCode() * 31) + this.subtitleLabel.hashCode()) * 31) + this.items.hashCode()) * 31) + this.selectedIndex) * 31) + this.buttonInfoLabel.hashCode()) * 31) + this.buttonLabel.hashCode();
    }

    public String toString() {
        String str = this.titleLabel;
        String str2 = this.subtitleLabel;
        List<String> list = this.items;
        int i = this.selectedIndex;
        String str3 = this.buttonInfoLabel;
        String str4 = this.buttonLabel;
        return "OnboardingWheelState(titleLabel=" + str + ", subtitleLabel=" + str2 + ", items=" + list + ", selectedIndex=" + i + ", buttonInfoLabel=" + str3 + ", buttonLabel=" + str4 + ")";
    }

    public OnboardingWheelState(String titleLabel, String subtitleLabel, List<String> items, int i, String buttonInfoLabel, String buttonLabel) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(subtitleLabel, "subtitleLabel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonInfoLabel, "buttonInfoLabel");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.titleLabel = titleLabel;
        this.subtitleLabel = subtitleLabel;
        this.items = items;
        this.selectedIndex = i;
        this.buttonInfoLabel = buttonInfoLabel;
        this.buttonLabel = buttonLabel;
    }

    public final String getTitleLabel() {
        return this.titleLabel;
    }

    public final String getSubtitleLabel() {
        return this.subtitleLabel;
    }

    public /* synthetic */ OnboardingWheelState(String str, String str2, List list, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4);
    }

    public final List<String> getItems() {
        return this.items;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final String getButtonInfoLabel() {
        return this.buttonInfoLabel;
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final String getSelectedItem() {
        return (String) CollectionsKt.getOrNull(this.items, this.selectedIndex);
    }
}
