package com.ifriend.popup.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PopupModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ifriend/popup/api/UpgradePopupModel;", "Lcom/ifriend/popup/api/PopupModel;", "title", "", "secondaryButtonText", "isCancelable", "", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V", "()Z", "getSecondaryButtonText", "()Ljava/lang/CharSequence;", "getTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpgradePopupModel extends PopupModel {
    private final boolean isCancelable;
    private final CharSequence secondaryButtonText;
    private final CharSequence title;

    public static /* synthetic */ UpgradePopupModel copy$default(UpgradePopupModel upgradePopupModel, CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = upgradePopupModel.title;
        }
        if ((i & 2) != 0) {
            charSequence2 = upgradePopupModel.secondaryButtonText;
        }
        if ((i & 4) != 0) {
            z = upgradePopupModel.isCancelable;
        }
        return upgradePopupModel.copy(charSequence, charSequence2, z);
    }

    public final CharSequence component1() {
        return this.title;
    }

    public final CharSequence component2() {
        return this.secondaryButtonText;
    }

    public final boolean component3() {
        return this.isCancelable;
    }

    public final UpgradePopupModel copy(CharSequence title, CharSequence secondaryButtonText, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        return new UpgradePopupModel(title, secondaryButtonText, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpgradePopupModel) {
            UpgradePopupModel upgradePopupModel = (UpgradePopupModel) obj;
            return Intrinsics.areEqual(this.title, upgradePopupModel.title) && Intrinsics.areEqual(this.secondaryButtonText, upgradePopupModel.secondaryButtonText) && this.isCancelable == upgradePopupModel.isCancelable;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.secondaryButtonText.hashCode()) * 31;
        boolean z = this.isCancelable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = this.secondaryButtonText;
        boolean z = this.isCancelable;
        return "UpgradePopupModel(title=" + ((Object) charSequence) + ", secondaryButtonText=" + ((Object) charSequence2) + ", isCancelable=" + z + ")";
    }

    public /* synthetic */ UpgradePopupModel(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, charSequence2, (i & 4) != 0 ? true : z);
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final CharSequence getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final boolean isCancelable() {
        return this.isCancelable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradePopupModel(CharSequence title, CharSequence secondaryButtonText, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.title = title;
        this.secondaryButtonText = secondaryButtonText;
        this.isCancelable = z;
    }
}
