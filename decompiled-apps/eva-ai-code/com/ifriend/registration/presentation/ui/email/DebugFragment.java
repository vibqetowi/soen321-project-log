package com.ifriend.registration.presentation.ui.email;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.data.BuildConfig;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import com.ifriend.infrastructure.UtilsKt;
import com.ifriend.registration.presentation.R;
import com.ifriend.registration.presentation.ui.RegistrationActivity;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.editText.DarkEditText;
import com.ifriend.ui.utils.insets.InsetsExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: DebugFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ifriend/registration/presentation/ui/email/DebugFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "init", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugFragment extends BaseFragment {
    public static final int $stable = 0;

    public DebugFragment() {
        super(R.layout.fragment_debug);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.registration.presentation.ui.RegistrationActivity");
        ((RegistrationActivity) activity).getDaggerComponent().inject(this);
    }

    @Override // com.ifriend.ui.base.BaseFragment
    public void init(final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.init(view);
        InsetsExtensionsKt.doOnApplyWindowInsets(view, new DebugFragment$init$1(view));
        view.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.email.DebugFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DebugFragment.init$lambda$0(DebugFragment.this, view2);
            }
        });
        DarkEditText darkEditText = (DarkEditText) view.findViewById(R.id.api_edit);
        String string = requireContext().getSharedPreferences(OkHttpClientProviderKt.DEBUG_KEY, 0).getString(OkHttpClientProviderKt.API_URL_KEY, BuildConfig.API_URL);
        if (string == null) {
            string = "";
        }
        darkEditText.setText(string);
        view.findViewById(R.id.save).setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.email.DebugFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DebugFragment.init$lambda$3(DebugFragment.this, view, view2);
            }
        });
        view.findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.email.DebugFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DebugFragment.init$lambda$6(DebugFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(DebugFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().exit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$3(DebugFragment this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Context requireContext = this$0.requireContext();
        EditText editText = (EditText) ((DarkEditText) view.findViewById(R.id.api_edit)).findViewById(com.ifriend.ui.R.id.edit);
        Editable text = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (!StringsKt.isBlank(text)) {
            SharedPreferences sharedPreferences = requireContext.getSharedPreferences(OkHttpClientProviderKt.DEBUG_KEY, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putString(OkHttpClientProviderKt.API_URL_KEY, editText.getText().toString());
            editor.commit();
            Intrinsics.checkNotNull(requireContext);
            UtilsKt.restartApp(requireContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$6(DebugFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        SharedPreferences sharedPreferences = requireContext.getSharedPreferences(OkHttpClientProviderKt.DEBUG_KEY, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove(OkHttpClientProviderKt.API_URL_KEY);
        editor.commit();
        Intrinsics.checkNotNull(requireContext);
        UtilsKt.restartApp(requireContext);
    }
}
