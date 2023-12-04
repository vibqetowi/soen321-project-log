package com.ifriend.data.storages.avatar;

import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.generateAvatar.AvatarInfo;
import com.ifriend.domain.data.generateAvatar.AvatarInfoStorage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: AvatarInfoStorageImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ifriend/data/storages/avatar/AvatarInfoStorageImpl;", "Lcom/ifriend/domain/data/generateAvatar/AvatarInfoStorage;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/domain/data/Preferences;)V", "avatarInfo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/data/generateAvatar/AvatarInfo;", "getCurrentInfo", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCurrentInfo", "", "(Lcom/ifriend/domain/data/generateAvatar/AvatarInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePreferences", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarInfoStorageImpl implements AvatarInfoStorage {
    private static final String AVATAR_INFO_ANIMATION = "avatarInfoAnimation";
    private static final String AVATAR_INFO_IMAGE = "avatarInfoImage";
    public static final Companion Companion = new Companion(null);
    private final MutableStateFlow<AvatarInfo> avatarInfo;
    private final Preferences preferences;

    public AvatarInfoStorageImpl(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
        this.avatarInfo = StateFlowKt.MutableStateFlow(new AvatarInfo(preferences.getStringWithKey(AVATAR_INFO_IMAGE), preferences.getStringWithKey(AVATAR_INFO_ANIMATION)));
    }

    /* compiled from: AvatarInfoStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/data/storages/avatar/AvatarInfoStorageImpl$Companion;", "", "()V", "AVATAR_INFO_ANIMATION", "", "AVATAR_INFO_IMAGE", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.domain.data.generateAvatar.AvatarInfoStorage
    public Object getCurrentInfo(Continuation<? super StateFlow<AvatarInfo>> continuation) {
        return this.avatarInfo;
    }

    @Override // com.ifriend.domain.data.generateAvatar.AvatarInfoStorage
    public Object setCurrentInfo(AvatarInfo avatarInfo, Continuation<? super Unit> continuation) {
        updatePreferences(avatarInfo);
        Object emit = this.avatarInfo.emit(avatarInfo, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    private final void updatePreferences(AvatarInfo avatarInfo) {
        this.preferences.saveStringWithKey(AVATAR_INFO_IMAGE, avatarInfo.getImageId());
        this.preferences.saveStringWithKey(AVATAR_INFO_ANIMATION, avatarInfo.getAnimationId());
    }
}
