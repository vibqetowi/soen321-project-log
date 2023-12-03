package com.theinnerhour.b2b.model;

import kotlin.Metadata;
import kotlin.jvm.internal.d;
import ll.c;
/* compiled from: DashboardLibraryContent.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/model/DashboardLibraryContent;", "", "", "dashboardLibraryHeader", "Ljava/lang/String;", "getDashboardLibraryHeader", "()Ljava/lang/String;", "dashboardLibrarySubHeader", "getDashboardLibrarySubHeader", "dashboardLibraryAsset", "Ljava/lang/Object;", "getDashboardLibraryAsset", "()Ljava/lang/Object;", "Lll/c;", "dashboardLibraryType", "Lll/c;", "getDashboardLibraryType", "()Lll/c;", "", "dashboardLibraryProgress", "Ljava/lang/Integer;", "getDashboardLibraryProgress", "()Ljava/lang/Integer;", "dashboardLibraryProgressMax", "getDashboardLibraryProgressMax", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lll/c;Ljava/lang/Integer;Ljava/lang/Integer;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DashboardLibraryContent {
    private final Object dashboardLibraryAsset;
    private final String dashboardLibraryHeader;
    private final Integer dashboardLibraryProgress;
    private final Integer dashboardLibraryProgressMax;
    private final String dashboardLibrarySubHeader;
    private final c dashboardLibraryType;

    public DashboardLibraryContent(String str, String str2, Object obj, c cVar, Integer num, Integer num2) {
        this.dashboardLibraryHeader = str;
        this.dashboardLibrarySubHeader = str2;
        this.dashboardLibraryAsset = obj;
        this.dashboardLibraryType = cVar;
        this.dashboardLibraryProgress = num;
        this.dashboardLibraryProgressMax = num2;
    }

    public final Object getDashboardLibraryAsset() {
        return this.dashboardLibraryAsset;
    }

    public final String getDashboardLibraryHeader() {
        return this.dashboardLibraryHeader;
    }

    public final Integer getDashboardLibraryProgress() {
        return this.dashboardLibraryProgress;
    }

    public final Integer getDashboardLibraryProgressMax() {
        return this.dashboardLibraryProgressMax;
    }

    public final String getDashboardLibrarySubHeader() {
        return this.dashboardLibrarySubHeader;
    }

    public final c getDashboardLibraryType() {
        return this.dashboardLibraryType;
    }

    public /* synthetic */ DashboardLibraryContent(String str, String str2, Object obj, c cVar, Integer num, Integer num2, int i6, d dVar) {
        this(str, str2, obj, cVar, (i6 & 16) != 0 ? null : num, (i6 & 32) != 0 ? null : num2);
    }
}
