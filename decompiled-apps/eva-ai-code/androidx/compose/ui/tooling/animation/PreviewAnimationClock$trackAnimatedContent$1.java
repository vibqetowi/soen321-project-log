package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PreviewAnimationClock.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PreviewAnimationClock$trackAnimatedContent$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ Transition<?> $animation;
    final /* synthetic */ PreviewAnimationClock this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAnimationClock$trackAnimatedContent$1(Transition<?> transition, PreviewAnimationClock previewAnimationClock) {
        super(1);
        this.$animation = transition;
        this.this$0 = previewAnimationClock;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AnimatedContentComposeAnimation<?> parseAnimatedContent = AnimatedContentComposeAnimation.Companion.parseAnimatedContent(this.$animation);
        if (parseAnimatedContent != null) {
            PreviewAnimationClock previewAnimationClock = this.this$0;
            previewAnimationClock.getAnimatedContentClocks$ui_tooling_release().put(parseAnimatedContent, new TransitionClock<>(parseAnimatedContent));
            previewAnimationClock.notifySubscribe(parseAnimatedContent);
        }
    }
}
