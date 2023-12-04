package com.ifriend.domain.data.generateAvatar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AvatarInfoStorage.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/data/generateAvatar/AvatarInfoStorage;", "", "getCurrentInfo", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/domain/data/generateAvatar/AvatarInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCurrentInfo", "", "avatarInfo", "(Lcom/ifriend/domain/data/generateAvatar/AvatarInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AvatarInfoStorage {
    Object getCurrentInfo(Continuation<? super StateFlow<AvatarInfo>> continuation);

    Object setCurrentInfo(AvatarInfo avatarInfo, Continuation<? super Unit> continuation);
}
