package com.ifriend.presentation.services;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.models.profile.user.UserToken;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: UserBalanceService.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.services.UserBalanceServiceImpl$start$4", f = "UserBalanceService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UserBalanceServiceImpl$start$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UserBalanceServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserBalanceServiceImpl$start$4(UserBalanceServiceImpl userBalanceServiceImpl, Continuation<? super UserBalanceServiceImpl$start$4> continuation) {
        super(2, continuation);
        this.this$0 = userBalanceServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UserBalanceServiceImpl$start$4 userBalanceServiceImpl$start$4 = new UserBalanceServiceImpl$start$4(this.this$0, continuation);
        userBalanceServiceImpl$start$4.L$0 = obj;
        return userBalanceServiceImpl$start$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserBalanceServiceImpl$start$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserRepository userRepository;
        DispatcherProvider dispatcherProvider;
        CoroutineScope coroutineScope;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            userRepository = this.this$0.userRepository;
            final Flow<User> user = userRepository.getUser();
            final UserBalanceServiceImpl userBalanceServiceImpl = this.this$0;
            Flow mapLatest = FlowKt.mapLatest(FlowKt.distinctUntilChanged(new Flow<Pair<? extends Boolean, ? extends String>>() { // from class: com.ifriend.presentation.services.UserBalanceServiceImpl$start$4$invokeSuspend$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Pair<? extends Boolean, ? extends String>> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, userBalanceServiceImpl), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.ifriend.presentation.services.UserBalanceServiceImpl$start$4$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ UserBalanceServiceImpl this$0;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.ifriend.presentation.services.UserBalanceServiceImpl$start$4$invokeSuspend$$inlined$map$1$2", f = "UserBalanceService.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    /* renamed from: com.ifriend.presentation.services.UserBalanceServiceImpl$start$4$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, UserBalanceServiceImpl userBalanceServiceImpl) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = userBalanceServiceImpl;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        UserRepository userRepository;
                        AuthData auth;
                        UserToken token;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    User user = (User) obj;
                                    userRepository = this.this$0.userRepository;
                                    Boolean boxBoolean = Boxing.boxBoolean(userRepository.isAuthorized());
                                    String value = (user == null || (auth = user.getAuth()) == null || (token = auth.getToken()) == null) ? null : token.getValue();
                                    if (value == null) {
                                        value = "";
                                    }
                                    Pair pair = TuplesKt.to(boxBoolean, value);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(pair, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                } else {
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        Object obj22 = anonymousClass1.result;
                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }
            }), new AnonymousClass2((CoroutineScope) this.L$0, this.this$0, null));
            dispatcherProvider = this.this$0.dispatcherProvider;
            Flow flowOn = FlowKt.flowOn(mapLatest, dispatcherProvider.background());
            coroutineScope = this.this$0.coroutineScope;
            BuildersKt.launch(coroutineScope, EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new UserBalanceServiceImpl$start$4$invokeSuspend$$inlined$collectIn$default$1(flowOn, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserBalanceService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "pair", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.services.UserBalanceServiceImpl$start$4$2", f = "UserBalanceService.kt", i = {}, l = {76, 78}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.services.UserBalanceServiceImpl$start$4$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends String>, Continuation<? super Object>, Object> {
        final /* synthetic */ CoroutineScope $$this$safeLaunch;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UserBalanceServiceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CoroutineScope coroutineScope, UserBalanceServiceImpl userBalanceServiceImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$$this$safeLaunch = coroutineScope;
            this.this$0 = userBalanceServiceImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$safeLaunch, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Boolean, ? extends String> pair, Continuation<? super Object> continuation) {
            return invoke2((Pair<Boolean, String>) pair, (Continuation<Object>) continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(Pair<Boolean, String> pair, Continuation<Object> continuation) {
            return ((AnonymousClass2) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m7271constructorimpl;
            UserBalanceRepository userBalanceRepository;
            UserBalanceRepository userBalanceRepository2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
            }
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                    return Result.m7270boximpl(m7271constructorimpl);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) ((Pair) this.L$0).getFirst()).booleanValue()) {
                userBalanceRepository = this.this$0.userBalanceRepository;
                this.label = 2;
                if (userBalanceRepository.clear(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            UserBalanceServiceImpl userBalanceServiceImpl = this.this$0;
            Result.Companion companion2 = Result.Companion;
            userBalanceRepository2 = userBalanceServiceImpl.userBalanceRepository;
            this.label = 1;
            if (userBalanceRepository2.updateBalance(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
            return Result.m7270boximpl(m7271constructorimpl);
            Result.Companion companion3 = Result.Companion;
            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
            return Result.m7270boximpl(m7271constructorimpl);
        }
    }
}
