package com.ifriend.data.networking.api;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebaseApiRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.networking.api.FirebaseApiRepositoryImpl", f = "FirebaseApiRepositoryImpl.kt", i = {0, 0}, l = {TsExtractor.TS_SYNC_BYTE, 73}, m = "clearBadges", n = {"this", "userId"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class FirebaseApiRepositoryImpl$clearBadges$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseApiRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseApiRepositoryImpl$clearBadges$1(FirebaseApiRepositoryImpl firebaseApiRepositoryImpl, Continuation<? super FirebaseApiRepositoryImpl$clearBadges$1> continuation) {
        super(continuation);
        this.this$0 = firebaseApiRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clearBadges(null, this);
    }
}
