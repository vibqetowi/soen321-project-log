package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FlashingBotTypingUiModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/FlashingBotTypingUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "text", "", "(Ljava/lang/CharSequence;)V", ViewHierarchyConstants.TAG_KEY, "", "getTag", "()Ljava/lang/String;", "getText", "()Ljava/lang/CharSequence;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlashingBotTypingUiModel implements TagHolder {
    public static final int $stable = 8;
    private final String tag;
    private final CharSequence text;

    public static /* synthetic */ FlashingBotTypingUiModel copy$default(FlashingBotTypingUiModel flashingBotTypingUiModel, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = flashingBotTypingUiModel.text;
        }
        return flashingBotTypingUiModel.copy(charSequence);
    }

    public final CharSequence component1() {
        return this.text;
    }

    public final FlashingBotTypingUiModel copy(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new FlashingBotTypingUiModel(text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlashingBotTypingUiModel) && Intrinsics.areEqual(this.text, ((FlashingBotTypingUiModel) obj).text);
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public String toString() {
        CharSequence charSequence = this.text;
        return "FlashingBotTypingUiModel(text=" + ((Object) charSequence) + ")";
    }

    public FlashingBotTypingUiModel(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.tag = "FlashingBotTyping";
    }

    public final CharSequence getText() {
        return this.text;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.TagHolder
    public String getTag() {
        return this.tag;
    }
}
