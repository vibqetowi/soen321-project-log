package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LazyStaggeredGridBeyondBoundsModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"lazyStaggeredGridBeyondBoundsModifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridBeyondBoundsModifierKt {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Modifier lazyStaggeredGridBeyondBoundsModifier(Modifier modifier, LazyStaggeredGridState state, boolean z, Orientation orientation, Composer composer, int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        composer.startReplaceableGroup(-1763226771);
        ComposerKt.sourceInformation(composer, "C(lazyStaggeredGridBeyondBoundsModifier)P(2,1)37@1484L7,38@1520L73,41@1615L335:LazyStaggeredGridBeyondBoundsModifier.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763226771, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.lazyStaggeredGridBeyondBoundsModifier (LazyStaggeredGridBeyondBoundsModifier.kt:32)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer);
        LayoutDirection layoutDirection = (LayoutDirection) consume;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(state);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridBeyondBoundsState(state);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Object obj2 = (LazyStaggeredGridBeyondBoundsState) rememberedValue;
        Object[] objArr = {obj2, state, Boolean.valueOf(z), layoutDirection, orientation};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z2 = false;
        for (int i2 = 0; i2 < 5; i2++) {
            z2 |= composer.changed(objArr[i2]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (!z2) {
            obj = rememberedValue2;
        }
        LazyLayoutBeyondBoundsModifierLocal lazyLayoutBeyondBoundsModifierLocal = new LazyLayoutBeyondBoundsModifierLocal((LazyLayoutBeyondBoundsState) obj2, state.getBeyondBoundsInfo$foundation_release(), z, layoutDirection, orientation);
        composer.updateRememberedValue(lazyLayoutBeyondBoundsModifierLocal);
        obj = lazyLayoutBeyondBoundsModifierLocal;
        composer.endReplaceableGroup();
        Modifier then = modifier.then((Modifier) obj);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
