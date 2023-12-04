package com.ifriend.ui.utils;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ifriend.ui.utils.insets.InsetsExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
/* compiled from: UIHelper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tJ\n\u0010\n\u001a\u00020\u0004*\u00020\u000bJ\n\u0010\f\u001a\u00020\u0004*\u00020\u0005¨\u0006\r"}, d2 = {"Lcom/ifriend/ui/utils/UIHelper;", "", "()V", "hideKeyboard", "", "Landroid/view/View;", "hideKeyboardIfOpened", "Landroid/content/Context;", "doAfter", "Lkotlin/Function0;", "selectEnd", "Landroid/widget/EditText;", "showKeyboard", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UIHelper {
    public static final int $stable = 0;
    public static final UIHelper INSTANCE = new UIHelper();

    private UIHelper() {
    }

    public final void showKeyboard(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.requestFocus()) {
            InsetsExtensionsKt.visibleKeyboard(view, true);
        }
    }

    public final void selectEnd(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setSelection(editText.getText().length());
    }

    public final void hideKeyboard(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        hideKeyboardIfOpened$default(this, context, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void hideKeyboardIfOpened$default(UIHelper uIHelper, Context context, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        uIHelper.hideKeyboardIfOpened(context, function0);
    }

    public final void hideKeyboardIfOpened(Context context, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ComponentActivity componentActivity = context instanceof ComponentActivity ? (ComponentActivity) context : null;
        if (componentActivity == null) {
            return;
        }
        View findViewById = componentActivity.findViewById(16908290);
        Intrinsics.checkNotNull(findViewById);
        if (!InsetsExtensionsKt.isKeyboardOpen(findViewById)) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (componentActivity.getCurrentFocus() == null && function0 != null) {
            function0.invoke();
        }
        InsetsExtensionsKt.setKeyboardListener(findViewById, new UIHelper$hideKeyboardIfOpened$1(BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(componentActivity), null, null, new UIHelper$hideKeyboardIfOpened$job$1(findViewById, function0, null), 3, null), findViewById, function0));
        InsetsExtensionsKt.visibleKeyboard(findViewById, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideKeyboardIfOpened$invokeDoAfter(View view, Function0<Unit> function0) {
        Intrinsics.checkNotNull(view);
        InsetsExtensionsKt.setKeyboardListener(view, null);
        if (function0 != null) {
            function0.invoke();
        }
    }
}
