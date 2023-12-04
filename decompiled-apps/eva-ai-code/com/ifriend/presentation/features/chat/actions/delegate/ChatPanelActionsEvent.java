package com.ifriend.presentation.features.chat.actions.delegate;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatPanelActionsEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/delegate/ChatPanelActionsEvent;", "", "OpenDiary", "StartCall", "Lcom/ifriend/presentation/features/chat/actions/delegate/ChatPanelActionsEvent$OpenDiary;", "Lcom/ifriend/presentation/features/chat/actions/delegate/ChatPanelActionsEvent$StartCall;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatPanelActionsEvent {

    /* compiled from: ChatPanelActionsEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/delegate/ChatPanelActionsEvent$OpenDiary;", "Lcom/ifriend/presentation/features/chat/actions/delegate/ChatPanelActionsEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OpenDiary implements ChatPanelActionsEvent {
        public static final int $stable = 0;
        public static final OpenDiary INSTANCE = new OpenDiary();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenDiary) {
                OpenDiary openDiary = (OpenDiary) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 574709633;
        }

        public String toString() {
            return "OpenDiary";
        }

        private OpenDiary() {
        }
    }

    /* compiled from: ChatPanelActionsEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/delegate/ChatPanelActionsEvent$StartCall;", "Lcom/ifriend/presentation/features/chat/actions/delegate/ChatPanelActionsEvent;", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class StartCall implements ChatPanelActionsEvent {
        public static final int $stable = 0;
        private final String chatId;

        public static /* synthetic */ StartCall copy$default(StartCall startCall, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startCall.chatId;
            }
            return startCall.copy(str);
        }

        public final String component1() {
            return this.chatId;
        }

        public final StartCall copy(String chatId) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            return new StartCall(chatId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartCall) && Intrinsics.areEqual(this.chatId, ((StartCall) obj).chatId);
        }

        public int hashCode() {
            return this.chatId.hashCode();
        }

        public String toString() {
            String str = this.chatId;
            return "StartCall(chatId=" + str + ")";
        }

        public StartCall(String chatId) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.chatId = chatId;
        }

        public final String getChatId() {
            return this.chatId;
        }
    }
}
