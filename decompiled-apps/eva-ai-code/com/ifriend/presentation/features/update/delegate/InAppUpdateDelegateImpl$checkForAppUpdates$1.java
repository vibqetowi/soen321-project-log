package com.ifriend.presentation.features.update.delegate;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.ifriend.domain.logic.updates.UpdatePromptInteractor;
import com.ifriend.domain.models.update.UpdatePromptType;
import com.ifriend.presentation.features.update.analytics.InAppUpdateAnalytics;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.tasks.TasksKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppUpdateDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl$checkForAppUpdates$1", f = "InAppUpdateDelegate.kt", i = {0, 1, 2, 2, 3}, l = {267, 106, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "appUpdateInfo", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0", "L$2", "L$0"})
/* loaded from: classes6.dex */
public final class InAppUpdateDelegateImpl$checkForAppUpdates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ InAppUpdateDelegateImpl this$0;

    /* compiled from: InAppUpdateDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdatePromptType.values().length];
            try {
                iArr[UpdatePromptType.Flexible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateDelegateImpl$checkForAppUpdates$1(InAppUpdateDelegateImpl inAppUpdateDelegateImpl, Continuation<? super InAppUpdateDelegateImpl$checkForAppUpdates$1> continuation) {
        super(2, continuation);
        this.this$0 = inAppUpdateDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InAppUpdateDelegateImpl$checkForAppUpdates$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InAppUpdateDelegateImpl$checkForAppUpdates$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:1|(1:(3:(1:(1:(6:7|8|9|10|11|12)(2:18|19))(9:20|21|22|23|(2:25|(1:27)(2:28|(1:30)))|31|10|11|12))(5:34|35|36|37|(7:39|(1:41)(1:48)|42|(1:44)|45|46|47)(2:49|(3:51|52|53)(2:54|(1:56)(7:57|23|(0)|31|10|11|12))))|16|17)(1:60))(2:73|(1:75))|61|62|(3:64|65|66)(2:67|(1:69)(3:70|37|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0144, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0145, code lost:
        r0 = r11;
        r11 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:21:0x0046, B:38:0x00a3, B:40:0x00ab, B:42:0x00b7, B:44:0x00bd, B:46:0x00c1, B:47:0x00c7, B:50:0x00cd, B:52:0x00d3, B:55:0x00d9), top: B:76:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #1 {all -> 0x004a, blocks: (B:21:0x0046, B:38:0x00a3, B:40:0x00ab, B:42:0x00b7, B:44:0x00bd, B:46:0x00c1, B:47:0x00c7, B:50:0x00cd, B:52:0x00d3, B:55:0x00d9), top: B:76:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:16:0x0035, B:59:0x00f5, B:61:0x00f9, B:63:0x0112, B:64:0x0116), top: B:77:0x0035 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        InAppUpdateDelegateImpl inAppUpdateDelegateImpl;
        Mutex mutex2;
        Throwable th;
        MutableStateFlow mutableStateFlow;
        AppUpdateManager appUpdateManager;
        Mutex mutex3;
        AppUpdateInfo appUpdateInfo;
        UpdatePromptInteractor updatePromptInteractor;
        Mutex mutex4;
        AppUpdateInfo appUpdateInfo2;
        InAppUpdateDelegateImpl inAppUpdateDelegateImpl2;
        MutableStateFlow mutableStateFlow2;
        UpdatePromptType updatePromptType;
        MutableStateFlow mutableStateFlow3;
        InAppUpdateAnalytics inAppUpdateAnalytics;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.this$0.mutex;
            inAppUpdateDelegateImpl = this.this$0;
            this.L$0 = mutex;
            this.L$1 = inAppUpdateDelegateImpl;
            this.label = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                inAppUpdateDelegateImpl = (InAppUpdateDelegateImpl) this.L$1;
                mutex3 = (Mutex) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    appUpdateInfo = (AppUpdateInfo) obj;
                    if (appUpdateInfo.updateAvailability() != 3) {
                        mutableStateFlow2 = inAppUpdateDelegateImpl.state;
                        InAppUpdateDelegateImpl.State state = (InAppUpdateDelegateImpl.State) mutableStateFlow2.getValue();
                        if ((state != null ? state.getType() : null) != UpdatePromptType.Flexible) {
                            Intrinsics.checkNotNull(appUpdateInfo);
                            inAppUpdateDelegateImpl.continueImmediateUpdate(appUpdateInfo);
                        }
                        Unit unit = Unit.INSTANCE;
                        mutex3.unlock(null);
                        return unit;
                    } else if (appUpdateInfo.updateAvailability() != 2) {
                        Unit unit2 = Unit.INSTANCE;
                        mutex3.unlock(null);
                        return unit2;
                    } else {
                        updatePromptInteractor = inAppUpdateDelegateImpl.updatePromptInteractor;
                        int availableVersionCode = appUpdateInfo.availableVersionCode();
                        this.L$0 = mutex3;
                        this.L$1 = inAppUpdateDelegateImpl;
                        this.L$2 = appUpdateInfo;
                        this.label = 3;
                        Object promptType = updatePromptInteractor.getPromptType(availableVersionCode, this);
                        if (promptType == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex4 = mutex3;
                        InAppUpdateDelegateImpl inAppUpdateDelegateImpl3 = inAppUpdateDelegateImpl;
                        appUpdateInfo2 = appUpdateInfo;
                        obj = promptType;
                        inAppUpdateDelegateImpl2 = inAppUpdateDelegateImpl3;
                        updatePromptType = (UpdatePromptType) obj;
                        if (updatePromptType != null) {
                        }
                        mutex2 = mutex4;
                        Unit unit3 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mutex2 = mutex3;
                }
            } else if (i == 3) {
                appUpdateInfo2 = (AppUpdateInfo) this.L$2;
                inAppUpdateDelegateImpl2 = (InAppUpdateDelegateImpl) this.L$1;
                mutex4 = (Mutex) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    updatePromptType = (UpdatePromptType) obj;
                    if (updatePromptType != null) {
                        mutableStateFlow3 = inAppUpdateDelegateImpl2.state;
                        Intrinsics.checkNotNull(appUpdateInfo2);
                        mutableStateFlow3.setValue(new InAppUpdateDelegateImpl.State(appUpdateInfo2, updatePromptType));
                        if (WhenMappings.$EnumSwitchMapping$0[updatePromptType.ordinal()] == 1) {
                            inAppUpdateDelegateImpl2.showUpdatePrompt();
                        } else {
                            inAppUpdateAnalytics = inAppUpdateDelegateImpl2.inAppUpdateAnalytics;
                            str = inAppUpdateDelegateImpl2.userId;
                            inAppUpdateAnalytics.trackHardUpdatePopupShow(str, appUpdateInfo2.availableVersionCode());
                            this.L$0 = mutex4;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                            if (inAppUpdateDelegateImpl2.updateUiState(inAppUpdateDelegateImpl2, InAppUpdateDelegateImpl$checkForAppUpdates$1$1$1.INSTANCE, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    mutex2 = mutex4;
                    Unit unit32 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    mutex2 = mutex4;
                }
            } else if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mutex2 = (Mutex) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit322 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            mutex2.unlock(null);
            throw th;
        } else {
            inAppUpdateDelegateImpl = (InAppUpdateDelegateImpl) this.L$1;
            ResultKt.throwOnFailure(obj);
            mutex = (Mutex) this.L$0;
        }
        mutableStateFlow = inAppUpdateDelegateImpl.state;
        if (mutableStateFlow.getValue() != null) {
            Unit unit4 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit4;
        }
        appUpdateManager = inAppUpdateDelegateImpl.appUpdateManager;
        Task<AppUpdateInfo> appUpdateInfo3 = appUpdateManager.getAppUpdateInfo();
        Intrinsics.checkNotNullExpressionValue(appUpdateInfo3, "getAppUpdateInfo(...)");
        this.L$0 = mutex;
        this.L$1 = inAppUpdateDelegateImpl;
        this.label = 2;
        Object await = TasksKt.await(appUpdateInfo3, this);
        if (await == coroutine_suspended) {
            return coroutine_suspended;
        }
        mutex3 = mutex;
        obj = await;
        appUpdateInfo = (AppUpdateInfo) obj;
        if (appUpdateInfo.updateAvailability() != 3) {
        }
    }
}
