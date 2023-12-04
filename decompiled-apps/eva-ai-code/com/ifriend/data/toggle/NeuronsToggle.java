package com.ifriend.data.toggle;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.perf.util.Constants;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.models.TagKt;
import com.ifriend.domain.toggle.FeatureToggle;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: NeuronsToggle.kt */
@Deprecated(message = "will be removed")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ifriend/data/toggle/NeuronsToggle;", "Lcom/ifriend/domain/toggle/FeatureToggle;", "tagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/domain/data/TagsProvider;Lkotlinx/coroutines/CoroutineScope;)V", Constants.ENABLE_DISABLE, "Lkotlinx/coroutines/flow/StateFlow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEnabledCachedValue", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NeuronsToggle implements FeatureToggle {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String FEATURE_V1_NAME = "ai.neurons.enabled";
    @Deprecated
    public static final String FEATURE_V2_NAME = "ai.neurons.enabled.v2";
    private final CoroutineScope coroutineScope;
    private final TagsProvider tagsProvider;

    public NeuronsToggle(TagsProvider tagsProvider, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.tagsProvider = tagsProvider;
        this.coroutineScope = coroutineScope;
    }

    /* compiled from: NeuronsToggle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/data/toggle/NeuronsToggle$Companion;", "", "()V", "FEATURE_V1_NAME", "", "FEATURE_V2_NAME", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.domain.toggle.FeatureToggle
    public Object isEnabled(Continuation<? super StateFlow<Boolean>> continuation) {
        final Flow<List<Tag>> tagsFlow = this.tagsProvider.tagsFlow();
        return FlowKt.stateIn(new Flow<Boolean>() { // from class: com.ifriend.data.toggle.NeuronsToggle$isEnabled$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.toggle.NeuronsToggle$isEnabled$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.toggle.NeuronsToggle$isEnabled$$inlined$map$1$2", f = "NeuronsToggle.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.toggle.NeuronsToggle$isEnabled$$inlined$map$1$2$1  reason: invalid class name */
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

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
                    if ((r6 != null && com.ifriend.domain.models.TagKt.contains(r6, com.ifriend.data.toggle.NeuronsToggle.FEATURE_V2_NAME)) != false) goto L30;
                 */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
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
                                List list = (List) obj;
                                boolean z = false;
                                if (!(list != null && TagKt.contains(list, NeuronsToggle.FEATURE_V1_NAME))) {
                                }
                                z = true;
                                Boolean boxBoolean = Boxing.boxBoolean(z);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
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
        }, this.coroutineScope, continuation);
    }

    @Override // com.ifriend.domain.toggle.FeatureToggle
    public Object isEnabledCachedValue(Continuation<? super Boolean> continuation) {
        throw new NotImplementedError(null, 1, null);
    }
}
