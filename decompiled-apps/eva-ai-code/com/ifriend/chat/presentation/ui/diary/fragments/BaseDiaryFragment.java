package com.ifriend.chat.presentation.ui.diary.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.chat.presentation.ui.avatarGeneration.GridSpacingItemDecoration;
import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState;
import com.ifriend.chat.presentation.ui.diary.recycler.adapter.DiaryShortsRecyclerAdapter;
import com.ifriend.chat.presentation.ui.diary.views.DiaryButton;
import com.ifriend.chat.presentation.ui.diary.views.DiaryButtonState;
import com.ifriend.chat.presentation.ui.diary.views.DiaryDetailView;
import com.ifriend.common_utils.Logger;
import com.ifriend.ui.base.mvvm.FragmentBaseView;
import com.ifriend.ui.progress.FullScreenProgressView;
import com.ifriend.ui.utils.UIUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: BaseDiaryFragment.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\b'\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0012H&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001aH&J\b\u0010\u001f\u001a\u00020\u0012H&J\b\u0010 \u001a\u00020!H\u0014J\u0012\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020!H\u0016J\u001a\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0016\u0010(\u001a\u00020!2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u0003H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006/"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/BaseDiaryFragment;", "Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "Lcom/ifriend/chat/presentation/ui/diary/fragments/BaseDiaryViewModel;", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "layoutId", "", "(I)V", "diariesAdapter", "Lcom/ifriend/chat/presentation/ui/diary/recycler/adapter/DiaryShortsRecyclerAdapter;", "getDiariesAdapter", "()Lcom/ifriend/chat/presentation/ui/diary/recycler/adapter/DiaryShortsRecyclerAdapter;", "diariesAdapter$delegate", "Lkotlin/Lazy;", "lastNavBarColor", "Ljava/lang/Integer;", "getCloseIcon", "Landroid/widget/ImageView;", "getDetailContainer", "Landroid/view/View;", "getDetailDiaryView", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryDetailView;", "getDiaryButton", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButton;", "getFullScreenLoadingView", "Lcom/ifriend/ui/progress/FullScreenProgressView;", "getInfoView", "Landroid/widget/TextView;", "getListContainer", "getRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getTitleView", "getToolbarDivider", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "showErrors", "errors", "", "", "showState", "state", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseDiaryFragment extends FragmentBaseView<BaseDiaryViewModel, DiaryScreenState> {
    public static final String DIARY_NOTE_ID_ARG = "DIARY_NOTE_ID_ARG";
    private final Lazy diariesAdapter$delegate;
    private Integer lastNavBarColor;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public abstract ImageView getCloseIcon();

    public abstract View getDetailContainer();

    public abstract DiaryDetailView getDetailDiaryView();

    public abstract DiaryButton getDiaryButton();

    public abstract FullScreenProgressView getFullScreenLoadingView();

    public abstract TextView getInfoView();

    public abstract View getListContainer();

    public abstract RecyclerView getRecyclerView();

    public abstract TextView getTitleView();

    public abstract View getToolbarDivider();

    public BaseDiaryFragment(int i) {
        super(i);
        this.diariesAdapter$delegate = LazyKt.lazy(new BaseDiaryFragment$diariesAdapter$2(this));
    }

    private final DiaryShortsRecyclerAdapter getDiariesAdapter() {
        return (DiaryShortsRecyclerAdapter) this.diariesAdapter$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        BaseDiaryViewModel viewModel = getViewModel();
        Bundle arguments = getArguments();
        viewModel.start(arguments != null ? arguments.getString(DIARY_NOTE_ID_ARG) : null);
        this.lastNavBarColor = Integer.valueOf(requireActivity().getWindow().getNavigationBarColor());
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Integer num = this.lastNavBarColor;
        if (num != null) {
            requireActivity().getWindow().setNavigationBarColor(num.intValue());
        }
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        final int toPxInt = UIUtils.INSTANCE.getToPxInt((Number) 24);
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, UIUtils.INSTANCE.getToPxInt((Number) 13), UIUtils.INSTANCE.getToPxInt((Number) 5), toPxInt, toPxInt, UIUtils.INSTANCE.getToPxInt((Number) 15), UIUtils.INSTANCE.getToPxInt((Number) 15)));
        recyclerView.setAdapter(getDiariesAdapter());
        final View toolbarDivider = getToolbarDivider();
        final FastOutSlowInInterpolator fastOutSlowInInterpolator = new FastOutSlowInInterpolator();
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment$onViewCreated$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrolled(recyclerView2, i, i2);
                toolbarDivider.setAlpha(fastOutSlowInInterpolator.getInterpolation(RangesKt.coerceAtMost(UIUtils.INSTANCE.getToPxInt(Integer.valueOf(recyclerView2.computeVerticalScrollOffset())) / (toPxInt * 5), 1.0f)));
            }
        });
        getCloseIcon().setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseDiaryFragment.onViewCreated$lambda$2(BaseDiaryFragment.this, view2);
            }
        });
        getDiaryButton().setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseDiaryFragment.onViewCreated$lambda$3(BaseDiaryFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(BaseDiaryFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onClickBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(BaseDiaryFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onClickDiaryButton();
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showState(DiaryScreenState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getTitleView().setText(getString(R.string.diary_title, state.getBotName()));
        if (state.isFullScreenLoading()) {
            getFullScreenLoadingView().showProgress();
        } else {
            getFullScreenLoadingView().hideProgress();
        }
        if (state instanceof DiaryScreenState.DiariesList) {
            requireActivity().getWindow().setNavigationBarColor(0);
            getDiariesAdapter().setItems(state.getNotes());
            getListContainer().setVisibility(0);
            getDetailContainer().setVisibility(8);
            getCloseIcon().setImageResource(com.ifriend.ui.R.drawable.close_white);
        } else if (state instanceof DiaryScreenState.DiaryDetail) {
            requireActivity().getWindow().setNavigationBarColor(requireContext().getColor(com.ifriend.ui.R.color.white_20));
            getListContainer().setVisibility(8);
            getDetailContainer().setVisibility(0);
            DiaryScreenState.DiaryDetail diaryDetail = (DiaryScreenState.DiaryDetail) state;
            getDetailDiaryView().setData(diaryDetail.getDiary());
            getCloseIcon().setImageResource(com.ifriend.ui.R.drawable.back_white);
            getDiaryButton().setState(diaryDetail.getButtonState());
            if (diaryDetail.getButtonState() instanceof DiaryButtonState.OpenSecretNote) {
                getInfoView().setText(getString(R.string.here_are_the_most_delicious_secrets));
            } else {
                getInfoView().setText(getString(R.string.diary_info, state.getBotName()));
            }
        }
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showErrors(List<? extends Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Logger logger = getLogger();
        Logger.DefaultImpls.error$default(logger, "Exceptions in DiaryFragment " + errors, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.BaseFragment
    public void onBackPressed() {
        getViewModel().onClickBack();
    }

    /* compiled from: BaseDiaryFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/BaseDiaryFragment$Companion;", "", "()V", BaseDiaryFragment.DIARY_NOTE_ID_ARG, "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
