package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GiftMessageUiModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u0082\u0001\u0001\u000f¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/GiftMessageUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/PayloadListItem;", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", ViewHierarchyConstants.TAG_KEY, "", "imageUrl", "experienceChange", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getExperienceChange", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImageUrl", "()Ljava/lang/String;", "getTag", "Lcom/ifriend/chat/new_chat/list/ui/model/GiftUserMessageUiModel;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class GiftMessageUiModel implements PayloadListItem, TagHolder {
    public static final int $stable = 0;
    private final Integer experienceChange;
    private final String imageUrl;
    private final String tag;

    public /* synthetic */ GiftMessageUiModel(String str, String str2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num);
    }

    private GiftMessageUiModel(String str, String str2, Integer num) {
        this.tag = str;
        this.imageUrl = str2;
        this.experienceChange = num;
    }

    public /* synthetic */ GiftMessageUiModel(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : num, null);
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.TagHolder
    public String getTag() {
        return this.tag;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public Integer getExperienceChange() {
        return this.experienceChange;
    }
}
