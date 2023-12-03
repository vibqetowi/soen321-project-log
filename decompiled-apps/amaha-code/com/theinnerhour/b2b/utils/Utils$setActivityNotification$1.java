package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.TemplateModel;
import kotlin.Metadata;
import ss.p;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "success", "Lcom/theinnerhour/b2b/model/TemplateModel;", "templateObj", "Lhs/k;", "invoke", "(ZLcom/theinnerhour/b2b/model/TemplateModel;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Utils$setActivityNotification$1 extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
    final /* synthetic */ Goal $goal;
    final /* synthetic */ boolean $setNotifications;

    /* compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "mcSuccess", "Lcom/theinnerhour/b2b/model/TemplateModel;", "mcTemplateObj", "Lhs/k;", "invoke", "(ZLcom/theinnerhour/b2b/model/TemplateModel;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.theinnerhour.b2b.utils.Utils$setActivityNotification$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, hs.k> {
        final /* synthetic */ Goal $goal;
        final /* synthetic */ boolean $setNotifications;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, Goal goal) {
            super(2);
            this.$setNotifications = z10;
            this.$goal = goal;
        }

        @Override // ss.p
        public /* bridge */ /* synthetic */ hs.k invoke(Boolean bool, TemplateModel templateModel) {
            invoke(bool.booleanValue(), templateModel);
            return hs.k.f19476a;
        }

        public final void invoke(boolean z10, TemplateModel templateModel) {
            if (!z10 || templateModel == null) {
                return;
            }
            Utils utils = Utils.INSTANCE;
            MyApplication a10 = MyApplication.V.a();
            boolean z11 = this.$setNotifications;
            long time = this.$goal.getScheduledDate().getTime() * 1000;
            String type = this.$goal.getType();
            if (type == null) {
                type = "";
            }
            String goalId = this.$goal.getGoalId();
            if (goalId == null) {
                goalId = "";
            }
            String goalName = this.$goal.getGoalName();
            if (goalName == null) {
                goalName = "";
            }
            String courseName = this.$goal.getCourseName();
            if (courseName == null) {
                courseName = "";
            }
            String reminderTitle = templateModel.getReminderTitle();
            if (reminderTitle == null) {
                reminderTitle = "";
            }
            String reminderBody = templateModel.getReminderBody();
            utils.updateV3ActivityNotification(a10, z11, time, type, goalId, goalName, courseName, reminderTitle, reminderBody == null ? "" : reminderBody);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Utils$setActivityNotification$1(boolean z10, Goal goal) {
        super(2);
        this.$setNotifications = z10;
        this.$goal = goal;
    }

    @Override // ss.p
    public /* bridge */ /* synthetic */ hs.k invoke(Boolean bool, TemplateModel templateModel) {
        invoke(bool.booleanValue(), templateModel);
        return hs.k.f19476a;
    }

    public final void invoke(boolean z10, TemplateModel templateModel) {
        if (z10 && templateModel != null) {
            String reminderTitle = templateModel.getReminderTitle();
            boolean z11 = true;
            if ((reminderTitle == null || gv.n.B0(reminderTitle)) ? false : true) {
                String reminderBody = templateModel.getReminderBody();
                if ((reminderBody == null || gv.n.B0(reminderBody)) ? false : false) {
                    Utils utils = Utils.INSTANCE;
                    MyApplication a10 = MyApplication.V.a();
                    boolean z12 = this.$setNotifications;
                    long time = this.$goal.getScheduledDate().getTime() * 1000;
                    String type = this.$goal.getType();
                    String str = type == null ? "" : type;
                    String goalId = this.$goal.getGoalId();
                    String str2 = goalId == null ? "" : goalId;
                    String goalName = this.$goal.getGoalName();
                    String str3 = goalName == null ? "" : goalName;
                    String courseName = this.$goal.getCourseName();
                    String str4 = courseName == null ? "" : courseName;
                    String reminderTitle2 = templateModel.getReminderTitle();
                    String str5 = reminderTitle2 == null ? "" : reminderTitle2;
                    String reminderBody2 = templateModel.getReminderBody();
                    utils.updateV3ActivityNotification(a10, z12, time, str, str2, str3, str4, str5, reminderBody2 == null ? "" : reminderBody2);
                    return;
                }
            }
        }
        String goalId2 = this.$goal.getGoalId();
        kotlin.jvm.internal.i.d(goalId2);
        FireStoreUtilsKt.fetchCourseContent("en", goalId2, new AnonymousClass1(this.$setNotifications, this.$goal));
    }
}
