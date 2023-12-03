package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: UserNpsCheckModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bR*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/model/NpsGoalTrack;", "", "trackCount", "", "nps", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/NpsGoalIndividualTrack;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/util/ArrayList;)V", "getNps", "()Ljava/util/ArrayList;", "setNps", "(Ljava/util/ArrayList;)V", "getTrackCount", "()Ljava/lang/Integer;", "setTrackCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class NpsGoalTrack {
    private ArrayList<NpsGoalIndividualTrack> nps;
    private Integer trackCount;

    public NpsGoalTrack() {
        this(null, null, 3, null);
    }

    public final ArrayList<NpsGoalIndividualTrack> getNps() {
        return this.nps;
    }

    public final Integer getTrackCount() {
        return this.trackCount;
    }

    public final void setNps(ArrayList<NpsGoalIndividualTrack> arrayList) {
        i.g(arrayList, "<set-?>");
        this.nps = arrayList;
    }

    public final void setTrackCount(Integer num) {
        this.trackCount = num;
    }

    public NpsGoalTrack(Integer num, ArrayList<NpsGoalIndividualTrack> nps) {
        i.g(nps, "nps");
        this.trackCount = num;
        this.nps = nps;
    }

    public /* synthetic */ NpsGoalTrack(Integer num, ArrayList arrayList, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : num, (i6 & 2) != 0 ? new ArrayList() : arrayList);
    }
}
