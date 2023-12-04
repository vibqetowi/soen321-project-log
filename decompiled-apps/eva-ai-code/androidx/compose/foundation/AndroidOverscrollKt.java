package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
/* compiled from: AndroidOverscroll.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"StretchOverscrollNonClippingLayer", "Landroidx/compose/ui/Modifier;", "rememberOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidOverscrollKt {
    private static final Modifier StretchOverscrollNonClippingLayer;

    public static final OverscrollEffect rememberOverscrollEffect(Composer composer, int i) {
        NoOpOverscrollEffect noOpOverscrollEffect;
        composer.startReplaceableGroup(-81138291);
        ComposerKt.sourceInformation(composer, "C(rememberOverscrollEffect)63@2804L7,64@2858L7,66@2907L80:AndroidOverscroll.kt#71ulvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-81138291, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.kt:62)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(OverscrollConfigurationKt.getLocalOverscrollConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer);
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) consume2;
        if (overscrollConfiguration != null) {
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(context) | composer.changed(overscrollConfiguration);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            noOpOverscrollEffect = (OverscrollEffect) rememberedValue;
        } else {
            noOpOverscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return noOpOverscrollEffect;
    }

    static {
        Modifier.Companion companion;
        if (Build.VERSION.SDK_INT >= 31) {
            companion = LayoutModifierKt.layout(LayoutModifierKt.layout(Modifier.Companion, AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.INSTANCE), AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.INSTANCE);
        } else {
            companion = Modifier.Companion;
        }
        StretchOverscrollNonClippingLayer = companion;
    }
}
