package com.ifriend.data.networking.datasources.chat.models.response.client;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatMessageRemoteParams.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemoteParams;", "", ViewHierarchyConstants.TAG_KEY, "", "text", "instant", "", "meta", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/EmptyObject;", "(Ljava/lang/String;Ljava/lang/String;ILcom/ifriend/data/networking/datasources/chat/models/response/client/EmptyObject;)V", "getInstant", "()I", "getMeta", "()Lcom/ifriend/data/networking/datasources/chat/models/response/client/EmptyObject;", "getTag", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageRemoteParams {
    private final int instant;
    private final EmptyObject meta;
    private final String tag;
    private final String text;

    public static /* synthetic */ ChatMessageRemoteParams copy$default(ChatMessageRemoteParams chatMessageRemoteParams, String str, String str2, int i, EmptyObject emptyObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatMessageRemoteParams.tag;
        }
        if ((i2 & 2) != 0) {
            str2 = chatMessageRemoteParams.text;
        }
        if ((i2 & 4) != 0) {
            i = chatMessageRemoteParams.instant;
        }
        if ((i2 & 8) != 0) {
            emptyObject = chatMessageRemoteParams.meta;
        }
        return chatMessageRemoteParams.copy(str, str2, i, emptyObject);
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.text;
    }

    public final int component3() {
        return this.instant;
    }

    public final EmptyObject component4() {
        return this.meta;
    }

    public final ChatMessageRemoteParams copy(String tag, String text, int i, EmptyObject meta) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(meta, "meta");
        return new ChatMessageRemoteParams(tag, text, i, meta);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatMessageRemoteParams) {
            ChatMessageRemoteParams chatMessageRemoteParams = (ChatMessageRemoteParams) obj;
            return Intrinsics.areEqual(this.tag, chatMessageRemoteParams.tag) && Intrinsics.areEqual(this.text, chatMessageRemoteParams.text) && this.instant == chatMessageRemoteParams.instant && Intrinsics.areEqual(this.meta, chatMessageRemoteParams.meta);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.tag.hashCode() * 31) + this.text.hashCode()) * 31) + this.instant) * 31) + this.meta.hashCode();
    }

    public String toString() {
        String str = this.tag;
        String str2 = this.text;
        int i = this.instant;
        EmptyObject emptyObject = this.meta;
        return "ChatMessageRemoteParams(tag=" + str + ", text=" + str2 + ", instant=" + i + ", meta=" + emptyObject + ")";
    }

    public ChatMessageRemoteParams(String tag, String text, int i, EmptyObject meta) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.tag = tag;
        this.text = text;
        this.instant = i;
        this.meta = meta;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getText() {
        return this.text;
    }

    public final int getInstant() {
        return this.instant;
    }

    public /* synthetic */ ChatMessageRemoteParams(String str, String str2, int i, EmptyObject emptyObject, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? new EmptyObject() : emptyObject);
    }

    public final EmptyObject getMeta() {
        return this.meta;
    }
}
