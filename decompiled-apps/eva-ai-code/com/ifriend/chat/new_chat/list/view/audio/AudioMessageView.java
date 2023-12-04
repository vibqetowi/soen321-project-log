package com.ifriend.chat.new_chat.list.view.audio;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import by.kirich1409.viewbindingdelegate.EagerViewBindingProperty;
import by.kirich1409.viewbindingdelegate.LazyViewBindingProperty;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.airbnb.lottie.LottieAnimationView;
import com.ifriend.chat.new_chat.R;
import com.ifriend.chat.new_chat.databinding.ViewAudioMessageBinding;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import com.ifriend.ui.utils.Animations;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: AudioMessageView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0005 !\"#$B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018J*\u0010\u0019\u001a\u00020\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001e\u001a\u00020\u0011H\u0002J\u0006\u0010\u001f\u001a\u00020\u0011R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/ifriend/chat/new_chat/databinding/ViewAudioMessageBinding;", "getBinding", "()Lcom/ifriend/chat/new_chat/databinding/ViewAudioMessageBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "pauseIcon", "Landroid/graphics/drawable/Drawable;", "playIcon", "bindState", "", "state", "Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$State;", "histogram", "", "botAudio", "isPremium", "", "customizeUI", "histogramTint", "Landroid/content/res/ColorStateList;", "playIconTint", "playBackgroundTint", "resetToStart", "userAudio", "Bind", "Loading", "Pause", "Playing", "State", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioMessageView extends ConstraintLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AudioMessageView.class, "binding", "getBinding()Lcom/ifriend/chat/new_chat/databinding/ViewAudioMessageBinding;", 0))};
    public static final int $stable = 8;
    private final ViewBindingProperty binding$delegate;
    private Drawable pauseIcon;
    private Drawable playIcon;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioMessageView(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AudioMessageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LazyViewBindingProperty lazyViewBindingProperty;
        Intrinsics.checkNotNullParameter(context, "context");
        AudioMessageView audioMessageView = this;
        Function1 emptyVbCallback = UtilsKt.emptyVbCallback();
        if (audioMessageView.isInEditMode()) {
            lazyViewBindingProperty = new EagerViewBindingProperty(ViewAudioMessageBinding.bind(audioMessageView));
        } else {
            lazyViewBindingProperty = new LazyViewBindingProperty(emptyVbCallback, new AudioMessageView$special$$inlined$viewBinding$1());
        }
        this.binding$delegate = lazyViewBindingProperty;
        ConstraintLayout.inflate(context, R.layout.view_audio_message, audioMessageView);
        int toPxInt = UIUtils.INSTANCE.getToPxInt((Number) 12);
        setPadding(toPxInt, toPxInt, toPxInt, toPxInt);
        setBackgroundResource(com.ifriend.ui.R.drawable.audio_message_background);
        this.playIcon = ContextCompat.getDrawable(context, R.drawable.ic_play_24);
        this.pauseIcon = ContextCompat.getDrawable(context, R.drawable.ic_pause_24);
    }

    private final ViewAudioMessageBinding getBinding() {
        return (ViewAudioMessageBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final void botAudio(boolean z) {
        ColorStateList valueOf;
        CardView premiumAnimationCard = getBinding().premiumAnimationCard;
        Intrinsics.checkNotNullExpressionValue(premiumAnimationCard, "premiumAnimationCard");
        premiumAnimationCard.setVisibility(z ? 0 : 8);
        if (z) {
            getBinding().premiumAnimation.playAnimation();
        } else {
            getBinding().premiumAnimation.pauseAnimation();
        }
        ColorStateList colorStateList = ContextCompat.getColorStateList(getContext(), com.ifriend.ui.R.color.white);
        ColorStateList colorStateList2 = ContextCompat.getColorStateList(getContext(), com.ifriend.ui.R.color.white);
        if (!z) {
            valueOf = ContextCompat.getColorStateList(getContext(), com.ifriend.ui.R.color.blue);
        } else {
            valueOf = ColorStateList.valueOf(0);
        }
        customizeUI(colorStateList, colorStateList2, valueOf);
    }

    public final void userAudio() {
        customizeUI(ContextCompat.getColorStateList(getContext(), com.ifriend.ui.R.color.white_20), ContextCompat.getColorStateList(getContext(), com.ifriend.ui.R.color.white_50), ContextCompat.getColorStateList(getContext(), com.ifriend.ui.R.color.white_20));
    }

    public static /* synthetic */ void customizeUI$default(AudioMessageView audioMessageView, ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, Object obj) {
        if ((i & 1) != 0) {
            colorStateList = null;
        }
        if ((i & 2) != 0) {
            colorStateList2 = null;
        }
        if ((i & 4) != 0) {
            colorStateList3 = null;
        }
        audioMessageView.customizeUI(colorStateList, colorStateList2, colorStateList3);
    }

    public final void customizeUI(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3) {
        ViewAudioMessageBinding binding = getBinding();
        ImageViewCompat.setImageTintList(binding.audioMessageHistogramView, colorStateList);
        ImageViewCompat.setImageTintList(binding.audioMessagePlayIcon, colorStateList2);
        binding.audioMessagePlayIcon.setBackgroundTintList(colorStateList3);
    }

    public final void bindState(State state, int i) {
        Intrinsics.checkNotNullParameter(state, "state");
        ViewAudioMessageBinding binding = getBinding();
        binding.audioMessageHistogramView.setImageResource(i);
        ProgressBar audioMessageProgress = binding.audioMessageProgress;
        Intrinsics.checkNotNullExpressionValue(audioMessageProgress, "audioMessageProgress");
        audioMessageProgress.setVisibility(Intrinsics.areEqual(state, Loading.INSTANCE) ^ true ? 4 : 0);
        if (state instanceof Bind) {
            resetToStart();
        } else if (state instanceof Playing) {
            binding.audioMessagePlayIcon.setImageDrawable(this.pauseIcon);
            Playing playing = (Playing) state;
            if (playing.getPosition() == 0) {
                Animations animations = Animations.INSTANCE;
                AppCompatImageView audioMessageHistogramView = binding.audioMessageHistogramView;
                Intrinsics.checkNotNullExpressionValue(audioMessageHistogramView, "audioMessageHistogramView");
                animations.fadeOut(audioMessageHistogramView);
                Animations animations2 = Animations.INSTANCE;
                LottieAnimationView audioMessagePlaybackAnimationView = binding.audioMessagePlaybackAnimationView;
                Intrinsics.checkNotNullExpressionValue(audioMessagePlaybackAnimationView, "audioMessagePlaybackAnimationView");
                animations2.fadeIn(audioMessagePlaybackAnimationView);
            } else {
                binding.audioMessageHistogramView.animate().cancel();
                binding.audioMessageHistogramView.setAlpha(0.0f);
                binding.audioMessagePlaybackAnimationView.animate().cancel();
                binding.audioMessagePlaybackAnimationView.setAlpha(1.0f);
            }
            binding.audioMessagePlaybackAnimationView.setProgress(((float) playing.getPosition()) / ((float) binding.audioMessagePlaybackAnimationView.getDuration()));
            binding.audioMessagePlaybackAnimationView.resumeAnimation();
        } else if (state instanceof Pause) {
            binding.audioMessagePlayIcon.setImageDrawable(this.playIcon);
            binding.audioMessageHistogramView.animate().cancel();
            binding.audioMessageHistogramView.setAlpha(0.0f);
            binding.audioMessagePlaybackAnimationView.animate().cancel();
            binding.audioMessagePlaybackAnimationView.setAlpha(1.0f);
            binding.audioMessagePlaybackAnimationView.setProgress(((float) ((Pause) state).getPosition()) / ((float) binding.audioMessagePlaybackAnimationView.getDuration()));
            binding.audioMessagePlaybackAnimationView.pauseAnimation();
        } else if (Intrinsics.areEqual(state, Loading.INSTANCE)) {
            binding.audioMessagePlayIcon.setImageDrawable(null);
        }
    }

    private final void resetToStart() {
        ViewAudioMessageBinding binding = getBinding();
        binding.audioMessagePlayIcon.setImageDrawable(this.playIcon);
        binding.audioMessageHistogramView.animate().cancel();
        binding.audioMessageHistogramView.setAlpha(1.0f);
        binding.audioMessagePlaybackAnimationView.cancelAnimation();
        binding.audioMessagePlaybackAnimationView.animate().cancel();
        binding.audioMessagePlaybackAnimationView.setAlpha(0.0f);
        binding.audioMessagePlaybackAnimationView.setProgress(0.0f);
    }

    /* compiled from: AudioMessageView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$State;", "", "()V", "Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$Bind;", "Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$Loading;", "Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$Pause;", "Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$Playing;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class State {
        public static final int $stable = 0;

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private State() {
        }
    }

    /* compiled from: AudioMessageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$Bind;", "Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$State;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Bind extends State {
        public static final int $stable = 0;
        public static final Bind INSTANCE = new Bind();

        private Bind() {
            super(null);
        }
    }

    /* compiled from: AudioMessageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$Loading;", "Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$State;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Loading extends State {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: AudioMessageView.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$Playing;", "Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$State;", "position", "", "duration", "(JJ)V", "getDuration", "()J", "getPosition", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Playing extends State {
        public static final int $stable = 0;
        private final long duration;
        private final long position;

        public static /* synthetic */ Playing copy$default(Playing playing, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = playing.position;
            }
            if ((i & 2) != 0) {
                j2 = playing.duration;
            }
            return playing.copy(j, j2);
        }

        public final long component1() {
            return this.position;
        }

        public final long component2() {
            return this.duration;
        }

        public final Playing copy(long j, long j2) {
            return new Playing(j, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Playing) {
                Playing playing = (Playing) obj;
                return this.position == playing.position && this.duration == playing.duration;
            }
            return false;
        }

        public int hashCode() {
            return (AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.position) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.duration);
        }

        public String toString() {
            long j = this.position;
            long j2 = this.duration;
            return "Playing(position=" + j + ", duration=" + j2 + ")";
        }

        public Playing(long j, long j2) {
            super(null);
            this.position = j;
            this.duration = j2;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getPosition() {
            return this.position;
        }
    }

    /* compiled from: AudioMessageView.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$Pause;", "Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$State;", "position", "", "duration", "(JJ)V", "getDuration", "()J", "getPosition", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Pause extends State {
        public static final int $stable = 0;
        private final long duration;
        private final long position;

        public static /* synthetic */ Pause copy$default(Pause pause, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = pause.position;
            }
            if ((i & 2) != 0) {
                j2 = pause.duration;
            }
            return pause.copy(j, j2);
        }

        public final long component1() {
            return this.position;
        }

        public final long component2() {
            return this.duration;
        }

        public final Pause copy(long j, long j2) {
            return new Pause(j, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Pause) {
                Pause pause = (Pause) obj;
                return this.position == pause.position && this.duration == pause.duration;
            }
            return false;
        }

        public int hashCode() {
            return (AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.position) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.duration);
        }

        public String toString() {
            long j = this.position;
            long j2 = this.duration;
            return "Pause(position=" + j + ", duration=" + j2 + ")";
        }

        public Pause(long j, long j2) {
            super(null);
            this.position = j;
            this.duration = j2;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getPosition() {
            return this.position;
        }
    }
}
