package com.ifriend.ui.base.dialog.bottomDialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ifriend.ui.R;
import com.ifriend.ui.databinding.DialogBottomBinding;
import com.ifriend.ui.utils.Modification;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BottomDialog.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lcom/ifriend/ui/databinding/DialogBottomBinding;", "init", "", "titleText", "", "buttons", "", "Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButton;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BottomDialog extends BottomSheetDialog {
    public static final int $stable = 8;
    private final DialogBottomBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDialog(Context context) {
        super(context, R.style.DialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        DialogBottomBinding inflate = DialogBottomBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setContentView(inflate.root);
        inflate.negativeButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.base.dialog.bottomDialog.BottomDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomDialog.lambda$1$lambda$0(BottomDialog.this, view);
            }
        });
        Modification modification = Modification.INSTANCE;
        TextView negativeButton = inflate.negativeButton;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        modification.onTouchOpacity(negativeButton);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void lambda$1$lambda$0(BottomDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public final void init(String titleText, List<BottomDialogButton> buttons) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.binding.title.setText(titleText);
        for (BottomDialogButton bottomDialogButton : buttons) {
            LinearLayout linearLayout = this.binding.container;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BottomDialogButtonView bottomDialogButtonView = new BottomDialogButtonView(context);
            bottomDialogButtonView.init(bottomDialogButton);
            linearLayout.addView(bottomDialogButtonView);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
    }
}
