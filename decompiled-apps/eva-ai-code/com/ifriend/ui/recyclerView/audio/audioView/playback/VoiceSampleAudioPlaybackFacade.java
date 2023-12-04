package com.ifriend.ui.recyclerView.audio.audioView.playback;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.ifriend.domain.media.PlaybackController;
import com.ifriend.domain.media.PlaybackControllerListeners;
import com.ifriend.domain.models.chat.ChatAudioViewEventListener;
import com.ifriend.ui.R;
import com.ifriend.ui.recyclerView.audio.audioView.ChatAudioPermission;
import com.ifriend.ui.recyclerView.audio.audioView.rewindView.HistogramAudioRewindView;
import com.ifriend.ui.touchFeedback.TouchFeedback;
import com.ifriend.ui.utils.Modification;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: VoiceSampleAudioPlaybackFacade.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u00013B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020$J\u0010\u0010,\u001a\u00020(2\u0006\u0010+\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020(H\u0002J\b\u0010/\u001a\u00020(H\u0002J\b\u00100\u001a\u00020(H\u0002J\b\u00101\u001a\u00020(H\u0002J\b\u00102\u001a\u00020(H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001d@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSampleAudioPlaybackFacade;", "", "playButton", "Landroid/widget/ImageView;", "loadProgress", "Landroid/widget/ProgressBar;", "rewindView", "Lcom/ifriend/ui/recyclerView/audio/audioView/rewindView/HistogramAudioRewindView;", "(Landroid/widget/ImageView;Landroid/widget/ProgressBar;Lcom/ifriend/ui/recyclerView/audio/audioView/rewindView/HistogramAudioRewindView;)V", "chatAudioPermission", "Lcom/ifriend/ui/recyclerView/audio/audioView/ChatAudioPermission;", "getChatAudioPermission", "()Lcom/ifriend/ui/recyclerView/audio/audioView/ChatAudioPermission;", "setChatAudioPermission", "(Lcom/ifriend/ui/recyclerView/audio/audioView/ChatAudioPermission;)V", "eventListeners", "", "Lcom/ifriend/domain/models/chat/ChatAudioViewEventListener;", "getEventListeners", "()Ljava/util/List;", "setEventListeners", "(Ljava/util/List;)V", "value", "Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSampleAudioPlaybackFacade$PlaybackState;", "playbackState", "getPlaybackState", "()Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSampleAudioPlaybackFacade$PlaybackState;", "setPlaybackState", "(Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSampleAudioPlaybackFacade$PlaybackState;)V", "Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSamplePlayback;", "voiceSamplePlayback", "getVoiceSamplePlayback", "()Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSamplePlayback;", "setVoiceSamplePlayback", "(Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSamplePlayback;)V", "checkIsSameAudio", "", "audioUrl", "", "handleIfAudioLoaded", "", "loadAudioMessage", "onPlayClick", "withEvent", "onSubscriberClick", "pause", "play", "setLoadUIState", "setPauseUIState", "setPlayUIState", "setPlaybackControllerListeners", "PlaybackState", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VoiceSampleAudioPlaybackFacade {
    private ChatAudioPermission chatAudioPermission;
    private List<? extends ChatAudioViewEventListener> eventListeners;
    private final ProgressBar loadProgress;
    private final ImageView playButton;
    private PlaybackState playbackState;
    private final HistogramAudioRewindView rewindView;
    private VoiceSamplePlayback voiceSamplePlayback;

    /* compiled from: VoiceSampleAudioPlaybackFacade.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlaybackState.values().length];
            try {
                iArr[PlaybackState.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaybackState.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlaybackState.LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlaybackState.PLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlaybackState.PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VoiceSampleAudioPlaybackFacade(ImageView playButton, ProgressBar loadProgress, HistogramAudioRewindView rewindView) {
        Intrinsics.checkNotNullParameter(playButton, "playButton");
        Intrinsics.checkNotNullParameter(loadProgress, "loadProgress");
        Intrinsics.checkNotNullParameter(rewindView, "rewindView");
        this.playButton = playButton;
        this.loadProgress = loadProgress;
        this.rewindView = rewindView;
        this.playbackState = PlaybackState.INIT;
        Modification.INSTANCE.onTouchOpacity(playButton);
        playButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.recyclerView.audio.audioView.playback.VoiceSampleAudioPlaybackFacade$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSampleAudioPlaybackFacade._init_$lambda$2(VoiceSampleAudioPlaybackFacade.this, view);
            }
        });
    }

    public final List<ChatAudioViewEventListener> getEventListeners() {
        return this.eventListeners;
    }

    public final void setEventListeners(List<? extends ChatAudioViewEventListener> list) {
        this.eventListeners = list;
    }

    public final VoiceSamplePlayback getVoiceSamplePlayback() {
        return this.voiceSamplePlayback;
    }

    public final void setVoiceSamplePlayback(VoiceSamplePlayback voiceSamplePlayback) {
        this.voiceSamplePlayback = voiceSamplePlayback;
        handleIfAudioLoaded();
    }

    private final void handleIfAudioLoaded() {
        VoiceSamplePlayback voiceSamplePlayback = this.voiceSamplePlayback;
        if (voiceSamplePlayback != null) {
            if (Intrinsics.areEqual(voiceSamplePlayback.getPlaybackController().getAudioUrl(), voiceSamplePlayback.getAudioUrl())) {
                if (voiceSamplePlayback.getPlaybackController().isPlaying()) {
                    this.rewindView.showState(true, ((float) voiceSamplePlayback.getPlaybackController().getCurrentPosition()) / ((float) voiceSamplePlayback.getPlaybackController().getDuration()));
                    setPlayUIState();
                    return;
                }
                this.rewindView.showInitialState();
                setPauseUIState();
            } else if (!voiceSamplePlayback.getPlaybackController().isAudioLoaded(voiceSamplePlayback.getAudioUrl())) {
                setPlaybackState(PlaybackState.INIT);
                this.rewindView.showInitialState();
            } else {
                setPlaybackState(PlaybackState.LOADED);
                this.rewindView.showInitialState();
            }
        }
    }

    public final boolean checkIsSameAudio(String str) {
        VoiceSamplePlayback voiceSamplePlayback = this.voiceSamplePlayback;
        return Intrinsics.areEqual(voiceSamplePlayback != null ? voiceSamplePlayback.getAudioUrl() : null, str);
    }

    private final void setPlaybackControllerListeners() {
        PlaybackController playbackController;
        VoiceSamplePlayback voiceSamplePlayback = this.voiceSamplePlayback;
        if (voiceSamplePlayback == null || (playbackController = voiceSamplePlayback.getPlaybackController()) == null) {
            return;
        }
        playbackController.setPlaybackControllerListeners(new PlaybackControllerListeners(new VoiceSampleAudioPlaybackFacade$setPlaybackControllerListeners$1$1(this, playbackController), new VoiceSampleAudioPlaybackFacade$setPlaybackControllerListeners$1$2(this), new VoiceSampleAudioPlaybackFacade$setPlaybackControllerListeners$1$3(this, playbackController), new VoiceSampleAudioPlaybackFacade$setPlaybackControllerListeners$1$4(this)));
    }

    public final ChatAudioPermission getChatAudioPermission() {
        return this.chatAudioPermission;
    }

    public final void setChatAudioPermission(ChatAudioPermission chatAudioPermission) {
        this.chatAudioPermission = chatAudioPermission;
    }

    public final PlaybackState getPlaybackState() {
        return this.playbackState;
    }

    public final void setPlaybackState(PlaybackState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.playbackState = value;
        int i = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i == 1 || i == 2) {
            setPauseUIState();
            this.rewindView.pause();
        } else if (i == 3) {
            setLoadUIState();
            loadAudioMessage();
        } else if (i == 4) {
            setPlayUIState();
            play();
        } else if (i != 5) {
        } else {
            setPauseUIState();
            pause();
            this.playButton.setImageResource(R.drawable.play);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoiceSampleAudioPlaybackFacade.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSampleAudioPlaybackFacade$PlaybackState;", "", "(Ljava/lang/String;I)V", "INIT", "LOAD", "LOADED", "PLAY", "PAUSE", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PlaybackState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PlaybackState[] $VALUES;
        public static final PlaybackState INIT = new PlaybackState("INIT", 0);
        public static final PlaybackState LOAD = new PlaybackState("LOAD", 1);
        public static final PlaybackState LOADED = new PlaybackState("LOADED", 2);
        public static final PlaybackState PLAY = new PlaybackState("PLAY", 3);
        public static final PlaybackState PAUSE = new PlaybackState("PAUSE", 4);

        private static final /* synthetic */ PlaybackState[] $values() {
            return new PlaybackState[]{INIT, LOAD, LOADED, PLAY, PAUSE};
        }

        public static EnumEntries<PlaybackState> getEntries() {
            return $ENTRIES;
        }

        public static PlaybackState valueOf(String str) {
            return (PlaybackState) Enum.valueOf(PlaybackState.class, str);
        }

        public static PlaybackState[] values() {
            return (PlaybackState[]) $VALUES.clone();
        }

        private PlaybackState(String str, int i) {
        }

        static {
            PlaybackState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(VoiceSampleAudioPlaybackFacade this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        onPlayClick$default(this$0, false, 1, null);
    }

    public static /* synthetic */ void onPlayClick$default(VoiceSampleAudioPlaybackFacade voiceSampleAudioPlaybackFacade, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        voiceSampleAudioPlaybackFacade.onPlayClick(z);
    }

    public final void onPlayClick(boolean z) {
        List<? extends ChatAudioViewEventListener> list;
        Function0<Unit> onNoPermissionClick;
        TouchFeedback.Companion companion = TouchFeedback.Companion;
        Context context = this.playButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.get(context).vibrate();
        ChatAudioPermission chatAudioPermission = this.chatAudioPermission;
        if (chatAudioPermission != null) {
            boolean z2 = false;
            if (chatAudioPermission != null && !chatAudioPermission.isAudioAvailable()) {
                z2 = true;
            }
            if (z2) {
                ChatAudioPermission chatAudioPermission2 = this.chatAudioPermission;
                if (chatAudioPermission2 != null && (onNoPermissionClick = chatAudioPermission2.getOnNoPermissionClick()) != null) {
                    onNoPermissionClick.invoke();
                }
                if (!z || (list = this.eventListeners) == null) {
                    return;
                }
                for (ChatAudioViewEventListener chatAudioViewEventListener : list) {
                    chatAudioViewEventListener.onPlayClick();
                }
                return;
            }
        }
        onSubscriberClick(z);
    }

    private final void onSubscriberClick(boolean z) {
        List<? extends ChatAudioViewEventListener> list;
        List<? extends ChatAudioViewEventListener> list2;
        PlaybackController playbackController;
        List<? extends ChatAudioViewEventListener> list3;
        int i = WhenMappings.$EnumSwitchMapping$0[this.playbackState.ordinal()];
        if (i == 1) {
            setPlaybackState(PlaybackState.LOAD);
            if (!z || (list = this.eventListeners) == null) {
                return;
            }
            for (ChatAudioViewEventListener chatAudioViewEventListener : list) {
                chatAudioViewEventListener.onPlayClick();
            }
            return;
        }
        if (i != 2) {
            if (i == 4) {
                setPlaybackState(PlaybackState.PAUSE);
                VoiceSamplePlayback voiceSamplePlayback = this.voiceSamplePlayback;
                if (voiceSamplePlayback == null || (playbackController = voiceSamplePlayback.getPlaybackController()) == null) {
                    return;
                }
                long currentPosition = playbackController.getCurrentPosition();
                if (!z || (list3 = this.eventListeners) == null) {
                    return;
                }
                for (ChatAudioViewEventListener chatAudioViewEventListener2 : list3) {
                    chatAudioViewEventListener2.onPauseClick(currentPosition);
                }
                return;
            } else if (i != 5) {
                return;
            }
        }
        setPlaybackState(PlaybackState.PLAY);
        if (!z || (list2 = this.eventListeners) == null) {
            return;
        }
        for (ChatAudioViewEventListener chatAudioViewEventListener3 : list2) {
            chatAudioViewEventListener3.onPlayClick();
        }
    }

    private final void setPauseUIState() {
        this.loadProgress.setVisibility(4);
        this.playButton.setVisibility(0);
        this.playButton.setImageResource(R.drawable.play);
    }

    private final void setPlayUIState() {
        this.loadProgress.setVisibility(4);
        this.playButton.setVisibility(0);
        this.playButton.setImageResource(R.drawable.pause);
    }

    private final void setLoadUIState() {
        this.loadProgress.setVisibility(0);
        this.playButton.setVisibility(4);
    }

    private final void loadAudioMessage() {
        String audioUrl;
        PlaybackController playbackController;
        VoiceSamplePlayback voiceSamplePlayback;
        PlaybackController playbackController2;
        PlaybackControllerListeners playbackControllerListeners;
        Function0<Unit> onPlayerInterrupt;
        PlaybackController playbackController3;
        VoiceSamplePlayback voiceSamplePlayback2 = this.voiceSamplePlayback;
        if (voiceSamplePlayback2 == null || (audioUrl = voiceSamplePlayback2.getAudioUrl()) == null) {
            return;
        }
        VoiceSamplePlayback voiceSamplePlayback3 = this.voiceSamplePlayback;
        if (!Intrinsics.areEqual((voiceSamplePlayback3 == null || (playbackController3 = voiceSamplePlayback3.getPlaybackController()) == null) ? null : playbackController3.getAudioUrl(), audioUrl) && (voiceSamplePlayback = this.voiceSamplePlayback) != null && (playbackController2 = voiceSamplePlayback.getPlaybackController()) != null && (playbackControllerListeners = playbackController2.getPlaybackControllerListeners()) != null && (onPlayerInterrupt = playbackControllerListeners.getOnPlayerInterrupt()) != null) {
            onPlayerInterrupt.invoke();
        }
        setPlaybackControllerListeners();
        VoiceSamplePlayback voiceSamplePlayback4 = this.voiceSamplePlayback;
        if (voiceSamplePlayback4 == null || (playbackController = voiceSamplePlayback4.getPlaybackController()) == null) {
            return;
        }
        playbackController.loadAudio(audioUrl);
    }

    private final void play() {
        PlaybackController playbackController;
        VoiceSamplePlayback voiceSamplePlayback = this.voiceSamplePlayback;
        if (voiceSamplePlayback == null || (playbackController = voiceSamplePlayback.getPlaybackController()) == null) {
            return;
        }
        playbackController.play();
        this.rewindView.play();
        List<? extends ChatAudioViewEventListener> list = this.eventListeners;
        if (list != null) {
            for (ChatAudioViewEventListener chatAudioViewEventListener : list) {
                chatAudioViewEventListener.onPlaybackStarted();
            }
        }
    }

    private final void pause() {
        PlaybackController playbackController;
        VoiceSamplePlayback voiceSamplePlayback = this.voiceSamplePlayback;
        if (voiceSamplePlayback != null && (playbackController = voiceSamplePlayback.getPlaybackController()) != null) {
            PlaybackController.DefaultImpls.pause$default(playbackController, null, 1, null);
        }
        this.rewindView.pause();
    }
}
