package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.DialogNavigator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DialogHost.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0002\u0010\n\u001a%\u0010\u000b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u008a\u0084\u0002"}, d2 = {"DialogHost", "", "dialogNavigator", "Landroidx/navigation/compose/DialogNavigator;", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/runtime/Composer;I)V", "rememberVisibleList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/navigation/NavBackStackEntry;", "transitionsInProgress", "", "(Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "PopulateVisibleList", "", "(Ljava/util/List;Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)V", "navigation-compose_release", "dialogBackStack", ""}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialogHostKt {
    public static final void DialogHost(DialogNavigator dialogNavigator, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(294589392);
        ComposerKt.sourceInformation(startRestartGroup, "C(DialogHost)40@1621L29,41@1704L16,42@1748L36,43@1806L36,*47@1969L623:DialogHost.kt#opm8kd");
        if ((((i & 14) == 0 ? (startRestartGroup.changed(dialogNavigator) ? 4 : 2) | i : i) & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294589392, i, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:39)");
            }
            SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            State collectAsState = SnapshotStateKt.collectAsState(dialogNavigator.getBackStack$navigation_compose_release(), null, startRestartGroup, 8, 1);
            SnapshotStateList<NavBackStackEntry> rememberVisibleList = rememberVisibleList(DialogHost$lambda$0(collectAsState), startRestartGroup, 8);
            PopulateVisibleList(rememberVisibleList, DialogHost$lambda$0(collectAsState), startRestartGroup, 64);
            for (NavBackStackEntry navBackStackEntry : rememberVisibleList) {
                NavDestination destination = navBackStackEntry.getDestination();
                Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                DialogNavigator.Destination destination2 = (DialogNavigator.Destination) destination;
                AndroidDialog_androidKt.Dialog(new DialogHostKt$DialogHost$1$1(dialogNavigator, navBackStackEntry), destination2.getDialogProperties$navigation_compose_release(), ComposableLambdaKt.composableLambda(startRestartGroup, 1129586364, true, new DialogHostKt$DialogHost$1$2(navBackStackEntry, rememberSaveableStateHolder, dialogNavigator, destination2)), startRestartGroup, 384, 0);
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
        endRestartGroup.updateScope(new DialogHostKt$DialogHost$2(dialogNavigator, i));
    }

    public static final void PopulateVisibleList(List<NavBackStackEntry> list, Collection<NavBackStackEntry> collection, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1537894851);
        ComposerKt.sourceInformation(startRestartGroup, "C(PopulateVisibleList)70@2783L7,*72@2844L1023:DialogHost.kt#opm8kd");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1537894851, i, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:69)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        boolean booleanValue = ((Boolean) consume).booleanValue();
        for (NavBackStackEntry navBackStackEntry : collection) {
            EffectsKt.DisposableEffect(navBackStackEntry.getLifecycle(), new DialogHostKt$PopulateVisibleList$1$1(navBackStackEntry, booleanValue, list), startRestartGroup, 8);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DialogHostKt$PopulateVisibleList$2(list, collection, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
        if (r1 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SnapshotStateList<NavBackStackEntry> rememberVisibleList(Collection<NavBackStackEntry> collection, Composer composer, int i) {
        Object obj;
        composer.startReplaceableGroup(467378629);
        ComposerKt.sourceInformation(composer, "C(rememberVisibleList)104@4095L7,105@4114L423:DialogHost.kt#opm8kd");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(467378629, i, -1, "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:102)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(InspectionModeKt.getLocalInspectionMode());
        ComposerKt.sourceInformationMarkerEnd(composer);
        boolean booleanValue = ((Boolean) consume).booleanValue();
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(collection);
        Object rememberedValue = composer.rememberedValue();
        if (!changed) {
            obj = rememberedValue;
        }
        SnapshotStateList<NavBackStackEntry> mutableStateListOf = SnapshotStateKt.mutableStateListOf();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection) {
            if (booleanValue ? true : ((NavBackStackEntry) obj2).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList.add(obj2);
            }
        }
        mutableStateListOf.addAll(arrayList);
        composer.updateRememberedValue(mutableStateListOf);
        obj = mutableStateListOf;
        composer.endReplaceableGroup();
        SnapshotStateList<NavBackStackEntry> snapshotStateList = (SnapshotStateList) obj;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapshotStateList;
    }

    private static final List<NavBackStackEntry> DialogHost$lambda$0(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }
}
