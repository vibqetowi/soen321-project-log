package com.ifriend.chat.presentation.ui.diary.fragments;

import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState;
import com.ifriend.chat.presentation.ui.diary.models.DiaryListItem;
import com.ifriend.chat.presentation.ui.diary.models.DiaryUiModel;
import com.ifriend.chat.presentation.ui.diary.models.ThemedDiaryCardItem;
import com.ifriend.chat.presentation.ui.diary.views.DiaryButtonState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseDiaryViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseDiaryViewModel$openDiaryNote$1 extends Lambda implements Function1<DiaryScreenState, DiaryScreenState> {
    final /* synthetic */ List<DiaryListItem> $allNotes;
    final /* synthetic */ ThemedDiaryCardItem $diaryNoteToOpenAfterStart;
    final /* synthetic */ BaseDiaryViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseDiaryViewModel$openDiaryNote$1(ThemedDiaryCardItem themedDiaryCardItem, BaseDiaryViewModel baseDiaryViewModel, List<? extends DiaryListItem> list) {
        super(1);
        this.$diaryNoteToOpenAfterStart = themedDiaryCardItem;
        this.this$0 = baseDiaryViewModel;
        this.$allNotes = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DiaryScreenState invoke(DiaryScreenState it) {
        DiaryButtonState calculateButtonState;
        Intrinsics.checkNotNullParameter(it, "it");
        DiaryUiModel uiModel = this.$diaryNoteToOpenAfterStart.getUiModel();
        String botName = it.getBotName();
        calculateButtonState = this.this$0.calculateButtonState(this.$diaryNoteToOpenAfterStart.getUiModel());
        return new DiaryScreenState.DiaryDetail(this.$allNotes, uiModel, false, false, botName, calculateButtonState, 12, null);
    }
}
