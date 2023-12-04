package com.ifriend.ui.recyclerView.audio.audioView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.domain.models.chat.ChatAudioViewEventListener;
import com.ifriend.domain.models.profile.bot.BotVoiceConfig;
import com.ifriend.ui.R;
import com.ifriend.ui.recyclerView.audio.audioView.playback.VoiceSampleAudioPlaybackFacade;
import com.ifriend.ui.recyclerView.audio.audioView.playback.VoiceSamplePlayback;
import com.ifriend.ui.recyclerView.audio.audioView.rewindView.HistogramAudioRewindView;
import com.ifriend.ui.utils.Modification;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: VoiceSampleView.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u001e\u0010+\u001a\u00020)2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-R\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0012\u0010\u0013RF\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00162\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0018\u0010\u0019R#\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010#\u001a\n \u001c*\u0004\u0018\u00010$0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/ifriend/ui/recyclerView/audio/audioView/VoiceSampleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/ifriend/ui/recyclerView/audio/audioView/ChatAudioPermission;", "chatAudioPermission", "setChatAudioPermission", "(Lcom/ifriend/ui/recyclerView/audio/audioView/ChatAudioPermission;)V", "Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSamplePlayback;", "chatAudioPlayback", "setChatAudioPlayback", "(Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSamplePlayback;)V", "Ljava/util/ArrayList;", "Lcom/ifriend/domain/models/chat/ChatAudioViewEventListener;", "Lkotlin/collections/ArrayList;", "eventListeners", "setEventListeners", "(Ljava/util/ArrayList;)V", "playBackground", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getPlayBackground", "()Landroid/widget/ImageView;", "playBackground$delegate", "Lkotlin/Lazy;", "playbackFacade", "Lcom/ifriend/ui/recyclerView/audio/audioView/playback/VoiceSampleAudioPlaybackFacade;", "rewind", "Lcom/ifriend/ui/recyclerView/audio/audioView/rewindView/HistogramAudioRewindView;", "getRewind", "()Lcom/ifriend/ui/recyclerView/audio/audioView/rewindView/HistogramAudioRewindView;", "rewind$delegate", "pause", "", "play", "setContent", "config", "Lcom/ifriend/domain/models/profile/bot/BotVoiceConfig;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VoiceSampleView extends ConstraintLayout {
    public static final int $stable = 8;
    private ChatAudioPermission chatAudioPermission;
    private VoiceSamplePlayback chatAudioPlayback;
    private ArrayList<ChatAudioViewEventListener> eventListeners;
    private final Lazy playBackground$delegate;
    private final VoiceSampleAudioPlaybackFacade playbackFacade;
    private final Lazy rewind$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSampleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.playBackground$delegate = LazyKt.lazy(new VoiceSampleView$playBackground$2(this));
        this.rewind$delegate = LazyKt.lazy(new VoiceSampleView$rewind$2(this));
        ConstraintLayout.inflate(context, R.layout.histogram_audio_view_chat, this);
        final ImageView imageView = (ImageView) findViewById(R.id.play_button);
        getPlayBackground().setImageResource(R.drawable.play_background_yours);
        ImageView playBackground = getPlayBackground();
        playBackground.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.recyclerView.audio.audioView.VoiceSampleView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                imageView.callOnClick();
            }
        });
        Modification modification = Modification.INSTANCE;
        Intrinsics.checkNotNull(playBackground);
        modification.onTouchOpacity(playBackground);
        getRewind().setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.recyclerView.audio.audioView.VoiceSampleView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                imageView.callOnClick();
            }
        });
        Intrinsics.checkNotNull(imageView);
        View findViewById = findViewById(R.id.playback_load_progress);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        HistogramAudioRewindView rewind = getRewind();
        Intrinsics.checkNotNullExpressionValue(rewind, "<get-rewind>(...)");
        this.playbackFacade = new VoiceSampleAudioPlaybackFacade(imageView, (ProgressBar) findViewById, rewind);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoiceSampleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoiceSampleView(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setEventListeners(ArrayList<ChatAudioViewEventListener> arrayList) {
        this.eventListeners = arrayList;
        this.playbackFacade.setEventListeners(arrayList);
    }

    private final void setChatAudioPermission(ChatAudioPermission chatAudioPermission) {
        this.chatAudioPermission = chatAudioPermission;
        this.playbackFacade.setChatAudioPermission(chatAudioPermission);
    }

    private final void setChatAudioPlayback(VoiceSamplePlayback voiceSamplePlayback) {
        this.chatAudioPlayback = voiceSamplePlayback;
        this.playbackFacade.setVoiceSamplePlayback(voiceSamplePlayback);
    }

    private final ImageView getPlayBackground() {
        return (ImageView) this.playBackground$delegate.getValue();
    }

    private final HistogramAudioRewindView getRewind() {
        return (HistogramAudioRewindView) this.rewind$delegate.getValue();
    }

    public final void setContent(ChatAudioPermission chatAudioPermission, VoiceSamplePlayback chatAudioPlayback, BotVoiceConfig config) {
        Intrinsics.checkNotNullParameter(chatAudioPermission, "chatAudioPermission");
        Intrinsics.checkNotNullParameter(chatAudioPlayback, "chatAudioPlayback");
        Intrinsics.checkNotNullParameter(config, "config");
        setChatAudioPermission(chatAudioPermission);
        setChatAudioPlayback(chatAudioPlayback);
        setEventListeners(null);
        getRewind().generate(config);
    }

    public final void play() {
        if (this.playbackFacade.getPlaybackState() != VoiceSampleAudioPlaybackFacade.PlaybackState.PLAY) {
            this.playbackFacade.onPlayClick(false);
        }
    }

    public final void pause() {
        if (this.playbackFacade.getPlaybackState() == VoiceSampleAudioPlaybackFacade.PlaybackState.PLAY) {
            this.playbackFacade.onPlayClick(false);
        }
    }
}
