package com.ifriend.chat.presentation.ui.diary.fragments;

import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BaseDiaryViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BaseDiaryViewModel$changeFullScreenLoadingState$1 extends Lambda implements Function1<DiaryScreenState, DiaryScreenState> {
    final /* synthetic */ boolean $isLoading;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDiaryViewModel$changeFullScreenLoadingState$1(boolean z) {
        super(1);
        this.$isLoading = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DiaryScreenState invoke(DiaryScreenState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof DiaryScreenState.DiariesList) {
            return DiaryScreenState.DiariesList.copy$default((DiaryScreenState.DiariesList) state, null, this.$isLoading, null, 5, null);
        }
        if (state instanceof DiaryScreenState.DiaryDetail) {
            return DiaryScreenState.DiaryDetail.copy$default((DiaryScreenState.DiaryDetail) state, null, null, false, this.$isLoading, null, null, 55, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
