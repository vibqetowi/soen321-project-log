package com.ifriend.data.repository.update;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.domain.data.update.InAppUpdateRepository;
import com.ifriend.platform.tools.api.AppInfoProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: InAppUpdateRepositoryImpl.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0011\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/data/repository/update/InAppUpdateRepositoryImpl;", "Lcom/ifriend/domain/data/update/InAppUpdateRepository;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "appInfoProvider", "Lcom/ifriend/platform/tools/api/AppInfoProvider;", "(Landroidx/datastore/core/DataStore;Lcom/ifriend/platform/tools/api/AppInfoProvider;)V", "getDismissCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastDismissTimestamp", "", "incDismissCount", "", "refresh", "setLastDismissTimestamp", AnalyticsConstants.TIMESTAMP, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppUpdateRepositoryImpl implements InAppUpdateRepository {
    private final AppInfoProvider appInfoProvider;
    private final DataStore<Preferences> dataStore;
    public static final Companion Companion = new Companion(null);
    private static final Preferences.Key<Long> KEY_LAST_VERSION_CODE = PreferencesKeys.longKey("app_update_last_version_code");
    private static final Preferences.Key<Integer> KEY_DISMISS_COUNT = PreferencesKeys.intKey("app_update_dismiss_count");
    private static final Preferences.Key<Long> KEY_LAST_DISMISS_TIMESTAMP = PreferencesKeys.longKey("app_update_last_dismiss_timestamp");

    @Inject
    public InAppUpdateRepositoryImpl(DataStore<Preferences> dataStore, AppInfoProvider appInfoProvider) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(appInfoProvider, "appInfoProvider");
        this.dataStore = dataStore;
        this.appInfoProvider = appInfoProvider;
    }

    /* compiled from: InAppUpdateRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/data/repository/update/InAppUpdateRepositoryImpl$Companion;", "", "()V", "KEY_DISMISS_COUNT", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "KEY_LAST_DISMISS_TIMESTAMP", "", "KEY_LAST_VERSION_CODE", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    @Override // com.ifriend.domain.data.update.InAppUpdateRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object refresh(Continuation<? super Unit> continuation) {
        InAppUpdateRepositoryImpl$refresh$1 inAppUpdateRepositoryImpl$refresh$1;
        int i;
        InAppUpdateRepositoryImpl inAppUpdateRepositoryImpl;
        long j;
        Long l;
        if (continuation instanceof InAppUpdateRepositoryImpl$refresh$1) {
            inAppUpdateRepositoryImpl$refresh$1 = (InAppUpdateRepositoryImpl$refresh$1) continuation;
            if ((inAppUpdateRepositoryImpl$refresh$1.label & Integer.MIN_VALUE) != 0) {
                inAppUpdateRepositoryImpl$refresh$1.label -= Integer.MIN_VALUE;
                Object obj = inAppUpdateRepositoryImpl$refresh$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppUpdateRepositoryImpl$refresh$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long versionCode = this.appInfoProvider.getVersionCode();
                    final Flow<Preferences> data = this.dataStore.getData();
                    inAppUpdateRepositoryImpl$refresh$1.L$0 = this;
                    inAppUpdateRepositoryImpl$refresh$1.J$0 = versionCode;
                    inAppUpdateRepositoryImpl$refresh$1.label = 1;
                    obj = FlowKt.firstOrNull(new Flow<Long>() { // from class: com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$refresh$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Long> flowCollector, Continuation continuation2) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$refresh$$inlined$map$1$2  reason: invalid class name */
                        /* loaded from: classes6.dex */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* compiled from: Emitters.kt */
                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            @DebugMetadata(c = "com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$refresh$$inlined$map$1$2", f = "InAppUpdateRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            /* renamed from: com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$refresh$$inlined$map$1$2$1  reason: invalid class name */
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

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                            /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                Preferences.Key<T> key;
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
                                            key = InAppUpdateRepositoryImpl.KEY_LAST_VERSION_CODE;
                                            Object obj3 = ((Preferences) obj).get(key);
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
                    }, inAppUpdateRepositoryImpl$refresh$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    inAppUpdateRepositoryImpl = this;
                    j = versionCode;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    j = inAppUpdateRepositoryImpl$refresh$1.J$0;
                    inAppUpdateRepositoryImpl = (InAppUpdateRepositoryImpl) inAppUpdateRepositoryImpl$refresh$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                l = (Long) obj;
                if ((l == null ? l.longValue() : j) >= j) {
                    inAppUpdateRepositoryImpl$refresh$1.L$0 = null;
                    inAppUpdateRepositoryImpl$refresh$1.label = 2;
                    if (PreferencesKt.edit(inAppUpdateRepositoryImpl.dataStore, new InAppUpdateRepositoryImpl$refresh$2(j, null), inAppUpdateRepositoryImpl$refresh$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        inAppUpdateRepositoryImpl$refresh$1 = new InAppUpdateRepositoryImpl$refresh$1(this, continuation);
        Object obj2 = inAppUpdateRepositoryImpl$refresh$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppUpdateRepositoryImpl$refresh$1.label;
        if (i != 0) {
        }
        l = (Long) obj2;
        if ((l == null ? l.longValue() : j) >= j) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // com.ifriend.domain.data.update.InAppUpdateRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getDismissCount(Continuation<? super Integer> continuation) {
        InAppUpdateRepositoryImpl$getDismissCount$1 inAppUpdateRepositoryImpl$getDismissCount$1;
        int i;
        if (continuation instanceof InAppUpdateRepositoryImpl$getDismissCount$1) {
            inAppUpdateRepositoryImpl$getDismissCount$1 = (InAppUpdateRepositoryImpl$getDismissCount$1) continuation;
            if ((inAppUpdateRepositoryImpl$getDismissCount$1.label & Integer.MIN_VALUE) != 0) {
                inAppUpdateRepositoryImpl$getDismissCount$1.label -= Integer.MIN_VALUE;
                Object obj = inAppUpdateRepositoryImpl$getDismissCount$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppUpdateRepositoryImpl$getDismissCount$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Preferences> data = this.dataStore.getData();
                    inAppUpdateRepositoryImpl$getDismissCount$1.label = 1;
                    obj = FlowKt.firstOrNull(new Flow<Integer>() { // from class: com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$getDismissCount$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation2) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$getDismissCount$$inlined$map$1$2  reason: invalid class name */
                        /* loaded from: classes6.dex */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* compiled from: Emitters.kt */
                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            @DebugMetadata(c = "com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$getDismissCount$$inlined$map$1$2", f = "InAppUpdateRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            /* renamed from: com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$getDismissCount$$inlined$map$1$2$1  reason: invalid class name */
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

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                            /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                Preferences.Key<T> key;
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
                                            key = InAppUpdateRepositoryImpl.KEY_DISMISS_COUNT;
                                            Object obj3 = ((Preferences) obj).get(key);
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
                    }, inAppUpdateRepositoryImpl$getDismissCount$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                Integer num = (Integer) obj;
                return Boxing.boxInt(num == null ? num.intValue() : 0);
            }
        }
        inAppUpdateRepositoryImpl$getDismissCount$1 = new InAppUpdateRepositoryImpl$getDismissCount$1(this, continuation);
        Object obj2 = inAppUpdateRepositoryImpl$getDismissCount$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppUpdateRepositoryImpl$getDismissCount$1.label;
        if (i != 0) {
        }
        Integer num2 = (Integer) obj2;
        return Boxing.boxInt(num2 == null ? num2.intValue() : 0);
    }

    @Override // com.ifriend.domain.data.update.InAppUpdateRepository
    public Object incDismissCount(Continuation<? super Unit> continuation) {
        Object edit = PreferencesKt.edit(this.dataStore, new InAppUpdateRepositoryImpl$incDismissCount$2(null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.update.InAppUpdateRepository
    public Object getLastDismissTimestamp(Continuation<? super Long> continuation) {
        final Flow<Preferences> data = this.dataStore.getData();
        return FlowKt.firstOrNull(new Flow<Long>() { // from class: com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$getLastDismissTimestamp$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Long> flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$getLastDismissTimestamp$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$getLastDismissTimestamp$$inlined$map$1$2", f = "InAppUpdateRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$getLastDismissTimestamp$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    Preferences.Key<T> key;
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
                                key = InAppUpdateRepositoryImpl.KEY_LAST_DISMISS_TIMESTAMP;
                                Object obj3 = ((Preferences) obj).get(key);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
        }, continuation);
    }

    @Override // com.ifriend.domain.data.update.InAppUpdateRepository
    public Object setLastDismissTimestamp(long j, Continuation<? super Unit> continuation) {
        Object edit = PreferencesKt.edit(this.dataStore, new InAppUpdateRepositoryImpl$setLastDismissTimestamp$2(j, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }
}
