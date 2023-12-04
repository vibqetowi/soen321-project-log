package com.ifriend.chat.new_chat.list.player;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioMedia.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioMessage;", "Lcom/ifriend/chat/new_chat/list/player/AudioMedia;", "audioUrl", "Landroid/net/Uri;", "messageId", "", "isFromUser", "", "audioText", "(Landroid/net/Uri;Ljava/lang/String;ZLjava/lang/String;)V", "getAudioText", "()Ljava/lang/String;", "getAudioUrl", "()Landroid/net/Uri;", "()Z", "getMessageId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioMessage extends AudioMedia {
    public static final int $stable = 8;
    private final String audioText;
    private final Uri audioUrl;
    private final boolean isFromUser;
    private final String messageId;

    public static /* synthetic */ AudioMessage copy$default(AudioMessage audioMessage, Uri uri, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = audioMessage.audioUrl;
        }
        if ((i & 2) != 0) {
            str = audioMessage.messageId;
        }
        if ((i & 4) != 0) {
            z = audioMessage.isFromUser;
        }
        if ((i & 8) != 0) {
            str2 = audioMessage.audioText;
        }
        return audioMessage.copy(uri, str, z, str2);
    }

    public final Uri component1() {
        return this.audioUrl;
    }

    public final String component2() {
        return this.messageId;
    }

    public final boolean component3() {
        return this.isFromUser;
    }

    public final String component4() {
        return this.audioText;
    }

    public final AudioMessage copy(Uri audioUrl, String messageId, boolean z, String audioText) {
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(audioText, "audioText");
        return new AudioMessage(audioUrl, messageId, z, audioText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioMessage) {
            AudioMessage audioMessage = (AudioMessage) obj;
            return Intrinsics.areEqual(this.audioUrl, audioMessage.audioUrl) && Intrinsics.areEqual(this.messageId, audioMessage.messageId) && this.isFromUser == audioMessage.isFromUser && Intrinsics.areEqual(this.audioText, audioMessage.audioText);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.audioUrl.hashCode() * 31) + this.messageId.hashCode()) * 31;
        boolean z = this.isFromUser;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.audioText.hashCode();
    }

    public String toString() {
        Uri uri = this.audioUrl;
        String str = this.messageId;
        boolean z = this.isFromUser;
        String str2 = this.audioText;
        return "AudioMessage(audioUrl=" + uri + ", messageId=" + str + ", isFromUser=" + z + ", audioText=" + str2 + ")";
    }

    @Override // com.ifriend.chat.new_chat.list.player.AudioMedia
    public Uri getAudioUrl() {
        return this.audioUrl;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final boolean isFromUser() {
        return this.isFromUser;
    }

    public final String getAudioText() {
        return this.audioText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioMessage(Uri audioUrl, String messageId, boolean z, String audioText) {
        super(audioUrl, null);
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(audioText, "audioText");
        this.audioUrl = audioUrl;
        this.messageId = messageId;
        this.isFromUser = z;
        this.audioText = audioText;
    }
}
