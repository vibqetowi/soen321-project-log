package com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentGenerateBotAvatarBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.mvvm.FragmentBaseView;
import com.ifriend.ui.button.AppButton;
import com.ifriend.ui.utils.UIHelper;
import com.ifriend.ui.utils.extensions.ViewKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
/* compiled from: GenerateBotAvatarFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010$\u001a\u00020\u001dH\u0002J\u0016\u0010%\u001a\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0003H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarFragment;", "Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarViewModel;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState;", "()V", "adapter", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/AvatarGenerationDescriptionOptionsAdapter;", "getAdapter", "()Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/AvatarGenerationDescriptionOptionsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentGenerateBotAvatarBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentGenerateBotAvatarBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModel", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarViewModel;", "viewModel$delegate", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "initOnClickListeners", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "restoreDescription", "showErrors", "errors", "", "", "showState", "state", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenerateBotAvatarFragment extends FragmentBaseView<GenerateBotAvatarViewModel, GenerateBotAvatarState> {
    private static final String PRESET_DESCRIPTION_ARG = "description";
    private final Lazy adapter$delegate;
    private final ViewBindingProperty binding$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GenerateBotAvatarFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentGenerateBotAvatarBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showErrors(List<? extends Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
    }

    public GenerateBotAvatarFragment() {
        super(R.layout.fragment_generate_bot_avatar);
        GenerateBotAvatarFragment generateBotAvatarFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new GenerateBotAvatarFragment$special$$inlined$viewModels$default$2(new GenerateBotAvatarFragment$special$$inlined$viewModels$default$1(generateBotAvatarFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(generateBotAvatarFragment, Reflection.getOrCreateKotlinClass(GenerateBotAvatarViewModel.class), new GenerateBotAvatarFragment$special$$inlined$viewModels$default$3(lazy), new GenerateBotAvatarFragment$special$$inlined$viewModels$default$4(null, lazy), new GenerateBotAvatarFragment$viewModel$2(this));
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(generateBotAvatarFragment, new GenerateBotAvatarFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
        this.adapter$delegate = LazyKt.lazy(new GenerateBotAvatarFragment$adapter$2(this));
    }

    /* compiled from: GenerateBotAvatarFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarFragment$Companion;", "", "()V", "PRESET_DESCRIPTION_ARG", "", "newInstance", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarFragment;", "presetDescription", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ GenerateBotAvatarFragment newInstance$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.newInstance(str);
        }

        public final GenerateBotAvatarFragment newInstance(String str) {
            GenerateBotAvatarFragment generateBotAvatarFragment = new GenerateBotAvatarFragment();
            generateBotAvatarFragment.setArguments(BundleKt.bundleOf(TuplesKt.to("description", str)));
            return generateBotAvatarFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public GenerateBotAvatarViewModel getViewModel() {
        return (GenerateBotAvatarViewModel) this.viewModel$delegate.getValue();
    }

    private final FragmentGenerateBotAvatarBinding getBinding() {
        return (FragmentGenerateBotAvatarBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final AvatarGenerationDescriptionOptionsAdapter getAdapter() {
        return (AvatarGenerationDescriptionOptionsAdapter) this.adapter$delegate.getValue();
    }

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

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        super.onCreate(bundle);
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getViewModel().init();
        getBinding().descriptionOptions.setAdapter(getAdapter());
        restoreDescription();
        final FragmentGenerateBotAvatarBinding binding = getBinding();
        ImageView close = binding.close;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        ViewKt.expandClickableArea$default(close, 0, 1, null);
        binding.close.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GenerateBotAvatarFragment.onViewCreated$lambda$2$lambda$0(GenerateBotAvatarFragment.this, view2);
            }
        });
        binding.description.setImeOptions(6);
        binding.description.setRawInputType(180224);
        EditText description = binding.description;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        description.addTextChangedListener(new TextWatcher() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarFragment$onViewCreated$lambda$2$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                GenerateBotAvatarFragment.this.getViewModel().setDescription(String.valueOf(charSequence));
                while (binding.description.getLineCount() > 3) {
                    binding.description.getText().delete(binding.description.getText().length() - 2, binding.description.getText().length());
                }
            }
        });
        UIHelper uIHelper = UIHelper.INSTANCE;
        EditText description2 = binding.description;
        Intrinsics.checkNotNullExpressionValue(description2, "description");
        uIHelper.showKeyboard(description2);
        UIHelper uIHelper2 = UIHelper.INSTANCE;
        EditText description3 = binding.description;
        Intrinsics.checkNotNullExpressionValue(description3, "description");
        uIHelper2.selectEnd(description3);
        initOnClickListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2$lambda$0(GenerateBotAvatarFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().exit();
    }

    private final void restoreDescription() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("description") : null;
        if (string != null) {
            getBinding().description.setText(string);
            getViewModel().setDescription(string);
        }
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showState(GenerateBotAvatarState state) {
        String string;
        Intrinsics.checkNotNullParameter(state, "state");
        FragmentGenerateBotAvatarBinding binding = getBinding();
        if (state.getShouldUpdateDescription()) {
            binding.description.setText(state.getDescription());
            UIHelper uIHelper = UIHelper.INSTANCE;
            EditText description = binding.description;
            Intrinsics.checkNotNullExpressionValue(description, "description");
            uIHelper.selectEnd(description);
        }
        EditText editText = binding.description;
        if (state.getBotGender() == Gender.FEMALE) {
            string = getString(R.string.describe_her_apperance);
        } else {
            string = getString(R.string.describe_his_apperance);
        }
        editText.setHint(string);
        getAdapter().updateData(state.getDescriptionOptions());
        if (state.isLoading()) {
            binding.createAvatarButton.setLoading(true);
        } else {
            binding.createAvatarButton.setLoading(false);
            AppButton appButton = binding.createAvatarButton;
            Editable text = binding.description.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            appButton.setActive(!StringsKt.isBlank(text));
        }
        binding.description.setEnabled(!state.isLoading());
        binding.descriptionOptions.setClickable(!state.isLoading());
        if (state.getAvatarGenerationPrice() != null && state.getAvatarGenerationPrice().getPrice() > 0) {
            TextView textView = binding.avatarGenerationPrice;
            textView.setText(getString(R.string.generate_a_avatars_for_b_neurons, Integer.valueOf(state.getAvatarGenerationPrice().getAmount()), Integer.valueOf(state.getAvatarGenerationPrice().getPrice())));
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(0);
            Intrinsics.checkNotNull(textView);
            return;
        }
        TextView avatarGenerationPrice = binding.avatarGenerationPrice;
        Intrinsics.checkNotNullExpressionValue(avatarGenerationPrice, "avatarGenerationPrice");
        avatarGenerationPrice.setVisibility(8);
    }

    private final void initOnClickListeners() {
        getBinding().createAvatarButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GenerateBotAvatarFragment.initOnClickListeners$lambda$6$lambda$5(GenerateBotAvatarFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$6$lambda$5(GenerateBotAvatarFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().createAvatar();
    }
}
