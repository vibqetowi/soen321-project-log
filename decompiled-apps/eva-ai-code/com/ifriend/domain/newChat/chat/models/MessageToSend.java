package com.ifriend.domain.newChat.chat.models;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.ifriend.domain.config.ConfigKeys;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessageToSend.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "", "Audio", "ErrorWhileSending", "Gift", "Image", "SendingResult", "Text", "UserIsNotAuthorizedError", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Audio;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Gift;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Image;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Text;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MessageToSend {

    /* compiled from: MessageToSend.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult;", "", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/models/MessageTag;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getTag", "()Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "Error", "Success", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Error;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Success;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class SendingResult {
        private final String chatId;
        private final MessageTag tag;

        public /* synthetic */ SendingResult(MessageTag messageTag, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(messageTag, str);
        }

        /* compiled from: MessageToSend.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Error;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult;", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", ConfigKeys.CLIENT_ID, "", "(Lcom/ifriend/domain/newChat/chat/models/MessageTag;Ljava/lang/String;)V", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Audio$NothingToSend;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$ErrorWhileSending;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Image$IncorrectImageFormat;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Image$UnableToSendImage;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$UserIsNotAuthorizedError;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static abstract class Error extends SendingResult {
            public /* synthetic */ Error(MessageTag messageTag, String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(messageTag, str);
            }

            private Error(MessageTag messageTag, String str) {
                super(messageTag, str, null);
            }
        }

        private SendingResult(MessageTag messageTag, String str) {
            this.tag = messageTag;
            this.chatId = str;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final MessageTag getTag() {
            return this.tag;
        }

        /* compiled from: MessageToSend.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Success;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult;", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", ConfigKeys.CLIENT_ID, "", "(Lcom/ifriend/domain/newChat/chat/models/MessageTag;Ljava/lang/String;)V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Success extends SendingResult {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(MessageTag tag, String clientId) {
                super(tag, clientId, null);
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(clientId, "clientId");
            }
        }
    }

    /* compiled from: MessageToSend.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$ErrorWhileSending;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Error;", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/models/MessageTag;Ljava/lang/String;)V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ErrorWhileSending extends SendingResult.Error {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorWhileSending(MessageTag tag, String chatId) {
            super(tag, chatId, null);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
        }
    }

    /* compiled from: MessageToSend.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$UserIsNotAuthorizedError;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Error;", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/models/MessageTag;Ljava/lang/String;)V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserIsNotAuthorizedError extends SendingResult.Error {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserIsNotAuthorizedError(MessageTag tag, String chatId) {
            super(tag, chatId, null);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
        }
    }

    /* compiled from: MessageToSend.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Audio;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "chatId", "", "(Ljava/io/File;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getFile", "()Ljava/io/File;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "NothingToSend", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Audio implements MessageToSend {
        private final String chatId;
        private final File file;

        public static /* synthetic */ Audio copy$default(Audio audio, File file, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                file = audio.file;
            }
            if ((i & 2) != 0) {
                str = audio.chatId;
            }
            return audio.copy(file, str);
        }

        public final File component1() {
            return this.file;
        }

        public final String component2() {
            return this.chatId;
        }

        public final Audio copy(File file, String chatId) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            return new Audio(file, chatId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Audio) {
                Audio audio = (Audio) obj;
                return Intrinsics.areEqual(this.file, audio.file) && Intrinsics.areEqual(this.chatId, audio.chatId);
            }
            return false;
        }

        public int hashCode() {
            return (this.file.hashCode() * 31) + this.chatId.hashCode();
        }

        public String toString() {
            File file = this.file;
            String str = this.chatId;
            return "Audio(file=" + file + ", chatId=" + str + ")";
        }

        /* compiled from: MessageToSend.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Audio$NothingToSend;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Error;", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/models/MessageTag;Ljava/lang/String;)V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class NothingToSend extends SendingResult.Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NothingToSend(MessageTag tag, String chatId) {
                super(tag, chatId, null);
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(chatId, "chatId");
            }
        }

        public Audio(File file, String chatId) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.file = file;
            this.chatId = chatId;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final File getFile() {
            return this.file;
        }
    }

    /* compiled from: MessageToSend.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Text;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "text", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Text implements MessageToSend {
        private final String chatId;
        private final String text;

        public static /* synthetic */ Text copy$default(Text text, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            if ((i & 2) != 0) {
                str2 = text.chatId;
            }
            return text.copy(str, str2);
        }

        public final String component1() {
            return this.text;
        }

        public final String component2() {
            return this.chatId;
        }

        public final Text copy(String text, String chatId) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            return new Text(text, chatId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Text) {
                Text text = (Text) obj;
                return Intrinsics.areEqual(this.text, text.text) && Intrinsics.areEqual(this.chatId, text.chatId);
            }
            return false;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.chatId.hashCode();
        }

        public String toString() {
            String str = this.text;
            String str2 = this.chatId;
            return "Text(text=" + str + ", chatId=" + str2 + ")";
        }

        public Text(String text, String chatId) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.text = text;
            this.chatId = chatId;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: MessageToSend.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Image;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "chatId", "", "(Ljava/io/File;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getFile", "()Ljava/io/File;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "IncorrectImageFormat", "UnableToSendImage", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Image implements MessageToSend {
        private final String chatId;
        private final File file;

        public static /* synthetic */ Image copy$default(Image image, File file, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                file = image.file;
            }
            if ((i & 2) != 0) {
                str = image.chatId;
            }
            return image.copy(file, str);
        }

        public final File component1() {
            return this.file;
        }

        public final String component2() {
            return this.chatId;
        }

        public final Image copy(File file, String chatId) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            return new Image(file, chatId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Image) {
                Image image = (Image) obj;
                return Intrinsics.areEqual(this.file, image.file) && Intrinsics.areEqual(this.chatId, image.chatId);
            }
            return false;
        }

        public int hashCode() {
            return (this.file.hashCode() * 31) + this.chatId.hashCode();
        }

        public String toString() {
            File file = this.file;
            String str = this.chatId;
            return "Image(file=" + file + ", chatId=" + str + ")";
        }

        public Image(File file, String chatId) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.file = file;
            this.chatId = chatId;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final File getFile() {
            return this.file;
        }

        /* compiled from: MessageToSend.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Image$IncorrectImageFormat;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Error;", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/models/MessageTag;Ljava/lang/String;)V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class IncorrectImageFormat extends SendingResult.Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IncorrectImageFormat(MessageTag tag, String chatId) {
                super(tag, chatId, null);
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(chatId, "chatId");
            }
        }

        /* compiled from: MessageToSend.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Image$UnableToSendImage;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Error;", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/models/MessageTag;Ljava/lang/String;)V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class UnableToSendImage extends SendingResult.Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnableToSendImage(MessageTag tag, String chatId) {
                super(tag, chatId, null);
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(chatId, "chatId");
            }
        }
    }

    /* compiled from: MessageToSend.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Gift;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "giftId", "", "imageUrl", "chatId", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getGiftId", "getImageUrl", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Gift implements MessageToSend {
        private final String chatId;
        private final String giftId;
        private final String imageUrl;
        private final String userId;

        public static /* synthetic */ Gift copy$default(Gift gift, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gift.giftId;
            }
            if ((i & 2) != 0) {
                str2 = gift.imageUrl;
            }
            if ((i & 4) != 0) {
                str3 = gift.chatId;
            }
            if ((i & 8) != 0) {
                str4 = gift.userId;
            }
            return gift.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.giftId;
        }

        public final String component2() {
            return this.imageUrl;
        }

        public final String component3() {
            return this.chatId;
        }

        public final String component4() {
            return this.userId;
        }

        public final Gift copy(String giftId, String imageUrl, String chatId, String userId) {
            Intrinsics.checkNotNullParameter(giftId, "giftId");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            return new Gift(giftId, imageUrl, chatId, userId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Gift) {
                Gift gift = (Gift) obj;
                return Intrinsics.areEqual(this.giftId, gift.giftId) && Intrinsics.areEqual(this.imageUrl, gift.imageUrl) && Intrinsics.areEqual(this.chatId, gift.chatId) && Intrinsics.areEqual(this.userId, gift.userId);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.giftId.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.chatId.hashCode()) * 31) + this.userId.hashCode();
        }

        public String toString() {
            String str = this.giftId;
            String str2 = this.imageUrl;
            String str3 = this.chatId;
            String str4 = this.userId;
            return "Gift(giftId=" + str + ", imageUrl=" + str2 + ", chatId=" + str3 + ", userId=" + str4 + ")";
        }

        public Gift(String giftId, String imageUrl, String chatId, String userId) {
            Intrinsics.checkNotNullParameter(giftId, "giftId");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.giftId = giftId;
            this.imageUrl = imageUrl;
            this.chatId = chatId;
            this.userId = userId;
        }

        public final String getGiftId() {
            return this.giftId;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final String getUserId() {
            return this.userId;
        }
    }
}
