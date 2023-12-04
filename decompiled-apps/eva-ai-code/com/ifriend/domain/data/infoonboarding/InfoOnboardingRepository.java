package com.ifriend.domain.data.infoonboarding;

import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KClass;
import org.apache.http.cookie.ClientCookie;
/* compiled from: InfoOnboardingRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/data/infoonboarding/InfoOnboardingRepository;", "", "getInfoOnboarding", "", "Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveScreenAsShown", "", "screen", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InfoOnboardingRepository {
    Object getInfoOnboarding(Continuation<? super List<? extends InfoOnboardingSlide>> continuation);

    Object saveScreenAsShown(KClass<? extends InfoOnboardingSlide> kClass, Continuation<? super Unit> continuation);
}
