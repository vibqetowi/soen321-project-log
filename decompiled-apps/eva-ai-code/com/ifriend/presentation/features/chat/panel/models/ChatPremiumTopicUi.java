package com.ifriend.presentation.features.chat.panel.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatTopicUi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\bHÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/ifriend/presentation/features/chat/panel/models/ChatPremiumTopicUi;", "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "id", "", "name", "iconResId", "", "isLoading", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getIconResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()Ljava/lang/String;", "()Z", "getName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/ifriend/presentation/features/chat/panel/models/ChatPremiumTopicUi;", "equals", "other", "", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPremiumTopicUi implements ChatPanelActionMarker {
    public static final int $stable = 0;
    private final Integer iconResId;
    private final String id;
    private final boolean isLoading;
    private final String name;

    public static /* synthetic */ ChatPremiumTopicUi copy$default(ChatPremiumTopicUi chatPremiumTopicUi, String str, String str2, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatPremiumTopicUi.id;
        }
        if ((i & 2) != 0) {
            str2 = chatPremiumTopicUi.name;
        }
        if ((i & 4) != 0) {
            num = chatPremiumTopicUi.iconResId;
        }
        if ((i & 8) != 0) {
            z = chatPremiumTopicUi.isLoading;
        }
        return chatPremiumTopicUi.copy(str, str2, num, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final Integer component3() {
        return this.iconResId;
    }

    public final boolean component4() {
        return this.isLoading;
    }

    public final ChatPremiumTopicUi copy(String id, String name, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ChatPremiumTopicUi(id, name, num, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatPremiumTopicUi) {
            ChatPremiumTopicUi chatPremiumTopicUi = (ChatPremiumTopicUi) obj;
            return Intrinsics.areEqual(this.id, chatPremiumTopicUi.id) && Intrinsics.areEqual(this.name, chatPremiumTopicUi.name) && Intrinsics.areEqual(this.iconResId, chatPremiumTopicUi.iconResId) && this.isLoading == chatPremiumTopicUi.isLoading;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
        Integer num = this.iconResId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.isLoading;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        Integer num = this.iconResId;
        boolean z = this.isLoading;
        return "ChatPremiumTopicUi(id=" + str + ", name=" + str2 + ", iconResId=" + num + ", isLoading=" + z + ")";
    }

    public ChatPremiumTopicUi(String id, String name, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.name = name;
        this.iconResId = num;
        this.isLoading = z;
    }

    @Override // com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker
    public String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getIconResId() {
        return this.iconResId;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
