package com.ifriend.domain.useCases.diary;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.models.diary.DiaryNote;
import com.ifriend.domain.models.profile.user.Subscription;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.useCases.diary.DiaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1", f = "DiaryNotesService.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DiaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Resource<List<? extends DiaryNote>>>, Subscription, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $refresh$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ DiaryNotesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1(Continuation continuation, DiaryNotesService diaryNotesService, boolean z) {
        super(3, continuation);
        this.this$0 = diaryNotesService;
        this.$refresh$inlined = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Resource<List<? extends DiaryNote>>> flowCollector, Subscription subscription, Continuation<? super Unit> continuation) {
        DiaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1 diaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1 = new DiaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1(continuation, this.this$0, this.$refresh$inlined);
        diaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1.L$0 = flowCollector;
        diaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1.L$1 = subscription;
        return diaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Subscription subscription;
        DiaryRepository diaryRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            DiaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1 diaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1 = this;
            Subscription subscription2 = (Subscription) this.L$1;
            subscription = this.this$0.lastUserSubscription;
            boolean z = subscription != subscription2 || this.$refresh$inlined;
            this.this$0.lastUserSubscription = subscription2;
            diaryRepository = this.this$0.repository;
            Flow<Resource<List<DiaryNote>>> diaryNotes = diaryRepository.getDiaryNotes(z);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, diaryNotes, diaryNotesService$getAllNotes$lambda$3$lambda$2$$inlined$flatMapLatest$1) == coroutine_suspended) {
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
