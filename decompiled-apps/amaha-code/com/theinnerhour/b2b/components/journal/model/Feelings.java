package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: JournalThoughtModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/Feelings;", "", "feeling", "", "(Ljava/lang/String;)V", "getFeeling", "()Ljava/lang/String;", "setFeeling", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Feelings {
    @b("feeling")
    private String feeling;

    public Feelings() {
        this(null, 1, null);
    }

    public static /* synthetic */ Feelings copy$default(Feelings feelings, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = feelings.feeling;
        }
        return feelings.copy(str);
    }

    public final String component1() {
        return this.feeling;
    }

    public final Feelings copy(String feeling) {
        i.g(feeling, "feeling");
        return new Feelings(feeling);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Feelings) && i.b(this.feeling, ((Feelings) obj).feeling)) {
            return true;
        }
        return false;
    }

    public final String getFeeling() {
        return this.feeling;
    }

    public int hashCode() {
        return this.feeling.hashCode();
    }

    public final void setFeeling(String str) {
        i.g(str, "<set-?>");
        this.feeling = str;
    }

    public String toString() {
        return g.c(new StringBuilder("Feelings(feeling="), this.feeling, ')');
    }

    public Feelings(String feeling) {
        i.g(feeling, "feeling");
        this.feeling = feeling;
    }

    public /* synthetic */ Feelings(String str, int i6, d dVar) {
        this((i6 & 1) != 0 ? "" : str);
    }
}
