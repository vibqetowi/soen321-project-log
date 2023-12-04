package com.ifriend.domain;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoroutineDispatchers.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutineDispatchers$IO$2 extends Lambda implements Function0<CoroutineDispatcher> {
    public static final CoroutineDispatchers$IO$2 INSTANCE = new CoroutineDispatchers$IO$2();

    CoroutineDispatchers$IO$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CoroutineDispatcher invoke() {
        return Dispatchers.getIO();
    }
}
