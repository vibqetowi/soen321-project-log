package com.ifriend.presentation.features.update.delegate;

import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.ifriend.domain.logic.updates.UpdatePromptInteractor;
import com.ifriend.domain.models.update.UpdatePromptType;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.update.analytics.InAppUpdateAnalytics;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl;
import com.ifriend.presentation.features.update.model.InAppUpdateEvent;
import com.ifriend.presentation.features.update.model.InAppUpdateState;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppUpdateDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl$showUpdatePrompt$1$1", f = "InAppUpdateDelegate.kt", i = {}, l = {168, 187, 199}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InAppUpdateDelegateImpl$showUpdatePrompt$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InAppUpdateDelegateImpl.State $state;
    Object L$0;
    Object L$1;
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
            try {
                iArr[UpdatePromptType.Immediate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateDelegateImpl$showUpdatePrompt$1$1(InAppUpdateDelegateImpl.State state, InAppUpdateDelegateImpl inAppUpdateDelegateImpl, Continuation<? super InAppUpdateDelegateImpl$showUpdatePrompt$1$1> continuation) {
        super(2, continuation);
        this.$state = state;
        this.this$0 = inAppUpdateDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InAppUpdateDelegateImpl$showUpdatePrompt$1$1(this.$state, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InAppUpdateDelegateImpl$showUpdatePrompt$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InAppUpdateAnalytics inAppUpdateAnalytics;
        String str;
        UpdatePromptInteractor updatePromptInteractor;
        InAppUpdateAnalytics inAppUpdateAnalytics2;
        String str2;
        boolean isUpdateTypeAllowed;
        AppUpdateManager appUpdateManager;
        AppUpdateManager appUpdateManager2;
        InstallStateUpdatedListener installStateUpdatedListener;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.$state.getType().ordinal()];
            if (i3 == 1) {
                inAppUpdateAnalytics = this.this$0.inAppUpdateAnalytics;
                str = this.this$0.userId;
                updatePromptInteractor = this.this$0.updatePromptInteractor;
                this.L$0 = inAppUpdateAnalytics;
                this.L$1 = str;
                this.label = 1;
                obj = updatePromptInteractor.getDismissCount(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 == 2) {
                    inAppUpdateAnalytics2 = this.this$0.inAppUpdateAnalytics;
                    str2 = this.this$0.userId;
                    inAppUpdateAnalytics2.trackHardUpdateClick(str2, this.$state.getInfo().availableVersionCode());
                }
                isUpdateTypeAllowed = this.$state.getInfo().isUpdateTypeAllowed(0);
                boolean isUpdateTypeAllowed2 = this.$state.getInfo().isUpdateTypeAllowed(1);
                if (this.$state.getType() == UpdatePromptType.Immediate || !isUpdateTypeAllowed2) {
                    if (isUpdateTypeAllowed) {
                        UiStateDelegate<InAppUpdateState, InAppUpdateEvent> uiStateDelegate = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 2;
                        if (uiStateDelegate.sendEvent2(uiStateDelegate, (InAppUpdateEvent) InAppUpdateEvent.OpenAppInMarket.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    i2 = 0;
                }
                AppUpdateInfo info = this.$state.getInfo();
                appUpdateManager = this.this$0.appUpdateManager;
                AppUpdateOptions defaultOptions = AppUpdateOptions.defaultOptions(i2);
                Intrinsics.checkNotNull(defaultOptions);
                InAppUpdateEvent.StartUpdateEvent startUpdateEvent = new InAppUpdateEvent.StartUpdateEvent(info, defaultOptions, appUpdateManager);
                if (i2 == 0) {
                    appUpdateManager2 = this.this$0.appUpdateManager;
                    installStateUpdatedListener = this.this$0.updateListener;
                    appUpdateManager2.registerListener(installStateUpdatedListener);
                }
                UiStateDelegate<InAppUpdateState, InAppUpdateEvent> uiStateDelegate2 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (uiStateDelegate2.sendEvent2(uiStateDelegate2, (InAppUpdateEvent) startUpdateEvent, (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } else if (i == 3) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            str = (String) this.L$1;
            inAppUpdateAnalytics = (InAppUpdateAnalytics) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        inAppUpdateAnalytics.trackUpdatePopupShow(str, ((Number) obj).intValue() + 1, this.$state.getInfo().availableVersionCode());
        isUpdateTypeAllowed = this.$state.getInfo().isUpdateTypeAllowed(0);
        boolean isUpdateTypeAllowed22 = this.$state.getInfo().isUpdateTypeAllowed(1);
        if (this.$state.getType() == UpdatePromptType.Immediate) {
        }
        if (isUpdateTypeAllowed) {
        }
    }
}
