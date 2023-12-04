package com.ifriend.chat.new_chat.list.ui.model;

import android.net.Uri;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioStatusComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioMessageUiModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUserUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUiModel;", ViewHierarchyConstants.TAG_KEY, "", "audioUri", "Landroid/net/Uri;", "histogram", "", "playbackStatus", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "isSending", "", "payload", "", "(Ljava/lang/String;Landroid/net/Uri;ILcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;ZLjava/lang/Object;)V", "(Ljava/lang/String;Landroid/net/Uri;ILcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;Z)V", "_payload", "getAudioUri", "()Landroid/net/Uri;", "getHistogram", "()I", "()Z", "getPayload", "()Ljava/lang/Object;", "getPlaybackStatus", "()Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioMessageUserUiModel extends AudioMessageUiModel {
    public static final int $stable = 8;
    private Object _payload;
    private final Uri audioUri;
    private final int histogram;
    private final boolean isSending;
    private final AudioStatusComponent.PlaybackStatus playbackStatus;
    private final String tag;

    public static /* synthetic */ AudioMessageUserUiModel copy$default(AudioMessageUserUiModel audioMessageUserUiModel, String str, Uri uri, int i, AudioStatusComponent.PlaybackStatus playbackStatus, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = audioMessageUserUiModel.tag;
        }
        if ((i2 & 2) != 0) {
            uri = audioMessageUserUiModel.audioUri;
        }
        Uri uri2 = uri;
        if ((i2 & 4) != 0) {
            i = audioMessageUserUiModel.histogram;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            playbackStatus = audioMessageUserUiModel.playbackStatus;
        }
        AudioStatusComponent.PlaybackStatus playbackStatus2 = playbackStatus;
        if ((i2 & 16) != 0) {
            z = audioMessageUserUiModel.isSending;
        }
        return audioMessageUserUiModel.copy(str, uri2, i3, playbackStatus2, z);
    }

    public final String component1() {
        return this.tag;
    }

    public final Uri component2() {
        return this.audioUri;
    }

    public final int component3() {
        return this.histogram;
    }

    public final AudioStatusComponent.PlaybackStatus component4() {
        return this.playbackStatus;
    }

    public final boolean component5() {
        return this.isSending;
    }

    public final AudioMessageUserUiModel copy(String tag, Uri audioUri, int i, AudioStatusComponent.PlaybackStatus playbackStatus, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(audioUri, "audioUri");
        Intrinsics.checkNotNullParameter(playbackStatus, "playbackStatus");
        return new AudioMessageUserUiModel(tag, audioUri, i, playbackStatus, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioMessageUserUiModel) {
            AudioMessageUserUiModel audioMessageUserUiModel = (AudioMessageUserUiModel) obj;
            return Intrinsics.areEqual(this.tag, audioMessageUserUiModel.tag) && Intrinsics.areEqual(this.audioUri, audioMessageUserUiModel.audioUri) && this.histogram == audioMessageUserUiModel.histogram && Intrinsics.areEqual(this.playbackStatus, audioMessageUserUiModel.playbackStatus) && this.isSending == audioMessageUserUiModel.isSending;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.tag.hashCode() * 31) + this.audioUri.hashCode()) * 31) + this.histogram) * 31) + this.playbackStatus.hashCode()) * 31;
        boolean z = this.isSending;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.tag;
        Uri uri = this.audioUri;
        int i = this.histogram;
        AudioStatusComponent.PlaybackStatus playbackStatus = this.playbackStatus;
        boolean z = this.isSending;
        return "AudioMessageUserUiModel(tag=" + str + ", audioUri=" + uri + ", histogram=" + i + ", playbackStatus=" + playbackStatus + ", isSending=" + z + ")";
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel, com.ifriend.chat.new_chat.list.ui.model.TagHolder
    public String getTag() {
        return this.tag;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel
    public Uri getAudioUri() {
        return this.audioUri;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel
    public int getHistogram() {
        return this.histogram;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel
    public AudioStatusComponent.PlaybackStatus getPlaybackStatus() {
        return this.playbackStatus;
    }

    public final boolean isSending() {
        return this.isSending;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioMessageUserUiModel(String tag, Uri audioUri, int i, AudioStatusComponent.PlaybackStatus playbackStatus, boolean z) {
        super(tag, audioUri, i, playbackStatus, null);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(audioUri, "audioUri");
        Intrinsics.checkNotNullParameter(playbackStatus, "playbackStatus");
        this.tag = tag;
        this.audioUri = audioUri;
        this.histogram = i;
        this.playbackStatus = playbackStatus;
        this.isSending = z;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.PayloadListItem
    public Object getPayload() {
        return this._payload;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioMessageUserUiModel(String tag, Uri audioUri, int i, AudioStatusComponent.PlaybackStatus playbackStatus, boolean z, Object obj) {
        this(tag, audioUri, i, playbackStatus, z);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(audioUri, "audioUri");
        Intrinsics.checkNotNullParameter(playbackStatus, "playbackStatus");
        this._payload = obj;
    }
}
