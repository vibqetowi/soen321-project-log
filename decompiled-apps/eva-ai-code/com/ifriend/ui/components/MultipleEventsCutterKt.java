package com.ifriend.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: multipleEventsCutter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a,\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a$\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"multipleEventsCutter", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Lcom/ifriend/ui/components/MultipleEventsCutterManager;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "throttleFirst", "Lkotlinx/coroutines/flow/Flow;", "windowDuration", "", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultipleEventsCutterKt {
    public static final <T> T multipleEventsCutter(Function3<? super MultipleEventsCutterManager, ? super Composer, ? super Integer, ? extends T> content, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1821542255);
        ComposerKt.sourceInformation(composer, "C(multipleEventsCutter)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1821542255, i, -1, "com.ifriend.ui.components.multipleEventsCutter (multipleEventsCutter.kt:18)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SharedFlowKt.MutableSharedFlow(0, 1, BufferOverflow.DROP_OLDEST);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue;
        T invoke = content.invoke(new MultipleEventsCutterManager() { // from class: com.ifriend.ui.components.MultipleEventsCutterKt$multipleEventsCutter$result$1
            @Override // com.ifriend.ui.components.MultipleEventsCutterManager
            public void processEvent(Function0<Unit> event) {
                Intrinsics.checkNotNullParameter(event, "event");
                mutableSharedFlow.tryEmit(event);
            }
        }, composer, Integer.valueOf((i << 3) & 112));
        EffectsKt.LaunchedEffect((Object) true, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new MultipleEventsCutterKt$multipleEventsCutter$1(mutableSharedFlow, null), composer, 70);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return invoke;
    }

    public static final <T> Flow<T> throttleFirst(Flow<? extends T> flow, long j) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return FlowKt.flow(new MultipleEventsCutterKt$throttleFirst$1(flow, j, null));
    }
}
