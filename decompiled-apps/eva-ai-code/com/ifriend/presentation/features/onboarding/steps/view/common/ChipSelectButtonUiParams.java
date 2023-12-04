package com.ifriend.presentation.features.onboarding.steps.view.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingButtonComponents.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/ChipSelectButtonUiParams;", "", "id", "", "text", "selected", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getSelected", "()Z", "getText", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChipSelectButtonUiParams {
    public static final int $stable = 0;
    private final String id;
    private final boolean selected;
    private final String text;

    public static /* synthetic */ ChipSelectButtonUiParams copy$default(ChipSelectButtonUiParams chipSelectButtonUiParams, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chipSelectButtonUiParams.id;
        }
        if ((i & 2) != 0) {
            str2 = chipSelectButtonUiParams.text;
        }
        if ((i & 4) != 0) {
            z = chipSelectButtonUiParams.selected;
        }
        return chipSelectButtonUiParams.copy(str, str2, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final boolean component3() {
        return this.selected;
    }

    public final ChipSelectButtonUiParams copy(String id, String text, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ChipSelectButtonUiParams(id, text, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChipSelectButtonUiParams) {
            ChipSelectButtonUiParams chipSelectButtonUiParams = (ChipSelectButtonUiParams) obj;
            return Intrinsics.areEqual(this.id, chipSelectButtonUiParams.id) && Intrinsics.areEqual(this.text, chipSelectButtonUiParams.text) && this.selected == chipSelectButtonUiParams.selected;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + this.text.hashCode()) * 31;
        boolean z = this.selected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        boolean z = this.selected;
        return "ChipSelectButtonUiParams(id=" + str + ", text=" + str2 + ", selected=" + z + ")";
    }

    public ChipSelectButtonUiParams(String id, String text, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = id;
        this.text = text;
        this.selected = z;
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getSelected() {
        return this.selected;
    }
}
