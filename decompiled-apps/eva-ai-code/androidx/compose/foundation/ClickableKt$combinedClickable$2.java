package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableKt$combinedClickable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ Function0<Unit> $onDoubleClick;
    final /* synthetic */ Function0<Unit> $onLongClick;
    final /* synthetic */ String $onLongClickLabel;
    final /* synthetic */ Role $role;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$combinedClickable$2(boolean z, String str, Role role, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(3);
        this.$enabled = z;
        this.$onClickLabel = str;
        this.$role = role;
        this.$onLongClickLabel = str2;
        this.$onLongClick = function0;
        this.$onDoubleClick = function02;
        this.$onClick = function03;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1969174843);
        ComposerKt.sourceInformation(composer, "C209@8999L7,210@9036L39:Clickable.kt#71ulvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1969174843, i, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:200)");
        }
        Modifier.Companion companion = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(IndicationKt.getLocalIndication());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Indication indication = (Indication) consume;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier m455combinedClickableXVZzFYc = ClickableKt.m455combinedClickableXVZzFYc(companion, (MutableInteractionSource) rememberedValue, indication, this.$enabled, this.$onClickLabel, this.$role, this.$onLongClickLabel, this.$onLongClick, this.$onDoubleClick, this.$onClick);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m455combinedClickableXVZzFYc;
    }
}
