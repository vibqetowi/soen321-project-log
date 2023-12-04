package com.ifriend.presentation.features.chat.input.model;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatInputState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/ifriend/presentation/features/chat/input/model/ChatInputState;", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "messagePlaceholder", "isRecording", "", "isAudioReadyToSend", "timerLabel", "volumeDb", "", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;F)V", "()Z", "isReadyToSend", "isVisibleAttachmentsButtons", "isVisibleClearMessageButton", "isVisibleMessageTextField", "isVisibleSendMessageButton", "isVisibleSlideToCancel", "getMessage", "()Ljava/lang/String;", "getMessagePlaceholder", "getTimerLabel", "getVolumeDb", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputState {
    public static final int $stable = 0;
    private final boolean isAudioReadyToSend;
    private final boolean isReadyToSend;
    private final boolean isRecording;
    private final boolean isVisibleAttachmentsButtons;
    private final boolean isVisibleClearMessageButton;
    private final boolean isVisibleMessageTextField;
    private final boolean isVisibleSendMessageButton;
    private final boolean isVisibleSlideToCancel;
    private final String message;
    private final String messagePlaceholder;
    private final String timerLabel;
    private final float volumeDb;

    public ChatInputState() {
        this(null, null, false, false, null, 0.0f, 63, null);
    }

    public static /* synthetic */ ChatInputState copy$default(ChatInputState chatInputState, String str, String str2, boolean z, boolean z2, String str3, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatInputState.message;
        }
        if ((i & 2) != 0) {
            str2 = chatInputState.messagePlaceholder;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = chatInputState.isRecording;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = chatInputState.isAudioReadyToSend;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str3 = chatInputState.timerLabel;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            f = chatInputState.volumeDb;
        }
        return chatInputState.copy(str, str4, z3, z4, str5, f);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.messagePlaceholder;
    }

    public final boolean component3() {
        return this.isRecording;
    }

    public final boolean component4() {
        return this.isAudioReadyToSend;
    }

    public final String component5() {
        return this.timerLabel;
    }

    public final float component6() {
        return this.volumeDb;
    }

    public final ChatInputState copy(String message, String messagePlaceholder, boolean z, boolean z2, String timerLabel, float f) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messagePlaceholder, "messagePlaceholder");
        Intrinsics.checkNotNullParameter(timerLabel, "timerLabel");
        return new ChatInputState(message, messagePlaceholder, z, z2, timerLabel, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatInputState) {
            ChatInputState chatInputState = (ChatInputState) obj;
            return Intrinsics.areEqual(this.message, chatInputState.message) && Intrinsics.areEqual(this.messagePlaceholder, chatInputState.messagePlaceholder) && this.isRecording == chatInputState.isRecording && this.isAudioReadyToSend == chatInputState.isAudioReadyToSend && Intrinsics.areEqual(this.timerLabel, chatInputState.timerLabel) && Float.compare(this.volumeDb, chatInputState.volumeDb) == 0;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.message.hashCode() * 31) + this.messagePlaceholder.hashCode()) * 31;
        boolean z = this.isRecording;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isAudioReadyToSend;
        return ((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.timerLabel.hashCode()) * 31) + Float.floatToIntBits(this.volumeDb);
    }

    public String toString() {
        String str = this.message;
        String str2 = this.messagePlaceholder;
        boolean z = this.isRecording;
        boolean z2 = this.isAudioReadyToSend;
        String str3 = this.timerLabel;
        float f = this.volumeDb;
        return "ChatInputState(message=" + str + ", messagePlaceholder=" + str2 + ", isRecording=" + z + ", isAudioReadyToSend=" + z2 + ", timerLabel=" + str3 + ", volumeDb=" + f + ")";
    }

    public ChatInputState(String message, String messagePlaceholder, boolean z, boolean z2, String timerLabel, float f) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messagePlaceholder, "messagePlaceholder");
        Intrinsics.checkNotNullParameter(timerLabel, "timerLabel");
        this.message = message;
        this.messagePlaceholder = messagePlaceholder;
        this.isRecording = z;
        this.isAudioReadyToSend = z2;
        this.timerLabel = timerLabel;
        this.volumeDb = f;
        this.isVisibleAttachmentsButtons = (!(message.length() == 0) || z || z2) ? false : true;
        this.isVisibleMessageTextField = (z || z2) ? false : true;
        this.isVisibleSlideToCancel = z;
        boolean z3 = ((message.length() > 0) || z2) && !z;
        this.isReadyToSend = z3;
        this.isVisibleClearMessageButton = z3;
        this.isVisibleSendMessageButton = z3;
    }

    public /* synthetic */ ChatInputState(String str, String str2, boolean z, boolean z2, String str3, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) == 0 ? str3 : "", (i & 32) != 0 ? 0.0f : f);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessagePlaceholder() {
        return this.messagePlaceholder;
    }

    public final boolean isRecording() {
        return this.isRecording;
    }

    public final boolean isAudioReadyToSend() {
        return this.isAudioReadyToSend;
    }

    public final String getTimerLabel() {
        return this.timerLabel;
    }

    public final float getVolumeDb() {
        return this.volumeDb;
    }

    public final boolean isVisibleAttachmentsButtons() {
        return this.isVisibleAttachmentsButtons;
    }

    public final boolean isVisibleMessageTextField() {
        return this.isVisibleMessageTextField;
    }

    public final boolean isVisibleSlideToCancel() {
        return this.isVisibleSlideToCancel;
    }

    public final boolean isVisibleClearMessageButton() {
        return this.isVisibleClearMessageButton;
    }

    public final boolean isVisibleSendMessageButton() {
        return this.isVisibleSendMessageButton;
    }
}
