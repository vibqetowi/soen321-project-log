package com.ifriend.chat.presentation.ui.diary.fragments;

import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState;
import com.ifriend.chat.presentation.ui.diary.models.DiaryListItem;
import com.ifriend.chat.presentation.ui.diary.models.DiaryUiModel;
import com.ifriend.chat.presentation.ui.diary.views.DiaryButtonState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BaseDiaryViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BaseDiaryViewModel$onShortDiaryCardClick$1 extends Lambda implements Function1<DiaryScreenState, DiaryScreenState> {
    final /* synthetic */ DiaryUiModel $diaryModel;
    final /* synthetic */ BaseDiaryViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDiaryViewModel$onShortDiaryCardClick$1(BaseDiaryViewModel baseDiaryViewModel, DiaryUiModel diaryUiModel) {
        super(1);
        this.this$0 = baseDiaryViewModel;
        this.$diaryModel = diaryUiModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DiaryScreenState invoke(DiaryScreenState state) {
        DiaryButtonState calculateButtonState;
        Intrinsics.checkNotNullParameter(state, "state");
        List<DiaryListItem> notes = state.getNotes();
        String botName = state.getBotName();
        calculateButtonState = this.this$0.calculateButtonState(this.$diaryModel);
        return new DiaryScreenState.DiaryDetail(notes, this.$diaryModel, false, false, botName, calculateButtonState, 12, null);
    }
}
