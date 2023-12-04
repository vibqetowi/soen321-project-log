package com.ifriend.presentation.features.chat.photo.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatPhotoUiState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/presentation/features/chat/photo/ui/ChatPhotoUiState;", "", "imageUrl", "", "isVisible", "", "isLoading", "(Ljava/lang/String;ZZ)V", "getImageUrl", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPhotoUiState {
    public static final int $stable = 0;
    private final String imageUrl;
    private final boolean isLoading;
    private final boolean isVisible;

    public ChatPhotoUiState() {
        this(null, false, false, 7, null);
    }

    public static /* synthetic */ ChatPhotoUiState copy$default(ChatPhotoUiState chatPhotoUiState, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatPhotoUiState.imageUrl;
        }
        if ((i & 2) != 0) {
            z = chatPhotoUiState.isVisible;
        }
        if ((i & 4) != 0) {
            z2 = chatPhotoUiState.isLoading;
        }
        return chatPhotoUiState.copy(str, z, z2);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final boolean component2() {
        return this.isVisible;
    }

    public final boolean component3() {
        return this.isLoading;
    }

    public final ChatPhotoUiState copy(String imageUrl, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new ChatPhotoUiState(imageUrl, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatPhotoUiState) {
            ChatPhotoUiState chatPhotoUiState = (ChatPhotoUiState) obj;
            return Intrinsics.areEqual(this.imageUrl, chatPhotoUiState.imageUrl) && this.isVisible == chatPhotoUiState.isVisible && this.isLoading == chatPhotoUiState.isLoading;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.imageUrl.hashCode() * 31;
        boolean z = this.isVisible;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isLoading;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.imageUrl;
        boolean z = this.isVisible;
        boolean z2 = this.isLoading;
        return "ChatPhotoUiState(imageUrl=" + str + ", isVisible=" + z + ", isLoading=" + z2 + ")";
    }

    public ChatPhotoUiState(String imageUrl, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        this.isVisible = z;
        this.isLoading = z2;
    }

    public /* synthetic */ ChatPhotoUiState(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
