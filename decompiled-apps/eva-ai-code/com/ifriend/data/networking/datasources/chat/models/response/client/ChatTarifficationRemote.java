package com.ifriend.data.networking.datasources.chat.models.response.client;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatMessageRemote.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatTarifficationRemote;", "", "paid", "", "cost", "", "type", "", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)V", "getCost", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaid", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatTarifficationRemote;", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatTarifficationRemote {
    @SerializedName("cost")
    private final Integer cost;
    @SerializedName("paid")
    private final Boolean paid;
    @SerializedName("type")
    private final String type;

    public static /* synthetic */ ChatTarifficationRemote copy$default(ChatTarifficationRemote chatTarifficationRemote, Boolean bool, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = chatTarifficationRemote.paid;
        }
        if ((i & 2) != 0) {
            num = chatTarifficationRemote.cost;
        }
        if ((i & 4) != 0) {
            str = chatTarifficationRemote.type;
        }
        return chatTarifficationRemote.copy(bool, num, str);
    }

    public final Boolean component1() {
        return this.paid;
    }

    public final Integer component2() {
        return this.cost;
    }

    public final String component3() {
        return this.type;
    }

    public final ChatTarifficationRemote copy(Boolean bool, Integer num, String str) {
        return new ChatTarifficationRemote(bool, num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatTarifficationRemote) {
            ChatTarifficationRemote chatTarifficationRemote = (ChatTarifficationRemote) obj;
            return Intrinsics.areEqual(this.paid, chatTarifficationRemote.paid) && Intrinsics.areEqual(this.cost, chatTarifficationRemote.cost) && Intrinsics.areEqual(this.type, chatTarifficationRemote.type);
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.paid;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.cost;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.type;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.paid;
        Integer num = this.cost;
        String str = this.type;
        return "ChatTarifficationRemote(paid=" + bool + ", cost=" + num + ", type=" + str + ")";
    }

    public ChatTarifficationRemote(Boolean bool, Integer num, String str) {
        this.paid = bool;
        this.cost = num;
        this.type = str;
    }

    public final Boolean getPaid() {
        return this.paid;
    }

    public final Integer getCost() {
        return this.cost;
    }

    public final String getType() {
        return this.type;
    }
}
