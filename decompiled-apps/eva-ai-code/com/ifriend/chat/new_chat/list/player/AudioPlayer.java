package com.ifriend.chat.new_chat.list.player;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: AudioPlayer.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0011\u0010\u001b\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u001eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0011\u0010\u001f\u001a\u00020\u001eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010&\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010'\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010(\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0019\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010,J\u0010\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u00100\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u000203H\u0016J\u0018\u00104\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020!H\u0016J\u0010\u00107\u001a\u00020\u00182\u0006\u0010(\u001a\u00020!H\u0016J\u0018\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020;H\u0016J\u0011\u0010>\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0011\u0010?\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00160AR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;", "Lcom/google/android/exoplayer2/Player$Listener;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "playerSettings", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerSettings;", "screenLifecycle", "Landroidx/lifecycle/Lifecycle;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Landroid/content/Context;Lcom/ifriend/chat/new_chat/list/player/AudioPlayerSettings;Landroidx/lifecycle/Lifecycle;Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/common_utils/Logger;)V", "player", "Lcom/google/android/exoplayer2/ExoPlayer;", "getPlayer", "()Lcom/google/android/exoplayer2/ExoPlayer;", "player$delegate", "Lkotlin/Lazy;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerStateBox;", "addAnalyticsListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/google/android/exoplayer2/analytics/AnalyticsListener;", "clearCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentPosition", "", "duration", "isBuffering", "", "Lcom/google/android/exoplayer2/Player;", "events", "Lcom/google/android/exoplayer2/Player$Events;", "isEnded", "isIdle", "isPause", "isPlaying", "loadAndPlayAudio", "audioMedia", "Lcom/ifriend/chat/new_chat/list/player/AudioMedia;", "(Lcom/ifriend/chat/new_chat/list/player/AudioMedia;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "log", NotificationCompat.CATEGORY_MESSAGE, "", "logEvents", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onEvents", "onIsLoadingChanged", "isLoading", "onIsPlayingChanged", "onPlayWhenReadyChanged", "playWhenReady", "reason", "", "onPlaybackStateChanged", "playbackState", "pause", "play", "playerState", "Lkotlinx/coroutines/flow/Flow;", "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioPlayer implements Player.Listener, DefaultLifecycleObserver {
    public static final String MEDIA_EXTRA_DATA_KEY = "MEDIA_EXTRA_DATA_KEY";
    private final Context context;
    private final CoroutineDispatchers dispatchers;
    private final Logger logger;
    private final Lazy player$delegate;
    private final AudioPlayerSettings playerSettings;
    private final Lifecycle screenLifecycle;
    private final MutableStateFlow<AudioPlayerStateBox> state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private final void logEvents(Player player, Player.Events events) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAudioSessionIdChanged(int i) {
        Player.Listener.CC.$default$onAudioSessionIdChanged(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
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
    public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        Player.Listener.CC.$default$onDeviceVolumeChanged(this, i, z);
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
    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
        Player.Listener.CC.$default$onMetadata(this, metadata);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
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
    public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        Player.Listener.CC.$default$onPlayerStateChanged(this, z, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        Player.Listener.CC.$default$onPlaylistMetadataChanged(this, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(int i) {
        Player.Listener.CC.$default$onPositionDiscontinuity(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        Player.Listener.CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onRenderedFirstFrame() {
        Player.Listener.CC.$default$onRenderedFirstFrame(this);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onRepeatModeChanged(int i) {
        Player.Listener.CC.$default$onRepeatModeChanged(this, i);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        Player.Listener.CC.$default$onSurfaceSizeChanged(this, i, i2);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        Player.Listener.CC.$default$onTimelineChanged(this, timeline, i);
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

    public AudioPlayer(Context context, AudioPlayerSettings playerSettings, Lifecycle screenLifecycle, CoroutineDispatchers dispatchers, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(playerSettings, "playerSettings");
        Intrinsics.checkNotNullParameter(screenLifecycle, "screenLifecycle");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.playerSettings = playerSettings;
        this.screenLifecycle = screenLifecycle;
        this.dispatchers = dispatchers;
        this.logger = logger;
        this.player$delegate = LazyKt.lazy(new AudioPlayer$player$2(this));
        this.state = StateFlowKt.MutableStateFlow(AudioPlayerStateBox.Companion.empty());
        screenLifecycle.addObserver(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExoPlayer getPlayer() {
        return (ExoPlayer) this.player$delegate.getValue();
    }

    public final Flow<AudioPlayerStateBox> playerState() {
        final MutableStateFlow<AudioPlayerStateBox> mutableStateFlow = this.state;
        return FlowKt.flowOn(new Flow<AudioPlayerStateBox>() { // from class: com.ifriend.chat.new_chat.list.player.AudioPlayer$playerState$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AudioPlayerStateBox> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.new_chat.list.player.AudioPlayer$playerState$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AudioPlayer this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.chat.new_chat.list.player.AudioPlayer$playerState$$inlined$map$1$2", f = "AudioPlayer.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.chat.new_chat.list.player.AudioPlayer$playerState$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, AudioPlayer audioPlayer) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = audioPlayer;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    ExoPlayer player;
                    ExoPlayer player2;
                    ExoPlayer player3;
                    ExoPlayer player4;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                AudioPlayerStateBox audioPlayerStateBox = (AudioPlayerStateBox) obj;
                                AudioPlayerState state = audioPlayerStateBox.getState();
                                if (state instanceof AudioPlayerState.Pause) {
                                    player3 = this.this$0.getPlayer();
                                    long currentPosition = player3.getCurrentPosition();
                                    player4 = this.this$0.getPlayer();
                                    audioPlayerStateBox = AudioPlayerStateBox.copy$default(audioPlayerStateBox, null, null, new AudioPlayerState.Pause(currentPosition, player4.getDuration()), 3, null);
                                } else if (state instanceof AudioPlayerState.Playing) {
                                    player = this.this$0.getPlayer();
                                    long currentPosition2 = player.getCurrentPosition();
                                    player2 = this.this$0.getPlayer();
                                    audioPlayerStateBox = AudioPlayerStateBox.copy$default(audioPlayerStateBox, null, null, new AudioPlayerState.Playing(currentPosition2, player2.getDuration()), 3, null);
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(audioPlayerStateBox, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, this.dispatchers.getMain());
    }

    public final Object loadAndPlayAudio(AudioMedia audioMedia, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getMain(), new AudioPlayer$loadAndPlayAudio$2(this, audioMedia, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object pause(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getMain(), new AudioPlayer$pause$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object play(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getMain(), new AudioPlayer$play$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object clearCache(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getIO(), new AudioPlayer$clearCache$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final void addAnalyticsListener(AnalyticsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getPlayer().addAnalyticsListener(listener);
    }

    public final Object currentPosition(Continuation<? super Long> continuation) {
        return BuildersKt.withContext(this.dispatchers.getMain(), new AudioPlayer$currentPosition$2(this, null), continuation);
    }

    public final Object duration(Continuation<? super Long> continuation) {
        return BuildersKt.withContext(this.dispatchers.getMain(), new AudioPlayer$duration$2(this, null), continuation);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayWhenReadyChanged(boolean z, int i) {
        log("playWhenReady " + z + " reason " + i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(boolean z) {
        log("onIsPlayingChanged " + z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsLoadingChanged(boolean z) {
        log("onIsLoadingChanged " + z);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaybackStateChanged(int i) {
        log("playbackState " + i);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        getPlayer().release();
        this.playerSettings.release();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onEvents(Player player, Player.Events events) {
        AudioPlayerStateBox value;
        AudioPlayerStateBox value2;
        AudioPlayerStateBox value3;
        AudioPlayerStateBox value4;
        AudioPlayerStateBox value5;
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(events, "events");
        Player.Listener.CC.$default$onEvents(this, player, events);
        logEvents(player, events);
        if (!isIdle(player, events)) {
            if (!isBuffering(player, events)) {
                if (isPlaying(player, events)) {
                    MutableStateFlow<AudioPlayerStateBox> mutableStateFlow = this.state;
                    do {
                        value3 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value3, AudioPlayerStateBox.copy$default(value3, null, null, new AudioPlayerState.Playing(player.getCurrentPosition(), player.getDuration()), 3, null)));
                    return;
                } else if (!isPause(player, events)) {
                    if (isEnded(player, events)) {
                        MutableStateFlow<AudioPlayerStateBox> mutableStateFlow2 = this.state;
                        do {
                            value = mutableStateFlow2.getValue();
                        } while (!mutableStateFlow2.compareAndSet(value, AudioPlayerStateBox.copy$default(value, null, null, AudioPlayerState.Ended.INSTANCE, 3, null)));
                        return;
                    }
                    return;
                } else {
                    MutableStateFlow<AudioPlayerStateBox> mutableStateFlow3 = this.state;
                    do {
                        value2 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value2, AudioPlayerStateBox.copy$default(value2, null, null, new AudioPlayerState.Pause(player.getCurrentPosition(), player.getDuration()), 3, null)));
                    return;
                }
            }
            MutableStateFlow<AudioPlayerStateBox> mutableStateFlow4 = this.state;
            do {
                value4 = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.compareAndSet(value4, AudioPlayerStateBox.copy$default(value4, null, null, AudioPlayerState.Buffering.INSTANCE, 3, null)));
            return;
        }
        MutableStateFlow<AudioPlayerStateBox> mutableStateFlow5 = this.state;
        do {
            value5 = mutableStateFlow5.getValue();
        } while (!mutableStateFlow5.compareAndSet(value5, AudioPlayerStateBox.copy$default(value5, null, null, AudioPlayerState.Idle.INSTANCE, 3, null)));
    }

    private final boolean isIdle(Player player, Player.Events events) {
        return player.getPlaybackState() == 1;
    }

    private final boolean isBuffering(Player player, Player.Events events) {
        return player.getPlaybackState() == 2 && player.isLoading();
    }

    private final boolean isEnded(Player player, Player.Events events) {
        return player.getPlaybackState() == 4;
    }

    private final boolean isPlaying(Player player, Player.Events events) {
        return player.getPlaybackState() == 3 && events.containsAny(5, 7) && player.isPlaying();
    }

    private final boolean isPause(Player player, Player.Events events) {
        return player.getPlaybackState() == 3 && events.containsAny(5, 7) && !player.isPlaying();
    }

    private final void log(String str) {
        this.logger.log(str);
    }

    /* compiled from: AudioPlayer.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayer$Companion;", "", "()V", AudioPlayer.MEDIA_EXTRA_DATA_KEY, "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
