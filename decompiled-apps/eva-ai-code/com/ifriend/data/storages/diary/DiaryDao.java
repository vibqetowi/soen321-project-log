package com.ifriend.data.storages.diary;

import com.ifriend.data.networking.responses.DiaryNoteDaoModel;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
/* compiled from: DiaryDao.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\u0016\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\nH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/storages/diary/DiaryDao;", "", "addNotes", "", "notesDaoModels", "", "Lcom/ifriend/data/networking/responses/DiaryNoteDaoModel;", "clear", "currentDiaryNotes", "getDiaryNotes", "Lkotlinx/coroutines/flow/Flow;", "saveDiaryNotes", "diaryNotes", "updateNote", "note", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DiaryDao {
    void addNotes(List<DiaryNoteDaoModel> list);

    void clear();

    List<DiaryNoteDaoModel> currentDiaryNotes();

    Flow<List<DiaryNoteDaoModel>> getDiaryNotes();

    void saveDiaryNotes(List<DiaryNoteDaoModel> list);

    void updateNote(DiaryNoteDaoModel diaryNoteDaoModel);
}
