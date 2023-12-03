package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: JournalThoughtModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R.\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/FeelingsList;", "", "title", "", "feelings", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/journal/model/Feelings;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getFeelings", "()Ljava/util/ArrayList;", "setFeelings", "(Ljava/util/ArrayList;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class FeelingsList {
    @b("feelings")
    private ArrayList<Feelings> feelings;
    @b("title")
    private String title;

    public FeelingsList() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeelingsList copy$default(FeelingsList feelingsList, String str, ArrayList arrayList, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = feelingsList.title;
        }
        if ((i6 & 2) != 0) {
            arrayList = feelingsList.feelings;
        }
        return feelingsList.copy(str, arrayList);
    }

    public final String component1() {
        return this.title;
    }

    public final ArrayList<Feelings> component2() {
        return this.feelings;
    }

    public final FeelingsList copy(String title, ArrayList<Feelings> feelings) {
        i.g(title, "title");
        i.g(feelings, "feelings");
        return new FeelingsList(title, feelings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeelingsList)) {
            return false;
        }
        FeelingsList feelingsList = (FeelingsList) obj;
        if (i.b(this.title, feelingsList.title) && i.b(this.feelings, feelingsList.feelings)) {
            return true;
        }
        return false;
    }

    public final ArrayList<Feelings> getFeelings() {
        return this.feelings;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.feelings.hashCode() + (this.title.hashCode() * 31);
    }

    public final void setFeelings(ArrayList<Feelings> arrayList) {
        i.g(arrayList, "<set-?>");
        this.feelings = arrayList;
    }

    public final void setTitle(String str) {
        i.g(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return "FeelingsList(title=" + this.title + ", feelings=" + this.feelings + ')';
    }

    public FeelingsList(String title, ArrayList<Feelings> feelings) {
        i.g(title, "title");
        i.g(feelings, "feelings");
        this.title = title;
        this.feelings = feelings;
    }

    public /* synthetic */ FeelingsList(String str, ArrayList arrayList, int i6, d dVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? new ArrayList() : arrayList);
    }
}
