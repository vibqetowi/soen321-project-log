package com.theinnerhour.b2b.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
import java.util.Calendar;
import kotlin.Metadata;
import ss.p;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "success", "Lhs/f;", "", "descPair", "Lhs/k;", "invoke", "(ZLhs/f;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Utils$updateActivityNotificationDynamicRA$1 extends kotlin.jvm.internal.k implements p<Boolean, hs.f<? extends String, ? extends String>, hs.k> {
    final /* synthetic */ String $courseName;
    final /* synthetic */ String $goalId;
    final /* synthetic */ String $goalName;
    final /* synthetic */ long $goalScheduleTime;
    final /* synthetic */ long $goalStartTime;
    final /* synthetic */ String $goalType;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ Calendar $scheduleCalendar;
    final /* synthetic */ boolean $setAlarm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Utils$updateActivityNotificationDynamicRA$1(Intent intent, String str, long j10, long j11, String str2, String str3, boolean z10, String str4, Calendar calendar) {
        super(2);
        this.$intent = intent;
        this.$goalId = str;
        this.$goalStartTime = j10;
        this.$goalScheduleTime = j11;
        this.$goalType = str2;
        this.$courseName = str3;
        this.$setAlarm = z10;
        this.$goalName = str4;
        this.$scheduleCalendar = calendar;
    }

    @Override // ss.p
    public /* bridge */ /* synthetic */ hs.k invoke(Boolean bool, hs.f<? extends String, ? extends String> fVar) {
        invoke(bool.booleanValue(), (hs.f<String, String>) fVar);
        return hs.k.f19476a;
    }

    public final void invoke(boolean z10, hs.f<String, String> fVar) {
        if (!z10 || fVar == null) {
            return;
        }
        Intent intent = this.$intent;
        String str = fVar.f19464u;
        intent.putExtra(Constants.GOAL_NAME, str);
        Intent intent2 = this.$intent;
        String str2 = fVar.f19465v;
        intent2.putExtra(Constants.GOAL_DESC, str2);
        this.$intent.putExtra(Constants.GOAL_ID, this.$goalId);
        this.$intent.putExtra(Constants.GOAL_START_TIME, this.$goalStartTime);
        this.$intent.putExtra(Constants.GOAL_SCEHDULE_TIME, this.$goalScheduleTime);
        this.$intent.putExtra(Constants.GOAL_TYPE, this.$goalType);
        this.$intent.putExtra(Constants.COURSE_NAME, this.$courseName);
        MyApplication.a aVar = MyApplication.V;
        MyApplication a10 = aVar.a();
        Utils utils = Utils.INSTANCE;
        int intFromString = utils.getIntFromString(this.$goalId + this.$courseName);
        Intent intent3 = this.$intent;
        int i6 = Build.VERSION.SDK_INT;
        PendingIntent broadcast = PendingIntent.getBroadcast(a10, intFromString, intent3, i6 >= 23 ? 201326592 : 134217728);
        Object systemService = aVar.a().getSystemService("alarm");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        if (this.$setAlarm) {
            aVar.a().b().addGoal(this.$goalId, this.$goalName, this.$goalType, this.$courseName, str, str2, this.$goalScheduleTime, GoalsNotificationPersistence.GOALS_NOTIF_DYNAMIC_RA);
            if (i6 >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, this.$goalScheduleTime, broadcast);
                return;
            } else {
                alarmManager.setExact(0, this.$goalScheduleTime, broadcast);
                return;
            }
        }
        Utils.unscheduleActivity$default(utils, alarmManager, this.$scheduleCalendar, this.$goalStartTime, this.$goalScheduleTime, this.$goalType, this.$goalId, this.$courseName, this.$goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
        this.$scheduleCalendar.add(5, -1);
        Utils.unscheduleActivity$default(utils, alarmManager, this.$scheduleCalendar, this.$goalStartTime, this.$goalScheduleTime, this.$goalType, this.$goalId, this.$courseName, this.$goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
        this.$scheduleCalendar.add(5, 2);
        Utils.unscheduleActivity$default(utils, alarmManager, this.$scheduleCalendar, this.$goalStartTime, this.$goalScheduleTime, this.$goalType, this.$goalId, this.$courseName, this.$goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
        ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
        applicationPersistence.setLongValue(this.$goalId + '-' + this.$courseName, 0L);
        aVar.a().b().removeGoal(this.$goalId);
    }
}
