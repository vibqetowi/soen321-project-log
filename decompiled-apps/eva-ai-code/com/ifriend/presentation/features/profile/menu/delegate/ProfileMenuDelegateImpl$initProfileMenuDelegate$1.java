package com.ifriend.presentation.features.profile.menu.delegate;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.balance.UserBalance;
import com.ifriend.domain.toggle.FeatureToggle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProfileMenuDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegateImpl$initProfileMenuDelegate$1", f = "ProfileMenuDelegate.kt", i = {}, l = {58, LockFreeTaskQueueCore.FROZEN_SHIFT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ProfileMenuDelegateImpl$initProfileMenuDelegate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ProfileMenuDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMenuDelegateImpl$initProfileMenuDelegate$1(ProfileMenuDelegateImpl profileMenuDelegateImpl, Continuation<? super ProfileMenuDelegateImpl$initProfileMenuDelegate$1> continuation) {
        super(2, continuation);
        this.this$0 = profileMenuDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileMenuDelegateImpl$initProfileMenuDelegate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileMenuDelegateImpl$initProfileMenuDelegate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        FeatureToggle featureToggle;
        UserBalanceRepository userBalanceRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.logException(e);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            featureToggle = this.this$0.neuronsToggle;
            this.label = 1;
            obj = featureToggle.isEnabled(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        userBalanceRepository = this.this$0.userBalanceRepository;
        this.label = 2;
        if (FlowKt.collect(FlowKt.flowCombine((Flow) obj, userBalanceRepository.getBalanceFlow(), new AnonymousClass1(this.this$0)), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileMenuDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegateImpl$initProfileMenuDelegate$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function3<Boolean, UserBalance, Continuation<? super Unit>, Object>, SuspendFunction {
        AnonymousClass1(Object obj) {
            super(3, obj, ProfileMenuDelegateImpl.class, "updateState", "updateState(ZLcom/ifriend/domain/logic/balance/UserBalance;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, UserBalance userBalance, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), userBalance, continuation);
        }

        public final Object invoke(boolean z, UserBalance userBalance, Continuation<? super Unit> continuation) {
            return ProfileMenuDelegateImpl$initProfileMenuDelegate$1.invokeSuspend$updateState((ProfileMenuDelegateImpl) this.receiver, z, userBalance, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$updateState(ProfileMenuDelegateImpl profileMenuDelegateImpl, boolean z, UserBalance userBalance, Continuation continuation) {
        profileMenuDelegateImpl.updateState(z, userBalance);
        return Unit.INSTANCE;
    }
}
