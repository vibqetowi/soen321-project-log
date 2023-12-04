package com.ifriend.data.toggle;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.toggle.FeatureToggleValue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: ConfigFeatureToggle.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BV\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012$\u0010\t\u001a \b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/data/toggle/TypedConfigFeatureToggle;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/domain/toggle/FeatureToggleValue;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "defaultValue", "errorValue", "fetchToggleValue", "Lkotlin/Function2;", "Lcom/ifriend/domain/config/ConfigState;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "value", "()Ljava/lang/Object;", "valuesFlow", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TypedConfigFeatureToggle<T> implements FeatureToggleValue<T> {
    private final AppConfigLocalDataSource appConfigLocalDataSource;
    private final CoroutineScope coroutineScope;
    private final MutableStateFlow<T> state;

    @Override // com.ifriend.domain.toggle.FeatureToggleValue
    public Object valuesFlow(Continuation<? super StateFlow<? extends T>> continuation) {
        return valuesFlow$suspendImpl(this, continuation);
    }

    public TypedConfigFeatureToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope, T t, T t2, Function2<? super ConfigState, ? super Continuation<? super T>, ? extends Object> fetchToggleValue) {
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(fetchToggleValue, "fetchToggleValue");
        this.appConfigLocalDataSource = appConfigLocalDataSource;
        this.coroutineScope = coroutineScope;
        this.state = StateFlowKt.MutableStateFlow(t);
        BuildersKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this, t2, t, fetchToggleValue, null), 3, null);
    }

    public /* synthetic */ TypedConfigFeatureToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope, Object obj, Object obj2, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appConfigLocalDataSource, coroutineScope, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : obj2, function2);
    }

    /* compiled from: ConfigFeatureToggle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.toggle.TypedConfigFeatureToggle$1", f = "ConfigFeatureToggle.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.toggle.TypedConfigFeatureToggle$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ T $defaultValue;
        final /* synthetic */ T $errorValue;
        final /* synthetic */ Function2<ConfigState, Continuation<? super T>, Object> $fetchToggleValue;
        int label;
        final /* synthetic */ TypedConfigFeatureToggle<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(TypedConfigFeatureToggle<T> typedConfigFeatureToggle, T t, T t2, Function2<? super ConfigState, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = typedConfigFeatureToggle;
            this.$errorValue = t;
            this.$defaultValue = t2;
            this.$fetchToggleValue = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$errorValue, this.$defaultValue, this.$fetchToggleValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ConfigFeatureToggle.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/ifriend/domain/config/ConfigState;", "emit", "(Lcom/ifriend/domain/config/ConfigState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.data.toggle.TypedConfigFeatureToggle$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01431<T> implements FlowCollector {
            final /* synthetic */ T $defaultValue;
            final /* synthetic */ T $errorValue;
            final /* synthetic */ Function2<ConfigState, Continuation<? super T>, Object> $fetchToggleValue;
            final /* synthetic */ TypedConfigFeatureToggle<T> this$0;

            /* JADX WARN: Multi-variable type inference failed */
            C01431(TypedConfigFeatureToggle<T> typedConfigFeatureToggle, T t, T t2, Function2<? super ConfigState, ? super Continuation<? super T>, ? extends Object> function2) {
                this.this$0 = typedConfigFeatureToggle;
                this.$errorValue = t;
                this.$defaultValue = t2;
                this.$fetchToggleValue = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(ConfigState configState, Continuation<? super Unit> continuation) {
                TypedConfigFeatureToggle$1$1$emit$1 typedConfigFeatureToggle$1$1$emit$1;
                int i;
                C01431<T> c01431;
                if (continuation instanceof TypedConfigFeatureToggle$1$1$emit$1) {
                    typedConfigFeatureToggle$1$1$emit$1 = (TypedConfigFeatureToggle$1$1$emit$1) continuation;
                    if ((typedConfigFeatureToggle$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                        typedConfigFeatureToggle$1$1$emit$1.label -= Integer.MIN_VALUE;
                        Object obj = typedConfigFeatureToggle$1$1$emit$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = typedConfigFeatureToggle$1$1$emit$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            if (configState instanceof ConfigState.Error) {
                                MutableStateFlow mutableStateFlow = ((TypedConfigFeatureToggle) this.this$0).state;
                                T t = this.$errorValue;
                                typedConfigFeatureToggle$1$1$emit$1.label = 1;
                                if (mutableStateFlow.emit(t, typedConfigFeatureToggle$1$1$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            } else if (configState instanceof ConfigState.Loading) {
                                MutableStateFlow mutableStateFlow2 = ((TypedConfigFeatureToggle) this.this$0).state;
                                T t2 = this.$defaultValue;
                                typedConfigFeatureToggle$1$1$emit$1.label = 2;
                                if (mutableStateFlow2.emit(t2, typedConfigFeatureToggle$1$1$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            } else {
                                Function2<ConfigState, Continuation<? super T>, Object> function2 = this.$fetchToggleValue;
                                typedConfigFeatureToggle$1$1$emit$1.L$0 = this;
                                typedConfigFeatureToggle$1$1$emit$1.label = 3;
                                obj = function2.invoke(configState, typedConfigFeatureToggle$1$1$emit$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c01431 = this;
                                if (obj != null) {
                                }
                            }
                        } else if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        } else if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        } else if (i == 3) {
                            c01431 = (C01431) typedConfigFeatureToggle$1$1$emit$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            if (obj != null) {
                                return Unit.INSTANCE;
                            }
                            MutableStateFlow mutableStateFlow3 = ((TypedConfigFeatureToggle) c01431.this$0).state;
                            typedConfigFeatureToggle$1$1$emit$1.L$0 = null;
                            typedConfigFeatureToggle$1$1$emit$1.label = 4;
                            if (mutableStateFlow3.emit(obj, typedConfigFeatureToggle$1$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }
                typedConfigFeatureToggle$1$1$emit$1 = new TypedConfigFeatureToggle$1$1$emit$1(this, continuation);
                Object obj2 = typedConfigFeatureToggle$1$1$emit$1.result;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = typedConfigFeatureToggle$1$1$emit$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((ConfigState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (((TypedConfigFeatureToggle) this.this$0).appConfigLocalDataSource.getConfigStateFlow().collect(new C01431(this.this$0, this.$errorValue, this.$defaultValue, this.$fetchToggleValue), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ <T> Object valuesFlow$suspendImpl(TypedConfigFeatureToggle<T> typedConfigFeatureToggle, Continuation<? super StateFlow<? extends T>> continuation) {
        return FlowKt.stateIn(FlowKt.filterNotNull(((TypedConfigFeatureToggle) typedConfigFeatureToggle).state), ((TypedConfigFeatureToggle) typedConfigFeatureToggle).coroutineScope, continuation);
    }

    @Override // com.ifriend.domain.toggle.FeatureToggleValue
    public T value() {
        return this.state.getValue();
    }
}
