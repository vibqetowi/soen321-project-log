package com.ifriend.presentation.features.app.delegates;

import com.ifriend.common_utils.Format;
import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
/* compiled from: PurchaseInfoDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.PurchaseInfoDelegateImpl$handlePurchaseInfoEvent$1", f = "PurchaseInfoDelegate.kt", i = {0}, l = {29, 32, 34}, m = "invokeSuspend", n = {"linkKey"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class PurchaseInfoDelegateImpl$handlePurchaseInfoEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppViewModel $$context_receiver_0;
    final /* synthetic */ AppEvents.PurchaseInfo $event;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PurchaseInfoDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseInfoDelegateImpl$handlePurchaseInfoEvent$1(AppEvents.PurchaseInfo purchaseInfo, PurchaseInfoDelegateImpl purchaseInfoDelegateImpl, AppViewModel appViewModel, Continuation<? super PurchaseInfoDelegateImpl$handlePurchaseInfoEvent$1> continuation) {
        super(2, continuation);
        this.$event = purchaseInfo;
        this.this$0 = purchaseInfoDelegateImpl;
        this.$$context_receiver_0 = appViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PurchaseInfoDelegateImpl$handlePurchaseInfoEvent$1(this.$event, this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PurchaseInfoDelegateImpl$handlePurchaseInfoEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        AppConfigUseCase appConfigUseCase;
        AppConfigUseCase appConfigUseCase2;
        String str3;
        AppViewModel appViewModel;
        Format format;
        String str4;
        String buildLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AppEvents.PurchaseInfo purchaseInfo = this.$event;
            if (Intrinsics.areEqual(purchaseInfo, AppEvents.PurchaseInfo.ShowPrivacyPolicy.INSTANCE)) {
                str = ConfigKeys.PRIVACY_POLICY;
            } else if (!Intrinsics.areEqual(purchaseInfo, AppEvents.PurchaseInfo.ShowTermsOfConditions.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            } else {
                str = ConfigKeys.TERMS;
            }
            str2 = str;
            appConfigUseCase = this.this$0.appConfigUseCase;
            this.L$0 = str2;
            this.label = 1;
            obj = appConfigUseCase.getEndpointValue(ConfigKeys.WEB_HOST, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            format = (Format) this.L$2;
            str3 = (String) this.L$1;
            appViewModel = (AppViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
            str4 = (String) obj;
            if (str4 == null) {
                str4 = "";
            }
            buildLink = format.buildLink(str3, str4);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            if (appViewModel.sendEvent2((UiStateDelegate<AppViewModel.UiState, AppViewModel.Event>) appViewModel, (AppViewModel.Event) new AppViewModel.Event.OpenLink(buildLink), (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } else {
            str2 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String str5 = (String) obj;
        if (str5 != null) {
            PurchaseInfoDelegateImpl purchaseInfoDelegateImpl = this.this$0;
            AppViewModel appViewModel2 = this.$$context_receiver_0;
            Format format2 = Format.INSTANCE;
            appConfigUseCase2 = purchaseInfoDelegateImpl.appConfigUseCase;
            this.L$0 = appViewModel2;
            this.L$1 = str5;
            this.L$2 = format2;
            this.label = 2;
            Object linkValue = appConfigUseCase2.getLinkValue(str2, this);
            if (linkValue == coroutine_suspended) {
                return coroutine_suspended;
            }
            str3 = str5;
            obj = linkValue;
            appViewModel = appViewModel2;
            format = format2;
            str4 = (String) obj;
            if (str4 == null) {
            }
            buildLink = format.buildLink(str3, str4);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            if (appViewModel.sendEvent2((UiStateDelegate<AppViewModel.UiState, AppViewModel.Event>) appViewModel, (AppViewModel.Event) new AppViewModel.Event.OpenLink(buildLink), (Continuation<? super Unit>) this) == coroutine_suspended) {
            }
        }
        return Unit.INSTANCE;
    }
}
