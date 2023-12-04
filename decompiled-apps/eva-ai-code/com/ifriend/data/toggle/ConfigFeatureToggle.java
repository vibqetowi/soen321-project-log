package com.ifriend.data.toggle;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.perf.util.Constants;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.toggle.FeatureToggle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: ConfigFeatureToggle.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001BG\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eB]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0013¢\u0006\u0002\u0010\u0014J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0018H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\r\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/ifriend/data/toggle/ConfigFeatureToggle;", "Lcom/ifriend/domain/toggle/FeatureToggle;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "featureName", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "defaultValue", "", "errorValue", "preferences", "Lcom/ifriend/domain/data/Preferences;", "cacheKey", "(Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ifriend/domain/data/Preferences;Ljava/lang/String;)V", "cache", "Lkotlin/Function1;", "", "restore", "Lkotlin/Function0;", "(Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", Constants.ENABLE_DISABLE, "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEnabledCachedValue", "isEnabledValue", "()Ljava/lang/Boolean;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ConfigFeatureToggle implements FeatureToggle {
    private final AppConfigLocalDataSource appConfigLocalDataSource;
    private final Function1<Boolean, Unit> cache;
    private final CoroutineScope coroutineScope;
    private final String featureName;
    private final Function0<Boolean> restore;
    private final MutableStateFlow<Boolean> state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigFeatureToggle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.toggle.ConfigFeatureToggle$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function0 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            return null;
        }
    }

    @Override // com.ifriend.domain.toggle.FeatureToggle
    public Object isEnabled(Continuation<? super StateFlow<Boolean>> continuation) {
        return isEnabled$suspendImpl(this, continuation);
    }

    @Override // com.ifriend.domain.toggle.FeatureToggle
    public Object isEnabledCachedValue(Continuation<? super Boolean> continuation) {
        return isEnabledCachedValue$suspendImpl(this, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConfigFeatureToggle(AppConfigLocalDataSource appConfigLocalDataSource, String featureName, CoroutineScope coroutineScope, Boolean bool, Boolean bool2, Function1<? super Boolean, Unit> cache, Function0<Boolean> restore) {
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(restore, "restore");
        this.appConfigLocalDataSource = appConfigLocalDataSource;
        this.featureName = featureName;
        this.coroutineScope = coroutineScope;
        this.cache = cache;
        this.restore = restore;
        this.state = StateFlowKt.MutableStateFlow(bool);
        BuildersKt.launch$default(coroutineScope, null, null, new AnonymousClass5(bool2, bool, null), 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ConfigFeatureToggle(AppConfigLocalDataSource appConfigLocalDataSource, String str, CoroutineScope coroutineScope, Boolean bool, Boolean bool2, Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appConfigLocalDataSource, str, coroutineScope, r5, (i & 16) != 0 ? r5 : bool2, (i & 32) != 0 ? AnonymousClass1.INSTANCE : function1, (i & 64) != 0 ? AnonymousClass2.INSTANCE : function0);
        Boolean bool3 = (i & 8) != 0 ? false : bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigFeatureToggle.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.toggle.ConfigFeatureToggle$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Boolean, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ConfigFeatureToggle(AppConfigLocalDataSource appConfigLocalDataSource, String str, CoroutineScope coroutineScope, Boolean bool, Boolean bool2, Preferences preferences, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appConfigLocalDataSource, str, coroutineScope, r5, (i & 16) != 0 ? r5 : bool2, preferences, str2);
        Boolean bool3 = (i & 8) != 0 ? false : bool;
    }

    /* compiled from: ConfigFeatureToggle.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.toggle.ConfigFeatureToggle$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass3 extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ Preferences $preferences;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Preferences preferences, String str) {
            super(1);
            this.$preferences = preferences;
            this.$cacheKey = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.$preferences.saveBooleanWithKey(this.$cacheKey, Boolean.valueOf(z));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfigFeatureToggle(AppConfigLocalDataSource appConfigLocalDataSource, String featureName, CoroutineScope coroutineScope, Boolean bool, Boolean bool2, Preferences preferences, String cacheKey) {
        this(appConfigLocalDataSource, featureName, coroutineScope, bool, bool2, new AnonymousClass3(preferences, cacheKey), new AnonymousClass4(preferences, cacheKey, bool));
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
    }

    /* compiled from: ConfigFeatureToggle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.toggle.ConfigFeatureToggle$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass4 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ Boolean $defaultValue;
        final /* synthetic */ Preferences $preferences;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Preferences preferences, String str, Boolean bool) {
            super(0);
            this.$preferences = preferences;
            this.$cacheKey = str;
            this.$defaultValue = bool;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Boolean booleanOrNull = this.$preferences.getBooleanOrNull(this.$cacheKey);
            return booleanOrNull == null ? this.$defaultValue : booleanOrNull;
        }
    }

    /* compiled from: ConfigFeatureToggle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.toggle.ConfigFeatureToggle$5", f = "ConfigFeatureToggle.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.toggle.ConfigFeatureToggle$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Boolean $defaultValue;
        final /* synthetic */ Boolean $errorValue;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Boolean bool, Boolean bool2, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$errorValue = bool;
            this.$defaultValue = bool2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$errorValue, this.$defaultValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ConfigFeatureToggle.this.state.emit(ConfigFeatureToggle.this.restore.invoke(), this) == coroutine_suspended) {
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
            if (ConfigFeatureToggle.this.appConfigLocalDataSource.getConfigStateFlow().collect(new AnonymousClass1(this.$errorValue, ConfigFeatureToggle.this, this.$defaultValue), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ConfigFeatureToggle.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/domain/config/ConfigState;", "emit", "(Lcom/ifriend/domain/config/ConfigState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.data.toggle.ConfigFeatureToggle$5$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ Boolean $defaultValue;
            final /* synthetic */ Boolean $errorValue;
            final /* synthetic */ ConfigFeatureToggle this$0;

            AnonymousClass1(Boolean bool, ConfigFeatureToggle configFeatureToggle, Boolean bool2) {
                this.$errorValue = bool;
                this.this$0 = configFeatureToggle;
                this.$defaultValue = bool2;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(ConfigState configState, Continuation<? super Unit> continuation) {
                ConfigFeatureToggle$5$1$emit$1 configFeatureToggle$5$1$emit$1;
                int i;
                AnonymousClass1<T> anonymousClass1;
                Boolean bool;
                if (continuation instanceof ConfigFeatureToggle$5$1$emit$1) {
                    configFeatureToggle$5$1$emit$1 = (ConfigFeatureToggle$5$1$emit$1) continuation;
                    if ((configFeatureToggle$5$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                        configFeatureToggle$5$1$emit$1.label -= Integer.MIN_VALUE;
                        Object obj = configFeatureToggle$5$1$emit$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = configFeatureToggle$5$1$emit$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            if (configState instanceof ConfigState.Error) {
                                if (this.$errorValue != null) {
                                    this.this$0.cache.invoke(this.$errorValue);
                                }
                                MutableStateFlow mutableStateFlow = this.this$0.state;
                                Boolean bool2 = this.$errorValue;
                                configFeatureToggle$5$1$emit$1.label = 1;
                                if (mutableStateFlow.emit(bool2, configFeatureToggle$5$1$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            } else if (!(configState instanceof ConfigState.Loading)) {
                                AppConfigLocalDataSource appConfigLocalDataSource = this.this$0.appConfigLocalDataSource;
                                String str = this.this$0.featureName;
                                configFeatureToggle$5$1$emit$1.L$0 = this;
                                configFeatureToggle$5$1$emit$1.label = 3;
                                obj = appConfigLocalDataSource.isFeatureEnabled(str, configFeatureToggle$5$1$emit$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                anonymousClass1 = this;
                                bool = (Boolean) obj;
                                if (bool == null) {
                                }
                            } else {
                                if (this.$defaultValue != null) {
                                    this.this$0.cache.invoke(this.$defaultValue);
                                }
                                MutableStateFlow mutableStateFlow2 = this.this$0.state;
                                Boolean bool3 = this.$defaultValue;
                                configFeatureToggle$5$1$emit$1.label = 2;
                                if (mutableStateFlow2.emit(bool3, configFeatureToggle$5$1$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                        } else if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        } else if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        } else if (i == 3) {
                            anonymousClass1 = (AnonymousClass1) configFeatureToggle$5$1$emit$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            bool = (Boolean) obj;
                            if (bool == null) {
                                boolean booleanValue = bool.booleanValue();
                                anonymousClass1.this$0.cache.invoke(Boxing.boxBoolean(booleanValue));
                                MutableStateFlow mutableStateFlow3 = anonymousClass1.this$0.state;
                                Boolean boxBoolean = Boxing.boxBoolean(booleanValue);
                                configFeatureToggle$5$1$emit$1.L$0 = null;
                                configFeatureToggle$5$1$emit$1.label = 4;
                                if (mutableStateFlow3.emit(boxBoolean, configFeatureToggle$5$1$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                return Unit.INSTANCE;
                            }
                        } else if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }
                configFeatureToggle$5$1$emit$1 = new ConfigFeatureToggle$5$1$emit$1(this, continuation);
                Object obj2 = configFeatureToggle$5$1$emit$1.result;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = configFeatureToggle$5$1$emit$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((ConfigState) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    static /* synthetic */ Object isEnabled$suspendImpl(ConfigFeatureToggle configFeatureToggle, Continuation<? super StateFlow<Boolean>> continuation) {
        return FlowKt.stateIn(FlowKt.filterNotNull(configFeatureToggle.state), configFeatureToggle.coroutineScope, continuation);
    }

    public final Boolean isEnabledValue() {
        return this.state.getValue();
    }

    static /* synthetic */ Object isEnabledCachedValue$suspendImpl(ConfigFeatureToggle configFeatureToggle, Continuation<? super Boolean> continuation) {
        return configFeatureToggle.restore.invoke();
    }
}
