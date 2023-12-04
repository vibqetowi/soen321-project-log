package com.ifriend.presentation.common.uistate;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
/* compiled from: ViewModelExt.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"RegisterObserverEffect", "", "Landroidx/lifecycle/LifecycleObserver;", "owner", "Landroidx/lifecycle/LifecycleOwner;", UserMetadata.KEYDATA_FILENAME, "", "", "(Landroidx/lifecycle/LifecycleObserver;Landroidx/lifecycle/LifecycleOwner;[Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewModelExtKt {
    public static final void RegisterObserverEffect(LifecycleObserver lifecycleObserver, LifecycleOwner lifecycleOwner, Object[] keys, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lifecycleObserver, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Composer startRestartGroup = composer.startRestartGroup(1908246841);
        ComposerKt.sourceInformation(startRestartGroup, "C(RegisterObserverEffect)P(1)");
        if ((i2 & 1) != 0) {
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            lifecycleOwner = (LifecycleOwner) consume;
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1908246841, i, -1, "com.ifriend.presentation.common.uistate.RegisterObserverEffect (ViewModelExt.kt:12)");
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(lifecycleOwner2);
        spreadBuilder.addSpread(keys);
        EffectsKt.DisposableEffect(spreadBuilder.toArray(new Object[spreadBuilder.size()]), (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new ViewModelExtKt$RegisterObserverEffect$1(lifecycleOwner2, lifecycleObserver), startRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ViewModelExtKt$RegisterObserverEffect$2(lifecycleObserver, lifecycleOwner2, keys, i, i2));
    }
}
