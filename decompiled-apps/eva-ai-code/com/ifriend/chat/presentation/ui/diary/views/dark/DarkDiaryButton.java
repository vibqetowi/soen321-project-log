package com.ifriend.chat.presentation.ui.diary.views.dark;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.diary.views.DiaryButton;
import com.ifriend.chat.presentation.ui.diary.views.DiaryButtonState;
import com.ifriend.ui.utils.Modification;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DarkDiaryButton.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/dark/DarkDiaryButton;", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "icon", "Landroid/widget/ImageView;", "progress", "Landroid/view/View;", "state", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState;", "text", "Landroid/widget/TextView;", "setState", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DarkDiaryButton extends DiaryButton {
    public static final int $stable = 8;
    private final ViewGroup container;
    private final ImageView icon;
    private final View progress;
    private DiaryButtonState state;
    private final TextView text;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DarkDiaryButton(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DarkDiaryButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DarkDiaryButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = DiaryButtonState.Initial.INSTANCE;
        ConstraintLayout.inflate(context, R.layout.dark_diary_button, this);
        View findViewById = findViewById(R.id.text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.text = textView;
        View findViewById2 = findViewById(R.id.container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        this.container = viewGroup;
        View findViewById3 = findViewById(R.id.icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.icon = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.progress);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.progress = findViewById4;
        int[] AppButton = com.ifriend.ui.R.styleable.AppButton;
        Intrinsics.checkNotNullExpressionValue(AppButton, "AppButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AppButton, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        textView.setText(obtainStyledAttributes.getString(com.ifriend.ui.R.styleable.AppButton_text));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(com.ifriend.ui.R.styleable.AppButton_textSize, 0);
        if (dimensionPixelSize != 0) {
            textView.setTextSize(0, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.diary.views.dark.DarkDiaryButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DarkDiaryButton._init_$lambda$1(DarkDiaryButton.this, view);
            }
        });
        Modification.INSTANCE.onTouchOpacity(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(DarkDiaryButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callOnClick();
    }

    @Override // com.ifriend.chat.presentation.ui.diary.views.DiaryButton
    public void setState(DiaryButtonState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.areEqual(this.state, state)) {
            return;
        }
        this.state = state;
        if (!Intrinsics.areEqual(state, DiaryButtonState.Initial.INSTANCE)) {
            if (!(state instanceof DiaryButtonState.BackToChat)) {
                if (!(state instanceof DiaryButtonState.OpenSecretNote)) {
                    if (!(state instanceof DiaryButtonState.TextBot)) {
                        if (Intrinsics.areEqual(state, DiaryButtonState.Loading.INSTANCE)) {
                            this.text.setVisibility(8);
                            this.icon.setVisibility(8);
                            this.progress.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    this.text.setVisibility(0);
                    this.text.setText(((DiaryButtonState.TextBot) state).getText());
                    this.icon.setVisibility(8);
                    this.progress.setVisibility(8);
                    return;
                }
                this.text.setVisibility(0);
                this.text.setText(((DiaryButtonState.OpenSecretNote) state).getText());
                this.icon.setVisibility(0);
                this.progress.setVisibility(8);
                return;
            }
            this.text.setVisibility(0);
            this.text.setText(((DiaryButtonState.BackToChat) state).getText());
            this.icon.setVisibility(8);
            this.progress.setVisibility(8);
            return;
        }
        this.text.setVisibility(8);
        this.icon.setVisibility(8);
        this.progress.setVisibility(8);
    }
}
