package com.ifriend.ui.recyclerView.audio.audioView.rewindView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ifriend.domain.models.profile.bot.BotVoiceConfig;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.Animations;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HistogramAudioRewindView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001b\u001a\u00020\u0016J\u0006\u0010\u001c\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u0016J\u0016\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001aJ\b\u0010\"\u001a\u00020\u0016H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ifriend/ui/recyclerView/audio/audioView/rewindView/HistogramAudioRewindView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animatedHistogram", "Lcom/airbnb/lottie/LottieAnimationView;", "backgroundHistogram", "Landroid/widget/ImageView;", "value", "", "isYours", "()Z", "setYours", "(Z)V", "generate", "", "voiceConfig", "Lcom/ifriend/domain/models/profile/bot/BotVoiceConfig;", "getTargetBackgroundAlpha", "", "pause", "play", "seekToStart", "showInitialState", "showState", "isPlaying", "progress", "updateBackgroundAlpha", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HistogramAudioRewindView extends ConstraintLayout {
    private final LottieAnimationView animatedHistogram;
    private final ImageView backgroundHistogram;
    private boolean isYours;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistogramAudioRewindView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.histogram_rewind_view, this);
        View findViewById = findViewById(R.id.animation_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.animatedHistogram = (LottieAnimationView) findViewById;
        View findViewById2 = findViewById(R.id.progress);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.backgroundHistogram = (ImageView) findViewById2;
        updateBackgroundAlpha();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HistogramAudioRewindView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HistogramAudioRewindView(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean isYours() {
        return this.isYours;
    }

    public final void setYours(boolean z) {
        this.isYours = z;
        updateBackgroundAlpha();
    }

    private final void updateBackgroundAlpha() {
        this.backgroundHistogram.setAlpha(getTargetBackgroundAlpha());
    }

    private final float getTargetBackgroundAlpha() {
        return this.isYours ? 0.2f : 1.0f;
    }

    public final void play() {
        this.animatedHistogram.resumeAnimation();
        Animations.INSTANCE.fadeIn(this.animatedHistogram);
        Animations.INSTANCE.fadeOut(this.backgroundHistogram);
    }

    public final void pause() {
        this.animatedHistogram.pauseAnimation();
    }

    public final void seekToStart() {
        this.animatedHistogram.setProgress(0.0f);
        this.animatedHistogram.cancelAnimation();
        Animations.INSTANCE.changeAlphaTo(this.backgroundHistogram, getTargetBackgroundAlpha());
        Animations.INSTANCE.fadeOut(this.animatedHistogram);
    }

    public final void generate(BotVoiceConfig voiceConfig) {
        Intrinsics.checkNotNullParameter(voiceConfig, "voiceConfig");
        this.backgroundHistogram.setImageResource(RewindResources.INSTANCE.getHistogramBackgrounds().get(HistogramAudioRewindViewKt.randomIfNotInLimit(voiceConfig.getCurrentVoiceIndex(), RewindResources.INSTANCE.getHistogramBackgrounds().size())).intValue());
    }

    public final void showState(boolean z, float f) {
        Animation animation = this.backgroundHistogram.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.animatedHistogram.getAnimation();
        if (animation2 != null) {
            animation2.cancel();
        }
        if (z) {
            this.backgroundHistogram.setAlpha(0.0f);
            this.animatedHistogram.setAlpha(1.0f);
            this.animatedHistogram.setProgress(f);
            this.animatedHistogram.resumeAnimation();
            return;
        }
        this.backgroundHistogram.setAlpha(getTargetBackgroundAlpha());
        this.animatedHistogram.setAlpha(0.0f);
    }

    public final void showInitialState() {
        showState(false, 0.0f);
    }
}
