package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollableKt$scrollable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ OverscrollEffect $overscrollEffect;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ ScrollableState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollable$2(Orientation orientation, ScrollableState scrollableState, boolean z, MutableInteractionSource mutableInteractionSource, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect, boolean z2) {
        super(3);
        this.$orientation = orientation;
        this.$state = scrollableState;
        this.$reverseDirection = z;
        this.$interactionSource = mutableInteractionSource;
        this.$flingBehavior = flingBehavior;
        this.$overscrollEffect = overscrollEffect;
        this.$enabled = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Modifier pointerScrollable;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-629830927);
        ComposerKt.sourceInformation(composer, "C162@7780L24,164@7862L170,171@8149L242:Scrollable.kt#8bwon0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-629830927, i, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:161)");
        }
        composer.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Object[] objArr = {coroutineScope, this.$orientation, this.$state, Boolean.valueOf(this.$reverseDirection)};
        Orientation orientation = this.$orientation;
        ScrollableState scrollableState = this.$state;
        boolean z = this.$reverseDirection;
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z2 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z2 |= composer.changed(objArr[i2]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ContentInViewModifier(coroutineScope, orientation, scrollableState, z);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        pointerScrollable = ScrollableKt.pointerScrollable(FocusableKt.focusGroup(Modifier.Companion).then(((ContentInViewModifier) rememberedValue2).getModifier()), this.$interactionSource, this.$orientation, this.$reverseDirection, this.$state, this.$flingBehavior, this.$overscrollEffect, this.$enabled, composer, 0);
        Modifier then = pointerScrollable.then(this.$enabled ? ModifierLocalScrollableContainerProvider.INSTANCE : Modifier.Companion);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
