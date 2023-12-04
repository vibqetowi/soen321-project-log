package com.ifriend.domain.useCases.diary;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.diary.DiaryMode;
import com.ifriend.domain.models.diary.DiaryNote;
import com.ifriend.domain.models.profile.user.Subscription;
import com.ifriend.domain.models.profile.user.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.useCases.diary.DiaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1", f = "DiaryNotesService.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DiaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Resource<List<? extends DiaryNote>>>, DiaryMode, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $refresh$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ DiaryNotesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1(Continuation continuation, DiaryNotesService diaryNotesService, boolean z) {
        super(3, continuation);
        this.this$0 = diaryNotesService;
        this.$refresh$inlined = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Resource<List<? extends DiaryNote>>> flowCollector, DiaryMode diaryMode, Continuation<? super Unit> continuation) {
        DiaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1 diaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1 = new DiaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1(continuation, this.this$0, this.$refresh$inlined);
        diaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1.L$0 = flowCollector;
        diaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1.L$1 = diaryMode;
        return diaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserRepository userRepository;
        Flow transformLatest;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            DiaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1 diaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1 = this;
            if (((DiaryMode) this.L$1) != DiaryMode.HIDE) {
                userRepository = this.this$0.userRepository;
                final Flow<User> user = userRepository.getUser();
                transformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Subscription>() { // from class: com.ifriend.domain.useCases.diary.DiaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Subscription> flowCollector2, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector2), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.domain.useCases.diary.DiaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.domain.useCases.diary.DiaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$map$1$2", f = "DiaryNotesService.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.domain.useCases.diary.DiaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$map$1$2$1  reason: invalid class name */
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
                                        User user = (User) obj;
                                        Subscription subscription = user != null ? user.getSubscription() : null;
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(subscription, anonymousClass1) == coroutine_suspended) {
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
                }), new DiaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1(null, this.this$0, this.$refresh$inlined));
            } else {
                transformLatest = FlowKt.flowOf(new Resource.Success(CollectionsKt.emptyList()));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, transformLatest, diaryNotesService$getAllNotes$lambda$3$$inlined$flatMapLatest$1) == coroutine_suspended) {
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
