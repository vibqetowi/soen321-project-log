package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RegenerateMessageUiModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/RegenerateMessageUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "Lcom/ifriend/chat/new_chat/list/ui/model/PayloadListItem;", ViewHierarchyConstants.TAG_KEY, "", "isRegenerating", "", "payload", "", "(Ljava/lang/String;ZLjava/lang/Object;)V", "(Ljava/lang/String;Z)V", "()Z", "<set-?>", "getPayload", "()Ljava/lang/Object;", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegenerateMessageUiModel implements TagHolder, PayloadListItem {
    public static final int $stable = 8;
    private final boolean isRegenerating;
    private Object payload;
    private final String tag;

    public static /* synthetic */ RegenerateMessageUiModel copy$default(RegenerateMessageUiModel regenerateMessageUiModel, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regenerateMessageUiModel.tag;
        }
        if ((i & 2) != 0) {
            z = regenerateMessageUiModel.isRegenerating;
        }
        return regenerateMessageUiModel.copy(str, z);
    }

    public final String component1() {
        return this.tag;
    }

    public final boolean component2() {
        return this.isRegenerating;
    }

    public final RegenerateMessageUiModel copy(String tag, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new RegenerateMessageUiModel(tag, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegenerateMessageUiModel) {
            RegenerateMessageUiModel regenerateMessageUiModel = (RegenerateMessageUiModel) obj;
            return Intrinsics.areEqual(this.tag, regenerateMessageUiModel.tag) && this.isRegenerating == regenerateMessageUiModel.isRegenerating;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.tag.hashCode() * 31;
        boolean z = this.isRegenerating;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.tag;
        boolean z = this.isRegenerating;
        return "RegenerateMessageUiModel(tag=" + str + ", isRegenerating=" + z + ")";
    }

    public RegenerateMessageUiModel(String tag, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.isRegenerating = z;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.TagHolder
    public String getTag() {
        return this.tag;
    }

    public final boolean isRegenerating() {
        return this.isRegenerating;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.PayloadListItem
    public Object getPayload() {
        return this.payload;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RegenerateMessageUiModel(String tag, boolean z, Object obj) {
        this(tag, z);
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.payload = obj;
    }
}
