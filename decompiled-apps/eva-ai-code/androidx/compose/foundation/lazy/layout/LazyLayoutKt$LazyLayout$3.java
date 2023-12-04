package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyLayout.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "invoke", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutKt$LazyLayout$3 extends Lambda implements Function3<SaveableStateHolder, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ State<Function0<LazyLayoutItemProvider>> $currentItemProvider;
    final /* synthetic */ Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> $measurePolicy;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ LazyLayoutPrefetchState $prefetchState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutKt$LazyLayout$3(LazyLayoutPrefetchState lazyLayoutPrefetchState, Modifier modifier, Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2, int i, State<? extends Function0<? extends LazyLayoutItemProvider>> state) {
        super(3);
        this.$prefetchState = lazyLayoutPrefetchState;
        this.$modifier = modifier;
        this.$measurePolicy = function2;
        this.$$dirty = i;
        this.$currentItemProvider = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SaveableStateHolder saveableStateHolder, Composer composer, Integer num) {
        invoke(saveableStateHolder, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.runtime.Composer] */
    public final void invoke(SaveableStateHolder saveableStateHolder, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
        ComposerKt.sourceInformation(composer, "C61@2415L114,64@2566L101,78@2956L392,75@2869L489:LazyLayout.kt#wow0x6");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1488997347, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:60)");
        }
        State<Function0<LazyLayoutItemProvider>> state = this.$currentItemProvider;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1(state));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) rememberedValue2;
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.$prefetchState;
        composer.startReplaceableGroup(-1523808190);
        ComposerKt.sourceInformation(composer, "*68@2709L140");
        if (lazyLayoutPrefetchState != null) {
            LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(this.$prefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, composer, ((this.$$dirty >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
            Unit unit = Unit.INSTANCE;
        }
        composer.endReplaceableGroup();
        Modifier modifier = this.$modifier;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = this.$measurePolicy;
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(lazyLayoutItemContentFactory) | composer.changed(function2);
        LazyLayoutKt$LazyLayout$3$2$1 rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new LazyLayoutKt$LazyLayout$3$2$1(lazyLayoutItemContentFactory, function2);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier, (Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>) rememberedValue3, (Composer) composer, SubcomposeLayoutState.$stable | (this.$$dirty & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
