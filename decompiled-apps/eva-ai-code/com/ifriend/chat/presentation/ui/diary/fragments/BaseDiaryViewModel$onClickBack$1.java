package com.ifriend.chat.presentation.ui.diary.fragments;

import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BaseDiaryViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BaseDiaryViewModel$onClickBack$1 extends Lambda implements Function1<DiaryScreenState, DiaryScreenState> {
    public static final BaseDiaryViewModel$onClickBack$1 INSTANCE = new BaseDiaryViewModel$onClickBack$1();

    BaseDiaryViewModel$onClickBack$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final DiaryScreenState invoke(DiaryScreenState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new DiaryScreenState.DiariesList(state.getNotes(), false, state.getBotName(), 2, null);
    }
}
