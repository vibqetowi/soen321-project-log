package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GiftMessageUiModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/GiftUserMessageUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/GiftMessageUiModel;", ViewHierarchyConstants.TAG_KEY, "", "imageUrl", "experienceChange", "", "payload", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "_payload", "getExperienceChange", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImageUrl", "()Ljava/lang/String;", "getPayload", "()Ljava/lang/Object;", "getTag", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ifriend/chat/new_chat/list/ui/model/GiftUserMessageUiModel;", "equals", "", "other", "hashCode", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GiftUserMessageUiModel extends GiftMessageUiModel {
    public static final int $stable = 8;
    private Object _payload;
    private final Integer experienceChange;
    private final String imageUrl;
    private final String tag;

    public static /* synthetic */ GiftUserMessageUiModel copy$default(GiftUserMessageUiModel giftUserMessageUiModel, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = giftUserMessageUiModel.tag;
        }
        if ((i & 2) != 0) {
            str2 = giftUserMessageUiModel.imageUrl;
        }
        if ((i & 4) != 0) {
            num = giftUserMessageUiModel.experienceChange;
        }
        return giftUserMessageUiModel.copy(str, str2, num);
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final Integer component3() {
        return this.experienceChange;
    }

    public final GiftUserMessageUiModel copy(String tag, String imageUrl, Integer num) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new GiftUserMessageUiModel(tag, imageUrl, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftUserMessageUiModel) {
            GiftUserMessageUiModel giftUserMessageUiModel = (GiftUserMessageUiModel) obj;
            return Intrinsics.areEqual(this.tag, giftUserMessageUiModel.tag) && Intrinsics.areEqual(this.imageUrl, giftUserMessageUiModel.imageUrl) && Intrinsics.areEqual(this.experienceChange, giftUserMessageUiModel.experienceChange);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.tag.hashCode() * 31) + this.imageUrl.hashCode()) * 31;
        Integer num = this.experienceChange;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.tag;
        String str2 = this.imageUrl;
        Integer num = this.experienceChange;
        return "GiftUserMessageUiModel(tag=" + str + ", imageUrl=" + str2 + ", experienceChange=" + num + ")";
    }

    public /* synthetic */ GiftUserMessageUiModel(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : num);
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.GiftMessageUiModel, com.ifriend.chat.new_chat.list.ui.model.TagHolder
    public String getTag() {
        return this.tag;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.GiftMessageUiModel
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.GiftMessageUiModel
    public Integer getExperienceChange() {
        return this.experienceChange;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftUserMessageUiModel(String tag, String imageUrl, Integer num) {
        super(tag, imageUrl, num, null);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.tag = tag;
        this.imageUrl = imageUrl;
        this.experienceChange = num;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.PayloadListItem
    public Object getPayload() {
        return this._payload;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftUserMessageUiModel(String tag, String imageUrl, Integer num, Object obj) {
        this(tag, imageUrl, num);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this._payload = obj;
    }
}
