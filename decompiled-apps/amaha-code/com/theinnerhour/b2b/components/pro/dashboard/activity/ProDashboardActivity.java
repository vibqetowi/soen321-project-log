package com.theinnerhour.b2b.components.pro.dashboard.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.chat.activity.CoachChatActivity;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.components.pro.dashboard.model.ProCoachModel;
import com.theinnerhour.b2b.components.pro.goal.model.SimpleGoalModel;
import com.theinnerhour.b2b.model.CoachModelTracker;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.r;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import ta.v;
/* compiled from: ProDashboardActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/dashboard/activity/ProDashboardActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProDashboardActivity extends rr.a {
    public static final /* synthetic */ int F = 0;
    public boolean B;
    public String C;
    public Integer D;

    /* renamed from: x  reason: collision with root package name */
    public no.a f11526x;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11525w = LogHelper.INSTANCE.makeLogTag(ProDashboardActivity.class);

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<SimpleGoalModel> f11527y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final ChatUser f11528z = new ChatUser();
    public final ArrayList<String> A = new ArrayList<>();

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Integer num) {
            int i6;
            Integer num2 = num;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            if (num2 != null) {
                try {
                    int intValue = num2.intValue();
                    RobertoTextView robertoTextView = (RobertoTextView) proDashboardActivity.u0(R.id.proDbMessageAlertText);
                    if (robertoTextView != null) {
                        if (intValue > 0) {
                            RobertoTextView robertoTextView2 = (RobertoTextView) proDashboardActivity.u0(R.id.proDbMessageAlertText);
                            i6 = 0;
                            if (robertoTextView2 != null) {
                                robertoTextView2.setText(proDashboardActivity.getString(R.string.proDbChatAlert, String.valueOf(intValue)));
                            }
                        } else {
                            RobertoTextView robertoTextView3 = (RobertoTextView) proDashboardActivity.u0(R.id.proDbMessageAlertText);
                            if (robertoTextView3 != null) {
                                robertoTextView3.setText("");
                            }
                            i6 = 8;
                        }
                        robertoTextView.setVisibility(i6);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Integer, ? extends Integer>, hs.k> {
        public b() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
            if (r2 != r3.intValue()) goto L10;
         */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(hs.f<? extends Integer, ? extends Integer> fVar) {
            A a10;
            RobertoTextView robertoTextView;
            int i6;
            hs.f<? extends Integer, ? extends Integer> fVar2 = fVar;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            try {
                B b10 = fVar2.f19465v;
                a10 = fVar2.f19464u;
                proDashboardActivity.D = (Integer) b10;
                robertoTextView = (RobertoTextView) proDashboardActivity.u0(R.id.proDbAssessmentAlertText);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
            }
            if (((Number) a10).intValue() > 0) {
                int intValue = ApplicationPersistence.getInstance().getIntValue("pro_db_assessment_latest_id");
                Integer num = proDashboardActivity.D;
                if (num != null) {
                }
                i6 = 0;
                robertoTextView.setVisibility(i6);
                ProDashboardActivity.v0(proDashboardActivity, ((Number) a10).intValue());
                return hs.k.f19476a;
            }
            i6 = 8;
            robertoTextView.setVisibility(i6);
            ProDashboardActivity.v0(proDashboardActivity, ((Number) a10).intValue());
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean it = bool;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            try {
                kotlin.jvm.internal.i.f(it, "it");
                if (it.booleanValue()) {
                    ProgressBar progressBar = (ProgressBar) proDashboardActivity.u0(R.id.proDbProgress);
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) proDashboardActivity.u0(R.id.proDbMainLayout);
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                    }
                } else {
                    ProgressBar progressBar2 = (ProgressBar) proDashboardActivity.u0(R.id.proDbProgress);
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) proDashboardActivity.u0(R.id.proDbMainLayout);
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<ProCoachModel, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ no.a f11533v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(no.a aVar) {
            super(1);
            this.f11533v = aVar;
        }

        @Override // ss.l
        public final hs.k invoke(ProCoachModel proCoachModel) {
            String str;
            RobertoTextView robertoTextView;
            ProCoachModel proCoachModel2 = proCoachModel;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            if (proCoachModel2 != null) {
                try {
                    no.a aVar = this.f11533v;
                    View u02 = proDashboardActivity.u0(R.id.proDbTherapistInfoName);
                    ChatUser chatUser = proDashboardActivity.f11528z;
                    RobertoTextView robertoTextView2 = (RobertoTextView) u02;
                    boolean z10 = true;
                    String str2 = "";
                    if (robertoTextView2 != null) {
                        Object[] objArr = new Object[2];
                        String firstname = proCoachModel2.getFirstname();
                        if (firstname == null) {
                            firstname = "";
                        }
                        objArr[0] = firstname;
                        String lastname = proCoachModel2.getLastname();
                        if (lastname == null) {
                            lastname = "";
                        }
                        objArr[1] = lastname;
                        robertoTextView2.setText(proDashboardActivity.getString(R.string.proDbTherapistName, objArr));
                    }
                    RobertoTextView robertoTextView3 = (RobertoTextView) proDashboardActivity.u0(R.id.proDbTherapistInfoText);
                    if (robertoTextView3 != null) {
                        String designation = proCoachModel2.getDesignation();
                        if (designation != null && designation.length() != 0) {
                            z10 = false;
                        }
                        if (Boolean.valueOf(z10).booleanValue()) {
                            designation = null;
                        }
                        if (designation != null) {
                            str2 = designation;
                        }
                        robertoTextView3.setText(str2);
                    }
                    String proExperience = proCoachModel2.getProExperience();
                    if (proExperience != null && (robertoTextView = (RobertoTextView) proDashboardActivity.u0(R.id.proDbTherapistInfoPoint1)) != null) {
                        robertoTextView.setText(proExperience);
                    }
                    if (proCoachModel2.getImage() != null) {
                        com.bumptech.glide.f d10 = Glide.c(proDashboardActivity).d(proDashboardActivity);
                        if (r.J0(proCoachModel2.getImage(), "https:")) {
                            str = proCoachModel2.getImage();
                        } else {
                            str = "https:" + proCoachModel2.getImage();
                        }
                        d10.p(str).B((AppCompatImageView) proDashboardActivity.u0(R.id.proDbTherapistInfoImage));
                    }
                    RobertoTextView robertoTextView4 = (RobertoTextView) proDashboardActivity.u0(R.id.proDbTherapistInfoPoint2);
                    if (robertoTextView4 != null) {
                        robertoTextView4.setText(proCoachModel2.getProfileStatement());
                    }
                    RobertoTextView robertoTextView5 = (RobertoTextView) proDashboardActivity.u0(R.id.proDbTherapistInfoPoint3);
                    if (robertoTextView5 != null) {
                        robertoTextView5.setText(proCoachModel2.getPhilosophy());
                    }
                    chatUser.setKey(proCoachModel2.getFirebaseid());
                    chatUser.setFirstName(proCoachModel2.getFirstname());
                    chatUser.setLastName(proCoachModel2.getLastname());
                    chatUser.setProfile_path(proCoachModel2.getImage());
                    ConstraintLayout constraintLayout = (ConstraintLayout) proDashboardActivity.u0(R.id.proDbMessageLayout);
                    if (constraintLayout != null) {
                        constraintLayout.setOnClickListener(new ko.a(proDashboardActivity, 5));
                    }
                    aVar.getClass();
                    v.H(kc.f.H(aVar), null, 0, new no.d(aVar, chatUser, null), 3);
                    proDashboardActivity.C = proCoachModel2.getProIntro();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<ArrayList<Goal>, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ArrayList<Goal> arrayList) {
            ArrayList<Goal> arrayList2 = arrayList;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            if (arrayList2 != null) {
                try {
                    ArrayList<SimpleGoalModel> arrayList3 = proDashboardActivity.f11527y;
                    ArrayList arrayList4 = new ArrayList(is.i.H1(arrayList2, 10));
                    for (Goal goal : arrayList2) {
                        String goalId = goal.getGoalId();
                        String str = "";
                        if (goalId == null) {
                            goalId = "";
                        }
                        String courseId = goal.getCourseId();
                        if (courseId != null) {
                            str = courseId;
                        }
                        long j10 = 1000;
                        arrayList4.add(new SimpleGoalModel(goalId, str, new Date(goal.getStartDate().getTime() * j10), new Date(goal.getEndDate().getTime() * j10)));
                    }
                    arrayList3.addAll(arrayList4);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Integer num) {
            int intValue;
            Integer num2 = num;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            if (num2 == null) {
                intValue = -1;
            } else {
                try {
                    intValue = num2.intValue();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
                }
            }
            int i6 = ProDashboardActivity.F;
            proDashboardActivity.w0(intValue);
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public g() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            if (bool2 != null) {
                try {
                    if (bool2.booleanValue()) {
                        RobertoTextView robertoTextView = (RobertoTextView) proDashboardActivity.u0(R.id.proDbGoalsAlertText);
                        if (robertoTextView != null) {
                            robertoTextView.setVisibility(0);
                        }
                        ApplicationPersistence.getInstance().setBooleanValue("pro_db_new_goals", true);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.l<List<? extends CoachModelTracker>, hs.k> {
        public h() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends CoachModelTracker> list) {
            List<? extends CoachModelTracker> list2 = list;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            try {
                proDashboardActivity.A.clear();
                if (list2 != null) {
                    for (CoachModelTracker coachModelTracker : list2) {
                        proDashboardActivity.A.add(coachModelTracker.getCourse());
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {
        public i() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Integer num) {
            RobertoTextView robertoTextView;
            Integer num2 = num;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            if (num2 != null) {
                try {
                    if (ApplicationPersistence.getInstance().getIntValue("pro_db_new_course_trackers", 0) < num2.intValue() && (robertoTextView = (RobertoTextView) proDashboardActivity.u0(R.id.proDbTrackerAlertText)) != null) {
                        robertoTextView.setVisibility(0);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public j() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean isActive = bool;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            try {
                kotlin.jvm.internal.i.f(isActive, "isActive");
                proDashboardActivity.B = isActive.booleanValue();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public k() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean it = bool;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            try {
                kotlin.jvm.internal.i.f(it, "it");
                if (it.booleanValue()) {
                    long longValue = ApplicationPersistence.getInstance().getLongValue("pro_db_new_multi_tracker", 0L);
                    Utils utils = Utils.INSTANCE;
                    if (longValue != utils.getTodayTimeInSeconds()) {
                        RobertoTextView robertoTextView = (RobertoTextView) proDashboardActivity.u0(R.id.proDbMultiTrackerAlertText);
                        if (robertoTextView != null) {
                            robertoTextView.setVisibility(0);
                        }
                        ApplicationPersistence.getInstance().setLongValue("pro_db_new_multi_tracker", utils.getTodayTimeInSeconds());
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public l() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean isDone = bool;
            ProDashboardActivity proDashboardActivity = ProDashboardActivity.this;
            try {
                kotlin.jvm.internal.i.f(isDone, "isDone");
                boolean booleanValue = isDone.booleanValue();
                int i6 = ProDashboardActivity.F;
                proDashboardActivity.z0(booleanValue);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(proDashboardActivity.f11525w, e10);
            }
            return hs.k.f19476a;
        }
    }

    public static final void v0(ProDashboardActivity proDashboardActivity, int i6) {
        String string;
        proDashboardActivity.getClass();
        if (ApplicationPersistence.getInstance().getBooleanValue("pro_db_assessment_info_show", false)) {
            RobertoTextView robertoTextView = (RobertoTextView) proDashboardActivity.u0(R.id.proDbAssessmentInfo);
            if (robertoTextView != null) {
                robertoTextView.setText(proDashboardActivity.getString(R.string.proDbAssessmentInfo));
                return;
            }
            return;
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) proDashboardActivity.u0(R.id.proDbAssessmentInfo);
        if (robertoTextView2 != null) {
            if (i6 != 0) {
                if (i6 != 1) {
                    string = proDashboardActivity.getString(R.string.proDbAssessmentPendingPlural, Integer.valueOf(i6));
                } else {
                    string = proDashboardActivity.getString(R.string.proDbAssessmentPendingSingular);
                }
            } else {
                string = proDashboardActivity.getString(R.string.proDbAssessmentDone);
            }
            robertoTextView2.setText(string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0006, B:17:0x0037, B:27:0x0064, B:35:0x008d, B:43:0x00ae, B:47:0x00bd, B:51:0x00cc, B:59:0x00eb, B:61:0x00fa, B:65:0x0106, B:67:0x010e, B:64:0x0103, B:68:0x0118, B:72:0x0124, B:74:0x012c, B:71:0x0121, B:54:0x00d8, B:58:0x00e8, B:50:0x00c9, B:46:0x00ba, B:38:0x009b, B:42:0x00ab, B:30:0x0070, B:31:0x0077, B:34:0x0083, B:20:0x0043, B:21:0x004a, B:24:0x0056, B:10:0x0016, B:11:0x001d, B:14:0x0029), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[Catch: Exception -> 0x0011, TRY_LEAVE, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0006, B:17:0x0037, B:27:0x0064, B:35:0x008d, B:43:0x00ae, B:47:0x00bd, B:51:0x00cc, B:59:0x00eb, B:61:0x00fa, B:65:0x0106, B:67:0x010e, B:64:0x0103, B:68:0x0118, B:72:0x0124, B:74:0x012c, B:71:0x0121, B:54:0x00d8, B:58:0x00e8, B:50:0x00c9, B:46:0x00ba, B:38:0x009b, B:42:0x00ab, B:30:0x0070, B:31:0x0077, B:34:0x0083, B:20:0x0043, B:21:0x004a, B:24:0x0056, B:10:0x0016, B:11:0x001d, B:14:0x0029), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0006, B:17:0x0037, B:27:0x0064, B:35:0x008d, B:43:0x00ae, B:47:0x00bd, B:51:0x00cc, B:59:0x00eb, B:61:0x00fa, B:65:0x0106, B:67:0x010e, B:64:0x0103, B:68:0x0118, B:72:0x0124, B:74:0x012c, B:71:0x0121, B:54:0x00d8, B:58:0x00e8, B:50:0x00c9, B:46:0x00ba, B:38:0x009b, B:42:0x00ab, B:30:0x0070, B:31:0x0077, B:34:0x0083, B:20:0x0043, B:21:0x004a, B:24:0x0056, B:10:0x0016, B:11:0x001d, B:14:0x0029), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0006, B:17:0x0037, B:27:0x0064, B:35:0x008d, B:43:0x00ae, B:47:0x00bd, B:51:0x00cc, B:59:0x00eb, B:61:0x00fa, B:65:0x0106, B:67:0x010e, B:64:0x0103, B:68:0x0118, B:72:0x0124, B:74:0x012c, B:71:0x0121, B:54:0x00d8, B:58:0x00e8, B:50:0x00c9, B:46:0x00ba, B:38:0x009b, B:42:0x00ab, B:30:0x0070, B:31:0x0077, B:34:0x0083, B:20:0x0043, B:21:0x004a, B:24:0x0056, B:10:0x0016, B:11:0x001d, B:14:0x0029), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0006, B:17:0x0037, B:27:0x0064, B:35:0x008d, B:43:0x00ae, B:47:0x00bd, B:51:0x00cc, B:59:0x00eb, B:61:0x00fa, B:65:0x0106, B:67:0x010e, B:64:0x0103, B:68:0x0118, B:72:0x0124, B:74:0x012c, B:71:0x0121, B:54:0x00d8, B:58:0x00e8, B:50:0x00c9, B:46:0x00ba, B:38:0x009b, B:42:0x00ab, B:30:0x0070, B:31:0x0077, B:34:0x0083, B:20:0x0043, B:21:0x004a, B:24:0x0056, B:10:0x0016, B:11:0x001d, B:14:0x0029), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0006, B:17:0x0037, B:27:0x0064, B:35:0x008d, B:43:0x00ae, B:47:0x00bd, B:51:0x00cc, B:59:0x00eb, B:61:0x00fa, B:65:0x0106, B:67:0x010e, B:64:0x0103, B:68:0x0118, B:72:0x0124, B:74:0x012c, B:71:0x0121, B:54:0x00d8, B:58:0x00e8, B:50:0x00c9, B:46:0x00ba, B:38:0x009b, B:42:0x00ab, B:30:0x0070, B:31:0x0077, B:34:0x0083, B:20:0x0043, B:21:0x004a, B:24:0x0056, B:10:0x0016, B:11:0x001d, B:14:0x0029), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0006, B:17:0x0037, B:27:0x0064, B:35:0x008d, B:43:0x00ae, B:47:0x00bd, B:51:0x00cc, B:59:0x00eb, B:61:0x00fa, B:65:0x0106, B:67:0x010e, B:64:0x0103, B:68:0x0118, B:72:0x0124, B:74:0x012c, B:71:0x0121, B:54:0x00d8, B:58:0x00e8, B:50:0x00c9, B:46:0x00ba, B:38:0x009b, B:42:0x00ab, B:30:0x0070, B:31:0x0077, B:34:0x0083, B:20:0x0043, B:21:0x004a, B:24:0x0056, B:10:0x0016, B:11:0x001d, B:14:0x0029), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0006, B:17:0x0037, B:27:0x0064, B:35:0x008d, B:43:0x00ae, B:47:0x00bd, B:51:0x00cc, B:59:0x00eb, B:61:0x00fa, B:65:0x0106, B:67:0x010e, B:64:0x0103, B:68:0x0118, B:72:0x0124, B:74:0x012c, B:71:0x0121, B:54:0x00d8, B:58:0x00e8, B:50:0x00c9, B:46:0x00ba, B:38:0x009b, B:42:0x00ab, B:30:0x0070, B:31:0x0077, B:34:0x0083, B:20:0x0043, B:21:0x004a, B:24:0x0056, B:10:0x0016, B:11:0x001d, B:14:0x0029), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0006, B:17:0x0037, B:27:0x0064, B:35:0x008d, B:43:0x00ae, B:47:0x00bd, B:51:0x00cc, B:59:0x00eb, B:61:0x00fa, B:65:0x0106, B:67:0x010e, B:64:0x0103, B:68:0x0118, B:72:0x0124, B:74:0x012c, B:71:0x0121, B:54:0x00d8, B:58:0x00e8, B:50:0x00c9, B:46:0x00ba, B:38:0x009b, B:42:0x00ab, B:30:0x0070, B:31:0x0077, B:34:0x0083, B:20:0x0043, B:21:0x004a, B:24:0x0056, B:10:0x0016, B:11:0x001d, B:14:0x0029), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0006, B:17:0x0037, B:27:0x0064, B:35:0x008d, B:43:0x00ae, B:47:0x00bd, B:51:0x00cc, B:59:0x00eb, B:61:0x00fa, B:65:0x0106, B:67:0x010e, B:64:0x0103, B:68:0x0118, B:72:0x0124, B:74:0x012c, B:71:0x0121, B:54:0x00d8, B:58:0x00e8, B:50:0x00c9, B:46:0x00ba, B:38:0x009b, B:42:0x00ab, B:30:0x0070, B:31:0x0077, B:34:0x0083, B:20:0x0043, B:21:0x004a, B:24:0x0056, B:10:0x0016, B:11:0x001d, B:14:0x0029), top: B:78:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(boolean z10) {
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        RobertoTextView robertoTextView3;
        int i6;
        RobertoTextView robertoTextView4;
        RobertoTextView robertoTextView5;
        RobertoTextView robertoTextView6;
        int i10;
        if (!z10) {
            try {
                if (ApplicationPersistence.getInstance().getBooleanValue("pro_db_goals_info_show", false)) {
                }
                if (!z10 || ApplicationPersistence.getInstance().getBooleanValue("pro_db_tracker_info_show", false)) {
                    if (z10) {
                        ApplicationPersistence.getInstance().setBooleanValue("pro_db_tracker_info_show", true);
                    }
                    robertoTextView = (RobertoTextView) u0(R.id.proDbTrackerInfo);
                    if (robertoTextView == null) {
                        robertoTextView.setText(getString(R.string.proDbNewTrackerInfo));
                    }
                }
                if (!z10 || ApplicationPersistence.getInstance().getBooleanValue("pro_db_assessment_info_show", false)) {
                    if (z10) {
                        ApplicationPersistence.getInstance().setBooleanValue("pro_db_assessment_info_show", true);
                    }
                    robertoTextView2 = (RobertoTextView) u0(R.id.proDbAssessmentInfo);
                    if (robertoTextView2 == null) {
                        robertoTextView2.setText(getString(R.string.proDbAssessmentInfo));
                    }
                }
                robertoTextView3 = (RobertoTextView) u0(R.id.proDbGoalsAlertText);
                if (robertoTextView3 != null) {
                    if (ApplicationPersistence.getInstance().getBooleanValue("pro_db_new_goals", false)) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    robertoTextView3.setVisibility(i6);
                }
                robertoTextView4 = (RobertoTextView) u0(R.id.proDbTrackerAlertText);
                if (robertoTextView4 == null) {
                    robertoTextView4.setVisibility(8);
                }
                robertoTextView5 = (RobertoTextView) u0(R.id.proDbMultiTrackerAlertText);
                if (robertoTextView5 == null) {
                    robertoTextView5.setVisibility(8);
                }
                robertoTextView6 = (RobertoTextView) u0(R.id.proDbMessageInfo);
                if (robertoTextView6 != null) {
                    if (ApplicationPersistence.getInstance().getBooleanValue("pro_db_message_info_show", true)) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    robertoTextView6.setVisibility(i10);
                }
                if (!ApplicationPersistence.getInstance().getBooleanValue("pro_show_video", false)) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) u0(R.id.proDbTherapistPlayButton);
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(0);
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) u0(R.id.proDbTherapistPlayButton);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setOnClickListener(new ko.a(this, 4));
                        return;
                    }
                    return;
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) u0(R.id.proDbTherapistPlayButton);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(8);
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) u0(R.id.proDbTherapistPlayButton);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setOnClickListener(new il.g(22));
                    return;
                }
                return;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11525w, e10);
                return;
            }
        }
        if (z10) {
            ApplicationPersistence.getInstance().setBooleanValue("pro_db_goals_info_show", true);
        }
        RobertoTextView robertoTextView7 = (RobertoTextView) u0(R.id.proDbGoalsInfo);
        if (robertoTextView7 != null) {
            robertoTextView7.setText(getString(R.string.proDbGoalInfo));
        }
        if (!z10) {
        }
        if (z10) {
        }
        robertoTextView = (RobertoTextView) u0(R.id.proDbTrackerInfo);
        if (robertoTextView == null) {
        }
        if (!z10) {
        }
        if (z10) {
        }
        robertoTextView2 = (RobertoTextView) u0(R.id.proDbAssessmentInfo);
        if (robertoTextView2 == null) {
        }
        robertoTextView3 = (RobertoTextView) u0(R.id.proDbGoalsAlertText);
        if (robertoTextView3 != null) {
        }
        robertoTextView4 = (RobertoTextView) u0(R.id.proDbTrackerAlertText);
        if (robertoTextView4 == null) {
        }
        robertoTextView5 = (RobertoTextView) u0(R.id.proDbMultiTrackerAlertText);
        if (robertoTextView5 == null) {
        }
        robertoTextView6 = (RobertoTextView) u0(R.id.proDbMessageInfo);
        if (robertoTextView6 != null) {
        }
        if (!ApplicationPersistence.getInstance().getBooleanValue("pro_show_video", false)) {
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        no.a aVar;
        super.onActivityResult(i6, i10, intent);
        try {
            A0(false);
            if (i6 != 1024) {
                if (i6 != 2048) {
                    if (i6 != 4096) {
                        if (i6 == 8192 && (aVar = this.f11526x) != null) {
                            v.H(kc.f.H(aVar), null, 0, new no.b(aVar, null), 3);
                            return;
                        }
                        return;
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.proDbAssessmentAlertText);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    no.a aVar2 = this.f11526x;
                    if (aVar2 != null) {
                        v.H(kc.f.H(aVar2), null, 0, new no.c(aVar2, null), 3);
                        return;
                    }
                    return;
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) u0(R.id.proDbMessageAlertText);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText("");
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) u0(R.id.proDbMessageAlertText);
                if (robertoTextView3 != null) {
                    robertoTextView3.setVisibility(8);
                }
            } else if (intent != null && intent.getBooleanExtra("values_present", false)) {
                int i11 = -1;
                int intExtra = intent.getIntExtra("tracked", -1);
                int intExtra2 = intent.getIntExtra("total", -1);
                if (intExtra2 > 0) {
                    i11 = intExtra2 - intExtra;
                }
                w0(i11);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11525w, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pro_dashboard);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
                getWindow().setStatusBarColor(g0.a.b(this, R.color.proButtonPink));
            } else {
                getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
            y0();
            A0(getIntent().getBooleanExtra("onboarding_flow", false));
            z0(false);
            x0();
            if (getIntent().hasExtra("user")) {
                startActivityForResult(new Intent(this, CoachChatActivity.class).putExtra("friend", getIntent().getSerializableExtra("user")), Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11525w, e10);
        }
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.E;
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

    public final void w0(int i6) {
        try {
            if (ApplicationPersistence.getInstance().getBooleanValue("pro_db_goals_info_show", false)) {
                RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.proDbGoalsInfo);
                if (robertoTextView != null) {
                    robertoTextView.setText(getString(R.string.proDbGoalInfo));
                }
            } else if (i6 == -1) {
                RobertoTextView robertoTextView2 = (RobertoTextView) u0(R.id.proDbGoalsInfo);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(getString(R.string.proDbGoalNullState));
                }
            } else if (i6 != 0) {
                if (i6 != 1) {
                    RobertoTextView robertoTextView3 = (RobertoTextView) u0(R.id.proDbGoalsInfo);
                    if (robertoTextView3 != null) {
                        robertoTextView3.setText(getString(R.string.proDbGoalMultipleTrack, String.valueOf(i6)));
                    }
                } else {
                    RobertoTextView robertoTextView4 = (RobertoTextView) u0(R.id.proDbGoalsInfo);
                    if (robertoTextView4 != null) {
                        robertoTextView4.setText(getString(R.string.proDbGoalSingleTrack));
                    }
                }
            } else {
                RobertoTextView robertoTextView5 = (RobertoTextView) u0(R.id.proDbGoalsInfo);
                if (robertoTextView5 != null) {
                    robertoTextView5.setText(getString(R.string.proDbGoalAllTracked));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11525w, e10);
        }
    }

    public final void x0() {
        try {
            AppCompatImageView appCompatImageView = (AppCompatImageView) u0(R.id.proDbTherapistInfoCta);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new ko.a(this, 0));
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) u0(R.id.proDbGoalsLayout);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new ko.a(this, 1));
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) u0(R.id.proDbTrackerLayout);
            if (constraintLayout2 != null) {
                constraintLayout2.setOnClickListener(new ko.a(this, 2));
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) u0(R.id.proDbAssessmentLayout);
            if (constraintLayout3 != null) {
                constraintLayout3.setOnClickListener(new ko.a(this, 3));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11525w, e10);
        }
    }

    public final void y0() {
        try {
            no.a aVar = (no.a) new o0(this, new ok.c(new mo.a())).a(no.a.class);
            this.f11526x = aVar;
            if (aVar != null) {
                aVar.f26678y.e(this, new nn.k(20, new d(aVar)));
                aVar.B.e(this, new nn.k(23, new e()));
                aVar.D.e(this, new nn.k(24, new f()));
                aVar.C.e(this, new nn.k(25, new g()));
                aVar.E.e(this, new nn.k(26, new h()));
                aVar.F.e(this, new nn.k(27, new i()));
                aVar.G.e(this, new nn.k(28, new j()));
                aVar.H.e(this, new nn.k(29, new k()));
                aVar.I.e(this, new ko.b(0, new l()));
                aVar.f26679z.e(this, new ko.b(1, new a()));
                aVar.J.e(this, new nn.k(21, new b()));
                aVar.A.e(this, new nn.k(22, new c()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11525w, e10);
        }
    }

    public final void z0(boolean z10) {
        String string;
        int i6;
        try {
            RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.proDbTrackerText);
            if (robertoTextView != null) {
                robertoTextView.setText(getString(R.string.proDbNewTracker));
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) u0(R.id.proDbTrackerInfo);
            if (robertoTextView2 != null) {
                if (ApplicationPersistence.getInstance().getBooleanValue("pro_db_tracker_info_show", false)) {
                    string = getString(R.string.proDbNewTrackerInfo);
                } else if (this.B) {
                    if (z10) {
                        i6 = R.string.proDbNewTrackerDone;
                    } else {
                        i6 = R.string.proDbNewTrackerTrack;
                    }
                    string = getString(i6);
                } else {
                    string = getString(R.string.proDbNewTrackerNullState);
                }
                robertoTextView2.setText(string);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11525w, e10);
        }
    }
}
