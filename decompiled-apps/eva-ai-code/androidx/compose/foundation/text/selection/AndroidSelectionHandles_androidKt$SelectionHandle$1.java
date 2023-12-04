package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$SelectionHandle$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $position;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, long j, int i, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(2);
        this.$content = function2;
        this.$modifier = modifier;
        this.$isStartHandle = z;
        this.$position = j;
        this.$$dirty = i;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:AndroidSelectionHandles.android.kt#eksfi3");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(732099485, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:69)");
            }
            if (this.$content == null) {
                composer.startReplaceableGroup(386443790);
                ComposerKt.sourceInformation(composer, "73@3009L405,71@2918L645");
                Modifier modifier = this.$modifier;
                Boolean valueOf = Boolean.valueOf(this.$isStartHandle);
                Offset m3007boximpl = Offset.m3007boximpl(this.$position);
                boolean z = this.$isStartHandle;
                long j = this.$position;
                composer.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed = composer.changed(valueOf) | composer.changed(m3007boximpl);
                AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1 rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(z, j);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null);
                boolean z2 = this.$isStartHandle;
                ResolvedTextDirection resolvedTextDirection = this.$direction;
                boolean z3 = this.$handlesCrossed;
                int i2 = this.$$dirty;
                AndroidSelectionHandles_androidKt.DefaultSelectionHandle(semantics$default, z2, resolvedTextDirection, z3, composer, (i2 & 112) | (i2 & 896) | (i2 & 7168));
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(386444465);
                ComposerKt.sourceInformation(composer, "88@3593L9");
                this.$content.invoke(composer, Integer.valueOf((this.$$dirty >> 15) & 14));
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
