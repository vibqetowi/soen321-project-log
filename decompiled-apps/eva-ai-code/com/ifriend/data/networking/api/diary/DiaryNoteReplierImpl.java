package com.ifriend.data.networking.api.diary;

import com.ifriend.domain.useCases.diary.DiaryNoteReplier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import retrofit2.Response;
/* compiled from: DiaryNoteReplierImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\bH\u0016J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ifriend/data/networking/api/diary/DiaryNoteReplierImpl;", "Lcom/ifriend/domain/useCases/diary/DiaryNoteReplier;", "diaryApiDelegate", "Lcom/ifriend/data/networking/api/diary/DiaryApiDelegate;", "(Lcom/ifriend/data/networking/api/diary/DiaryApiDelegate;)V", "replies", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lkotlinx/coroutines/flow/Flow;", "reply", "", "noteId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryNoteReplierImpl implements DiaryNoteReplier {
    private final DiaryApiDelegate diaryApiDelegate;
    private final MutableSharedFlow<String> replies;

    public DiaryNoteReplierImpl(DiaryApiDelegate diaryApiDelegate) {
        Intrinsics.checkNotNullParameter(diaryApiDelegate, "diaryApiDelegate");
        this.diaryApiDelegate = diaryApiDelegate;
        this.replies = SharedFlowKt.MutableSharedFlow(1, 1, BufferOverflow.DROP_OLDEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    @Override // com.ifriend.domain.useCases.diary.DiaryNoteReplier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object reply(String str, Continuation<? super Boolean> continuation) {
        DiaryNoteReplierImpl$reply$1 diaryNoteReplierImpl$reply$1;
        int i;
        DiaryNoteReplierImpl diaryNoteReplierImpl;
        boolean isSuccessful;
        boolean z;
        if (continuation instanceof DiaryNoteReplierImpl$reply$1) {
            diaryNoteReplierImpl$reply$1 = (DiaryNoteReplierImpl$reply$1) continuation;
            if ((diaryNoteReplierImpl$reply$1.label & Integer.MIN_VALUE) != 0) {
                diaryNoteReplierImpl$reply$1.label -= Integer.MIN_VALUE;
                Object obj = diaryNoteReplierImpl$reply$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = diaryNoteReplierImpl$reply$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DiaryApiDelegate diaryApiDelegate = this.diaryApiDelegate;
                    diaryNoteReplierImpl$reply$1.L$0 = this;
                    diaryNoteReplierImpl$reply$1.L$1 = str;
                    diaryNoteReplierImpl$reply$1.label = 1;
                    obj = diaryApiDelegate.reply(str, diaryNoteReplierImpl$reply$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    diaryNoteReplierImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        z = diaryNoteReplierImpl$reply$1.Z$0;
                        ResultKt.throwOnFailure(obj);
                        isSuccessful = z;
                        return Boxing.boxBoolean(isSuccessful);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) diaryNoteReplierImpl$reply$1.L$1;
                    diaryNoteReplierImpl = (DiaryNoteReplierImpl) diaryNoteReplierImpl$reply$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                isSuccessful = ((Response) obj).isSuccessful();
                if (isSuccessful) {
                    MutableSharedFlow<String> mutableSharedFlow = diaryNoteReplierImpl.replies;
                    diaryNoteReplierImpl$reply$1.L$0 = null;
                    diaryNoteReplierImpl$reply$1.L$1 = null;
                    diaryNoteReplierImpl$reply$1.Z$0 = isSuccessful;
                    diaryNoteReplierImpl$reply$1.label = 2;
                    if (mutableSharedFlow.emit(str, diaryNoteReplierImpl$reply$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = isSuccessful;
                    isSuccessful = z;
                }
                return Boxing.boxBoolean(isSuccessful);
            }
        }
        diaryNoteReplierImpl$reply$1 = new DiaryNoteReplierImpl$reply$1(this, continuation);
        Object obj2 = diaryNoteReplierImpl$reply$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = diaryNoteReplierImpl$reply$1.label;
        if (i != 0) {
        }
        isSuccessful = ((Response) obj2).isSuccessful();
        if (isSuccessful) {
        }
        return Boxing.boxBoolean(isSuccessful);
    }

    @Override // com.ifriend.domain.useCases.diary.DiaryNoteReplier
    public Flow<String> replies() {
        return this.replies;
    }
}
