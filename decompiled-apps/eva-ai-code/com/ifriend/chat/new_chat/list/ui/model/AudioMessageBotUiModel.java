package com.ifriend.chat.new_chat.list.ui.model;

import android.net.Uri;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.AudioDecodingStatusComponent;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioStatusComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioMessageUiModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BI\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001aR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006-"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageBotUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUiModel;", ViewHierarchyConstants.TAG_KEY, "", "audioUri", "Landroid/net/Uri;", "histogram", "", "playbackStatus", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "decodingStatus", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;", "isChangeVoiceAvailable", "", "isPremium", "payload", "", "(Ljava/lang/String;Landroid/net/Uri;ILcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;ZZLjava/lang/Object;)V", "(Ljava/lang/String;Landroid/net/Uri;ILcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;ZZ)V", "_payload", "getAudioUri", "()Landroid/net/Uri;", "getDecodingStatus", "()Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;", "getHistogram", "()I", "()Z", "getPayload", "()Ljava/lang/Object;", "getPlaybackStatus", "()Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioMessageBotUiModel extends AudioMessageUiModel {
    public static final int $stable = 8;
    private Object _payload;
    private final Uri audioUri;
    private final AudioDecodingStatusComponent.DecodingStatus decodingStatus;
    private final int histogram;
    private final boolean isChangeVoiceAvailable;
    private final boolean isPremium;
    private final AudioStatusComponent.PlaybackStatus playbackStatus;
    private final String tag;

    public static /* synthetic */ AudioMessageBotUiModel copy$default(AudioMessageBotUiModel audioMessageBotUiModel, String str, Uri uri, int i, AudioStatusComponent.PlaybackStatus playbackStatus, AudioDecodingStatusComponent.DecodingStatus decodingStatus, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = audioMessageBotUiModel.tag;
        }
        if ((i2 & 2) != 0) {
            uri = audioMessageBotUiModel.audioUri;
        }
        Uri uri2 = uri;
        if ((i2 & 4) != 0) {
            i = audioMessageBotUiModel.histogram;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            playbackStatus = audioMessageBotUiModel.playbackStatus;
        }
        AudioStatusComponent.PlaybackStatus playbackStatus2 = playbackStatus;
        if ((i2 & 16) != 0) {
            decodingStatus = audioMessageBotUiModel.decodingStatus;
        }
        AudioDecodingStatusComponent.DecodingStatus decodingStatus2 = decodingStatus;
        if ((i2 & 32) != 0) {
            z = audioMessageBotUiModel.isChangeVoiceAvailable;
        }
        boolean z3 = z;
        if ((i2 & 64) != 0) {
            z2 = audioMessageBotUiModel.isPremium;
        }
        return audioMessageBotUiModel.copy(str, uri2, i3, playbackStatus2, decodingStatus2, z3, z2);
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

    public final AudioDecodingStatusComponent.DecodingStatus component5() {
        return this.decodingStatus;
    }

    public final boolean component6() {
        return this.isChangeVoiceAvailable;
    }

    public final boolean component7() {
        return this.isPremium;
    }

    public final AudioMessageBotUiModel copy(String tag, Uri audioUri, int i, AudioStatusComponent.PlaybackStatus playbackStatus, AudioDecodingStatusComponent.DecodingStatus decodingStatus, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(audioUri, "audioUri");
        Intrinsics.checkNotNullParameter(playbackStatus, "playbackStatus");
        Intrinsics.checkNotNullParameter(decodingStatus, "decodingStatus");
        return new AudioMessageBotUiModel(tag, audioUri, i, playbackStatus, decodingStatus, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioMessageBotUiModel) {
            AudioMessageBotUiModel audioMessageBotUiModel = (AudioMessageBotUiModel) obj;
            return Intrinsics.areEqual(this.tag, audioMessageBotUiModel.tag) && Intrinsics.areEqual(this.audioUri, audioMessageBotUiModel.audioUri) && this.histogram == audioMessageBotUiModel.histogram && Intrinsics.areEqual(this.playbackStatus, audioMessageBotUiModel.playbackStatus) && Intrinsics.areEqual(this.decodingStatus, audioMessageBotUiModel.decodingStatus) && this.isChangeVoiceAvailable == audioMessageBotUiModel.isChangeVoiceAvailable && this.isPremium == audioMessageBotUiModel.isPremium;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.tag.hashCode() * 31) + this.audioUri.hashCode()) * 31) + this.histogram) * 31) + this.playbackStatus.hashCode()) * 31) + this.decodingStatus.hashCode()) * 31;
        boolean z = this.isChangeVoiceAvailable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isPremium;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.tag;
        Uri uri = this.audioUri;
        int i = this.histogram;
        AudioStatusComponent.PlaybackStatus playbackStatus = this.playbackStatus;
        AudioDecodingStatusComponent.DecodingStatus decodingStatus = this.decodingStatus;
        boolean z = this.isChangeVoiceAvailable;
        boolean z2 = this.isPremium;
        return "AudioMessageBotUiModel(tag=" + str + ", audioUri=" + uri + ", histogram=" + i + ", playbackStatus=" + playbackStatus + ", decodingStatus=" + decodingStatus + ", isChangeVoiceAvailable=" + z + ", isPremium=" + z2 + ")";
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

    public final AudioDecodingStatusComponent.DecodingStatus getDecodingStatus() {
        return this.decodingStatus;
    }

    public final boolean isChangeVoiceAvailable() {
        return this.isChangeVoiceAvailable;
    }

    public final boolean isPremium() {
        return this.isPremium;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioMessageBotUiModel(String tag, Uri audioUri, int i, AudioStatusComponent.PlaybackStatus playbackStatus, AudioDecodingStatusComponent.DecodingStatus decodingStatus, boolean z, boolean z2) {
        super(tag, audioUri, i, playbackStatus, null);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(audioUri, "audioUri");
        Intrinsics.checkNotNullParameter(playbackStatus, "playbackStatus");
        Intrinsics.checkNotNullParameter(decodingStatus, "decodingStatus");
        this.tag = tag;
        this.audioUri = audioUri;
        this.histogram = i;
        this.playbackStatus = playbackStatus;
        this.decodingStatus = decodingStatus;
        this.isChangeVoiceAvailable = z;
        this.isPremium = z2;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.PayloadListItem
    public Object getPayload() {
        return this._payload;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioMessageBotUiModel(String tag, Uri audioUri, int i, AudioStatusComponent.PlaybackStatus playbackStatus, AudioDecodingStatusComponent.DecodingStatus decodingStatus, boolean z, boolean z2, Object obj) {
        this(tag, audioUri, i, playbackStatus, decodingStatus, z, z2);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(audioUri, "audioUri");
        Intrinsics.checkNotNullParameter(playbackStatus, "playbackStatus");
        Intrinsics.checkNotNullParameter(decodingStatus, "decodingStatus");
        this._payload = obj;
    }
}
