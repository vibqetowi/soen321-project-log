package com.ifriend.data.repository;

import com.ifriend.domain.data.AudioMessageRepository;
import com.ifriend.domain.data.Preferences;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: AudioMessageRepositoryImpl.kt */
@Deprecated(message = "Use DecodedAudioMessagesRepositoryImpl")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016R6\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006j\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ifriend/data/repository/AudioMessageRepositoryImpl;", "Lcom/ifriend/domain/data/AudioMessageRepository;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/domain/data/Preferences;)V", "audioMessageTextShowed", "Ljava/util/HashMap;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/collections/HashMap;", "addIdToStorage", "", "key", "value", "addToMap", "id", "isMessageExpanded", "isAudioMessageTextShowed", "Lkotlinx/coroutines/flow/StateFlow;", "isAudioPopUpShowed", "setAudioMessageTextShowed", "setAudioPopUpShowed", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioMessageRepositoryImpl implements AudioMessageRepository {
    @Deprecated
    public static final String AUDIO_EXPANDED = "audioExpanded";
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String POPUP_SHOWED = "popupShowed";
    private final HashMap<String, MutableStateFlow<Boolean>> audioMessageTextShowed;
    private final Preferences preferences;

    public AudioMessageRepositoryImpl(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
        this.audioMessageTextShowed = new HashMap<>();
    }

    @Override // com.ifriend.domain.data.AudioMessageRepository
    public void setAudioMessageTextShowed(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        addIdToStorage("audioExpanded", id);
        addToMap(id, true);
    }

    @Override // com.ifriend.domain.data.AudioMessageRepository
    public StateFlow<Boolean> isAudioMessageTextShowed(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        addToMap(id, this.preferences.getStringSetWithKey("audioExpanded").contains(id));
        MutableStateFlow<Boolean> mutableStateFlow = this.audioMessageTextShowed.get(id);
        if (mutableStateFlow == null) {
            mutableStateFlow = StateFlowKt.MutableStateFlow(false);
        }
        return mutableStateFlow;
    }

    private final void addToMap(String str, boolean z) {
        if (!this.audioMessageTextShowed.containsKey(str)) {
            this.audioMessageTextShowed.put(str, StateFlowKt.MutableStateFlow(Boolean.valueOf(z)));
            return;
        }
        MutableStateFlow<Boolean> mutableStateFlow = this.audioMessageTextShowed.get(str);
        if (mutableStateFlow != null) {
            mutableStateFlow.tryEmit(Boolean.valueOf(z));
        }
    }

    private final void addIdToStorage(String str, String str2) {
        this.preferences.addValueToStringSetWithKey(str, str2);
    }

    @Override // com.ifriend.domain.data.AudioMessageRepository
    public boolean isAudioPopUpShowed() {
        return this.preferences.getBooleanWithKey(POPUP_SHOWED, false);
    }

    @Override // com.ifriend.domain.data.AudioMessageRepository
    public void setAudioPopUpShowed() {
        this.preferences.saveBooleanWithKey(POPUP_SHOWED, true);
    }

    /* compiled from: AudioMessageRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/data/repository/AudioMessageRepositoryImpl$Companion;", "", "()V", "AUDIO_EXPANDED", "", "POPUP_SHOWED", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
