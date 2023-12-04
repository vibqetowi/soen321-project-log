package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a*\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\u0015\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007X\u008a\u0084\u0002"}, d2 = {"Dialog", "", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/DialogProperties;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DialogLayout", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui_release", "currentContent"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Dialog(Function0<Unit> onDismissRequest, DialogProperties dialogProperties, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        DialogProperties dialogProperties2;
        LayoutDirection layoutDirection;
        boolean changed;
        LayoutDirection layoutDirection2;
        DialogProperties dialogProperties3;
        DialogWrapper dialogWrapper;
        Composer composer2;
        DialogProperties dialogProperties4;
        Composer composer3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2032877254);
        ComposerKt.sourceInformation(startRestartGroup, "C(Dialog)P(1,2)155@6564L7,156@6603L7,157@6658L7,158@6688L28,159@6743L29,160@6792L38,161@6848L616,182@7470L154,191@7630L193:AndroidDialog.android.kt#2oxthz");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = dialogProperties;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                dialogProperties2 = i4 == 0 ? new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null) : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2032877254, i3, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:150)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                View view = (View) consume;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density = (Density) consume2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                layoutDirection = (LayoutDirection) consume3;
                CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i3 >> 6) & 14);
                UUID dialogId = (UUID) RememberSaveableKt.m2907rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) AndroidDialog_androidKt$Dialog$dialogId$1.INSTANCE, startRestartGroup, 3080, 6);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(view) | startRestartGroup.changed(density);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    layoutDirection2 = layoutDirection;
                    dialogProperties3 = dialogProperties2;
                    Composer composer4 = startRestartGroup;
                    DialogWrapper dialogWrapper2 = new DialogWrapper(onDismissRequest, dialogProperties2, view, layoutDirection2, density, dialogId);
                    dialogWrapper2.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(488261145, true, new AndroidDialog_androidKt$Dialog$dialog$1$1$1(rememberUpdatedState)));
                    composer4.updateRememberedValue(dialogWrapper2);
                    composer2 = composer4;
                    dialogWrapper = dialogWrapper2;
                } else {
                    layoutDirection2 = layoutDirection;
                    dialogProperties3 = dialogProperties2;
                    composer2 = startRestartGroup;
                    dialogWrapper = rememberedValue;
                }
                composer2.endReplaceableGroup();
                DialogWrapper dialogWrapper3 = (DialogWrapper) dialogWrapper;
                EffectsKt.DisposableEffect(dialogWrapper3, new AndroidDialog_androidKt$Dialog$1(dialogWrapper3), composer2, 8);
                EffectsKt.SideEffect(new AndroidDialog_androidKt$Dialog$2(dialogWrapper3, onDismissRequest, dialogProperties3, layoutDirection2), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                dialogProperties4 = dialogProperties3;
                composer3 = composer2;
            } else {
                startRestartGroup.skipToGroupEnd();
                dialogProperties4 = obj;
                composer3 = startRestartGroup;
            }
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new AndroidDialog_androidKt$Dialog$3(onDismissRequest, dialogProperties4, content, i, i2));
            return;
        }
        obj = dialogProperties;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 731) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume4 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        View view2 = (View) consume4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2 = (Density) consume22;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        layoutDirection = (LayoutDirection) consume32;
        CompositionContext rememberCompositionContext2 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i3 >> 6) & 14);
        UUID dialogId2 = (UUID) RememberSaveableKt.m2907rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) AndroidDialog_androidKt$Dialog$dialogId$1.INSTANCE, startRestartGroup, 3080, 6);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(view2) | startRestartGroup.changed(density2);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        Intrinsics.checkNotNullExpressionValue(dialogId2, "dialogId");
        layoutDirection2 = layoutDirection;
        dialogProperties3 = dialogProperties2;
        Composer composer42 = startRestartGroup;
        DialogWrapper dialogWrapper22 = new DialogWrapper(onDismissRequest, dialogProperties2, view2, layoutDirection2, density2, dialogId2);
        dialogWrapper22.setContent(rememberCompositionContext2, ComposableLambdaKt.composableLambdaInstance(488261145, true, new AndroidDialog_androidKt$Dialog$dialog$1$1$1(rememberUpdatedState2)));
        composer42.updateRememberedValue(dialogWrapper22);
        composer2 = composer42;
        dialogWrapper = dialogWrapper22;
        composer2.endReplaceableGroup();
        DialogWrapper dialogWrapper32 = (DialogWrapper) dialogWrapper;
        EffectsKt.DisposableEffect(dialogWrapper32, new AndroidDialog_androidKt$Dialog$1(dialogWrapper32), composer2, 8);
        EffectsKt.SideEffect(new AndroidDialog_androidKt$Dialog$2(dialogWrapper32, onDismissRequest, dialogProperties3, layoutDirection2), composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        dialogProperties4 = dialogProperties3;
        composer3 = composer2;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DialogLayout(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1177876616);
        ComposerKt.sourceInformation(startRestartGroup, "C(DialogLayout)P(1)453@17860L455:AndroidDialog.android.kt#2oxthz");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177876616, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:449)");
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = AndroidDialog_androidKt$DialogLayout$1.INSTANCE;
            int i5 = ((i3 >> 3) & 14) | ((i3 << 3) & 112);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i6 = ((i5 << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, androidDialog_androidKt$DialogLayout$1, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i6 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i6 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new AndroidDialog_androidKt$DialogLayout$2(modifier, function2, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> Dialog$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
