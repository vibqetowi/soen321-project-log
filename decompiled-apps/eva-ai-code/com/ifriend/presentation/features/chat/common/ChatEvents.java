package com.ifriend.presentation.features.chat.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatEventsObserver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ifriend/presentation/features/chat/common/ChatEvents;", "", "BackPressed", "PaidTextMessageClick", "PhotoClick", "ShowKeyboard", "Lcom/ifriend/presentation/features/chat/common/ChatEvents$BackPressed;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents$PaidTextMessageClick;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents$PhotoClick;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents$ShowKeyboard;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatEvents {

    /* compiled from: ChatEventsObserver.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/common/ChatEvents$BackPressed;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BackPressed implements ChatEvents {
        public static final int $stable = 0;
        public static final BackPressed INSTANCE = new BackPressed();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BackPressed) {
                BackPressed backPressed = (BackPressed) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 669123004;
        }

        public String toString() {
            return "BackPressed";
        }

        private BackPressed() {
        }
    }

    /* compiled from: ChatEventsObserver.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/common/ChatEvents$ShowKeyboard;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ShowKeyboard implements ChatEvents {
        public static final int $stable = 0;
        public static final ShowKeyboard INSTANCE = new ShowKeyboard();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ShowKeyboard) {
                ShowKeyboard showKeyboard = (ShowKeyboard) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 975843747;
        }

        public String toString() {
            return "ShowKeyboard";
        }

        private ShowKeyboard() {
        }
    }

    /* compiled from: ChatEventsObserver.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chat/common/ChatEvents$PhotoClick;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents;", "messageId", "", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PhotoClick implements ChatEvents {
        public static final int $stable = 0;
        private final String messageId;

        public static /* synthetic */ PhotoClick copy$default(PhotoClick photoClick, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = photoClick.messageId;
            }
            return photoClick.copy(str);
        }

        public final String component1() {
            return this.messageId;
        }

        public final PhotoClick copy(String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            return new PhotoClick(messageId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhotoClick) && Intrinsics.areEqual(this.messageId, ((PhotoClick) obj).messageId);
        }

        public int hashCode() {
            return this.messageId.hashCode();
        }

        public String toString() {
            String str = this.messageId;
            return "PhotoClick(messageId=" + str + ")";
        }

        public PhotoClick(String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            this.messageId = messageId;
        }

        public final String getMessageId() {
            return this.messageId;
        }
    }

    /* compiled from: ChatEventsObserver.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chat/common/ChatEvents$PaidTextMessageClick;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents;", "messageId", "", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PaidTextMessageClick implements ChatEvents {
        public static final int $stable = 0;
        private final String messageId;

        public static /* synthetic */ PaidTextMessageClick copy$default(PaidTextMessageClick paidTextMessageClick, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paidTextMessageClick.messageId;
            }
            return paidTextMessageClick.copy(str);
        }

        public final String component1() {
            return this.messageId;
        }

        public final PaidTextMessageClick copy(String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            return new PaidTextMessageClick(messageId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaidTextMessageClick) && Intrinsics.areEqual(this.messageId, ((PaidTextMessageClick) obj).messageId);
        }

        public int hashCode() {
            return this.messageId.hashCode();
        }

        public String toString() {
            String str = this.messageId;
            return "PaidTextMessageClick(messageId=" + str + ")";
        }

        public PaidTextMessageClick(String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            this.messageId = messageId;
        }

        public final String getMessageId() {
            return this.messageId;
        }
    }
}
