package com.ifriend.data.repository.infoonboarding;

import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InfoOnboardingRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.infoonboarding.InfoOnboardingRepositoryImpl$getInfoOnboarding$2", f = "InfoOnboardingRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class InfoOnboardingRepositoryImpl$getInfoOnboarding$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<InfoOnboardingSlide>>, Object> {
    int label;
    final /* synthetic */ InfoOnboardingRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoOnboardingRepositoryImpl$getInfoOnboarding$2(InfoOnboardingRepositoryImpl infoOnboardingRepositoryImpl, Continuation<? super InfoOnboardingRepositoryImpl$getInfoOnboarding$2> continuation) {
        super(2, continuation);
        this.this$0 = infoOnboardingRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InfoOnboardingRepositoryImpl$getInfoOnboarding$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<InfoOnboardingSlide>> continuation) {
        return ((InfoOnboardingRepositoryImpl$getInfoOnboarding$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean addIfNotShown;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        this.this$0.addIfNotShown(arrayList, InfoOnboardingSlide.TrackActivity.INSTANCE);
        this.this$0.addIfNotShown(arrayList, InfoOnboardingSlide.UserWillSendPhotos.INSTANCE);
        addIfNotShown = this.this$0.addIfNotShown(arrayList, InfoOnboardingSlide.AllowNotifications.INSTANCE);
        if (addIfNotShown) {
            this.this$0.addNotificationPermissionSlide(arrayList);
        }
        this.this$0.addIfNotShown(arrayList, InfoOnboardingSlide.Intimate.INSTANCE);
        return arrayList;
    }
}
