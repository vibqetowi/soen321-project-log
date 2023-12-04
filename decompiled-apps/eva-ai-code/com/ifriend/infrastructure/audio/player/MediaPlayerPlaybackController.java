package com.ifriend.infrastructure.audio.player;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.util.Log;
import com.ifriend.domain.media.PlaybackController;
import com.ifriend.domain.media.PlaybackControllerListeners;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: MediaPlayerPlaybackController.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000 42\u00020\u0001:\u000234B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0017\u0010)\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016J\u0010\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020'H\u0002J\u0010\u00101\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0012H\u0002J\u0014\u00102\u001a\u00020'*\u00020\u001d2\u0006\u0010/\u001a\u00020\u0012H\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR2\u0010\r\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u000fR\u00020\u00000\u000ej\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u000fR\u00020\u0000`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00065"}, d2 = {"Lcom/ifriend/infrastructure/audio/player/MediaPlayerPlaybackController;", "Lcom/ifriend/domain/media/PlaybackController;", "context", "Landroid/content/Context;", "headers", "", "", "(Landroid/content/Context;Ljava/util/Map;)V", "audioUrl", "getAudioUrl", "()Ljava/lang/String;", "setAudioUrl", "(Ljava/lang/String;)V", "audioUrlsStates", "Ljava/util/HashMap;", "Lcom/ifriend/infrastructure/audio/player/MediaPlayerPlaybackController$AudioLoadedState;", "Lkotlin/collections/HashMap;", "currentPosition", "", "getCurrentPosition", "()J", "duration", "getDuration", "fadeOutTimer", "Landroid/os/CountDownTimer;", "isPlaying", "", "()Z", "mediaPlayer", "Landroid/media/MediaPlayer;", "value", "Lcom/ifriend/domain/media/PlaybackControllerListeners;", "playbackControllerListeners", "getPlaybackControllerListeners", "()Lcom/ifriend/domain/media/PlaybackControllerListeners;", "setPlaybackControllerListeners", "(Lcom/ifriend/domain/media/PlaybackControllerListeners;)V", "isAudioLoaded", "loadAudio", "", "onException", "pause", "fadeOutTime", "(Ljava/lang/Long;)V", "play", "release", "seekTo", "position", "setAllUrlsUnloaded", "startFadeOut", "safeSeekTo", "AudioLoadedState", "Companion", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaPlayerPlaybackController implements PlaybackController {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "MediaPlayerPlaybackController";
    private static MediaPlayerPlaybackController instance;
    private String audioUrl;
    private HashMap<String, AudioLoadedState> audioUrlsStates;
    private final Context context;
    private CountDownTimer fadeOutTimer;
    private final Map<String, String> headers;
    private MediaPlayer mediaPlayer;
    private PlaybackControllerListeners playbackControllerListeners;

    public /* synthetic */ MediaPlayerPlaybackController(Context context, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, map);
    }

    private MediaPlayerPlaybackController(Context context, Map<String, String> map) {
        this.context = context;
        this.headers = map;
        this.audioUrlsStates = new HashMap<>();
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mediaPlayer = mediaPlayer;
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
    }

    /* synthetic */ MediaPlayerPlaybackController(Context context, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : map);
    }

    /* compiled from: MediaPlayerPlaybackController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/infrastructure/audio/player/MediaPlayerPlaybackController$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ifriend/infrastructure/audio/player/MediaPlayerPlaybackController;", "context", "Landroid/content/Context;", "headers", "", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaPlayerPlaybackController instance$default(Companion companion, Context context, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.instance(context, map);
        }

        public final MediaPlayerPlaybackController instance(Context context, Map<String, String> map) {
            MediaPlayerPlaybackController mediaPlayerPlaybackController;
            Intrinsics.checkNotNullParameter(context, "context");
            synchronized (this) {
                if (MediaPlayerPlaybackController.instance == null) {
                    synchronized (this) {
                        Companion companion = MediaPlayerPlaybackController.Companion;
                        MediaPlayerPlaybackController.instance = new MediaPlayerPlaybackController(context, map, null);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                mediaPlayerPlaybackController = MediaPlayerPlaybackController.instance;
                Intrinsics.checkNotNull(mediaPlayerPlaybackController);
            }
            return mediaPlayerPlaybackController;
        }
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public boolean isAudioLoaded(String audioUrl) {
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        AudioLoadedState audioLoadedState = this.audioUrlsStates.get(audioUrl);
        if (audioLoadedState != null) {
            return audioLoadedState.isLoaded();
        }
        return false;
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public long getDuration() {
        return this.mediaPlayer.getDuration();
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public long getCurrentPosition() {
        return this.mediaPlayer.getCurrentPosition();
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public PlaybackControllerListeners getPlaybackControllerListeners() {
        return this.playbackControllerListeners;
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public void setPlaybackControllerListeners(PlaybackControllerListeners playbackControllerListeners) {
        this.playbackControllerListeners = playbackControllerListeners;
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public void setAudioUrl(String str) {
        this.audioUrl = str;
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public boolean isPlaying() {
        return this.mediaPlayer.isPlaying();
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public void loadAudio(final String audioUrl) {
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        Log.d(TAG, "start audio loading");
        setAudioUrl(audioUrl);
        setAllUrlsUnloaded();
        this.mediaPlayer.reset();
        try {
            this.mediaPlayer.setDataSource(this.context, Uri.parse(audioUrl), this.headers);
            this.mediaPlayer.setVolume(1.0f, 1.0f);
            CountDownTimer countDownTimer = this.fadeOutTimer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.mediaPlayer.prepareAsync();
            this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.ifriend.infrastructure.audio.player.MediaPlayerPlaybackController$$ExternalSyntheticLambda1
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    MediaPlayerPlaybackController.loadAudio$lambda$0(MediaPlayerPlaybackController.this, audioUrl, mediaPlayer);
                }
            });
            this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.ifriend.infrastructure.audio.player.MediaPlayerPlaybackController$$ExternalSyntheticLambda2
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    MediaPlayerPlaybackController.loadAudio$lambda$1(MediaPlayerPlaybackController.this, mediaPlayer);
                }
            });
            this.mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.ifriend.infrastructure.audio.player.MediaPlayerPlaybackController$$ExternalSyntheticLambda3
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    boolean loadAudio$lambda$2;
                    loadAudio$lambda$2 = MediaPlayerPlaybackController.loadAudio$lambda$2(MediaPlayerPlaybackController.this, audioUrl, mediaPlayer, i, i2);
                    return loadAudio$lambda$2;
                }
            });
        } catch (Exception e) {
            onException(audioUrl);
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAudio$lambda$0(MediaPlayerPlaybackController this$0, String audioUrl, MediaPlayer mediaPlayer) {
        Function0<Unit> onPlayerPrepared;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(audioUrl, "$audioUrl");
        Log.d(TAG, "on prepared");
        AudioLoadedState audioLoadedState = this$0.audioUrlsStates.get(audioUrl);
        if (audioLoadedState != null) {
            audioLoadedState.setLoaded(true);
        }
        PlaybackControllerListeners playbackControllerListeners = this$0.getPlaybackControllerListeners();
        if (playbackControllerListeners == null || (onPlayerPrepared = playbackControllerListeners.getOnPlayerPrepared()) == null) {
            return;
        }
        onPlayerPrepared.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAudio$lambda$1(MediaPlayerPlaybackController this$0, MediaPlayer mediaPlayer) {
        Function0<Unit> onPlayerComplete;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.d(TAG, "on completed");
        PlaybackControllerListeners playbackControllerListeners = this$0.getPlaybackControllerListeners();
        if (playbackControllerListeners != null && (onPlayerComplete = playbackControllerListeners.getOnPlayerComplete()) != null) {
            onPlayerComplete.invoke();
        }
        this$0.audioUrlsStates.clear();
        this$0.mediaPlayer.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean loadAudio$lambda$2(MediaPlayerPlaybackController this$0, String audioUrl, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(audioUrl, "$audioUrl");
        this$0.onException(audioUrl);
        return true;
    }

    private final void onException(String str) {
        Function0<Unit> onPlayerPrepareException;
        Log.d(TAG, "exception");
        AudioLoadedState audioLoadedState = this.audioUrlsStates.get(str);
        if (audioLoadedState != null) {
            audioLoadedState.setLoaded(false);
        }
        PlaybackControllerListeners playbackControllerListeners = getPlaybackControllerListeners();
        if (playbackControllerListeners == null || (onPlayerPrepareException = playbackControllerListeners.getOnPlayerPrepareException()) == null) {
            return;
        }
        onPlayerPrepareException.invoke();
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public void play() {
        String audioUrl = getAudioUrl();
        Log.d(TAG, "play: " + audioUrl);
        this.mediaPlayer.start();
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public void pause(Long l) {
        Log.d(TAG, "pause");
        if (l == null) {
            this.mediaPlayer.pause();
        } else {
            startFadeOut(l.longValue());
        }
    }

    private final void startFadeOut(final long j) {
        final float f = 1 / ((float) (j / 250));
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 1.0f;
        CountDownTimer countDownTimer = new CountDownTimer(j, 250L) { // from class: com.ifriend.infrastructure.audio.player.MediaPlayerPlaybackController$startFadeOut$1
            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                MediaPlayer mediaPlayer;
                MediaPlayer mediaPlayer2;
                if (floatRef.element <= 0.0f) {
                    return;
                }
                mediaPlayer = this.mediaPlayer;
                mediaPlayer.setVolume(floatRef.element, floatRef.element);
                floatRef.element -= f;
                if (floatRef.element <= 0.0f) {
                    mediaPlayer2 = this.mediaPlayer;
                    mediaPlayer2.stop();
                }
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                MediaPlayer mediaPlayer;
                mediaPlayer = this.mediaPlayer;
                mediaPlayer.stop();
            }
        };
        this.fadeOutTimer = countDownTimer;
        countDownTimer.start();
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public void seekTo(long j) {
        Log.d(TAG, "seek to: " + j);
        safeSeekTo(this.mediaPlayer, j);
    }

    @Override // com.ifriend.domain.media.PlaybackController
    public void release() {
        Log.d(TAG, "release");
        this.mediaPlayer.release();
        setAllUrlsUnloaded();
    }

    private final void setAllUrlsUnloaded() {
        Set<String> keySet = this.audioUrlsStates.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        for (String str : keySet) {
            AudioLoadedState audioLoadedState = this.audioUrlsStates.get(str);
            if (audioLoadedState != null) {
                audioLoadedState.setLoaded(false);
            }
        }
    }

    private final void safeSeekTo(MediaPlayer mediaPlayer, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            mediaPlayer.seekTo(j, 3);
        } else {
            mediaPlayer.seekTo((int) j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaPlayerPlaybackController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/infrastructure/audio/player/MediaPlayerPlaybackController$AudioLoadedState;", "", "(Lcom/ifriend/infrastructure/audio/player/MediaPlayerPlaybackController;)V", "isLoaded", "", "()Z", "setLoaded", "(Z)V", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final class AudioLoadedState {
        private boolean isLoaded;

        public AudioLoadedState() {
        }

        public final boolean isLoaded() {
            return this.isLoaded;
        }

        public final void setLoaded(boolean z) {
            this.isLoaded = z;
        }
    }
}
