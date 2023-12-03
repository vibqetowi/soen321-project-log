package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: CourseResetModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/network/model/CourseResetModel;", "", "programme", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "firebase_id", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "getFirebase_id", "()Ljava/lang/String;", "getProgramme", "()Ljava/util/ArrayList;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CourseResetModel {
    @b("firebase_id")
    private final String firebase_id;
    @b("programme")
    private final ArrayList<String> programme;

    public CourseResetModel(ArrayList<String> programme, String firebase_id) {
        i.g(programme, "programme");
        i.g(firebase_id, "firebase_id");
        this.programme = programme;
        this.firebase_id = firebase_id;
    }

    public final String getFirebase_id() {
        return this.firebase_id;
    }

    public final ArrayList<String> getProgramme() {
        return this.programme;
    }
}
