package com.ifriend.domain.useCases.diary;

import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.models.diary.DiaryNote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ReplyDiaryNoteUseCase.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/useCases/diary/ReplyDiaryNoteUseCase;", "", "replier", "Lcom/ifriend/domain/useCases/diary/DiaryNoteReplier;", "repository", "Lcom/ifriend/domain/data/diary/DiaryRepository;", "(Lcom/ifriend/domain/useCases/diary/DiaryNoteReplier;Lcom/ifriend/domain/data/diary/DiaryRepository;)V", "reply", "", "note", "Lcom/ifriend/domain/models/diary/DiaryNote;", "(Lcom/ifriend/domain/models/diary/DiaryNote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReplyDiaryNoteUseCase {
    private final DiaryNoteReplier replier;
    private final DiaryRepository repository;

    public ReplyDiaryNoteUseCase(DiaryNoteReplier replier, DiaryRepository repository) {
        Intrinsics.checkNotNullParameter(replier, "replier");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.replier = replier;
        this.repository = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reply(DiaryNote diaryNote, Continuation<? super Boolean> continuation) {
        ReplyDiaryNoteUseCase$reply$1 replyDiaryNoteUseCase$reply$1;
        Object coroutine_suspended;
        int i;
        ReplyDiaryNoteUseCase replyDiaryNoteUseCase;
        DiaryRepository diaryRepository;
        String id;
        boolean z;
        if (continuation instanceof ReplyDiaryNoteUseCase$reply$1) {
            replyDiaryNoteUseCase$reply$1 = (ReplyDiaryNoteUseCase$reply$1) continuation;
            if ((replyDiaryNoteUseCase$reply$1.label & Integer.MIN_VALUE) != 0) {
                replyDiaryNoteUseCase$reply$1.label -= Integer.MIN_VALUE;
                Object obj = replyDiaryNoteUseCase$reply$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = replyDiaryNoteUseCase$reply$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DiaryNoteReplier diaryNoteReplier = this.replier;
                    String id2 = diaryNote.getId();
                    replyDiaryNoteUseCase$reply$1.L$0 = this;
                    replyDiaryNoteUseCase$reply$1.L$1 = diaryNote;
                    replyDiaryNoteUseCase$reply$1.label = 1;
                    obj = diaryNoteReplier.reply(id2, replyDiaryNoteUseCase$reply$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    replyDiaryNoteUseCase = this;
                } else if (i != 1) {
                    if (i == 2) {
                        z = replyDiaryNoteUseCase$reply$1.Z$0;
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(z);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    diaryNote = (DiaryNote) replyDiaryNoteUseCase$reply$1.L$1;
                    replyDiaryNoteUseCase = (ReplyDiaryNoteUseCase) replyDiaryNoteUseCase$reply$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                diaryRepository = replyDiaryNoteUseCase.repository;
                id = diaryNote.getId();
                replyDiaryNoteUseCase$reply$1.L$0 = null;
                replyDiaryNoteUseCase$reply$1.L$1 = null;
                replyDiaryNoteUseCase$reply$1.Z$0 = booleanValue;
                replyDiaryNoteUseCase$reply$1.label = 2;
                if (diaryRepository.refreshDiaryNote(id, replyDiaryNoteUseCase$reply$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = booleanValue;
                return Boxing.boxBoolean(z);
            }
        }
        replyDiaryNoteUseCase$reply$1 = new ReplyDiaryNoteUseCase$reply$1(this, continuation);
        Object obj2 = replyDiaryNoteUseCase$reply$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = replyDiaryNoteUseCase$reply$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        diaryRepository = replyDiaryNoteUseCase.repository;
        id = diaryNote.getId();
        replyDiaryNoteUseCase$reply$1.L$0 = null;
        replyDiaryNoteUseCase$reply$1.L$1 = null;
        replyDiaryNoteUseCase$reply$1.Z$0 = booleanValue2;
        replyDiaryNoteUseCase$reply$1.label = 2;
        if (diaryRepository.refreshDiaryNote(id, replyDiaryNoteUseCase$reply$1) != coroutine_suspended) {
        }
    }
}
