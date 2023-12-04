package com.ifriend.chat.presentation.ui;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.ifriend.presentation.features.update.model.InAppUpdateEvent;
import com.ifriend.ui.utils.UIUtilsKt;
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
/* compiled from: flow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "com/ifriend/common_utils/extensions/FlowKt$collectIn$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.AppActivity$onCreate$lambda$1$$inlined$collectIn$default$1", f = "AppActivity.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppActivity$onCreate$lambda$1$$inlined$collectIn$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_collectIn;
    int label;
    final /* synthetic */ AppActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$onCreate$lambda$1$$inlined$collectIn$default$1(Flow flow, Continuation continuation, AppActivity appActivity) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.this$0 = appActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppActivity$onCreate$lambda$1$$inlined$collectIn$default$1(this.$this_collectIn, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppActivity$onCreate$lambda$1$$inlined$collectIn$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = this.$this_collectIn;
            final AppActivity appActivity = this.this$0;
            this.label = 1;
            if (flow.collect(new FlowCollector() { // from class: com.ifriend.chat.presentation.ui.AppActivity$onCreate$lambda$1$$inlined$collectIn$default$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    ActivityResultLauncher<IntentSenderRequest> activityResultLauncher;
                    InAppUpdateEvent inAppUpdateEvent = (InAppUpdateEvent) t;
                    if (inAppUpdateEvent instanceof InAppUpdateEvent.OpenAppInMarket) {
                        UIUtilsKt.openAppOnMarket(AppActivity.this);
                    } else if (inAppUpdateEvent instanceof InAppUpdateEvent.StartUpdateEvent) {
                        InAppUpdateEvent.StartUpdateEvent startUpdateEvent = (InAppUpdateEvent.StartUpdateEvent) inAppUpdateEvent;
                        AppUpdateManager manager = startUpdateEvent.getManager();
                        AppUpdateInfo info = startUpdateEvent.getInfo();
                        activityResultLauncher = AppActivity.this.updateLauncher;
                        if (!manager.startUpdateFlowForResult(info, activityResultLauncher, startUpdateEvent.getAppUpdateOptions())) {
                            UIUtilsKt.openAppOnMarket(AppActivity.this);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
