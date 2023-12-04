package com.ifriend.domain.useCases.diary;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReplyDiaryNoteUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.useCases.diary.ReplyDiaryNoteUseCase", f = "ReplyDiaryNoteUseCase.kt", i = {0, 0, 1}, l = {11, 12}, m = "reply", n = {"this", "note", "result"}, s = {"L$0", "L$1", "Z$0"})
/* loaded from: classes6.dex */
public final class ReplyDiaryNoteUseCase$reply$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReplyDiaryNoteUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplyDiaryNoteUseCase$reply$1(ReplyDiaryNoteUseCase replyDiaryNoteUseCase, Continuation<? super ReplyDiaryNoteUseCase$reply$1> continuation) {
        super(continuation);
        this.this$0 = replyDiaryNoteUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.reply(null, this);
    }
}
