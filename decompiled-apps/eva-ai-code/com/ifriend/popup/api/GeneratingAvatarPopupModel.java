package com.ifriend.popup.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PopupModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/popup/api/GeneratingAvatarPopupModel;", "Lcom/ifriend/popup/api/PopupModel;", "shouldDismissOnActionClick", "", "(Z)V", "getShouldDismissOnActionClick", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeneratingAvatarPopupModel extends PopupModel {
    private final boolean shouldDismissOnActionClick;

    public GeneratingAvatarPopupModel() {
        this(false, 1, null);
    }

    public static /* synthetic */ GeneratingAvatarPopupModel copy$default(GeneratingAvatarPopupModel generatingAvatarPopupModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = generatingAvatarPopupModel.shouldDismissOnActionClick;
        }
        return generatingAvatarPopupModel.copy(z);
    }

    public final boolean component1() {
        return this.shouldDismissOnActionClick;
    }

    public final GeneratingAvatarPopupModel copy(boolean z) {
        return new GeneratingAvatarPopupModel(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GeneratingAvatarPopupModel) && this.shouldDismissOnActionClick == ((GeneratingAvatarPopupModel) obj).shouldDismissOnActionClick;
    }

    public int hashCode() {
        boolean z = this.shouldDismissOnActionClick;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.shouldDismissOnActionClick;
        return "GeneratingAvatarPopupModel(shouldDismissOnActionClick=" + z + ")";
    }

    public /* synthetic */ GeneratingAvatarPopupModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    @Override // com.ifriend.popup.api.PopupModel
    public boolean getShouldDismissOnActionClick() {
        return this.shouldDismissOnActionClick;
    }

    public GeneratingAvatarPopupModel(boolean z) {
        super(null);
        this.shouldDismissOnActionClick = z;
    }
}
