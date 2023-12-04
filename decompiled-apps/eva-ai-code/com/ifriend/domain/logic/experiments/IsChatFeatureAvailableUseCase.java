package com.ifriend.domain.logic.experiments;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.logic.experiments.checker.ChatIdConditionsCheckerUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.apache.http.cookie.ClientCookie;
/* compiled from: IsChatFeatureAvailableUseCase.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/logic/experiments/IsChatFeatureAvailableUseCase;", "", "featureToggleRepository", "Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;", "chatIdConditionsCheckerUseCase", "Lcom/ifriend/domain/logic/experiments/checker/ChatIdConditionsCheckerUseCase;", "(Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;Lcom/ifriend/domain/logic/experiments/checker/ChatIdConditionsCheckerUseCase;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "", "chatId", "", "toggle", "Lcom/ifriend/domain/logic/experiments/FeatureToggleKey;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/experiments/FeatureToggleKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IsChatFeatureAvailableUseCase {
    private final ChatIdConditionsCheckerUseCase chatIdConditionsCheckerUseCase;
    private final FeatureToggleRepository featureToggleRepository;

    @Inject
    public IsChatFeatureAvailableUseCase(FeatureToggleRepository featureToggleRepository, ChatIdConditionsCheckerUseCase chatIdConditionsCheckerUseCase) {
        Intrinsics.checkNotNullParameter(featureToggleRepository, "featureToggleRepository");
        Intrinsics.checkNotNullParameter(chatIdConditionsCheckerUseCase, "chatIdConditionsCheckerUseCase");
        this.featureToggleRepository = featureToggleRepository;
        this.chatIdConditionsCheckerUseCase = chatIdConditionsCheckerUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(final String str, final FeatureToggleKey featureToggleKey, Continuation<? super Flow<Boolean>> continuation) {
        IsChatFeatureAvailableUseCase$execute$1 isChatFeatureAvailableUseCase$execute$1;
        int i;
        final IsChatFeatureAvailableUseCase isChatFeatureAvailableUseCase;
        if (continuation instanceof IsChatFeatureAvailableUseCase$execute$1) {
            isChatFeatureAvailableUseCase$execute$1 = (IsChatFeatureAvailableUseCase$execute$1) continuation;
            if ((isChatFeatureAvailableUseCase$execute$1.label & Integer.MIN_VALUE) != 0) {
                isChatFeatureAvailableUseCase$execute$1.label -= Integer.MIN_VALUE;
                Object obj = isChatFeatureAvailableUseCase$execute$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = isChatFeatureAvailableUseCase$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    FeatureToggleRepository featureToggleRepository = this.featureToggleRepository;
                    isChatFeatureAvailableUseCase$execute$1.L$0 = this;
                    isChatFeatureAvailableUseCase$execute$1.L$1 = str;
                    isChatFeatureAvailableUseCase$execute$1.L$2 = featureToggleKey;
                    isChatFeatureAvailableUseCase$execute$1.label = 1;
                    obj = featureToggleRepository.isFeatureEnabledFlow(featureToggleKey, isChatFeatureAvailableUseCase$execute$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    isChatFeatureAvailableUseCase = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    featureToggleKey = (FeatureToggleKey) isChatFeatureAvailableUseCase$execute$1.L$2;
                    str = (String) isChatFeatureAvailableUseCase$execute$1.L$1;
                    isChatFeatureAvailableUseCase = (IsChatFeatureAvailableUseCase) isChatFeatureAvailableUseCase$execute$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                final Flow flow = (Flow) obj;
                return new Flow<Boolean>() { // from class: com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase$execute$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation2) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, isChatFeatureAvailableUseCase, str, featureToggleKey), continuation2);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase$execute$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ String $chatId$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ FeatureToggleKey $toggle$inlined;
                        final /* synthetic */ IsChatFeatureAvailableUseCase this$0;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase$execute$$inlined$map$1$2", f = "IsChatFeatureAvailableUseCase.kt", i = {}, l = {225, 223}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase$execute$$inlined$map$1$2$1  reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, IsChatFeatureAvailableUseCase isChatFeatureAvailableUseCase, String str, FeatureToggleKey featureToggleKey) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = isChatFeatureAvailableUseCase;
                            this.$chatId$inlined = str;
                            this.$toggle$inlined = featureToggleKey;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[RETURN] */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Object coroutine_suspended;
                            int i;
                            FlowCollector flowCollector;
                            Object boxBoolean;
                            ChatIdConditionsCheckerUseCase chatIdConditionsCheckerUseCase;
                            FlowCollector flowCollector2;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        flowCollector = this.$this_unsafeFlow;
                                        if (((Boolean) obj).booleanValue()) {
                                            chatIdConditionsCheckerUseCase = this.this$0.chatIdConditionsCheckerUseCase;
                                            String str = this.$chatId$inlined;
                                            FeatureToggleKey featureToggleKey = this.$toggle$inlined;
                                            anonymousClass1.L$0 = flowCollector;
                                            anonymousClass1.label = 1;
                                            Object execute = chatIdConditionsCheckerUseCase.execute(str, featureToggleKey, anonymousClass1);
                                            if (execute == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            obj2 = execute;
                                            flowCollector2 = flowCollector;
                                        } else {
                                            boxBoolean = Boxing.boxBoolean(false);
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.label = 2;
                                            if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    } else if (i != 1) {
                                        if (i == 2) {
                                            ResultKt.throwOnFailure(obj2);
                                            return Unit.INSTANCE;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    } else {
                                        flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    Object obj3 = obj2;
                                    flowCollector = flowCollector2;
                                    boxBoolean = obj3;
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.label = 2;
                                    if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            Object obj32 = obj22;
                            flowCollector = flowCollector2;
                            boxBoolean = obj32;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
        }
        isChatFeatureAvailableUseCase$execute$1 = new IsChatFeatureAvailableUseCase$execute$1(this, continuation);
        Object obj2 = isChatFeatureAvailableUseCase$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = isChatFeatureAvailableUseCase$execute$1.label;
        if (i != 0) {
        }
        final Flow flow2 = (Flow) obj2;
        return new Flow<Boolean>() { // from class: com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase$execute$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, isChatFeatureAvailableUseCase, str, featureToggleKey), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase$execute$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $chatId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ FeatureToggleKey $toggle$inlined;
                final /* synthetic */ IsChatFeatureAvailableUseCase this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase$execute$$inlined$map$1$2", f = "IsChatFeatureAvailableUseCase.kt", i = {}, l = {225, 223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase$execute$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, IsChatFeatureAvailableUseCase isChatFeatureAvailableUseCase, String str, FeatureToggleKey featureToggleKey) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = isChatFeatureAvailableUseCase;
                    this.$chatId$inlined = str;
                    this.$toggle$inlined = featureToggleKey;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object coroutine_suspended;
                    int i;
                    FlowCollector flowCollector;
                    Object boxBoolean;
                    ChatIdConditionsCheckerUseCase chatIdConditionsCheckerUseCase;
                    FlowCollector flowCollector2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj22 = anonymousClass1.result;
                            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj22);
                                flowCollector = this.$this_unsafeFlow;
                                if (((Boolean) obj).booleanValue()) {
                                    chatIdConditionsCheckerUseCase = this.this$0.chatIdConditionsCheckerUseCase;
                                    String str = this.$chatId$inlined;
                                    FeatureToggleKey featureToggleKey = this.$toggle$inlined;
                                    anonymousClass1.L$0 = flowCollector;
                                    anonymousClass1.label = 1;
                                    Object execute = chatIdConditionsCheckerUseCase.execute(str, featureToggleKey, anonymousClass1);
                                    if (execute == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    obj22 = execute;
                                    flowCollector2 = flowCollector;
                                } else {
                                    boxBoolean = Boxing.boxBoolean(false);
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.label = 2;
                                    if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else if (i != 1) {
                                if (i == 2) {
                                    ResultKt.throwOnFailure(obj22);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj22);
                            }
                            Object obj32 = obj22;
                            flowCollector = flowCollector2;
                            boxBoolean = obj32;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj222 = anonymousClass1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    Object obj322 = obj222;
                    flowCollector = flowCollector2;
                    boxBoolean = obj322;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }
}
