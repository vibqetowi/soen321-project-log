package com.ifriend.chat.presentation.ui.diary.fragments.light;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.RecyclerView;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentLightDiaryBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment;
import com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel;
import com.ifriend.chat.presentation.ui.diary.views.DiaryButton;
import com.ifriend.chat.presentation.ui.diary.views.DiaryDetailView;
import com.ifriend.chat.presentation.ui.diary.views.light.LightCardDiaryView;
import com.ifriend.chat.presentation.ui.diary.views.light.LightDiaryButton;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.progress.FullScreenProgressView;
import com.ifriend.ui.utils.insets.InsetsExtensionsKt;
import com.redmadrobot.extensions.viewbinding.ViewBindingDelegate;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
/* compiled from: LightDiaryFragment.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020#H\u0016J\b\u0010(\u001a\u00020\u0018H\u0016J\u0012\u0010)\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006-"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/light/LightDiaryFragment;", "Lcom/ifriend/chat/presentation/ui/diary/fragments/BaseDiaryFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentLightDiaryBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentLightDiaryBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewModel", "Lcom/ifriend/chat/presentation/ui/diary/fragments/light/LightDiaryViewModel;", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/diary/fragments/light/LightDiaryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "applyWindowInsets", "", "rootView", "Landroid/view/View;", "getCloseIcon", "Landroid/widget/ImageView;", "getDetailContainer", "getDetailDiaryView", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryDetailView;", "getDiaryButton", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButton;", "getFullScreenLoadingView", "Lcom/ifriend/ui/progress/FullScreenProgressView;", "getInfoView", "Landroid/widget/TextView;", "getListContainer", "getRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getTitleView", "getToolbarDivider", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LightDiaryFragment extends BaseDiaryFragment {
    private final ReadOnlyProperty binding$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LightDiaryFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentLightDiaryBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final ViewModelFactory getViewModelFactory() {
        ViewModelFactory viewModelFactory = this.viewModelFactory;
        if (viewModelFactory != null) {
            return viewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(ViewModelFactory viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "<set-?>");
        this.viewModelFactory = viewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    /* renamed from: getViewModel */
    public BaseDiaryViewModel getViewModel2() {
        return (LightDiaryViewModel) this.viewModel$delegate.getValue();
    }

    private final FragmentLightDiaryBinding getBinding() {
        return (FragmentLightDiaryBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        super.onCreate(bundle);
    }

    @Override // com.ifriend.ui.base.BaseFragment
    protected void applyWindowInsets(View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        InsetsExtensionsKt.doOnApplyWindowInsets(rootView, LightDiaryFragment$applyWindowInsets$1.INSTANCE);
    }

    @Override // com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment
    public View getListContainer() {
        ConstraintLayout lightDiariesListContainer = getBinding().lightDiariesListContainer;
        Intrinsics.checkNotNullExpressionValue(lightDiariesListContainer, "lightDiariesListContainer");
        return lightDiariesListContainer;
    }

    @Override // com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment
    public View getDetailContainer() {
        ConstraintLayout lightDiariesCardDetailContainer = getBinding().lightDiariesCardDetailContainer;
        Intrinsics.checkNotNullExpressionValue(lightDiariesCardDetailContainer, "lightDiariesCardDetailContainer");
        return lightDiariesCardDetailContainer;
    }

    @Override // com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment
    public DiaryDetailView getDetailDiaryView() {
        LightCardDiaryView lightCardDiaryDetail = getBinding().lightCardDiaryDetail;
        Intrinsics.checkNotNullExpressionValue(lightCardDiaryDetail, "lightCardDiaryDetail");
        return lightCardDiaryDetail;
    }

    @Override // com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment
    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        return recyclerView;
    }

    @Override // com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment
    public View getToolbarDivider() {
        ImageView toolbarShadow = getBinding().toolbarShadow;
        Intrinsics.checkNotNullExpressionValue(toolbarShadow, "toolbarShadow");
        return toolbarShadow;
    }

    @Override // com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment
    public ImageView getCloseIcon() {
        ImageView close = getBinding().close;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        return close;
    }

    @Override // com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment
    public TextView getTitleView() {
        TextView diaryToolbarText = getBinding().diaryToolbarText;
        Intrinsics.checkNotNullExpressionValue(diaryToolbarText, "diaryToolbarText");
        return diaryToolbarText;
    }

    @Override // com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment
    public TextView getInfoView() {
        TextView lightDiaryInfo = getBinding().lightDiaryInfo;
        Intrinsics.checkNotNullExpressionValue(lightDiaryInfo, "lightDiaryInfo");
        return lightDiaryInfo;
    }

    @Override // com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment
    public DiaryButton getDiaryButton() {
        LightDiaryButton lightDiaryButton = getBinding().lightDiaryButton;
        Intrinsics.checkNotNullExpressionValue(lightDiaryButton, "lightDiaryButton");
        return lightDiaryButton;
    }

    @Override // com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment
    public FullScreenProgressView getFullScreenLoadingView() {
        FullScreenProgressView fullScreenProgressView = getBinding().fullScreenProgressView;
        Intrinsics.checkNotNullExpressionValue(fullScreenProgressView, "fullScreenProgressView");
        return fullScreenProgressView;
    }

    /* compiled from: LightDiaryFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/light/LightDiaryFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/diary/fragments/light/LightDiaryFragment;", "noteId", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LightDiaryFragment newInstance(String str) {
            LightDiaryFragment lightDiaryFragment = new LightDiaryFragment();
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString(BaseDiaryFragment.DIARY_NOTE_ID_ARG, str);
            }
            lightDiaryFragment.setArguments(bundle);
            return lightDiaryFragment;
        }
    }

    public LightDiaryFragment() {
        super(R.layout.fragment_light_diary);
        LightDiaryFragment lightDiaryFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new LightDiaryFragment$special$$inlined$viewModels$default$2(new LightDiaryFragment$special$$inlined$viewModels$default$1(lightDiaryFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(lightDiaryFragment, Reflection.getOrCreateKotlinClass(LightDiaryViewModel.class), new LightDiaryFragment$special$$inlined$viewModels$default$3(lazy), new LightDiaryFragment$special$$inlined$viewModels$default$4(null, lazy), new LightDiaryFragment$viewModel$2(this));
        this.binding$delegate = new ViewBindingDelegate(lightDiaryFragment, Reflection.getOrCreateKotlinClass(FragmentLightDiaryBinding.class));
    }
}
