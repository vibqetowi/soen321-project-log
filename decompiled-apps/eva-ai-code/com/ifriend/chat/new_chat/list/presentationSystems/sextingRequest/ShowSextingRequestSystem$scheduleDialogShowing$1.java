package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.Preferences;
import com.ifriend.ui.base.modalMessage.RequestSextingPopupDelegate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShowSextingRequestSystem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ShowSextingRequestSystem$scheduleDialogShowing$1", f = "ShowSextingRequestSystem.kt", i = {}, l = {112, 113}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ShowSextingRequestSystem$scheduleDialogShowing$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ShowSextingRequestSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowSextingRequestSystem$scheduleDialogShowing$1(ShowSextingRequestSystem showSextingRequestSystem, Continuation<? super ShowSextingRequestSystem$scheduleDialogShowing$1> continuation) {
        super(2, continuation);
        this.this$0 = showSextingRequestSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShowSextingRequestSystem$scheduleDialogShowing$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShowSextingRequestSystem$scheduleDialogShowing$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences preferences;
        CoroutineDispatchers coroutineDispatchers;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            preferences = this.this$0.userPreferences;
            preferences.saveBooleanWithKey(ShowSextingRequestSystem.IS_SEXTING_REQUEST_WAS_SHOWN, Boxing.boxBoolean(true));
            this.label = 1;
            if (DelayKt.delay(2000L, this) == coroutine_suspended) {
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
        coroutineDispatchers = this.this$0.dispatchers;
        this.label = 2;
        if (BuildersKt.withContext(coroutineDispatchers.getMain(), new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShowSextingRequestSystem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ShowSextingRequestSystem$scheduleDialogShowing$1$1", f = "ShowSextingRequestSystem.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ShowSextingRequestSystem$scheduleDialogShowing$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ShowSextingRequestSystem this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ShowSextingRequestSystem showSextingRequestSystem, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = showSextingRequestSystem;
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
            RequestSextingPopupDelegate requestSextingPopupDelegate;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                requestSextingPopupDelegate = this.this$0.sextingRequestSextingPopupDelegate;
                requestSextingPopupDelegate.showSextingRequest();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
