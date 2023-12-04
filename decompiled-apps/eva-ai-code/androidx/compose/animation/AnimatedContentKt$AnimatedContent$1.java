package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedContent.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$1 extends Lambda implements Function1<AnimatedContentTransitionScope<S>, ContentTransform> {
    public static final AnimatedContentKt$AnimatedContent$1 INSTANCE = new AnimatedContentKt$AnimatedContent$1();

    AnimatedContentKt$AnimatedContent$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "$this$null");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m304scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
    }
}
