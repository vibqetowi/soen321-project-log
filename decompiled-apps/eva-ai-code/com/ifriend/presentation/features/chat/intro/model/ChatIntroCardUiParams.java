package com.ifriend.presentation.features.chat.intro.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatIntroCardUiParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroCardUiParams;", "", "titleLabel", "", "descriptionLabel", "buttonLabel", "isVisibleCancelButton", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getButtonLabel", "()Ljava/lang/String;", "getDescriptionLabel", "()Z", "getTitleLabel", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroCardUiParams {
    public static final int $stable = 0;
    private final String buttonLabel;
    private final String descriptionLabel;
    private final boolean isVisibleCancelButton;
    private final String titleLabel;

    public ChatIntroCardUiParams() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ ChatIntroCardUiParams copy$default(ChatIntroCardUiParams chatIntroCardUiParams, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatIntroCardUiParams.titleLabel;
        }
        if ((i & 2) != 0) {
            str2 = chatIntroCardUiParams.descriptionLabel;
        }
        if ((i & 4) != 0) {
            str3 = chatIntroCardUiParams.buttonLabel;
        }
        if ((i & 8) != 0) {
            z = chatIntroCardUiParams.isVisibleCancelButton;
        }
        return chatIntroCardUiParams.copy(str, str2, str3, z);
    }

    public final String component1() {
        return this.titleLabel;
    }

    public final String component2() {
        return this.descriptionLabel;
    }

    public final String component3() {
        return this.buttonLabel;
    }

    public final boolean component4() {
        return this.isVisibleCancelButton;
    }

    public final ChatIntroCardUiParams copy(String titleLabel, String descriptionLabel, String buttonLabel, boolean z) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(descriptionLabel, "descriptionLabel");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        return new ChatIntroCardUiParams(titleLabel, descriptionLabel, buttonLabel, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatIntroCardUiParams) {
            ChatIntroCardUiParams chatIntroCardUiParams = (ChatIntroCardUiParams) obj;
            return Intrinsics.areEqual(this.titleLabel, chatIntroCardUiParams.titleLabel) && Intrinsics.areEqual(this.descriptionLabel, chatIntroCardUiParams.descriptionLabel) && Intrinsics.areEqual(this.buttonLabel, chatIntroCardUiParams.buttonLabel) && this.isVisibleCancelButton == chatIntroCardUiParams.isVisibleCancelButton;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.titleLabel.hashCode() * 31) + this.descriptionLabel.hashCode()) * 31) + this.buttonLabel.hashCode()) * 31;
        boolean z = this.isVisibleCancelButton;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.titleLabel;
        String str2 = this.descriptionLabel;
        String str3 = this.buttonLabel;
        boolean z = this.isVisibleCancelButton;
        return "ChatIntroCardUiParams(titleLabel=" + str + ", descriptionLabel=" + str2 + ", buttonLabel=" + str3 + ", isVisibleCancelButton=" + z + ")";
    }

    public ChatIntroCardUiParams(String titleLabel, String descriptionLabel, String buttonLabel, boolean z) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(descriptionLabel, "descriptionLabel");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.titleLabel = titleLabel;
        this.descriptionLabel = descriptionLabel;
        this.buttonLabel = buttonLabel;
        this.isVisibleCancelButton = z;
    }

    public /* synthetic */ ChatIntroCardUiParams(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
    }

    public final String getTitleLabel() {
        return this.titleLabel;
    }

    public final String getDescriptionLabel() {
        return this.descriptionLabel;
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final boolean isVisibleCancelButton() {
        return this.isVisibleCancelButton;
    }
}
