package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioMessageUiModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageBotDecodedUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/PayloadListItem;", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", ViewHierarchyConstants.TAG_KEY, "", "text", "", "payload", "", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "_payload", "getPayload", "()Ljava/lang/Object;", "getTag", "()Ljava/lang/String;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioMessageBotDecodedUiModel implements PayloadListItem, TagHolder {
    public static final int $stable = 8;
    private Object _payload;
    private final String tag;
    private final CharSequence text;

    public static /* synthetic */ AudioMessageBotDecodedUiModel copy$default(AudioMessageBotDecodedUiModel audioMessageBotDecodedUiModel, String str, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioMessageBotDecodedUiModel.tag;
        }
        if ((i & 2) != 0) {
            charSequence = audioMessageBotDecodedUiModel.text;
        }
        return audioMessageBotDecodedUiModel.copy(str, charSequence);
    }

    public final String component1() {
        return this.tag;
    }

    public final CharSequence component2() {
        return this.text;
    }

    public final AudioMessageBotDecodedUiModel copy(String tag, CharSequence text) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        return new AudioMessageBotDecodedUiModel(tag, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioMessageBotDecodedUiModel) {
            AudioMessageBotDecodedUiModel audioMessageBotDecodedUiModel = (AudioMessageBotDecodedUiModel) obj;
            return Intrinsics.areEqual(this.tag, audioMessageBotDecodedUiModel.tag) && Intrinsics.areEqual(this.text, audioMessageBotDecodedUiModel.text);
        }
        return false;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        String str = this.tag;
        CharSequence charSequence = this.text;
        return "AudioMessageBotDecodedUiModel(tag=" + str + ", text=" + ((Object) charSequence) + ")";
    }

    public AudioMessageBotDecodedUiModel(String tag, CharSequence text) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        this.tag = tag;
        this.text = text;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.TagHolder
    public String getTag() {
        return this.tag;
    }

    public final CharSequence getText() {
        return this.text;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.PayloadListItem
    public Object getPayload() {
        return this._payload;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioMessageBotDecodedUiModel(String tag, CharSequence text, Object obj) {
        this(tag, text);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        this._payload = obj;
    }
}
