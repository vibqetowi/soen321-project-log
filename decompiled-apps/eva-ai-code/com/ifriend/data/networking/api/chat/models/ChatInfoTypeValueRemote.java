package com.ifriend.data.networking.api.chat.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatsRootRemote.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/networking/api/chat/models/ChatInfoTypeValueRemote;", "", "type", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInfoTypeValueRemote {
    @SerializedName("type")
    private final String type;
    @SerializedName("value")
    private final String value;

    public static /* synthetic */ ChatInfoTypeValueRemote copy$default(ChatInfoTypeValueRemote chatInfoTypeValueRemote, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatInfoTypeValueRemote.type;
        }
        if ((i & 2) != 0) {
            str2 = chatInfoTypeValueRemote.value;
        }
        return chatInfoTypeValueRemote.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final ChatInfoTypeValueRemote copy(String str, String str2) {
        return new ChatInfoTypeValueRemote(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatInfoTypeValueRemote) {
            ChatInfoTypeValueRemote chatInfoTypeValueRemote = (ChatInfoTypeValueRemote) obj;
            return Intrinsics.areEqual(this.type, chatInfoTypeValueRemote.type) && Intrinsics.areEqual(this.value, chatInfoTypeValueRemote.value);
        }
        return false;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.value;
        return "ChatInfoTypeValueRemote(type=" + str + ", value=" + str2 + ")";
    }

    public ChatInfoTypeValueRemote(String str, String str2) {
        this.type = str;
        this.value = str2;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }
}
