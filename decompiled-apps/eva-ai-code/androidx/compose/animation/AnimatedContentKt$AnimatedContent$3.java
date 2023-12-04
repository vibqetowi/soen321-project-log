package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedContent.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ Function1<S, Object> $contentKey;
    final /* synthetic */ String $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ S $targetState;
    final /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentKt$AnimatedContent$3(S s, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, String str, Function1<? super S, ? extends Object> function12, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, int i, int i2) {
        super(2);
        this.$targetState = s;
        this.$modifier = modifier;
        this.$transitionSpec = function1;
        this.$contentAlignment = alignment;
        this.$label = str;
        this.$contentKey = function12;
        this.$content = function4;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AnimatedContentKt.AnimatedContent(this.$targetState, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$label, this.$contentKey, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
