package com.ifriend.domain.data.diary;

import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.models.diary.DiaryNote;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: DiaryRepository.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0011\u0010\f\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/data/diary/DiaryRepository;", "", "clear", "", "getDiaryNotes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/common_utils/data/Resource;", "", "Lcom/ifriend/domain/models/diary/DiaryNote;", "refresh", "", "markAllNotesAsShown", "refreshAllNotes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshDiaryNote", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DiaryRepository {
    void clear();

    Flow<Resource<List<DiaryNote>>> getDiaryNotes(boolean z);

    void markAllNotesAsShown();

    Object refreshAllNotes(Continuation<? super Unit> continuation);

    Object refreshDiaryNote(String str, Continuation<? super Unit> continuation);

    /* compiled from: DiaryRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Flow getDiaryNotes$default(DiaryRepository diaryRepository, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return diaryRepository.getDiaryNotes(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDiaryNotes");
        }
    }
}
