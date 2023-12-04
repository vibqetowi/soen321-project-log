package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.clock.AnimateXAsStateClock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PreviewAnimationClock.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PreviewAnimationClock$trackAnimateXAsState$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ AnimationSearch.AnimateXAsStateSearchInfo<?, ?> $animation;
    final /* synthetic */ PreviewAnimationClock this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAnimationClock$trackAnimateXAsState$1(AnimationSearch.AnimateXAsStateSearchInfo<?, ?> animateXAsStateSearchInfo, PreviewAnimationClock previewAnimationClock) {
        super(1);
        this.$animation = animateXAsStateSearchInfo;
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
        AnimateXAsStateComposeAnimation<?, ?> parse$ui_tooling_release = AnimateXAsStateComposeAnimation.Companion.parse$ui_tooling_release(this.$animation);
        if (parse$ui_tooling_release != null) {
            PreviewAnimationClock previewAnimationClock = this.this$0;
            previewAnimationClock.getAnimateXAsStateClocks$ui_tooling_release().put(parse$ui_tooling_release, new AnimateXAsStateClock<>(parse$ui_tooling_release));
            previewAnimationClock.notifySubscribe(parse$ui_tooling_release);
        }
    }
}
