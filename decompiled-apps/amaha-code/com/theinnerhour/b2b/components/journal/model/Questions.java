package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: JournalQuestionModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/Questions;", "", "question", "", "(Ljava/lang/String;)V", "getQuestion", "()Ljava/lang/String;", "setQuestion", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Questions {
    @b("question")
    private String question;

    public Questions() {
        this(null, 1, null);
    }

    public static /* synthetic */ Questions copy$default(Questions questions, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = questions.question;
        }
        return questions.copy(str);
    }

    public final String component1() {
        return this.question;
    }

    public final Questions copy(String question) {
        i.g(question, "question");
        return new Questions(question);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Questions) && i.b(this.question, ((Questions) obj).question)) {
            return true;
        }
        return false;
    }

    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return this.question.hashCode();
    }

    public final void setQuestion(String str) {
        i.g(str, "<set-?>");
        this.question = str;
    }

    public String toString() {
        return g.c(new StringBuilder("Questions(question="), this.question, ')');
    }

    public Questions(String question) {
        i.g(question, "question");
        this.question = question;
    }

    public /* synthetic */ Questions(String str, int i6, d dVar) {
        this((i6 & 1) != 0 ? "" : str);
    }
}
