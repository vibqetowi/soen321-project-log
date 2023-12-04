package androidx.compose.material3.windowsizeclass;

import android.app.Activity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.window.layout.WindowMetricsCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidWindowSizeClass.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"calculateWindowSizeClass", "Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "material3-window-size-class_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidWindowSizeClass_androidKt {
    public static final WindowSizeClass calculateWindowSizeClass(Activity activity, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        composer.startReplaceableGroup(866044206);
        ComposerKt.sourceInformation(composer, "C(calculateWindowSizeClass)41@1807L7,42@1846L7:AndroidWindowSizeClass.android.kt#hkqeis");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(866044206, i, -1, "androidx.compose.material3.windowsizeclass.calculateWindowSizeClass (AndroidWindowSizeClass.android.kt:36)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        WindowSizeClass m2845calculateFromSizeEaSLcWc = WindowSizeClass.Companion.m2845calculateFromSizeEaSLcWc(((Density) consume).mo586toDpSizekrfVVM(RectHelper_androidKt.toComposeRect(WindowMetricsCalculator.Companion.getOrCreate().computeCurrentWindowMetrics(activity).getBounds()).m3051getSizeNHjbRc()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2845calculateFromSizeEaSLcWc;
    }
}
