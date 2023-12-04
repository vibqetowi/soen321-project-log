package com.ifriend.chat.presentation.ui.diary.views;

import android.view.View;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.presentation.databinding.ShortDiaryLightListItemBinding;
import com.ifriend.chat.presentation.ui.diary.models.DiaryShortCardClick;
import com.ifriend.chat.presentation.ui.diary.models.ThemedDiaryCardItem;
import com.ifriend.chat.presentation.ui.diary.views.light.ShortLightCardDiaryView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LightThemedDiaryShortDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", "Lcom/ifriend/chat/presentation/ui/diary/models/ThemedDiaryCardItem$Light;", "Lcom/ifriend/chat/presentation/databinding/ShortDiaryLightListItemBinding;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LightThemedDiaryShortDelegateKt$lightThemedDiaryShortDelegate$2 extends Lambda implements Function1<AdapterDelegateViewBindingViewHolder<ThemedDiaryCardItem.Light, ShortDiaryLightListItemBinding>, Unit> {
    final /* synthetic */ DiaryShortCardClick $diaryCardClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LightThemedDiaryShortDelegateKt$lightThemedDiaryShortDelegate$2(DiaryShortCardClick diaryShortCardClick) {
        super(1);
        this.$diaryCardClick = diaryShortCardClick;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<ThemedDiaryCardItem.Light, ShortDiaryLightListItemBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(DiaryShortCardClick diaryCardClick, AdapterDelegateViewBindingViewHolder this_adapterDelegateViewBinding, View view) {
        Intrinsics.checkNotNullParameter(diaryCardClick, "$diaryCardClick");
        Intrinsics.checkNotNullParameter(this_adapterDelegateViewBinding, "$this_adapterDelegateViewBinding");
        diaryCardClick.onShortDiaryCardClick(((ThemedDiaryCardItem.Light) this_adapterDelegateViewBinding.getItem()).getUiModel());
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<ThemedDiaryCardItem.Light, ShortDiaryLightListItemBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ShortLightCardDiaryView shortLightCardDiaryView = adapterDelegateViewBinding.getBinding().diaryCard;
        final DiaryShortCardClick diaryShortCardClick = this.$diaryCardClick;
        shortLightCardDiaryView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.diary.views.LightThemedDiaryShortDelegateKt$lightThemedDiaryShortDelegate$2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LightThemedDiaryShortDelegateKt$lightThemedDiaryShortDelegate$2.invoke$lambda$0(DiaryShortCardClick.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LightThemedDiaryShortDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.diary.views.LightThemedDiaryShortDelegateKt$lightThemedDiaryShortDelegate$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<ThemedDiaryCardItem.Light, ShortDiaryLightListItemBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<ThemedDiaryCardItem.Light, ShortDiaryLightListItemBinding> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$this_adapterDelegateViewBinding.getBinding().diaryCard.setData(this.$this_adapterDelegateViewBinding.getItem().getUiModel());
        }
    }
}
