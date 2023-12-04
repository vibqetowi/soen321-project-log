package com.ifriend.chat.presentation.ui.diary.views.dark;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import by.kirich1409.viewbindingdelegate.EagerViewBindingProperty;
import by.kirich1409.viewbindingdelegate.LazyViewBindingProperty;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.ShortDarkCardPlaceholderDiaryViewBinding;
import com.ifriend.chat.presentation.ui.diary.models.ShortDiaryPlaceholderUiModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: ShortDarkCardPlaceholderDiaryView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/dark/ShortDarkCardPlaceholderDiaryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/ifriend/chat/presentation/databinding/ShortDarkCardPlaceholderDiaryViewBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/ShortDarkCardPlaceholderDiaryViewBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "setData", "", "uiModel", "Lcom/ifriend/chat/presentation/ui/diary/models/ShortDiaryPlaceholderUiModel;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShortDarkCardPlaceholderDiaryView extends ConstraintLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ShortDarkCardPlaceholderDiaryView.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/ShortDarkCardPlaceholderDiaryViewBinding;", 0))};
    public static final int $stable = 8;
    private final ViewBindingProperty binding$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortDarkCardPlaceholderDiaryView(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setData(ShortDiaryPlaceholderUiModel uiModel) {
        Intrinsics.checkNotNullParameter(uiModel, "uiModel");
    }

    public /* synthetic */ ShortDarkCardPlaceholderDiaryView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortDarkCardPlaceholderDiaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LazyViewBindingProperty lazyViewBindingProperty;
        Intrinsics.checkNotNullParameter(context, "context");
        ShortDarkCardPlaceholderDiaryView shortDarkCardPlaceholderDiaryView = this;
        ConstraintLayout.inflate(context, R.layout.short_dark_card_placeholder_diary_view, shortDarkCardPlaceholderDiaryView);
        Function1 emptyVbCallback = UtilsKt.emptyVbCallback();
        if (shortDarkCardPlaceholderDiaryView.isInEditMode()) {
            lazyViewBindingProperty = new EagerViewBindingProperty(ShortDarkCardPlaceholderDiaryViewBinding.bind(shortDarkCardPlaceholderDiaryView));
        } else {
            lazyViewBindingProperty = new LazyViewBindingProperty(emptyVbCallback, new ShortDarkCardPlaceholderDiaryView$special$$inlined$viewBinding$1());
        }
        this.binding$delegate = lazyViewBindingProperty;
    }

    private final ShortDarkCardPlaceholderDiaryViewBinding getBinding() {
        return (ShortDarkCardPlaceholderDiaryViewBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }
}
