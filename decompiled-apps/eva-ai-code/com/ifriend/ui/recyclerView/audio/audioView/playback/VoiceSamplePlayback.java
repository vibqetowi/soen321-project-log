package com.ifriend.ui.recyclerView.audio.audioView.playback;

import com.ifriend.domain.media.PlaybackController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: VoiceSamplePlayback.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSamplePlayback;", "", "audioUrl", "", "playbackController", "Lcom/ifriend/domain/media/PlaybackController;", "(Ljava/lang/String;Lcom/ifriend/domain/media/PlaybackController;)V", "getAudioUrl", "()Ljava/lang/String;", "getPlaybackController", "()Lcom/ifriend/domain/media/PlaybackController;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VoiceSamplePlayback {
    public static final int $stable = 8;
    private final String audioUrl;
    private final PlaybackController playbackController;

    public static /* synthetic */ VoiceSamplePlayback copy$default(VoiceSamplePlayback voiceSamplePlayback, String str, PlaybackController playbackController, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceSamplePlayback.audioUrl;
        }
        if ((i & 2) != 0) {
            playbackController = voiceSamplePlayback.playbackController;
        }
        return voiceSamplePlayback.copy(str, playbackController);
    }

    public final String component1() {
        return this.audioUrl;
    }

    public final PlaybackController component2() {
        return this.playbackController;
    }

    public final VoiceSamplePlayback copy(String audioUrl, PlaybackController playbackController) {
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        Intrinsics.checkNotNullParameter(playbackController, "playbackController");
        return new VoiceSamplePlayback(audioUrl, playbackController);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VoiceSamplePlayback) {
            VoiceSamplePlayback voiceSamplePlayback = (VoiceSamplePlayback) obj;
            return Intrinsics.areEqual(this.audioUrl, voiceSamplePlayback.audioUrl) && Intrinsics.areEqual(this.playbackController, voiceSamplePlayback.playbackController);
        }
        return false;
    }

    public int hashCode() {
        return (this.audioUrl.hashCode() * 31) + this.playbackController.hashCode();
    }

    public String toString() {
        String str = this.audioUrl;
        PlaybackController playbackController = this.playbackController;
        return "VoiceSamplePlayback(audioUrl=" + str + ", playbackController=" + playbackController + ")";
    }

    public VoiceSamplePlayback(String audioUrl, PlaybackController playbackController) {
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        Intrinsics.checkNotNullParameter(playbackController, "playbackController");
        this.audioUrl = audioUrl;
        this.playbackController = playbackController;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final PlaybackController getPlaybackController() {
        return this.playbackController;
    }
}
