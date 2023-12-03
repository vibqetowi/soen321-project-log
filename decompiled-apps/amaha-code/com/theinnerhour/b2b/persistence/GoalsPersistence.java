package com.theinnerhour.b2b.persistence;

import android.content.SharedPreferences;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import is.u;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: GoalsPersistence.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002J\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002J\u0016\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002J\u001e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bJ\u0016\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/theinnerhour/b2b/persistence/GoalsPersistence;", "", "", "dateInSeconds", "getStartDayInSecondsForWeekOf", "(J)Ljava/lang/Long;", "", "id", "", "getIsWeeklyGoalIncompleteAndScheduled", "getIsDailyGoalIncompleteAndScheduled", "getIsOneTimeGoalIncompleteAndScheduled", "timeInSeconds", "Lhs/k;", "setDailyGoalTrackDate", "revertDailyGoalTrackDate", "setWeeklyGoalTrackDate", "revertWeeklyGoalTrackDate", "setOneTimeGoalTrackDate", "revertOneTimeGoalTrackDate", "Lcom/theinnerhour/b2b/persistence/GoalsPersistence$Companion$GoalTypePrefix;", "goalType", "isScheduled", "setGoalScheduled", "deleteGoalInfo", "Landroid/content/SharedPreferences;", "goalSharedPreferences", "Landroid/content/SharedPreferences;", "TAG", "Ljava/lang/String;", "<init>", "(Landroid/content/SharedPreferences;)V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class GoalsPersistence {
    public static final Companion Companion = new Companion(null);
    public static final String GOALS_PERSISTENCE_KEY = "goals_persistence";
    private final String TAG;
    private final SharedPreferences goalSharedPreferences;

    /* compiled from: GoalsPersistence.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/theinnerhour/b2b/persistence/GoalsPersistence$Companion;", "", "()V", "GOALS_PERSISTENCE_KEY", "", "GoalTypePrefix", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* compiled from: GoalsPersistence.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/persistence/GoalsPersistence$Companion$GoalTypePrefix;", "", "prefix", "", "schedulePrefix", "trackPrefix", "previousTrackPrefix", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrefix", "()Ljava/lang/String;", "getPreviousTrackPrefix", "getSchedulePrefix", "getTrackPrefix", "DAILY", "WEEKLY", "ONE_TIME", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: classes2.dex */
        public enum GoalTypePrefix {
            DAILY("da_", "sc_da_", "tr_da_", "tr_da_pre_"),
            WEEKLY("we_", "sc_we_", "tr_we_", "tr_we_pre_"),
            ONE_TIME("ot_", "sc_ot_", "tr_ot_", "tr_ot_pre_");
            
            private final String prefix;
            private final String previousTrackPrefix;
            private final String schedulePrefix;
            private final String trackPrefix;

            GoalTypePrefix(String str, String str2, String str3, String str4) {
                this.prefix = str;
                this.schedulePrefix = str2;
                this.trackPrefix = str3;
                this.previousTrackPrefix = str4;
            }

            public final String getPrefix() {
                return this.prefix;
            }

            public final String getPreviousTrackPrefix() {
                return this.previousTrackPrefix;
            }

            public final String getSchedulePrefix() {
                return this.schedulePrefix;
            }

            public final String getTrackPrefix() {
                return this.trackPrefix;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    public GoalsPersistence(SharedPreferences goalSharedPreferences) {
        i.g(goalSharedPreferences, "goalSharedPreferences");
        this.goalSharedPreferences = goalSharedPreferences;
        this.TAG = "GoalsPersistence";
    }

    private final Long getStartDayInSecondsForWeekOf(long j10) {
        ArrayList arrayList = new ArrayList();
        long j11 = 1000;
        long j12 = j10 * j11;
        if (j12 > 0) {
            try {
                Calendar.getInstance().setTimeInMillis(j12);
                int i6 = 0;
                String dayText = LocalDateTime.ofEpochSecond(j12 / j11, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(j12))).format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ENGLISH));
                i.f(dayText, "dayText");
                String substring = dayText.substring(0, 3);
                i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                switch (substring.hashCode()) {
                    case 70909:
                        if (substring.equals("Fri")) {
                            i6 = 4;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    case 77548:
                        if (!substring.equals("Mon")) {
                            i6 = -1;
                            break;
                        }
                        break;
                    case 82886:
                        if (substring.equals("Sat")) {
                            i6 = 5;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    case 83500:
                        if (substring.equals("Sun")) {
                            i6 = 6;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    case 84065:
                        if (substring.equals("Thu")) {
                            i6 = 3;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    case 84452:
                        if (substring.equals("Tue")) {
                            i6 = 1;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    case 86838:
                        if (substring.equals("Wed")) {
                            i6 = 2;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    default:
                        i6 = -1;
                        break;
                }
                while (-1 < i6) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j12);
                    calendar.add(5, i6 * (-1));
                    arrayList.add(calendar);
                    i6--;
                }
                int size = 8 - arrayList.size();
                for (int i10 = 1; i10 < size; i10++) {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(j12);
                    calendar2.add(5, i10);
                    arrayList.add(calendar2);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.TAG, e10);
            }
        }
        Calendar calendar3 = (Calendar) u.i2(arrayList);
        if (calendar3 != null) {
            return Long.valueOf(calendar3.getTimeInMillis() / j11);
        }
        return null;
    }

    public final void deleteGoalInfo(String id2, Companion.GoalTypePrefix goalType) {
        i.g(id2, "id");
        i.g(goalType, "goalType");
        SharedPreferences.Editor edit = this.goalSharedPreferences.edit();
        edit.remove(goalType.getSchedulePrefix() + id2);
        edit.remove(goalType.getTrackPrefix() + id2);
        edit.remove(goalType.getPreviousTrackPrefix() + id2);
        edit.commit();
    }

    public final boolean getIsDailyGoalIncompleteAndScheduled(String id2) {
        i.g(id2, "id");
        SharedPreferences sharedPreferences = this.goalSharedPreferences;
        StringBuilder sb2 = new StringBuilder();
        Companion.GoalTypePrefix goalTypePrefix = Companion.GoalTypePrefix.DAILY;
        sb2.append(goalTypePrefix.getSchedulePrefix());
        sb2.append(id2);
        if (!sharedPreferences.contains(sb2.toString())) {
            SharedPreferences sharedPreferences2 = this.goalSharedPreferences;
            if (!sharedPreferences2.contains(goalTypePrefix.getTrackPrefix() + id2)) {
                return true;
            }
        }
        SharedPreferences sharedPreferences3 = this.goalSharedPreferences;
        boolean z10 = sharedPreferences3.getBoolean(goalTypePrefix.getSchedulePrefix() + id2, false);
        SharedPreferences sharedPreferences4 = this.goalSharedPreferences;
        long j10 = sharedPreferences4.getLong(goalTypePrefix.getTrackPrefix() + id2, 0L);
        if (z10 && j10 < Utils.INSTANCE.getTodayCalendar().getTime().getTime()) {
            return true;
        }
        return false;
    }

    public final boolean getIsOneTimeGoalIncompleteAndScheduled(String id2) {
        i.g(id2, "id");
        SharedPreferences sharedPreferences = this.goalSharedPreferences;
        StringBuilder sb2 = new StringBuilder();
        Companion.GoalTypePrefix goalTypePrefix = Companion.GoalTypePrefix.ONE_TIME;
        sb2.append(goalTypePrefix.getSchedulePrefix());
        sb2.append(id2);
        if (!sharedPreferences.contains(sb2.toString())) {
            SharedPreferences sharedPreferences2 = this.goalSharedPreferences;
            if (!sharedPreferences2.contains(goalTypePrefix.getTrackPrefix() + id2)) {
                return true;
            }
        }
        SharedPreferences sharedPreferences3 = this.goalSharedPreferences;
        boolean z10 = sharedPreferences3.getBoolean(goalTypePrefix.getSchedulePrefix() + id2, false);
        SharedPreferences sharedPreferences4 = this.goalSharedPreferences;
        long j10 = sharedPreferences4.getLong(goalTypePrefix.getTrackPrefix() + id2, 0L);
        if (z10 && j10 == 0) {
            return true;
        }
        return false;
    }

    public final boolean getIsWeeklyGoalIncompleteAndScheduled(String id2) {
        Companion.GoalTypePrefix goalTypePrefix;
        long j10;
        i.g(id2, "id");
        SharedPreferences sharedPreferences = this.goalSharedPreferences;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Companion.GoalTypePrefix.WEEKLY.getSchedulePrefix());
        sb2.append(id2);
        if (!sharedPreferences.contains(sb2.toString())) {
            if (!this.goalSharedPreferences.contains(goalTypePrefix.getTrackPrefix() + id2)) {
                return true;
            }
        }
        boolean z10 = this.goalSharedPreferences.getBoolean(goalTypePrefix.getSchedulePrefix() + id2, false);
        long j11 = 0;
        long j12 = this.goalSharedPreferences.getLong(goalTypePrefix.getTrackPrefix() + id2, 0L);
        if (z10) {
            if (j12 == 0) {
                return true;
            }
            Long startDayInSecondsForWeekOf = getStartDayInSecondsForWeekOf(j12);
            if (startDayInSecondsForWeekOf != null) {
                j10 = startDayInSecondsForWeekOf.longValue();
            } else {
                j10 = 0;
            }
            Long startDayInSecondsForWeekOf2 = getStartDayInSecondsForWeekOf(Utils.INSTANCE.getTodayCalendar().getTime().getTime() / 1000);
            if (startDayInSecondsForWeekOf2 != null) {
                j11 = startDayInSecondsForWeekOf2.longValue();
            }
            if (j10 < j11) {
                return true;
            }
        }
        return false;
    }

    public final void revertDailyGoalTrackDate(String id2, long j10) {
        Companion.GoalTypePrefix goalTypePrefix;
        boolean z10;
        i.g(id2, "id");
        SharedPreferences sharedPreferences = this.goalSharedPreferences;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Companion.GoalTypePrefix.DAILY.getTrackPrefix());
        sb2.append(id2);
        Long valueOf = Long.valueOf(sharedPreferences.getLong(sb2.toString(), 0L));
        boolean z11 = true;
        if (valueOf.longValue() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Long l2 = null;
        if (z10) {
            valueOf = null;
        }
        if (valueOf != null && valueOf.longValue() > j10) {
            return;
        }
        SharedPreferences.Editor edit = this.goalSharedPreferences.edit();
        Long valueOf2 = Long.valueOf(this.goalSharedPreferences.getLong(goalTypePrefix.getPreviousTrackPrefix() + id2, 0L));
        if (valueOf2.longValue() != 0) {
            z11 = false;
        }
        if (!z11) {
            l2 = valueOf2;
        }
        if (l2 != null) {
            edit.putLong(goalTypePrefix.getTrackPrefix() + id2, l2.longValue());
            edit.remove(goalTypePrefix.getPreviousTrackPrefix() + id2);
        } else {
            edit.remove(goalTypePrefix.getTrackPrefix() + id2);
        }
        edit.commit();
    }

    public final void revertOneTimeGoalTrackDate(String id2, long j10) {
        i.g(id2, "id");
        SharedPreferences.Editor edit = this.goalSharedPreferences.edit();
        edit.remove(Companion.GoalTypePrefix.ONE_TIME.getTrackPrefix() + id2);
        edit.commit();
    }

    public final void revertWeeklyGoalTrackDate(String id2, long j10) {
        Companion.GoalTypePrefix goalTypePrefix;
        boolean z10;
        long j11;
        long j12;
        i.g(id2, "id");
        SharedPreferences sharedPreferences = this.goalSharedPreferences;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Companion.GoalTypePrefix.WEEKLY.getTrackPrefix());
        sb2.append(id2);
        Long valueOf = Long.valueOf(sharedPreferences.getLong(sb2.toString(), 0L));
        boolean z11 = true;
        if (valueOf.longValue() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Long l2 = null;
        if (z10) {
            valueOf = null;
        }
        if (valueOf != null) {
            Long startDayInSecondsForWeekOf = getStartDayInSecondsForWeekOf(valueOf.longValue());
            Long startDayInSecondsForWeekOf2 = getStartDayInSecondsForWeekOf(j10);
            if (startDayInSecondsForWeekOf != null) {
                j11 = startDayInSecondsForWeekOf.longValue();
            } else {
                j11 = 0;
            }
            if (startDayInSecondsForWeekOf2 != null) {
                j12 = startDayInSecondsForWeekOf2.longValue();
            } else {
                j12 = 0;
            }
            if (j11 > j12) {
                return;
            }
        }
        SharedPreferences.Editor edit = this.goalSharedPreferences.edit();
        Long valueOf2 = Long.valueOf(this.goalSharedPreferences.getLong(goalTypePrefix.getPreviousTrackPrefix() + id2, 0L));
        if (valueOf2.longValue() != 0) {
            z11 = false;
        }
        if (!z11) {
            l2 = valueOf2;
        }
        if (l2 != null) {
            edit.putLong(goalTypePrefix.getTrackPrefix() + id2, l2.longValue());
            edit.remove(goalTypePrefix.getPreviousTrackPrefix() + id2);
        } else {
            edit.remove(goalTypePrefix.getTrackPrefix() + id2);
        }
        edit.commit();
    }

    public final void setDailyGoalTrackDate(String id2, long j10) {
        boolean z10;
        i.g(id2, "id");
        SharedPreferences sharedPreferences = this.goalSharedPreferences;
        StringBuilder sb2 = new StringBuilder();
        Companion.GoalTypePrefix goalTypePrefix = Companion.GoalTypePrefix.DAILY;
        sb2.append(goalTypePrefix.getTrackPrefix());
        sb2.append(id2);
        Long valueOf = Long.valueOf(sharedPreferences.getLong(sb2.toString(), 0L));
        if (valueOf.longValue() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            valueOf = null;
        }
        if (valueOf != null && valueOf.longValue() > j10) {
            return;
        }
        SharedPreferences.Editor edit = this.goalSharedPreferences.edit();
        if (valueOf != null) {
            edit.putLong(goalTypePrefix.getPreviousTrackPrefix() + id2, valueOf.longValue());
        }
        edit.putLong(goalTypePrefix.getTrackPrefix() + id2, j10);
        edit.commit();
    }

    public final void setGoalScheduled(String id2, Companion.GoalTypePrefix goalType, boolean z10) {
        i.g(id2, "id");
        i.g(goalType, "goalType");
        SharedPreferences.Editor edit = this.goalSharedPreferences.edit();
        edit.putBoolean(goalType.getSchedulePrefix() + id2, z10);
        edit.commit();
    }

    public final void setOneTimeGoalTrackDate(String id2, long j10) {
        i.g(id2, "id");
        SharedPreferences.Editor edit = this.goalSharedPreferences.edit();
        edit.putLong(Companion.GoalTypePrefix.ONE_TIME.getTrackPrefix() + id2, j10);
        edit.commit();
    }

    public final void setWeeklyGoalTrackDate(String id2, long j10) {
        Companion.GoalTypePrefix goalTypePrefix;
        boolean z10;
        long j11;
        i.g(id2, "id");
        SharedPreferences sharedPreferences = this.goalSharedPreferences;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Companion.GoalTypePrefix.WEEKLY.getTrackPrefix());
        sb2.append(id2);
        long j12 = 0;
        Long valueOf = Long.valueOf(sharedPreferences.getLong(sb2.toString(), 0L));
        if (valueOf.longValue() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            valueOf = null;
        }
        if (valueOf != null) {
            Long startDayInSecondsForWeekOf = getStartDayInSecondsForWeekOf(valueOf.longValue());
            Long startDayInSecondsForWeekOf2 = getStartDayInSecondsForWeekOf(j10);
            if (startDayInSecondsForWeekOf != null) {
                j11 = startDayInSecondsForWeekOf.longValue();
            } else {
                j11 = 0;
            }
            if (startDayInSecondsForWeekOf2 != null) {
                j12 = startDayInSecondsForWeekOf2.longValue();
            }
            if (j11 > j12) {
                return;
            }
        }
        SharedPreferences.Editor edit = this.goalSharedPreferences.edit();
        if (valueOf != null) {
            edit.putLong(goalTypePrefix.getPreviousTrackPrefix() + id2, valueOf.longValue());
        }
        edit.putLong(goalTypePrefix.getTrackPrefix() + id2, j10);
        edit.commit();
    }
}
