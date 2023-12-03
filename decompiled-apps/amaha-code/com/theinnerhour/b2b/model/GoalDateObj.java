package com.theinnerhour.b2b.model;

import com.google.firebase.database.Exclude;
import fe.i;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: GoalDateObj.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b#\u0010$B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b#\u0010%B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b#\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/theinnerhour/b2b/model/GoalDateObj;", "", "Ljava/util/Date;", "getmDate", "mDate", "Lhs/k;", "setmDate", "Ljava/util/Date;", "Lcom/theinnerhour/b2b/model/CustomDate;", "date", "Lcom/theinnerhour/b2b/model/CustomDate;", "getDate", "()Lcom/theinnerhour/b2b/model/CustomDate;", "setDate", "(Lcom/theinnerhour/b2b/model/CustomDate;)V", "", "val", "I", "getVal", "()I", "setVal", "(I)V", "", "completionTimeInSeconds", "Ljava/lang/Long;", "getCompletionTimeInSeconds", "()Ljava/lang/Long;", "setCompletionTimeInSeconds", "(Ljava/lang/Long;)V", "", "isConsecutive3DaysHP", "Z", "()Z", "setConsecutive3DaysHP", "(Z)V", "<init>", "()V", "(Ljava/util/Date;I)V", "(Ljava/util/Date;IJ)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class GoalDateObj {
    private Long completionTimeInSeconds;
    private CustomDate date;
    private boolean isConsecutive3DaysHP;
    @Exclude
    @i
    private Date mDate;
    private int val;

    public GoalDateObj() {
        this.date = new CustomDate();
    }

    public final Long getCompletionTimeInSeconds() {
        return this.completionTimeInSeconds;
    }

    public final CustomDate getDate() {
        return this.date;
    }

    public final int getVal() {
        return this.val;
    }

    @Exclude
    @i
    public final Date getmDate() {
        if (this.mDate == null) {
            this.mDate = new Date(this.date.getTime() * 1000);
        }
        Date date = this.mDate;
        kotlin.jvm.internal.i.d(date);
        return date;
    }

    public final boolean isConsecutive3DaysHP() {
        return this.isConsecutive3DaysHP;
    }

    public final void setCompletionTimeInSeconds(Long l2) {
        this.completionTimeInSeconds = l2;
    }

    public final void setConsecutive3DaysHP(boolean z10) {
        this.isConsecutive3DaysHP = z10;
    }

    public final void setDate(CustomDate customDate) {
        kotlin.jvm.internal.i.g(customDate, "<set-?>");
        this.date = customDate;
    }

    public final void setVal(int i6) {
        this.val = i6;
    }

    @Exclude
    @i
    public final void setmDate(Date mDate) {
        kotlin.jvm.internal.i.g(mDate, "mDate");
        this.mDate = mDate;
        this.date.setTime(mDate.getTime());
    }

    public GoalDateObj(Date mDate, int i6) {
        kotlin.jvm.internal.i.g(mDate, "mDate");
        this.date = new CustomDate();
        setmDate(mDate);
        this.val = i6;
    }

    public GoalDateObj(Date mDate, int i6, long j10) {
        kotlin.jvm.internal.i.g(mDate, "mDate");
        this.date = new CustomDate();
        setmDate(mDate);
        this.val = i6;
        this.completionTimeInSeconds = Long.valueOf(j10);
    }
}
