package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InteractiveComponentSize.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InteractiveComponentSizeKt$minimumInteractiveComponentSize$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public static final InteractiveComponentSizeKt$minimumInteractiveComponentSize$2 INSTANCE = new InteractiveComponentSizeKt$minimumInteractiveComponentSize$2();

    InteractiveComponentSizeKt$minimumInteractiveComponentSize$2() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Modifier.Companion companion;
        long j;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1964721376);
        ComposerKt.sourceInformation(composer, "C55@2521L7:InteractiveComponentSize.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1964721376, i, -1, "androidx.compose.material.minimumInteractiveComponentSize.<anonymous> (InteractiveComponentSize.kt:54)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentEnforcement());
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (((Boolean) consume).booleanValue()) {
            j = InteractiveComponentSizeKt.minimumInteractiveComponentSize;
            companion = new MinimumInteractiveComponentSizeModifier(j, null);
        } else {
            companion = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return companion;
    }
}
