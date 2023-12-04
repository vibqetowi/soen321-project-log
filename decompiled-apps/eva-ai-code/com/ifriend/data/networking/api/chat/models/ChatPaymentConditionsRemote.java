package com.ifriend.data.networking.api.chat.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatsRootRemote.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote;", "", "postCondition", "Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote$PostCondition;", "preCondition", "Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote$PreCondition;", "(Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote$PostCondition;Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote$PreCondition;)V", "getPostCondition", "()Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote$PostCondition;", "getPreCondition", "()Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote$PreCondition;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PostCondition", "PreCondition", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPaymentConditionsRemote {
    @SerializedName("postCondition")
    private final PostCondition postCondition;
    @SerializedName("preCondition")
    private final PreCondition preCondition;

    public static /* synthetic */ ChatPaymentConditionsRemote copy$default(ChatPaymentConditionsRemote chatPaymentConditionsRemote, PostCondition postCondition, PreCondition preCondition, int i, Object obj) {
        if ((i & 1) != 0) {
            postCondition = chatPaymentConditionsRemote.postCondition;
        }
        if ((i & 2) != 0) {
            preCondition = chatPaymentConditionsRemote.preCondition;
        }
        return chatPaymentConditionsRemote.copy(postCondition, preCondition);
    }

    public final PostCondition component1() {
        return this.postCondition;
    }

    public final PreCondition component2() {
        return this.preCondition;
    }

    public final ChatPaymentConditionsRemote copy(PostCondition postCondition, PreCondition preCondition) {
        return new ChatPaymentConditionsRemote(postCondition, preCondition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatPaymentConditionsRemote) {
            ChatPaymentConditionsRemote chatPaymentConditionsRemote = (ChatPaymentConditionsRemote) obj;
            return Intrinsics.areEqual(this.postCondition, chatPaymentConditionsRemote.postCondition) && Intrinsics.areEqual(this.preCondition, chatPaymentConditionsRemote.preCondition);
        }
        return false;
    }

    public int hashCode() {
        PostCondition postCondition = this.postCondition;
        int hashCode = (postCondition == null ? 0 : postCondition.hashCode()) * 31;
        PreCondition preCondition = this.preCondition;
        return hashCode + (preCondition != null ? preCondition.hashCode() : 0);
    }

    public String toString() {
        PostCondition postCondition = this.postCondition;
        PreCondition preCondition = this.preCondition;
        return "ChatPaymentConditionsRemote(postCondition=" + postCondition + ", preCondition=" + preCondition + ")";
    }

    public ChatPaymentConditionsRemote(PostCondition postCondition, PreCondition preCondition) {
        this.postCondition = postCondition;
        this.preCondition = preCondition;
    }

    public final PostCondition getPostCondition() {
        return this.postCondition;
    }

    public final PreCondition getPreCondition() {
        return this.preCondition;
    }

    /* compiled from: ChatsRootRemote.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote$PostCondition;", "", "paymentType", "", "trialOptions", "", "Lcom/ifriend/data/networking/api/chat/models/ChatInfoTypeValueRemote;", "paymentOptions", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getPaymentOptions", "()Ljava/util/List;", "getPaymentType", "()Ljava/lang/String;", "getTrialOptions", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PostCondition {
        @SerializedName("paymentOptions")
        private final List<ChatInfoTypeValueRemote> paymentOptions;
        @SerializedName("paymentType")
        private final String paymentType;
        @SerializedName("trialOptions")
        private final List<ChatInfoTypeValueRemote> trialOptions;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PostCondition copy$default(PostCondition postCondition, String str, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = postCondition.paymentType;
            }
            if ((i & 2) != 0) {
                list = postCondition.trialOptions;
            }
            if ((i & 4) != 0) {
                list2 = postCondition.paymentOptions;
            }
            return postCondition.copy(str, list, list2);
        }

        public final String component1() {
            return this.paymentType;
        }

        public final List<ChatInfoTypeValueRemote> component2() {
            return this.trialOptions;
        }

        public final List<ChatInfoTypeValueRemote> component3() {
            return this.paymentOptions;
        }

        public final PostCondition copy(String str, List<ChatInfoTypeValueRemote> list, List<ChatInfoTypeValueRemote> list2) {
            return new PostCondition(str, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PostCondition) {
                PostCondition postCondition = (PostCondition) obj;
                return Intrinsics.areEqual(this.paymentType, postCondition.paymentType) && Intrinsics.areEqual(this.trialOptions, postCondition.trialOptions) && Intrinsics.areEqual(this.paymentOptions, postCondition.paymentOptions);
            }
            return false;
        }

        public int hashCode() {
            String str = this.paymentType;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<ChatInfoTypeValueRemote> list = this.trialOptions;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<ChatInfoTypeValueRemote> list2 = this.paymentOptions;
            return hashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            String str = this.paymentType;
            List<ChatInfoTypeValueRemote> list = this.trialOptions;
            List<ChatInfoTypeValueRemote> list2 = this.paymentOptions;
            return "PostCondition(paymentType=" + str + ", trialOptions=" + list + ", paymentOptions=" + list2 + ")";
        }

        public PostCondition(String str, List<ChatInfoTypeValueRemote> list, List<ChatInfoTypeValueRemote> list2) {
            this.paymentType = str;
            this.trialOptions = list;
            this.paymentOptions = list2;
        }

        public final String getPaymentType() {
            return this.paymentType;
        }

        public final List<ChatInfoTypeValueRemote> getTrialOptions() {
            return this.trialOptions;
        }

        public final List<ChatInfoTypeValueRemote> getPaymentOptions() {
            return this.paymentOptions;
        }
    }

    /* compiled from: ChatsRootRemote.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote$PreCondition;", "", "paymentType", "", "paymentOptions", "", "Lcom/ifriend/data/networking/api/chat/models/ChatInfoTypeValueRemote;", "(Ljava/lang/String;Ljava/util/List;)V", "getPaymentOptions", "()Ljava/util/List;", "getPaymentType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PreCondition {
        @SerializedName("paymentOptions")
        private final List<ChatInfoTypeValueRemote> paymentOptions;
        @SerializedName("preCondition")
        private final String paymentType;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PreCondition copy$default(PreCondition preCondition, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preCondition.paymentType;
            }
            if ((i & 2) != 0) {
                list = preCondition.paymentOptions;
            }
            return preCondition.copy(str, list);
        }

        public final String component1() {
            return this.paymentType;
        }

        public final List<ChatInfoTypeValueRemote> component2() {
            return this.paymentOptions;
        }

        public final PreCondition copy(String str, List<ChatInfoTypeValueRemote> list) {
            return new PreCondition(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PreCondition) {
                PreCondition preCondition = (PreCondition) obj;
                return Intrinsics.areEqual(this.paymentType, preCondition.paymentType) && Intrinsics.areEqual(this.paymentOptions, preCondition.paymentOptions);
            }
            return false;
        }

        public int hashCode() {
            String str = this.paymentType;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<ChatInfoTypeValueRemote> list = this.paymentOptions;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.paymentType;
            List<ChatInfoTypeValueRemote> list = this.paymentOptions;
            return "PreCondition(paymentType=" + str + ", paymentOptions=" + list + ")";
        }

        public PreCondition(String str, List<ChatInfoTypeValueRemote> list) {
            this.paymentType = str;
            this.paymentOptions = list;
        }

        public final String getPaymentType() {
            return this.paymentType;
        }

        public final List<ChatInfoTypeValueRemote> getPaymentOptions() {
            return this.paymentOptions;
        }
    }
}
