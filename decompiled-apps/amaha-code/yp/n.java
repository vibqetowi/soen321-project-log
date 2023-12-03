package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: RowFirestoreGoalsBinding.java */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f38874a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f38875b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatImageView f38876c;

    /* renamed from: d  reason: collision with root package name */
    public final ProgressBar f38877d;

    /* renamed from: e  reason: collision with root package name */
    public final RobertoTextView f38878e;
    public final RobertoTextView f;

    /* renamed from: g  reason: collision with root package name */
    public final RobertoTextView f38879g;

    /* renamed from: h  reason: collision with root package name */
    public final RobertoTextView f38880h;

    public n(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ProgressBar progressBar, RobertoTextView robertoTextView, RobertoTextView robertoTextView2, RobertoTextView robertoTextView3, RobertoTextView robertoTextView4) {
        this.f38874a = constraintLayout;
        this.f38875b = appCompatImageView;
        this.f38876c = appCompatImageView2;
        this.f38877d = progressBar;
        this.f38878e = robertoTextView;
        this.f = robertoTextView2;
        this.f38879g = robertoTextView3;
        this.f38880h = robertoTextView4;
    }

    public static n a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View inflate = layoutInflater.inflate(R.layout.row_firestore_goals, (ViewGroup) recyclerView, false);
        int i6 = R.id.iday0;
        if (((AppCompatImageView) hc.d.w(R.id.iday0, inflate)) != null) {
            i6 = R.id.iday1;
            if (((AppCompatImageView) hc.d.w(R.id.iday1, inflate)) != null) {
                i6 = R.id.iday2;
                if (((AppCompatImageView) hc.d.w(R.id.iday2, inflate)) != null) {
                    i6 = R.id.iday3;
                    if (((AppCompatImageView) hc.d.w(R.id.iday3, inflate)) != null) {
                        i6 = R.id.iday4;
                        if (((AppCompatImageView) hc.d.w(R.id.iday4, inflate)) != null) {
                            i6 = R.id.iday5;
                            if (((AppCompatImageView) hc.d.w(R.id.iday5, inflate)) != null) {
                                i6 = R.id.iday6;
                                if (((AppCompatImageView) hc.d.w(R.id.iday6, inflate)) != null) {
                                    i6 = R.id.ivRowGoalCheckMark;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivRowGoalCheckMark, inflate);
                                    if (appCompatImageView != null) {
                                        i6 = R.id.ivRowGoalDelete;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) hc.d.w(R.id.ivRowGoalDelete, inflate);
                                        if (appCompatImageView2 != null) {
                                            i6 = R.id.pbRowGoalProgress;
                                            ProgressBar progressBar = (ProgressBar) hc.d.w(R.id.pbRowGoalProgress, inflate);
                                            if (progressBar != null) {
                                                i6 = R.id.rowAssessmentBarrier;
                                                if (((Barrier) hc.d.w(R.id.rowAssessmentBarrier, inflate)) != null) {
                                                    i6 = R.id.tday0;
                                                    if (((RobertoTextView) hc.d.w(R.id.tday0, inflate)) != null) {
                                                        i6 = R.id.tday1;
                                                        if (((RobertoTextView) hc.d.w(R.id.tday1, inflate)) != null) {
                                                            i6 = R.id.tday2;
                                                            if (((RobertoTextView) hc.d.w(R.id.tday2, inflate)) != null) {
                                                                i6 = R.id.tday3;
                                                                if (((RobertoTextView) hc.d.w(R.id.tday3, inflate)) != null) {
                                                                    i6 = R.id.tday4;
                                                                    if (((RobertoTextView) hc.d.w(R.id.tday4, inflate)) != null) {
                                                                        i6 = R.id.tday5;
                                                                        if (((RobertoTextView) hc.d.w(R.id.tday5, inflate)) != null) {
                                                                            i6 = R.id.tday6;
                                                                            if (((RobertoTextView) hc.d.w(R.id.tday6, inflate)) != null) {
                                                                                i6 = R.id.tvRowGoalCourse;
                                                                                RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.tvRowGoalCourse, inflate);
                                                                                if (robertoTextView != null) {
                                                                                    i6 = R.id.tvRowGoalTitle;
                                                                                    RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.tvRowGoalTitle, inflate);
                                                                                    if (robertoTextView2 != null) {
                                                                                        i6 = R.id.tvRowGoalsGoalType;
                                                                                        RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.tvRowGoalsGoalType, inflate);
                                                                                        if (robertoTextView3 != null) {
                                                                                            i6 = R.id.tvRowGoalsWeeklyStatus;
                                                                                            RobertoTextView robertoTextView4 = (RobertoTextView) hc.d.w(R.id.tvRowGoalsWeeklyStatus, inflate);
                                                                                            if (robertoTextView4 != null) {
                                                                                                return new n((ConstraintLayout) inflate, appCompatImageView, appCompatImageView2, progressBar, robertoTextView, robertoTextView2, robertoTextView3, robertoTextView4);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
