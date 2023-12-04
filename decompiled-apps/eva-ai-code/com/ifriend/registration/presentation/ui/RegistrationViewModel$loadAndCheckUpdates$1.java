package com.ifriend.registration.presentation.ui;

import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.data.config.AppConfigRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegistrationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.registration.presentation.ui.RegistrationViewModel$loadAndCheckUpdates$1", f = "RegistrationViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class RegistrationViewModel$loadAndCheckUpdates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RegistrationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationViewModel$loadAndCheckUpdates$1(RegistrationViewModel registrationViewModel, Continuation<? super RegistrationViewModel$loadAndCheckUpdates$1> continuation) {
        super(2, continuation);
        this.this$0 = registrationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RegistrationViewModel$loadAndCheckUpdates$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RegistrationViewModel$loadAndCheckUpdates$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppConfigRepository appConfigRepository;
        RegistrationViewModel registrationViewModel;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RegistrationViewModel registrationViewModel2 = this.this$0;
            appConfigRepository = registrationViewModel2.appConfigRepository;
            this.L$0 = registrationViewModel2;
            this.label = 1;
            Object loadConfig = appConfigRepository.loadConfig(CollectionsKt.emptyList(), this);
            if (loadConfig == coroutine_suspended) {
                return coroutine_suspended;
            }
            registrationViewModel = registrationViewModel2;
            obj = loadConfig;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            registrationViewModel = (RegistrationViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        registrationViewModel.isConfigLoaded = obj instanceof ConfigState.Loaded;
        z = this.this$0.isConfigLoaded;
        if (z) {
            this.this$0.checkForAppUpdates();
        }
        return Unit.INSTANCE;
    }
}
