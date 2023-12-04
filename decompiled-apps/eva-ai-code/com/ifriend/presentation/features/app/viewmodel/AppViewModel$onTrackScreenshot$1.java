package com.ifriend.presentation.features.app.viewmodel;

import com.ifriend.analytics.usecase.screenshot.AnalyticsScreenName;
import com.ifriend.analytics.usecase.screenshot.AnalyticsScreenshot;
import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.viewmodel.AppViewModel$onTrackScreenshot$1", f = "AppViewModel.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppViewModel$onTrackScreenshot$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $platformName;
    final /* synthetic */ AnalyticsScreenName $screenName;
    int label;
    final /* synthetic */ AppViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel$onTrackScreenshot$1(AppViewModel appViewModel, AnalyticsScreenName analyticsScreenName, String str, Continuation<? super AppViewModel$onTrackScreenshot$1> continuation) {
        super(2, continuation);
        this.this$0 = appViewModel;
        this.$screenName = analyticsScreenName;
        this.$platformName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppViewModel$onTrackScreenshot$1(this.this$0, this.$screenName, this.$platformName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppViewModel$onTrackScreenshot$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
        AppIdentityConverter appIdentityConverter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatsInfoConfigurationRepository = this.this$0.chatsInfoConfigurationRepository;
            this.label = 1;
            obj = chatsInfoConfigurationRepository.getLastActiveChatId(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        appIdentityConverter = this.this$0.appIdentityConverter;
        AnalyticsScreenshot.INSTANCE.trackScreenshot(this.$screenName, this.$platformName, appIdentityConverter.convertToDbId((String) obj));
        return Unit.INSTANCE;
    }
}
