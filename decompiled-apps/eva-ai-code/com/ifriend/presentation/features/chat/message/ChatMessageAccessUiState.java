package com.ifriend.presentation.features.chat.message;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChatMessageAccessDelegate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessUiState;", "", "isLoading", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageAccessUiState {
    public static final int $stable = 0;
    private final boolean isLoading;

    public ChatMessageAccessUiState() {
        this(false, 1, null);
    }

    public static /* synthetic */ ChatMessageAccessUiState copy$default(ChatMessageAccessUiState chatMessageAccessUiState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatMessageAccessUiState.isLoading;
        }
        return chatMessageAccessUiState.copy(z);
    }

    public final boolean component1() {
        return this.isLoading;
    }

    public final ChatMessageAccessUiState copy(boolean z) {
        return new ChatMessageAccessUiState(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatMessageAccessUiState) && this.isLoading == ((ChatMessageAccessUiState) obj).isLoading;
    }

    public int hashCode() {
        boolean z = this.isLoading;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.isLoading;
        return "ChatMessageAccessUiState(isLoading=" + z + ")";
    }

    public ChatMessageAccessUiState(boolean z) {
        this.isLoading = z;
    }

    public /* synthetic */ ChatMessageAccessUiState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
