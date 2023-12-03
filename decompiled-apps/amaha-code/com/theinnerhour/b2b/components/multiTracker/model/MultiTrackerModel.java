package com.theinnerhour.b2b.components.multiTracker.model;

import com.appsflyer.R;
import com.google.firebase.database.Exclude;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.utils.Constants;
import fe.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: MultiTrackerModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B_\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR&\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8G@GX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0010R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010¨\u0006*"}, d2 = {"Lcom/theinnerhour/b2b/components/multiTracker/model/MultiTrackerModel;", "Ljava/io/Serializable;", "()V", "mood", "", "positiveEmotions", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "negativeEmotions", Constants.SCREEN_ACTIVITIES, "log", "(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)V", "getActivities", "()Ljava/util/ArrayList;", "setActivities", "(Ljava/util/ArrayList;)V", "date", "Lcom/theinnerhour/b2b/model/CustomDate;", "getDate", "()Lcom/theinnerhour/b2b/model/CustomDate;", "setDate", "(Lcom/theinnerhour/b2b/model/CustomDate;)V", "getLog", "()Ljava/lang/String;", "setLog", "(Ljava/lang/String;)V", "<set-?>", "Ljava/util/Date;", "mDate", "getMDate", "()Ljava/util/Date;", "setMDate", "(Ljava/util/Date;)V", "getMood", "()I", "setMood", "(I)V", "getNegativeEmotions", "setNegativeEmotions", "getPositiveEmotions", "setPositiveEmotions", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MultiTrackerModel implements Serializable {
    private ArrayList<String> activities;
    private CustomDate date;
    private String log;
    @Exclude
    @i
    private Date mDate;
    private int mood;
    private ArrayList<String> negativeEmotions;
    private ArrayList<String> positiveEmotions;

    public MultiTrackerModel(int i6, ArrayList<String> positiveEmotions, ArrayList<String> negativeEmotions, ArrayList<String> activities, String str) {
        kotlin.jvm.internal.i.g(positiveEmotions, "positiveEmotions");
        kotlin.jvm.internal.i.g(negativeEmotions, "negativeEmotions");
        kotlin.jvm.internal.i.g(activities, "activities");
        this.mood = i6;
        this.positiveEmotions = positiveEmotions;
        this.negativeEmotions = negativeEmotions;
        this.activities = activities;
        this.log = str;
        Date time = Calendar.getInstance().getTime();
        kotlin.jvm.internal.i.f(time, "getInstance().time");
        this.mDate = time;
        CustomDate customDate = new CustomDate();
        this.date = customDate;
        customDate.setTime(this.mDate.getTime());
    }

    public final ArrayList<String> getActivities() {
        return this.activities;
    }

    public final CustomDate getDate() {
        return this.date;
    }

    public final String getLog() {
        return this.log;
    }

    @Exclude
    @i
    public final Date getMDate() {
        return this.mDate;
    }

    public final int getMood() {
        return this.mood;
    }

    public final ArrayList<String> getNegativeEmotions() {
        return this.negativeEmotions;
    }

    public final ArrayList<String> getPositiveEmotions() {
        return this.positiveEmotions;
    }

    public final void setActivities(ArrayList<String> arrayList) {
        kotlin.jvm.internal.i.g(arrayList, "<set-?>");
        this.activities = arrayList;
    }

    public final void setDate(CustomDate customDate) {
        kotlin.jvm.internal.i.g(customDate, "<set-?>");
        this.date = customDate;
    }

    public final void setLog(String str) {
        this.log = str;
    }

    @Exclude
    @i
    public final void setMDate(Date date) {
        kotlin.jvm.internal.i.g(date, "<set-?>");
        this.mDate = date;
    }

    public final void setMood(int i6) {
        this.mood = i6;
    }

    public final void setNegativeEmotions(ArrayList<String> arrayList) {
        kotlin.jvm.internal.i.g(arrayList, "<set-?>");
        this.negativeEmotions = arrayList;
    }

    public final void setPositiveEmotions(ArrayList<String> arrayList) {
        kotlin.jvm.internal.i.g(arrayList, "<set-?>");
        this.positiveEmotions = arrayList;
    }

    public MultiTrackerModel() {
        this(0, new ArrayList(), new ArrayList(), new ArrayList(), null);
    }
}
