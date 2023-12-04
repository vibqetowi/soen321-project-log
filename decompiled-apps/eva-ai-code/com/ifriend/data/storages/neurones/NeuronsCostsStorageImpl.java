package com.ifriend.data.storages.neurones;

import com.ifriend.data.networking.api.NeuronsApi;
import com.ifriend.data.networking.responses.FreeGenerationCountResponse;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.toggle.AvatarGenerationFreeToggle;
import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.storage.NeuronsCosts;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import retrofit2.Response;
/* compiled from: NeuronsCostsStorageImpl.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0011\u0010\u0014\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0018H\u0016J\u0011\u0010\u0019\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ifriend/data/storages/neurones/NeuronsCostsStorageImpl;", "Lcom/ifriend/domain/storage/NeuronsCostsStorage;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "avatarGenerationFreeToggle", "Lcom/ifriend/data/toggle/AvatarGenerationFreeToggle;", "neuronsApi", "Lcom/ifriend/data/networking/api/NeuronsApi;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Lcom/ifriend/data/toggle/AvatarGenerationFreeToggle;Lcom/ifriend/data/networking/api/NeuronsApi;Lcom/ifriend/domain/data/AuthDataProvider;)V", "neuronCosts", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/storage/NeuronsCosts;", "fetchCostsFromConfigAndEmit", "", "config", "Lcom/ifriend/domain/config/ConfigState;", "freeGenerationsAmount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNeuronsCosts", "Lkotlinx/coroutines/flow/StateFlow;", "updateCosts", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NeuronsCostsStorageImpl implements NeuronsCostsStorage {
    private final AppConfigLocalDataSource appConfigLocalDataSource;
    private final AuthDataProvider authDataProvider;
    private final AvatarGenerationFreeToggle avatarGenerationFreeToggle;
    private final CoroutineScope coroutineScope;
    private final MutableStateFlow<NeuronsCosts> neuronCosts;
    private final NeuronsApi neuronsApi;

    public NeuronsCostsStorageImpl(CoroutineScope coroutineScope, AppConfigLocalDataSource appConfigLocalDataSource, AvatarGenerationFreeToggle avatarGenerationFreeToggle, NeuronsApi neuronsApi, AuthDataProvider authDataProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(avatarGenerationFreeToggle, "avatarGenerationFreeToggle");
        Intrinsics.checkNotNullParameter(neuronsApi, "neuronsApi");
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        this.coroutineScope = coroutineScope;
        this.appConfigLocalDataSource = appConfigLocalDataSource;
        this.avatarGenerationFreeToggle = avatarGenerationFreeToggle;
        this.neuronsApi = neuronsApi;
        this.authDataProvider = authDataProvider;
        this.neuronCosts = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(null), 3, null);
    }

    /* compiled from: NeuronsCostsStorageImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.storages.neurones.NeuronsCostsStorageImpl$1", f = "NeuronsCostsStorageImpl.kt", i = {}, l = {32, 32}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.storages.neurones.NeuronsCostsStorageImpl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NeuronsCostsStorageImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.data.storages.neurones.NeuronsCostsStorageImpl$1$1", f = "NeuronsCostsStorageImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.data.storages.neurones.NeuronsCostsStorageImpl$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01411 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ NeuronsCostsStorageImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01411(NeuronsCostsStorageImpl neuronsCostsStorageImpl, Continuation<? super C01411> continuation) {
                super(2, continuation);
                this.this$0 = neuronsCostsStorageImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01411(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((C01411) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                NeuronsCostsStorageImpl neuronsCostsStorageImpl = this.this$0;
                neuronsCostsStorageImpl.fetchCostsFromConfigAndEmit(neuronsCostsStorageImpl.appConfigLocalDataSource.getState());
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = NeuronsCostsStorageImpl.this.avatarGenerationFreeToggle.isEnabled(this);
                if (obj == coroutine_suspended) {
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
            this.label = 2;
            if (FlowKt.collectLatest((Flow) obj, new C01411(NeuronsCostsStorageImpl.this, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: NeuronsCostsStorageImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.storages.neurones.NeuronsCostsStorageImpl$2", f = "NeuronsCostsStorageImpl.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.storages.neurones.NeuronsCostsStorageImpl$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collect(FlowKt.onEach(NeuronsCostsStorageImpl.this.appConfigLocalDataSource.getConfigStateFlow(), new AnonymousClass1(NeuronsCostsStorageImpl.this, null)), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NeuronsCostsStorageImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/config/ConfigState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.data.storages.neurones.NeuronsCostsStorageImpl$2$1", f = "NeuronsCostsStorageImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.data.storages.neurones.NeuronsCostsStorageImpl$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ConfigState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NeuronsCostsStorageImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(NeuronsCostsStorageImpl neuronsCostsStorageImpl, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = neuronsCostsStorageImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConfigState configState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(configState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.fetchCostsFromConfigAndEmit((ConfigState) this.L$0);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchCostsFromConfigAndEmit(ConfigState configState) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new NeuronsCostsStorageImpl$fetchCostsFromConfigAndEmit$1(configState, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object freeGenerationsAmount(Continuation<? super Integer> continuation) {
        NeuronsCostsStorageImpl$freeGenerationsAmount$1 neuronsCostsStorageImpl$freeGenerationsAmount$1;
        int i;
        NeuronsCostsStorageImpl neuronsCostsStorageImpl;
        AuthData authData;
        AuthData authData2;
        NeuronsCostsStorageImpl neuronsCostsStorageImpl2;
        FreeGenerationCountResponse freeGenerationCountResponse;
        if (continuation instanceof NeuronsCostsStorageImpl$freeGenerationsAmount$1) {
            neuronsCostsStorageImpl$freeGenerationsAmount$1 = (NeuronsCostsStorageImpl$freeGenerationsAmount$1) continuation;
            if ((neuronsCostsStorageImpl$freeGenerationsAmount$1.label & Integer.MIN_VALUE) != 0) {
                neuronsCostsStorageImpl$freeGenerationsAmount$1.label -= Integer.MIN_VALUE;
                Object obj = neuronsCostsStorageImpl$freeGenerationsAmount$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = neuronsCostsStorageImpl$freeGenerationsAmount$1.label;
                int i2 = 0;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthDataProvider authDataProvider = this.authDataProvider;
                    neuronsCostsStorageImpl$freeGenerationsAmount$1.L$0 = this;
                    neuronsCostsStorageImpl$freeGenerationsAmount$1.label = 1;
                    obj = authDataProvider.lastAuthData(neuronsCostsStorageImpl$freeGenerationsAmount$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    neuronsCostsStorageImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            freeGenerationCountResponse = (FreeGenerationCountResponse) ((Response) obj).body();
                            if (freeGenerationCountResponse != null) {
                                i2 = freeGenerationCountResponse.getCount();
                            }
                            return Boxing.boxInt(i2);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    authData2 = (AuthData) neuronsCostsStorageImpl$freeGenerationsAmount$1.L$1;
                    neuronsCostsStorageImpl2 = (NeuronsCostsStorageImpl) neuronsCostsStorageImpl$freeGenerationsAmount$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
                        NeuronsApi neuronsApi = neuronsCostsStorageImpl2.neuronsApi;
                        String formatted = authData2.getToken().formatted();
                        String value = authData2.getUserId().getValue();
                        neuronsCostsStorageImpl$freeGenerationsAmount$1.L$0 = null;
                        neuronsCostsStorageImpl$freeGenerationsAmount$1.L$1 = null;
                        neuronsCostsStorageImpl$freeGenerationsAmount$1.label = 3;
                        obj = neuronsApi.freeGenerationsCount(formatted, value, neuronsCostsStorageImpl$freeGenerationsAmount$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        freeGenerationCountResponse = (FreeGenerationCountResponse) ((Response) obj).body();
                        if (freeGenerationCountResponse != null) {
                        }
                    }
                    return Boxing.boxInt(i2);
                } else {
                    neuronsCostsStorageImpl = (NeuronsCostsStorageImpl) neuronsCostsStorageImpl$freeGenerationsAmount$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                authData = (AuthData) obj;
                if (authData != null) {
                    return Boxing.boxInt(0);
                }
                AvatarGenerationFreeToggle avatarGenerationFreeToggle = neuronsCostsStorageImpl.avatarGenerationFreeToggle;
                neuronsCostsStorageImpl$freeGenerationsAmount$1.L$0 = neuronsCostsStorageImpl;
                neuronsCostsStorageImpl$freeGenerationsAmount$1.L$1 = authData;
                neuronsCostsStorageImpl$freeGenerationsAmount$1.label = 2;
                Object isEnabled = avatarGenerationFreeToggle.isEnabled(neuronsCostsStorageImpl$freeGenerationsAmount$1);
                if (isEnabled == coroutine_suspended) {
                    return coroutine_suspended;
                }
                NeuronsCostsStorageImpl neuronsCostsStorageImpl3 = neuronsCostsStorageImpl;
                authData2 = authData;
                obj = isEnabled;
                neuronsCostsStorageImpl2 = neuronsCostsStorageImpl3;
                if (((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
                }
                return Boxing.boxInt(i2);
            }
        }
        neuronsCostsStorageImpl$freeGenerationsAmount$1 = new NeuronsCostsStorageImpl$freeGenerationsAmount$1(this, continuation);
        Object obj2 = neuronsCostsStorageImpl$freeGenerationsAmount$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = neuronsCostsStorageImpl$freeGenerationsAmount$1.label;
        int i22 = 0;
        if (i != 0) {
        }
        authData = (AuthData) obj2;
        if (authData != null) {
        }
    }

    @Override // com.ifriend.domain.storage.NeuronsCostsStorage
    public StateFlow<NeuronsCosts> getNeuronsCosts() {
        return this.neuronCosts;
    }

    @Override // com.ifriend.domain.storage.NeuronsCostsStorage
    public Object updateCosts(Continuation<? super Unit> continuation) {
        fetchCostsFromConfigAndEmit(this.appConfigLocalDataSource.getState());
        return Unit.INSTANCE;
    }
}
