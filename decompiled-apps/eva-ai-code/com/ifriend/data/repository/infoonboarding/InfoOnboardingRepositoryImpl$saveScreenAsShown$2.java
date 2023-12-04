package com.ifriend.data.repository.infoonboarding;

import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InfoOnboardingRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.infoonboarding.InfoOnboardingRepositoryImpl$saveScreenAsShown$2", f = "InfoOnboardingRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class InfoOnboardingRepositoryImpl$saveScreenAsShown$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ KClass<? extends InfoOnboardingSlide> $screen;
    int label;
    final /* synthetic */ InfoOnboardingRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoOnboardingRepositoryImpl$saveScreenAsShown$2(InfoOnboardingRepositoryImpl infoOnboardingRepositoryImpl, KClass<? extends InfoOnboardingSlide> kClass, Continuation<? super InfoOnboardingRepositoryImpl$saveScreenAsShown$2> continuation) {
        super(2, continuation);
        this.this$0 = infoOnboardingRepositoryImpl;
        this.$screen = kClass;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InfoOnboardingRepositoryImpl$saveScreenAsShown$2(this.this$0, this.$screen, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InfoOnboardingRepositoryImpl$saveScreenAsShown$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String screenName;
        Preferences preferences;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            screenName = this.this$0.toScreenName(this.$screen);
            preferences = this.this$0.preferences;
            preferences.addValueToStringSetWithKey("shown_screens_after_request", screenName);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
