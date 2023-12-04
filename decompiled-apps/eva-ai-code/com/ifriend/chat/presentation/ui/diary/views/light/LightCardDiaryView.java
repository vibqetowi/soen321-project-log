package com.ifriend.chat.presentation.ui.diary.views.light;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import by.kirich1409.viewbindingdelegate.EagerViewBindingProperty;
import by.kirich1409.viewbindingdelegate.LazyViewBindingProperty;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.LightCardDiaryViewBinding;
import com.ifriend.chat.presentation.ui.diary.models.DiaryUiModel;
import com.ifriend.chat.presentation.ui.diary.views.DiaryDetailView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: LightCardDiaryView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/light/LightCardDiaryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryDetailView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/ifriend/chat/presentation/databinding/LightCardDiaryViewBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/LightCardDiaryViewBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "setData", "", "uiModel", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryUiModel;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LightCardDiaryView extends ConstraintLayout implements DiaryDetailView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LightCardDiaryView.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/LightCardDiaryViewBinding;", 0))};
    public static final int $stable = 8;
    private final ViewBindingProperty binding$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LightCardDiaryView(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LightCardDiaryView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LightCardDiaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LazyViewBindingProperty lazyViewBindingProperty;
        Intrinsics.checkNotNullParameter(context, "context");
        LightCardDiaryView lightCardDiaryView = this;
        ConstraintLayout.inflate(context, R.layout.light_card_diary_view, lightCardDiaryView);
        Function1 emptyVbCallback = UtilsKt.emptyVbCallback();
        if (lightCardDiaryView.isInEditMode()) {
            lazyViewBindingProperty = new EagerViewBindingProperty(LightCardDiaryViewBinding.bind(lightCardDiaryView));
        } else {
            lazyViewBindingProperty = new LazyViewBindingProperty(emptyVbCallback, new LightCardDiaryView$special$$inlined$viewBinding$1());
        }
        this.binding$delegate = lazyViewBindingProperty;
    }

    private final LightCardDiaryViewBinding getBinding() {
        return (LightCardDiaryViewBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.ifriend.chat.presentation.ui.diary.views.DiaryDetailView
    public void setData(DiaryUiModel uiModel) {
        Intrinsics.checkNotNullParameter(uiModel, "uiModel");
        LightCardDiaryViewBinding binding = getBinding();
        binding.diaryDatetimeText.setText(uiModel.getDatetime());
        binding.diaryTitleText.setText(uiModel.getTitle());
        binding.diaryDescriptionText.setText(uiModel.getDescription());
        ImageView diaryHeartIcon = binding.diaryHeartIcon;
        Intrinsics.checkNotNullExpressionValue(diaryHeartIcon, "diaryHeartIcon");
        diaryHeartIcon.setVisibility(uiModel.isAvailable() ? 0 : 8);
        ImageView diaryLockIcon = binding.diaryLockIcon;
        Intrinsics.checkNotNullExpressionValue(diaryLockIcon, "diaryLockIcon");
        diaryLockIcon.setVisibility(uiModel.isAvailable() ^ true ? 0 : 8);
    }
}
