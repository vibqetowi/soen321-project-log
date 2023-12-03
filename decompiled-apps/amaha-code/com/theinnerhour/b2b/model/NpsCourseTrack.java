package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: UserNpsCheckModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bR*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/model/NpsCourseTrack;", "", "slug", "", "nps", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/NpsDayTrack;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getNps", "()Ljava/util/ArrayList;", "setNps", "(Ljava/util/ArrayList;)V", "getSlug", "()Ljava/lang/String;", "setSlug", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class NpsCourseTrack {
    private ArrayList<NpsDayTrack> nps;
    private String slug;

    public NpsCourseTrack() {
        this(null, null, 3, null);
    }

    public final ArrayList<NpsDayTrack> getNps() {
        return this.nps;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final void setNps(ArrayList<NpsDayTrack> arrayList) {
        i.g(arrayList, "<set-?>");
        this.nps = arrayList;
    }

    public final void setSlug(String str) {
        this.slug = str;
    }

    public NpsCourseTrack(String str, ArrayList<NpsDayTrack> nps) {
        i.g(nps, "nps");
        this.slug = str;
        this.nps = nps;
    }

    public /* synthetic */ NpsCourseTrack(String str, ArrayList arrayList, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? new ArrayList() : arrayList);
    }
}
