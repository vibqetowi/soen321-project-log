package com.theinnerhour.b2b.components.dynamicActivities.data;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import v.g;
/* compiled from: N18AListModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/data/N18AListModel;", "", "noOfLoops", "", "duration", "subText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDuration", "()Ljava/lang/String;", "getNoOfLoops", "getSubText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class N18AListModel {
    private final String duration;
    private final String noOfLoops;
    private final String subText;

    public N18AListModel(String str, String str2, String str3) {
        e.u(str, "noOfLoops", str2, "duration", str3, "subText");
        this.noOfLoops = str;
        this.duration = str2;
        this.subText = str3;
    }

    public static /* synthetic */ N18AListModel copy$default(N18AListModel n18AListModel, String str, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = n18AListModel.noOfLoops;
        }
        if ((i6 & 2) != 0) {
            str2 = n18AListModel.duration;
        }
        if ((i6 & 4) != 0) {
            str3 = n18AListModel.subText;
        }
        return n18AListModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.noOfLoops;
    }

    public final String component2() {
        return this.duration;
    }

    public final String component3() {
        return this.subText;
    }

    public final N18AListModel copy(String noOfLoops, String duration, String subText) {
        i.g(noOfLoops, "noOfLoops");
        i.g(duration, "duration");
        i.g(subText, "subText");
        return new N18AListModel(noOfLoops, duration, subText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N18AListModel)) {
            return false;
        }
        N18AListModel n18AListModel = (N18AListModel) obj;
        if (i.b(this.noOfLoops, n18AListModel.noOfLoops) && i.b(this.duration, n18AListModel.duration) && i.b(this.subText, n18AListModel.subText)) {
            return true;
        }
        return false;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getNoOfLoops() {
        return this.noOfLoops;
    }

    public final String getSubText() {
        return this.subText;
    }

    public int hashCode() {
        return this.subText.hashCode() + a.c(this.duration, this.noOfLoops.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("N18AListModel(noOfLoops=");
        sb2.append(this.noOfLoops);
        sb2.append(", duration=");
        sb2.append(this.duration);
        sb2.append(", subText=");
        return g.c(sb2, this.subText, ')');
    }
}
