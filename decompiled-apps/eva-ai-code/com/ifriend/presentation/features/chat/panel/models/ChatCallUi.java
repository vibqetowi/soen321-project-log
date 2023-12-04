package com.ifriend.presentation.features.chat.panel.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatTopicUi.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ifriend/presentation/features/chat/panel/models/ChatCallUi;", "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "id", "", "isLoading", "", "(Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatCallUi implements ChatPanelActionMarker {
    public static final int $stable = 0;
    private final String id;
    private final boolean isLoading;

    public static /* synthetic */ ChatCallUi copy$default(ChatCallUi chatCallUi, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatCallUi.id;
        }
        if ((i & 2) != 0) {
            z = chatCallUi.isLoading;
        }
        return chatCallUi.copy(str, z);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component2() {
        return this.isLoading;
    }

    public final ChatCallUi copy(String id, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new ChatCallUi(id, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatCallUi) {
            ChatCallUi chatCallUi = (ChatCallUi) obj;
            return Intrinsics.areEqual(this.id, chatCallUi.id) && this.isLoading == chatCallUi.isLoading;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        boolean z = this.isLoading;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.id;
        boolean z = this.isLoading;
        return "ChatCallUi(id=" + str + ", isLoading=" + z + ")";
    }

    public ChatCallUi(String id, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.isLoading = z;
    }

    @Override // com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker
    public String getId() {
        return this.id;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
