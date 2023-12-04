package com.ifriend.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DiaryRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl", f = "DiaryRepositoryImpl.kt", i = {0}, l = {77}, m = "refreshAllNotes", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class DiaryRepositoryImpl$refreshAllNotes$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DiaryRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryRepositoryImpl$refreshAllNotes$1(DiaryRepositoryImpl diaryRepositoryImpl, Continuation<? super DiaryRepositoryImpl$refreshAllNotes$1> continuation) {
        super(continuation);
        this.this$0 = diaryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refreshAllNotes(this);
    }
}
