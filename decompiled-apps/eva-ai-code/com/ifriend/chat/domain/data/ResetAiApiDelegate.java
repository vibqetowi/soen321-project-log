package com.ifriend.chat.domain.data;

import com.ifriend.domain.models.profile.user.AuthData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
/* compiled from: ResetAiApiDelegate.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/domain/data/ResetAiApiDelegate;", "", "resetAll", "", "auth", "Lcom/ifriend/domain/models/profile/user/AuthData;", "(Lcom/ifriend/domain/models/profile/user/AuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetLastDay", "resetLastHour", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ResetAiApiDelegate {
    Object resetAll(AuthData authData, Continuation<? super Boolean> continuation);

    Object resetLastDay(AuthData authData, Continuation<? super Boolean> continuation);

    Object resetLastHour(AuthData authData, Continuation<? super Boolean> continuation);
}
