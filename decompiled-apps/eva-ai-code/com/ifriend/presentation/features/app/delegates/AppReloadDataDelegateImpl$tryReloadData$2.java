package com.ifriend.presentation.features.app.delegates;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.chat.domain.chat.ShouldReloadMessagesUseCase;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppReloadDataDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl$tryReloadData$2", f = "AppReloadDataDelegate.kt", i = {}, l = {81, 84, 88, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppReloadDataDelegateImpl$tryReloadData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AppReloadDataDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppReloadDataDelegateImpl$tryReloadData$2(AppReloadDataDelegateImpl appReloadDataDelegateImpl, Continuation<? super AppReloadDataDelegateImpl$tryReloadData$2> continuation) {
        super(2, continuation);
        this.this$0 = appReloadDataDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppReloadDataDelegateImpl$tryReloadData$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppReloadDataDelegateImpl$tryReloadData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppReloadDataDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegateImpl$AppReloadDataState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl$tryReloadData$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<AppReloadDataDelegateImpl.AppReloadDataState, AppReloadDataDelegateImpl.AppReloadDataState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AppReloadDataDelegateImpl.AppReloadDataState invoke(AppReloadDataDelegateImpl.AppReloadDataState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return AppReloadDataDelegateImpl.AppReloadDataState.copy$default(state, true, null, false, 6, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UserRepository userRepository;
        UserProfileRepository userProfileRepository;
        ShouldReloadMessagesUseCase shouldReloadMessagesUseCase;
        Object reload;
        Object reload2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<AppReloadDataDelegateImpl.AppReloadDataState, Object> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.reduce(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            shouldReloadMessagesUseCase = this.this$0.shouldReloadMessagesUseCase;
            if (shouldReloadMessagesUseCase.invoke()) {
                this.label = 3;
                reload2 = this.this$0.reload(this);
                if (reload2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                UiStateDelegate<AppReloadDataDelegateImpl.AppReloadDataState, Object> uiStateDelegate2 = this.this$0;
                if (uiStateDelegate2.getUiState(uiStateDelegate2).isShouldReloadData()) {
                    this.label = 4;
                    reload = this.this$0.reload(this);
                    if (reload == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        userRepository = this.this$0.userRepository;
        if (!userRepository.isAuthorized()) {
            return Unit.INSTANCE;
        }
        userProfileRepository = this.this$0.userProfileRepository;
        this.label = 2;
        obj = userProfileRepository.isOnboardingDataSubmitted(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
