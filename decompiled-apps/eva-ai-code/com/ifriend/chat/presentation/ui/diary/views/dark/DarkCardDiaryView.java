package com.ifriend.chat.presentation.ui.diary.views.dark;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import by.kirich1409.viewbindingdelegate.EagerViewBindingProperty;
import by.kirich1409.viewbindingdelegate.LazyViewBindingProperty;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.DarkCardDiaryViewBinding;
import com.ifriend.chat.presentation.ui.diary.models.DiaryUiModel;
import com.ifriend.chat.presentation.ui.diary.views.DiaryDetailView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: DarkCardDiaryView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/dark/DarkCardDiaryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryDetailView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/ifriend/chat/presentation/databinding/DarkCardDiaryViewBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/DarkCardDiaryViewBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "setData", "", "uiModel", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryUiModel;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DarkCardDiaryView extends ConstraintLayout implements DiaryDetailView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DarkCardDiaryView.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/DarkCardDiaryViewBinding;", 0))};
    public static final int $stable = 8;
    private final ViewBindingProperty binding$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DarkCardDiaryView(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DarkCardDiaryView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DarkCardDiaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LazyViewBindingProperty lazyViewBindingProperty;
        Intrinsics.checkNotNullParameter(context, "context");
        DarkCardDiaryView darkCardDiaryView = this;
        ConstraintLayout.inflate(context, R.layout.dark_card_diary_view, darkCardDiaryView);
        Function1 emptyVbCallback = UtilsKt.emptyVbCallback();
        if (darkCardDiaryView.isInEditMode()) {
            lazyViewBindingProperty = new EagerViewBindingProperty(DarkCardDiaryViewBinding.bind(darkCardDiaryView));
        } else {
            lazyViewBindingProperty = new LazyViewBindingProperty(emptyVbCallback, new DarkCardDiaryView$special$$inlined$viewBinding$1());
        }
        this.binding$delegate = lazyViewBindingProperty;
    }

    private final DarkCardDiaryViewBinding getBinding() {
        return (DarkCardDiaryViewBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.ifriend.chat.presentation.ui.diary.views.DiaryDetailView
    public void setData(DiaryUiModel uiModel) {
        Intrinsics.checkNotNullParameter(uiModel, "uiModel");
        DarkCardDiaryViewBinding binding = getBinding();
        binding.diaryDatetimeText.setText(uiModel.getDatetime());
        binding.diaryTitleText.setText(uiModel.getTitle());
        binding.diaryDescriptionText.setText(uiModel.getDescription());
        if (uiModel.isAvailable()) {
            ImageView diaryLockIcon = binding.diaryLockIcon;
            Intrinsics.checkNotNullExpressionValue(diaryLockIcon, "diaryLockIcon");
            diaryLockIcon.setVisibility(8);
            return;
        }
        ImageView diaryLockIcon2 = binding.diaryLockIcon;
        Intrinsics.checkNotNullExpressionValue(diaryLockIcon2, "diaryLockIcon");
        diaryLockIcon2.setVisibility(0);
        binding.diaryLockIcon.setImageResource(R.drawable.diary_lock_icon);
    }
}
