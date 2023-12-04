package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextMessageUiModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/TextMessageUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/PayloadListItem;", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", ViewHierarchyConstants.TAG_KEY, "", "text", "", "isNeedToAnimate", "", "(Ljava/lang/String;Ljava/lang/CharSequence;Z)V", "()Z", "getTag", "()Ljava/lang/String;", "getText", "()Ljava/lang/CharSequence;", "Lcom/ifriend/chat/new_chat/list/ui/model/PaidTextMessageFromBotUi;", "Lcom/ifriend/chat/new_chat/list/ui/model/TextMessageBotUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/TextMessageUserUiModel;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TextMessageUiModel implements PayloadListItem, TagHolder {
    public static final int $stable = 8;
    private final boolean isNeedToAnimate;
    private final String tag;
    private final CharSequence text;

    public /* synthetic */ TextMessageUiModel(String str, CharSequence charSequence, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, charSequence, z);
    }

    private TextMessageUiModel(String str, CharSequence charSequence, boolean z) {
        this.tag = str;
        this.text = charSequence;
        this.isNeedToAnimate = z;
    }

    public String getTag() {
        return this.tag;
    }

    public CharSequence getText() {
        return this.text;
    }

    public boolean isNeedToAnimate() {
        return this.isNeedToAnimate;
    }
}
