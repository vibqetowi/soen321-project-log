package com.ifriend.domain.logic.onboarding;

import com.facebook.internal.NativeProtocol;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.logic.common.RunCatchingUseCase;
import com.ifriend.domain.onboarding.interactor.OnboardingInteractor;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UpdateOnboardingUseCase.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/onboarding/UpdateOnboardingUseCase;", "Lcom/ifriend/domain/logic/common/RunCatchingUseCase;", "", "userProfileRepository", "Lcom/ifriend/domain/data/user/UserProfileRepository;", "onboardingInteractor", "Lcom/ifriend/domain/onboarding/interactor/OnboardingInteractor;", "(Lcom/ifriend/domain/data/user/UserProfileRepository;Lcom/ifriend/domain/onboarding/interactor/OnboardingInteractor;)V", "execute", NativeProtocol.WEB_DIALOG_PARAMS, "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdateOnboardingUseCase implements RunCatchingUseCase<Unit, Unit> {
    private final OnboardingInteractor onboardingInteractor;
    private final UserProfileRepository userProfileRepository;

    @Inject
    public UpdateOnboardingUseCase(UserProfileRepository userProfileRepository, OnboardingInteractor onboardingInteractor) {
        Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        this.userProfileRepository = userProfileRepository;
        this.onboardingInteractor = onboardingInteractor;
    }

    @Override // com.ifriend.domain.logic.common.RunCatchingUseCase
    /* renamed from: invoke-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo6875invokegIAlus(Unit unit, Continuation<? super Result<? extends Unit>> continuation) {
        return m6881invokegIAlus(unit, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke-gIAlu-s  reason: avoid collision after fix types in other method and not valid java name */
    public Object m6881invokegIAlus(Unit unit, Continuation<? super Result<Unit>> continuation) {
        return RunCatchingUseCase.DefaultImpls.m6879invokegIAlus(this, unit, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[RETURN] */
    @Override // com.ifriend.domain.logic.common.RunCatchingUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(Unit unit, Continuation<? super Unit> continuation) {
        UpdateOnboardingUseCase$execute$1 updateOnboardingUseCase$execute$1;
        Object coroutine_suspended;
        int i;
        UpdateOnboardingUseCase updateOnboardingUseCase;
        Boolean m7271constructorimpl;
        boolean booleanValue;
        if (continuation instanceof UpdateOnboardingUseCase$execute$1) {
            updateOnboardingUseCase$execute$1 = (UpdateOnboardingUseCase$execute$1) continuation;
            if ((updateOnboardingUseCase$execute$1.label & Integer.MIN_VALUE) != 0) {
                updateOnboardingUseCase$execute$1.label -= Integer.MIN_VALUE;
                Object obj = updateOnboardingUseCase$execute$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updateOnboardingUseCase$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.Companion;
                        UpdateOnboardingUseCase updateOnboardingUseCase2 = this;
                        OnboardingInteractor onboardingInteractor = this.onboardingInteractor;
                        updateOnboardingUseCase$execute$1.L$0 = this;
                        updateOnboardingUseCase$execute$1.label = 1;
                        obj = onboardingInteractor.areAllOnboardingStepsPassed(updateOnboardingUseCase$execute$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        updateOnboardingUseCase = this;
                    } catch (Throwable th) {
                        th = th;
                        updateOnboardingUseCase = this;
                        Result.Companion companion2 = Result.Companion;
                        m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                        Boolean boxBoolean = Boxing.boxBoolean(false);
                        if (Result.m7277isFailureimpl(m7271constructorimpl)) {
                        }
                        booleanValue = ((Boolean) m7271constructorimpl).booleanValue();
                        updateOnboardingUseCase$execute$1.L$0 = null;
                        updateOnboardingUseCase$execute$1.label = 2;
                        if (updateOnboardingUseCase.userProfileRepository.setOnboardingDataSubmitted(!booleanValue, updateOnboardingUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    updateOnboardingUseCase = (UpdateOnboardingUseCase) updateOnboardingUseCase$execute$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion22 = Result.Companion;
                        m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                        Boolean boxBoolean2 = Boxing.boxBoolean(false);
                        if (Result.m7277isFailureimpl(m7271constructorimpl)) {
                        }
                        booleanValue = ((Boolean) m7271constructorimpl).booleanValue();
                        updateOnboardingUseCase$execute$1.L$0 = null;
                        updateOnboardingUseCase$execute$1.label = 2;
                        if (updateOnboardingUseCase.userProfileRepository.setOnboardingDataSubmitted(!booleanValue, updateOnboardingUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                m7271constructorimpl = Result.m7271constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
                Boolean boxBoolean22 = Boxing.boxBoolean(false);
                if (Result.m7277isFailureimpl(m7271constructorimpl)) {
                    m7271constructorimpl = boxBoolean22;
                }
                booleanValue = ((Boolean) m7271constructorimpl).booleanValue();
                updateOnboardingUseCase$execute$1.L$0 = null;
                updateOnboardingUseCase$execute$1.label = 2;
                if (updateOnboardingUseCase.userProfileRepository.setOnboardingDataSubmitted(!booleanValue, updateOnboardingUseCase$execute$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        updateOnboardingUseCase$execute$1 = new UpdateOnboardingUseCase$execute$1(this, continuation);
        Object obj2 = updateOnboardingUseCase$execute$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updateOnboardingUseCase$execute$1.label;
        if (i != 0) {
        }
        m7271constructorimpl = Result.m7271constructorimpl(Boxing.boxBoolean(((Boolean) obj2).booleanValue()));
        Boolean boxBoolean222 = Boxing.boxBoolean(false);
        if (Result.m7277isFailureimpl(m7271constructorimpl)) {
        }
        booleanValue = ((Boolean) m7271constructorimpl).booleanValue();
        updateOnboardingUseCase$execute$1.L$0 = null;
        updateOnboardingUseCase$execute$1.label = 2;
        if (updateOnboardingUseCase.userProfileRepository.setOnboardingDataSubmitted(!booleanValue, updateOnboardingUseCase$execute$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
