package com.ifriend.data.storages.diary;

import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
/* compiled from: ShownDiaryNotesDao.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\tH&¨\u0006\n"}, d2 = {"Lcom/ifriend/data/storages/diary/ShownDiaryNotesDao;", "", "addShownIds", "", "ids", "", "", "clear", "getShownNoteIds", "Lkotlinx/coroutines/flow/Flow;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ShownDiaryNotesDao {
    void addShownIds(Set<String> set);

    void clear();

    Flow<Set<String>> getShownNoteIds();
}
