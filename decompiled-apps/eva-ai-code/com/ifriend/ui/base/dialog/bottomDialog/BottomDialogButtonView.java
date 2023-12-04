package com.ifriend.ui.base.dialog.bottomDialog;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.ui.R;
import com.ifriend.ui.base.dialog.bottomDialog.BottomDialogButtonType;
import com.ifriend.ui.utils.Modification;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.time.TimeZones;
/* compiled from: BottomDialogButtonView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "countDownTimer", "Landroid/os/CountDownTimer;", "getCountDownTimer", "()Landroid/os/CountDownTimer;", "setCountDownTimer", "(Landroid/os/CountDownTimer;)V", "textView", "Landroid/widget/TextView;", "init", "", "bottomDialogButton", "Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButton;", "onDetachedFromWindow", "startTimer", "buttonText", "", RtspHeaders.Values.TIME, "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BottomDialogButtonView extends ConstraintLayout {
    public static final int $stable = 8;
    private CountDownTimer countDownTimer;
    private final TextView textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDialogButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout.inflate(context, R.layout.button_bottom_dialog, this);
        Modification.INSTANCE.onTouchOpacity(this);
        View findViewById = findViewById(R.id.text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.textView = (TextView) findViewById;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomDialogButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomDialogButtonView(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void init(final BottomDialogButton bottomDialogButton) {
        Intrinsics.checkNotNullParameter(bottomDialogButton, "bottomDialogButton");
        this.textView.setText(bottomDialogButton.getText());
        if ((bottomDialogButton.getType() instanceof BottomDialogButtonType.Timer) && ((BottomDialogButtonType.Timer) bottomDialogButton.getType()).isActive()) {
            startTimer(bottomDialogButton.getText(), ((BottomDialogButtonType.Timer) bottomDialogButton.getType()).getTime());
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.base.dialog.bottomDialog.BottomDialogButtonView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomDialogButtonView.init$lambda$1$lambda$0(BottomDialogButton.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1$lambda$0(BottomDialogButton this_with, BottomDialogButtonView this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.getOnClickListener().invoke();
        if (this_with.getType() instanceof BottomDialogButtonType.Timer) {
            this$0.startTimer(this_with.getText(), ((BottomDialogButtonType.Timer) this_with.getType()).getTime());
        }
    }

    public final CountDownTimer getCountDownTimer() {
        return this.countDownTimer;
    }

    public final void setCountDownTimer(CountDownTimer countDownTimer) {
        this.countDownTimer = countDownTimer;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.ifriend.ui.base.dialog.bottomDialog.BottomDialogButtonView$startTimer$1] */
    private final void startTimer(final String str, final long j) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(TimeZones.GMT_ID));
        this.textView.setText(simpleDateFormat.format(Long.valueOf(j)));
        this.textView.setTextColor(getResources().getColor(R.color.timer_gray, null));
        setOnTouchListener(null);
        setEnabled(false);
        this.countDownTimer = new CountDownTimer(j) { // from class: com.ifriend.ui.base.dialog.bottomDialog.BottomDialogButtonView$startTimer$1
            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                TextView textView;
                textView = this.textView;
                textView.setText(simpleDateFormat.format(Long.valueOf(j2)));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                TextView textView;
                TextView textView2;
                Modification.INSTANCE.onTouchOpacity(this);
                this.setEnabled(true);
                textView = this.textView;
                textView.setTextColor(this.getResources().getColor(R.color.bottom_dialog_blue, null));
                textView2 = this.textView;
                textView2.setText(str);
            }
        }.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.countDownTimer = null;
    }
}
