package com.ifriend.data.storages.diary;

import com.ifriend.domain.data.Preferences;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: ShownDiaryNotesDaoImpl.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/storages/diary/ShownDiaryNotesDaoImpl;", "Lcom/ifriend/data/storages/diary/ShownDiaryNotesDao;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/domain/data/Preferences;)V", "initialized", "", "shownNoteIds", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "addShownIds", "", "ids", "clear", "getShownNoteIds", "Lkotlinx/coroutines/flow/Flow;", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShownDiaryNotesDaoImpl implements ShownDiaryNotesDao {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String SHOWN_NOTE_IDS_KEY = "shown_diary_note_ids";
    private boolean initialized;
    private final Preferences preferences;
    private final MutableStateFlow<Set<String>> shownNoteIds;

    public ShownDiaryNotesDaoImpl(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
        this.shownNoteIds = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
    }

    @Override // com.ifriend.data.storages.diary.ShownDiaryNotesDao
    public Flow<Set<String>> getShownNoteIds() {
        MutableStateFlow<Set<String>> mutableStateFlow;
        synchronized (this) {
            if (!this.initialized) {
                this.shownNoteIds.setValue(this.preferences.getStringSetWithKey(SHOWN_NOTE_IDS_KEY));
            }
            mutableStateFlow = this.shownNoteIds;
        }
        return mutableStateFlow;
    }

    @Override // com.ifriend.data.storages.diary.ShownDiaryNotesDao
    public void addShownIds(Set<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        synchronized (this) {
            MutableStateFlow<Set<String>> mutableStateFlow = this.shownNoteIds;
            mutableStateFlow.setValue(SetsKt.plus((Set) mutableStateFlow.getValue(), (Iterable) ids));
            this.preferences.addValuesToStringSetWithKey(SHOWN_NOTE_IDS_KEY, this.shownNoteIds.getValue());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ifriend.data.storages.diary.ShownDiaryNotesDao
    public void clear() {
        synchronized (this) {
            this.shownNoteIds.setValue(SetsKt.emptySet());
            this.initialized = false;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* compiled from: ShownDiaryNotesDaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/data/storages/diary/ShownDiaryNotesDaoImpl$Companion;", "", "()V", "SHOWN_NOTE_IDS_KEY", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
