package com.ifriend.data.networking.datasources.chat.models.response.client;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatMessageRemote.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatAutomationMessageRemote;", "", "product", "", "bot", "needVerification", "", "topicName", "topicId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getBot", "()Ljava/lang/String;", "getNeedVerification", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProduct", "getTopicId", "getTopicName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatAutomationMessageRemote;", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatAutomationMessageRemote {
    @SerializedName("bot")
    private final String bot;
    @SerializedName("needVerification")
    private final Boolean needVerification;
    @SerializedName("product")
    private final String product;
    @SerializedName("topicId")
    private final String topicId;
    @SerializedName("topicName")
    private final String topicName;

    public static /* synthetic */ ChatAutomationMessageRemote copy$default(ChatAutomationMessageRemote chatAutomationMessageRemote, String str, String str2, Boolean bool, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatAutomationMessageRemote.product;
        }
        if ((i & 2) != 0) {
            str2 = chatAutomationMessageRemote.bot;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            bool = chatAutomationMessageRemote.needVerification;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str3 = chatAutomationMessageRemote.topicName;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = chatAutomationMessageRemote.topicId;
        }
        return chatAutomationMessageRemote.copy(str, str5, bool2, str6, str4);
    }

    public final String component1() {
        return this.product;
    }

    public final String component2() {
        return this.bot;
    }

    public final Boolean component3() {
        return this.needVerification;
    }

    public final String component4() {
        return this.topicName;
    }

    public final String component5() {
        return this.topicId;
    }

    public final ChatAutomationMessageRemote copy(String product, String str, Boolean bool, String str2, String str3) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new ChatAutomationMessageRemote(product, str, bool, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatAutomationMessageRemote) {
            ChatAutomationMessageRemote chatAutomationMessageRemote = (ChatAutomationMessageRemote) obj;
            return Intrinsics.areEqual(this.product, chatAutomationMessageRemote.product) && Intrinsics.areEqual(this.bot, chatAutomationMessageRemote.bot) && Intrinsics.areEqual(this.needVerification, chatAutomationMessageRemote.needVerification) && Intrinsics.areEqual(this.topicName, chatAutomationMessageRemote.topicName) && Intrinsics.areEqual(this.topicId, chatAutomationMessageRemote.topicId);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.product.hashCode() * 31;
        String str = this.bot;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.needVerification;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.topicName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topicId;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.product;
        String str2 = this.bot;
        Boolean bool = this.needVerification;
        String str3 = this.topicName;
        String str4 = this.topicId;
        return "ChatAutomationMessageRemote(product=" + str + ", bot=" + str2 + ", needVerification=" + bool + ", topicName=" + str3 + ", topicId=" + str4 + ")";
    }

    public ChatAutomationMessageRemote(String product, String str, Boolean bool, String str2, String str3) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.product = product;
        this.bot = str;
        this.needVerification = bool;
        this.topicName = str2;
        this.topicId = str3;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getBot() {
        return this.bot;
    }

    public final Boolean getNeedVerification() {
        return this.needVerification;
    }

    public final String getTopicName() {
        return this.topicName;
    }

    public final String getTopicId() {
        return this.topicId;
    }
}
