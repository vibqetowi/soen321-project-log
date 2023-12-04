package com.ifriend.presentation.common.uistate;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: UiStateDelegateEx.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00030\rH\u0007¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0010\"\u0004\b\u0000\u0010\u0011*\f\u0012\u0004\u0012\u0002H\u0011\u0012\u0002\b\u00030\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"CollectEventEffect", "", "State", "Event", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", UserMetadata.KEYDATA_FILENAME, "", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;[Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlinx/coroutines/flow/FlowCollector;Landroidx/compose/runtime/Composer;II)V", "collectUiState", "Landroidx/compose/runtime/State;", "R", "minActiveState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Landroidx/lifecycle/Lifecycle$State;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiStateDelegateExKt {
    public static final <R> State<R> collectUiState(UiStateDelegate<R, ?> uiStateDelegate, Lifecycle.State state, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        composer.startReplaceableGroup(-2074722132);
        ComposerKt.sourceInformation(composer, "C(collectUiState)");
        if ((i2 & 1) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2074722132, i, -1, "com.ifriend.presentation.common.uistate.collectUiState (UiStateDelegateEx.kt:14)");
        }
        State<R> collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(uiStateDelegate.getUiStateFlow(), (LifecycleOwner) null, state2, (CoroutineContext) null, composer, ((i << 3) & 896) | 8, 5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return collectAsStateWithLifecycle;
    }

    public static final <State, Event> void CollectEventEffect(UiStateDelegate<State, Event> uiStateDelegate, Object[] keys, LifecycleOwner lifecycleOwner, Lifecycle.State state, FlowCollector<? super Event> collector, Composer composer, int i, int i2) {
        LifecycleOwner lifecycleOwner2;
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(collector, "collector");
        Composer startRestartGroup = composer.startRestartGroup(-1117035878);
        ComposerKt.sourceInformation(startRestartGroup, "C(CollectEventEffect)P(1,2,3)");
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            lifecycleOwner2 = (LifecycleOwner) consume;
        } else {
            lifecycleOwner2 = lifecycleOwner;
        }
        Lifecycle.State state2 = (i2 & 4) != 0 ? Lifecycle.State.RESUMED : state;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117035878, i, -1, "com.ifriend.presentation.common.uistate.CollectEventEffect (UiStateDelegateEx.kt:24)");
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(Unit.INSTANCE);
        spreadBuilder.addSpread(keys);
        EffectsKt.LaunchedEffect(spreadBuilder.toArray(new Object[spreadBuilder.size()]), (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new UiStateDelegateExKt$CollectEventEffect$1(uiStateDelegate, lifecycleOwner2, state2, collector, null), startRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new UiStateDelegateExKt$CollectEventEffect$2(uiStateDelegate, keys, lifecycleOwner2, state2, collector, i, i2));
    }
}
