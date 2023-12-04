package com.ifriend.chat.new_chat.list.player;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioPlayerState.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerStateBox;", "", "uri", "Landroid/net/Uri;", "mediaItem", "Lcom/google/android/exoplayer2/MediaItem;", "state", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState;", "(Landroid/net/Uri;Lcom/google/android/exoplayer2/MediaItem;Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState;)V", "getMediaItem", "()Lcom/google/android/exoplayer2/MediaItem;", "getState", "()Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioPlayerStateBox {
    private final MediaItem mediaItem;
    private final AudioPlayerState state;
    private final Uri uri;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ AudioPlayerStateBox copy$default(AudioPlayerStateBox audioPlayerStateBox, Uri uri, MediaItem mediaItem, AudioPlayerState audioPlayerState, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = audioPlayerStateBox.uri;
        }
        if ((i & 2) != 0) {
            mediaItem = audioPlayerStateBox.mediaItem;
        }
        if ((i & 4) != 0) {
            audioPlayerState = audioPlayerStateBox.state;
        }
        return audioPlayerStateBox.copy(uri, mediaItem, audioPlayerState);
    }

    public final Uri component1() {
        return this.uri;
    }

    public final MediaItem component2() {
        return this.mediaItem;
    }

    public final AudioPlayerState component3() {
        return this.state;
    }

    public final AudioPlayerStateBox copy(Uri uri, MediaItem mediaItem, AudioPlayerState state) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        Intrinsics.checkNotNullParameter(state, "state");
        return new AudioPlayerStateBox(uri, mediaItem, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioPlayerStateBox) {
            AudioPlayerStateBox audioPlayerStateBox = (AudioPlayerStateBox) obj;
            return Intrinsics.areEqual(this.uri, audioPlayerStateBox.uri) && Intrinsics.areEqual(this.mediaItem, audioPlayerStateBox.mediaItem) && Intrinsics.areEqual(this.state, audioPlayerStateBox.state);
        }
        return false;
    }

    public int hashCode() {
        return (((this.uri.hashCode() * 31) + this.mediaItem.hashCode()) * 31) + this.state.hashCode();
    }

    public String toString() {
        Uri uri = this.uri;
        MediaItem mediaItem = this.mediaItem;
        AudioPlayerState audioPlayerState = this.state;
        return "AudioPlayerStateBox(uri=" + uri + ", mediaItem=" + mediaItem + ", state=" + audioPlayerState + ")";
    }

    public AudioPlayerStateBox(Uri uri, MediaItem mediaItem, AudioPlayerState state) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        Intrinsics.checkNotNullParameter(state, "state");
        this.uri = uri;
        this.mediaItem = mediaItem;
        this.state = state;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final MediaItem getMediaItem() {
        return this.mediaItem;
    }

    public final AudioPlayerState getState() {
        return this.state;
    }

    /* compiled from: AudioPlayerState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerStateBox$Companion;", "", "()V", "empty", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerStateBox;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AudioPlayerStateBox empty() {
            Uri EMPTY = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            MediaItem EMPTY2 = MediaItem.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            return new AudioPlayerStateBox(EMPTY, EMPTY2, AudioPlayerState.Empty.INSTANCE);
        }
    }
}
