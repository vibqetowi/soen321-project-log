package com.ifriend.chat.presentation.ui.diary.recycler.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager;
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter;
import com.ifriend.chat.presentation.ui.diary.models.DiaryListItem;
import com.ifriend.chat.presentation.ui.diary.models.DiaryShortCardClick;
import com.ifriend.chat.presentation.ui.diary.models.ThemedDiaryCardItem;
import com.ifriend.chat.presentation.ui.diary.views.DarkThemedDiaryShortDelegateKt;
import com.ifriend.chat.presentation.ui.diary.views.DarkThemedDiaryShortPlaceholderDelegateKt;
import com.ifriend.chat.presentation.ui.diary.views.LightThemedDiaryShortDelegateKt;
import com.ifriend.chat.presentation.ui.diary.views.LightThemedDiaryShortPlaceholderDelegateKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DiaryShortsRecyclerAdapter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/recycler/adapter/DiaryShortsRecyclerAdapter;", "Lcom/hannesdorfmann/adapterdelegates4/AsyncListDifferDelegationAdapter;", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryListItem;", "diaryCardClick", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryShortCardClick;", "(Lcom/ifriend/chat/presentation/ui/diary/models/DiaryShortCardClick;)V", "DiffCallback", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryShortsRecyclerAdapter extends AsyncListDifferDelegationAdapter<DiaryListItem> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public DiaryShortsRecyclerAdapter(DiaryShortCardClick diaryCardClick) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(diaryCardClick, "diaryCardClick");
        AdapterDelegatesManager<List<T>> adapterDelegatesManager = this.delegatesManager;
        adapterDelegatesManager.addDelegate(LightThemedDiaryShortDelegateKt.lightThemedDiaryShortDelegate(diaryCardClick));
        adapterDelegatesManager.addDelegate(LightThemedDiaryShortPlaceholderDelegateKt.lightThemedDiaryShortPlaceholderDelegate());
        adapterDelegatesManager.addDelegate(DarkThemedDiaryShortDelegateKt.darkThemedDiaryShortDelegate(diaryCardClick));
        adapterDelegatesManager.addDelegate(DarkThemedDiaryShortPlaceholderDelegateKt.darkThemedDiaryShortPlaceholderDelegate());
    }

    /* compiled from: DiaryShortsRecyclerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/recycler/adapter/DiaryShortsRecyclerAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryListItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class DiffCallback extends DiffUtil.ItemCallback<DiaryListItem> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(DiaryListItem oldItem, DiaryListItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof ThemedDiaryCardItem) && (newItem instanceof ThemedDiaryCardItem)) {
                return Intrinsics.areEqual(((ThemedDiaryCardItem) oldItem).getUiModel().getId(), ((ThemedDiaryCardItem) newItem).getUiModel().getId());
            }
            return Intrinsics.areEqual(oldItem.getClass(), newItem.getClass());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(DiaryListItem oldItem, DiaryListItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
