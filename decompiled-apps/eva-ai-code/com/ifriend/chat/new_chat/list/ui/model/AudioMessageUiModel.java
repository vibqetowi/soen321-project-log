package com.ifriend.chat.new_chat.list.ui.model;

import android.net.Uri;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioStatusComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioMessageUiModel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002B+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/PayloadListItem;", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", ViewHierarchyConstants.TAG_KEY, "", "audioUri", "Landroid/net/Uri;", "histogram", "", "playbackStatus", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "(Ljava/lang/String;Landroid/net/Uri;ILcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;)V", "getAudioUri", "()Landroid/net/Uri;", "getHistogram", "()I", "getPlaybackStatus", "()Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "getTag", "()Ljava/lang/String;", "isIdle", "", "isLoading", "isPlaying", "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageBotUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUserUiModel;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AudioMessageUiModel implements PayloadListItem, TagHolder {
    public static final int $stable = 8;
    private final Uri audioUri;
    private final int histogram;
    private final AudioStatusComponent.PlaybackStatus playbackStatus;
    private final String tag;

    public /* synthetic */ AudioMessageUiModel(String str, Uri uri, int i, AudioStatusComponent.PlaybackStatus playbackStatus, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uri, i, playbackStatus);
    }

    private AudioMessageUiModel(String str, Uri uri, int i, AudioStatusComponent.PlaybackStatus playbackStatus) {
        this.tag = str;
        this.audioUri = uri;
        this.histogram = i;
        this.playbackStatus = playbackStatus;
    }

    public String getTag() {
        return this.tag;
    }

    public Uri getAudioUri() {
        return this.audioUri;
    }

    public int getHistogram() {
        return this.histogram;
    }

    public /* synthetic */ AudioMessageUiModel(String str, Uri uri, int i, AudioStatusComponent.PlaybackStatus.Idle idle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uri, i, (i2 & 8) != 0 ? AudioStatusComponent.PlaybackStatus.Idle.INSTANCE : idle, null);
    }

    public AudioStatusComponent.PlaybackStatus getPlaybackStatus() {
        return this.playbackStatus;
    }

    public final boolean isPlaying() {
        return getPlaybackStatus() instanceof AudioStatusComponent.PlaybackStatus.Playing;
    }

    public final boolean isLoading() {
        return Intrinsics.areEqual(getPlaybackStatus(), AudioStatusComponent.PlaybackStatus.Loading.INSTANCE);
    }

    public final boolean isIdle() {
        return Intrinsics.areEqual(getPlaybackStatus(), AudioStatusComponent.PlaybackStatus.Idle.INSTANCE);
    }
}
