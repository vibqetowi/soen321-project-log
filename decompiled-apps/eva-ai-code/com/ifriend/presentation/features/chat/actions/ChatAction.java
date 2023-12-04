package com.ifriend.presentation.features.chat.actions;

import com.facebook.internal.NativeProtocol;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction;", "", "GiftClick", "GiftsCloseClick", "NightButtonPermissionGranted", "NightButtonRemindClicked", "OpenGiftsClick", "PaidAction", "StopRecording", "SubscriptionBadgeClick", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$GiftClick;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$GiftsCloseClick;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$NightButtonPermissionGranted;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$NightButtonRemindClicked;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$OpenGiftsClick;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$StopRecording;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$SubscriptionBadgeClick;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatAction {

    /* compiled from: ChatAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction;", "SendImageClick", "SendTextMessage", "StartRecording", "TopicClick", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction$SendImageClick;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction$SendTextMessage;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction$StartRecording;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction$TopicClick;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface PaidAction extends ChatAction {

        /* compiled from: ChatAction.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction$TopicClick;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "(Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;)V", "getAction", "()Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class TopicClick implements PaidAction {
            public static final int $stable = 8;
            private final ChatPanelActionMarker action;

            public static /* synthetic */ TopicClick copy$default(TopicClick topicClick, ChatPanelActionMarker chatPanelActionMarker, int i, Object obj) {
                if ((i & 1) != 0) {
                    chatPanelActionMarker = topicClick.action;
                }
                return topicClick.copy(chatPanelActionMarker);
            }

            public final ChatPanelActionMarker component1() {
                return this.action;
            }

            public final TopicClick copy(ChatPanelActionMarker action) {
                Intrinsics.checkNotNullParameter(action, "action");
                return new TopicClick(action);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TopicClick) && Intrinsics.areEqual(this.action, ((TopicClick) obj).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                ChatPanelActionMarker chatPanelActionMarker = this.action;
                return "TopicClick(action=" + chatPanelActionMarker + ")";
            }

            public TopicClick(ChatPanelActionMarker action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public final ChatPanelActionMarker getAction() {
                return this.action;
            }
        }

        /* compiled from: ChatAction.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction$SendTextMessage;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class SendTextMessage implements PaidAction {
            public static final int $stable = 0;
            public static final SendTextMessage INSTANCE = new SendTextMessage();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SendTextMessage) {
                    SendTextMessage sendTextMessage = (SendTextMessage) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1709224816;
            }

            public String toString() {
                return "SendTextMessage";
            }

            private SendTextMessage() {
            }
        }

        /* compiled from: ChatAction.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction$StartRecording;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class StartRecording implements PaidAction {
            public static final int $stable = 0;
            public static final StartRecording INSTANCE = new StartRecording();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof StartRecording) {
                    StartRecording startRecording = (StartRecording) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1777952977;
            }

            public String toString() {
                return "StartRecording";
            }

            private StartRecording() {
            }
        }

        /* compiled from: ChatAction.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction$SendImageClick;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class SendImageClick implements PaidAction {
            public static final int $stable = 0;
            public static final SendImageClick INSTANCE = new SendImageClick();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SendImageClick) {
                    SendImageClick sendImageClick = (SendImageClick) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1797418935;
            }

            public String toString() {
                return "SendImageClick";
            }

            private SendImageClick() {
            }
        }
    }

    /* compiled from: ChatAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$StopRecording;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction;", "send", "", "(Z)V", "getSend", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class StopRecording implements ChatAction {
        public static final int $stable = 0;
        private final boolean send;

        public static /* synthetic */ StopRecording copy$default(StopRecording stopRecording, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = stopRecording.send;
            }
            return stopRecording.copy(z);
        }

        public final boolean component1() {
            return this.send;
        }

        public final StopRecording copy(boolean z) {
            return new StopRecording(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopRecording) && this.send == ((StopRecording) obj).send;
        }

        public int hashCode() {
            boolean z = this.send;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.send;
            return "StopRecording(send=" + z + ")";
        }

        public StopRecording(boolean z) {
            this.send = z;
        }

        public final boolean getSend() {
            return this.send;
        }
    }

    /* compiled from: ChatAction.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$GiftClick;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction;", "gift", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;", "(Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;)V", "getGift", "()Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class GiftClick implements ChatAction {
        public static final int $stable = 0;
        private final ChatGiftUi gift;

        public static /* synthetic */ GiftClick copy$default(GiftClick giftClick, ChatGiftUi chatGiftUi, int i, Object obj) {
            if ((i & 1) != 0) {
                chatGiftUi = giftClick.gift;
            }
            return giftClick.copy(chatGiftUi);
        }

        public final ChatGiftUi component1() {
            return this.gift;
        }

        public final GiftClick copy(ChatGiftUi gift) {
            Intrinsics.checkNotNullParameter(gift, "gift");
            return new GiftClick(gift);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GiftClick) && Intrinsics.areEqual(this.gift, ((GiftClick) obj).gift);
        }

        public int hashCode() {
            return this.gift.hashCode();
        }

        public String toString() {
            ChatGiftUi chatGiftUi = this.gift;
            return "GiftClick(gift=" + chatGiftUi + ")";
        }

        public GiftClick(ChatGiftUi gift) {
            Intrinsics.checkNotNullParameter(gift, "gift");
            this.gift = gift;
        }

        public final ChatGiftUi getGift() {
            return this.gift;
        }
    }

    /* compiled from: ChatAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$GiftsCloseClick;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class GiftsCloseClick implements ChatAction {
        public static final int $stable = 0;
        public static final GiftsCloseClick INSTANCE = new GiftsCloseClick();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof GiftsCloseClick) {
                GiftsCloseClick giftsCloseClick = (GiftsCloseClick) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -40498871;
        }

        public String toString() {
            return "GiftsCloseClick";
        }

        private GiftsCloseClick() {
        }
    }

    /* compiled from: ChatAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$OpenGiftsClick;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OpenGiftsClick implements ChatAction {
        public static final int $stable = 0;
        public static final OpenGiftsClick INSTANCE = new OpenGiftsClick();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenGiftsClick) {
                OpenGiftsClick openGiftsClick = (OpenGiftsClick) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -710892551;
        }

        public String toString() {
            return "OpenGiftsClick";
        }

        private OpenGiftsClick() {
        }
    }

    /* compiled from: ChatAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$SubscriptionBadgeClick;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SubscriptionBadgeClick implements ChatAction {
        public static final int $stable = 0;
        public static final SubscriptionBadgeClick INSTANCE = new SubscriptionBadgeClick();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubscriptionBadgeClick) {
                SubscriptionBadgeClick subscriptionBadgeClick = (SubscriptionBadgeClick) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -970842452;
        }

        public String toString() {
            return "SubscriptionBadgeClick";
        }

        private SubscriptionBadgeClick() {
        }
    }

    /* compiled from: ChatAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$NightButtonRemindClicked;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NightButtonRemindClicked implements ChatAction {
        public static final int $stable = 0;
        public static final NightButtonRemindClicked INSTANCE = new NightButtonRemindClicked();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof NightButtonRemindClicked) {
                NightButtonRemindClicked nightButtonRemindClicked = (NightButtonRemindClicked) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1466979746;
        }

        public String toString() {
            return "NightButtonRemindClicked";
        }

        private NightButtonRemindClicked() {
        }
    }

    /* compiled from: ChatAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatAction$NightButtonPermissionGranted;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction;", "granted", "", "(Z)V", "getGranted", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NightButtonPermissionGranted implements ChatAction {
        public static final int $stable = 0;
        private final boolean granted;

        public static /* synthetic */ NightButtonPermissionGranted copy$default(NightButtonPermissionGranted nightButtonPermissionGranted, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = nightButtonPermissionGranted.granted;
            }
            return nightButtonPermissionGranted.copy(z);
        }

        public final boolean component1() {
            return this.granted;
        }

        public final NightButtonPermissionGranted copy(boolean z) {
            return new NightButtonPermissionGranted(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NightButtonPermissionGranted) && this.granted == ((NightButtonPermissionGranted) obj).granted;
        }

        public int hashCode() {
            boolean z = this.granted;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.granted;
            return "NightButtonPermissionGranted(granted=" + z + ")";
        }

        public NightButtonPermissionGranted(boolean z) {
            this.granted = z;
        }

        public final boolean getGranted() {
            return this.granted;
        }
    }
}
