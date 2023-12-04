package com.ifriend.core.local.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
/* compiled from: AuthLocalDataSource.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ifriend/core/local/api/AuthLocalDataSource;", "", "getFormattedUserToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserEmail", "getUserId", "getUserToken", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AuthLocalDataSource {
    Object getFormattedUserToken(Continuation<? super String> continuation);

    Object getUserEmail(Continuation<? super String> continuation);

    Object getUserId(Continuation<? super String> continuation);

    Object getUserToken(Continuation<? super String> continuation);
}
