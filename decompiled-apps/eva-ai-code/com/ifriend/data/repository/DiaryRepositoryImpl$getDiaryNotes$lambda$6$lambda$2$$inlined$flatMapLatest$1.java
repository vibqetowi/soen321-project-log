package com.ifriend.data.repository;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.data.networking.responses.DiaryNoteDaoModel;
import com.ifriend.data.networking.responses.DiaryNoteDaoModelKt;
import com.ifriend.domain.models.diary.DiaryNote;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.user.User;
import java.util.List;
import java.util.Set;
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
@DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1", f = "DiaryRepositoryImpl.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends DiaryNote>>, Set<? extends String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bot $bot$inlined;
    final /* synthetic */ User $user$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ DiaryRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1(Continuation continuation, DiaryRepositoryImpl diaryRepositoryImpl, User user, Bot bot) {
        super(3, continuation);
        this.this$0 = diaryRepositoryImpl;
        this.$user$inlined = user;
        this.$bot$inlined = bot;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends DiaryNote>> flowCollector, Set<? extends String> set, Continuation<? super Unit> continuation) {
        DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1 diaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1 = new DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1(continuation, this.this$0, this.$user$inlined, this.$bot$inlined);
        diaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1.L$0 = flowCollector;
        diaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1.L$1 = set;
        return diaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Set set = (Set) this.L$1;
            final Flow<List<DiaryNoteDaoModel>> diaryNotes = this.this$0.diaryDao.getDiaryNotes();
            final User user = this.$user$inlined;
            final Bot bot = this.$bot$inlined;
            Flow<List<? extends DiaryNote>> flow = new Flow<List<? extends DiaryNote>>() { // from class: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends DiaryNote>> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, user, bot, set), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$lambda$1$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ Bot $bot$inlined;
                    final /* synthetic */ Set $shownNoteIds$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ User $user$inlined;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$lambda$1$$inlined$map$1$2", f = "DiaryRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$lambda$1$$inlined$map$1$2$1  reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, User user, Bot bot, Set set) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$user$inlined = user;
                        this.$bot$inlined = bot;
                        this.$shownNoteIds$inlined = set;
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
                                    List list = (List) obj;
                                    List<DiaryNote> list2 = null;
                                    if (list != null) {
                                        User user = this.$user$inlined;
                                        String name = user != null ? user.getName() : null;
                                        if (name == null) {
                                            name = "";
                                        }
                                        Bot bot = this.$bot$inlined;
                                        String name2 = bot != null ? bot.getName() : null;
                                        list2 = DiaryNoteDaoModelKt.toDomainModels(list, name, name2 != null ? name2 : "", this.$shownNoteIds$inlined);
                                    }
                                    if (list2 == null) {
                                        list2 = CollectionsKt.emptyList();
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(list2, anonymousClass1) == coroutine_suspended) {
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
            };
            this.label = 1;
            if (FlowKt.emitAll((FlowCollector) this.L$0, flow, this) == coroutine_suspended) {
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
