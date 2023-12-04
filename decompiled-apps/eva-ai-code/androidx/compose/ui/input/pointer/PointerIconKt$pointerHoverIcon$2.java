package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PointerIcon.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PointerIconKt$pointerHoverIcon$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ PointerIcon $icon;
    final /* synthetic */ boolean $overrideDescendants;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerIconKt$pointerHoverIcon$2(PointerIcon pointerIcon, boolean z) {
        super(3);
        this.$icon = pointerIcon;
        this.$overrideDescendants = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Modifier.Companion companion;
        Modifier.Companion then;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(811087536);
        ComposerKt.sourceInformation(composer, "C90@3499L7,97@3759L103,100@3886L226,100@3875L237,108@4265L525:PointerIcon.kt#a556rk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(811087536, i, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:89)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalPointerIconService());
        ComposerKt.sourceInformationMarkerEnd(composer);
        PointerIconService pointerIconService = (PointerIconService) consume;
        if (pointerIconService == null) {
            then = Modifier.Companion;
        } else {
            PointerIconKt$pointerHoverIcon$2$onSetIcon$1 pointerIconKt$pointerHoverIcon$2$onSetIcon$1 = new PointerIconKt$pointerHoverIcon$2$onSetIcon$1(pointerIconService);
            PointerIcon pointerIcon = this.$icon;
            boolean z = this.$overrideDescendants;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new PointerIconModifierLocal(pointerIcon, z, pointerIconKt$pointerHoverIcon$2$onSetIcon$1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            PointerIconModifierLocal pointerIconModifierLocal = (PointerIconModifierLocal) rememberedValue;
            Object[] objArr = {pointerIconModifierLocal, this.$icon, Boolean.valueOf(this.$overrideDescendants), pointerIconKt$pointerHoverIcon$2$onSetIcon$1};
            PointerIcon pointerIcon2 = this.$icon;
            boolean z2 = this.$overrideDescendants;
            composer.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean z3 = false;
            for (int i2 = 0; i2 < 4; i2++) {
                z3 |= composer.changed(objArr[i2]);
            }
            Object rememberedValue2 = composer.rememberedValue();
            if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = (Function0) new PointerIconKt$pointerHoverIcon$2$1$1(pointerIconModifierLocal, pointerIcon2, z2, pointerIconKt$pointerHoverIcon$2$onSetIcon$1);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue2, composer, 0);
            if (pointerIconModifierLocal.shouldUpdatePointerIcon()) {
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed = composer.changed(pointerIconModifierLocal);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = (Function2) new PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1(pointerIconModifierLocal, null);
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                companion = SuspendingPointerInputFilterKt.pointerInput(composed, pointerIconModifierLocal, (Function2) rememberedValue3);
            } else {
                companion = Modifier.Companion;
            }
            then = pointerIconModifierLocal.then(companion);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
