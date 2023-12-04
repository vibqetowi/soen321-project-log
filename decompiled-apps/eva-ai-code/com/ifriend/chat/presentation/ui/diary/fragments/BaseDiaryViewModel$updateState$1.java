package com.ifriend.chat.presentation.ui.diary.fragments;

import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState;
import com.ifriend.chat.presentation.ui.diary.models.DiaryListItem;
import com.ifriend.chat.presentation.ui.diary.models.DiaryUiModel;
import com.ifriend.chat.presentation.ui.diary.models.ThemedDiaryCardItem;
import com.ifriend.chat.presentation.ui.diary.views.DiaryButtonState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseDiaryViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseDiaryViewModel$updateState$1 extends Lambda implements Function1<DiaryScreenState, DiaryScreenState> {
    final /* synthetic */ List<DiaryListItem> $allNotes;
    final /* synthetic */ BaseDiaryViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseDiaryViewModel$updateState$1(List<? extends DiaryListItem> list, BaseDiaryViewModel baseDiaryViewModel) {
        super(1);
        this.$allNotes = list;
        this.this$0 = baseDiaryViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DiaryScreenState invoke(DiaryScreenState state) {
        Object obj;
        DiaryUiModel diary;
        DiaryButtonState calculateButtonState;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof DiaryScreenState.DiariesList) {
            return DiaryScreenState.DiariesList.copy$default((DiaryScreenState.DiariesList) state, this.$allNotes, false, null, 6, null);
        }
        if (state instanceof DiaryScreenState.DiaryDetail) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : this.$allNotes) {
                if (obj2 instanceof ThemedDiaryCardItem) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((ThemedDiaryCardItem) obj).getUiModel().getId(), ((DiaryScreenState.DiaryDetail) state).getDiary().getId())) {
                    break;
                }
            }
            ThemedDiaryCardItem themedDiaryCardItem = (ThemedDiaryCardItem) obj;
            if (themedDiaryCardItem == null || (diary = themedDiaryCardItem.getUiModel()) == null) {
                diary = ((DiaryScreenState.DiaryDetail) state).getDiary();
            }
            DiaryUiModel diaryUiModel = diary;
            DiaryScreenState.DiaryDetail diaryDetail = (DiaryScreenState.DiaryDetail) state;
            List<DiaryListItem> list = this.$allNotes;
            calculateButtonState = this.this$0.calculateButtonState(diaryUiModel);
            return DiaryScreenState.DiaryDetail.copy$default(diaryDetail, list, diaryUiModel, false, false, null, calculateButtonState, 28, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
