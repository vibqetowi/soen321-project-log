package com.ifriend.ui.components.effects;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a0\u0010\u0006\u001a\u00020\u00012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006%\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\bX\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"OnCreateDestroyEffect", "", "onCreate", "Lkotlin/Function0;", "onDestroy", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "OnLifecycleEventEffect", "onEvent", "Lkotlin/Function1;", "Landroidx/lifecycle/Lifecycle$Event;", "Lkotlin/ParameterName;", "name", NotificationCompat.CATEGORY_EVENT, "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "OnResumeEffect", NativeProtocol.WEB_DIALOG_ACTION, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "common_ui_release", "eventHandler", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LifecycleKt {
    public static final void OnLifecycleEventEffect(Function1<? super Lifecycle.Event, Unit> onEvent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        Composer startRestartGroup = composer.startRestartGroup(427292285);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnLifecycleEventEffect)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(onEvent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(427292285, i2, -1, "com.ifriend.ui.components.effects.OnLifecycleEventEffect (Lifecycle.kt:11)");
            }
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onEvent, startRestartGroup, i2 & 14);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(consume, startRestartGroup, 8);
            LifecycleOwner OnLifecycleEventEffect$lambda$1 = OnLifecycleEventEffect$lambda$1(rememberUpdatedState2);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(rememberUpdatedState2) | startRestartGroup.changed(rememberUpdatedState);
            LifecycleKt$OnLifecycleEventEffect$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LifecycleKt$OnLifecycleEventEffect$1$1(rememberUpdatedState2, rememberUpdatedState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(OnLifecycleEventEffect$lambda$1, (Function1) rememberedValue, startRestartGroup, 8);
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
        endRestartGroup.updateScope(new LifecycleKt$OnLifecycleEventEffect$2(onEvent, i));
    }

    public static final void OnResumeEffect(Function0<Unit> action, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(action, "action");
        Composer startRestartGroup = composer.startRestartGroup(1573094945);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnResumeEffect)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(action) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1573094945, i2, -1, "com.ifriend.ui.components.effects.OnResumeEffect (Lifecycle.kt:29)");
            }
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(action);
            LifecycleKt$OnResumeEffect$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LifecycleKt$OnResumeEffect$1$1(action);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OnLifecycleEventEffect((Function1) rememberedValue, startRestartGroup, 0);
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
        endRestartGroup.updateScope(new LifecycleKt$OnResumeEffect$2(action, i));
    }

    public static final void OnCreateDestroyEffect(Function0<Unit> onCreate, Function0<Unit> onDestroy, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onCreate, "onCreate");
        Intrinsics.checkNotNullParameter(onDestroy, "onDestroy");
        Composer startRestartGroup = composer.startRestartGroup(-2104858306);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnCreateDestroyEffect)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(onCreate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onDestroy) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2104858306, i2, -1, "com.ifriend.ui.components.effects.OnCreateDestroyEffect (Lifecycle.kt:41)");
            }
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(onCreate) | startRestartGroup.changed(onDestroy);
            LifecycleKt$OnCreateDestroyEffect$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LifecycleKt$OnCreateDestroyEffect$1$1(onCreate, onDestroy);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OnLifecycleEventEffect((Function1) rememberedValue, startRestartGroup, 0);
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
        endRestartGroup.updateScope(new LifecycleKt$OnCreateDestroyEffect$2(onCreate, onDestroy, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Lifecycle.Event, Unit> OnLifecycleEventEffect$lambda$0(State<? extends Function1<? super Lifecycle.Event, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleOwner OnLifecycleEventEffect$lambda$1(State<? extends LifecycleOwner> state) {
        return state.getValue();
    }
}
