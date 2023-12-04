package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.new_chat.list.presentationSystems.newMessagesAnimation.ChatItemAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextMessageUiModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/PaidTextMessageFromBotUi;", "Lcom/ifriend/chat/new_chat/list/ui/model/TextMessageUiModel;", ViewHierarchyConstants.TAG_KEY, "", "text", "", "isNeedToAnimate", "", "animation", "Lcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/ChatItemAnimation;", "payload", "", "(Ljava/lang/String;Ljava/lang/CharSequence;ZLcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/ChatItemAnimation;Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/CharSequence;ZLcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/ChatItemAnimation;)V", "_payload", "getAnimation", "()Lcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/ChatItemAnimation;", "()Z", "getPayload", "()Ljava/lang/Object;", "getTag", "()Ljava/lang/String;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaidTextMessageFromBotUi extends TextMessageUiModel {
    public static final int $stable = 8;
    private Object _payload;
    private final ChatItemAnimation animation;
    private final boolean isNeedToAnimate;
    private final String tag;
    private final CharSequence text;

    public static /* synthetic */ PaidTextMessageFromBotUi copy$default(PaidTextMessageFromBotUi paidTextMessageFromBotUi, String str, CharSequence charSequence, boolean z, ChatItemAnimation chatItemAnimation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paidTextMessageFromBotUi.tag;
        }
        if ((i & 2) != 0) {
            charSequence = paidTextMessageFromBotUi.text;
        }
        if ((i & 4) != 0) {
            z = paidTextMessageFromBotUi.isNeedToAnimate;
        }
        if ((i & 8) != 0) {
            chatItemAnimation = paidTextMessageFromBotUi.animation;
        }
        return paidTextMessageFromBotUi.copy(str, charSequence, z, chatItemAnimation);
    }

    public final String component1() {
        return this.tag;
    }

    public final CharSequence component2() {
        return this.text;
    }

    public final boolean component3() {
        return this.isNeedToAnimate;
    }

    public final ChatItemAnimation component4() {
        return this.animation;
    }

    public final PaidTextMessageFromBotUi copy(String tag, CharSequence text, boolean z, ChatItemAnimation chatItemAnimation) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        return new PaidTextMessageFromBotUi(tag, text, z, chatItemAnimation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaidTextMessageFromBotUi) {
            PaidTextMessageFromBotUi paidTextMessageFromBotUi = (PaidTextMessageFromBotUi) obj;
            return Intrinsics.areEqual(this.tag, paidTextMessageFromBotUi.tag) && Intrinsics.areEqual(this.text, paidTextMessageFromBotUi.text) && this.isNeedToAnimate == paidTextMessageFromBotUi.isNeedToAnimate && Intrinsics.areEqual(this.animation, paidTextMessageFromBotUi.animation);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.tag.hashCode() * 31) + this.text.hashCode()) * 31;
        boolean z = this.isNeedToAnimate;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        ChatItemAnimation chatItemAnimation = this.animation;
        return i2 + (chatItemAnimation == null ? 0 : chatItemAnimation.hashCode());
    }

    public String toString() {
        String str = this.tag;
        CharSequence charSequence = this.text;
        boolean z = this.isNeedToAnimate;
        ChatItemAnimation chatItemAnimation = this.animation;
        return "PaidTextMessageFromBotUi(tag=" + str + ", text=" + ((Object) charSequence) + ", isNeedToAnimate=" + z + ", animation=" + chatItemAnimation + ")";
    }

    public /* synthetic */ PaidTextMessageFromBotUi(String str, CharSequence charSequence, boolean z, ChatItemAnimation chatItemAnimation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, charSequence, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : chatItemAnimation);
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.TextMessageUiModel, com.ifriend.chat.new_chat.list.ui.model.TagHolder
    public String getTag() {
        return this.tag;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.TextMessageUiModel
    public CharSequence getText() {
        return this.text;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.TextMessageUiModel
    public boolean isNeedToAnimate() {
        return this.isNeedToAnimate;
    }

    public final ChatItemAnimation getAnimation() {
        return this.animation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidTextMessageFromBotUi(String tag, CharSequence text, boolean z, ChatItemAnimation chatItemAnimation) {
        super(tag, text, z, null);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        this.tag = tag;
        this.text = text;
        this.isNeedToAnimate = z;
        this.animation = chatItemAnimation;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.PayloadListItem
    public Object getPayload() {
        return this._payload;
    }

    public /* synthetic */ PaidTextMessageFromBotUi(String str, CharSequence charSequence, boolean z, ChatItemAnimation chatItemAnimation, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, charSequence, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : chatItemAnimation, obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaidTextMessageFromBotUi(String tag, CharSequence text, boolean z, ChatItemAnimation chatItemAnimation, Object obj) {
        this(tag, text, z, chatItemAnimation);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        this._payload = obj;
    }
}
