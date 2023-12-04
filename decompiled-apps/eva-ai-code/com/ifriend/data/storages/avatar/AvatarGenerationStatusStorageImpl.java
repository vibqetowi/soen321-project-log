package com.ifriend.data.storages.avatar;

import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatus;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: AvatarGenerationStatusStorageImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0006\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0016J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ifriend/data/storages/avatar/AvatarGenerationStatusStorageImpl;", "Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatusStorage;", "()V", "avatarGenerationStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatus;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatus", "Lkotlinx/coroutines/flow/StateFlow;", "setStatus", "(Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarGenerationStatusStorageImpl implements AvatarGenerationStatusStorage {
    private MutableStateFlow<AvatarGenerationStatus> avatarGenerationStatus = StateFlowKt.MutableStateFlow(null);

    @Override // com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage
    public StateFlow<AvatarGenerationStatus> getStatus() {
        return this.avatarGenerationStatus;
    }

    @Override // com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage
    public Object setStatus(AvatarGenerationStatus avatarGenerationStatus, Continuation<? super Unit> continuation) {
        Object emit = this.avatarGenerationStatus.emit(avatarGenerationStatus, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage
    public Object clear(Continuation<? super Unit> continuation) {
        Object emit = this.avatarGenerationStatus.emit(null, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }
}
