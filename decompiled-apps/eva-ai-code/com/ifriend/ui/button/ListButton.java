package com.ifriend.ui.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.Modification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ListButton.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/ifriend/ui/button/ListButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "changeCheck", "", "isActive", "", "setText", "text", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListButton extends ConstraintLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout.inflate(context, R.layout.button_gradient, this);
        View findViewById = findViewById(R.id.container);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.button.ListButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ListButton._init_$lambda$0(ListButton.this, view);
            }
        });
        Modification modification = Modification.INSTANCE;
        Intrinsics.checkNotNull(findViewById);
        modification.onTouchOpacity(findViewById);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListButton(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ListButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callOnClick();
    }

    public final void setText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ((TextView) findViewById(R.id.text)).setText(text);
    }

    public final void changeCheck(boolean z) {
        View findViewById = findViewById(R.id.check);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        findViewById.setVisibility(z ? 0 : 8);
    }
}
