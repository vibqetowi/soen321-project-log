package com.ifriend.ui.components.popup;

import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.ui.components.modifier.ClickableModifierKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppModalPopup.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a1\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e²\u0006\u0015\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0006X\u008a\u0084\u0002"}, d2 = {"AppModalPopup", "", "onDismissRequest", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ModalPopupScrim", "color", "Landroidx/compose/ui/graphics/Color;", "onClick", "ModalPopupScrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "common_ui_release", "currentContent"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppModalPopupKt {
    /* renamed from: ModalPopupScrim-3J-VO9M  reason: not valid java name */
    public static final void m7051ModalPopupScrim3JVO9M(long j, Function0<Unit> onClick, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(205735408);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalPopupScrim)P(0:c#ui.graphics.Color)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                j = Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(205735408, i, -1, "com.ifriend.ui.components.popup.ModalPopupScrim (AppModalPopup.kt:46)");
            }
            SpacerKt.Spacer(ClickableModifierKt.noIndicationClickable$default(BackgroundKt.m421backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), j, null, 2, null), false, onClick, 1, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        long j2 = j;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AppModalPopupKt$ModalPopupScrim$1(j2, onClick, i, i2));
    }

    public static final void AppModalPopup(Function0<Unit> onDismissRequest, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1042013182);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppModalPopup)P(1)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1042013182, i3, -1, "com.ifriend.ui.components.popup.AppModalPopup (AppModalPopup.kt:59)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            View view = (View) consume;
            UUID uuid = (UUID) RememberSaveableKt.m2907rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) AppModalPopupKt$AppModalPopup$id$1.INSTANCE, startRestartGroup, 3080, 6);
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i3 >> 3) & 14);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            ModalPopupWindow modalPopupWindow = rememberedValue;
            if (rememberedValue == Composer.Companion.getEmpty()) {
                Intrinsics.checkNotNull(uuid);
                ModalPopupWindow modalPopupWindow2 = new ModalPopupWindow(onDismissRequest, view, uuid);
                modalPopupWindow2.setCustomContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1775936802, true, new AppModalPopupKt$AppModalPopup$modalSheetWindow$1$1$1(rememberUpdatedState)));
                startRestartGroup.updateRememberedValue(modalPopupWindow2);
                modalPopupWindow = modalPopupWindow2;
            }
            startRestartGroup.endReplaceableGroup();
            ModalPopupWindow modalPopupWindow3 = (ModalPopupWindow) modalPopupWindow;
            EffectsKt.DisposableEffect(modalPopupWindow3, new AppModalPopupKt$AppModalPopup$1(modalPopupWindow3), startRestartGroup, 8);
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
        endRestartGroup.updateScope(new AppModalPopupKt$AppModalPopup$2(onDismissRequest, content, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> AppModalPopup$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
