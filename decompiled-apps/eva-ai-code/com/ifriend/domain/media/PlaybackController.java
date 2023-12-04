package com.ifriend.domain.media;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: PlaybackController.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0019\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0017H&J\b\u0010\u001c\u001a\u00020\u0017H&J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0007H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/ifriend/domain/media/PlaybackController;", "", "audioUrl", "", "getAudioUrl", "()Ljava/lang/String;", "currentPosition", "", "getCurrentPosition", "()J", "duration", "getDuration", "isPlaying", "", "()Z", "playbackControllerListeners", "Lcom/ifriend/domain/media/PlaybackControllerListeners;", "getPlaybackControllerListeners", "()Lcom/ifriend/domain/media/PlaybackControllerListeners;", "setPlaybackControllerListeners", "(Lcom/ifriend/domain/media/PlaybackControllerListeners;)V", "isAudioLoaded", "loadAudio", "", "pause", "fadeOutTime", "(Ljava/lang/Long;)V", "play", "release", "seekTo", "position", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PlaybackController {
    String getAudioUrl();

    long getCurrentPosition();

    long getDuration();

    PlaybackControllerListeners getPlaybackControllerListeners();

    boolean isAudioLoaded(String str);

    boolean isPlaying();

    void loadAudio(String str);

    void pause(Long l);

    void play();

    void release();

    void seekTo(long j);

    void setPlaybackControllerListeners(PlaybackControllerListeners playbackControllerListeners);

    /* compiled from: PlaybackController.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void pause$default(PlaybackController playbackController, Long l, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
            }
            if ((i & 1) != 0) {
                l = null;
            }
            playbackController.pause(l);
        }
    }
}
