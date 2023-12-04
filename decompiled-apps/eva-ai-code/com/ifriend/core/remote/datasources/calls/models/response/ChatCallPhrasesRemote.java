package com.ifriend.core.remote.datasources.calls.models.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatCallPhrasesRemote.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/core/remote/datasources/calls/models/response/ChatCallPhrasesRemote;", "", "messages", "Lcom/ifriend/core/remote/datasources/calls/models/response/ChatCallPhrasesRemote$Messages;", "(Lcom/ifriend/core/remote/datasources/calls/models/response/ChatCallPhrasesRemote$Messages;)V", "getMessages", "()Lcom/ifriend/core/remote/datasources/calls/models/response/ChatCallPhrasesRemote$Messages;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Messages", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatCallPhrasesRemote {
    @SerializedName("messages")
    private final Messages messages;

    public static /* synthetic */ ChatCallPhrasesRemote copy$default(ChatCallPhrasesRemote chatCallPhrasesRemote, Messages messages, int i, Object obj) {
        if ((i & 1) != 0) {
            messages = chatCallPhrasesRemote.messages;
        }
        return chatCallPhrasesRemote.copy(messages);
    }

    public final Messages component1() {
        return this.messages;
    }

    public final ChatCallPhrasesRemote copy(Messages messages) {
        return new ChatCallPhrasesRemote(messages);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatCallPhrasesRemote) && Intrinsics.areEqual(this.messages, ((ChatCallPhrasesRemote) obj).messages);
    }

    public int hashCode() {
        Messages messages = this.messages;
        if (messages == null) {
            return 0;
        }
        return messages.hashCode();
    }

    public String toString() {
        Messages messages = this.messages;
        return "ChatCallPhrasesRemote(messages=" + messages + ")";
    }

    public ChatCallPhrasesRemote(Messages messages) {
        this.messages = messages;
    }

    public final Messages getMessages() {
        return this.messages;
    }

    /* compiled from: ChatCallPhrasesRemote.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ifriend/core/remote/datasources/calls/models/response/ChatCallPhrasesRemote$Messages;", "", "finalPhrases", "", "", "(Ljava/util/List;)V", "getFinalPhrases", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Messages {
        @SerializedName("finalPhrases")
        private final List<String> finalPhrases;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Messages copy$default(Messages messages, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = messages.finalPhrases;
            }
            return messages.copy(list);
        }

        public final List<String> component1() {
            return this.finalPhrases;
        }

        public final Messages copy(List<String> list) {
            return new Messages(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Messages) && Intrinsics.areEqual(this.finalPhrases, ((Messages) obj).finalPhrases);
        }

        public int hashCode() {
            List<String> list = this.finalPhrases;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<String> list = this.finalPhrases;
            return "Messages(finalPhrases=" + list + ")";
        }

        public Messages(List<String> list) {
            this.finalPhrases = list;
        }

        public final List<String> getFinalPhrases() {
            return this.finalPhrases;
        }
    }
}
