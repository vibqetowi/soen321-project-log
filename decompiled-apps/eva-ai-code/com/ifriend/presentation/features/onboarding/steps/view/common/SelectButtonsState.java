package com.ifriend.presentation.features.onboarding.steps.view.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingButtonComponents.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonsState;", "", "title", "", "buttons", "", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams;", "(Ljava/lang/String;Ljava/util/List;)V", "getButtons", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectButtonsState {
    public static final int $stable = 8;
    private final List<SelectButtonUiParams> buttons;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectButtonsState copy$default(SelectButtonsState selectButtonsState, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectButtonsState.title;
        }
        if ((i & 2) != 0) {
            list = selectButtonsState.buttons;
        }
        return selectButtonsState.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<SelectButtonUiParams> component2() {
        return this.buttons;
    }

    public final SelectButtonsState copy(String title, List<SelectButtonUiParams> buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new SelectButtonsState(title, buttons);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectButtonsState) {
            SelectButtonsState selectButtonsState = (SelectButtonsState) obj;
            return Intrinsics.areEqual(this.title, selectButtonsState.title) && Intrinsics.areEqual(this.buttons, selectButtonsState.buttons);
        }
        return false;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.buttons.hashCode();
    }

    public String toString() {
        String str = this.title;
        List<SelectButtonUiParams> list = this.buttons;
        return "SelectButtonsState(title=" + str + ", buttons=" + list + ")";
    }

    public SelectButtonsState(String title, List<SelectButtonUiParams> buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.title = title;
        this.buttons = buttons;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<SelectButtonUiParams> getButtons() {
        return this.buttons;
    }
}
