package com.ifriend.ui.imageView.animatedAvatarView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.signature.ObjectKey;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.ifriend.ui.R;
import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.UIUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnimatedAvatarView.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002J\u001a\u0010&\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020*H\u0002J\b\u0010-\u001a\u00020\u0018H\u0014J\b\u0010.\u001a\u00020\u0018H\u0014J\u0006\u0010/\u001a\u00020\u0018J<\u00100\u001a\u00020\u00182\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00180\u0017j\u0002`\u00192\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00180\u0017j\u0002`\u00192\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00180\u0017j\u0002`\u0019J\b\u00101\u001a\u00020\u0018H\u0002J\u0010\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020\u0018H\u0002J\u0010\u00106\u001a\u00020\u00182\u0006\u00103\u001a\u000204H\u0002J\u000e\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u00020 R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00180\u0017j\u0002`\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00180\u0017j\u0002`\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00180\u0017j\u0002`\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "background", "bigPlaceholder", "Landroid/view/View;", "bigPlaceholderText", "Landroid/widget/TextView;", "changeAnimationStateButton", "exoPlayer", "Lcom/google/android/exoplayer2/ExoPlayer;", "generatingAnimation", "imageView", "Landroid/widget/ImageView;", "onGenerationClick", "Lkotlin/Function0;", "", "Lcom/ifriend/ui/tools/OnClick;", "onPauseClick", "onPlayClick", "pause", "play", "smallPlaceholder", "state", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "videoView", "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "goneAllControls", "hideControlsState", "initVideoPlayer", "loadImage", "image", "", "signature", "", "loadVideo", "video", "onAttachedToWindow", "onDetachedFromWindow", "pauseAnimation", "setListeners", "showPauseControlsState", "showPauseState", "showControls", "", "showPlayingControlsState", "showPlayingState", "update", "newState", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnimatedAvatarView extends ConstraintLayout {
    public static final int $stable = 8;
    private final ConstraintLayout background;
    private final View bigPlaceholder;
    private final TextView bigPlaceholderText;
    private final ConstraintLayout changeAnimationStateButton;
    private ExoPlayer exoPlayer;
    private final ConstraintLayout generatingAnimation;
    private final ImageView imageView;
    private Function0<Unit> onGenerationClick;
    private Function0<Unit> onPauseClick;
    private Function0<Unit> onPlayClick;
    private final ImageView pause;
    private final ImageView play;
    private final View smallPlaceholder;
    private AnimatedAvatarViewState state;
    private final StyledPlayerView videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = AnimatedAvatarViewState.Companion.empty();
        ConstraintLayout.inflate(context, R.layout.animated_avatar_view, this);
        View findViewById = findViewById(R.id.avatar_video);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.videoView = (StyledPlayerView) findViewById;
        View findViewById2 = findViewById(R.id.avatar_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.imageView = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.background);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById3;
        this.background = constraintLayout;
        View findViewById4 = findViewById(R.id.avatar_small_placeholder);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.smallPlaceholder = findViewById4;
        View findViewById5 = findViewById(R.id.avatar_big_placeholder);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.bigPlaceholder = findViewById5;
        View findViewById6 = findViewById(R.id.avatar_big_placeholder_text);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.bigPlaceholderText = (TextView) findViewById6;
        constraintLayout.setClipToOutline(true);
        View findViewById7 = findViewById(R.id.generating_animation);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById7;
        constraintLayout2.setClipToOutline(true);
        Modification modification = Modification.INSTANCE;
        Intrinsics.checkNotNull(constraintLayout2);
        modification.onTouchOpacity(constraintLayout2);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.generatingAnimation = constraintLayout2;
        View findViewById8 = findViewById(R.id.change_animation_state_button);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) findViewById8;
        constraintLayout3.setClipToOutline(true);
        Modification modification2 = Modification.INSTANCE;
        Intrinsics.checkNotNull(constraintLayout3);
        modification2.onTouchOpacity(constraintLayout3);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        this.changeAnimationStateButton = constraintLayout3;
        View findViewById9 = findViewById(R.id.play_avatar_animation);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.play = (ImageView) findViewById9;
        View findViewById10 = findViewById(R.id.pause_avatar_animation);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.pause = (ImageView) findViewById10;
        this.onGenerationClick = AnimatedAvatarView$onGenerationClick$1.INSTANCE;
        this.onPlayClick = AnimatedAvatarView$onPlayClick$1.INSTANCE;
        this.onPauseClick = AnimatedAvatarView$onPauseClick$1.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedAvatarView(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initVideoPlayer();
        update(this.state);
    }

    private final void initVideoPlayer() {
        ExoPlayer build = new ExoPlayer.Builder(getContext()).build();
        build.setRepeatMode(2);
        build.setPlayWhenReady(true);
        build.setVolume(0.0f);
        this.exoPlayer = build;
        this.videoView.setPlayer(build);
    }

    public final void setListeners(Function0<Unit> onGenerationClick, Function0<Unit> onPlayClick, Function0<Unit> onPauseClick) {
        Intrinsics.checkNotNullParameter(onGenerationClick, "onGenerationClick");
        Intrinsics.checkNotNullParameter(onPlayClick, "onPlayClick");
        Intrinsics.checkNotNullParameter(onPauseClick, "onPauseClick");
        this.onGenerationClick = onGenerationClick;
        this.onPlayClick = onPlayClick;
        this.onPauseClick = onPauseClick;
    }

    public final void update(final AnimatedAvatarViewState newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.state = newState;
        UIUtilsKt.cropCorners(this.background, newState.getCornersSize());
        loadImage(newState.getImage(), newState.getSignature());
        goneAllControls();
        if (!(newState instanceof AnimatedAvatarViewState.StaticAvatar)) {
            if (!(newState instanceof AnimatedAvatarViewState.GeneratingVideoAvatar)) {
                if (!(newState instanceof AnimatedAvatarViewState.PauseVideoAvatar)) {
                    if (!(newState instanceof AnimatedAvatarViewState.PlayingVideoAvatar)) {
                        if (newState instanceof AnimatedAvatarViewState.Placeholder) {
                            AnimatedAvatarViewState.Placeholder placeholder = (AnimatedAvatarViewState.Placeholder) newState;
                            AnimatedAvatarViewState.Placeholder.Presentation presentation = placeholder.getPresentation();
                            if (!(presentation instanceof AnimatedAvatarViewState.Placeholder.Presentation.Big)) {
                                if (Intrinsics.areEqual(presentation, AnimatedAvatarViewState.Placeholder.Presentation.Small.INSTANCE)) {
                                    this.smallPlaceholder.setVisibility(0);
                                    this.bigPlaceholder.setVisibility(4);
                                }
                            } else {
                                this.bigPlaceholder.setVisibility(0);
                                this.smallPlaceholder.setVisibility(4);
                                this.bigPlaceholderText.setText(getContext().getString(R.string.avatar_big_placeholder_text, ((AnimatedAvatarViewState.Placeholder.Presentation.Big) placeholder.getPresentation()).getBotName()));
                            }
                            this.generatingAnimation.setVisibility(8);
                            this.videoView.setVisibility(4);
                            this.imageView.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    this.smallPlaceholder.setVisibility(4);
                    this.bigPlaceholder.setVisibility(4);
                    AnimatedAvatarViewState.PlayingVideoAvatar playingVideoAvatar = (AnimatedAvatarViewState.PlayingVideoAvatar) newState;
                    showPlayingState(playingVideoAvatar.getShowControls());
                    this.changeAnimationStateButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarView$$ExternalSyntheticLambda2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AnimatedAvatarView.update$lambda$5(AnimatedAvatarView.this, newState, view);
                        }
                    });
                    loadVideo(playingVideoAvatar.getVideo());
                    ExoPlayer exoPlayer = this.exoPlayer;
                    if (exoPlayer != null) {
                        exoPlayer.play();
                        return;
                    }
                    return;
                }
                this.smallPlaceholder.setVisibility(4);
                this.bigPlaceholder.setVisibility(4);
                AnimatedAvatarViewState.PauseVideoAvatar pauseVideoAvatar = (AnimatedAvatarViewState.PauseVideoAvatar) newState;
                showPauseState(pauseVideoAvatar.getShowControls());
                this.changeAnimationStateButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarView$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AnimatedAvatarView.update$lambda$4(AnimatedAvatarView.this, newState, view);
                    }
                });
                loadVideo(pauseVideoAvatar.getVideo());
                ExoPlayer exoPlayer2 = this.exoPlayer;
                if (exoPlayer2 != null) {
                    exoPlayer2.pause();
                    return;
                }
                return;
            }
            this.generatingAnimation.setVisibility(((AnimatedAvatarViewState.GeneratingVideoAvatar) newState).getShowControls() ? 0 : 8);
            this.videoView.setVisibility(4);
            this.imageView.setVisibility(0);
            this.smallPlaceholder.setVisibility(4);
            this.bigPlaceholder.setVisibility(4);
            ExoPlayer exoPlayer3 = this.exoPlayer;
            if (exoPlayer3 != null) {
                exoPlayer3.setPlayWhenReady(false);
            }
            this.generatingAnimation.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnimatedAvatarView.update$lambda$3(AnimatedAvatarView.this, view);
                }
            });
            return;
        }
        this.videoView.setVisibility(4);
        this.imageView.setVisibility(0);
        this.smallPlaceholder.setVisibility(4);
        this.bigPlaceholder.setVisibility(4);
        ExoPlayer exoPlayer4 = this.exoPlayer;
        if (exoPlayer4 == null) {
            return;
        }
        exoPlayer4.setPlayWhenReady(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void update$lambda$3(AnimatedAvatarView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onGenerationClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void update$lambda$4(AnimatedAvatarView this$0, AnimatedAvatarViewState newState, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(newState, "$newState");
        ExoPlayer exoPlayer = this$0.exoPlayer;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
        this$0.showPlayingState(((AnimatedAvatarViewState.PauseVideoAvatar) newState).getShowControls());
        this$0.onPlayClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void update$lambda$5(AnimatedAvatarView this$0, AnimatedAvatarViewState newState, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(newState, "$newState");
        ExoPlayer exoPlayer = this$0.exoPlayer;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
        this$0.showPauseState(((AnimatedAvatarViewState.PlayingVideoAvatar) newState).getShowControls());
        this$0.onPauseClick.invoke();
    }

    private final void showPlayingState(boolean z) {
        this.videoView.setVisibility(0);
        if (z) {
            showPlayingControlsState();
        } else {
            hideControlsState();
        }
    }

    private final void showPlayingControlsState() {
        this.changeAnimationStateButton.setVisibility(0);
        this.play.setVisibility(8);
        this.pause.setVisibility(0);
    }

    private final void showPauseState(boolean z) {
        this.videoView.setVisibility(4);
        if (z) {
            showPauseControlsState();
        } else {
            hideControlsState();
        }
    }

    private final void showPauseControlsState() {
        this.changeAnimationStateButton.setVisibility(0);
        this.play.setVisibility(0);
        this.pause.setVisibility(8);
    }

    private final void hideControlsState() {
        this.changeAnimationStateButton.setVisibility(8);
        this.generatingAnimation.setVisibility(8);
        this.play.setVisibility(8);
        this.pause.setVisibility(8);
    }

    private final void loadVideo(String str) {
        ExoPlayer exoPlayer = this.exoPlayer;
        if (exoPlayer != null) {
            exoPlayer.setMediaItem(MediaItem.fromUri(str));
        }
        ExoPlayer exoPlayer2 = this.exoPlayer;
        if (exoPlayer2 != null) {
            exoPlayer2.prepare();
        }
    }

    private final void loadImage(Object obj, String str) {
        if (obj == null) {
            this.imageView.setImageResource(0);
        } else {
            Glide.with(this).load(obj).signature(new ObjectKey(str)).set(Downsampler.ALLOW_HARDWARE_CONFIG, false).into(this.imageView);
        }
    }

    private final void goneAllControls() {
        for (View view : CollectionsKt.listOf((Object[]) new View[]{this.generatingAnimation, this.changeAnimationStateButton, this.play, this.pause})) {
            view.setVisibility(8);
        }
    }

    public final void pauseAnimation() {
        this.videoView.setVisibility(4);
        ExoPlayer exoPlayer = this.exoPlayer;
        if (exoPlayer == null) {
            return;
        }
        exoPlayer.setPlayWhenReady(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ExoPlayer exoPlayer = this.exoPlayer;
        if (exoPlayer != null) {
            exoPlayer.release();
        }
        this.exoPlayer = null;
    }
}
