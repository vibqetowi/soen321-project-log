package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextMessageUiModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/TextMessageUserUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/TextMessageUiModel;", ViewHierarchyConstants.TAG_KEY, "", "text", "", "isNeedToAnimate", "", "experienceChange", "", "payload", "", "(Ljava/lang/String;Ljava/lang/CharSequence;ZLjava/lang/Integer;Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/CharSequence;ZLjava/lang/Integer;)V", "_payload", "getExperienceChange", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getPayload", "()Ljava/lang/Object;", "getTag", "()Ljava/lang/String;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/CharSequence;ZLjava/lang/Integer;)Lcom/ifriend/chat/new_chat/list/ui/model/TextMessageUserUiModel;", "equals", "other", "hashCode", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextMessageUserUiModel extends TextMessageUiModel {
    public static final int $stable = 8;
    private Object _payload;
    private final Integer experienceChange;
    private final boolean isNeedToAnimate;
    private final String tag;
    private final CharSequence text;

    public static /* synthetic */ TextMessageUserUiModel copy$default(TextMessageUserUiModel textMessageUserUiModel, String str, CharSequence charSequence, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textMessageUserUiModel.tag;
        }
        if ((i & 2) != 0) {
            charSequence = textMessageUserUiModel.text;
        }
        if ((i & 4) != 0) {
            z = textMessageUserUiModel.isNeedToAnimate;
        }
        if ((i & 8) != 0) {
            num = textMessageUserUiModel.experienceChange;
        }
        return textMessageUserUiModel.copy(str, charSequence, z, num);
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

    public final Integer component4() {
        return this.experienceChange;
    }

    public final TextMessageUserUiModel copy(String tag, CharSequence text, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextMessageUserUiModel(tag, text, z, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextMessageUserUiModel) {
            TextMessageUserUiModel textMessageUserUiModel = (TextMessageUserUiModel) obj;
            return Intrinsics.areEqual(this.tag, textMessageUserUiModel.tag) && Intrinsics.areEqual(this.text, textMessageUserUiModel.text) && this.isNeedToAnimate == textMessageUserUiModel.isNeedToAnimate && Intrinsics.areEqual(this.experienceChange, textMessageUserUiModel.experienceChange);
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
        Integer num = this.experienceChange;
        return i2 + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.tag;
        CharSequence charSequence = this.text;
        boolean z = this.isNeedToAnimate;
        Integer num = this.experienceChange;
        return "TextMessageUserUiModel(tag=" + str + ", text=" + ((Object) charSequence) + ", isNeedToAnimate=" + z + ", experienceChange=" + num + ")";
    }

    public /* synthetic */ TextMessageUserUiModel(String str, CharSequence charSequence, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, charSequence, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num);
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

    public final Integer getExperienceChange() {
        return this.experienceChange;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextMessageUserUiModel(String tag, CharSequence text, boolean z, Integer num) {
        super(tag, text, z, null);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        this.tag = tag;
        this.text = text;
        this.isNeedToAnimate = z;
        this.experienceChange = num;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.PayloadListItem
    public Object getPayload() {
        return this._payload;
    }

    public /* synthetic */ TextMessageUserUiModel(String str, CharSequence charSequence, boolean z, Integer num, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, charSequence, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num, obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextMessageUserUiModel(String tag, CharSequence text, boolean z, Integer num, Object obj) {
        this(tag, text, z, num);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        this._payload = obj;
    }
}
