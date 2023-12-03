package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: UserLibraryModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/theinnerhour/b2b/model/UserLibraryModel;", "", "()V", "audioRankedList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAudioRankedList", "()Ljava/util/ArrayList;", "miniCourseRankedList", "getMiniCourseRankedList", "overAllRankedList", "getOverAllRankedList", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class UserLibraryModel {
    private final ArrayList<String> audioRankedList = new ArrayList<>();
    private final ArrayList<String> miniCourseRankedList = new ArrayList<>();
    private final ArrayList<String> overAllRankedList = new ArrayList<>();

    public final ArrayList<String> getAudioRankedList() {
        return this.audioRankedList;
    }

    public final ArrayList<String> getMiniCourseRankedList() {
        return this.miniCourseRankedList;
    }

    public final ArrayList<String> getOverAllRankedList() {
        return this.overAllRankedList;
    }
}
