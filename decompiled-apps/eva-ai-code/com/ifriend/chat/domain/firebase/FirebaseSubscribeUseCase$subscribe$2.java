package com.ifriend.chat.domain.firebase;

import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.useCases.AppConfigUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebaseSubscribeUseCase.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseSubscribeUseCase$subscribe$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ FirebaseSubscribeUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSubscribeUseCase$subscribe$2(FirebaseSubscribeUseCase firebaseSubscribeUseCase) {
        super(0);
        this.this$0 = firebaseSubscribeUseCase;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseSubscribeUseCase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.domain.firebase.FirebaseSubscribeUseCase$subscribe$2$1", f = "FirebaseSubscribeUseCase.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.domain.firebase.FirebaseSubscribeUseCase$subscribe$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ FirebaseSubscribeUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FirebaseSubscribeUseCase firebaseSubscribeUseCase, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = firebaseSubscribeUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppConfigUseCase appConfigUseCase;
            Preferences preferences;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                appConfigUseCase = this.this$0.appConfigUseCase;
                this.label = 1;
                obj = appConfigUseCase.getEndpointValue(ConfigKeys.WEB_HOST, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            if (str != null) {
                preferences = this.this$0.preferences;
                preferences.saveStringWithKey(ConfigKeys.WEB_HOST, str);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CoroutineScope coroutineScope;
        coroutineScope = this.this$0.coroutineScope;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, null), 3, null);
    }
}
