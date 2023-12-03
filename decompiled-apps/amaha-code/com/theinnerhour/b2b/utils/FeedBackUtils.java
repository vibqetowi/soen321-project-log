package com.theinnerhour.b2b.utils;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.AppFeedback;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import jl.t1;
import kotlin.Metadata;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: FeedBackUtils.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/theinnerhour/b2b/utils/FeedBackUtils;", "", "", "value", "Landroid/app/Dialog;", "dialog", "", "feedback", "Lhs/k;", "setDataForFeedBack", "rating", "topMenuFeedBackCallback", "sendAppFeedback", "rate", "platform", "saveFeedbackPopup", "showFeedbackPopup", "showBadFeedbackDialog", "showPlayStoreReviewFeedbackPopup", "setupDashboardFeedback", "TAG", "Ljava/lang/String;", "I", "Landroid/app/Activity;", Constants.SCREEN_ACTIVITY, "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "Ljl/t1;", "nv4feedbackRepository$delegate", "Lhs/d;", "getNv4feedbackRepository", "()Ljl/t1;", "nv4feedbackRepository", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FeedBackUtils {
    public Activity activity;
    private int rate;
    private String rating;
    private final String TAG = LogHelper.INSTANCE.makeLogTag(FeedBackUtils.class);
    private final hs.d nv4feedbackRepository$delegate = sp.b.O(FeedBackUtils$nv4feedbackRepository$2.INSTANCE);

    public final t1 getNv4feedbackRepository() {
        return (t1) this.nv4feedbackRepository$delegate.getValue();
    }

    private final void saveFeedbackPopup(int i6, String str) {
        try {
            ProgressDialog progressDialog = new ProgressDialog(getActivity());
            progressDialog.setMessage("Loading...");
            progressDialog.setCancelable(false);
            v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new FeedBackUtils$saveFeedbackPopup$1(this, i6, str, progressDialog, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    private final void sendAppFeedback(String str, Dialog dialog) {
        try {
            ProgressDialog progressDialog = new ProgressDialog(getActivity());
            progressDialog.setMessage("Loading...");
            progressDialog.setCancelable(false);
            progressDialog.show();
            v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new FeedBackUtils$sendAppFeedback$1(this, str, dialog, progressDialog, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    private final void setDataForFeedBack(int i6, final Dialog dialog, final String str) {
        try {
            this.rate = i6;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                this.rating = "Most Likely";
                                ((RobertoTextView) dialog.findViewById(R.id.feedbackRatingMessage)).setText("I love it");
                                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar1)).setImageResource(R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar2)).setImageResource(R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar3)).setImageResource(R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar4)).setImageResource(R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar5)).setImageResource(R.drawable.ic_star_filled);
                            }
                        } else {
                            this.rating = "Likely";
                            ((RobertoTextView) dialog.findViewById(R.id.feedbackRatingMessage)).setText("I like it");
                            ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar1)).setImageResource(R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar2)).setImageResource(R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar3)).setImageResource(R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar4)).setImageResource(R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar5)).setImageResource(R.drawable.ic_star_empty);
                        }
                    } else {
                        this.rating = "Neutral";
                        ((RobertoTextView) dialog.findViewById(R.id.feedbackRatingMessage)).setText("It's okay");
                        ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar1)).setImageResource(R.drawable.ic_star_filled);
                        ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar2)).setImageResource(R.drawable.ic_star_filled);
                        ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar3)).setImageResource(R.drawable.ic_star_filled);
                        ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar4)).setImageResource(R.drawable.ic_star_empty);
                        ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar5)).setImageResource(R.drawable.ic_star_empty);
                    }
                } else {
                    this.rating = "Maybe";
                    ((RobertoTextView) dialog.findViewById(R.id.feedbackRatingMessage)).setText("I don't like it");
                    ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar1)).setImageResource(R.drawable.ic_star_filled);
                    ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar2)).setImageResource(R.drawable.ic_star_filled);
                    ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar3)).setImageResource(R.drawable.ic_star_empty);
                    ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar4)).setImageResource(R.drawable.ic_star_empty);
                    ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar5)).setImageResource(R.drawable.ic_star_empty);
                }
            } else {
                this.rating = "Never";
                ((RobertoTextView) dialog.findViewById(R.id.feedbackRatingMessage)).setText("I hate it");
                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar1)).setImageResource(R.drawable.ic_star_filled);
                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar2)).setImageResource(R.drawable.ic_star_empty);
                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar3)).setImageResource(R.drawable.ic_star_empty);
                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar4)).setImageResource(R.drawable.ic_star_empty);
                ((AppCompatImageView) dialog.findViewById(R.id.feedbackStar5)).setImageResource(R.drawable.ic_star_empty);
            }
            new Handler().postDelayed(new Runnable() { // from class: com.theinnerhour.b2b.utils.a
                @Override // java.lang.Runnable
                public final void run() {
                    FeedBackUtils.setDataForFeedBack$lambda$5(str, this, dialog);
                }
            }, 500L);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    public static final void setDataForFeedBack$lambda$5(String feedback, FeedBackUtils this$0, Dialog dialog) {
        kotlin.jvm.internal.i.g(feedback, "$feedback");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        switch (feedback.hashCode()) {
            case -2111852769:
                if (feedback.equals(Constants.FEEDBACK_POPUP_THOUGHTS)) {
                    this$0.saveFeedbackPopup(this$0.rate, Constants.FEEDBACK_ISPLATFORM);
                    AppFeedback appFeedback = FirebasePersistence.getInstance().getUser().getAppFeedback();
                    String str = this$0.rating;
                    if (str != null) {
                        appFeedback.setThoughtsFeedback(str);
                        FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                        break;
                    } else {
                        kotlin.jvm.internal.i.q("rating");
                        throw null;
                    }
                }
                break;
            case -1142683118:
                if (feedback.equals(Constants.FEEDBACK_POPUP_BOOK_SESSION)) {
                    this$0.saveFeedbackPopup(this$0.rate, Constants.FEEDBACK_ISPLATFORM);
                    AppFeedback appFeedback2 = FirebasePersistence.getInstance().getUser().getAppFeedback();
                    String str2 = this$0.rating;
                    if (str2 != null) {
                        appFeedback2.setBookSessionFeedback(str2);
                        FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                        break;
                    } else {
                        kotlin.jvm.internal.i.q("rating");
                        throw null;
                    }
                }
                break;
            case -1043740647:
                if (feedback.equals(Constants.FEEDBACK_TOP_MENU)) {
                    this$0.saveFeedbackPopup(this$0.rate, Constants.FEEDBACK_TOP_MENU);
                    AppFeedback appFeedback3 = FirebasePersistence.getInstance().getUser().getAppFeedback();
                    String str3 = this$0.rating;
                    if (str3 != null) {
                        appFeedback3.setTopMenuFeedback(str3);
                        this$0.topMenuFeedBackCallback(this$0.rate);
                        break;
                    } else {
                        kotlin.jvm.internal.i.q("rating");
                        throw null;
                    }
                }
                break;
            case -305564209:
                if (feedback.equals(Constants.FEEDBACK_POPUP_ENDURING)) {
                    this$0.saveFeedbackPopup(this$0.rate, Constants.FEEDBACK_ISPLATFORM);
                    AppFeedback appFeedback4 = FirebasePersistence.getInstance().getUser().getAppFeedback();
                    String str4 = this$0.rating;
                    if (str4 != null) {
                        appFeedback4.setEnduringFeedback(str4);
                        FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                        break;
                    } else {
                        kotlin.jvm.internal.i.q("rating");
                        throw null;
                    }
                }
                break;
            case 64545891:
                if (feedback.equals(Constants.FEEDBACK_POPUP_COPING_FEELING)) {
                    this$0.saveFeedbackPopup(this$0.rate, Constants.FEEDBACK_ISPLATFORM);
                    AppFeedback appFeedback5 = FirebasePersistence.getInstance().getUser().getAppFeedback();
                    String str5 = this$0.rating;
                    if (str5 != null) {
                        appFeedback5.setCopingFeelingFeedback(str5);
                        FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                        break;
                    } else {
                        kotlin.jvm.internal.i.q("rating");
                        throw null;
                    }
                }
                break;
            case 159760162:
                if (feedback.equals(Constants.FEEDBACK_POPUP_COMPANY)) {
                    this$0.saveFeedbackPopup(this$0.rate, Constants.FEEDBACK_ISCOMPANY);
                    AppFeedback appFeedback6 = FirebasePersistence.getInstance().getUser().getAppFeedback();
                    String str6 = this$0.rating;
                    if (str6 != null) {
                        appFeedback6.setCompanyFeedback(str6);
                        FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                        break;
                    } else {
                        kotlin.jvm.internal.i.q("rating");
                        throw null;
                    }
                }
                break;
            case 813387410:
                if (feedback.equals(Constants.FEEDBACK_POPUP_ACTIVITIES)) {
                    this$0.saveFeedbackPopup(this$0.rate, Constants.FEEDBACK_ISPLATFORM);
                    AppFeedback appFeedback7 = FirebasePersistence.getInstance().getUser().getAppFeedback();
                    String str7 = this$0.rating;
                    if (str7 != null) {
                        appFeedback7.setActivitiesFeedback(str7);
                        FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                        break;
                    } else {
                        kotlin.jvm.internal.i.q("rating");
                        throw null;
                    }
                }
                break;
            case 1367467770:
                if (feedback.equals(Constants.FEEDBACK_POPUP_MOOD_SELECTION)) {
                    this$0.saveFeedbackPopup(this$0.rate, Constants.FEEDBACK_ISPLATFORM);
                    AppFeedback appFeedback8 = FirebasePersistence.getInstance().getUser().getAppFeedback();
                    String str8 = this$0.rating;
                    if (str8 != null) {
                        appFeedback8.setMoodSelectionFeedback(str8);
                        FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                        break;
                    } else {
                        kotlin.jvm.internal.i.q("rating");
                        throw null;
                    }
                }
                break;
        }
        FirebasePersistence.getInstance().updateUserOnFirebase();
        dialog.dismiss();
    }

    public static final void setupDashboardFeedback$lambda$11(Animation animation, FeedBackUtils this$0, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.theinnerhour.b2b.utils.FeedBackUtils$setupDashboardFeedback$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation2) {
                kotlin.jvm.internal.i.g(animation2, "animation");
                ((CardView) FeedBackUtils.this.getActivity().findViewById(R.id.cardDashboardFeedback)).setVisibility(8);
                FeedBackUtils.this.showBadFeedbackDialog();
                ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DASHBOARD_GIVEN_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                FirebasePersistence.getInstance().updateUserOnFirebase();
                Bundle bundle = new Bundle();
                defpackage.b.s(bundle, "course", bundle, "feedback_dashboard_negative");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation2) {
                kotlin.jvm.internal.i.g(animation2, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation2) {
                kotlin.jvm.internal.i.g(animation2, "animation");
            }
        });
        ((CardView) this$0.getActivity().findViewById(R.id.cardDashboardFeedback)).startAnimation(animation);
    }

    public static final void setupDashboardFeedback$lambda$12(Animation animation, FeedBackUtils this$0, final Animation animation2, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.theinnerhour.b2b.utils.FeedBackUtils$setupDashboardFeedback$2$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation3) {
                kotlin.jvm.internal.i.g(animation3, "animation");
                ((CardView) FeedBackUtils.this.getActivity().findViewById(R.id.cardDashboardPlayStoreFeedback)).startAnimation(animation2);
                ((CardView) FeedBackUtils.this.getActivity().findViewById(R.id.cardDashboardPlayStoreFeedback)).setVisibility(0);
                ((CardView) FeedBackUtils.this.getActivity().findViewById(R.id.cardDashboardFeedback)).setVisibility(8);
                FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                FirebasePersistence.getInstance().updateUserOnFirebase();
                Bundle bundle = new Bundle();
                defpackage.b.s(bundle, "course", bundle, "feedback_dashboard_positive");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation3) {
                kotlin.jvm.internal.i.g(animation3, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation3) {
                kotlin.jvm.internal.i.g(animation3, "animation");
            }
        });
        ((CardView) this$0.getActivity().findViewById(R.id.cardDashboardFeedback)).startAnimation(animation);
    }

    public static final void setupDashboardFeedback$lambda$13(Animation animation, FeedBackUtils this$0, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.theinnerhour.b2b.utils.FeedBackUtils$setupDashboardFeedback$3$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation2) {
                kotlin.jvm.internal.i.g(animation2, "animation");
                ((CardView) FeedBackUtils.this.getActivity().findViewById(R.id.cardDashboardPlayStoreFeedback)).setVisibility(8);
                ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DASHBOARD_GIVEN_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                FirebasePersistence.getInstance().updateUserOnFirebase();
                Bundle bundle = new Bundle();
                defpackage.b.s(bundle, "course", bundle, "feedback_dashboard_playstore_negative");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation2) {
                kotlin.jvm.internal.i.g(animation2, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation2) {
                kotlin.jvm.internal.i.g(animation2, "animation");
            }
        });
        ((CardView) this$0.getActivity().findViewById(R.id.cardDashboardPlayStoreFeedback)).startAnimation(animation);
    }

    public static final void setupDashboardFeedback$lambda$14(Animation animation, FeedBackUtils this$0, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.theinnerhour.b2b.utils.FeedBackUtils$setupDashboardFeedback$4$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation2) {
                kotlin.jvm.internal.i.g(animation2, "animation");
                ((CardView) FeedBackUtils.this.getActivity().findViewById(R.id.cardDashboardPlayStoreFeedback)).setVisibility(8);
                FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                FirebasePersistence.getInstance().updateUserOnFirebase();
                ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DASHBOARD_GIVEN_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + FeedBackUtils.this.getActivity().getPackageName()));
                intent.addFlags(1208483840);
                try {
                    FeedBackUtils.this.getActivity().startActivity(intent);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e10);
                    Activity activity = FeedBackUtils.this.getActivity();
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + FeedBackUtils.this.getActivity().getPackageName())));
                }
                Bundle bundle = new Bundle();
                defpackage.b.s(bundle, "course", bundle, "feedback_dashboard_playstore_positive");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation2) {
                kotlin.jvm.internal.i.g(animation2, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation2) {
                kotlin.jvm.internal.i.g(animation2, "animation");
            }
        });
        ((CardView) this$0.getActivity().findViewById(R.id.cardDashboardPlayStoreFeedback)).startAnimation(animation);
    }

    public static final void showBadFeedbackDialog$lambda$7(Dialog dialog, FeedBackUtils this$0, View view) {
        boolean z10;
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        View findViewById = dialog.findViewById(R.id.feedback);
        kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoEditText");
        Editable text = ((RobertoEditText) findViewById).getText();
        kotlin.jvm.internal.i.d(text);
        String obj = text.toString();
        if (gv.n.F0(obj, " ", "").length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (Utils.INSTANCE.checkConnectivity(this$0.getActivity())) {
                this$0.sendAppFeedback(obj, dialog);
                Bundle bundle = new Bundle();
                if (FirebasePersistence.getInstance().getUser() != null) {
                    defpackage.d.m(bundle, "course");
                }
                gk.a.b(bundle, "af_negative_fb_send");
                return;
            }
            return;
        }
        Toast.makeText(this$0.getActivity(), this$0.getActivity().getString(R.string.feedback_input_error), 0).show();
    }

    public static final void showFeedbackPopup$lambda$0(FeedBackUtils this$0, Dialog dialog, String feedback, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        kotlin.jvm.internal.i.g(feedback, "$feedback");
        this$0.setDataForFeedBack(1, dialog, feedback);
    }

    public static final void showFeedbackPopup$lambda$1(FeedBackUtils this$0, Dialog dialog, String feedback, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        kotlin.jvm.internal.i.g(feedback, "$feedback");
        this$0.setDataForFeedBack(2, dialog, feedback);
    }

    public static final void showFeedbackPopup$lambda$2(FeedBackUtils this$0, Dialog dialog, String feedback, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        kotlin.jvm.internal.i.g(feedback, "$feedback");
        this$0.setDataForFeedBack(3, dialog, feedback);
    }

    public static final void showFeedbackPopup$lambda$3(FeedBackUtils this$0, Dialog dialog, String feedback, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        kotlin.jvm.internal.i.g(feedback, "$feedback");
        this$0.setDataForFeedBack(4, dialog, feedback);
    }

    public static final void showFeedbackPopup$lambda$4(FeedBackUtils this$0, Dialog dialog, String feedback, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        kotlin.jvm.internal.i.g(feedback, "$feedback");
        this$0.setDataForFeedBack(5, dialog, feedback);
    }

    public static final void showPlayStoreReviewFeedbackPopup$lambda$8(FeedBackUtils this$0, Dialog dialog, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        try {
            ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.getActivity().getPackageName()));
            intent.addFlags(1208483840);
            try {
                this$0.getActivity().startActivity(intent);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e10);
                Activity activity = this$0.getActivity();
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.getActivity().getPackageName())));
            }
            dialog.dismiss();
            Bundle bundle = new Bundle();
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            gk.a.b(bundle, "af_playstore_click");
        } catch (Exception e11) {
            LogHelper.INSTANCE.e("dashboardactivity", "error in creating intent for play store rating", e11);
        }
    }

    public static final void showPlayStoreReviewFeedbackPopup$lambda$9(Dialog dialog, View view) {
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        try {
            dialog.dismiss();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("dashboardactivity", "error in creating intent for play store rating", e10);
        }
    }

    private final void topMenuFeedBackCallback(int i6) {
        if (i6 <= 3) {
            showBadFeedbackDialog();
        } else {
            showPlayStoreReviewFeedbackPopup();
        }
        Bundle bundle = new Bundle();
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            bundle.putString("course", user.getCurrentCourseName());
        }
        bundle.putInt("rating", i6);
        gk.a.b(bundle, "af_rating_submit");
    }

    public final Activity getActivity() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
        throw null;
    }

    public final void setActivity(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "<set-?>");
        this.activity = activity;
    }

    public final void setupDashboardFeedback() {
        ((CardView) getActivity().findViewById(R.id.cardDashboardFeedback)).setVisibility(0);
        ((CardView) getActivity().findViewById(R.id.cardDashboardPlayStoreFeedback)).setVisibility(8);
        final Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.shrink_and_fade);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_fade_out_left);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_fade_in_right);
        ((RobertoButton) getActivity().findViewById(R.id.dashBoardFeedbackNoButton)).setOnClickListener(new View.OnClickListener() { // from class: com.theinnerhour.b2b.utils.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r3;
                FeedBackUtils feedBackUtils = this;
                Animation animation = loadAnimation;
                switch (i6) {
                    case 0:
                        FeedBackUtils.setupDashboardFeedback$lambda$11(animation, feedBackUtils, view);
                        return;
                    case 1:
                        FeedBackUtils.setupDashboardFeedback$lambda$13(animation, feedBackUtils, view);
                        return;
                    default:
                        FeedBackUtils.setupDashboardFeedback$lambda$14(animation, feedBackUtils, view);
                        return;
                }
            }
        });
        ((RobertoButton) getActivity().findViewById(R.id.dashBoardFeedbackYesButton)).setOnClickListener(new b(loadAnimation2, this, loadAnimation3));
        ((RobertoButton) getActivity().findViewById(R.id.dashBoardPlayStoreFeedbackNoButton)).setOnClickListener(new View.OnClickListener() { // from class: com.theinnerhour.b2b.utils.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r3;
                FeedBackUtils feedBackUtils = this;
                Animation animation = loadAnimation;
                switch (i6) {
                    case 0:
                        FeedBackUtils.setupDashboardFeedback$lambda$11(animation, feedBackUtils, view);
                        return;
                    case 1:
                        FeedBackUtils.setupDashboardFeedback$lambda$13(animation, feedBackUtils, view);
                        return;
                    default:
                        FeedBackUtils.setupDashboardFeedback$lambda$14(animation, feedBackUtils, view);
                        return;
                }
            }
        });
        ((RobertoButton) getActivity().findViewById(R.id.dashBoardPlayStoreFeedbackYesButton)).setOnClickListener(new View.OnClickListener() { // from class: com.theinnerhour.b2b.utils.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r3;
                FeedBackUtils feedBackUtils = this;
                Animation animation = loadAnimation;
                switch (i6) {
                    case 0:
                        FeedBackUtils.setupDashboardFeedback$lambda$11(animation, feedBackUtils, view);
                        return;
                    case 1:
                        FeedBackUtils.setupDashboardFeedback$lambda$13(animation, feedBackUtils, view);
                        return;
                    default:
                        FeedBackUtils.setupDashboardFeedback$lambda$14(animation, feedBackUtils, view);
                        return;
                }
            }
        });
        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
        analyticsBundle.putString("trigger", ApplicationPersistence.getInstance().getStringValue(Constants.APP_FEEDBACK_TRIGGER));
        gk.a.b(analyticsBundle, "feedback_dashboard_show");
    }

    public final void showBadFeedbackDialog() {
        try {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_feedback, getActivity(), R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.getAttributes().windowAnimations = R.style.DialogSlideInAndShrinkOut;
            View findViewById = styledDialog.findViewById(R.id.btnSubmit);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setOnClickListener(new hl.e(styledDialog, this, 3));
            styledDialog.show();
            Bundle bundle = new Bundle();
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            gk.a.b(bundle, "af_negative_dialog");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception", e10);
        }
    }

    public final Dialog showFeedbackPopup(String feedback) {
        kotlin.jvm.internal.i.g(feedback, "feedback");
        try {
            this.rate = 0;
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.feedback_popup, getActivity(), R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.getAttributes().windowAnimations = R.style.DialogGrowInAndSlideOut;
            ((AppCompatImageView) styledDialog.findViewById(R.id.feedbackStar1)).setOnClickListener(new b(this, styledDialog, feedback, 0));
            ((AppCompatImageView) styledDialog.findViewById(R.id.feedbackStar2)).setOnClickListener(new b(this, styledDialog, feedback, 1));
            ((AppCompatImageView) styledDialog.findViewById(R.id.feedbackStar3)).setOnClickListener(new b(this, styledDialog, feedback, 2));
            ((AppCompatImageView) styledDialog.findViewById(R.id.feedbackStar4)).setOnClickListener(new b(this, styledDialog, feedback, 3));
            ((AppCompatImageView) styledDialog.findViewById(R.id.feedbackStar5)).setOnClickListener(new b(this, styledDialog, feedback, 4));
            return styledDialog;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
            return null;
        }
    }

    public final void showPlayStoreReviewFeedbackPopup() {
        try {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_play_store_feedback, getActivity(), R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.getAttributes().windowAnimations = R.style.DialogSlideInAndShrinkOut;
            View findViewById = styledDialog.findViewById(R.id.yes);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setOnClickListener(new hl.e(this, styledDialog));
            View findViewById2 = styledDialog.findViewById(R.id.f39931no);
            kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById2).setOnClickListener(new nq.n(styledDialog, 27));
            styledDialog.show();
            Bundle bundle = new Bundle();
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            gk.a.b(bundle, "af_playstore_dialog");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception", e10);
        }
    }
}
