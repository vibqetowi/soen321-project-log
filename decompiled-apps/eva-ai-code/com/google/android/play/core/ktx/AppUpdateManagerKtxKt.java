package com.google.android.play.core.ktx;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010 \u001a\u0002H!\"\u0004\b\u0000\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0#2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u0002*\u00020)H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*\u001a\u0015\u0010+\u001a\u00020&*\u00020)H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*\u001a\u0010\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-*\u00020)\u001a*\u0010/\u001a\u00020\f*\u00020)2\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\b\u001a%\u00106\u001a\u00020\f\"\u0004\b\u0000\u00107*\b\u0012\u0004\u0012\u0002H7082\u0006\u00109\u001a\u0002H7H\u0000¢\u0006\u0002\u0010:\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0016\u0010\u000b\u001a\u00020\f*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0016\u0010\u000f\u001a\u00020\b*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\b*\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0016\u0010\u0012\u001a\u00020\b*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\"\u0016\u0010\u0015\u001a\u00020\f*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0016\u0010\u0017\u001a\u00020\f*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016\"\u0016\u0010\u0018\u001a\u00020\u0019*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0016\u0010\u001c\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0004\"\u0016\u0010\u001c\u001a\u00020\u0001*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0006\"\u0016\u0010\u001e\u001a\u00020\b*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"bytesDownloaded", "", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "getBytesDownloaded", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)J", "Lcom/google/android/play/core/install/InstallState;", "(Lcom/google/android/play/core/install/InstallState;)J", "clientVersionStalenessDays", "", "getClientVersionStalenessDays", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)Ljava/lang/Integer;", "hasTerminalStatus", "", "getHasTerminalStatus", "(Lcom/google/android/play/core/install/InstallState;)Z", "installErrorCode", "getInstallErrorCode", "(Lcom/google/android/play/core/install/InstallState;)I", "installStatus", "getInstallStatus", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)I", "isFlexibleUpdateAllowed", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)Z", "isImmediateUpdateAllowed", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName", "(Lcom/google/android/play/core/install/InstallState;)Ljava/lang/String;", "totalBytesToDownload", "getTotalBytesToDownload", "updatePriority", "getUpdatePriority", "runTask", ExifInterface.GPS_DIRECTION_TRUE, "task", "Lcom/google/android/gms/tasks/Task;", "onCanceled", "Lkotlin/Function0;", "", "(Lcom/google/android/gms/tasks/Task;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestAppUpdateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCompleteUpdate", "requestUpdateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "startUpdateFlowForResult", "appUpdateInfo", "fragment", "Landroidx/fragment/app/Fragment;", "options", "Lcom/google/android/play/core/appupdate/AppUpdateOptions;", "requestCode", "tryOffer", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppUpdateManagerKtxKt {
    public static final int getInstallErrorCode(InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.installErrorCode();
    }

    public static final int getInstallStatus(AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.installStatus();
    }

    public static final int getInstallStatus(InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.installStatus();
    }

    public static final int getUpdatePriority(AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.updatePriority();
    }

    public static final long getBytesDownloaded(AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.bytesDownloaded();
    }

    public static final long getBytesDownloaded(InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.bytesDownloaded();
    }

    public static final long getTotalBytesToDownload(AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.totalBytesToDownload();
    }

    public static final long getTotalBytesToDownload(InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.totalBytesToDownload();
    }

    public static final Integer getClientVersionStalenessDays(AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.clientVersionStalenessDays();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object requestAppUpdateInfo(AppUpdateManager appUpdateManager, Continuation<? super AppUpdateInfo> continuation) {
        AppUpdateManagerKtxKt$requestAppUpdateInfo$1 appUpdateManagerKtxKt$requestAppUpdateInfo$1;
        int i;
        if (continuation instanceof AppUpdateManagerKtxKt$requestAppUpdateInfo$1) {
            appUpdateManagerKtxKt$requestAppUpdateInfo$1 = (AppUpdateManagerKtxKt$requestAppUpdateInfo$1) continuation;
            if ((appUpdateManagerKtxKt$requestAppUpdateInfo$1.label & Integer.MIN_VALUE) != 0) {
                appUpdateManagerKtxKt$requestAppUpdateInfo$1.label -= Integer.MIN_VALUE;
                Object obj = appUpdateManagerKtxKt$requestAppUpdateInfo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appUpdateManagerKtxKt$requestAppUpdateInfo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Task<AppUpdateInfo> appUpdateInfo = appUpdateManager.getAppUpdateInfo();
                    Intrinsics.checkNotNullExpressionValue(appUpdateInfo, "appUpdateInfo");
                    appUpdateManagerKtxKt$requestAppUpdateInfo$1.label = 1;
                    obj = runTask$default(appUpdateInfo, null, appUpdateManagerKtxKt$requestAppUpdateInfo$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Intrinsics.checkNotNullExpressionValue(obj, "runTask(appUpdateInfo)");
                return obj;
            }
        }
        appUpdateManagerKtxKt$requestAppUpdateInfo$1 = new AppUpdateManagerKtxKt$requestAppUpdateInfo$1(continuation);
        Object obj2 = appUpdateManagerKtxKt$requestAppUpdateInfo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appUpdateManagerKtxKt$requestAppUpdateInfo$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "runTask(appUpdateInfo)");
        return obj2;
    }

    public static final Object requestCompleteUpdate(AppUpdateManager appUpdateManager, Continuation<? super Unit> continuation) {
        Task<Void> completeUpdate = appUpdateManager.completeUpdate();
        Intrinsics.checkNotNullExpressionValue(completeUpdate, "completeUpdate()");
        Object runTask$default = runTask$default(completeUpdate, null, continuation, 2, null);
        return runTask$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? runTask$default : Unit.INSTANCE;
    }

    public static final <T> Object runTask(Task<T> task, Function0<Unit> function0, Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new AppUpdateManagerKtxKt$runTask$3$1(function0));
        if (task.isComplete()) {
            if (task.isSuccessful()) {
                cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(task.getResult()));
            } else {
                Exception exception = task.getException();
                Intrinsics.checkNotNull(exception);
                cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(ResultKt.createFailure(exception)));
            }
        } else {
            task.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$3$2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(T t) {
                    cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(t));
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(ResultKt.createFailure(exception2)));
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ Object runTask$default(Task task, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = AppUpdateManagerKtxKt$runTask$2.INSTANCE;
        }
        return runTask(task, function0, continuation);
    }

    public static final String getPackageName(InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        String packageName = installState.packageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName()");
        return packageName;
    }

    public static final Flow<AppUpdateResult> requestUpdateFlow(AppUpdateManager appUpdateManager) throws InstallException {
        Intrinsics.checkNotNullParameter(appUpdateManager, "<this>");
        return FlowKt.conflate(FlowKt.callbackFlow(new AppUpdateManagerKtxKt$requestUpdateFlow$1(appUpdateManager, null)));
    }

    public static final boolean getHasTerminalStatus(InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        int installStatus = installState.installStatus();
        return installStatus == 0 || installStatus == 11 || installStatus == 5 || installStatus == 6;
    }

    public static final boolean isFlexibleUpdateAllowed(AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.isUpdateTypeAllowed(0);
    }

    public static final boolean isImmediateUpdateAllowed(AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "<this>");
        return appUpdateInfo.isUpdateTypeAllowed(1);
    }

    public static final boolean startUpdateFlowForResult(AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo, final Fragment fragment, AppUpdateOptions options, int i) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(appUpdateManager, "<this>");
        Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(options, "options");
        return appUpdateManager.startUpdateFlowForResult(appUpdateInfo, new IntentSenderForResultStarter() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$startUpdateFlowForResult$1
            @Override // com.google.android.play.core.common.IntentSenderForResultStarter
            public final void startIntentSenderForResult(IntentSender p0, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Fragment.this.startIntentSenderForResult(p0, i2, intent, i3, i4, i5, bundle);
            }
        }, options, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(SendChannel<? super E> sendChannel, E e) {
        Intrinsics.checkNotNullParameter(sendChannel, "<this>");
        return ChannelResult.m8837isSuccessimpl(sendChannel.mo8817trySendJP2dKIU(e));
    }
}
