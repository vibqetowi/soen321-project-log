package com.theinnerhour.b2b.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.theinnerhour.b2b.model.FirebaseInitialiseListener;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
/* loaded from: classes2.dex */
public class BootCompleteJobScheduler extends JobService implements FirebaseInitialiseListener {
    JobParameters jobParameters;
    private String TAG = getClass().getSimpleName();
    boolean taskCompleted = false;

    private void setAlarms() {
        try {
            for (Goal goal : FirebasePersistence.getInstance().getUserGoals(FirebasePersistence.getInstance().getUser().getCurrentCourse())) {
                if (goal.getType().equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY) || goal.getType().equals("physical_activity")) {
                    if (goal.getNotificationScheduled()) {
                        Utils.INSTANCE.updateActivityNotification(getApplicationContext(), true, goal.getmStartDate().getTime(), goal.getmScheduleDate().getTime(), goal.getType(), goal.getGoalId(), goal.getCourseName(), goal.getGoalName());
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception", e10);
        }
    }

    @Override // com.theinnerhour.b2b.model.FirebaseInitialiseListener
    public void initiliseComplete(boolean z10) {
        setAlarms();
        jobFinished(this.jobParameters, false);
        this.taskCompleted = true;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        this.jobParameters = jobParameters;
        try {
            if (FirebasePersistence.getInstance().getUser() != null) {
                initiliseComplete(true);
                return false;
            }
            FirebasePersistence.getInstance().setFirebaseInitialiseListener(this);
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return !this.taskCompleted;
    }
}
