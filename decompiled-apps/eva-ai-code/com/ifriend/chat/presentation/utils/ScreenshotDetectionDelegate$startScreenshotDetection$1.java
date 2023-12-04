package com.ifriend.chat.presentation.utils;

import android.app.Activity;
import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenshotDetectionDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.utils.ScreenshotDetectionDelegate$startScreenshotDetection$1", f = "ScreenshotDetectionDelegate.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ScreenshotDetectionDelegate$startScreenshotDetection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ScreenshotDetectionDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotDetectionDelegate$startScreenshotDetection$1(ScreenshotDetectionDelegate screenshotDetectionDelegate, Continuation<? super ScreenshotDetectionDelegate$startScreenshotDetection$1> continuation) {
        super(2, continuation);
        this.this$0 = screenshotDetectionDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScreenshotDetectionDelegate$startScreenshotDetection$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScreenshotDetectionDelegate$startScreenshotDetection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow debounce = FlowKt.debounce(this.this$0.createContentObserverFlow(), 500L);
            final ScreenshotDetectionDelegate screenshotDetectionDelegate = this.this$0;
            this.label = 1;
            if (debounce.collect(new FlowCollector<Uri>() { // from class: com.ifriend.chat.presentation.utils.ScreenshotDetectionDelegate$startScreenshotDetection$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Uri uri, Continuation continuation) {
                    return emit2(uri, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(Uri uri, Continuation<? super Unit> continuation) {
                    WeakReference weakReference;
                    weakReference = ScreenshotDetectionDelegate.this.activityReference;
                    Activity activity = (Activity) weakReference.get();
                    if (activity != null) {
                        ScreenshotDetectionDelegate.this.onContentChanged(activity, uri);
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
