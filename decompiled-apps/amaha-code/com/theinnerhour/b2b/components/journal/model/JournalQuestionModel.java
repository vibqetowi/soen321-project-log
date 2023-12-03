package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: JournalQuestionModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0019\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006\""}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/JournalQuestionModel;", "", "questions", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/journal/model/Questions;", "Lkotlin/collections/ArrayList;", "textHint", "", "textHint2", "cta", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCta", "()Ljava/lang/String;", "setCta", "(Ljava/lang/String;)V", "getQuestions", "()Ljava/util/ArrayList;", "setQuestions", "(Ljava/util/ArrayList;)V", "getTextHint", "setTextHint", "getTextHint2", "setTextHint2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class JournalQuestionModel {
    @b("cta")
    private String cta;
    @b("questions")
    private ArrayList<Questions> questions;
    @b("text_hint")
    private String textHint;
    @b("text_hint_2")
    private String textHint2;

    public JournalQuestionModel() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalQuestionModel copy$default(JournalQuestionModel journalQuestionModel, ArrayList arrayList, String str, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            arrayList = journalQuestionModel.questions;
        }
        if ((i6 & 2) != 0) {
            str = journalQuestionModel.textHint;
        }
        if ((i6 & 4) != 0) {
            str2 = journalQuestionModel.textHint2;
        }
        if ((i6 & 8) != 0) {
            str3 = journalQuestionModel.cta;
        }
        return journalQuestionModel.copy(arrayList, str, str2, str3);
    }

    public final ArrayList<Questions> component1() {
        return this.questions;
    }

    public final String component2() {
        return this.textHint;
    }

    public final String component3() {
        return this.textHint2;
    }

    public final String component4() {
        return this.cta;
    }

    public final JournalQuestionModel copy(ArrayList<Questions> questions, String textHint, String textHint2, String cta) {
        i.g(questions, "questions");
        i.g(textHint, "textHint");
        i.g(textHint2, "textHint2");
        i.g(cta, "cta");
        return new JournalQuestionModel(questions, textHint, textHint2, cta);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JournalQuestionModel)) {
            return false;
        }
        JournalQuestionModel journalQuestionModel = (JournalQuestionModel) obj;
        if (i.b(this.questions, journalQuestionModel.questions) && i.b(this.textHint, journalQuestionModel.textHint) && i.b(this.textHint2, journalQuestionModel.textHint2) && i.b(this.cta, journalQuestionModel.cta)) {
            return true;
        }
        return false;
    }

    public final String getCta() {
        return this.cta;
    }

    public final ArrayList<Questions> getQuestions() {
        return this.questions;
    }

    public final String getTextHint() {
        return this.textHint;
    }

    public final String getTextHint2() {
        return this.textHint2;
    }

    public int hashCode() {
        return this.cta.hashCode() + a.c(this.textHint2, a.c(this.textHint, this.questions.hashCode() * 31, 31), 31);
    }

    public final void setCta(String str) {
        i.g(str, "<set-?>");
        this.cta = str;
    }

    public final void setQuestions(ArrayList<Questions> arrayList) {
        i.g(arrayList, "<set-?>");
        this.questions = arrayList;
    }

    public final void setTextHint(String str) {
        i.g(str, "<set-?>");
        this.textHint = str;
    }

    public final void setTextHint2(String str) {
        i.g(str, "<set-?>");
        this.textHint2 = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JournalQuestionModel(questions=");
        sb2.append(this.questions);
        sb2.append(", textHint=");
        sb2.append(this.textHint);
        sb2.append(", textHint2=");
        sb2.append(this.textHint2);
        sb2.append(", cta=");
        return g.c(sb2, this.cta, ')');
    }

    public JournalQuestionModel(ArrayList<Questions> questions, String textHint, String textHint2, String cta) {
        i.g(questions, "questions");
        i.g(textHint, "textHint");
        i.g(textHint2, "textHint2");
        i.g(cta, "cta");
        this.questions = questions;
        this.textHint = textHint;
        this.textHint2 = textHint2;
        this.cta = cta;
    }

    public /* synthetic */ JournalQuestionModel(ArrayList arrayList, String str, String str2, String str3, int i6, d dVar) {
        this((i6 & 1) != 0 ? new ArrayList() : arrayList, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? "" : str3);
    }
}
