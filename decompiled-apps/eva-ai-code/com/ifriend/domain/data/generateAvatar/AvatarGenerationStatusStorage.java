package com.ifriend.domain.data.generateAvatar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AvatarGenerationStatusStorage.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H&J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatusStorage;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatus", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatus;", "setStatus", "avatarGenerationStatus", "(Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AvatarGenerationStatusStorage {
    Object clear(Continuation<? super Unit> continuation);

    StateFlow<AvatarGenerationStatus> getStatus();

    Object setStatus(AvatarGenerationStatus avatarGenerationStatus, Continuation<? super Unit> continuation);
}
