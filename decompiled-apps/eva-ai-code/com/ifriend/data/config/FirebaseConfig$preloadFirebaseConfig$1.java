package com.ifriend.data.config;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebaseConfig.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.config.FirebaseConfig", f = "FirebaseConfig.kt", i = {0}, l = {47, 48}, m = "preloadFirebaseConfig", n = {"remoteConfig"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class FirebaseConfig$preloadFirebaseConfig$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseConfig this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseConfig$preloadFirebaseConfig$1(FirebaseConfig firebaseConfig, Continuation<? super FirebaseConfig$preloadFirebaseConfig$1> continuation) {
        super(continuation);
        this.this$0 = firebaseConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object preloadFirebaseConfig;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        preloadFirebaseConfig = this.this$0.preloadFirebaseConfig(null, this);
        return preloadFirebaseConfig;
    }
}
