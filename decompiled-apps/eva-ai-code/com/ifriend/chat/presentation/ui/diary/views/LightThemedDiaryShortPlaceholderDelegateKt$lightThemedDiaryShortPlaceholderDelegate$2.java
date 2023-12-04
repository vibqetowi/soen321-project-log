package com.ifriend.chat.presentation.ui.diary.views;

import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.presentation.databinding.ShortDiaryLightPlaceholderListItemBinding;
import com.ifriend.chat.presentation.ui.diary.models.ThemedShortDiaryPlaceholderCardItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LightThemedDiaryShortPlaceholderDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", "Lcom/ifriend/chat/presentation/ui/diary/models/ThemedShortDiaryPlaceholderCardItem$Light;", "Lcom/ifriend/chat/presentation/databinding/ShortDiaryLightPlaceholderListItemBinding;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LightThemedDiaryShortPlaceholderDelegateKt$lightThemedDiaryShortPlaceholderDelegate$2 extends Lambda implements Function1<AdapterDelegateViewBindingViewHolder<ThemedShortDiaryPlaceholderCardItem.Light, ShortDiaryLightPlaceholderListItemBinding>, Unit> {
    public static final LightThemedDiaryShortPlaceholderDelegateKt$lightThemedDiaryShortPlaceholderDelegate$2 INSTANCE = new LightThemedDiaryShortPlaceholderDelegateKt$lightThemedDiaryShortPlaceholderDelegate$2();

    LightThemedDiaryShortPlaceholderDelegateKt$lightThemedDiaryShortPlaceholderDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<ThemedShortDiaryPlaceholderCardItem.Light, ShortDiaryLightPlaceholderListItemBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LightThemedDiaryShortPlaceholderDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.diary.views.LightThemedDiaryShortPlaceholderDelegateKt$lightThemedDiaryShortPlaceholderDelegate$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<ThemedShortDiaryPlaceholderCardItem.Light, ShortDiaryLightPlaceholderListItemBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<ThemedShortDiaryPlaceholderCardItem.Light, ShortDiaryLightPlaceholderListItemBinding> adapterDelegateViewBindingViewHolder) {
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
            this.$this_adapterDelegateViewBinding.getBinding().placeholder.setData(this.$this_adapterDelegateViewBinding.getItem().getUiModel());
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<ThemedShortDiaryPlaceholderCardItem.Light, ShortDiaryLightPlaceholderListItemBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
