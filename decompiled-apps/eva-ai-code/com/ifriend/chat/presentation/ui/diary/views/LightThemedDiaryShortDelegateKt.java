package com.ifriend.chat.presentation.ui.diary.views;

import com.hannesdorfmann.adapterdelegates4.AdapterDelegate;
import com.hannesdorfmann.adapterdelegates4.dsl.DslViewBindingListAdapterDelegate;
import com.ifriend.chat.presentation.ui.diary.models.DiaryListItem;
import com.ifriend.chat.presentation.ui.diary.models.DiaryShortCardClick;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LightThemedDiaryShortDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"lightThemedDiaryShortDelegate", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryListItem;", "diaryCardClick", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryShortCardClick;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LightThemedDiaryShortDelegateKt {
    public static final AdapterDelegate<List<DiaryListItem>> lightThemedDiaryShortDelegate(DiaryShortCardClick diaryCardClick) {
        Intrinsics.checkNotNullParameter(diaryCardClick, "diaryCardClick");
        return new DslViewBindingListAdapterDelegate(LightThemedDiaryShortDelegateKt$lightThemedDiaryShortDelegate$1.INSTANCE, new LightThemedDiaryShortDelegateKt$lightThemedDiaryShortDelegate$$inlined$adapterDelegateViewBinding$default$1(), new LightThemedDiaryShortDelegateKt$lightThemedDiaryShortDelegate$2(diaryCardClick), LightThemedDiaryShortDelegateKt$lightThemedDiaryShortDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
