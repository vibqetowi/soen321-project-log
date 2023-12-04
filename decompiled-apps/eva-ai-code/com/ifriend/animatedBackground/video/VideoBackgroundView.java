package com.ifriend.animatedBackground.video;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.video.VideoSize;
import com.ifriend.animatedBackground.BaseAnimatedBackgroundView;
import com.ifriend.animatedBackground.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: VideoBackgroundView.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0006\u0010\u0016\u001a\u00020\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ifriend/animatedBackground/video/VideoBackgroundView;", "Landroid/widget/FrameLayout;", "Lcom/ifriend/animatedBackground/BaseAnimatedBackgroundView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "player", "Lcom/google/android/exoplayer2/ExoPlayer;", "playerView", "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "uriForLoop", "Landroid/net/Uri;", "play", "", "uri", "shouldLoop", "", "playLoopVideo", "releasePlayer", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoBackgroundView extends FrameLayout implements BaseAnimatedBackgroundView {
    private final ExoPlayer player;
    private final StyledPlayerView playerView;
    private Uri uriForLoop;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VideoBackgroundView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout.inflate(context, R.layout.view_video_background, this);
        View findViewById = findViewById(R.id.playerView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        StyledPlayerView styledPlayerView = (StyledPlayerView) findViewById;
        this.playerView = styledPlayerView;
        ExoPlayer build = new ExoPlayer.Builder(context).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        build.setPlayWhenReady(true);
        this.player = build;
        styledPlayerView.setPlayer(build);
        build.addListener(new Player.Listener() { // from class: com.ifriend.animatedBackground.video.VideoBackgroundView.2
            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onAudioSessionIdChanged(int i2) {
                Player.Listener.CC.$default$onAudioSessionIdChanged(this, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
                Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onCues(CueGroup cueGroup) {
                Player.Listener.CC.$default$onCues(this, cueGroup);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onCues(List list) {
                Player.Listener.CC.$default$onCues(this, list);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                Player.Listener.CC.$default$onDeviceInfoChanged(this, deviceInfo);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onDeviceVolumeChanged(int i2, boolean z) {
                Player.Listener.CC.$default$onDeviceVolumeChanged(this, i2, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onEvents(Player player, Player.Events events) {
                Player.Listener.CC.$default$onEvents(this, player, events);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onIsLoadingChanged(boolean z) {
                Player.Listener.CC.$default$onIsLoadingChanged(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onLoadingChanged(boolean z) {
                Player.Listener.CC.$default$onLoadingChanged(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
                Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(this, j);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i2) {
                Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
                Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
                Player.Listener.CC.$default$onMetadata(this, metadata);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i2) {
                Player.Listener.CC.$default$onPlayWhenReadyChanged(this, z, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlaybackStateChanged(int i2) {
                Player.Listener.CC.$default$onPlaybackStateChanged(this, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
                Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
                Player.Listener.CC.$default$onPlayerError(this, playbackException);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
                Player.Listener.CC.$default$onPlayerErrorChanged(this, playbackException);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlayerStateChanged(boolean z, int i2) {
                Player.Listener.CC.$default$onPlayerStateChanged(this, z, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
                Player.Listener.CC.$default$onPlaylistMetadataChanged(this, mediaMetadata);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPositionDiscontinuity(int i2) {
                Player.Listener.CC.$default$onPositionDiscontinuity(this, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
                Player.Listener.CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onRenderedFirstFrame() {
                Player.Listener.CC.$default$onRenderedFirstFrame(this);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onRepeatModeChanged(int i2) {
                Player.Listener.CC.$default$onRepeatModeChanged(this, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onSeekBackIncrementChanged(long j) {
                Player.Listener.CC.$default$onSeekBackIncrementChanged(this, j);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
                Player.Listener.CC.$default$onSeekForwardIncrementChanged(this, j);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onSeekProcessed() {
                Player.Listener.CC.$default$onSeekProcessed(this);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
                Player.Listener.CC.$default$onShuffleModeEnabledChanged(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                Player.Listener.CC.$default$onSkipSilenceEnabledChanged(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onSurfaceSizeChanged(int i2, int i3) {
                Player.Listener.CC.$default$onSurfaceSizeChanged(this, i2, i3);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onTimelineChanged(Timeline timeline, int i2) {
                Player.Listener.CC.$default$onTimelineChanged(this, timeline, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
                Player.Listener.CC.$default$onTrackSelectionParametersChanged(this, trackSelectionParameters);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onTracksChanged(Tracks tracks) {
                Player.Listener.CC.$default$onTracksChanged(this, tracks);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                Player.Listener.CC.$default$onVideoSizeChanged(this, videoSize);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public /* synthetic */ void onVolumeChanged(float f) {
                Player.Listener.CC.$default$onVolumeChanged(this, f);
            }

            @Override // com.google.android.exoplayer2.Player.Listener
            public void onIsPlayingChanged(boolean z) {
                Player.Listener.CC.$default$onIsPlayingChanged(this, z);
                if (z) {
                    return;
                }
                VideoBackgroundView.this.playLoopVideo();
                VideoBackgroundView.this.player.play();
            }
        });
    }

    public final void play(Uri uri, boolean z) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (this.player.isPlaying()) {
            this.player.addMediaItem(MediaItem.fromUri(uri));
        } else {
            this.player.setMediaItem(MediaItem.fromUri(uri));
            this.player.prepare();
        }
        if (z) {
            this.uriForLoop = uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playLoopVideo() {
        Uri uri = this.uriForLoop;
        if (uri != null) {
            play(uri, true);
        }
    }

    public final void releasePlayer() {
        this.player.release();
    }
}
