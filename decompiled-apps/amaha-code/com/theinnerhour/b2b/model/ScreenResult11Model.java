package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult11Model;", "Ljava/io/Serializable;", "()V", "gratitude_files", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/CompassionLetterStorageModel;", "Lkotlin/collections/ArrayList;", "getGratitude_files", "()Ljava/util/ArrayList;", "setGratitude_files", "(Ljava/util/ArrayList;)V", "gratitude_in_app_letter", "Lcom/theinnerhour/b2b/model/CompassionLetterModel;", "getGratitude_in_app_letter", "setGratitude_in_app_letter", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult11Model implements Serializable {
    private ArrayList<CompassionLetterStorageModel> gratitude_files = new ArrayList<>();
    private ArrayList<CompassionLetterModel> gratitude_in_app_letter = new ArrayList<>();

    public final ArrayList<CompassionLetterStorageModel> getGratitude_files() {
        return this.gratitude_files;
    }

    public final ArrayList<CompassionLetterModel> getGratitude_in_app_letter() {
        return this.gratitude_in_app_letter;
    }

    public final void setGratitude_files(ArrayList<CompassionLetterStorageModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.gratitude_files = arrayList;
    }

    public final void setGratitude_in_app_letter(ArrayList<CompassionLetterModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.gratitude_in_app_letter = arrayList;
    }
}
