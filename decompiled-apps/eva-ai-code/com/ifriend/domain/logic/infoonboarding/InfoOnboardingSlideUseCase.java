package com.ifriend.domain.logic.infoonboarding;

import com.ifriend.domain.data.infoonboarding.InfoOnboardingRepository;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.apache.http.cookie.ClientCookie;
/* compiled from: InfoOnboardingSlideUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\bJ!\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlideUseCase;", "", "infoOnboardingRepository", "Lcom/ifriend/domain/data/infoonboarding/InfoOnboardingRepository;", "(Lcom/ifriend/domain/data/infoonboarding/InfoOnboardingRepository;)V", "getNeedToShowInfoOnboardingScreens", "", "Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isNeedToShowInfoOnboarding", "", "saveScreenAsShown", "", "screen", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoOnboardingSlideUseCase {
    private final InfoOnboardingRepository infoOnboardingRepository;

    @Inject
    public InfoOnboardingSlideUseCase(InfoOnboardingRepository infoOnboardingRepository) {
        Intrinsics.checkNotNullParameter(infoOnboardingRepository, "infoOnboardingRepository");
        this.infoOnboardingRepository = infoOnboardingRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isNeedToShowInfoOnboarding(Continuation<? super Boolean> continuation) {
        InfoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1 infoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1;
        int i;
        if (continuation instanceof InfoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1) {
            infoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1 = (InfoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1) continuation;
            if ((infoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1.label & Integer.MIN_VALUE) != 0) {
                infoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1.label -= Integer.MIN_VALUE;
                Object obj = infoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = infoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InfoOnboardingRepository infoOnboardingRepository = this.infoOnboardingRepository;
                    infoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1.label = 1;
                    obj = infoOnboardingRepository.getInfoOnboarding(infoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(!((Collection) obj).isEmpty());
            }
        }
        infoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1 = new InfoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1(this, continuation);
        Object obj2 = infoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = infoOnboardingSlideUseCase$isNeedToShowInfoOnboarding$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(!((Collection) obj2).isEmpty());
    }

    public final Object getNeedToShowInfoOnboardingScreens(Continuation<? super List<? extends InfoOnboardingSlide>> continuation) {
        return this.infoOnboardingRepository.getInfoOnboarding(continuation);
    }

    public final Object saveScreenAsShown(KClass<? extends InfoOnboardingSlide> kClass, Continuation<? super Unit> continuation) {
        Object saveScreenAsShown = this.infoOnboardingRepository.saveScreenAsShown(kClass, continuation);
        return saveScreenAsShown == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? saveScreenAsShown : Unit.INSTANCE;
    }
}
