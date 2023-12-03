package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenResult14Model;", "Ljava/io/Serializable;", "date", "", "statement", "", "(JLjava/lang/String;)V", "cons", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/ProsAndConsModel;", "Lkotlin/collections/ArrayList;", "getCons", "()Ljava/util/ArrayList;", "setCons", "(Ljava/util/ArrayList;)V", "getDate", "()J", "setDate", "(J)V", "pros", "getPros", "setPros", "getStatement", "()Ljava/lang/String;", "setStatement", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenResult14Model implements Serializable {
    private ArrayList<ProsAndConsModel> cons;
    private long date;
    private ArrayList<ProsAndConsModel> pros;
    private String statement;

    public ScreenResult14Model(long j10, String statement) {
        i.g(statement, "statement");
        this.date = j10;
        this.statement = statement;
        this.pros = new ArrayList<>();
        this.cons = new ArrayList<>();
    }

    public final ArrayList<ProsAndConsModel> getCons() {
        return this.cons;
    }

    public final long getDate() {
        return this.date;
    }

    public final ArrayList<ProsAndConsModel> getPros() {
        return this.pros;
    }

    public final String getStatement() {
        return this.statement;
    }

    public final void setCons(ArrayList<ProsAndConsModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.cons = arrayList;
    }

    public final void setDate(long j10) {
        this.date = j10;
    }

    public final void setPros(ArrayList<ProsAndConsModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.pros = arrayList;
    }

    public final void setStatement(String str) {
        i.g(str, "<set-?>");
        this.statement = str;
    }
}
