package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.platform.InspectionModeKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Inspectable.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a(\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"InInspectionModeOnly", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Inspectable", "compositionDataRecord", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "(Landroidx/compose/ui/tooling/CompositionDataRecord;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InspectableKt {
    public static final void Inspectable(CompositionDataRecord compositionDataRecord, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(compositionDataRecord, "compositionDataRecord");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-913922352);
        ComposerKt.sourceInformation(startRestartGroup, "C(Inspectable)60@2034L146:Inspectable.kt#hevd2p");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(compositionDataRecord) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-913922352, i2, -1, "androidx.compose.ui.tooling.Inspectable (Inspectable.kt:53)");
            }
            startRestartGroup.collectParameterInformation();
            Set<CompositionData> store = ((CompositionDataRecordImpl) compositionDataRecord).getStore();
            store.add(startRestartGroup.getCompositionData());
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{InspectionModeKt.getLocalInspectionMode().provides(true), InspectionTablesKt.getLocalInspectionTables().provides(store)}, content, startRestartGroup, (i2 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new InspectableKt$Inspectable$1(compositionDataRecord, content, i));
    }

    @Deprecated(message = "This method should not be used in application code and will be removed soon.")
    public static final void InInspectionModeOnly(Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1456071021);
        ComposerKt.sourceInformation(startRestartGroup, "C(InInspectionModeOnly)75@2597L7,76@2616L9:Inspectable.kt#hevd2p");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1456071021, i2, -1, "androidx.compose.ui.tooling.InInspectionModeOnly (Inspectable.kt:74)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (((Boolean) consume).booleanValue()) {
                content.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new InspectableKt$InInspectionModeOnly$1(content, i));
    }
}
