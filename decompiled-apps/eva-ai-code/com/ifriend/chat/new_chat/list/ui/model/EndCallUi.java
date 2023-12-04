package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
/* compiled from: EndCallUi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/EndCallUi;", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "()V", ViewHierarchyConstants.TAG_KEY, "", "getTag", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EndCallUi implements TagHolder {
    public static final int $stable = 0;
    public static final EndCallUi INSTANCE = new EndCallUi();
    private static final String tag = "chat_end_call";

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EndCallUi) {
            EndCallUi endCallUi = (EndCallUi) obj;
            return true;
        }
        return false;
    }

    public int hashCode() {
        return -2117495543;
    }

    public String toString() {
        return "EndCallUi";
    }

    private EndCallUi() {
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.TagHolder
    public String getTag() {
        return tag;
    }
}
