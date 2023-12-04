package com.ifriend.data.storages.diary;

import com.ifriend.data.networking.responses.DiaryNoteDaoModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: DiaryDaoImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0016\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\rH\u0016J\u0016\u0010\u000e\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/data/storages/diary/DiaryDaoImpl;", "Lcom/ifriend/data/storages/diary/DiaryDao;", "()V", "diaryNotes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/ifriend/data/networking/responses/DiaryNoteDaoModel;", "addNotes", "", "notesDaoModels", "clear", "currentDiaryNotes", "getDiaryNotes", "Lkotlinx/coroutines/flow/Flow;", "saveDiaryNotes", "updateNote", "note", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryDaoImpl implements DiaryDao {
    private MutableStateFlow<List<DiaryNoteDaoModel>> diaryNotes = StateFlowKt.MutableStateFlow(null);

    @Override // com.ifriend.data.storages.diary.DiaryDao
    public Flow<List<DiaryNoteDaoModel>> getDiaryNotes() {
        return this.diaryNotes;
    }

    @Override // com.ifriend.data.storages.diary.DiaryDao
    public List<DiaryNoteDaoModel> currentDiaryNotes() {
        return this.diaryNotes.getValue();
    }

    @Override // com.ifriend.data.storages.diary.DiaryDao
    public void saveDiaryNotes(List<DiaryNoteDaoModel> diaryNotes) {
        Intrinsics.checkNotNullParameter(diaryNotes, "diaryNotes");
        synchronized (this) {
            this.diaryNotes.setValue(diaryNotes);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ifriend.data.storages.diary.DiaryDao
    public void updateNote(DiaryNoteDaoModel note) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(note, "note");
        synchronized (this) {
            MutableStateFlow<List<DiaryNoteDaoModel>> mutableStateFlow = this.diaryNotes;
            List<DiaryNoteDaoModel> value = mutableStateFlow.getValue();
            if (value != null) {
                List<DiaryNoteDaoModel> list = value;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (DiaryNoteDaoModel diaryNoteDaoModel : list) {
                    if (Intrinsics.areEqual(diaryNoteDaoModel.getId(), note.getId())) {
                        diaryNoteDaoModel = note;
                    }
                    arrayList2.add(diaryNoteDaoModel);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            mutableStateFlow.setValue(arrayList);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ifriend.data.storages.diary.DiaryDao
    public void addNotes(List<DiaryNoteDaoModel> notesDaoModels) {
        Object obj;
        Intrinsics.checkNotNullParameter(notesDaoModels, "notesDaoModels");
        synchronized (this) {
            List<DiaryNoteDaoModel> value = this.diaryNotes.getValue();
            if (value == null) {
                this.diaryNotes.setValue(notesDaoModels);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : notesDaoModels) {
                DiaryNoteDaoModel diaryNoteDaoModel = (DiaryNoteDaoModel) obj2;
                List<DiaryNoteDaoModel> list = value;
                boolean z = true;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual(((DiaryNoteDaoModel) it.next()).getId(), diaryNoteDaoModel.getId())) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = arrayList;
            List minus = CollectionsKt.minus((Iterable) notesDaoModels, (Iterable) arrayList2);
            List<DiaryNoteDaoModel> list2 = value;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (DiaryNoteDaoModel diaryNoteDaoModel2 : list2) {
                Iterator it2 = minus.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.areEqual(((DiaryNoteDaoModel) obj).getId(), diaryNoteDaoModel2.getId())) {
                        break;
                    }
                }
                DiaryNoteDaoModel diaryNoteDaoModel3 = (DiaryNoteDaoModel) obj;
                if (diaryNoteDaoModel3 != null) {
                    diaryNoteDaoModel2 = diaryNoteDaoModel3;
                }
                arrayList3.add(diaryNoteDaoModel2);
            }
            this.diaryNotes.setValue(CollectionsKt.plus((Collection) arrayList3, (Iterable) arrayList2));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ifriend.data.storages.diary.DiaryDao
    public void clear() {
        synchronized (this) {
            this.diaryNotes.setValue(null);
            Unit unit = Unit.INSTANCE;
        }
    }
}
