package com.ifriend.chat.presentation.ui.purchase.neurons;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ifriend/chat/presentation/ui/purchase/neurons/BuyNeuronsBottomSheetDialogFragment$onCreateDialog$1", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "onAttachedToWindow", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetDialogFragment$onCreateDialog$1 extends BottomSheetDialog {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BuyNeuronsBottomSheetDialogFragment$onCreateDialog$1(Context context, int i) {
        super(context, i);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            WindowCompat.setDecorFitsSystemWindows(window, false);
        }
        View findViewById = findViewById(R.id.container);
        if (findViewById != null) {
            findViewById.setFitsSystemWindows(false);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById, new OnApplyWindowInsetsListener() { // from class: com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment$onCreateDialog$1$$ExternalSyntheticLambda0
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    WindowInsetsCompat onAttachedToWindow$lambda$3$lambda$2;
                    onAttachedToWindow$lambda$3$lambda$2 = BuyNeuronsBottomSheetDialogFragment$onCreateDialog$1.onAttachedToWindow$lambda$3$lambda$2(view, windowInsetsCompat);
                    return onAttachedToWindow$lambda$3$lambda$2;
                }
            });
        }
        View findViewById2 = findViewById(R.id.coordinator);
        if (findViewById2 == null) {
            return;
        }
        findViewById2.setFitsSystemWindows(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onAttachedToWindow$lambda$3$lambda$2(View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        return insets;
    }
}
