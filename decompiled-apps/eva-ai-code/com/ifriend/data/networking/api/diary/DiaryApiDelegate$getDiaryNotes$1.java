package com.ifriend.data.networking.api.diary;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DiaryApiDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.networking.api.diary.DiaryApiDelegate", f = "DiaryApiDelegate.kt", i = {}, l = {19}, m = "getDiaryNotes", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DiaryApiDelegate$getDiaryNotes$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DiaryApiDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryApiDelegate$getDiaryNotes$1(DiaryApiDelegate diaryApiDelegate, Continuation<? super DiaryApiDelegate$getDiaryNotes$1> continuation) {
        super(continuation);
        this.this$0 = diaryApiDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getDiaryNotes(this);
    }
}
