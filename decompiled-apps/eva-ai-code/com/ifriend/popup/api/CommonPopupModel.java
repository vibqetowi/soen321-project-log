package com.ifriend.popup.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PopupModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JP\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006$"}, d2 = {"Lcom/ifriend/popup/api/CommonPopupModel;", "Lcom/ifriend/popup/api/PopupModel;", "title", "", "text", "icon", "", "buttonText", "", "isCancelable", "", "shouldDismissOnActionClick", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/String;ZZ)V", "getButtonText", "()Ljava/lang/String;", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getShouldDismissOnActionClick", "getText", "()Ljava/lang/CharSequence;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/String;ZZ)Lcom/ifriend/popup/api/CommonPopupModel;", "equals", "other", "", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonPopupModel extends PopupModel {
    private final String buttonText;
    private final Integer icon;
    private final boolean isCancelable;
    private final boolean shouldDismissOnActionClick;
    private final CharSequence text;
    private final CharSequence title;

    public static /* synthetic */ CommonPopupModel copy$default(CommonPopupModel commonPopupModel, CharSequence charSequence, CharSequence charSequence2, Integer num, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = commonPopupModel.title;
        }
        if ((i & 2) != 0) {
            charSequence2 = commonPopupModel.text;
        }
        CharSequence charSequence3 = charSequence2;
        if ((i & 4) != 0) {
            num = commonPopupModel.icon;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str = commonPopupModel.buttonText;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = commonPopupModel.isCancelable;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = commonPopupModel.shouldDismissOnActionClick;
        }
        return commonPopupModel.copy(charSequence, charSequence3, num2, str2, z3, z2);
    }

    public final CharSequence component1() {
        return this.title;
    }

    public final CharSequence component2() {
        return this.text;
    }

    public final Integer component3() {
        return this.icon;
    }

    public final String component4() {
        return this.buttonText;
    }

    public final boolean component5() {
        return this.isCancelable;
    }

    public final boolean component6() {
        return this.shouldDismissOnActionClick;
    }

    public final CommonPopupModel copy(CharSequence title, CharSequence charSequence, Integer num, String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new CommonPopupModel(title, charSequence, num, str, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommonPopupModel) {
            CommonPopupModel commonPopupModel = (CommonPopupModel) obj;
            return Intrinsics.areEqual(this.title, commonPopupModel.title) && Intrinsics.areEqual(this.text, commonPopupModel.text) && Intrinsics.areEqual(this.icon, commonPopupModel.icon) && Intrinsics.areEqual(this.buttonText, commonPopupModel.buttonText) && this.isCancelable == commonPopupModel.isCancelable && this.shouldDismissOnActionClick == commonPopupModel.shouldDismissOnActionClick;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        CharSequence charSequence = this.text;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Integer num = this.icon;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.buttonText;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.isCancelable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.shouldDismissOnActionClick;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = this.text;
        Integer num = this.icon;
        String str = this.buttonText;
        boolean z = this.isCancelable;
        boolean z2 = this.shouldDismissOnActionClick;
        return "CommonPopupModel(title=" + ((Object) charSequence) + ", text=" + ((Object) charSequence2) + ", icon=" + num + ", buttonText=" + str + ", isCancelable=" + z + ", shouldDismissOnActionClick=" + z2 + ")";
    }

    public /* synthetic */ CommonPopupModel(CharSequence charSequence, CharSequence charSequence2, Integer num, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, charSequence2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? true : z, (i & 32) != 0 ? true : z2);
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final boolean isCancelable() {
        return this.isCancelable;
    }

    @Override // com.ifriend.popup.api.PopupModel
    public boolean getShouldDismissOnActionClick() {
        return this.shouldDismissOnActionClick;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonPopupModel(CharSequence title, CharSequence charSequence, Integer num, String str, boolean z, boolean z2) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.text = charSequence;
        this.icon = num;
        this.buttonText = str;
        this.isCancelable = z;
        this.shouldDismissOnActionClick = z2;
    }
}
