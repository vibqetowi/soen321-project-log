package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
/* compiled from: UserNpsCheckModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/model/NpsGoalIndividualTrack;", "", "track", "", "npsComplete", "", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getNpsComplete", "()Ljava/lang/Boolean;", "setNpsComplete", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTrack", "()Ljava/lang/Integer;", "setTrack", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class NpsGoalIndividualTrack {
    private Boolean npsComplete;
    private Integer track;

    public NpsGoalIndividualTrack() {
        this(null, null, 3, null);
    }

    public final Boolean getNpsComplete() {
        return this.npsComplete;
    }

    public final Integer getTrack() {
        return this.track;
    }

    public final void setNpsComplete(Boolean bool) {
        this.npsComplete = bool;
    }

    public final void setTrack(Integer num) {
        this.track = num;
    }

    public NpsGoalIndividualTrack(Integer num, Boolean bool) {
        this.track = num;
        this.npsComplete = bool;
    }

    public /* synthetic */ NpsGoalIndividualTrack(Integer num, Boolean bool, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : num, (i6 & 2) != 0 ? null : bool);
    }
}
