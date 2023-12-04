package com.ifriend.data.storages.avatar;

import com.google.firebase.perf.util.Constants;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: AvatarAnimationEnabledStorageImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0007H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/data/storages/avatar/AvatarAnimationEnabledStorageImpl;", "Lcom/ifriend/domain/storage/AvatarAnimationEnabledStorage;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/domain/data/Preferences;)V", Constants.ENABLE_DISABLE, "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isEnabledFlow", "Lkotlinx/coroutines/flow/StateFlow;", "setEnabled", "", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarAnimationEnabledStorageImpl implements AvatarAnimationEnabledStorage {
    public static final Companion Companion = new Companion(null);
    private static final String IS_ANIMATION_ENABLED = "isAnimationEnabled";
    private final MutableStateFlow<Boolean> isEnabled;
    private final Preferences preferences;

    public AvatarAnimationEnabledStorageImpl(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
        this.isEnabled = StateFlowKt.MutableStateFlow(Boolean.valueOf(Preferences.DefaultImpls.getBooleanWithKey$default(preferences, IS_ANIMATION_ENABLED, false, 2, null)));
    }

    /* compiled from: AvatarAnimationEnabledStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/data/storages/avatar/AvatarAnimationEnabledStorageImpl$Companion;", "", "()V", "IS_ANIMATION_ENABLED", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.domain.storage.AvatarAnimationEnabledStorage
    public StateFlow<Boolean> isEnabledFlow() {
        return this.isEnabled;
    }

    @Override // com.ifriend.domain.storage.AvatarAnimationEnabledStorage
    public void setEnabled(boolean z) {
        this.preferences.saveBooleanWithKey(IS_ANIMATION_ENABLED, Boolean.valueOf(z));
        this.isEnabled.setValue(Boolean.valueOf(z));
    }
}
