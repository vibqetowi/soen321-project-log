package il;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlin.jvm.internal.u;
/* compiled from: NotV4FeedbackUtils.kt */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f20384a;

    /* renamed from: b  reason: collision with root package name */
    public final n f20385b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20386c;

    /* renamed from: d  reason: collision with root package name */
    public int f20387d;

    /* renamed from: e  reason: collision with root package name */
    public String f20388e;

    public q(androidx.fragment.app.p activity, n notV4FeedbackInterface) {
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(notV4FeedbackInterface, "notV4FeedbackInterface");
        this.f20384a = activity;
        this.f20385b = notV4FeedbackInterface;
        this.f20386c = LogHelper.INSTANCE.makeLogTag("NotV4FeedbackUtils");
    }

    public final void a(int i6, Dialog dialog, String str) {
        try {
            String str2 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("trigger_reason", str);
            bundle.putInt("rating_value", i6);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "rating_star_popup_submit");
            ((RobertoTextView) dialog.findViewById(R.id.feedbackRatingMessage)).setVisibility(0);
            this.f20387d = i6;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                this.f20388e = "Most Likely";
                                ((RobertoTextView) dialog.findViewById(R.id.feedbackRatingMessage)).setText("I love it");
                                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar1)).setImageResource(R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar2)).setImageResource(R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar3)).setImageResource(R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar4)).setImageResource(R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar5)).setImageResource(R.drawable.ic_star_filled);
                            }
                        } else {
                            this.f20388e = "Likely";
                            ((RobertoTextView) dialog.findViewById(R.id.feedbackRatingMessage)).setText("I like it");
                            ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar1)).setImageResource(R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar2)).setImageResource(R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar3)).setImageResource(R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar4)).setImageResource(R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar5)).setImageResource(R.drawable.ic_star_empty);
                        }
                    } else {
                        this.f20388e = "Neutral";
                        ((RobertoTextView) dialog.findViewById(R.id.feedbackRatingMessage)).setText("It's okay");
                        ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar1)).setImageResource(R.drawable.ic_star_filled);
                        ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar2)).setImageResource(R.drawable.ic_star_filled);
                        ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar3)).setImageResource(R.drawable.ic_star_filled);
                        ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar4)).setImageResource(R.drawable.ic_star_empty);
                        ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar5)).setImageResource(R.drawable.ic_star_empty);
                    }
                } else {
                    this.f20388e = "Maybe";
                    ((RobertoTextView) dialog.findViewById(R.id.feedbackRatingMessage)).setText("I don't like it");
                    ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar1)).setImageResource(R.drawable.ic_star_filled);
                    ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar2)).setImageResource(R.drawable.ic_star_filled);
                    ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar3)).setImageResource(R.drawable.ic_star_empty);
                    ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar4)).setImageResource(R.drawable.ic_star_empty);
                    ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar5)).setImageResource(R.drawable.ic_star_empty);
                }
            } else {
                this.f20388e = "Never";
                ((RobertoTextView) dialog.findViewById(R.id.feedbackRatingMessage)).setText("I hate it");
                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar1)).setImageResource(R.drawable.ic_star_filled);
                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar2)).setImageResource(R.drawable.ic_star_empty);
                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar3)).setImageResource(R.drawable.ic_star_empty);
                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar4)).setImageResource(R.drawable.ic_star_empty);
                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar5)).setImageResource(R.drawable.ic_star_empty);
            }
            new Handler().postDelayed(new ni.c(7, this, str, dialog), 500L);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20386c, e10);
        }
    }

    public final Dialog b(String str) {
        try {
            this.f20387d = 0;
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.feedback_popup, this.f20384a, R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.getAttributes().windowAnimations = R.style.DialogGrowInAndSlideOut;
            ((AppCompatImageView) styledDialog.findViewById(R.id.feedbackBanner1)).setImageResource(R.drawable.ic_feedback_banner_new_1);
            ((RobertoTextView) styledDialog.findViewById(R.id.feedbackTitle)).setGravity(17);
            ((RobertoTextView) styledDialog.findViewById(R.id.feedbackRatingMessage)).setVisibility(8);
            u uVar = new u();
            ((AppCompatImageView) styledDialog.findViewById(R.id.feedbackStar1)).setOnClickListener(new o(uVar, this, styledDialog, str, 0));
            ((AppCompatImageView) styledDialog.findViewById(R.id.feedbackStar2)).setOnClickListener(new o(uVar, this, styledDialog, str, 1));
            ((AppCompatImageView) styledDialog.findViewById(R.id.feedbackStar3)).setOnClickListener(new o(uVar, this, styledDialog, str, 2));
            ((AppCompatImageView) styledDialog.findViewById(R.id.feedbackStar4)).setOnClickListener(new o(uVar, this, styledDialog, str, 3));
            ((AppCompatImageView) styledDialog.findViewById(R.id.feedbackStar5)).setOnClickListener(new o(uVar, this, styledDialog, str, 4));
            String str2 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("trigger_reason", str);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "rating_star_popup_show");
            styledDialog.setOnDismissListener(new p(uVar, str, 0));
            return styledDialog;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20386c, e10);
            return null;
        }
    }
}
