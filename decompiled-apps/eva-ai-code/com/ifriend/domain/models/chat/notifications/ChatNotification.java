package com.ifriend.domain.models.chat.notifications;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatNotification.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/ifriend/domain/models/chat/notifications/ChatNotification;", "", "id", "", "chatId", "name", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content;", "avatarUrl", "messageInfo", "Lcom/ifriend/domain/newChat/chat/models/MessageInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content;Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/models/MessageInfo;)V", "getAvatarUrl", "()Ljava/lang/String;", "getChatId", "getContent", "()Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content;", "getId", "getMessageInfo", "()Lcom/ifriend/domain/newChat/chat/models/MessageInfo;", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Content", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatNotification {
    private final String avatarUrl;
    private final String chatId;
    private final Content content;
    private final String id;
    private final MessageInfo messageInfo;
    private final String name;

    public static /* synthetic */ ChatNotification copy$default(ChatNotification chatNotification, String str, String str2, String str3, Content content, String str4, MessageInfo messageInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatNotification.id;
        }
        if ((i & 2) != 0) {
            str2 = chatNotification.chatId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = chatNotification.name;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            content = chatNotification.content;
        }
        Content content2 = content;
        if ((i & 16) != 0) {
            str4 = chatNotification.avatarUrl;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            messageInfo = chatNotification.messageInfo;
        }
        return chatNotification.copy(str, str5, str6, content2, str7, messageInfo);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.chatId;
    }

    public final String component3() {
        return this.name;
    }

    public final Content component4() {
        return this.content;
    }

    public final String component5() {
        return this.avatarUrl;
    }

    public final MessageInfo component6() {
        return this.messageInfo;
    }

    public final ChatNotification copy(String id, String chatId, String name, Content content, String avatarUrl, MessageInfo messageInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(messageInfo, "messageInfo");
        return new ChatNotification(id, chatId, name, content, avatarUrl, messageInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatNotification) {
            ChatNotification chatNotification = (ChatNotification) obj;
            return Intrinsics.areEqual(this.id, chatNotification.id) && Intrinsics.areEqual(this.chatId, chatNotification.chatId) && Intrinsics.areEqual(this.name, chatNotification.name) && Intrinsics.areEqual(this.content, chatNotification.content) && Intrinsics.areEqual(this.avatarUrl, chatNotification.avatarUrl) && Intrinsics.areEqual(this.messageInfo, chatNotification.messageInfo);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.chatId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.content.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.messageInfo.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.chatId;
        String str3 = this.name;
        Content content = this.content;
        String str4 = this.avatarUrl;
        MessageInfo messageInfo = this.messageInfo;
        return "ChatNotification(id=" + str + ", chatId=" + str2 + ", name=" + str3 + ", content=" + content + ", avatarUrl=" + str4 + ", messageInfo=" + messageInfo + ")";
    }

    public ChatNotification(String id, String chatId, String name, Content content, String avatarUrl, MessageInfo messageInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(messageInfo, "messageInfo");
        this.id = id;
        this.chatId = chatId;
        this.name = name;
        this.content = content;
        this.avatarUrl = avatarUrl;
        this.messageInfo = messageInfo;
    }

    public final String getId() {
        return this.id;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getName() {
        return this.name;
    }

    public final Content getContent() {
        return this.content;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final MessageInfo getMessageInfo() {
        return this.messageInfo;
    }

    /* compiled from: ChatNotification.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content;", "", "Audio", "EndCall", "Image", "Text", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content$Audio;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content$EndCall;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content$Image;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content$Text;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Content {

        /* compiled from: ChatNotification.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content$Audio;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Audio implements Content {
            public static final Audio INSTANCE = new Audio();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Audio) {
                    Audio audio = (Audio) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1806528860;
            }

            public String toString() {
                return "Audio";
            }

            private Audio() {
            }
        }

        /* compiled from: ChatNotification.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content$EndCall;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class EndCall implements Content {
            public static final EndCall INSTANCE = new EndCall();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof EndCall) {
                    EndCall endCall = (EndCall) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1853945561;
            }

            public String toString() {
                return "EndCall";
            }

            private EndCall() {
            }
        }

        /* compiled from: ChatNotification.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content$Image;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Image implements Content {
            private final String url;

            public static /* synthetic */ Image copy$default(Image image, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = image.url;
                }
                return image.copy(str);
            }

            public final String component1() {
                return this.url;
            }

            public final Image copy(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new Image(url);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Image) && Intrinsics.areEqual(this.url, ((Image) obj).url);
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                String str = this.url;
                return "Image(url=" + str + ")";
            }

            public Image(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public final String getUrl() {
                return this.url;
            }
        }

        /* compiled from: ChatNotification.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content$Text;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification$Content;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Text implements Content {
            private final String text;

            public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = text.text;
                }
                return text.copy(str);
            }

            public final String component1() {
                return this.text;
            }

            public final Text copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Text(text);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Text) && Intrinsics.areEqual(this.text, ((Text) obj).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                String str = this.text;
                return "Text(text=" + str + ")";
            }

            public Text(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }
    }
}
