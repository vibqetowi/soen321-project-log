package com.ifriend.data.repository;

import com.ifriend.domain.data.DecodedAudioMessagesRepository;
import com.ifriend.domain.data.Preferences;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioMessageRepositoryImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0002J\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/data/repository/DecodedAudioMessagesRepositoryImpl;", "Lcom/ifriend/domain/data/DecodedAudioMessagesRepository;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/domain/data/Preferences;)V", "audioMessageTextShowed", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "addIdToStorage", "", "value", "addToMap", "id", "isMessageExpanded", "getIdsFromStorage", "", "isAudioMessageTextShowed", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAudioMessageTextShowed", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DecodedAudioMessagesRepositoryImpl implements DecodedAudioMessagesRepository {
    @Deprecated
    public static final String AUDIO_EXPANDED = "audioExpanded";
    private static final Companion Companion = new Companion(null);
    private final HashMap<String, Boolean> audioMessageTextShowed;
    private final Preferences preferences;

    public DecodedAudioMessagesRepositoryImpl(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
        this.audioMessageTextShowed = new HashMap<>();
    }

    @Override // com.ifriend.domain.data.DecodedAudioMessagesRepository
    public Object setAudioMessageTextShowed(String str, Continuation<? super Unit> continuation) {
        addIdToStorage(str);
        addToMap(str, true);
        return Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.DecodedAudioMessagesRepository
    public Object isAudioMessageTextShowed(String str, Continuation<? super Boolean> continuation) {
        addToMap(str, getIdsFromStorage().contains(str));
        Boolean bool = this.audioMessageTextShowed.get(str);
        return Boxing.boxBoolean(bool == null ? false : bool.booleanValue());
    }

    private final void addToMap(String str, boolean z) {
        this.audioMessageTextShowed.put(str, Boolean.valueOf(z));
    }

    private final void addIdToStorage(String str) {
        this.preferences.addValueToStringSetWithKey("audioExpanded", str);
    }

    private final Set<String> getIdsFromStorage() {
        return this.preferences.getStringSetWithKey("audioExpanded");
    }

    /* compiled from: AudioMessageRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/data/repository/DecodedAudioMessagesRepositoryImpl$Companion;", "", "()V", "AUDIO_EXPANDED", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
