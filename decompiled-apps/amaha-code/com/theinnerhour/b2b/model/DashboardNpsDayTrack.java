package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: UserNpsCheckModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\u0002\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/theinnerhour/b2b/model/DashboardNpsDayTrack;", "", "lastAppOpenDay", "", "appOpenDayCount", "", "nps", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/NpsDayTrack;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Long;ILjava/util/ArrayList;)V", "getAppOpenDayCount", "()I", "setAppOpenDayCount", "(I)V", "getLastAppOpenDay", "()Ljava/lang/Long;", "setLastAppOpenDay", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getNps", "()Ljava/util/ArrayList;", "setNps", "(Ljava/util/ArrayList;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class DashboardNpsDayTrack {
    private int appOpenDayCount;
    private Long lastAppOpenDay;
    private ArrayList<NpsDayTrack> nps;

    public DashboardNpsDayTrack() {
        this(null, 0, null, 7, null);
    }

    public final int getAppOpenDayCount() {
        return this.appOpenDayCount;
    }

    public final Long getLastAppOpenDay() {
        return this.lastAppOpenDay;
    }

    public final ArrayList<NpsDayTrack> getNps() {
        return this.nps;
    }

    public final void setAppOpenDayCount(int i6) {
        this.appOpenDayCount = i6;
    }

    public final void setLastAppOpenDay(Long l2) {
        this.lastAppOpenDay = l2;
    }

    public final void setNps(ArrayList<NpsDayTrack> arrayList) {
        i.g(arrayList, "<set-?>");
        this.nps = arrayList;
    }

    public DashboardNpsDayTrack(Long l2, int i6, ArrayList<NpsDayTrack> nps) {
        i.g(nps, "nps");
        this.lastAppOpenDay = l2;
        this.appOpenDayCount = i6;
        this.nps = nps;
    }

    public /* synthetic */ DashboardNpsDayTrack(Long l2, int i6, ArrayList arrayList, int i10, d dVar) {
        this((i10 & 1) != 0 ? null : l2, (i10 & 2) != 0 ? 0 : i6, (i10 & 4) != 0 ? new ArrayList() : arrayList);
    }
}
