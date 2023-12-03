package com.theinnerhour.b2b.components.resetprogram.activity;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.resetprogram.activity.ResetProgrammeActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import ho.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import lm.f;
import nn.g;
/* compiled from: ResetProgrammeActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/resetprogram/activity/ResetProgrammeActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ResetProgrammeActivity extends c {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f11615y = 0;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f11618x = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11616v = LogHelper.INSTANCE.makeLogTag(ResetProgrammeActivity.class);

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f11617w = new ArrayList<>();

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f11618x;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_reset_programme);
        try {
            Window window = getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
                window.setStatusBarColor(a.b(this, R.color.white));
            } else {
                window.setStatusBarColor(a.b(this, R.color.status_bar_grey));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11616v, "Error in setting custom status bar", e10);
        }
        for (int i6 = 0; i6 < 6; i6++) {
            if (i6 == 0 ? FirebasePersistence.getInstance().getUser().getSleep() == null : !(i6 == 1 ? FirebasePersistence.getInstance().getUser().getStress() != null : i6 == 2 ? FirebasePersistence.getInstance().getUser().getWorry() != null : i6 == 3 ? FirebasePersistence.getInstance().getUser().getDepression() != null : i6 == 4 ? FirebasePersistence.getInstance().getUser().getAnger() != null : i6 != 5 || FirebasePersistence.getInstance().getUser().getHappiness() != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                View inflate = getLayoutInflater().inflate(R.layout.row_course_reset, (ViewGroup) ((LinearLayout) n0(R.id.courseRowContainer)), false);
                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.rowTitle);
                String str2 = "";
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 != 4) {
                                    if (i6 != 5) {
                                        str = "";
                                    } else {
                                        str = Constants.COURSE_HAPPINESS_DN;
                                    }
                                } else {
                                    str = Constants.COURSE_ANGER_DN;
                                }
                            } else {
                                str = Constants.COURSE_DEPRESSION_DN;
                            }
                        } else {
                            str = Constants.COURSE_WORRY_DN;
                        }
                    } else {
                        str = Constants.COURSE_STRESS_DN;
                    }
                } else {
                    str = Constants.COURSE_SLEEP_DN;
                }
                robertoTextView.setText(str);
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 != 4) {
                                    if (i6 == 5) {
                                        str2 = Constants.COURSE_HAPPINESS;
                                    }
                                } else {
                                    str2 = Constants.COURSE_ANGER;
                                }
                            } else {
                                str2 = Constants.COURSE_DEPRESSION;
                            }
                        } else {
                            str2 = Constants.COURSE_WORRY;
                        }
                    } else {
                        str2 = Constants.COURSE_STRESS;
                    }
                } else {
                    str2 = Constants.COURSE_SLEEP;
                }
                inflate.setOnClickListener(new g(4, this, str2, inflate));
                ((LinearLayout) n0(R.id.courseRowContainer)).addView(inflate);
            }
        }
        ((AppCompatImageView) n0(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener(this) { // from class: bp.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ResetProgrammeActivity f4617v;

            {
                this.f4617v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                ResetProgrammeActivity this$0 = this.f4617v;
                switch (i10) {
                    case 0:
                        int i11 = ResetProgrammeActivity.f11615y;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    default:
                        int i12 = ResetProgrammeActivity.f11615y;
                        i.g(this$0, "this$0");
                        if (this$0.f11617w.isEmpty()) {
                            Utils.INSTANCE.showCustomToast(this$0, "Please select at least one programme");
                            return;
                        }
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_course, this$0, R.style.Theme_Dialog);
                        Window window2 = styledDialog.getWindow();
                        i.d(window2);
                        window2.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        ((RobertoTextView) styledDialog.findViewById(R.id.resetDialogTitle)).setText(this$0.getString(R.string.resetCoursesHeader));
                        ((RobertoTextView) styledDialog.findViewById(R.id.resetQuestion)).setText(this$0.getString(R.string.resetCoursesBody));
                        ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setOnClickListener(new o(styledDialog, 7, this$0));
                        ((RobertoTextView) styledDialog.findViewById(R.id.f39931no)).setOnClickListener(new f(styledDialog, 23));
                        styledDialog.show();
                        return;
                }
            }
        });
        ((RobertoButton) n0(R.id.nextButton)).setOnClickListener(new View.OnClickListener(this) { // from class: bp.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ResetProgrammeActivity f4617v;

            {
                this.f4617v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                ResetProgrammeActivity this$0 = this.f4617v;
                switch (i10) {
                    case 0:
                        int i11 = ResetProgrammeActivity.f11615y;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    default:
                        int i12 = ResetProgrammeActivity.f11615y;
                        i.g(this$0, "this$0");
                        if (this$0.f11617w.isEmpty()) {
                            Utils.INSTANCE.showCustomToast(this$0, "Please select at least one programme");
                            return;
                        }
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_course, this$0, R.style.Theme_Dialog);
                        Window window2 = styledDialog.getWindow();
                        i.d(window2);
                        window2.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        ((RobertoTextView) styledDialog.findViewById(R.id.resetDialogTitle)).setText(this$0.getString(R.string.resetCoursesHeader));
                        ((RobertoTextView) styledDialog.findViewById(R.id.resetQuestion)).setText(this$0.getString(R.string.resetCoursesBody));
                        ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setOnClickListener(new o(styledDialog, 7, this$0));
                        ((RobertoTextView) styledDialog.findViewById(R.id.f39931no)).setOnClickListener(new f(styledDialog, 23));
                        styledDialog.show();
                        return;
                }
            }
        });
    }
}
